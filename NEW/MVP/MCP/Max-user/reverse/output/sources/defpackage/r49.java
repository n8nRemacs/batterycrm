package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class r49 extends b69 {
    public static final /* synthetic */ int B0 = 0;
    public final ArrayMap A0;
    public final MediaRouter2 s0;
    public final t9f t0;
    public final ArrayMap u0;
    public final p49 v0;
    public final q49 w0;
    public final m49 x0;
    public final fv1 y0;
    public ArrayList z0;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public r49(Context context, t9f t9fVar) {
        super(context, null);
        this.u0 = new ArrayMap();
        this.v0 = new p49(this);
        this.w0 = new q49(this);
        this.x0 = new m49(this);
        this.z0 = new ArrayList();
        this.A0 = new ArrayMap();
        this.s0 = MediaRouter2.getInstance(context);
        this.t0 = t9fVar;
        this.y0 = new fv1(1, new Handler(Looper.getMainLooper()));
    }

    @Override // defpackage.b69
    public final z59 c(String str) {
        Iterator it = this.u0.entrySet().iterator();
        while (it.hasNext()) {
            n49 n49Var = (n49) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, n49Var.f)) {
                return n49Var;
            }
        }
        return null;
    }

    @Override // defpackage.b69
    public final a69 d(String str) {
        return new o49((String) this.A0.get(str), null);
    }

    @Override // defpackage.b69
    public final a69 e(String str, String str2) {
        String str3 = (String) this.A0.get(str);
        for (n49 n49Var : this.u0.values()) {
            h59 h59Var = n49Var.o;
            if (TextUtils.equals(str2, h59Var != null ? h59Var.c() : n49Var.g.getId())) {
                return new o49(str3, n49Var);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new o49(str3, null);
    }

    @Override // defpackage.b69
    public final void f(j59 j59Var) {
        ArrayList<String> arrayList;
        d69 d69Var;
        RouteDiscoveryPreference routeDiscoveryPreferenceBuild;
        String str;
        int i = l69.d == null ? 0 : l69.c().y;
        m49 m49Var = this.x0;
        q49 q49Var = this.w0;
        p49 p49Var = this.v0;
        if (i <= 0) {
            this.s0.unregisterRouteCallback(p49Var);
            this.s0.unregisterTransferCallback(q49Var);
            this.s0.unregisterControllerCallback(m49Var);
            return;
        }
        l69.c();
        if (j59Var == null) {
            j59Var = new j59(d69.c, false);
        }
        j59Var.a();
        ArrayList arrayListB = j59Var.b.b();
        arrayListB.remove("android.media.intent.category.LIVE_AUDIO");
        if (arrayListB.isEmpty()) {
            arrayList = null;
        } else {
            Iterator it = arrayListB.iterator();
            arrayList = null;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 == null) {
                    throw new IllegalArgumentException("category must not be null");
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList == null) {
            d69Var = d69.c;
        } else {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", arrayList);
            d69Var = new d69(bundle, arrayList);
        }
        boolean zB = j59Var.b();
        if (d69Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("selector", d69Var.a);
        bundle2.putBoolean("activeScan", zB);
        MediaRouter2 mediaRouter2 = this.s0;
        d69Var.a();
        if (d69Var.b.contains(null)) {
            f5.w();
            routeDiscoveryPreferenceBuild = l49.f(new ArrayList()).build();
        } else {
            boolean z = bundle2.getBoolean("activeScan");
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = d69Var.b().iterator();
            while (it2.hasNext()) {
                str = (String) it2.next();
                str.getClass();
                switch (str) {
                    case "android.media.intent.category.REMOTE_PLAYBACK":
                        str = "android.media.route.feature.REMOTE_PLAYBACK";
                        break;
                    case "android.media.intent.category.LIVE_AUDIO":
                        str = "android.media.route.feature.LIVE_AUDIO";
                        break;
                    case "android.media.intent.category.LIVE_VIDEO":
                        str = "android.media.route.feature.LIVE_VIDEO";
                        break;
                }
                arrayList2.add(str);
            }
            routeDiscoveryPreferenceBuild = l49.g(arrayList2, z).build();
        }
        fv1 fv1Var = this.y0;
        mediaRouter2.registerRouteCallback(fv1Var, p49Var, routeDiscoveryPreferenceBuild);
        this.s0.registerTransferCallback(fv1Var, q49Var);
        this.s0.registerControllerCallback(fv1Var, m49Var);
    }

    public final MediaRoute2Info i(String str) {
        if (str == null) {
            return null;
        }
        Iterator it = this.z0.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoH = f5.h(it.next());
            if (TextUtils.equals(mediaRoute2InfoH.getId(), str)) {
                return mediaRoute2InfoH;
            }
        }
        return null;
    }

    public final void j() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator it = this.s0.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoH = f5.h(it.next());
            if (mediaRoute2InfoH != null && !arraySet.contains(mediaRoute2InfoH) && !mediaRoute2InfoH.isSystemRoute()) {
                arraySet.add(mediaRoute2InfoH);
                arrayList.add(mediaRoute2InfoH);
            }
        }
        if (arrayList.equals(this.z0)) {
            return;
        }
        this.z0 = arrayList;
        ArrayMap arrayMap = this.A0;
        arrayMap.clear();
        Iterator it2 = this.z0.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info mediaRoute2InfoH2 = f5.h(it2.next());
            Bundle extras = mediaRoute2InfoH2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + mediaRoute2InfoH2);
            } else {
                arrayMap.put(mediaRoute2InfoH2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = this.z0.iterator();
        while (it3.hasNext()) {
            MediaRoute2Info mediaRoute2InfoH3 = f5.h(it3.next());
            h59 h59VarD = gvi.d(mediaRoute2InfoH3);
            if (mediaRoute2InfoH3 != null) {
                arrayList2.add(h59VarD);
            }
        }
        ArrayList arrayList3 = null;
        if (!arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                h59 h59Var = (h59) it4.next();
                if (h59Var == null) {
                    throw new IllegalArgumentException("route must not be null");
                }
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                } else if (arrayList3.contains(h59Var)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                arrayList3.add(h59Var);
            }
        }
        g(new c69(arrayList3, true));
    }

    public final void k(MediaRouter2.RoutingController routingController) {
        n49 n49Var = (n49) this.u0.get(routingController);
        if (n49Var == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        ArrayList arrayListC = gvi.c(selectedRoutes);
        h59 h59VarD = gvi.d(f5.h(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.a.getString(j4d.mr_dialog_default_group_name);
        h59 h59Var = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    h59Var = new h59(bundle);
                }
            } catch (Exception e) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e);
            }
        }
        if (h59Var == null) {
            hc8 hc8Var = new hc8(routingController.getId(), string);
            Bundle bundle2 = (Bundle) hc8Var.b;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
            bundle2.putInt("volume", routingController.getVolume());
            bundle2.putInt("volumeMax", routingController.getVolumeMax());
            bundle2.putInt("volumeHandling", routingController.getVolumeHandling());
            h59VarD.a();
            hc8Var.q(h59VarD.c);
            if (!arrayListC.isEmpty()) {
                Iterator it = arrayListC.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("groupMemberId must not be empty");
                    }
                    if (((ArrayList) hc8Var.c) == null) {
                        hc8Var.c = new ArrayList();
                    }
                    if (!((ArrayList) hc8Var.c).contains(str)) {
                        ((ArrayList) hc8Var.c).add(str);
                    }
                }
            }
            h59Var = hc8Var.v();
        }
        ArrayList arrayListC2 = gvi.c(routingController.getSelectableRoutes());
        ArrayList arrayListC3 = gvi.c(routingController.getDeselectableRoutes());
        c69 c69Var = this.Y;
        if (c69Var == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<h59> list = c69Var.c;
        if (!list.isEmpty()) {
            for (h59 h59Var2 : list) {
                String strC = h59Var2.c();
                arrayList.add(new y59(h59Var2, arrayListC.contains(strC) ? 3 : 1, arrayListC3.contains(strC), arrayListC2.contains(strC), true));
            }
        }
        n49Var.o = h59Var;
        n49Var.l(h59Var, arrayList);
    }
}
