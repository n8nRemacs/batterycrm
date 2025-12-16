package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d57 extends f57 {
    public final String v0;
    public final wg7 w0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d57(long j, long j2, String str, String str2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, zjd.o);
        t76 t76Var = wg7.b;
    }

    public final d57 a(int i, long j) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        long j2 = j;
        while (true) {
            wg7 wg7Var = this.w0;
            if (i2 >= wg7Var.size()) {
                return new d57(this.a, this.b, this.v0, this.c, i, j, this.X, this.Y, this.Z, this.s0, this.t0, this.u0, arrayList);
            }
            z47 z47Var = (z47) wg7Var.get(i2);
            arrayList.add(new z47(z47Var.a, z47Var.b, z47Var.c, i, j2, z47Var.X, z47Var.Y, z47Var.Z, z47Var.s0, z47Var.t0, z47Var.u0, z47Var.v0, z47Var.w0));
            j2 += z47Var.c;
            i2++;
        }
    }

    public d57(String str, d57 d57Var, String str2, long j, int i, long j2, y45 y45Var, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, d57Var, j, i, j2, y45Var, str3, str4, j3, j4, z);
        this.v0 = str2;
        this.w0 = wg7.j(list);
    }
}
