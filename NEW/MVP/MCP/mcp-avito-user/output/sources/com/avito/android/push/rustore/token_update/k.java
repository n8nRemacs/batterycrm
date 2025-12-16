package com.avito.android.push.rustore.token_update;

import androidx.appcompat.app.r;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.D;
import com.avito.android.push.PushService;
import com.avito.android.push.PushToken;
import com.avito.android.util.X2;
import kotlin.Metadata;

/* compiled from: RuStorePushTokenUpdater.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f246142b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f246143c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PushToken f246144d;

    public k(boolean z12, j jVar, PushToken pushToken) {
        this.f246142b = z12;
        this.f246143c = jVar;
        this.f246144d = pushToken;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        X2 x22 = X2.f318778a;
        StringBuilder sb2 = new StringBuilder("Cant register push token (isVoip=");
        boolean z12 = this.f246142b;
        x22.a("RuStorePushTokenUpdater", r.x(sb2, z12, ')'), th2);
        InterfaceC28373a interfaceC28373a = this.f246143c.f246136g;
        Qf0.b bVar = Qf0.b.f13970a;
        PushToken pushToken = this.f246144d;
        PushService pushService = pushToken.f245933c;
        bVar.getClass();
        String strA = Qf0.b.a(pushService);
        String message = th2.getMessage();
        interfaceC28373a.c(new gg0.d(strA, pushToken.f245932b, z12, message != null ? D.a(message) : "undefined"));
    }
}
