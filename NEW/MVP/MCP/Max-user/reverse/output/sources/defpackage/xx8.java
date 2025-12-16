package defpackage;

import android.media.session.MediaController;

/* loaded from: classes.dex */
public final class xx8 extends wx8 {
    @Override // defpackage.i3
    public final void J0(float f) {
        if (f == 0.0f) {
            throw new IllegalArgumentException("speed must not be zero");
        }
        ((MediaController.TransportControls) this.b).setPlaybackSpeed(f);
    }
}
