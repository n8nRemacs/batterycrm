package com.avito.android.comfortable_deal.deal.item.analytics_report;

import Ep.InterfaceC13517a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.konveyor.item_visibility_tracker.b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AnalyticsReportVisibilityTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/analytics_report/i;", "LWV0/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final l<InterfaceC13517a, G0> f121200e;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@k l<? super InterfaceC13517a, G0> lVar) {
        super(true, true, 0.001f, 1L);
        this.f121200e = lVar;
    }

    @Override // WV0.a
    public final boolean a(@k b.InterfaceC10495b interfaceC10495b) {
        return interfaceC10495b instanceof a;
    }

    @Override // WV0.a
    public final void b(int i12, @k b.InterfaceC10495b interfaceC10495b) {
        this.f121200e.invoke(InterfaceC13517a.d.b.f4273a);
    }
}
