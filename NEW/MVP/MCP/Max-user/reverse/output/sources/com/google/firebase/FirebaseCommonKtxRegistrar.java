package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bl3;
import defpackage.cl3;
import defpackage.fsc;
import defpackage.gqg;
import defpackage.jbe;
import defpackage.nq0;
import defpackage.o48;
import defpackage.rha;
import defpackage.u1j;
import defpackage.uha;
import defpackage.ve3;
import defpackage.vt4;
import defpackage.z74;
import defpackage.ze0;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lcl3;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<cl3> getComponents() {
        bl3 bl3VarA = cl3.a(new fsc(ze0.class, z74.class));
        bl3VarA.a(new vt4(new fsc(ze0.class, Executor.class), 1, 0));
        bl3VarA.g = rha.w0;
        cl3 cl3VarB = bl3VarA.b();
        bl3 bl3VarA2 = cl3.a(new fsc(o48.class, z74.class));
        bl3VarA2.a(new vt4(new fsc(o48.class, Executor.class), 1, 0));
        bl3VarA2.g = uha.w0;
        cl3 cl3VarB2 = bl3VarA2.b();
        bl3 bl3VarA3 = cl3.a(new fsc(nq0.class, z74.class));
        bl3VarA3.a(new vt4(new fsc(nq0.class, Executor.class), 1, 0));
        bl3VarA3.g = jbe.v0;
        cl3 cl3VarB3 = bl3VarA3.b();
        bl3 bl3VarA4 = cl3.a(new fsc(gqg.class, z74.class));
        bl3VarA4.a(new vt4(new fsc(gqg.class, Executor.class), 1, 0));
        bl3VarA4.g = u1j.w0;
        return ve3.j(cl3VarB, cl3VarB2, cl3VarB3, bl3VarA4.b());
    }
}
