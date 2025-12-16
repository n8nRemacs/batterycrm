package yM0;

import com.avito.android.account.W;
import javax.inject.Provider;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideBlockingAccountStorageInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: yM0.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50135d implements dagger.internal.h<W> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.account.G> f443051a;

    public C50135d(Provider<com.avito.android.account.G> provider) {
        this.f443051a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.account.G g12 = this.f443051a.get();
        C50134c.f443050a.getClass();
        return g12.i();
    }
}
