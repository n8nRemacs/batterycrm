package com.avito.android.mortgage.selected_appeal.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.mortgage.selected_appeal.mvi.entity.SelectedAppealInternalAction;
import k10.C42473c;
import k10.InterfaceC42471a;
import k10.InterfaceC42472b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectedAppealFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lk10/a;", "Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealInternalAction;", "Lk10/c;", "Lk10/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements l<q<InterfaceC42471a, SelectedAppealInternalAction, C42473c, InterfaceC42472b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f203460l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f203461m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f203462n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f203463o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, ScreenPerformanceTracker screenPerformanceTracker, i iVar, g gVar) {
        super(1);
        this.f203460l = bVar;
        this.f203461m = screenPerformanceTracker;
        this.f203462n = iVar;
        this.f203463o = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC42471a, SelectedAppealInternalAction, C42473c, InterfaceC42472b> qVar) {
        q<InterfaceC42471a, SelectedAppealInternalAction, C42473c, InterfaceC42472b> qVar2 = qVar;
        qVar2.f92009e = this.f203460l;
        qVar2.f92011g = new o(this.f203461m, this.f203462n);
        qVar2.f92010f = this.f203463o;
        return G0.f406611a;
    }
}
