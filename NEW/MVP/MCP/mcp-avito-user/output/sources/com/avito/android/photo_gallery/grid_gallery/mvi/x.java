package com.avito.android.photo_gallery.grid_gallery.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GridGalleryFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LT70/c;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "LT70/e;", "LT70/d;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class x extends N implements Y41.l<com.avito.android.arch.mvi.q<T70.c, GridGalleryInternalAction, T70.e, T70.d>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f217412l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f217413m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f217414n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C f217415o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ A f217416p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(v vVar, n nVar, ScreenPerformanceTracker screenPerformanceTracker, C c12, A a12) {
        super(1);
        this.f217412l = vVar;
        this.f217413m = nVar;
        this.f217414n = screenPerformanceTracker;
        this.f217415o = c12;
        this.f217416p = a12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<T70.c, GridGalleryInternalAction, T70.e, T70.d> qVar) {
        com.avito.android.arch.mvi.q<T70.c, GridGalleryInternalAction, T70.e, T70.d> qVar2 = qVar;
        qVar2.f92008d = this.f217412l;
        qVar2.f92009e = this.f217413m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f217414n, this.f217415o);
        qVar2.f92010f = this.f217416p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
