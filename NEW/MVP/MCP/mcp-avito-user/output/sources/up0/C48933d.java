package uP0;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.wallet.webview.n;
import com.avito.android.wallet.webview.o;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletWebViewLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: uP0.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48933d implements h<C48930a> {

    /* renamed from: a, reason: collision with root package name */
    public final o f439927a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f439928b;

    public C48933d(o oVar, dv.b bVar) {
        this.f439927a = oVar;
        this.f439928b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48930a((n) this.f439927a.get(), (a.InterfaceC4053a) this.f439928b.get());
    }
}
