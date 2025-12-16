package com.avito.android.analytics.task;

import Ec.C13472a;
import Y41.l;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;

/* compiled from: StartupAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/task/b;", "Lcom/avito/android/analytics/task/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.analytics.task.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f91106a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<String, String> f91107b;

    /* compiled from: StartupAnalyticsTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements l<String, String> {
        @Override // Y41.l
        public final String invoke(String str) {
            ((C13472a) this.receiver).getClass();
            return "application_start.startup-task.".concat(str);
        }
    }

    @Inject
    public b(@k l lVar, @k InterfaceC28373a interfaceC28373a) {
        this.f91106a = interfaceC28373a;
        this.f91107b = lVar;
    }

    @Override // com.avito.android.analytics.task.a
    public final void a(long j12, @k String str) {
        this.f91106a.c(new y.c(this.f91107b.invoke(str), Long.valueOf(j12), null));
    }

    public b(InterfaceC28373a interfaceC28373a, l lVar, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? new a(1, C13472a.f4111a, C13472a.class, "blockingStartupTaskTime", "blockingStartupTaskTime(Ljava/lang/String;)Ljava/lang/String;", 0) : lVar, interfaceC28373a);
    }
}
