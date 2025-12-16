package com.avito.android.publish.scanner.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ze0.C50556d;
import ze0.InterfaceC50554b;

/* compiled from: ScannerReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/scanner/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lze0/b;", "Lze0/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements u<InterfaceC50554b, C50556d> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C50556d a(InterfaceC50554b interfaceC50554b, C50556d c50556d) {
        InterfaceC50554b interfaceC50554b2 = interfaceC50554b;
        C50556d c50556d2 = c50556d;
        if (interfaceC50554b2 instanceof InterfaceC50554b.d) {
            return new C50556d(false);
        }
        if (interfaceC50554b2.equals(InterfaceC50554b.g.f444122a)) {
            return new C50556d(true);
        }
        if (interfaceC50554b2.equals(InterfaceC50554b.a.f444115a)) {
            return new C50556d(false);
        }
        if (interfaceC50554b2.equals(InterfaceC50554b.f.f444121a)) {
            return new C50556d(false);
        }
        if (interfaceC50554b2.equals(InterfaceC50554b.C12962b.f444116a) ? true : interfaceC50554b2 instanceof InterfaceC50554b.c ? true : interfaceC50554b2 instanceof InterfaceC50554b.e) {
            return c50556d2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
