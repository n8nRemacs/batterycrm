package com.avito.android.serp.adapter.carousel_widget;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.carousel_widget.CarouselWidgetItem;
import kotlin.G0;
import kotlin.Metadata;
import rn0.InterfaceC47691c;

/* compiled from: CarouselItemsWidgetPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class P extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q f269306l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CarouselWidgetItem f269307m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f269308n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Q q12, CarouselWidgetItem carouselWidgetItem, String str) {
        super(0);
        this.f269306l = q12;
        this.f269307m = carouselWidgetItem;
        this.f269308n = str;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Q q12 = this.f269306l;
        String str = this.f269308n;
        D d12 = q12.f269310c;
        CarouselWidgetItem carouselWidgetItem = this.f269307m;
        d12.c(carouselWidgetItem, str);
        CarouselWidgetItem.Action action = carouselWidgetItem.f269258o;
        DeepLink deepLink = action != null ? action.f269270b : null;
        if (deepLink != null) {
            InterfaceC47691c.a.b(q12.f269309b.get(), deepLink, 6);
        }
        return G0.f406611a;
    }
}
