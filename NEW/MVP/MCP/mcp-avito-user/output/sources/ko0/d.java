package KO0;

import com.avito.android.wallet.page.deeplink.WalletLink;
import com.avito.android.wallet.page.deeplink.i;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: WalletLinkHandlerModule_ProvideWalletServiceBalanceDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.wallet.page.deeplink.h f9452a;

    public d(com.avito.android.wallet.page.deeplink.h hVar) {
        this.f9452a = hVar;
    }

    public static C43834a a(com.avito.android.wallet.page.deeplink.h hVar) {
        a.f9449a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(WalletLink.WalletServiceBalanceLink.class, new i(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(WalletLink.WalletServiceBalanceLink.class), hVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f9452a);
    }
}
