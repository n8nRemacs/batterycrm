package com.avito.android.code_check.phone_request.mvi;

import Ro.InterfaceC15066a;
import com.avito.android.R;
import com.avito.android.arch.mvi.a;
import com.avito.android.code_check.phone_request.mvi.entity.PhoneRequestInternalAction;
import com.avito.android.code_check_public.screen.d;
import com.avito.android.util.C5;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PhoneRequestActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/code_check/phone_request/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LRo/a;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction;", "LRo/c;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC15066a, PhoneRequestInternalAction, Ro.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d.b f119096a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.code_check.d f119097b;

    @Inject
    public c(@Y61.k d.b bVar, @Y61.k com.avito.android.code_check.d dVar) {
        this.f119096a = bVar;
        this.f119097b = dVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PhoneRequestInternalAction> b(InterfaceC15066a interfaceC15066a, Ro.c cVar) {
        InterfaceC15066a interfaceC15066a2 = interfaceC15066a;
        Ro.c cVar2 = cVar;
        if (interfaceC15066a2.equals(InterfaceC15066a.b.f14621a)) {
            return C43175k.G(new a(cVar2, null));
        }
        boolean z12 = interfaceC15066a2 instanceof InterfaceC15066a.c;
        com.avito.android.code_check.d dVar = this.f119097b;
        d.b bVar = this.f119096a;
        if (!z12) {
            if (!(interfaceC15066a2 instanceof InterfaceC15066a.C0978a)) {
                throw new NoWhenBranchMatchedException();
            }
            return f.a(bVar.b(), dVar);
        }
        String str = ((InterfaceC15066a.c) interfaceC15066a2).f14622a;
        if (str != null) {
            bVar.getClass();
            if (!C5.f318568b.e(str)) {
                return new C43210w(new PhoneRequestInternalAction.PhoneValidationError(com.avito.android.printable_text.b.c(R.string.empty_input_error, new Serializable[0])));
            }
        }
        return new C43137a0(new b(2, null), f.a(bVar.c(str), dVar));
    }
}
