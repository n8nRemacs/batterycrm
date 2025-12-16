package com.avito.android.tariff_cpt.level_feature.mvi;

import com.avito.android.tariff_cpt.level_feature.mvi.entity.TariffCptLevelFeatureInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TariffCptLevelFeaturesActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LDC0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction;", "invoke", "(LDC0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements Y41.l<DC0.a, InterfaceC43160i<? extends TariffCptLevelFeatureInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f298479l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<DC0.c> f298480m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Y41.a<DC0.c> aVar) {
        super(1);
        this.f298479l = dVar;
        this.f298480m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends TariffCptLevelFeatureInternalAction> invoke(DC0.a aVar) {
        DC0.c cVarInvoke = this.f298480m.invoke();
        this.f298479l.getClass();
        return d.c(aVar, cVarInvoke);
    }
}
