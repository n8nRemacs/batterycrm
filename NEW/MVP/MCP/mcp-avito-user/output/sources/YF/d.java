package yf;

import com.avito.android.autoteka.deeplinks.AutotekaDirectPurchaseLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AutotekaDeepLinkHandlerModule_ProvideAutotekaDirectPurchaseDeepLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.deeplinks.directPurchase.c f443418a;

    public d(com.avito.android.autoteka.deeplinks.directPurchase.c cVar) {
        this.f443418a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.autoteka.deeplinks.directPurchase.c cVar = this.f443418a;
        C50235a.f443415a.getClass();
        return new C43834a(AutotekaDirectPurchaseLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AutotekaDirectPurchaseLink.class), cVar));
    }
}
