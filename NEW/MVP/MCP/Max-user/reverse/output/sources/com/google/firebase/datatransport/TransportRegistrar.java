package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bl3;
import defpackage.cl3;
import defpackage.dy0;
import defpackage.fsc;
import defpackage.gig;
import defpackage.iig;
import defpackage.mig;
import defpackage.o9g;
import defpackage.ol3;
import defpackage.ppi;
import defpackage.s28;
import defpackage.vt4;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ iig lambda$getComponents$0(ol3 ol3Var) {
        mig.b((Context) ol3Var.a(Context.class));
        return mig.a().c(dy0.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ iig lambda$getComponents$1(ol3 ol3Var) {
        mig.b((Context) ol3Var.a(Context.class));
        return mig.a().c(dy0.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ iig lambda$getComponents$2(ol3 ol3Var) {
        mig.b((Context) ol3Var.a(Context.class));
        return mig.a().c(dy0.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<cl3> getComponents() {
        bl3 bl3VarB = cl3.b(iig.class);
        bl3VarB.a = LIBRARY_NAME;
        bl3VarB.a(vt4.a(Context.class));
        bl3VarB.g = new o9g(18);
        cl3 cl3VarB = bl3VarB.b();
        bl3 bl3VarA = cl3.a(new fsc(s28.class, iig.class));
        bl3VarA.a(vt4.a(Context.class));
        bl3VarA.g = new o9g(19);
        cl3 cl3VarB2 = bl3VarA.b();
        bl3 bl3VarA2 = cl3.a(new fsc(gig.class, iig.class));
        bl3VarA2.a(vt4.a(Context.class));
        bl3VarA2.g = new o9g(20);
        return Arrays.asList(cl3VarB, cl3VarB2, bl3VarA2.b(), ppi.a(LIBRARY_NAME, "18.2.0"));
    }
}
