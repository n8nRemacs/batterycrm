package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class r0h extends xy {
    public final a2h A0;
    public final Long X;
    public final String Y;
    public final Integer Z;
    public final Long d;
    public final Integer o;
    public final Integer s0;
    public final boolean t0;
    public final String u0;
    public final String v0;
    public final String w0;
    public final byte[] x0;
    public final Long y0;
    public final String z0;

    public r0h(long j, int i, Long l, String str, Integer num, Integer num2, boolean z, String str2, String str3, String str4, byte[] bArr, Long l2, boolean z2, String str5, a2h a2hVar, boolean z3) {
        super(s00.VIDEO, z2, z3);
        this.d = Long.valueOf(j);
        this.o = Integer.valueOf(i);
        this.X = l;
        this.Y = str;
        this.Z = num;
        this.s0 = num2;
        this.t0 = z;
        this.u0 = str2;
        this.v0 = str3;
        this.w0 = str4;
        this.y0 = l2;
        this.x0 = bArr;
        this.z0 = str5;
        this.A0 = a2hVar;
    }

    @Override // defpackage.xy
    public final HashMap a() {
        HashMap mapA = super.a();
        String str = this.z0;
        if (l8g.c(str)) {
            mapA.put("videoId", this.d);
        } else {
            mapA.put(ApiProtocol.KEY_TOKEN, str);
        }
        mapA.put("videoType", this.o);
        return mapA;
    }
}
