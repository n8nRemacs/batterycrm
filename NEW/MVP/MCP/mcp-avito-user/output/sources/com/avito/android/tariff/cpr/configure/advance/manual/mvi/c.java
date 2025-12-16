package com.avito.android.tariff.cpr.configure.advance.manual.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.tariff.cpr.configure.advance.manual.mvi.entity.CprConfigureAdvanceManualInternalAction;
import eB0.C39985a;
import fB0.InterfaceC40274a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CprConfigureAdvanceManualActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LfB0/a;", "Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction;", "LfB0/c;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC40274a, CprConfigureAdvanceManualInternalAction, fB0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpr.configure.advance.manual.mvi.domain.a f295405a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final v50.g f295406b;

    @Inject
    public c(@Y61.k com.avito.android.tariff.cpr.configure.advance.manual.mvi.domain.a aVar, @Y61.k v50.g gVar) {
        this.f295405a = aVar;
        this.f295406b = gVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.G(new a(this.f295406b.a(), null)), C43175k.C(new b(this, aVar, null), c43197r1));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<CprConfigureAdvanceManualInternalAction> b(@Y61.k InterfaceC40274a interfaceC40274a, @Y61.k fB0.c cVar) {
        Object handleDeeplink;
        if (interfaceC40274a instanceof InterfaceC40274a.c) {
            return (InterfaceC43160i) this.f295405a.invoke();
        }
        if (!(interfaceC40274a instanceof InterfaceC40274a.C11134a)) {
            if (interfaceC40274a instanceof InterfaceC40274a.b) {
                return new C43210w(new CprConfigureAdvanceManualInternalAction.InputChange(((InterfaceC40274a.b) interfaceC40274a).f395770a));
            }
            throw new NoWhenBranchMatchedException();
        }
        String str = cVar.f395781f;
        Float fX02 = C43066x.x0(str);
        C39985a c39985a = cVar.f395777b;
        float f12 = c39985a != null ? c39985a.f395046a : 0.0f;
        if (fX02 == null || fX02.floatValue() < f12) {
            handleDeeplink = CprConfigureAdvanceManualInternalAction.InvalidValue.f295425b;
        } else {
            ButtonAction buttonAction = cVar.f395779d;
            handleDeeplink = new CprConfigureAdvanceManualInternalAction.HandleDeeplink(buttonAction != null ? buttonAction.getDeeplink() : null, str);
        }
        return new C43210w(handleDeeplink);
    }
}
