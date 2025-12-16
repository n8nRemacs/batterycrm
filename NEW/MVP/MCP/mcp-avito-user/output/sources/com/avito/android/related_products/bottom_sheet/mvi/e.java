package com.avito.android.related_products.bottom_sheet.mvi;

import Y41.l;
import cj0.C27210c;
import cj0.InterfaceC27208a;
import cj0.InterfaceC27209b;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.related_products.bottom_sheet.mvi.entity.RelatedProductsBottomSheetInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RelatedProductsBottomSheetFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcj0/a;", "Lcom/avito/android/related_products/bottom_sheet/mvi/entity/RelatedProductsBottomSheetInternalAction;", "Lcj0/c;", "Lcj0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements l<q<InterfaceC27208a, RelatedProductsBottomSheetInternalAction, C27210c, InterfaceC27209b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f252920l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f252921m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f252922n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f252923o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f252924p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f252920l = cVar;
        this.f252921m = aVar;
        this.f252922n = screenPerformanceTracker;
        this.f252923o = jVar;
        this.f252924p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC27208a, RelatedProductsBottomSheetInternalAction, C27210c, InterfaceC27209b> qVar) {
        q<InterfaceC27208a, RelatedProductsBottomSheetInternalAction, C27210c, InterfaceC27209b> qVar2 = qVar;
        qVar2.f92008d = this.f252920l;
        qVar2.f92009e = this.f252921m;
        qVar2.f92011g = new o(this.f252922n, this.f252923o);
        qVar2.f92010f = this.f252924p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
