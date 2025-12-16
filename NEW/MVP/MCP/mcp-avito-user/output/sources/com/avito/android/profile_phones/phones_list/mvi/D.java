package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviState;
import kotlin.G0;
import kotlin.Metadata;
import wb0.InterfaceC49590a;
import wb0.InterfaceC49591b;

/* compiled from: PhonesListMviFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lwb0/a;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviState;", "Lwb0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class D extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC49590a, PhonesListMviInternalAction, PhonesListMviState, InterfaceC49591b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B f227906l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C33433e f227907m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f227908n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f227909o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ L f227910p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(B b12, C33433e c33433e, ScreenPerformanceTracker screenPerformanceTracker, N n12, L l12) {
        super(1);
        this.f227906l = b12;
        this.f227907m = c33433e;
        this.f227908n = screenPerformanceTracker;
        this.f227909o = n12;
        this.f227910p = l12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC49590a, PhonesListMviInternalAction, PhonesListMviState, InterfaceC49591b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC49590a, PhonesListMviInternalAction, PhonesListMviState, InterfaceC49591b> qVar2 = qVar;
        qVar2.f92008d = this.f227906l;
        qVar2.f92009e = this.f227907m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f227908n, this.f227909o);
        qVar2.f92010f = this.f227910p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        qVar2.f92014j = new com.avito.android.arch.mvi.r(false, true, 1, null);
        return G0.f406611a;
    }
}
