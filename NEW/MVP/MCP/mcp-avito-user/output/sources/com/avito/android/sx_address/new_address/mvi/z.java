package com.avito.android.sx_address.new_address.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.new_address.mvi.B;
import com.avito.android.sx_address.new_address.mvi.C;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SxNewAddressMviEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/z;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "Lcom/avito/android/sx_address/new_address/mvi/C;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class z implements com.avito.android.arch.mvi.t<B, C> {
    @Inject
    public z() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final C b(B b12) {
        B b13 = b12;
        if (b13 instanceof B.i) {
            return new C.b(((B.i) b13).f293686a.f293715c);
        }
        if (b13 instanceof B.r) {
            B.r rVar = (B.r) b13;
            return new C.e(rVar.f293696a, rVar.f293697b);
        }
        if (b13 instanceof B.f) {
            return new C.d(((B.f) b13).f293683a);
        }
        if (b13 instanceof B.m) {
            return new C.g(((B.m) b13).f293690a);
        }
        if (b13 instanceof B.c) {
            return C.a.f293699a;
        }
        if (b13 instanceof B.k) {
            return new C.c(((B.k) b13).f293688a);
        }
        if (b13 instanceof B.q) {
            return new C.i(((B.q) b13).f293695a);
        }
        if (!(b13 instanceof B.p)) {
            return null;
        }
        B.p pVar = (B.p) b13;
        return new C.h(pVar.f293693a, pVar.f293694b);
    }
}
