package com.avito.android.photo_list_view_group_selection.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.photo_list_view_group_selection.mvi.entity.PhotoItemGroupSelectionInternalAction;
import e80.C39966c;
import e80.InterfaceC39964a;
import e80.InterfaceC39965b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhotoItemGroupSelectionFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Le80/a;", "Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionInternalAction;", "Le80/c;", "Le80/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements Y41.l<q<InterfaceC39964a, PhotoItemGroupSelectionInternalAction, C39966c, InterfaceC39965b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f218444l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f218445m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f218446n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f218447o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, ScreenPerformanceTracker screenPerformanceTracker, i iVar, g gVar) {
        super(1);
        this.f218444l = bVar;
        this.f218445m = screenPerformanceTracker;
        this.f218446n = iVar;
        this.f218447o = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC39964a, PhotoItemGroupSelectionInternalAction, C39966c, InterfaceC39965b> qVar) {
        q<InterfaceC39964a, PhotoItemGroupSelectionInternalAction, C39966c, InterfaceC39965b> qVar2 = qVar;
        qVar2.f92009e = this.f218444l;
        qVar2.f92011g = new o(this.f218445m, this.f218446n);
        qVar2.f92010f = this.f218447o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
