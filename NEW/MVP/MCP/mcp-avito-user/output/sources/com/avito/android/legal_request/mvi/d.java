package com.avito.android.legal_request.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.legal_request.mvi.entity.LegalRequestInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import sR.C48100c;
import sR.InterfaceC48098a;

/* compiled from: LegalRequestActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/legal_request/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LsR/a;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction;", "LsR/c;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC48098a, LegalRequestInternalAction, C48100c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f175265a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ZS.b f175266b;

    @Inject
    public d(@Y61.k String str, @Y61.k ZS.b bVar) {
        this.f175265a = str;
        this.f175266b = bVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<LegalRequestInternalAction> b(InterfaceC48098a interfaceC48098a, C48100c c48100c) {
        InterfaceC48098a interfaceC48098a2 = interfaceC48098a;
        if (interfaceC48098a2 instanceof InterfaceC48098a.f) {
            InterfaceC48098a.f fVar = (InterfaceC48098a.f) interfaceC48098a2;
            if (fVar instanceof InterfaceC48098a.C12616a) {
                return C43175k.G(new a(2, null));
            }
            if (fVar instanceof InterfaceC48098a.c) {
                return C43175k.G(new b(this, null));
            }
            if (fVar instanceof InterfaceC48098a.d) {
                return C43175k.G(new c(fVar, this, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(interfaceC48098a2 instanceof InterfaceC48098a.e)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC48098a.e eVar = (InterfaceC48098a.e) interfaceC48098a2;
        if (eVar instanceof InterfaceC48098a.b) {
            return new C43210w(new LegalRequestInternalAction.HandleBeduinEvent(((InterfaceC48098a.b) eVar).f437648a));
        }
        if (eVar instanceof InterfaceC48098a.g) {
            return new C43210w(new LegalRequestInternalAction.HandleBeduinState(((InterfaceC48098a.g) eVar).f437650a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
