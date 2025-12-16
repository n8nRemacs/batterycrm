package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class f20 extends xy {
    public final Long X;
    public final byte[] Y;
    public final String Z;
    public final Long d;
    public final String o;
    public final String s0;
    public final int t0;

    public f20(long j, String str, long j2, byte[] bArr, boolean z, String str2, String str3, boolean z2, int i) {
        super(s00.AUDIO, z, z2);
        this.X = Long.valueOf(j2);
        this.d = Long.valueOf(j);
        this.o = str;
        this.Y = bArr;
        this.Z = str2;
        this.s0 = str3;
        this.t0 = i;
    }

    @Override // defpackage.xy
    public final HashMap a() {
        HashMap mapA = super.a();
        String str = this.Z;
        if (l8g.c(str)) {
            mapA.put("audioId", this.d);
            return mapA;
        }
        mapA.put(ApiProtocol.KEY_TOKEN, str);
        return mapA;
    }
}
