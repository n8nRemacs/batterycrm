package com.avito.android.serp.adapter.carousel_widget;

import kotlin.Metadata;
import ru.avito.component.serp.FixedWidthLinearLayoutManager;

/* compiled from: CarouselItemsWidgetView.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/avito/component/serp/FixedWidthLinearLayoutManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.carousel_widget.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34706p extends kotlin.jvm.internal.N implements Y41.a<FixedWidthLinearLayoutManager> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34699i f269406l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34706p(C34699i c34699i) {
        super(0);
        this.f269406l = c34699i;
    }

    @Override // Y41.a
    public final FixedWidthLinearLayoutManager invoke() {
        C34699i c34699i = this.f269406l;
        return new FixedWidthLinearLayoutManager(((Number) c34699i.f269360G.getValue()).intValue(), c34699i.f269377f.getContext());
    }
}
