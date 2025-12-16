package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class h69 implements jxf, ijd {
    public final Context a;
    public boolean b;
    public exf c;
    public boolean d;
    public r49 e;
    public final boolean n;
    public m69 o;
    public k69 p;
    public k69 q;
    public k69 r;
    public a69 s;
    public k69 t;
    public z59 u;
    public j59 w;
    public j59 x;
    public int y;
    public i69 z;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final r8j k = new r8j(27);
    public final x6i l = new x6i(23, this);
    public final f69 m = new f69(this);
    public final HashMap v = new HashMap();
    public final kce A = new kce(26, this);

    public h69(Context context) {
        this.a = context;
        this.n = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    public final void a(b69 b69Var) {
        if (d(b69Var) == null) {
            j69 j69Var = new j69(b69Var);
            this.i.add(j69Var);
            if (l69.c) {
                Log.d("MediaRouter", "Provider added: " + j69Var);
            }
            this.m.b(513, j69Var);
            k(j69Var, b69Var.Y);
            l69.b();
            b69Var.d = this.l;
            b69Var.h(this.w);
        }
    }

    public final String b(j69 j69Var, String str) {
        String strFlattenToShortString = ((ComponentName) j69Var.c.b).flattenToShortString();
        String strK = u45.k(strFlattenToShortString, ":", str);
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (((k69) arrayList.get(i)).c.equals(strK)) {
                break;
            }
            i++;
        }
        HashMap map = this.h;
        if (i < 0) {
            map.put(new kmb(strFlattenToShortString, str), strK);
            return strK;
        }
        Log.w("MediaRouter", wy1.j("Either ", str, " isn't unique in ", strFlattenToShortString, " or we're trying to assign a unique ID for an already added route"));
        int i2 = 2;
        while (true) {
            Locale locale = Locale.US;
            String strE = xc0.e(i2, strK, "_");
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    i3 = -1;
                    break;
                }
                if (((k69) arrayList.get(i3)).c.equals(strE)) {
                    break;
                }
                i3++;
            }
            if (i3 < 0) {
                map.put(new kmb(strFlattenToShortString, str), strE);
                return strE;
            }
            i2++;
        }
    }

    public final k69 c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            k69 k69Var = (k69) it.next();
            if (k69Var != this.p && k69Var.c() == this.c && k69Var.m("android.media.intent.category.LIVE_AUDIO") && !k69Var.m("android.media.intent.category.LIVE_VIDEO") && k69Var.f()) {
                return k69Var;
            }
        }
        return this.p;
    }

    public final j69 d(b69 b69Var) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((j69) arrayList.get(i)).a == b69Var) {
                return (j69) arrayList.get(i);
            }
        }
        return null;
    }

    public final k69 e() {
        k69 k69Var = this.r;
        if (k69Var != null) {
            return k69Var;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final void f() {
        if (this.r.e()) {
            List<k69> listUnmodifiableList = Collections.unmodifiableList(this.r.u);
            HashSet hashSet = new HashSet();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((k69) it.next()).c);
            }
            HashMap map = this.v;
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    a69 a69Var = (a69) entry.getValue();
                    a69Var.h(0);
                    a69Var.d();
                    it2.remove();
                }
            }
            for (k69 k69Var : listUnmodifiableList) {
                if (!map.containsKey(k69Var.c)) {
                    a69 a69VarE = k69Var.c().e(k69Var.b, this.r.b);
                    a69VarE.e();
                    map.put(k69Var.c, a69VarE);
                }
            }
        }
    }

    public final void g(k69 k69Var, int i) {
        if (!this.g.contains(k69Var)) {
            Log.w("MediaRouter", "Ignoring attempt to select removed route: " + k69Var);
            return;
        }
        if (!k69Var.g) {
            Log.w("MediaRouter", "Ignoring attempt to select disabled route: " + k69Var);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            b69 b69VarC = k69Var.c();
            r49 r49Var = this.e;
            if (b69VarC == r49Var && this.r != k69Var) {
                String str = k69Var.b;
                MediaRoute2Info mediaRoute2InfoI = r49Var.i(str);
                if (mediaRoute2InfoI != null) {
                    r49Var.s0.transferTo(mediaRoute2InfoI);
                    return;
                }
                Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
                return;
            }
        }
        h(k69Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.k69 r11, int r12) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h69.h(k69, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h69.i():void");
    }

    public final void j() {
        MediaRouter2.RoutingController routingController;
        k69 k69Var = this.r;
        if (k69Var != null) {
            this.k.getClass();
            if (k69Var.e() && l69.d != null) {
                l69.c().getClass();
            }
            k69 k69Var2 = this.r;
            int i = k69Var2.l;
            if (this.d && k69Var2.c() == this.e) {
                a69 a69Var = this.s;
                int i2 = r49.B0;
                if ((a69Var instanceof n49) && (routingController = ((n49) a69Var).g) != null) {
                    routingController.getId();
                }
            }
            ArrayList arrayList = this.j;
            if (arrayList.size() <= 0) {
                return;
            }
            ((g69) arrayList.get(0)).getClass();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.j69 r21, defpackage.c69 r22) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h69.k(j69, c69):void");
    }

    public final int l(k69 k69Var, h59 h59Var) {
        int i = k69Var.i(h59Var);
        if (i != 0) {
            int i2 = i & 1;
            f69 f69Var = this.m;
            if (i2 != 0) {
                if (l69.c) {
                    Log.d("MediaRouter", "Route changed: " + k69Var);
                }
                f69Var.b(259, k69Var);
            }
            if ((i & 2) != 0) {
                if (l69.c) {
                    Log.d("MediaRouter", "Route volume changed: " + k69Var);
                }
                f69Var.b(260, k69Var);
            }
            if ((i & 4) != 0) {
                if (l69.c) {
                    Log.d("MediaRouter", "Route presentation display changed: " + k69Var);
                }
                f69Var.b(261, k69Var);
            }
        }
        return i;
    }

    public final void m(boolean z) {
        k69 k69Var = this.p;
        if (k69Var != null && !k69Var.f()) {
            Log.i("MediaRouter", "Clearing the default route because it is no longer selectable: " + this.p);
            this.p = null;
        }
        k69 k69Var2 = this.p;
        ArrayList arrayList = this.g;
        if (k69Var2 == null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k69 k69Var3 = (k69) it.next();
                if (k69Var3.c() == this.c && k69Var3.b.equals("DEFAULT_ROUTE") && k69Var3.f()) {
                    this.p = k69Var3;
                    Log.i("MediaRouter", "Found default route: " + this.p);
                    break;
                }
            }
        }
        k69 k69Var4 = this.q;
        if (k69Var4 != null && !k69Var4.f()) {
            Log.i("MediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.q);
            this.q = null;
        }
        if (this.q == null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                k69 k69Var5 = (k69) it2.next();
                if (k69Var5.c() == this.c && k69Var5.m("android.media.intent.category.LIVE_AUDIO") && !k69Var5.m("android.media.intent.category.LIVE_VIDEO") && k69Var5.f()) {
                    this.q = k69Var5;
                    Log.i("MediaRouter", "Found bluetooth route: " + this.q);
                    break;
                }
            }
        }
        k69 k69Var6 = this.r;
        if (k69Var6 == null || !k69Var6.g) {
            Log.i("MediaRouter", "Unselecting the current route because it is no longer selectable: " + this.r);
            h(c(), 0);
            return;
        }
        if (z) {
            f();
            j();
        }
    }
}
