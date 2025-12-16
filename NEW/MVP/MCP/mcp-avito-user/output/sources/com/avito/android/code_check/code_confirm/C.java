package com.avito.android.code_check.code_confirm;

import Jo.C14226c;
import Jo.C14227d;
import Jo.InterfaceC14228e;
import Jo.InterfaceC14229f;
import Ko.InterfaceC14336b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CodeConfirmViewStateMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check/code_confirm/C;", "", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class C {
    @Inject
    public C() {
    }

    @Y61.k
    public static C14227d a(@Y61.k Ro.c cVar, @Y61.k C14226c c14226c, @Y61.k InterfaceC14336b interfaceC14336b) {
        InterfaceC14229f cVar2;
        boolean z12 = cVar.f14631b;
        boolean z13 = c14226c.f9149c;
        boolean z14 = (z12 || z13) ? false : true;
        if (interfaceC14336b.equals(InterfaceC14336b.a.f9655a)) {
            cVar2 = z12 ? InterfaceC14229f.b.f9157a : InterfaceC14229f.a.f9156a;
        } else {
            if (!(interfaceC14336b instanceof InterfaceC14336b.C0597b)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar2 = new InterfaceC14229f.c(((InterfaceC14336b.C0597b) interfaceC14336b).f9656a);
        }
        return new C14227d(c14226c.f9148b, z14, z13 ? InterfaceC14228e.b.f9155a : InterfaceC14228e.a.f9154a, cVar2);
    }
}
