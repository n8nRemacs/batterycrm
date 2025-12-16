package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class xu5 extends xy {
    public final String X;
    public final xy Y;
    public final String Z;
    public final long d;
    public final long o;

    public xu5(long j, long j2, String str, xy xyVar, boolean z, String str2, boolean z2) {
        super(s00.FILE, z, z2);
        this.d = j;
        this.o = j2;
        this.X = str;
        this.Y = xyVar;
        this.Z = str2;
    }

    @Override // defpackage.xy
    public final HashMap a() {
        HashMap mapA = super.a();
        String str = this.Z;
        if (l8g.c(str)) {
            mapA.put("fileId", Long.valueOf(this.d));
            return mapA;
        }
        mapA.put(ApiProtocol.KEY_TOKEN, str);
        return mapA;
    }
}
