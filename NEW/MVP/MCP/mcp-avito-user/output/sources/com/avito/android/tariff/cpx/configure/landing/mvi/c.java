package com.avito.android.tariff.cpx.configure.landing.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.tariff.cpx.configure.landing.mvi.entity.CpxConfigureLandingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import qB0.C47270a;
import qB0.C47271b;
import qB0.C47274e;
import qB0.InterfaceC47272c;

/* compiled from: CpxConfigureLandingActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LqB0/c;", "Lcom/avito/android/tariff/cpx/configure/landing/mvi/entity/CpxConfigureLandingInternalAction;", "LqB0/e;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC47272c, CpxConfigureLandingInternalAction, C47274e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpx.configure.landing.mvi.domain.a f296014a;

    @Inject
    public c(@Y61.k com.avito.android.tariff.cpx.configure.landing.mvi.domain.a aVar) {
        this.f296014a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, a.f296011l, new b(this, aVar), 1000L);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<CpxConfigureLandingInternalAction> b(@Y61.k InterfaceC47272c interfaceC47272c, @Y61.k C47274e c47274e) {
        DeepLink deeplink;
        C47271b c47271b;
        DeepLink deepLink;
        if (interfaceC47272c instanceof InterfaceC47272c.f) {
            return this.f296014a.execute();
        }
        if (interfaceC47272c instanceof InterfaceC47272c.d) {
            return new C43210w(CpxConfigureLandingInternalAction.Close.f296026b);
        }
        if (interfaceC47272c instanceof InterfaceC47272c.a) {
            C47270a c47270a = c47274e.f429100f;
            return (c47270a == null || (c47271b = c47270a.f429083b) == null || (deepLink = c47271b.f429085b) == null) ? C43175k.w() : new C43210w(new CpxConfigureLandingInternalAction.HandleDeeplink(deepLink));
        }
        if (interfaceC47272c instanceof InterfaceC47272c.b) {
            ButtonAction buttonAction = c47274e.f429097c;
            return (buttonAction == null || (deeplink = buttonAction.getDeeplink()) == null) ? C43175k.w() : new C43210w(new CpxConfigureLandingInternalAction.HandleDeeplink(deeplink));
        }
        if (interfaceC47272c instanceof InterfaceC47272c.e) {
            return new C43210w(new CpxConfigureLandingInternalAction.HandleDeeplink(((InterfaceC47272c.e) interfaceC47272c).f429090a));
        }
        if (interfaceC47272c instanceof InterfaceC47272c.C12312c) {
            return new C43210w(new CpxConfigureLandingInternalAction.OnAccordionClicked(((InterfaceC47272c.C12312c) interfaceC47272c).f429088a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
