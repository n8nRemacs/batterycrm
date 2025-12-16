package com.google.firebase.dynamiclinks.internal;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b;
import com.google.firebase.components.n;
import java.util.Arrays;
import java.util.List;

@RX0.a
@Keep
/* loaded from: classes5.dex */
public final class FirebaseDynamicLinkRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-dl";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.firebase.dynamiclinks.c lambda$getComponents$0(com.google.firebase.components.c cVar) {
        return new e((com.google.firebase.g) cVar.a(com.google.firebase.g.class), cVar.b(com.google.firebase.analytics.connector.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<com.google.firebase.components.b<?>> getComponents() {
        b.C10697b c10697bB = com.google.firebase.components.b.b(com.google.firebase.dynamiclinks.c.class);
        c10697bB.f360732a = LIBRARY_NAME;
        c10697bB.a(n.a(com.google.firebase.g.class));
        c10697bB.a(new n(0, 1, com.google.firebase.analytics.connector.a.class));
        c10697bB.f360737f = new com.google.firebase.components.g(3);
        return Arrays.asList(c10697bB.b(), com.google.firebase.platforminfo.h.a(LIBRARY_NAME, "21.1.0"));
    }
}
