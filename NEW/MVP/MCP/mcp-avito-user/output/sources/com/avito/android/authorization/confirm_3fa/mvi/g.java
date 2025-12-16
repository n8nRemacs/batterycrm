package com.avito.android.authorization.confirm_3fa.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.confirm_3fa.mvi.entity.ConfirmEmailListInternalAction;
import com.avito.android.util.R0;
import ge.C40667c;
import ge.InterfaceC40665a;
import ge.InterfaceC40666b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConfirmEmailListFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lge/a;", "Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction;", "Lge/c;", "Lge/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC40665a, ConfirmEmailListInternalAction, C40667c, InterfaceC40666b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f93607l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f93608m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f93609n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f93610o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ R0 f93611p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, e eVar, ScreenPerformanceTracker screenPerformanceTracker, p pVar, R0 r02) {
        super(1);
        this.f93607l = bVar;
        this.f93608m = eVar;
        this.f93609n = screenPerformanceTracker;
        this.f93610o = pVar;
        this.f93611p = r02;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC40665a, ConfirmEmailListInternalAction, C40667c, InterfaceC40666b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC40665a, ConfirmEmailListInternalAction, C40667c, InterfaceC40666b> qVar2 = qVar;
        qVar2.f92009e = this.f93607l;
        qVar2.f92010f = this.f93608m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f93609n, this.f93610o);
        qVar2.f92013i = this.f93611p.c();
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
