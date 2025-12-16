package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public class gx3 implements Serializable {
    public final long X;
    public final long Y;
    public final int Z;
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final List o;
    public final int s0;
    public final List t0;
    public final String u0;
    public final String v0;
    public final String w0;
    public final lz7 x0;
    public final int[] y0;

    public gx3(long j, long j2, String str, String str2, List list, long j3, long j4, int i, int i2, List list2, String str3, String str4, String str5, lz7 lz7Var, int[] iArr) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        ArrayList arrayList = new ArrayList(list);
        arrayList.sort(Comparator.comparing(new m0(11)));
        this.o = Collections.unmodifiableList(arrayList);
        this.X = j3;
        this.Y = j4;
        this.Z = i;
        this.s0 = i2 == 0 ? 1 : i2;
        this.t0 = list2;
        this.u0 = str3;
        this.v0 = str4;
        this.w0 = str5;
        this.x0 = lz7Var;
        this.y0 = iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013e A[PHI: r35
  0x013e: PHI (r35v5 int) = (r35v1 int), (r35v2 int), (r35v3 int), (r35v6 int) binds: [B:94:0x0162, B:90:0x0155, B:86:0x0148, B:83:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [yz3] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.gx3 g(defpackage.tm9 r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx3.g(tm9):gx3");
    }

    public final String a() {
        List list = this.o;
        if (list.isEmpty()) {
            return null;
        }
        return ((zz3) list.get(0)).a();
    }

    public final String b() {
        List list = this.o;
        if (list.isEmpty()) {
            return null;
        }
        return ((zz3) list.get(0)).a;
    }

    public final String c() {
        List list = this.o;
        if (list.isEmpty()) {
            return null;
        }
        return ((zz3) list.get(0)).c;
    }

    public final String d(il0 il0Var) {
        String str = this.c;
        if (l8g.c(str)) {
            return null;
        }
        return xui.a(str, il0Var, hl0.a);
    }

    public final boolean e() {
        return this.t0.contains(fx3.BOT);
    }

    public final boolean f() {
        if (!e()) {
            return false;
        }
        fx3 fx3Var = fx3.OFFICIAL;
        List list = this.t0;
        return list.contains(fx3Var) && !list.contains(fx3.SERVICE_ACCOUNT);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "{id=", ", status=");
        sbL.append(hf3.l(this.Z));
        sbL.append(", options=");
        sbL.append(this.t0);
        sbL.append("}");
        return sbL.toString();
    }
}
