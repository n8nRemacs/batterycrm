package com.avito.android.edit_text_field.mvi;

import Ay.InterfaceC13104b;
import Ay.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EditTextFieldReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/edit_text_field/mvi/h;", "Lcom/avito/android/arch/mvi/u;", "LAy/b;", "LAy/d;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements u<InterfaceC13104b, Ay.d> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Ay.d a(InterfaceC13104b interfaceC13104b, Ay.d dVar) {
        InterfaceC13104b interfaceC13104b2 = interfaceC13104b;
        Ay.d dVar2 = dVar;
        if (interfaceC13104b2 instanceof InterfaceC13104b.d) {
            return Ay.d.a(dVar2, ((InterfaceC13104b.d) interfaceC13104b2).f745a, false, null, null, null, null, 54);
        }
        if (interfaceC13104b2 instanceof InterfaceC13104b.g) {
            return Ay.d.a(dVar2, null, true, null, null, null, null, 57);
        }
        if (interfaceC13104b2 instanceof InterfaceC13104b.e) {
            return Ay.d.a(dVar2, null, false, new d.b(null), null, null, null, 57);
        }
        if (interfaceC13104b2 instanceof InterfaceC13104b.f) {
            return Ay.d.a(dVar2, null, false, new d.b(((InterfaceC13104b.f) interfaceC13104b2).f748a), null, null, null, 57);
        }
        if (interfaceC13104b2 instanceof InterfaceC13104b.j) {
            return Ay.d.a(dVar2, null, false, null, ((InterfaceC13104b.j) interfaceC13104b2).f752a, null, null, 55);
        }
        if (interfaceC13104b2 instanceof InterfaceC13104b.h) {
            return Ay.d.a(dVar2, null, false, null, null, ((InterfaceC13104b.h) interfaceC13104b2).f750a, null, 45);
        }
        if (interfaceC13104b2 instanceof InterfaceC13104b.C0032b) {
            return Ay.d.a(dVar2, null, false, null, null, null, null, 47);
        }
        if (interfaceC13104b2 instanceof InterfaceC13104b.i) {
            return Ay.d.a(dVar2, null, false, null, null, null, ((InterfaceC13104b.i) interfaceC13104b2).f751a, 31);
        }
        if (interfaceC13104b2 instanceof InterfaceC13104b.c) {
            return Ay.d.a(dVar2, null, false, null, null, null, null, 31);
        }
        if (interfaceC13104b2 instanceof InterfaceC13104b.a) {
            return Ay.d.a(dVar2, null, false, null, null, null, null, 61);
        }
        throw new NoWhenBranchMatchedException();
    }
}
