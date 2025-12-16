package com.avito.android.push.rustore.service;

import Qf0.C14891a;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.di.C29972i;
import com.avito.android.push.PushService;
import com.avito.android.push.rustore.service.a;
import com.avito.android.push.rustore.token_update.i;
import com.avito.android.util.V2;
import dagger.internal.t;
import dg0.InterfaceC39724a;
import fb1.C40395b;
import gg0.InterfaceC40678b;
import ig0.AbstractC41398a;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ru.rustore.sdk.pushclient.messaging.exception.RuStorePushClientException;

/* compiled from: RuStoreMessageService.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/push/rustore/service/RuStoreMessageService;", "Lru/rustore/sdk/pushclient/messaging/service/a;", "<init>", "()V", "a", "_avito_push-rustore_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RuStoreMessageService extends ru.rustore.sdk.pushclient.messaging.service.a {

    /* renamed from: j, reason: collision with root package name */
    @Inject
    public InterfaceC39724a f246109j;

    /* renamed from: k, reason: collision with root package name */
    @Inject
    public i f246110k;

    /* renamed from: l, reason: collision with root package name */
    @Inject
    public InterfaceC40678b f246111l;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f246112m;

    /* compiled from: RuStoreMessageService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/push/rustore/service/RuStoreMessageService$a;", "", "<init>", "()V", "", "CANT_RECEIVE_PUSH_ERROR", "Ljava/lang/String;", "GRAFANA_GET_PUSH_ERROR_EVENT", "GRAFANA_GET_PUSH_EVENT", "_avito_push-rustore_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // ru.rustore.sdk.pushclient.messaging.service.a
    public final void c(@k List<? extends RuStorePushClientException> list) {
        InterfaceC28373a interfaceC28373a = this.f246112m;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        interfaceC28373a.c(new y.a(".rustore.push.receive.error." + list.size(), 0L, 2, null));
        for (RuStorePushClientException ruStorePushClientException : list) {
            V2 v22 = V2.f318762a;
            String message = ruStorePushClientException.getMessage();
            if (message == null) {
                message = "Can't receive push from rustore";
            }
            v22.a("DEFAULT_TAG", message, ruStorePushClientException);
        }
    }

    @Override // ru.rustore.sdk.pushclient.messaging.service.a
    public final void d(@k C40395b c40395b) {
        Qf0.b bVar = Qf0.b.f13970a;
        PushService pushService = PushService.f245929d;
        bVar.getClass();
        String strA = Qf0.b.a(pushService);
        int i12 = c40395b.f395972b;
        Map<String, String> map = c40395b.f395974d;
        String str = c40395b.f395973c;
        int i13 = c40395b.f395971a;
        C14891a c14891a = new C14891a(map, str, i13, i13, i12, 0L, strA);
        InterfaceC39724a interfaceC39724a = this.f246109j;
        if (interfaceC39724a == null) {
            interfaceC39724a = null;
        }
        interfaceC39724a.a(c14891a);
    }

    @Override // ru.rustore.sdk.pushclient.messaging.service.a
    public final void e() {
        InterfaceC40678b interfaceC40678b = this.f246111l;
        if (interfaceC40678b == null) {
            interfaceC40678b = null;
        }
        interfaceC40678b.a(PushService.f245929d);
        i iVar = this.f246110k;
        if (iVar == null) {
            iVar = null;
        }
        AbstractC41398a.d dVar = AbstractC41398a.d.f398617c;
        iVar.b(dVar, false);
        i iVar2 = this.f246110k;
        (iVar2 != null ? iVar2 : null).b(dVar, true);
    }

    @Override // ru.rustore.sdk.pushclient.messaging.service.a, android.app.Service
    public final void onCreate() {
        c cVar = (c) C29972i.a(C29972i.b(this), c.class);
        new a.b();
        c cVar2 = new a.c(cVar, null).f246113a;
        InterfaceC39724a interfaceC39724aW4 = cVar2.W4();
        t.c(interfaceC39724aW4);
        this.f246109j = interfaceC39724aW4;
        i iVarFi = cVar2.Fi();
        t.c(iVarFi);
        this.f246110k = iVarFi;
        InterfaceC40678b interfaceC40678bUc = cVar2.Uc();
        t.c(interfaceC40678bUc);
        this.f246111l = interfaceC40678bUc;
        cVar2.O6();
        InterfaceC28373a interfaceC28373aA = cVar2.a();
        t.c(interfaceC28373aA);
        this.f246112m = interfaceC28373aA;
        super.onCreate();
    }
}
