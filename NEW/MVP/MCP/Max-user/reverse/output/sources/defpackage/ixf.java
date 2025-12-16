package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class ixf extends kxf implements n69 {
    public static final ArrayList C0;
    public static final ArrayList D0;
    public final ArrayList A0;
    public final ArrayList B0;
    public final jxf s0;
    public final Object t0;
    public final Object u0;
    public final o69 v0;
    public final MediaRouter.RouteCategory w0;
    public int x0;
    public boolean y0;
    public boolean z0;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        C0 = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        D0 = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public ixf(Context context, h69 h69Var) {
        super(context, new a3b(25, new ComponentName("android", kxf.class.getName())));
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.s0 = h69Var;
        Object systemService = context.getSystemService("media_router");
        this.t0 = systemService;
        this.u0 = new q69((exf) this);
        this.v0 = new o69(this);
        this.w0 = ((MediaRouter) systemService).createRouteCategory((CharSequence) context.getResources().getString(j4d.mr_user_route_category_name), false);
        v();
    }

    public static hxf n(Object obj) {
        Object tag = ((MediaRouter.RouteInfo) obj).getTag();
        if (tag instanceof hxf) {
            return (hxf) tag;
        }
        return null;
    }

    @Override // defpackage.n69
    public final void a(MediaRouter.RouteInfo routeInfo, int i) {
        hxf hxfVarN = n(routeInfo);
        if (hxfVarN != null) {
            hxfVarN.a.j(i);
        }
    }

    @Override // defpackage.n69
    public final void b(MediaRouter.RouteInfo routeInfo, int i) {
        hxf hxfVarN = n(routeInfo);
        if (hxfVarN != null) {
            hxfVarN.a.k(i);
        }
    }

    @Override // defpackage.b69
    public final a69 d(String str) {
        int iK = k(str);
        if (iK >= 0) {
            return new fxf(((gxf) this.A0.get(iK)).a);
        }
        return null;
    }

    @Override // defpackage.b69
    public final void f(j59 j59Var) {
        boolean zB;
        int i = 0;
        if (j59Var != null) {
            j59Var.a();
            ArrayList arrayListB = j59Var.b.b();
            int size = arrayListB.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) arrayListB.get(i);
                i2 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i2 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                i++;
            }
            zB = j59Var.b();
            i = i2;
        } else {
            zB = false;
        }
        if (this.x0 == i && this.y0 == zB) {
            return;
        }
        this.x0 = i;
        this.y0 = zB;
        v();
    }

    public final boolean i(Object obj) {
        String str;
        String strE;
        if (n(obj) != null || j(obj) >= 0) {
            return false;
        }
        MediaRouter.RouteInfo routeInfoM = m();
        Context context = this.a;
        if (routeInfoM == obj) {
            str = "DEFAULT_ROUTE";
        } else {
            Locale locale = Locale.US;
            CharSequence name = ((MediaRouter.RouteInfo) obj).getName(context);
            str = String.format(locale, "ROUTE_%08x", Integer.valueOf((name != null ? name.toString() : "").hashCode()));
        }
        if (k(str) >= 0) {
            int i = 2;
            while (true) {
                Locale locale2 = Locale.US;
                strE = xc0.e(i, str, "_");
                if (k(strE) < 0) {
                    break;
                }
                i++;
            }
            str = strE;
        }
        gxf gxfVar = new gxf(obj, str);
        CharSequence name2 = ((MediaRouter.RouteInfo) obj).getName(context);
        hc8 hc8Var = new hc8(str, name2 != null ? name2.toString() : "");
        o(gxfVar, hc8Var);
        gxfVar.c = hc8Var.v();
        this.A0.add(gxfVar);
        return true;
    }

    public final int j(Object obj) {
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((gxf) arrayList.get(i)).a == obj) {
                return i;
            }
        }
        return -1;
    }

    public final int k(String str) {
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((gxf) arrayList.get(i)).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final int l(k69 k69Var) {
        ArrayList arrayList = this.B0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((hxf) arrayList.get(i)).a == k69Var) {
                return i;
            }
        }
        return -1;
    }

    public abstract MediaRouter.RouteInfo m();

    public void o(gxf gxfVar, hc8 hc8Var) {
        Bundle bundle = (Bundle) hc8Var.b;
        Object obj = gxfVar.a;
        int supportedTypes = ((MediaRouter.RouteInfo) obj).getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            hc8Var.q(C0);
        }
        if ((supportedTypes & 2) != 0) {
            hc8Var.q(D0);
        }
        MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) obj;
        bundle.putInt("playbackType", routeInfo.getPlaybackType());
        bundle.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle.putInt("volume", routeInfo.getVolume());
        bundle.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
    }

    public final void p(k69 k69Var) {
        b69 b69VarC = k69Var.c();
        Object obj = this.t0;
        if (b69VarC == this) {
            int iJ = j(((MediaRouter) obj).getSelectedRoute(8388611));
            if (iJ < 0 || !((gxf) this.A0.get(iJ)).b.equals(k69Var.b)) {
                return;
            }
            k69Var.l();
            return;
        }
        MediaRouter mediaRouter = (MediaRouter) obj;
        MediaRouter.UserRouteInfo userRouteInfoCreateUserRoute = mediaRouter.createUserRoute(this.w0);
        hxf hxfVar = new hxf(k69Var, userRouteInfoCreateUserRoute);
        userRouteInfoCreateUserRoute.setTag(hxfVar);
        userRouteInfoCreateUserRoute.setVolumeCallback(this.v0);
        w(hxfVar);
        this.B0.add(hxfVar);
        mediaRouter.addUserRoute(userRouteInfoCreateUserRoute);
    }

    public final void q(k69 k69Var) {
        int iL;
        if (k69Var.c() == this || (iL = l(k69Var)) < 0) {
            return;
        }
        Object obj = ((hxf) this.B0.remove(iL)).b;
        ((MediaRouter.RouteInfo) obj).setTag(null);
        ((MediaRouter.UserRouteInfo) obj).setVolumeCallback(null);
        try {
            ((MediaRouter) this.t0).removeUserRoute((MediaRouter.UserRouteInfo) obj);
        } catch (IllegalArgumentException e) {
            Log.w("MediaRouterJellybean", "Failed to remove user route", e);
        }
    }

    public final void r(k69 k69Var) {
        if (k69Var.g()) {
            if (k69Var.c() != this) {
                int iL = l(k69Var);
                if (iL >= 0) {
                    t(((hxf) this.B0.get(iL)).b);
                    return;
                }
                return;
            }
            int iK = k(k69Var.b);
            if (iK >= 0) {
                t(((gxf) this.A0.get(iK)).a);
            }
        }
    }

    public final void s() {
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            h59 h59Var = ((gxf) arrayList.get(i)).c;
            if (h59Var == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            } else if (arrayList2.contains(h59Var)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            arrayList2.add(h59Var);
        }
        g(new c69(arrayList2, false));
    }

    public abstract void t(Object obj);

    public abstract void u();

    public final void v() {
        u();
        MediaRouter mediaRouter = (MediaRouter) this.t0;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean zI = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zI |= i(it.next());
        }
        if (zI) {
            s();
        }
    }

    public void w(hxf hxfVar) {
        int i;
        Object obj = hxfVar.b;
        k69 k69Var = hxfVar.a;
        ((MediaRouter.UserRouteInfo) obj).setName(k69Var.d);
        MediaRouter.UserRouteInfo userRouteInfo = (MediaRouter.UserRouteInfo) hxfVar.b;
        userRouteInfo.setPlaybackType(k69Var.k);
        userRouteInfo.setPlaybackStream(k69Var.l);
        userRouteInfo.setVolume(k69Var.o);
        userRouteInfo.setVolumeMax(k69Var.p);
        if (!k69Var.e()) {
            i = k69Var.n;
        } else if (l69.d == null) {
            i = 0;
        } else {
            l69.c().getClass();
            i = k69Var.n;
        }
        userRouteInfo.setVolumeHandling(i);
    }
}
