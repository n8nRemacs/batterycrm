package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.mediarouter.app.d;

/* loaded from: classes.dex */
public final class d59 implements View.OnClickListener {
    public final /* synthetic */ d a;

    public d59(d dVar) {
        this.a = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        PlaybackStateCompat playbackStateCompat;
        d dVar = this.a;
        AccessibilityManager accessibilityManager = dVar.w1;
        int id = view.getId();
        if (id == 16908313 || id == 16908314) {
            if (dVar.s0.g()) {
                l69 l69Var = dVar.Y;
                i = id == 16908313 ? 2 : 1;
                l69Var.getClass();
                l69.g(i);
            }
            dVar.dismiss();
            return;
        }
        if (id != pxc.mr_control_playback_ctrl) {
            if (id == pxc.mr_close) {
                dVar.dismiss();
                return;
            }
            return;
        }
        if (dVar.b1 == null || (playbackStateCompat = dVar.d1) == null) {
            return;
        }
        int i2 = 0;
        i = playbackStateCompat.getState() != 3 ? 0 : 1;
        if (i != 0 && (dVar.d1.getActions() & 514) != 0) {
            dVar.b1.getTransportControls().pause();
            i2 = j4d.mr_controller_pause;
        } else if (i != 0 && (dVar.d1.getActions() & 1) != 0) {
            dVar.b1.getTransportControls().stop();
            i2 = j4d.mr_controller_stop;
        } else if (i == 0 && (dVar.d1.getActions() & 516) != 0) {
            dVar.b1.getTransportControls().play();
            i2 = j4d.mr_controller_play;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || i2 == 0) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
        accessibilityEventObtain.setPackageName(dVar.t0.getPackageName());
        accessibilityEventObtain.setClassName(d59.class.getName());
        accessibilityEventObtain.getText().add(dVar.t0.getString(i2));
        accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
    }
}
