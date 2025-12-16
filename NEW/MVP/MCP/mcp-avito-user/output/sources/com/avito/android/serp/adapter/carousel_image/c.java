package com.avito.android.serp.adapter.carousel_image;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import rn0.InterfaceC47691c;

/* compiled from: CarouselImageItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f269118l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f269119m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ CarouselImageItem f269120n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, DeepLink deepLink, CarouselImageItem carouselImageItem) {
        super(0);
        this.f269118l = dVar;
        this.f269119m = deepLink;
        this.f269120n = carouselImageItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC47691c.a.a(this.f269118l.f269121b.get(), this.f269119m, null, 14);
        Y41.a<G0> aVar = this.f269120n.f269113g;
        if (aVar != null) {
            aVar.invoke();
        }
        return G0.f406611a;
    }
}
