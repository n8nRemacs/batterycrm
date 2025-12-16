package com.avito.android.sx_address.selectaddresslist.mvi;

import UA0.b;
import UA0.c;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SelectAddressListOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/mvi/r;", "Lcom/avito/android/arch/mvi/t;", "LUA0/b;", "LUA0/c;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class r implements com.avito.android.arch.mvi.t<UA0.b, UA0.c> {
    @Inject
    public r() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final UA0.c b(UA0.b bVar) {
        UA0.c eVar;
        UA0.b bVar2 = bVar;
        if (bVar2 instanceof b.d) {
            return c.a.f16259a;
        }
        if (bVar2 instanceof b.c) {
            return c.b.f16260a;
        }
        if (bVar2 instanceof b.f) {
            eVar = new c.C1106c(((b.f) bVar2).f16254a);
        } else {
            if (!(bVar2 instanceof b.j)) {
                if (bVar2 instanceof b.g) {
                    return c.d.f16262a;
                }
                return null;
            }
            eVar = new c.e(((b.j) bVar2).f16258a);
        }
        return eVar;
    }
}
