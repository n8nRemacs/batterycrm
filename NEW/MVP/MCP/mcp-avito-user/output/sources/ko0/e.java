package KO0;

import com.avito.android.deep_linking.links.WalletTransactionHistoryLink;
import com.avito.android.wallet.page.deeplink.k;
import com.avito.android.wallet.page.deeplink.l;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: WalletLinkHandlerModule_ProvideWalletTransactionHistoryDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f9453a;

    public e(k kVar) {
        this.f9453a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = this.f9453a;
        a.f9449a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(WalletTransactionHistoryLink.class, new l(), new C43834a.b.C11809b(kVar));
    }
}
