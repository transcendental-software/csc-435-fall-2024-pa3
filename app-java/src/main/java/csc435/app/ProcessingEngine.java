package csc435.app;

public class ProcessingEngine {
    // TO-DO keep track of the index store
    private IndexStore store;
    
    // The number of worker threads to use during indexing
    private int numWorkerThreads;

    public ProcessingEngine(IndexStore store, int numWorkerThreads) {
        this.store = store;
        this.numWorkerThreads = numWorkerThreads;
        // TO-DO implement constructor
    }

    public void indexFiles() {
        // TO-DO implement index files
        // TO-DO crawl dataset and find all folders
        // TO-DO create the worker threads
        // TO-DO each worker thread receives a subset of the folders and runs the following operations:
        // - For each folder crawl the folder and find all documents
        // - For each document extract and count the words, add them to a local hash table and update the index store
        // TO-DO the main thread needs to wait for all of the worker threads to finish executing and join them
    }
    
    public void searchFiles() {
        // TO-DO implement search files
    }
}
