package com.avito.android.account;

import com.avito.android.push.PushService;
import com.avito.android.push.PushToken;
import com.avito.android.util.X2;
import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class P implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f68064c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f68065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f68066e;

    public /* synthetic */ P(int i12, Object obj, Object obj2, boolean z12) {
        this.f68063b = i12;
        this.f68065d = obj;
        this.f68064c = z12;
        this.f68066e = obj2;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        Object obj = this.f68066e;
        Object obj2 = this.f68065d;
        switch (this.f68063b) {
            case 0:
                U u12 = (U) obj2;
                u12.h();
                boolean z12 = this.f68064c;
                u12.f68078c.a((String) obj, z12);
                break;
            default:
                int i12 = com.avito.android.push.rustore.token_update.j.f246129h;
                X2.f318778a.c("RuStorePushTokenUpdater", "Push token successfully registered", null);
                PushService pushService = PushService.f245927b;
                com.avito.android.push.rustore.token_update.j jVar = (com.avito.android.push.rustore.token_update.j) obj2;
                com.avito.android.push.rustore.token_update.a aVar = jVar.f246131b;
                boolean z13 = this.f68064c;
                aVar.a(z13);
                Qf0.b bVar = Qf0.b.f13970a;
                PushToken pushToken = (PushToken) obj;
                PushService pushService2 = pushToken.f245933c;
                bVar.getClass();
                jVar.f246136g.c(new gg0.d(Qf0.b.a(pushService2), pushToken.f245932b, z13, null, 8, null));
                break;
        }
    }
}
