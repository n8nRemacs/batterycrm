package com.avito.android.tariff_lf_constructor.configure.landing.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.tariff_lf_constructor.configure.landing.mvi.entity.ConstructorLandingInternalAction;
import fv.C40482a;
import jD0.C42238c;
import jD0.InterfaceC42236a;
import javax.inject.Inject;
import kD0.C42572a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ConstructorLandingActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LjD0/a;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction;", "LjD0/c;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC42236a, ConstructorLandingInternalAction, C42238c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.landing.domain.a f299714a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f299715b;

    @Inject
    public d(@Y61.k com.avito.android.tariff_lf_constructor.configure.landing.domain.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f299714a = aVar;
        this.f299715b = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.G(new a(C40482a.b(this.f299715b), null)), com.avito.android.arch.mvi.utils.h.e(c43197r1, b.f299711l, new c(this, aVar), 1000L));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<ConstructorLandingInternalAction> b(@Y61.k InterfaceC42236a interfaceC42236a, @Y61.k C42238c c42238c) {
        ButtonAction buttonAction;
        DeepLink deeplink;
        if (interfaceC42236a instanceof InterfaceC42236a.b) {
            return this.f299714a.a();
        }
        if (!(interfaceC42236a instanceof InterfaceC42236a.C11553a)) {
            throw new NoWhenBranchMatchedException();
        }
        C42572a c42572a = c42238c.f405521c;
        return (c42572a == null || (buttonAction = c42572a.f406204b) == null || (deeplink = buttonAction.getDeeplink()) == null) ? C43175k.w() : new C43210w(new ConstructorLandingInternalAction.ContinueButtonClick(deeplink));
    }
}
