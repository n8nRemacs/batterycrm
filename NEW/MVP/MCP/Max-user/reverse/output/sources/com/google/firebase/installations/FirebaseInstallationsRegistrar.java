package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bl3;
import defpackage.cl3;
import defpackage.fsc;
import defpackage.h06;
import defpackage.i62;
import defpackage.k06;
import defpackage.l06;
import defpackage.nq0;
import defpackage.ol3;
import defpackage.os5;
import defpackage.pee;
import defpackage.ppi;
import defpackage.v17;
import defpackage.vt4;
import defpackage.w17;
import defpackage.ze0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static l06 lambda$getComponents$0(ol3 ol3Var) {
        return new k06((h06) ol3Var.a(h06.class), ol3Var.c(w17.class), (ExecutorService) ol3Var.f(new fsc(ze0.class, ExecutorService.class)), new pee((Executor) ol3Var.f(new fsc(nq0.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<cl3> getComponents() {
        bl3 bl3VarB = cl3.b(l06.class);
        bl3VarB.a = LIBRARY_NAME;
        bl3VarB.a(vt4.a(h06.class));
        bl3VarB.a(new vt4(0, 1, w17.class));
        bl3VarB.a(new vt4(new fsc(ze0.class, ExecutorService.class), 1, 0));
        bl3VarB.a(new vt4(new fsc(nq0.class, Executor.class), 1, 0));
        bl3VarB.g = new os5(8);
        cl3 cl3VarB = bl3VarB.b();
        v17 v17Var = new v17(0, (byte) 0);
        bl3 bl3VarB2 = cl3.b(v17.class);
        bl3VarB2.c = 1;
        bl3VarB2.g = new i62(12, v17Var);
        return Arrays.asList(cl3VarB, bl3VarB2.b(), ppi.a(LIBRARY_NAME, "18.0.0"));
    }
}
