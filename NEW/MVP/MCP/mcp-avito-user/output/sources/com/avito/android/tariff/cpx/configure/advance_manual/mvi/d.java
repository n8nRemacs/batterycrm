package com.avito.android.tariff.cpx.configure.advance_manual.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.tariff.cpx.configure.advance_manual.mvi.entity.CpxConfigureAdvanceManualInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import oB0.InterfaceC44620a;
import oB0.c;

/* compiled from: CpxConfigureAdvanceManualActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LoB0/a;", "Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction;", "LoB0/c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC44620a, CpxConfigureAdvanceManualInternalAction, oB0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final v50.g f295837a;

    @Inject
    public d(@Y61.k v50.g gVar) {
        this.f295837a = gVar;
    }

    @Y61.k
    public static InterfaceC43160i c(@Y61.k InterfaceC44620a interfaceC44620a, @Y61.k oB0.c cVar) {
        if (interfaceC44620a instanceof InterfaceC44620a.C12172a) {
            return new C43210w(new CpxConfigureAdvanceManualInternalAction.InputChange(((InterfaceC44620a.C12172a) interfaceC44620a).f419551a));
        }
        if (!(interfaceC44620a instanceof InterfaceC44620a.b)) {
            if (interfaceC44620a instanceof InterfaceC44620a.c) {
                return new C43210w(new CpxConfigureAdvanceManualInternalAction.SaveStatusChanges(((InterfaceC44620a.c) interfaceC44620a).f419553a));
            }
            throw new NoWhenBranchMatchedException();
        }
        c.InterfaceC12174c interfaceC12174c = cVar.f419562e;
        if ((interfaceC12174c instanceof c.InterfaceC12174c.a) || (interfaceC12174c instanceof c.InterfaceC12174c.b)) {
            return new C43210w(CpxConfigureAdvanceManualInternalAction.InvalidAdvance.f295844b);
        }
        if (cVar.f419565h) {
            return C43175k.w();
        }
        ButtonAction buttonAction = cVar.f419563f;
        return new C43210w(new CpxConfigureAdvanceManualInternalAction.HandleRequestDeepLink(buttonAction != null ? buttonAction.getDeeplink() : null, interfaceC12174c != null ? interfaceC12174c.getF419578a() : null));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.G(new a(this.f295837a.a(), null)), com.avito.android.arch.mvi.utils.h.e(c43197r1, b.f295834l, new c(this, aVar), 1000L));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<CpxConfigureAdvanceManualInternalAction> b(InterfaceC44620a interfaceC44620a, oB0.c cVar) {
        return c(interfaceC44620a, cVar);
    }
}
