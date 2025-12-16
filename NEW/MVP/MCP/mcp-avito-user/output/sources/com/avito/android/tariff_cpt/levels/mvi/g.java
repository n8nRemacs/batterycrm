package com.avito.android.tariff_cpt.levels.mvi;

import FC0.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff_cpt.levels.mvi.entity.TariffCptLevelsInternalAction;
import fv.C40482a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TariffCptLevelsActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "LFC0/a;", "Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction;", "LFC0/c;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements com.avito.android.arch.mvi.a<FC0.a, TariffCptLevelsInternalAction, FC0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_cpt.levels.domain.a f298648a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final v50.g f298649b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f298650c;

    @Inject
    public g(@Y61.k com.avito.android.tariff_cpt.levels.domain.a aVar, @Y61.k v50.g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f298648a = aVar;
        this.f298649b = gVar;
        this.f298650c = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(new c(new a(new b(C40482a.b(this.f298650c)))), C43175k.G(new d(this.f298649b.a(), null)), com.avito.android.arch.mvi.utils.h.e(c43197r1, e.f298638l, new f(this, aVar), 1000L));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<TariffCptLevelsInternalAction> b(@Y61.k FC0.a aVar, @Y61.k FC0.c cVar) {
        if (aVar instanceof a.f) {
            return (InterfaceC43160i) this.f298648a.invoke();
        }
        if (aVar instanceof a.d) {
            return new C43210w(new TariffCptLevelsInternalAction.LevelSelect(((a.d) aVar).f4621a));
        }
        if (aVar instanceof a.C0282a) {
            return new C43210w(new TariffCptLevelsInternalAction.HandleDeeplink(((a.C0282a) aVar).f4618a));
        }
        if (aVar instanceof a.b) {
            EC0.a aVar2 = cVar.f4631e;
            return new C43210w(new TariffCptLevelsInternalAction.HandleDeeplink(aVar2 != null ? aVar2.f3878d.f398437b : null));
        }
        if (aVar instanceof a.c) {
            return new C43210w(new TariffCptLevelsInternalAction.HandleDeeplink(((a.c) aVar).f4620a));
        }
        if (aVar instanceof a.e) {
            return new C43210w(new TariffCptLevelsInternalAction.ProgressChanged(((a.e) aVar).f4622a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
