package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class w47 {
    public final String a;
    public Uri c;
    public Uri d;
    public boolean j;
    public Boolean o;
    public String p;
    public String q;
    public final HashMap b = new HashMap();
    public long e = -9223372036854775807L;
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public ArrayList i = new ArrayList();
    public long k = -9223372036854775807L;
    public long l = -9223372036854775807L;
    public ArrayList m = new ArrayList();
    public ArrayList n = new ArrayList();

    public w47(String str) {
        this.a = str;
    }

    public final x47 a() {
        Uri uri = this.d;
        if ((uri != null || this.c == null) && (uri == null || this.c != null)) {
            return null;
        }
        long j = this.e;
        if (j == -9223372036854775807L) {
            return null;
        }
        Uri uri2 = this.c;
        long j2 = this.f;
        long j3 = this.g;
        long j4 = this.h;
        ArrayList arrayList = this.i;
        boolean z = this.j;
        long j5 = this.k;
        long j6 = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        ArrayList arrayList4 = new ArrayList(this.b.values());
        Boolean bool = this.o;
        boolean z2 = bool == null || bool.booleanValue();
        String str = this.p;
        if (str == null) {
            str = "POINT";
        }
        String str2 = str;
        String str3 = this.q;
        if (str3 == null) {
            str3 = "HIGHLIGHT";
        }
        return new x47(this.a, uri2, uri, j, j2, j3, j4, arrayList, z, j5, j6, arrayList2, arrayList3, arrayList4, z2, str2, str3);
    }

    public final void b(Uri uri) {
        if (uri == null) {
            return;
        }
        Uri uri2 = this.d;
        if (uri2 != null) {
            hsi.a("Can't change assetListUri from " + this.d + " to " + uri, uri2.equals(uri));
        }
        this.d = uri;
    }

    public final void c(Uri uri) {
        if (uri == null) {
            return;
        }
        Uri uri2 = this.c;
        if (uri2 != null) {
            hsi.a("Can't change assetUri from " + this.c + " to " + uri, uri2.equals(uri));
        }
        this.c = uri;
    }

    public final void d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            v47 v47Var = (v47) arrayList.get(i);
            String str = v47Var.a;
            HashMap map = this.b;
            v47 v47Var2 = (v47) map.get(str);
            if (v47Var2 != null) {
                boolean zEquals = v47Var2.equals(v47Var);
                StringBuilder sbN = az1.n("Can't change ", str, " from ");
                sbN.append(v47Var2.d);
                sbN.append(" ");
                sbN.append(v47Var2.c);
                sbN.append(" to ");
                sbN.append(v47Var.d);
                sbN.append(" ");
                sbN.append(v47Var.c);
                hsi.a(sbN.toString(), zEquals);
            }
            map.put(str, v47Var);
        }
    }

    public final void e(Boolean bool) {
        if (bool == null) {
            return;
        }
        Boolean bool2 = this.o;
        if (bool2 != null) {
            hsi.a("Can't change contentMayVary from " + this.o + " to " + bool, bool2.equals(bool));
        }
        this.o = bool;
    }

    public final void f(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.i.isEmpty()) {
            hsi.a("Can't change cue from " + String.join(", ", this.i) + " to " + String.join(", ", arrayList), this.i.equals(arrayList));
        }
        this.i = arrayList;
    }

    public final void g(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.g;
        if (j2 != -9223372036854775807L) {
            hsi.a("Can't change durationUs from " + this.g + " to " + j, j2 == j);
        }
        this.g = j;
    }

    public final void h(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f;
        if (j2 != -9223372036854775807L) {
            hsi.a("Can't change endDateUnixUs from " + this.f + " to " + j, j2 == j);
        }
        this.f = j;
    }

    public final void i(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.h;
        if (j2 != -9223372036854775807L) {
            hsi.a("Can't change plannedDurationUs from " + this.h + " to " + j, j2 == j);
        }
        this.h = j;
    }

    public final void j(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.l;
        if (j2 != -9223372036854775807L) {
            hsi.a("Can't change playoutLimitUs from " + this.l + " to " + j, j2 == j);
        }
        this.l = j;
    }

    public final void k(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.n.isEmpty()) {
            hsi.a("Can't change restrictions from " + String.join(", ", this.n) + " to " + String.join(", ", arrayList), this.n.equals(arrayList));
        }
        this.n = arrayList;
    }

    public final void l(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.k;
        if (j2 != -9223372036854775807L) {
            hsi.a("Can't change resumeOffsetUs from " + this.k + " to " + j, j2 == j);
        }
        this.k = j;
    }

    public final void m(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.m.isEmpty()) {
            hsi.a("Can't change snapTypes from " + String.join(", ", this.m) + " to " + String.join(", ", arrayList), this.m.equals(arrayList));
        }
        this.m = arrayList;
    }

    public final void n(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.e;
        if (j2 != -9223372036854775807L) {
            hsi.a("Can't change startDateUnixUs from " + this.e + " to " + j, j2 == j);
        }
        this.e = j;
    }

    public final void o(String str) {
        if (str == null) {
            return;
        }
        String str2 = this.p;
        if (str2 != null) {
            hsi.a("Can't change timelineOccupies from " + this.p + " to " + str, str2.equals(str));
        }
        this.p = str;
    }

    public final void p(String str) {
        if (str == null) {
            return;
        }
        String str2 = this.q;
        if (str2 != null) {
            hsi.a("Can't change timelineStyle from " + this.q + " to " + str, str2.equals(str));
        }
        this.q = str;
    }
}
