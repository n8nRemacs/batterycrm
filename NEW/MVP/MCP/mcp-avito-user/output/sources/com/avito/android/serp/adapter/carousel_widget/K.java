package com.avito.android.serp.adapter.carousel_widget;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CarouselItemsWidgetPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "iid", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class K extends kotlin.jvm.internal.N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q f269292l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CarouselWidgetItem f269293m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f269294n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Q q12, CarouselWidgetItem carouselWidgetItem, String str) {
        super(1);
        this.f269292l = q12;
        this.f269293m = carouselWidgetItem;
        this.f269294n = str;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        Q q12 = this.f269292l;
        CarouselWidgetItem carouselWidgetItem = this.f269293m;
        String str2 = this.f269294n;
        q12.f269310c.b(carouselWidgetItem, str2, str);
        return G0.f406611a;
    }
}
