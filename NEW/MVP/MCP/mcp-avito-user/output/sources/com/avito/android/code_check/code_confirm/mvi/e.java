package com.avito.android.code_check.code_confirm.mvi;

import Jo.C14226c;
import Jo.InterfaceC14224a;
import com.avito.android.R;
import com.avito.android.arch.mvi.a;
import com.avito.android.code_check.code_confirm.mvi.entity.CodeConfirmInternalAction;
import com.avito.android.code_check_public.screen.c;
import hD.C40806a;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CodeConfirmActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/code_check/code_confirm/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LJo/a;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "LJo/c;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.avito.android.arch.mvi.a<InterfaceC14224a, CodeConfirmInternalAction, C14226c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c.b f118710a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.code_check.d f118711b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C40806a f118712c;

    @Inject
    public e(@Y61.k c.b bVar, @Y61.k com.avito.android.code_check.d dVar, @Y61.k C40806a c40806a) {
        this.f118710a = bVar;
        this.f118711b = dVar;
        this.f118712c = c40806a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CodeConfirmInternalAction> b(InterfaceC14224a interfaceC14224a, C14226c c14226c) {
        InterfaceC14224a interfaceC14224a2 = interfaceC14224a;
        C14226c c14226c2 = c14226c;
        if (interfaceC14224a2 instanceof InterfaceC14224a.C0541a) {
            return c(((InterfaceC14224a.C0541a) interfaceC14224a2).f9136a);
        }
        if (interfaceC14224a2 instanceof InterfaceC14224a.b) {
            return C43175k.G(new b(c14226c2, this, ((InterfaceC14224a.b) interfaceC14224a2).f9137a, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final C43152f0 c(String str) {
        InterfaceC43160i c43210w;
        com.avito.android.code_check.d dVar = this.f118711b;
        Integer numA = dVar.G5().a();
        String strA = dVar.G3().a();
        c.b bVar = this.f118710a;
        bVar.getClass();
        if (str.length() <= 0) {
            c43210w = new C43210w(CodeConfirmInternalAction.LocalCodeValidationError.f118716b);
        } else if (numA == null || str.length() == numA.intValue()) {
            c43210w = new C43137a0(new c(2, null), new d(bVar.a(str, strA != null ? To.c.a(strA) : null)));
        } else {
            c43210w = new C43210w(new CodeConfirmInternalAction.ServerCodeValidationError(com.avito.android.printable_text.b.c(R.string.code_check_code_length_doesnt_match, new Serializable[0])));
        }
        return new C43152f0(c43210w, new a(3, null));
    }
}
