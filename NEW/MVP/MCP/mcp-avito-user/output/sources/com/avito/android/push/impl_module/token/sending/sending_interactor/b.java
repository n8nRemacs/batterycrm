package com.avito.android.push.impl_module.token.sending.sending_interactor;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.D;
import com.avito.android.push.PushService;
import com.avito.android.push.PushToken;
import com.avito.android.util.V2;
import kotlin.Metadata;
import l41.g;

/* compiled from: SendPushTokenInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b<T> implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f246065b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f246066c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PushToken f246067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f246068e;

    public b(PushToken pushToken, a aVar, String str, boolean z12) {
        this.f246065b = str;
        this.f246066c = aVar;
        this.f246067d = pushToken;
        this.f246068e = z12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        V2.f318762a.a("SendPushTokenInteractor", AK.c.s(new StringBuilder("["), this.f246065b, "] Can't register push token"), th2);
        InterfaceC28373a interfaceC28373a = this.f246066c.f246058g;
        Qf0.b bVar = Qf0.b.f13970a;
        PushToken pushToken = this.f246067d;
        PushService pushService = pushToken.f245933c;
        bVar.getClass();
        String strA = Qf0.b.a(pushService);
        String message = th2.getMessage();
        interfaceC28373a.c(new gg0.d(strA, pushToken.f245932b, this.f246068e, message != null ? D.a(message) : "undefined"));
    }
}
