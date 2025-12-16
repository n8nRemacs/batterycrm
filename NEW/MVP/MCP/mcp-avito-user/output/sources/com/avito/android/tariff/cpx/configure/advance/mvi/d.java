package com.avito.android.tariff.cpx.configure.advance.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.tariff.cpx.configure.advance.mvi.entity.CpxConfigureAdvanceInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import mB0.InterfaceC43942a;

/* compiled from: CpxConfigureAdvanceActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LmB0/a;", "Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction;", "LmB0/e;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC43942a, CpxConfigureAdvanceInternalAction, mB0.e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpx.configure.advance.domain.d f295743a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final v50.g f295744b;

    @Inject
    public d(@Y61.k com.avito.android.tariff.cpx.configure.advance.domain.d dVar, @Y61.k v50.g gVar) {
        this.f295743a = dVar;
        this.f295744b = gVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.G(new a(this.f295744b.a(), null)), com.avito.android.arch.mvi.utils.h.e(c43197r1, b.f295740l, new c(this, aVar), 1000L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<CpxConfigureAdvanceInternalAction> b(@Y61.k InterfaceC43942a interfaceC43942a, @Y61.k mB0.e eVar) {
        C43210w c43210w;
        mB0.c cVar;
        if (interfaceC43942a instanceof InterfaceC43942a.f) {
            return this.f295743a.invoke();
        }
        if (interfaceC43942a instanceof InterfaceC43942a.b) {
            c43210w = new C43210w(CpxConfigureAdvanceInternalAction.Close.f295748b);
        } else {
            if (interfaceC43942a instanceof InterfaceC43942a.C11816a) {
                return new C43210w(new CpxConfigureAdvanceInternalAction.AdvanceChanges(((InterfaceC43942a.C11816a) interfaceC43942a).f414364a));
            }
            boolean z12 = interfaceC43942a instanceof InterfaceC43942a.h;
            boolean z13 = eVar.f414389i;
            int i12 = 2;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            if (z12) {
                return !z13 ? new C43210w(new CpxConfigureAdvanceInternalAction.HandleDeepLink(((InterfaceC43942a.h) interfaceC43942a).f414371a, objArr8 == true ? 1 : 0, i12, objArr7 == true ? 1 : 0)) : C43175k.w();
            }
            if (interfaceC43942a instanceof InterfaceC43942a.c) {
                return !z13 ? new C43210w(new CpxConfigureAdvanceInternalAction.HandleDeepLink(((InterfaceC43942a.c) interfaceC43942a).f414366a, objArr6 == true ? 1 : 0, i12, objArr5 == true ? 1 : 0)) : C43175k.w();
            }
            if (interfaceC43942a instanceof InterfaceC43942a.g) {
                return new C43210w(new CpxConfigureAdvanceInternalAction.SaveStatusChanges(((InterfaceC43942a.g) interfaceC43942a).f414370a));
            }
            if (interfaceC43942a instanceof InterfaceC43942a.e) {
                if (z13) {
                    return C43175k.w();
                }
                ButtonAction buttonAction = eVar.f414385e;
                c43210w = new C43210w(new CpxConfigureAdvanceInternalAction.HandleDeepLink(buttonAction != null ? buttonAction.getDeeplink() : null, eVar.f414384d));
            } else if (interfaceC43942a instanceof InterfaceC43942a.i) {
                if (z13) {
                    return C43175k.w();
                }
                ButtonAction buttonAction2 = eVar.f414386f;
                c43210w = new C43210w(new CpxConfigureAdvanceInternalAction.HandleDeepLink(buttonAction2 != null ? buttonAction2.getDeeplink() : null, objArr4 == true ? 1 : 0, i12, objArr3 == true ? 1 : 0));
            } else {
                if (!(interfaceC43942a instanceof InterfaceC43942a.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z13) {
                    return C43175k.w();
                }
                mB0.b bVar = eVar.f414382b;
                c43210w = new C43210w(new CpxConfigureAdvanceInternalAction.HandleDeepLink((bVar == null || (cVar = bVar.f414374b) == null) ? null : cVar.f414376b, objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0));
            }
        }
        return c43210w;
    }
}
