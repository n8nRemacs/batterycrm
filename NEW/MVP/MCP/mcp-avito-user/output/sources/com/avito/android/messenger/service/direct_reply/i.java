package com.avito.android.messenger.service.direct_reply;

import com.avito.android.P;
import com.avito.android.messenger.analytics.MessageType;
import com.avito.android.messenger.analytics.d0;
import com.avito.android.push.PushService;
import com.avito.android.push.PushToken;
import com.avito.android.util.V2;
import jg0.InterfaceC42375a;
import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class i implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f197237b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f197238c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f197239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f197240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f197241f;

    public /* synthetic */ i(j jVar, boolean z12, String str, String str2) {
        this.f197240e = jVar;
        this.f197239d = z12;
        this.f197238c = str;
        this.f197241f = str2;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f197237b) {
            case 0:
                boolean z12 = this.f197239d;
                String str = this.f197238c;
                ((j) this.f197240e).f197245d.c(z12 ? new d0.a(str, MessageType.f186199c, (String) this.f197241f, true) : new d0.b(str, MessageType.f186199c, true));
                break;
            default:
                V2.f318762a.c("SendPushTokenInteractor", AK.c.s(new StringBuilder("["), this.f197238c, "] Push token successfully registered"), null);
                com.avito.android.push.impl_module.token.sending.sending_interactor.a aVar = (com.avito.android.push.impl_module.token.sending.sending_interactor.a) this.f197240e;
                P p12 = aVar.f246056e;
                boolean z13 = this.f197239d;
                PushToken pushToken = (PushToken) this.f197241f;
                com.avito.android.server_time.f fVar = aVar.f246054c;
                InterfaceC42375a interfaceC42375a = aVar.f246053b;
                if (z13) {
                    interfaceC42375a.h(fVar.now());
                    interfaceC42375a.f(p12.f().invoke());
                } else {
                    aVar.f246055d.k(pushToken.f245932b);
                    interfaceC42375a.d(fVar.now());
                    interfaceC42375a.j(p12.f().invoke());
                }
                Qf0.b bVar = Qf0.b.f13970a;
                PushService pushService = pushToken.f245933c;
                bVar.getClass();
                aVar.f246058g.c(new gg0.d(Qf0.b.a(pushService), pushToken.f245932b, z13, null, 8, null));
                break;
        }
    }

    public /* synthetic */ i(PushToken pushToken, com.avito.android.push.impl_module.token.sending.sending_interactor.a aVar, String str, boolean z12) {
        this.f197238c = str;
        this.f197240e = aVar;
        this.f197239d = z12;
        this.f197241f = pushToken;
    }
}
