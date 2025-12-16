package defpackage;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class lef extends xy {
    public final int A0;
    public final String B0;
    public final int X;
    public final String Y;
    public final long Z;
    public final long d;
    public final int o;
    public final String s0;
    public final String t0;
    public final List u0;
    public final String v0;
    public final int w0;
    public final long x0;
    public final String y0;
    public final boolean z0;

    public lef(long j, int i, int i2, String str, long j2, String str2, String str3, List list, String str4, int i3, long j3, String str5, boolean z, int i4, boolean z2, boolean z3, String str6) {
        super(s00.STICKER, z2, z3);
        this.d = j;
        this.o = i;
        this.X = i2;
        this.Y = str;
        this.Z = j2;
        this.s0 = str2;
        this.t0 = str3;
        this.u0 = list;
        this.v0 = str4;
        this.w0 = i3;
        this.x0 = j3;
        this.y0 = str5;
        this.z0 = z;
        this.A0 = i4;
        this.B0 = str6;
    }

    @Override // defpackage.xy
    public final HashMap a() {
        HashMap mapA = super.a();
        mapA.put("stickerId", Long.valueOf(this.d));
        return mapA;
    }
}
