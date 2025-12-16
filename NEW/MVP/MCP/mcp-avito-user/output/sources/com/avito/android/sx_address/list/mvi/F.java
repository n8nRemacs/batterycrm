package com.avito.android.sx_address.list.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.list.mvi.entity.b;
import com.avito.android.sx_address.list.mvi.entity.c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SxAddressListOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/F;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "Lcom/avito/android/sx_address/list/mvi/entity/c;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class F implements com.avito.android.arch.mvi.t<com.avito.android.sx_address.list.mvi.entity.b, com.avito.android.sx_address.list.mvi.entity.c> {
    @Inject
    public F() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final com.avito.android.sx_address.list.mvi.entity.c b(com.avito.android.sx_address.list.mvi.entity.b bVar) {
        com.avito.android.sx_address.list.mvi.entity.c kVar;
        com.avito.android.sx_address.list.mvi.entity.b bVar2 = bVar;
        if (bVar2 instanceof b.a) {
            return c.a.f293301a;
        }
        if (bVar2 instanceof b.e) {
            return c.C8905c.f293303a;
        }
        if (bVar2 instanceof b.p) {
            kVar = new c.i(((b.p) bVar2).f293296a);
        } else if (bVar2 instanceof b.o) {
            kVar = new c.h(((b.o) bVar2).f293295a);
        } else if (bVar2 instanceof b.f) {
            kVar = new c.j(((b.f) bVar2).f293282a);
        } else if (bVar2 instanceof b.C8904b) {
            kVar = new c.b(((b.C8904b) bVar2).f293278a);
        } else if (bVar2 instanceof b.i) {
            kVar = new c.d(((b.i) bVar2).f293287a);
        } else if (bVar2 instanceof b.j) {
            kVar = new c.e(((b.j) bVar2).f293288a);
        } else if (bVar2 instanceof b.k) {
            kVar = new c.f(((b.k) bVar2).f293289a);
        } else if (bVar2 instanceof b.l) {
            kVar = new c.g(((b.l) bVar2).f293290a);
        } else if (bVar2 instanceof b.s) {
            kVar = new c.l(((b.s) bVar2).f293300a);
        } else {
            if (!(bVar2 instanceof b.r)) {
                return null;
            }
            b.r rVar = (b.r) bVar2;
            kVar = new c.k(rVar.f293298a, rVar.f293299b);
        }
        return kVar;
    }
}
