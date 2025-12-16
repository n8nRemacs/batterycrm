package com.avito.android.serp.adapter.carousel_widget;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

/* compiled from: CarouselItemsWidgetView.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/GridLayoutManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.carousel_widget.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34704n extends kotlin.jvm.internal.N implements Y41.a<GridLayoutManager> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34699i f269404l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34704n(C34699i c34699i) {
        super(0);
        this.f269404l = c34699i;
    }

    @Override // Y41.a
    public final GridLayoutManager invoke() {
        this.f269404l.f269377f.getContext();
        return new GridLayoutManager(1, 0);
    }
}
