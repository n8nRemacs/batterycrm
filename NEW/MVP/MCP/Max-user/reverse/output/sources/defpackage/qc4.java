package defpackage;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class qc4 {
    public Context a;

    public /* synthetic */ qc4(Context context) {
        this.a = context;
    }

    public rc4 a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        rc4 rc4Var = new rc4();
        rc4Var.a = lz4.a(jca.b);
        tl4 tl4Var = new tl4(context);
        rc4Var.b = tl4Var;
        rc4Var.c = lz4.a(new py0(tl4Var, 23, new y6i(11, tl4Var)));
        tl4 tl4Var2 = rc4Var.b;
        rc4Var.d = new znd(tl4Var2);
        Provider providerA = lz4.a(new ao6(16, tl4Var2));
        rc4Var.o = providerA;
        Provider providerA2 = lz4.a(new aqc(rc4Var.d, providerA, false, 3));
        rc4Var.X = providerA2;
        mni mniVar = new mni();
        tl4 tl4Var3 = rc4Var.b;
        u5i u5iVar = new u5i(tl4Var3, providerA2, mniVar);
        Provider provider = rc4Var.a;
        Provider provider2 = rc4Var.c;
        hk4 hk4Var = new hk4();
        hk4Var.a = provider;
        hk4Var.b = provider2;
        hk4Var.c = u5iVar;
        hk4Var.d = providerA2;
        hk4Var.o = providerA2;
        vl3 vl3Var = new vl3();
        vl3Var.a = tl4Var3;
        vl3Var.b = provider2;
        vl3Var.c = providerA2;
        vl3Var.d = u5iVar;
        vl3Var.o = provider;
        vl3Var.X = providerA2;
        vl3Var.Y = providerA2;
        rc4Var.Y = lz4.a(new te8(hk4Var, vl3Var, new ywf(provider, providerA2, u5iVar, providerA2)));
        return rc4Var;
    }
}
