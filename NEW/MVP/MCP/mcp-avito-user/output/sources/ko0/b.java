package KO0;

import com.avito.android.deep_linking.links.TopUpFormLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: WalletLinkHandlerModule_ProvidePaymentTopUpFormHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.wallet.page.deeplink.b f9450a;

    public b(com.avito.android.wallet.page.deeplink.b bVar) {
        this.f9450a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.wallet.page.deeplink.b bVar = this.f9450a;
        a.f9449a.getClass();
        return new C43834a(TopUpFormLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TopUpFormLink.class), bVar));
    }
}
