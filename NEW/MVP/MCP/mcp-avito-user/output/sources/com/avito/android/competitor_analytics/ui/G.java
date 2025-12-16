package com.avito.android.competitor_analytics.ui;

import com.avito.android.competitor_analytics.domain.model.ActionButton;
import com.avito.android.competitor_analytics.mvi.entity.a;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsFooter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class G extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124616l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ActionButton f124617m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public G(Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, ActionButton actionButton) {
        super(0);
        this.f124616l = lVar;
        this.f124617m = actionButton;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        this.f124616l.invoke(new a.i(this.f124617m.f124316b));
        return kotlin.G0.f406611a;
    }
}
