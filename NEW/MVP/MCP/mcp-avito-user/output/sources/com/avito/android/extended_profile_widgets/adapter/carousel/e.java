package com.avito.android.extended_profile_widgets.adapter.carousel;

import Y41.l;
import com.avito.android.extended_profile_widgets.adapter.carousel.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CarouselItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/carousel/h$a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/extended_profile_widgets/adapter/carousel/h$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements l<h.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f154297l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CarouselItem f154298m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, CarouselItem carouselItem) {
        super(1);
        this.f154297l = fVar;
        this.f154298m = carouselItem;
    }

    @Override // Y41.l
    public final G0 invoke(h.a aVar) {
        h.a aVar2 = aVar;
        f fVar = this.f154297l;
        fVar.f154299b.invoke(new oB.g(this.f154298m, aVar2.f154301a, aVar2.f154302b));
        return G0.f406611a;
    }
}
