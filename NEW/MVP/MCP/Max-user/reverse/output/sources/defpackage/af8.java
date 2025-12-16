package defpackage;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class af8 extends xy {
    public final long X;
    public final long Y;
    public final List Z;
    public final cf8 d;
    public final long o;
    public final String s0;
    public final float t0;
    public final boolean u0;

    public af8(cf8 cf8Var, long j, long j2, long j3, List list, String str, float f, boolean z, boolean z2, boolean z3) {
        super(s00.LOCATION, z2, z3);
        this.d = cf8Var;
        this.o = j;
        this.X = j2;
        this.Y = j3;
        this.Z = list;
        this.s0 = str;
        this.u0 = z;
        this.t0 = f;
    }

    @Override // defpackage.xy
    public final HashMap a() {
        HashMap mapA = super.a();
        cf8 cf8Var = this.d;
        mapA.put("latitude", Double.valueOf(cf8Var.a));
        mapA.put("longitude", Double.valueOf(cf8Var.b));
        long j = this.o;
        if (j > 0) {
            mapA.put("livePeriod", Long.valueOf(j));
        }
        float f = this.t0;
        if (f > 0.0f) {
            mapA.put("zoom", Float.valueOf(f));
        }
        double d = cf8Var.c;
        if (d != 0.0d) {
            mapA.put("alt", Double.valueOf(d));
        }
        float f2 = cf8Var.d;
        if (f2 != 0.0f) {
            mapA.put("epu", Float.valueOf(f2));
        }
        float f3 = cf8Var.o;
        if (f3 != 0.0f) {
            mapA.put("hdn", Float.valueOf(f3));
        }
        float f4 = cf8Var.X;
        if (f4 != 0.0f) {
            mapA.put("spd", Float.valueOf(f4));
        }
        return mapA;
    }
}
