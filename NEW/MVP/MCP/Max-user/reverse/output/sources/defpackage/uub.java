package defpackage;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class uub extends xy {
    public final Integer X;
    public final Integer Y;
    public final boolean Z;
    public final String d;
    public String o;
    public final byte[] s0;
    public final String t0;
    public final String u0;
    public final Long v0;
    public final String w0;

    public uub(String str, String str2, Integer num, Integer num2, boolean z, byte[] bArr, Long l, String str3, String str4, boolean z2, boolean z3, String str5) {
        super(s00.PHOTO, z2, z3);
        this.d = str;
        this.o = str2;
        this.X = num;
        this.Y = num2;
        this.Z = z;
        this.s0 = bArr;
        this.v0 = l;
        this.u0 = str3;
        this.t0 = str4;
        this.w0 = str5;
    }

    @Override // defpackage.xy
    public final HashMap a() {
        HashMap mapA = super.a();
        String str = this.t0;
        if (!l8g.c(str)) {
            mapA.put("photoToken", str);
        }
        return mapA;
    }
}
