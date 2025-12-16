package com.avito.android.competitor_analytics.ui;

import com.avito.android.competitor_analytics.mvi.entity.b;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsDetailsInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.competitor_analytics.ui.v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29549v extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.text_view.a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b.c f124863l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124864m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C29549v(b.c cVar, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar) {
        super(1);
        this.f124863l = cVar;
        this.f124864m = lVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        this.f124863l.f124492b.setOnDeepLinkClickListener(new SE0.a(15, this.f124864m));
        return kotlin.G0.f406611a;
    }
}
