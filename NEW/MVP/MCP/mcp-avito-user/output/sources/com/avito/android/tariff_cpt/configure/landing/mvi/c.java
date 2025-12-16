package com.avito.android.tariff_cpt.configure.landing.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.tariff_cpt.configure.landing.mvi.entity.TariffCptConfigureLandingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import oC0.C44625c;
import oC0.InterfaceC44623a;

/* compiled from: TariffCptConfigureLandingActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/landing/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LoC0/a;", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction;", "LoC0/c;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC44623a, TariffCptConfigureLandingInternalAction, C44625c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_cpt.configure.landing.domain.a f297772a;

    @Inject
    public c(@Y61.k com.avito.android.tariff_cpt.configure.landing.domain.a aVar) {
        this.f297772a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, a.f297769l, new b(this, aVar), 1000L);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<TariffCptConfigureLandingInternalAction> b(@Y61.k InterfaceC44623a interfaceC44623a, @Y61.k C44625c c44625c) {
        C43210w c43210w;
        DeepLink deeplink;
        if (interfaceC44623a instanceof InterfaceC44623a.C12176a) {
            return new C43210w(TariffCptConfigureLandingInternalAction.Back.f297775b);
        }
        if (interfaceC44623a instanceof InterfaceC44623a.d) {
            return this.f297772a.invoke();
        }
        if (interfaceC44623a instanceof InterfaceC44623a.c) {
            ButtonAction buttonAction = c44625c.f419602f;
            if (buttonAction == null || (deeplink = buttonAction.getDeeplink()) == null) {
                return C43175k.w();
            }
            c43210w = new C43210w(new TariffCptConfigureLandingInternalAction.HandleDeeplink(deeplink));
        } else if (interfaceC44623a instanceof InterfaceC44623a.e) {
            c43210w = new C43210w(new TariffCptConfigureLandingInternalAction.ShowButtonProgress(((InterfaceC44623a.e) interfaceC44623a).f419592a));
        } else {
            if (!(interfaceC44623a instanceof InterfaceC44623a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new TariffCptConfigureLandingInternalAction.HandleDeeplink(((InterfaceC44623a.b) interfaceC44623a).f419589a));
        }
        return c43210w;
    }
}
