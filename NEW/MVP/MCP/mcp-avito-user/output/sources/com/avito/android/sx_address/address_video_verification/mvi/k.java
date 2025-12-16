package com.avito.android.sx_address.address_video_verification.mvi;

import BA0.b;
import BA0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SxAddressVideoVerificationOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "LBA0/b;", "LBA0/c;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements t<BA0.b, BA0.c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final BA0.c b(BA0.b bVar) {
        BA0.c dVar;
        BA0.b bVar2 = bVar;
        if (bVar2.equals(b.a.f1213a)) {
            return c.a.f1224a;
        }
        if (bVar2.equals(b.d.f1216a)) {
            return c.C0044c.f1226a;
        }
        if (bVar2 instanceof b.c) {
            dVar = new c.b(((b.c) bVar2).f1215a);
        } else if (bVar2 instanceof b.i) {
            dVar = new c.e(((b.i) bVar2).f1221a);
        } else {
            if (!(bVar2 instanceof b.f)) {
                if (bVar2.equals(b.g.f1219a) ? true : bVar2 instanceof b.e ? true : bVar2 instanceof b.k ? true : bVar2 instanceof b.j ? true : bVar2 instanceof b.h ? true : bVar2.equals(b.C0043b.f1214a)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            dVar = new c.d(((b.f) bVar2).f1218a);
        }
        return dVar;
    }
}
