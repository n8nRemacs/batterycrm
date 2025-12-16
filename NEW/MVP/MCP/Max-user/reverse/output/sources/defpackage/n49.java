package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class n49 extends z59 {
    public final String f;
    public final MediaRouter2.RoutingController g;
    public final Messenger h;
    public final Messenger i;
    public final Handler k;
    public h59 o;
    public final /* synthetic */ r49 p;
    public final SparseArray j = new SparseArray();
    public final AtomicInteger l = new AtomicInteger(1);
    public final gq5 m = new gq5(17, this);
    public int n = -1;

    public n49(r49 r49Var, MediaRouter2.RoutingController routingController, String str) {
        this.p = r49Var;
        this.g = routingController;
        this.f = str;
        int i = r49.B0;
        Bundle controlHints = routingController.getControlHints();
        Messenger messenger = controlHints == null ? null : (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
        this.h = messenger;
        this.i = messenger != null ? new Messenger(new ey(this)) : null;
        this.k = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.a69
    public final void d() {
        this.g.release();
    }

    @Override // defpackage.a69
    public final void f(int i) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i);
        this.n = i;
        Handler handler = this.k;
        gq5 gq5Var = this.m;
        handler.removeCallbacks(gq5Var);
        handler.postDelayed(gq5Var, 1000L);
    }

    @Override // defpackage.a69
    public final void i(int i) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        int volume = this.n;
        if (volume < 0) {
            volume = routingController.getVolume();
        }
        int iMax = Math.max(0, Math.min(volume + i, this.g.getVolumeMax()));
        this.n = iMax;
        this.g.setVolume(iMax);
        Handler handler = this.k;
        gq5 gq5Var = this.m;
        handler.removeCallbacks(gq5Var);
        handler.postDelayed(gq5Var, 1000L);
    }

    @Override // defpackage.z59
    public final void m(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info mediaRoute2InfoI = this.p.i(str);
        if (mediaRoute2InfoI == null) {
            Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.g.selectRoute(mediaRoute2InfoI);
        }
    }

    @Override // defpackage.z59
    public final void n(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info mediaRoute2InfoI = this.p.i(str);
        if (mediaRoute2InfoI == null) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.g.deselectRoute(mediaRoute2InfoI);
        }
    }

    @Override // defpackage.z59
    public final void o(List list) {
        if (list == null || list.isEmpty()) {
            Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
            return;
        }
        String str = (String) list.get(0);
        r49 r49Var = this.p;
        MediaRoute2Info mediaRoute2InfoI = r49Var.i(str);
        if (mediaRoute2InfoI != null) {
            r49Var.s0.transferTo(mediaRoute2InfoI);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
    }
}
