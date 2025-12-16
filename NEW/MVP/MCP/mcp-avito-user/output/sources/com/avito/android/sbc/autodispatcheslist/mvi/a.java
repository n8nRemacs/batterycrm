package com.avito.android.sbc.autodispatcheslist.mvi;

import Ro0.InterfaceC15068b;
import Ro0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SbcAutoDispatchListOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/mvi/a;", "Lcom/avito/android/arch/mvi/t;", "LRo0/c;", "LRo0/b;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements t<Ro0.c, InterfaceC15068b> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC15068b b(Ro0.c cVar) {
        Ro0.c cVar2 = cVar;
        if (cVar2 instanceof c.f) {
            return InterfaceC15068b.C0981b.f14639a;
        }
        if (cVar2 instanceof c.b) {
            return new InterfaceC15068b.a(((c.b) cVar2).f14642a);
        }
        return null;
    }
}
