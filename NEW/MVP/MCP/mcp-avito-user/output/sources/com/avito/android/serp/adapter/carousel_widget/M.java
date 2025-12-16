package com.avito.android.serp.adapter.carousel_widget;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CarouselItemsWidgetPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class M extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q f269298l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CarouselWidgetItem f269299m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f269300n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Q q12, CarouselWidgetItem carouselWidgetItem, String str) {
        super(0);
        this.f269298l = q12;
        this.f269299m = carouselWidgetItem;
        this.f269300n = str;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Q q12 = this.f269298l;
        q12.f269310c.b(this.f269299m, this.f269300n, "photo");
        return G0.f406611a;
    }
}
