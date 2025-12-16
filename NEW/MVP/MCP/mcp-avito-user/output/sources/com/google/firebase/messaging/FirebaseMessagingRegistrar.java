package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.Arrays;
import java.util.List;
import tZ0.InterfaceC48624d;
import vZ0.InterfaceC49287a;

@RX0.a
@Keep
/* loaded from: classes6.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(com.google.firebase.components.c cVar) {
        return new FirebaseMessaging((com.google.firebase.g) cVar.a(com.google.firebase.g.class), (InterfaceC49287a) cVar.a(InterfaceC49287a.class), cVar.b(com.google.firebase.platforminfo.i.class), cVar.b(HeartBeatInfo.class), (com.google.firebase.installations.i) cVar.a(com.google.firebase.installations.i.class), (com.google.android.datatransport.h) cVar.a(com.google.android.datatransport.h.class), (InterfaceC48624d) cVar.a(InterfaceC48624d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<com.google.firebase.components.b<?>> getComponents() {
        b.C10697b c10697bB = com.google.firebase.components.b.b(FirebaseMessaging.class);
        c10697bB.f360732a = LIBRARY_NAME;
        c10697bB.a(com.google.firebase.components.n.a(com.google.firebase.g.class));
        c10697bB.a(new com.google.firebase.components.n(0, 0, InterfaceC49287a.class));
        c10697bB.a(new com.google.firebase.components.n(0, 1, com.google.firebase.platforminfo.i.class));
        c10697bB.a(new com.google.firebase.components.n(0, 1, HeartBeatInfo.class));
        c10697bB.a(new com.google.firebase.components.n(0, 0, com.google.android.datatransport.h.class));
        c10697bB.a(com.google.firebase.components.n.a(com.google.firebase.installations.i.class));
        c10697bB.a(com.google.firebase.components.n.a(InterfaceC48624d.class));
        c10697bB.f360737f = new com.google.firebase.components.g(6);
        c10697bB.d(1);
        return Arrays.asList(c10697bB.b(), com.google.firebase.platforminfo.h.a(LIBRARY_NAME, "23.1.2"));
    }
}
