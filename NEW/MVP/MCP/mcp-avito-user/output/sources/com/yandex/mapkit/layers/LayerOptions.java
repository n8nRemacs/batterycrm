package com.yandex.mapkit.layers;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public final class LayerOptions implements Serializable {
    private boolean active;
    private boolean animateOnActivation;
    private boolean cacheable;
    private boolean nightModeAvailable;
    private OverzoomMode overzoomMode;
    private long tileAppearingAnimationDuration;
    private boolean transparent;
    private boolean versionSupport;

    public LayerOptions(boolean z12, boolean z13, boolean z14, boolean z15, long j12, @N OverzoomMode overzoomMode, boolean z16, boolean z17) {
        this.active = true;
        this.nightModeAvailable = true;
        this.cacheable = false;
        this.animateOnActivation = false;
        this.tileAppearingAnimationDuration = 400L;
        this.overzoomMode = OverzoomMode.DISABLED;
        this.transparent = false;
        this.versionSupport = true;
        if (overzoomMode == null) {
            throw new IllegalArgumentException("Required field \"overzoomMode\" cannot be null");
        }
        this.active = z12;
        this.nightModeAvailable = z13;
        this.cacheable = z14;
        this.animateOnActivation = z15;
        this.tileAppearingAnimationDuration = j12;
        this.overzoomMode = overzoomMode;
        this.transparent = z16;
        this.versionSupport = z17;
    }

    public boolean getActive() {
        return this.active;
    }

    public boolean getAnimateOnActivation() {
        return this.animateOnActivation;
    }

    public boolean getCacheable() {
        return this.cacheable;
    }

    public boolean getNightModeAvailable() {
        return this.nightModeAvailable;
    }

    @N
    public OverzoomMode getOverzoomMode() {
        return this.overzoomMode;
    }

    public long getTileAppearingAnimationDuration() {
        return this.tileAppearingAnimationDuration;
    }

    public boolean getTransparent() {
        return this.transparent;
    }

    public boolean getVersionSupport() {
        return this.versionSupport;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.active = archive.add(this.active);
        this.nightModeAvailable = archive.add(this.nightModeAvailable);
        this.cacheable = archive.add(this.cacheable);
        this.animateOnActivation = archive.add(this.animateOnActivation);
        this.tileAppearingAnimationDuration = archive.add(this.tileAppearingAnimationDuration);
        this.overzoomMode = (OverzoomMode) archive.add((Archive) this.overzoomMode, false, (Class<Archive>) OverzoomMode.class);
        this.transparent = archive.add(this.transparent);
        this.versionSupport = archive.add(this.versionSupport);
    }

    public LayerOptions setActive(boolean z12) {
        this.active = z12;
        return this;
    }

    public LayerOptions setAnimateOnActivation(boolean z12) {
        this.animateOnActivation = z12;
        return this;
    }

    public LayerOptions setCacheable(boolean z12) {
        this.cacheable = z12;
        return this;
    }

    public LayerOptions setNightModeAvailable(boolean z12) {
        this.nightModeAvailable = z12;
        return this;
    }

    public LayerOptions setOverzoomMode(@N OverzoomMode overzoomMode) {
        if (overzoomMode == null) {
            throw new IllegalArgumentException("Required field \"overzoomMode\" cannot be null");
        }
        this.overzoomMode = overzoomMode;
        return this;
    }

    public LayerOptions setTileAppearingAnimationDuration(long j12) {
        this.tileAppearingAnimationDuration = j12;
        return this;
    }

    public LayerOptions setTransparent(boolean z12) {
        this.transparent = z12;
        return this;
    }

    public LayerOptions setVersionSupport(boolean z12) {
        this.versionSupport = z12;
        return this;
    }

    public LayerOptions() {
        this.active = true;
        this.nightModeAvailable = true;
        this.cacheable = false;
        this.animateOnActivation = false;
        this.tileAppearingAnimationDuration = 400L;
        this.overzoomMode = OverzoomMode.DISABLED;
        this.transparent = false;
        this.versionSupport = true;
    }
}
