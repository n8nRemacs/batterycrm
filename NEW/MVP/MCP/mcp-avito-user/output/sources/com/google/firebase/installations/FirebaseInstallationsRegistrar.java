package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b;
import com.google.firebase.components.u;
import gZ0.InterfaceC40638a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes6.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static i lambda$getComponents$0(com.google.firebase.components.c cVar) {
        return new g((com.google.firebase.g) cVar.a(com.google.firebase.g.class), cVar.b(com.google.firebase.heartbeatinfo.i.class), (ExecutorService) cVar.f(new u(InterfaceC40638a.class, ExecutorService.class)), com.google.firebase.concurrent.l.a((Executor) cVar.f(new u(gZ0.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.b<?>> getComponents() {
        b.C10697b c10697bB = com.google.firebase.components.b.b(i.class);
        c10697bB.f360732a = LIBRARY_NAME;
        c10697bB.a(com.google.firebase.components.n.a(com.google.firebase.g.class));
        c10697bB.a(new com.google.firebase.components.n(0, 1, com.google.firebase.heartbeatinfo.i.class));
        c10697bB.a(new com.google.firebase.components.n((u<?>) new u(InterfaceC40638a.class, ExecutorService.class), 1, 0));
        c10697bB.a(new com.google.firebase.components.n((u<?>) new u(gZ0.b.class, Executor.class), 1, 0));
        c10697bB.f360737f = new com.google.firebase.components.g(4);
        return Arrays.asList(c10697bB.b(), com.google.firebase.heartbeatinfo.h.a(), com.google.firebase.platforminfo.h.a(LIBRARY_NAME, "17.1.3"));
    }
}
