package com.avito.android.competitor_analytics.ui;

import com.avito.android.competitor_analytics.mvi.entity.a;
import com.avito.android.competitor_analytics.mvi.entity.b;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsSuggestsV2.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class F0 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b.k.a f124614l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124615m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public F0(b.k.a aVar, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar) {
        super(0);
        this.f124614l = aVar;
        this.f124615m = lVar;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        DeepLink deepLink = this.f124614l.f124548c;
        if (deepLink != null) {
            this.f124615m.invoke(new a.i(deepLink));
        }
        return kotlin.G0.f406611a;
    }
}
