package com.avito.android.tariff.cpx.info.advance.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import tB0.InterfaceC48531b;
import tB0.InterfaceC48532c;

/* compiled from: TariffCpxInfoAdvanceOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/info/advance/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "LtB0/b;", "LtB0/c;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements t<InterfaceC48531b, InterfaceC48532c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC48532c b(InterfaceC48531b interfaceC48531b) {
        InterfaceC48531b interfaceC48531b2 = interfaceC48531b;
        if (interfaceC48531b2 instanceof InterfaceC48531b.d) {
            InterfaceC48531b.d dVar = (InterfaceC48531b.d) interfaceC48531b2;
            return new InterfaceC48532c.b(dVar.f439190a, dVar.f439191b);
        }
        if (interfaceC48531b2 instanceof InterfaceC48531b.C12663b) {
            return new InterfaceC48532c.a(((InterfaceC48531b.C12663b) interfaceC48531b2).f439188a);
        }
        return null;
    }
}
