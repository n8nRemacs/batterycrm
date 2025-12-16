package com.avito.android.spare_parts.bottom_sheet.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.spare_parts.bottom_sheet.mvi.entity.SparePartsBottomSheetInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import tx0.C48737c;
import tx0.InterfaceC48735a;
import tx0.InterfaceC48736b;

/* compiled from: SparePartsBottomSheetFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Ltx0/a;", "Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetInternalAction;", "Ltx0/c;", "Ltx0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements l<q<InterfaceC48735a, SparePartsBottomSheetInternalAction, C48737c, InterfaceC48736b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f284799l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f284800m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f284801n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f284802o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f284803p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f284799l = cVar;
        this.f284800m = aVar;
        this.f284801n = screenPerformanceTracker;
        this.f284802o = jVar;
        this.f284803p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC48735a, SparePartsBottomSheetInternalAction, C48737c, InterfaceC48736b> qVar) {
        q<InterfaceC48735a, SparePartsBottomSheetInternalAction, C48737c, InterfaceC48736b> qVar2 = qVar;
        qVar2.f92008d = this.f284799l;
        qVar2.f92009e = this.f284800m;
        qVar2.f92011g = new o(this.f284801n, this.f284802o);
        qVar2.f92010f = this.f284803p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
