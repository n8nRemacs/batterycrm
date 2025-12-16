package defpackage;

import ru.ok.android.externcalls.sdk.audio.ProximityTracker;

/* loaded from: classes.dex */
public final class wpc implements ProximityTracker {
    public final k18 a;

    public wpc(k18 k18Var) {
        this.a = k18Var;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.ProximityTracker
    public final boolean getCanUseSpeaker() {
        k18 k18Var = this.a;
        return (((vpc) k18Var.getValue()).f == null || ((vpc) k18Var.getValue()).e) ? false : true;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.ProximityTracker
    public final void startTrackingProximity() {
        ((vpc) this.a.getValue()).a();
    }

    @Override // ru.ok.android.externcalls.sdk.audio.ProximityTracker
    public final void stopTrackingProximity() {
        ((vpc) this.a.getValue()).b();
    }
}
