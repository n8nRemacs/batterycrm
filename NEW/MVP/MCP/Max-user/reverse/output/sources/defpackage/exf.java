package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;

/* loaded from: classes.dex */
public final class exf extends ixf implements p69 {
    @Override // defpackage.ixf
    public final MediaRouter.RouteInfo m() {
        return ((MediaRouter) this.t0).getDefaultRoute();
    }

    @Override // defpackage.ixf
    public final void o(gxf gxfVar, hc8 hc8Var) {
        Display presentationDisplay;
        Bundle bundle = (Bundle) hc8Var.b;
        super.o(gxfVar, hc8Var);
        Object obj = gxfVar.a;
        if (!((MediaRouter.RouteInfo) obj).isEnabled()) {
            bundle.putBoolean("enabled", false);
        }
        if (((MediaRouter.RouteInfo) gxfVar.a).isConnecting()) {
            bundle.putInt("connectionState", 1);
        }
        try {
            presentationDisplay = ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
        } catch (NoSuchMethodError e) {
            Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e);
            presentationDisplay = null;
        }
        if (presentationDisplay != null) {
            bundle.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
        }
        CharSequence description = ((MediaRouter.RouteInfo) gxfVar.a).getDescription();
        if (description != null) {
            ((Bundle) hc8Var.b).putString("status", description.toString());
        }
        ((Bundle) hc8Var.b).putInt("deviceType", ((MediaRouter.RouteInfo) gxfVar.a).getDeviceType());
    }

    @Override // defpackage.ixf
    public final void t(Object obj) {
        ((MediaRouter) this.t0).selectRoute(8388611, (MediaRouter.RouteInfo) obj);
    }

    @Override // defpackage.ixf
    public final void u() {
        boolean z = this.z0;
        Object obj = this.u0;
        Object obj2 = this.t0;
        if (z) {
            ((MediaRouter) obj2).removeCallback((MediaRouter.Callback) obj);
        }
        this.z0 = true;
        ((MediaRouter) obj2).addCallback(this.x0, (MediaRouter.Callback) obj, (this.y0 ? 1 : 0) | 2);
    }

    @Override // defpackage.ixf
    public final void w(hxf hxfVar) {
        super.w(hxfVar);
        ((MediaRouter.UserRouteInfo) hxfVar.b).setDescription(hxfVar.a.e);
    }
}
