package com.avito.android.push.impl_module.token.sending.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.push.PushService;
import com.squareup.anvil.annotations.ContributesBinding;
import gg0.InterfaceC40678b;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: OnNewTokenInvocationPeriodTrackerImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/push/impl_module/token/sending/analytics/g;", "Lgg0/b;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements InterfaceC40678b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f246013a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final j f246014b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f246015c;

    /* compiled from: OnNewTokenInvocationPeriodTrackerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PushService.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PushService pushService = PushService.f245927b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PushService pushService2 = PushService.f245927b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public g(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k j jVar, @Y61.k com.avito.android.server_time.f fVar) {
        this.f246013a = interfaceC28373a;
        this.f246014b = jVar;
        this.f246015c = fVar;
    }

    @Override // gg0.InterfaceC40678b
    public final void a(@Y61.k PushService pushService) {
        long jA2;
        int iOrdinal = pushService.ordinal();
        j jVar = this.f246014b;
        if (iOrdinal == 0) {
            jA2 = jVar.a();
        } else if (iOrdinal == 1) {
            jA2 = jVar.b();
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            jA2 = jVar.h();
        }
        long jNow = this.f246015c.now();
        if (jA2 != 0) {
            Qf0.b.f13970a.getClass();
            this.f246013a.c(new y.c("calls.pushToken.onNewPushTokenPeriod.".concat(Qf0.b.a(pushService)), Long.valueOf(jNow - jA2), null));
        }
        int iOrdinal2 = pushService.ordinal();
        if (iOrdinal2 == 0) {
            jVar.f(jNow);
        } else if (iOrdinal2 == 1) {
            jVar.c(jNow);
        } else {
            if (iOrdinal2 != 2) {
                return;
            }
            jVar.d(jNow);
        }
    }
}
