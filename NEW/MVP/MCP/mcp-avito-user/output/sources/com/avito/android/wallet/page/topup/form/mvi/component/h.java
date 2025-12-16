package com.avito.android.wallet.page.topup.form.mvi.component;

import bP0.C25543d;
import bP0.InterfaceC25540a;
import bP0.InterfaceC25541b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.wallet.page.topup.form.mvi.entity.TopUpFormInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TopUpFormFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LbP0/a;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "LbP0/d;", "LbP0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC25540a, TopUpFormInternalAction, C25543d, InterfaceC25541b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f328399l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f328400m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f328401n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f328402o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f328403p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f328399l = fVar;
        this.f328400m = bVar;
        this.f328401n = screenPerformanceTracker;
        this.f328402o = oVar;
        this.f328403p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC25540a, TopUpFormInternalAction, C25543d, InterfaceC25541b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC25540a, TopUpFormInternalAction, C25543d, InterfaceC25541b> qVar2 = qVar;
        qVar2.f92008d = this.f328399l;
        qVar2.f92009e = this.f328400m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f328401n, this.f328402o);
        qVar2.f92010f = this.f328403p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
