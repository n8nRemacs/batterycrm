package com.avito.android.tariff_cpt.configure.levels.mvi;

import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff_cpt.configure.levels.mvi.entity.TariffCptConfigureLevelsInternalAction;
import fv.C40482a;
import iC0.C41267a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import qC0.C47281c;
import qC0.InterfaceC47279a;

/* compiled from: TariffCptConfigureLevelsActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "LqC0/a;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction;", "LqC0/c;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements com.avito.android.arch.mvi.a<InterfaceC47279a, TariffCptConfigureLevelsInternalAction, C47281c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_cpt.configure.levels.domain.a f297906a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f297907b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final v50.g f297908c;

    @Inject
    public g(@Y61.k com.avito.android.tariff_cpt.configure.levels.domain.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k v50.g gVar) {
        this.f297906a = aVar;
        this.f297907b = aVar2;
        this.f297908c = gVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(new c(new a(new b(C40482a.b(this.f297907b)))), C43175k.G(new d(this.f297908c.a(), null)), com.avito.android.arch.mvi.utils.h.e(c43197r1, e.f297893l, new f(this, aVar), 1000L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<TariffCptConfigureLevelsInternalAction> b(@Y61.k InterfaceC47279a interfaceC47279a, @Y61.k C47281c c47281c) {
        C43210w c43210w;
        C41267a c41267a;
        if (interfaceC47279a instanceof InterfaceC47279a.g) {
            return this.f297906a.invoke();
        }
        if (interfaceC47279a instanceof InterfaceC47279a.C12313a) {
            c43210w = new C43210w(TariffCptConfigureLevelsInternalAction.Close.f297894b);
        } else {
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (interfaceC47279a instanceof InterfaceC47279a.c) {
                iC0.d dVar = c47281c.f429119b;
                DeepLink deepLink = (dVar == null || (c41267a = dVar.f398443b) == null) ? null : c41267a.f398437b;
                return deepLink == null ? C43175k.w() : new C43210w(new TariffCptConfigureLevelsInternalAction.HandleDeeplink(deepLink, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
            }
            if (!(interfaceC47279a instanceof InterfaceC47279a.e)) {
                if (interfaceC47279a instanceof InterfaceC47279a.b) {
                    if (c47281c.f429122e || c47281c.f429123f) {
                        return C43175k.w();
                    }
                    InterfaceC47279a.b bVar = (InterfaceC47279a.b) interfaceC47279a;
                    return new C43210w(new TariffCptConfigureLevelsInternalAction.HandleDeeplink(bVar.f429105a, bVar.f429106b));
                }
                if (interfaceC47279a instanceof InterfaceC47279a.d) {
                    InterfaceC47279a.d dVar2 = (InterfaceC47279a.d) interfaceC47279a;
                    return new C43210w(new TariffCptConfigureLevelsInternalAction.Loading.LevelButtonLoading(dVar2.f429108a, dVar2.f429109b));
                }
                if (interfaceC47279a instanceof InterfaceC47279a.f) {
                    return new C43210w(new TariffCptConfigureLevelsInternalAction.Loading.NextButtonLoading(((InterfaceC47279a.f) interfaceC47279a).f429111a));
                }
                throw new NoWhenBranchMatchedException();
            }
            C41267a c41267a2 = c47281c.f429121d;
            DeepLink deepLink2 = c41267a2 != null ? c41267a2.f398437b : null;
            if (deepLink2 == null) {
                return C43175k.w();
            }
            c43210w = new C43210w(new TariffCptConfigureLevelsInternalAction.HandleDeeplink(deepLink2, C22777e.b(new Q("cpt_configure_levels_next_button_clicked", Boolean.TRUE))));
        }
        return c43210w;
    }
}
