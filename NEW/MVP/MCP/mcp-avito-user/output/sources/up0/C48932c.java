package uP0;

import com.avito.android.wallet.webview.deeplink.WalletWebViewLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: WalletWebViewLinkHandlerModule_ProvideWalletHistoryLinkMapperFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: uP0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48932c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C48933d f439926a;

    public C48932c(C48933d c48933d) {
        this.f439926a = c48933d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C48933d c48933d = this.f439926a;
        C48931b.f439925a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(WalletWebViewLink.class, new g(), new C43834a.b.C11809b(c48933d));
    }
}
