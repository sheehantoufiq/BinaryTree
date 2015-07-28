/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

    /**
     * Protocol for Hashable objects.
     * @author Mark Allen Weiss
     */
    public interface Hashable
    {
        /**
         * Compute a hash function for this object.
         * @param tableSize the hash table size.
         * @return (deterministically) a number between
         *     0 and tableSize-1, distributed equitably.
         */
        int hash( int tableSize );
    }