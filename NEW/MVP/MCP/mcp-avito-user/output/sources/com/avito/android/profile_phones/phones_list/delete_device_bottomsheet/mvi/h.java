package com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.util.InterfaceC35741a1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ub0.InterfaceC49014b;
import ub0.InterfaceC49015c;

/* compiled from: DeleteDeviceBottomSheetOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/delete_device_bottomsheet/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lub0/b;", "Lub0/c;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements t<InterfaceC49014b, InterfaceC49015c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f227614b;

    @Inject
    public h(@Y61.k InterfaceC35741a1 interfaceC35741a1) {
        this.f227614b = interfaceC35741a1;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49015c b(InterfaceC49014b interfaceC49014b) {
        InterfaceC49014b interfaceC49014b2 = interfaceC49014b;
        if (interfaceC49014b2 instanceof InterfaceC49014b.d) {
            return new InterfaceC49015c.b(((InterfaceC49014b.d) interfaceC49014b2).f440112a);
        }
        if (interfaceC49014b2 instanceof InterfaceC49014b.a) {
            return new InterfaceC49015c.C12723c(InterfaceC35741a1.a.a(this.f227614b, ((InterfaceC49014b.a) interfaceC49014b2).f440109a, null, null, 6));
        }
        if (interfaceC49014b2 instanceof InterfaceC49014b.C12722b) {
            return new InterfaceC49015c.a(((InterfaceC49014b.C12722b) interfaceC49014b2).f440110a);
        }
        if (interfaceC49014b2 instanceof InterfaceC49014b.c ? true : interfaceC49014b2.equals(InterfaceC49014b.e.f440113a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
