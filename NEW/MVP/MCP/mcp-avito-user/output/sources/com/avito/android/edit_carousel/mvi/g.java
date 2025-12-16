package com.avito.android.edit_carousel.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.edit_carousel.mvi.entity.EditCarouselInternalAction;
import com.avito.android.edit_carousel.mvi.entity.EditCarouselState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ty.InterfaceC48738a;
import ty.InterfaceC48739b;

/* compiled from: EditCarouselFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lty/a;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState;", "Lty/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g extends N implements Y41.l<q<InterfaceC48738a, EditCarouselInternalAction, EditCarouselState, InterfaceC48739b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f146517l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f146518m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f146519n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f146520o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f146521p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f146517l = eVar;
        this.f146518m = aVar;
        this.f146519n = screenPerformanceTracker;
        this.f146520o = lVar;
        this.f146521p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC48738a, EditCarouselInternalAction, EditCarouselState, InterfaceC48739b> qVar) {
        q<InterfaceC48738a, EditCarouselInternalAction, EditCarouselState, InterfaceC48739b> qVar2 = qVar;
        qVar2.f92008d = this.f146517l;
        qVar2.f92009e = this.f146518m;
        qVar2.f92011g = new o(this.f146519n, this.f146520o);
        qVar2.f92010f = this.f146521p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
