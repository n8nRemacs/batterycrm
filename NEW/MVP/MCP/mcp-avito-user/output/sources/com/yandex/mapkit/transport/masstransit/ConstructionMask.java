package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.P;

/* loaded from: classes7.dex */
public class ConstructionMask implements Serializable {
    private boolean binding;
    private boolean crosswalk;
    private Elevator elevator;
    private Escalator escalator;
    private boolean indoor;
    private Pass pass;
    private Stairs stairs;
    private boolean transition;
    private Travolator travolator;
    private boolean tunnel;

    public ConstructionMask(@P Stairs stairs, @P Pass pass, boolean z12, boolean z13, boolean z14, boolean z15, @P Travolator travolator, boolean z16, @P Escalator escalator, @P Elevator elevator) {
        this.stairs = stairs;
        this.pass = pass;
        this.crosswalk = z12;
        this.binding = z13;
        this.transition = z14;
        this.tunnel = z15;
        this.travolator = travolator;
        this.indoor = z16;
        this.escalator = escalator;
        this.elevator = elevator;
    }

    public boolean getBinding() {
        return this.binding;
    }

    public boolean getCrosswalk() {
        return this.crosswalk;
    }

    @P
    public Elevator getElevator() {
        return this.elevator;
    }

    @P
    public Escalator getEscalator() {
        return this.escalator;
    }

    public boolean getIndoor() {
        return this.indoor;
    }

    @P
    public Pass getPass() {
        return this.pass;
    }

    @P
    public Stairs getStairs() {
        return this.stairs;
    }

    public boolean getTransition() {
        return this.transition;
    }

    @P
    public Travolator getTravolator() {
        return this.travolator;
    }

    public boolean getTunnel() {
        return this.tunnel;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.stairs = (Stairs) archive.add((Archive) this.stairs, true, (Class<Archive>) Stairs.class);
        this.pass = (Pass) archive.add((Archive) this.pass, true, (Class<Archive>) Pass.class);
        this.crosswalk = archive.add(this.crosswalk);
        this.binding = archive.add(this.binding);
        this.transition = archive.add(this.transition);
        this.tunnel = archive.add(this.tunnel);
        this.travolator = (Travolator) archive.add((Archive) this.travolator, true, (Class<Archive>) Travolator.class);
        this.indoor = archive.add(this.indoor);
        this.escalator = (Escalator) archive.add((Archive) this.escalator, true, (Class<Archive>) Escalator.class);
        this.elevator = (Elevator) archive.add((Archive) this.elevator, true, (Class<Archive>) Elevator.class);
    }

    public ConstructionMask() {
    }
}
