package com.pallux.anchor;

/**
 * Main plugin class.
 * 
 * TODO: Implement your plugin logic here.
 * 
 * @author Pallux
 * @version 1.0.0
 */
public class Anchor {

    private static Anchor instance;
    
    /**
     * Constructor - Called when plugin is loaded.
     */
    public Anchor() {
        instance = this;
        System.out.println("[Anchor] Plugin loaded!");
    }
    
    /**
     * Called when plugin is enabled.
     */
    public void onEnable() {
        System.out.println("[Anchor] Plugin enabled!");
        
        // TODO: Initialize your plugin here
        // - Load configuration
        // - Register event listeners
        // - Register commands
        // - Start services
    }
    
    /**
     * Called when plugin is disabled.
     */
    public void onDisable() {
        System.out.println("[Anchor] Plugin disabled!");
        
        // TODO: Cleanup your plugin here
        // - Save data
        // - Stop services
        // - Close connections
    }
    
    /**
     * Get plugin instance.
     */
    public static Anchor getInstance() {
        return instance;
    }
}
