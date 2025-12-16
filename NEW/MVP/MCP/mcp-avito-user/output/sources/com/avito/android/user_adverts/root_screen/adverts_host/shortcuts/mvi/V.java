package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction;
import com.avito.android.util.R0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LTI0/a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "LTI0/c;", "LTI0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class V extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.arch.mvi.q<TI0.a, ShortcutsInternalAction, TI0.c, TI0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C35609a f313954l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f313955m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c0 f313956n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a0 f313957o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ R0 f313958p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C35609a c35609a, ScreenPerformanceTracker screenPerformanceTracker, c0 c0Var, a0 a0Var, R0 r02) {
        super(1);
        this.f313954l = c35609a;
        this.f313955m = screenPerformanceTracker;
        this.f313956n = c0Var;
        this.f313957o = a0Var;
        this.f313958p = r02;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<TI0.a, ShortcutsInternalAction, TI0.c, TI0.b> qVar) {
        com.avito.android.arch.mvi.q<TI0.a, ShortcutsInternalAction, TI0.c, TI0.b> qVar2 = qVar;
        qVar2.f92009e = this.f313954l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f313955m, this.f313956n);
        qVar2.f92010f = this.f313957o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        qVar2.f92013i = this.f313958p.c();
        return G0.f406611a;
    }
}
