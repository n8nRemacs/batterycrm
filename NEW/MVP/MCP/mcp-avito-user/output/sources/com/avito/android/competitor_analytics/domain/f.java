package com.avito.android.competitor_analytics.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import br.InterfaceC25696a;
import com.avito.android.competitor_analytics.domain.model.StateType;
import com.avito.android.competitor_analytics.mvi.entity.CompetitorAnalyticsInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CompetitorAnalyticsUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/domain/f;", "Lcom/avito/android/competitor_analytics/domain/d;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final long f124292a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC25696a f124293b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f124294c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final h f124295d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final R0 f124296e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final KO.a f124297f;

    @Inject
    public f(long j12, @k InterfaceC25696a interfaceC25696a, @k a aVar, @k h hVar, @k R0 r02, @k KO.a aVar2) {
        this.f124292a = j12;
        this.f124293b = interfaceC25696a;
        this.f124294c = aVar;
        this.f124295d = hVar;
        this.f124296e = r02;
        this.f124297f = aVar2;
    }

    @Override // com.avito.android.competitor_analytics.domain.d
    @k
    public final InterfaceC43160i<CompetitorAnalyticsInternalAction> a(@k StateType stateType) {
        return C43175k.I(this.f124296e.a(), C43175k.G(new e(stateType == StateType.f124336c, this, stateType, null)));
    }
}
