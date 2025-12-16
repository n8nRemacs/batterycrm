package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bl3;
import defpackage.bof;
import defpackage.cl3;
import defpackage.cr4;
import defpackage.fsc;
import defpackage.gig;
import defpackage.h06;
import defpackage.iig;
import defpackage.l06;
import defpackage.m06;
import defpackage.ol3;
import defpackage.ppi;
import defpackage.tm4;
import defpackage.vt4;
import defpackage.x17;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(fsc fscVar, ol3 ol3Var) {
        h06 h06Var = (h06) ol3Var.a(h06.class);
        if (ol3Var.a(m06.class) == null) {
            return new FirebaseMessaging(h06Var, ol3Var.c(cr4.class), ol3Var.c(x17.class), (l06) ol3Var.a(l06.class), ol3Var.e(fscVar), (bof) ol3Var.a(bof.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<cl3> getComponents() {
        fsc fscVar = new fsc(gig.class, iig.class);
        bl3 bl3VarB = cl3.b(FirebaseMessaging.class);
        bl3VarB.a = LIBRARY_NAME;
        bl3VarB.a(vt4.a(h06.class));
        bl3VarB.a(new vt4(0, 0, m06.class));
        bl3VarB.a(new vt4(0, 1, cr4.class));
        bl3VarB.a(new vt4(0, 1, x17.class));
        bl3VarB.a(vt4.a(l06.class));
        bl3VarB.a(new vt4(fscVar, 0, 1));
        bl3VarB.a(vt4.a(bof.class));
        bl3VarB.g = new tm4(fscVar, 1);
        if (!(bl3VarB.b == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        bl3VarB.b = 1;
        return Arrays.asList(bl3VarB.b(), ppi.a(LIBRARY_NAME, "24.0.1"));
    }
}
