package com.avito.android.serp.adapter.carousel_widget;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import rn0.InterfaceC47691c;

/* compiled from: CarouselItemsWidgetPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class O extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q f269302l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CarouselWidgetItem f269303m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f269304n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f269305o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Q q12, CarouselWidgetItem carouselWidgetItem, String str, String str2) {
        super(0);
        this.f269302l = q12;
        this.f269303m = carouselWidgetItem;
        this.f269304n = str;
        this.f269305o = str2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Q q12 = this.f269302l;
        String str = this.f269305o;
        D d12 = q12.f269310c;
        CarouselWidgetItem carouselWidgetItem = this.f269303m;
        d12.a(carouselWidgetItem, this.f269304n, str);
        DeepLink uri = carouselWidgetItem.f269263t.getUri();
        if (uri != null) {
            InterfaceC47691c.a.b(q12.f269309b.get(), uri, 6);
        }
        return G0.f406611a;
    }
}
