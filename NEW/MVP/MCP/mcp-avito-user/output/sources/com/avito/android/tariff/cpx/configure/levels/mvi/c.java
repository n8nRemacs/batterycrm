package com.avito.android.tariff.cpx.configure.levels.mvi;

import com.avito.android.tariff.cpx.configure.levels.mvi.entity.TariffCpxConfigureLevelsInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TariffCpxConfigureLevelsActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LsB0/c;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction;", "invoke", "(LsB0/c;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements Y41.l<sB0.c, InterfaceC43160i<? extends TariffCpxConfigureLevelsInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f296193l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<sB0.e> f296194m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Y41.a<sB0.e> aVar) {
        super(1);
        this.f296193l = dVar;
        this.f296194m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends TariffCpxConfigureLevelsInternalAction> invoke(sB0.c cVar) {
        sB0.e eVarInvoke = this.f296194m.invoke();
        return this.f296193l.b(cVar, eVarInvoke);
    }
}
