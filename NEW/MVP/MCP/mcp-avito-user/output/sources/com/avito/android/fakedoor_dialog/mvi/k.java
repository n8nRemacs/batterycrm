package com.avito.android.fakedoor_dialog.mvi;

import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mC.InterfaceC43944b;

/* compiled from: FakeDoorDialogReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/fakedoor_dialog/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "LmC/b;", "LmC/d;", "<init>", "()V", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements u<InterfaceC43944b, mC.d> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final mC.d a(InterfaceC43944b interfaceC43944b, mC.d dVar) {
        InterfaceC43944b interfaceC43944b2 = interfaceC43944b;
        mC.d dVar2 = dVar;
        if (interfaceC43944b2 instanceof InterfaceC43944b.c) {
            return new mC.d(dVar2.f414396b + 1, dVar2.f414397c);
        }
        if (interfaceC43944b2 instanceof InterfaceC43944b.a ? true : interfaceC43944b2 instanceof InterfaceC43944b.C11818b) {
            return dVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
