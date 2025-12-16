package defpackage;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes.dex */
public final class iae extends svd {
    public final /* synthetic */ ly0 Z;
    public final /* synthetic */ ze4 s0;
    public final /* synthetic */ nae t0;

    public iae(nae naeVar, ly0 ly0Var, ze4 ze4Var) {
        this.t0 = naeVar;
        this.Z = ly0Var;
        this.s0 = ze4Var;
    }

    @Override // defpackage.svd
    public final Object c() throws IOException {
        xmb xmbVar = this.t0.d;
        ly0 ly0Var = this.Z;
        zdf zdfVar = new zdf(ly0Var);
        ub8.c.getAndIncrement();
        zdfVar.b = 0L;
        ve4 ve4Var = new ve4(zdfVar, this.s0);
        try {
            ve4Var.l();
            Uri uri = ly0Var.s0;
            uri.getClass();
            Object objM = xmbVar.m(uri, ve4Var);
            zxg.g(ve4Var);
            objM.getClass();
            return (mz5) objM;
        } catch (Throwable th) {
            zxg.g(ve4Var);
            throw th;
        }
    }
}
