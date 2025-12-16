package defpackage;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class pu3 extends xy {
    public final String X;
    public final String Y;
    public final String Z;
    public final String d;
    public final long o;
    public final String s0;
    public final String t0;

    public pu3(String str, long j, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        super(s00.CONTACT, z, z2);
        this.d = str;
        this.o = j;
        this.X = str2;
        this.s0 = str5;
        this.t0 = str6;
        this.Y = str3;
        this.Z = str4;
    }

    @Override // defpackage.xy
    public final HashMap a() {
        HashMap mapA = super.a();
        String str = this.d;
        if (!l8g.c(str)) {
            mapA.put("vcfBody", str);
        }
        long j = this.o;
        if (j != 0) {
            mapA.put("contactId", Long.valueOf(j));
        }
        return mapA;
    }
}
