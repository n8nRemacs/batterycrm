package com.avito.android.publish.scanner_v2.vinscanner.mvi;

import De0.InterfaceC13391b;
import De0.InterfaceC13392c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VinScannerOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/scanner_v2/vinscanner/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "LDe0/b;", "LDe0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements t<InterfaceC13391b, InterfaceC13392c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13392c b(InterfaceC13391b interfaceC13391b) {
        InterfaceC13391b interfaceC13391b2 = interfaceC13391b;
        if (interfaceC13391b2 instanceof InterfaceC13391b.d) {
            return InterfaceC13392c.d.f3333a;
        }
        if (interfaceC13391b2 instanceof InterfaceC13391b.e) {
            return InterfaceC13392c.C0178c.f3332a;
        }
        if (interfaceC13391b2 instanceof InterfaceC13391b.a) {
            return InterfaceC13392c.a.f3330a;
        }
        if (interfaceC13391b2 instanceof InterfaceC13391b.C0177b) {
            return InterfaceC13392c.b.f3331a;
        }
        if (interfaceC13391b2 instanceof InterfaceC13391b.h) {
            return new InterfaceC13392c.e(((InterfaceC13391b.h) interfaceC13391b2).f3327a);
        }
        return null;
    }
}
