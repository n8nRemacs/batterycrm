package com.avito.android.tariff.cpx.configure.levels.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpx.configure.levels.mvi.entity.TariffCpxConfigureLevelsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import sB0.c;

/* compiled from: TariffCpxConfigureLevelsActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LsB0/c;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction;", "LsB0/e;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.arch.mvi.a<sB0.c, TariffCpxConfigureLevelsInternalAction, sB0.e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpx.configure.levels.mvi.domain.a f296195a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final v50.g f296196b;

    @Inject
    public d(@Y61.k com.avito.android.tariff.cpx.configure.levels.mvi.domain.a aVar, @Y61.k v50.g gVar) {
        this.f296195a = aVar;
        this.f296196b = gVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.G(new a(this.f296196b.a(), null)), com.avito.android.arch.mvi.utils.h.e(c43197r1, b.f296192l, new c(this, aVar), 1000L));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<TariffCpxConfigureLevelsInternalAction> b(@Y61.k sB0.c cVar, @Y61.k sB0.e eVar) {
        if (cVar instanceof c.e) {
            return (InterfaceC43160i) this.f296195a.invoke();
        }
        if (cVar instanceof c.a) {
            return new C43210w(TariffCpxConfigureLevelsInternalAction.Close.f296208b);
        }
        if (cVar instanceof c.b) {
            if (eVar.f437526d || eVar.f437527e) {
                return C43175k.w();
            }
            c.b bVar = (c.b) cVar;
            return new C43210w(new TariffCpxConfigureLevelsInternalAction.HandleDeeplink(bVar.f437512a, bVar.f437513b));
        }
        if (cVar instanceof c.C12610c) {
            c.C12610c c12610c = (c.C12610c) cVar;
            return new C43210w(new TariffCpxConfigureLevelsInternalAction.Loading.LevelButtonLoading(c12610c.f437514a, c12610c.f437515b));
        }
        if (cVar instanceof c.d) {
            return new C43210w(new TariffCpxConfigureLevelsInternalAction.Loading.NextButtonLoading(((c.d) cVar).f437516a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
