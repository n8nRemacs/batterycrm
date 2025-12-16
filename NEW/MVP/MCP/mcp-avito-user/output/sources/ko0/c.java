package KO0;

import com.avito.android.wallet.page.deeplink.WalletLink;
import com.avito.android.wallet.page.deeplink.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: WalletLinkHandlerModule_ProvideWalletPageDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.wallet.page.deeplink.e f9451a;

    public c(com.avito.android.wallet.page.deeplink.e eVar) {
        this.f9451a = eVar;
    }

    public static C43834a a(com.avito.android.wallet.page.deeplink.e eVar) {
        a.f9449a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(WalletLink.WalletPageLink.class, new f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(WalletLink.WalletPageLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f9451a);
    }
}
