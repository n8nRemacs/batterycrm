package com.avito.android.publish.scanner.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ze0.InterfaceC50554b;
import ze0.InterfaceC50555c;

/* compiled from: ScannerOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/scanner/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lze0/b;", "Lze0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements t<InterfaceC50554b, InterfaceC50555c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC50555c b(InterfaceC50554b interfaceC50554b) {
        InterfaceC50554b interfaceC50554b2 = interfaceC50554b;
        if (interfaceC50554b2 instanceof InterfaceC50554b.d) {
            InterfaceC50554b.d dVar = (InterfaceC50554b.d) interfaceC50554b2;
            return new InterfaceC50555c.b(dVar.f444119b, dVar.f444118a);
        }
        if (interfaceC50554b2 instanceof InterfaceC50554b.c) {
            return new InterfaceC50555c.C12963c(((InterfaceC50554b.c) interfaceC50554b2).f444117a);
        }
        if (interfaceC50554b2.equals(InterfaceC50554b.a.f444115a)) {
            return InterfaceC50555c.a.f444123a;
        }
        if (interfaceC50554b2.equals(InterfaceC50554b.C12962b.f444116a)) {
            return InterfaceC50555c.a.f444123a;
        }
        if (interfaceC50554b2 instanceof InterfaceC50554b.e) {
            return new InterfaceC50555c.d(((InterfaceC50554b.e) interfaceC50554b2).f444120a);
        }
        if (interfaceC50554b2.equals(InterfaceC50554b.f.f444121a) ? true : interfaceC50554b2.equals(InterfaceC50554b.g.f444122a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
