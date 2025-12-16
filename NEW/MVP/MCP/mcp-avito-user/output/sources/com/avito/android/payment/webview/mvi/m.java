package com.avito.android.payment.webview.mvi;

import androidx.view.C23060r0;
import com.avito.android.payment.webview.mvi.k;
import kotlinx.coroutines.flow.i2;

/* compiled from: WebPaymentMviViewModel_Factory_Impl.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class m implements k.a {

    /* renamed from: a, reason: collision with root package name */
    public final l f214929a;

    public m(l lVar) {
        this.f214929a = lVar;
    }

    @Override // com.avito.android.payment.webview.mvi.k.a
    public final k a(C23060r0 c23060r0) {
        com.avito.android.payment.webview.mvi.component.k kVar = (com.avito.android.payment.webview.mvi.component.k) this.f214929a.f214928a.get();
        i2.f411430a.getClass();
        return new k(kVar, c23060r0, i2.a.f411433c);
    }
}
