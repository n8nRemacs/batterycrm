package com.avito.android.tariff_cpt.levels.mvi;

import com.avito.android.tariff_cpt.levels.mvi.entity.TariffCptLevelsInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TariffCptLevelsActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LFC0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction;", "invoke", "(LFC0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements Y41.l<FC0.a, InterfaceC43160i<? extends TariffCptLevelsInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f298646l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<FC0.c> f298647m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Y41.a<FC0.c> aVar) {
        super(1);
        this.f298646l = gVar;
        this.f298647m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends TariffCptLevelsInternalAction> invoke(FC0.a aVar) {
        FC0.c cVarInvoke = this.f298647m.invoke();
        return this.f298646l.b(aVar, cVarInvoke);
    }
}
