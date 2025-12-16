package com.avito.android.push.impl_module.fcm;

import bg0.InterfaceC25647a;
import com.avito.android.di.C29972i;
import com.avito.android.push.PushService;
import com.avito.android.push.impl_module.fcm.a;
import com.google.firebase.messaging.FirebaseMessagingService;
import dagger.internal.t;
import dg0.InterfaceC39724a;
import eg0.InterfaceC40103a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FcmMessagingService.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/push/impl_module/fcm/FcmMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class FcmMessagingService extends FirebaseMessagingService {

    /* renamed from: i, reason: collision with root package name */
    @Inject
    public InterfaceC39724a f245942i;

    /* renamed from: j, reason: collision with root package name */
    @Inject
    public InterfaceC40103a f245943j;

    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0111  */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(@Y61.k com.google.firebase.messaging.RemoteMessage r18) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.push.impl_module.fcm.FcmMessagingService.d(com.google.firebase.messaging.RemoteMessage):void");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void e() {
        InterfaceC40103a interfaceC40103a = this.f245943j;
        if (interfaceC40103a == null) {
            interfaceC40103a = null;
        }
        interfaceC40103a.a(PushService.f245927b);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        InterfaceC25647a interfaceC25647a = (InterfaceC25647a) C29972i.a(C29972i.b(this), InterfaceC25647a.class);
        new a.b();
        InterfaceC25647a interfaceC25647a2 = new a.c(interfaceC25647a, null).f245945a;
        InterfaceC39724a interfaceC39724aW4 = interfaceC25647a2.W4();
        t.c(interfaceC39724aW4);
        this.f245942i = interfaceC39724aW4;
        InterfaceC40103a interfaceC40103aAl = interfaceC25647a2.Al();
        t.c(interfaceC40103aAl);
        this.f245943j = interfaceC40103aAl;
    }
}
