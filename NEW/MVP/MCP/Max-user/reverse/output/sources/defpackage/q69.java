package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Display;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q69 extends MediaRouter.Callback {
    public final ixf a;

    public q69(ixf ixfVar) {
        this.a = ixfVar;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        ixf ixfVar = this.a;
        if (ixfVar.i(routeInfo)) {
            ixfVar.s();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int iJ;
        ixf ixfVar = this.a;
        ixfVar.getClass();
        if (ixf.n(routeInfo) != null || (iJ = ixfVar.j(routeInfo)) < 0) {
            return;
        }
        gxf gxfVar = (gxf) ixfVar.A0.get(iJ);
        String str = gxfVar.b;
        CharSequence name = ((MediaRouter.RouteInfo) gxfVar.a).getName(ixfVar.a);
        hc8 hc8Var = new hc8(str, name != null ? name.toString() : "");
        ixfVar.o(gxfVar, hc8Var);
        gxfVar.c = hc8Var.v();
        ixfVar.s();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        Display presentationDisplay;
        exf exfVar = (exf) ((p69) this.a);
        int iJ = exfVar.j(routeInfo);
        if (iJ >= 0) {
            gxf gxfVar = (gxf) exfVar.A0.get(iJ);
            try {
                presentationDisplay = routeInfo.getPresentationDisplay();
            } catch (NoSuchMethodError e) {
                Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e);
                presentationDisplay = null;
            }
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != gxfVar.c.a.getInt("presentationDisplayId", -1)) {
                h59 h59Var = gxfVar.c;
                if (h59Var == null) {
                    throw new IllegalArgumentException("descriptor must not be null");
                }
                Bundle bundle = new Bundle(h59Var.a);
                ArrayList<String> arrayList = !h59Var.b().isEmpty() ? new ArrayList<>(h59Var.b()) : null;
                h59Var.a();
                ArrayList<? extends Parcelable> arrayList2 = h59Var.c.isEmpty() ? null : new ArrayList<>(h59Var.c);
                bundle.putInt("presentationDisplayId", displayId);
                if (arrayList2 != null) {
                    bundle.putParcelableArrayList("controlFilters", arrayList2);
                }
                if (arrayList != null) {
                    bundle.putStringArrayList("groupMemberIds", arrayList);
                }
                gxfVar.c = new h59(bundle);
                exfVar.s();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int iJ;
        ixf ixfVar = this.a;
        ixfVar.getClass();
        if (ixf.n(routeInfo) != null || (iJ = ixfVar.j(routeInfo)) < 0) {
            return;
        }
        ixfVar.A0.remove(iJ);
        ixfVar.s();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        k69 k69VarA;
        ixf ixfVar = this.a;
        if (routeInfo != ((MediaRouter) ixfVar.t0).getSelectedRoute(8388611)) {
            return;
        }
        hxf hxfVarN = ixf.n(routeInfo);
        if (hxfVarN != null) {
            hxfVarN.a.l();
            return;
        }
        int iJ = ixfVar.j(routeInfo);
        if (iJ >= 0) {
            gxf gxfVar = (gxf) ixfVar.A0.get(iJ);
            jxf jxfVar = ixfVar.s0;
            String str = gxfVar.b;
            h69 h69Var = (h69) jxfVar;
            h69Var.m.removeMessages(262);
            j69 j69VarD = h69Var.d(h69Var.c);
            if (j69VarD == null || (k69VarA = j69VarD.a(str)) == null) {
                return;
            }
            k69VarA.l();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int iJ;
        ixf ixfVar = this.a;
        ixfVar.getClass();
        if (ixf.n(routeInfo) != null || (iJ = ixfVar.j(routeInfo)) < 0) {
            return;
        }
        gxf gxfVar = (gxf) ixfVar.A0.get(iJ);
        int volume = routeInfo.getVolume();
        if (volume != gxfVar.c.a.getInt("volume")) {
            h59 h59Var = gxfVar.c;
            if (h59Var == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            Bundle bundle = new Bundle(h59Var.a);
            ArrayList<String> arrayList = !h59Var.b().isEmpty() ? new ArrayList<>(h59Var.b()) : null;
            h59Var.a();
            ArrayList<? extends Parcelable> arrayList2 = h59Var.c.isEmpty() ? null : new ArrayList<>(h59Var.c);
            bundle.putInt("volume", volume);
            if (arrayList2 != null) {
                bundle.putParcelableArrayList("controlFilters", arrayList2);
            }
            if (arrayList != null) {
                bundle.putStringArrayList("groupMemberIds", arrayList);
            }
            gxfVar.c = new h59(bundle);
            ixfVar.s();
        }
    }
}
