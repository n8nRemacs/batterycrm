package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class q49 extends MediaRouter2$TransferCallback {
    public final /* synthetic */ r49 a;

    public q49(r49 r49Var) {
        this.a = r49Var;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        a69 a69Var = (a69) this.a.u0.remove(routingController);
        if (a69Var == null) {
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
            return;
        }
        h69 h69Var = (h69) this.a.t0.b;
        if (a69Var == h69Var.s) {
            k69 k69VarC = h69Var.c();
            if (h69Var.e() != k69VarC) {
                h69Var.h(k69VarC, 2);
                return;
            }
            return;
        }
        if (l69.c) {
            Log.d("MediaRouter", "A RouteController unrelated to the selected route is released. controller=" + a69Var);
        }
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        k69 k69Var;
        this.a.u0.remove(routingController);
        if (routingController2 == this.a.s0.getSystemController()) {
            h69 h69Var = (h69) this.a.t0.b;
            k69 k69VarC = h69Var.c();
            if (h69Var.e() != k69VarC) {
                h69Var.h(k69VarC, 3);
                return;
            }
            return;
        }
        List selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        String id = f5.h(selectedRoutes.get(0)).getId();
        this.a.u0.put(routingController2, new n49(this.a, routingController2, id));
        h69 h69Var2 = (h69) this.a.t0.b;
        Iterator it = h69Var2.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                k69Var = null;
                break;
            }
            k69Var = (k69) it.next();
            if (k69Var.c() == h69Var2.e && TextUtils.equals(id, k69Var.b)) {
                break;
            }
        }
        if (k69Var == null) {
            Log.w("MediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id);
        } else {
            h69Var2.h(k69Var, 3);
        }
        this.a.k(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
