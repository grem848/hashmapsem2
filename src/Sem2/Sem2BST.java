package Sem2;

import java.util.ArrayList;
import java.util.List;

class Sem2BST
{

    Node root;

    public boolean containsKey(String key)
    {
        if (get(key) != null)
        {
            return true;
        } else
        {
            return false;
        }
//        return get(key) != null; - short version
    }

    public Address get(String key)
    {
        Node focusNode = root;
        while (!focusNode.key.equals(key))
        {
            if (key.compareTo(focusNode.key) < focusNode.key.compareTo(key))
            {
                focusNode = focusNode.left;
            } 
            else
            {
                focusNode = focusNode.right;
            }
            if (focusNode == null)
            {
                return null;
            }
        }
        return focusNode.value;
    }

    public void put(String key, Address value)
    {
        if (root == null)
        {
            root = new Node(key, value);
        } else
        {
            insert(key, value, root);
        }
    }

    public int size()
    {
        return (size(root));
    }

    private int size(Node node)
    {
        if (node == null)
        {
            return 0;
        } else
        {
            return (size(node.left) + 1 + size(node.right));
        }
    }

    private void insert(String key, Address value, Node node)
    {
        switch (Integer.signum(key.compareToIgnoreCase(node.key)))
        {
            case -1:
                if (node.left == null)
                {
                    node.left = new Node(key, value);
                } else
                {
                    insert(key, value, node.left);
                }
                break;
            case 0:
                node.value = value;
                break;
            case 1:
                if (node.right == null)
                {
                    node.right = new Node(key, value);
                } else
                {
                    insert(key, value, node.right);
                }
                break;
        }
    }

    public ArrayList<String> keys()
    {
        List<String> list = new ArrayList<>();
        Node firstNode = root;
        Node currentNode = firstNode;
        boolean leftEmpty = false;
        boolean rightEmpty = false;

        if (currentNode == null)
        {
            System.out.println("Binary Tree is empty");
            return (ArrayList<String>) list;
        } else
        {
            list.add(currentNode.key);
        }

        while (true)
        {
            if (currentNode.left != null)
            {
                System.out.println(currentNode.key);
                list.add(currentNode.left.key);
            } else
            {
                leftEmpty = true;
            }

            if (currentNode.right != null)
            {
                System.out.println(currentNode.key);
                list.add(currentNode.right.key);
            } else
            {
                rightEmpty = true;
            }
            
            if(rightEmpty && leftEmpty == true)
            {
                break;
            }
            else if (rightEmpty == false)
            {
                currentNode = currentNode.right;
            }
            else if (leftEmpty == false)
            {
                currentNode = currentNode.left;
            }

            System.out.println("Current list " + list.toString());
        }

        return (ArrayList<String>) list;

    }

}
