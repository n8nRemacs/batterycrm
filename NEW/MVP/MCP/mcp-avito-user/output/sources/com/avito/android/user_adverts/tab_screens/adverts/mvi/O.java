package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState;
import com.avito.android.util.R0;
import fJ0.InterfaceC40301a;
import fJ0.InterfaceC40302b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UserAdvertsListFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LfJ0/a;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState;", "LfJ0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class O extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC40301a, UserAdvertsListInternalAction, UserAdvertsListState, InterfaceC40302b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C35670a f315253l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f315254m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U f315255n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ S f315256o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ R0 f315257p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(C35670a c35670a, ScreenPerformanceTracker screenPerformanceTracker, U u12, S s5, R0 r02) {
        super(1);
        this.f315253l = c35670a;
        this.f315254m = screenPerformanceTracker;
        this.f315255n = u12;
        this.f315256o = s5;
        this.f315257p = r02;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC40301a, UserAdvertsListInternalAction, UserAdvertsListState, InterfaceC40302b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC40301a, UserAdvertsListInternalAction, UserAdvertsListState, InterfaceC40302b> qVar2 = qVar;
        qVar2.f92009e = this.f315253l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f315254m, this.f315255n);
        qVar2.f92010f = this.f315256o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        qVar2.f92013i = this.f315257p.c();
        return G0.f406611a;
    }
}
