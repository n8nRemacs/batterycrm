package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;

/* loaded from: classes2.dex */
public final class jte extends xy {
    public final String X;
    public final String Y;
    public final String Z;
    public final long d;
    public final String o;
    public final uub s0;
    public final xy t0;
    public final boolean u0;

    public jte(long j, String str, String str2, String str3, String str4, uub uubVar, xy xyVar, boolean z, boolean z2, boolean z3) {
        super(s00.SHARE, z, z2);
        this.d = j;
        this.o = str;
        this.X = str2;
        this.Y = str3;
        this.Z = str4;
        this.s0 = uubVar;
        this.t0 = xyVar;
        this.u0 = z3;
    }

    @Override // defpackage.xy
    public final HashMap a() {
        HashMap mapA = super.a();
        mapA.put("shareId", Long.valueOf(this.d));
        mapA.put(KwsFeaturesConfigProviderImpl.URL_KEY, this.o);
        return mapA;
    }
}
