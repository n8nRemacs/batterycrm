package FO0;

import com.avito.android.wallet.history.mvi.deeplink.WalletHistoryLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: WalletHistoryLinkHandlerModule_ProvideWalletHistoryLinkMapperFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f4697a;

    public c(d dVar) {
        this.f4697a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f4697a;
        b.f4696a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(WalletHistoryLink.class, new e(), new C43834a.b.C11809b(dVar));
    }
}
