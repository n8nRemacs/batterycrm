package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x47 {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;
    public final boolean i;
    public final long j;
    public final long k;
    public final wg7 l;
    public final wg7 m;
    public final zjd n;
    public final boolean o;
    public final String p;
    public final String q;

    public x47(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3) {
        hsi.b((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = arrayList;
        this.i = z;
        this.j = j5;
        this.k = j6;
        this.l = wg7.j(arrayList2);
        this.m = wg7.j(arrayList3);
        this.n = wg7.r(new ov5(3), arrayList4);
        this.o = z2;
        this.p = str2;
        this.q = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x47)) {
            return false;
        }
        x47 x47Var = (x47) obj;
        return this.d == x47Var.d && this.e == x47Var.e && this.f == x47Var.f && this.g == x47Var.g && this.i == x47Var.i && this.j == x47Var.j && this.k == x47Var.k && this.o == x47Var.o && Objects.equals(this.a, x47Var.a) && Objects.equals(this.b, x47Var.b) && Objects.equals(this.c, x47Var.c) && Objects.equals(this.h, x47Var.h) && Objects.equals(this.l, x47Var.l) && Objects.equals(this.m, x47Var.m) && Objects.equals(this.n, x47Var.n) && Objects.equals(this.p, x47Var.p) && Objects.equals(this.q, x47Var.q);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q);
    }
}
