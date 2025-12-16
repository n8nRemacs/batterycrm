package com.avito.android.auto_select.booking.mvi;

import androidx.compose.runtime.internal.P;
import cf.InterfaceC27185b;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoSelectBookingReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_select/booking/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcf/b;", "Lcf/d;", "<init>", "()V", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements u<InterfaceC27185b, cf.d> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final cf.d a(InterfaceC27185b interfaceC27185b, cf.d dVar) {
        InterfaceC27185b interfaceC27185b2 = interfaceC27185b;
        cf.d dVar2 = dVar;
        if (!(interfaceC27185b2 instanceof InterfaceC27185b.c)) {
            return interfaceC27185b2 instanceof InterfaceC27185b.e ? cf.d.a(dVar2, true) : interfaceC27185b2 instanceof InterfaceC27185b.a ? cf.d.a(dVar2, false) : interfaceC27185b2 instanceof InterfaceC27185b.d ? cf.d.a(dVar2, false) : dVar2;
        }
        InterfaceC27185b.c cVar = (InterfaceC27185b.c) interfaceC27185b2;
        return new cf.d(cVar.f58070a, cVar.f58071b, false);
    }
}
