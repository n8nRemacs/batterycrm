package com.avito.android.service_booking_user_profile.view.mvi;

import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.error.z;
import com.avito.android.remote.error.ApiError;
import eu0.InterfaceC40159b;
import eu0.InterfaceC40160c;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ServiceBookingBlockEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Leu0/c;", "Leu0/b;", "<init>", "()V", "_avito_service-booking-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements t<InterfaceC40160c, InterfaceC40159b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40159b b(InterfaceC40160c interfaceC40160c) {
        InterfaceC40160c interfaceC40160c2 = interfaceC40160c;
        if (interfaceC40160c2 instanceof InterfaceC40160c.a) {
            InterfaceC40160c.a aVar = (InterfaceC40160c.a) interfaceC40160c2;
            ApiError apiError = aVar.f395436a;
            String strI = apiError != null ? z.i(apiError) : null;
            return new InterfaceC40159b.C11112b(strI != null ? com.avito.android.printable_text.b.f(strI) : com.avito.android.printable_text.b.c(R.string.service_booking_user_profile_block_error, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.service_booking_user_profile_block_error_retry, new Serializable[0]), apiError, aVar.f395437b);
        }
        if (interfaceC40160c2 instanceof InterfaceC40160c.f) {
            return new InterfaceC40159b.a(((InterfaceC40160c.f) interfaceC40160c2).f395442a);
        }
        if (interfaceC40160c2 instanceof InterfaceC40160c.b ? true : interfaceC40160c2 instanceof InterfaceC40160c.C11113c ? true : interfaceC40160c2 instanceof InterfaceC40160c.d ? true : interfaceC40160c2 instanceof InterfaceC40160c.e ? true : interfaceC40160c2 instanceof InterfaceC40160c.g) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
