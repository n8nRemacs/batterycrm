package com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ub0.C49016d;
import ub0.InterfaceC49014b;

/* compiled from: DeleteDeviceBottomSheetReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/delete_device_bottomsheet/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lub0/b;", "Lub0/d;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements u<InterfaceC49014b, C49016d> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C49016d a(InterfaceC49014b interfaceC49014b, C49016d c49016d) {
        InterfaceC49014b interfaceC49014b2 = interfaceC49014b;
        C49016d c49016d2 = c49016d;
        if (interfaceC49014b2 instanceof InterfaceC49014b.c) {
            return C49016d.a(c49016d2, Integer.valueOf(((InterfaceC49014b.c) interfaceC49014b2).f440111a), false, 11);
        }
        if (interfaceC49014b2 instanceof InterfaceC49014b.e) {
            return C49016d.a(c49016d2, null, true, 7);
        }
        if (interfaceC49014b2 instanceof InterfaceC49014b.a) {
            return C49016d.a(c49016d2, null, false, 7);
        }
        if (interfaceC49014b2 instanceof InterfaceC49014b.C12722b ? true : interfaceC49014b2 instanceof InterfaceC49014b.d) {
            return c49016d2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
