package com.avito.android.tariff.cpr.configure.advance.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpr.configure.advance.items.reviews.x;
import com.avito.android.tariff.cpr.configure.advance.mvi.entity.CprConfigureAdvanceInternalAction;
import gB0.C40568c;
import gB0.InterfaceC40566a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CprConfigureAdvanceActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LgB0/a;", "Lcom/avito/android/tariff/cpr/configure/advance/mvi/entity/CprConfigureAdvanceInternalAction;", "LgB0/c;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC40566a, CprConfigureAdvanceInternalAction, C40568c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpr.configure.advance.mvi.domain.a f295450a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f295451b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final v50.g f295452c;

    @Inject
    public d(@Y61.k com.avito.android.tariff.cpr.configure.advance.mvi.domain.a aVar, @Y61.k @com.avito.android.tariff.cpr.configure.advance.di.a String str, @Y61.k v50.g gVar) {
        this.f295450a = aVar;
        this.f295451b = str;
        this.f295452c = gVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.G(new a(this.f295452c.a(), null)), com.avito.android.arch.mvi.utils.h.e(c43197r1, b.f295447l, new c(this, aVar), 1000L));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<CprConfigureAdvanceInternalAction> b(@Y61.k InterfaceC40566a interfaceC40566a, @Y61.k C40568c c40568c) {
        if (interfaceC40566a instanceof InterfaceC40566a.d) {
            return (InterfaceC43160i) this.f295450a.invoke(this.f295451b);
        }
        if (interfaceC40566a instanceof InterfaceC40566a.C11194a) {
            return new C43210w(CprConfigureAdvanceInternalAction.Close.f295464b);
        }
        if (interfaceC40566a instanceof InterfaceC40566a.b) {
            return new C43210w(new CprConfigureAdvanceInternalAction.HandleDeeplink(((InterfaceC40566a.b) interfaceC40566a).f396365a, c40568c.f396377e));
        }
        if (!(interfaceC40566a instanceof InterfaceC40566a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        x xVar = ((InterfaceC40566a.c) interfaceC40566a).f396366a;
        if (xVar instanceof x.a) {
            return new C43210w(new CprConfigureAdvanceInternalAction.HandleDeeplink(((x.a) xVar).f295320b, null));
        }
        if (xVar instanceof x.b) {
            return new C43210w(new CprConfigureAdvanceInternalAction.SelectAdvance(((x.b) xVar).f295323c));
        }
        throw new NoWhenBranchMatchedException();
    }
}
