package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes7.dex */
public class NonAvoidedFeatures implements Serializable {
    private boolean avoidZones;
    private boolean ferries;
    private boolean fordCrossings;
    private boolean highways;
    private boolean inPoorConditionRoads;
    private boolean railwayCrossings;
    private boolean tolls;
    private boolean tunnels;
    private boolean unpavedRoads;

    public NonAvoidedFeatures(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z22) {
        this.tolls = z12;
        this.ferries = z13;
        this.fordCrossings = z14;
        this.highways = z15;
        this.railwayCrossings = z16;
        this.tunnels = z17;
        this.inPoorConditionRoads = z18;
        this.unpavedRoads = z19;
        this.avoidZones = z22;
    }

    public boolean getAvoidZones() {
        return this.avoidZones;
    }

    public boolean getFerries() {
        return this.ferries;
    }

    public boolean getFordCrossings() {
        return this.fordCrossings;
    }

    public boolean getHighways() {
        return this.highways;
    }

    public boolean getInPoorConditionRoads() {
        return this.inPoorConditionRoads;
    }

    public boolean getRailwayCrossings() {
        return this.railwayCrossings;
    }

    public boolean getTolls() {
        return this.tolls;
    }

    public boolean getTunnels() {
        return this.tunnels;
    }

    public boolean getUnpavedRoads() {
        return this.unpavedRoads;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.tolls = archive.add(this.tolls);
        this.ferries = archive.add(this.ferries);
        this.fordCrossings = archive.add(this.fordCrossings);
        this.highways = archive.add(this.highways);
        this.railwayCrossings = archive.add(this.railwayCrossings);
        this.tunnels = archive.add(this.tunnels);
        this.inPoorConditionRoads = archive.add(this.inPoorConditionRoads);
        this.unpavedRoads = archive.add(this.unpavedRoads);
        this.avoidZones = archive.add(this.avoidZones);
    }

    public NonAvoidedFeatures() {
    }
}
