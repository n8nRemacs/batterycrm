package com.avito.android.select.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.select.mvi.entity.SelectInternalAction;
import dq0.C39783e;
import dq0.InterfaceC39781c;
import dq0.InterfaceC39782d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Ldq0/c;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "Ldq0/e;", "Ldq0/d;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class m extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC39781c, SelectInternalAction, C39783e, InterfaceC39782d>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f265631l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f265632m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f265633n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r f265634o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p f265635p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, i iVar, ScreenPerformanceTracker screenPerformanceTracker, r rVar, p pVar) {
        super(1);
        this.f265631l = kVar;
        this.f265632m = iVar;
        this.f265633n = screenPerformanceTracker;
        this.f265634o = rVar;
        this.f265635p = pVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC39781c, SelectInternalAction, C39783e, InterfaceC39782d> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC39781c, SelectInternalAction, C39783e, InterfaceC39782d> qVar2 = qVar;
        qVar2.f92008d = this.f265631l;
        qVar2.f92009e = this.f265632m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f265633n, this.f265634o);
        qVar2.f92010f = this.f265635p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
