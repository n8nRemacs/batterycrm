package com.avito.android.auto_select.booking.mvi;

import androidx.compose.runtime.internal.P;
import cf.InterfaceC27185b;
import cf.c;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoSelectBookingOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_select/booking/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcf/b;", "Lcf/c;", "<init>", "()V", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements t<InterfaceC27185b, cf.c> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final cf.c b(InterfaceC27185b interfaceC27185b) {
        InterfaceC27185b interfaceC27185b2 = interfaceC27185b;
        if (interfaceC27185b2 instanceof InterfaceC27185b.a) {
            DeepLink deepLink = ((InterfaceC27185b.a) interfaceC27185b2).f58068a.f57317a;
            if (deepLink != null) {
                return new c.b(deepLink);
            }
            return null;
        }
        if (interfaceC27185b2 instanceof InterfaceC27185b.C2053b) {
            return new c.a(((InterfaceC27185b.C2053b) interfaceC27185b2).f58069a);
        }
        if (interfaceC27185b2 instanceof InterfaceC27185b.d) {
            return new c.C2054c(((InterfaceC27185b.d) interfaceC27185b2).f58074c);
        }
        return null;
    }
}
