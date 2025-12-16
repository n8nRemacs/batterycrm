package defpackage;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k69 {
    public final j69 a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public Uri f;
    public boolean g;
    public int h;
    public boolean i;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public Bundle r;
    public IntentSender s;
    public h59 t;
    public us v;
    public final ArrayList j = new ArrayList();
    public int q = -1;
    public ArrayList u = new ArrayList();

    public k69(j69 j69Var, String str, String str2) {
        this.a = j69Var;
        this.b = str;
        this.c = str2;
    }

    public static z59 a() {
        l69.b();
        a69 a69Var = l69.c().s;
        if (a69Var instanceof z59) {
            return (z59) a69Var;
        }
        return null;
    }

    public final y6i b(k69 k69Var) {
        if (k69Var == null) {
            throw new NullPointerException("route must not be null");
        }
        String str = k69Var.c;
        us usVar = this.v;
        if (usVar == null || !usVar.containsKey(str)) {
            return null;
        }
        return new y6i(24, (y59) this.v.get(str));
    }

    public final b69 c() {
        j69 j69Var = this.a;
        j69Var.getClass();
        l69.b();
        return j69Var.a;
    }

    public final boolean d() {
        l69.b();
        k69 k69Var = l69.c().p;
        if (k69Var != null) {
            return k69Var == this || this.m == 3 || (TextUtils.equals(((ComponentName) c().b.b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO"));
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    public final boolean e() {
        return Collections.unmodifiableList(this.u).size() >= 1;
    }

    public final boolean f() {
        return this.t != null && this.g;
    }

    public final boolean g() {
        l69.b();
        return l69.c().e() == this;
    }

    public final boolean h(d69 d69Var) {
        if (d69Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        l69.b();
        ArrayList arrayList = this.j;
        if (arrayList == null) {
            return false;
        }
        d69Var.a();
        if (d69Var.b.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            if (intentFilter != null) {
                Iterator it2 = d69Var.b.iterator();
                while (it2.hasNext()) {
                    if (intentFilter.hasCategory((String) it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0106 A[EDGE_INSN: B:131:0x0106->B:70:0x0106 BREAK  A[LOOP:0: B:37:0x0099->B:137:0x0099], EDGE_INSN: B:132:0x0106->B:70:0x0106 BREAK  A[LOOP:0: B:37:0x0099->B:137:0x0099], EDGE_INSN: B:133:0x0106->B:70:0x0106 BREAK  A[LOOP:0: B:37:0x0099->B:137:0x0099], EDGE_INSN: B:134:0x0106->B:70:0x0106 BREAK  A[LOOP:0: B:37:0x0099->B:137:0x0099, LOOP_LABEL: LOOP:0: B:37:0x0099->B:137:0x0099], EDGE_INSN: B:135:0x0106->B:70:0x0106 BREAK  A[LOOP:0: B:37:0x0099->B:137:0x0099], EDGE_INSN: B:136:0x0106->B:70:0x0106 BREAK  A[LOOP:0: B:37:0x0099->B:137:0x0099, LOOP_LABEL: LOOP:0: B:37:0x0099->B:137:0x0099]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.h59 r15) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k69.i(h59):int");
    }

    public final void j(int i) {
        a69 a69Var;
        a69 a69Var2;
        l69.b();
        h69 h69VarC = l69.c();
        int iMin = Math.min(this.p, Math.max(0, i));
        HashMap map = h69VarC.v;
        if (this == h69VarC.r && (a69Var2 = h69VarC.s) != null) {
            a69Var2.f(iMin);
        } else {
            if (map.isEmpty() || (a69Var = (a69) map.get(this.c)) == null) {
                return;
            }
            a69Var.f(iMin);
        }
    }

    public final void k(int i) {
        a69 a69Var;
        a69 a69Var2;
        l69.b();
        if (i != 0) {
            h69 h69VarC = l69.c();
            HashMap map = h69VarC.v;
            if (this == h69VarC.r && (a69Var2 = h69VarC.s) != null) {
                a69Var2.i(i);
            } else {
                if (map.isEmpty() || (a69Var = (a69) map.get(this.c)) == null) {
                    return;
                }
                a69Var.i(i);
            }
        }
    }

    public final void l() {
        l69.b();
        l69.c().g(this, 3);
    }

    public final boolean m(String str) {
        l69.b();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((IntentFilter) arrayList.get(i)).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final void n(Collection collection) {
        this.u.clear();
        if (this.v == null) {
            this.v = new us(0);
        }
        this.v.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            y59 y59Var = (y59) it.next();
            k69 k69VarA = this.a.a(y59Var.a.c());
            if (k69VarA != null) {
                this.v.put(k69VarA.c, y59Var);
                int i = y59Var.b;
                if (i == 2 || i == 3) {
                    this.u.add(k69VarA);
                }
            }
        }
        l69.c().m.b(259, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouter.RouteInfo{ uniqueId=" + this.c + ", name=" + this.d + ", description=" + this.e + ", iconUri=" + this.f + ", enabled=" + this.g + ", connectionState=" + this.h + ", canDisconnect=" + this.i + ", playbackType=" + this.k + ", playbackStream=" + this.l + ", deviceType=" + this.m + ", volumeHandling=" + this.n + ", volume=" + this.o + ", volumeMax=" + this.p + ", presentationDisplayId=" + this.q + ", extras=" + this.r + ", settingsIntent=" + this.s + ", providerPackageName=" + ((ComponentName) this.a.c.b).getPackageName());
        if (e()) {
            sb.append(", members=[");
            int size = this.u.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.u.get(i) != this) {
                    sb.append(((k69) this.u.get(i)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
