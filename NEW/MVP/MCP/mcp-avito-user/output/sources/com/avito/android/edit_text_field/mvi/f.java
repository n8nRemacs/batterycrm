package com.avito.android.edit_text_field.mvi;

import Ay.InterfaceC13104b;
import Ay.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EditTextFieldOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/edit_text_field/mvi/f;", "Lcom/avito/android/arch/mvi/t;", "LAy/b;", "LAy/c;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements t<InterfaceC13104b, Ay.c> {
    @Inject
    public f() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Ay.c b(InterfaceC13104b interfaceC13104b) {
        InterfaceC13104b interfaceC13104b2 = interfaceC13104b;
        if (interfaceC13104b2 instanceof InterfaceC13104b.e) {
            InterfaceC13104b.e eVar = (InterfaceC13104b.e) interfaceC13104b2;
            return new c.b(eVar.f746a, eVar.f747b);
        }
        if (interfaceC13104b2 instanceof InterfaceC13104b.a) {
            return new c.a(((InterfaceC13104b.a) interfaceC13104b2).f742a);
        }
        if (interfaceC13104b2 instanceof InterfaceC13104b.d ? true : interfaceC13104b2 instanceof InterfaceC13104b.f ? true : interfaceC13104b2 instanceof InterfaceC13104b.g ? true : interfaceC13104b2 instanceof InterfaceC13104b.j ? true : interfaceC13104b2 instanceof InterfaceC13104b.i ? true : interfaceC13104b2 instanceof InterfaceC13104b.c ? true : interfaceC13104b2 instanceof InterfaceC13104b.h ? true : interfaceC13104b2 instanceof InterfaceC13104b.C0032b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
