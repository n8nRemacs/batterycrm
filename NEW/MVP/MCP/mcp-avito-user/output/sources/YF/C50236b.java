package yf;

import com.avito.android.autoteka.deeplinks.AutotekaChoosingPurchaseLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AutotekaDeepLinkHandlerModule_ProvideAutotekaChoosingPurchaseDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: yf.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C50236b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.deeplinks.choosingPurchase.c f443416a;

    public C50236b(com.avito.android.autoteka.deeplinks.choosingPurchase.c cVar) {
        this.f443416a = cVar;
    }

    public static C43834a a(com.avito.android.autoteka.deeplinks.choosingPurchase.c cVar) {
        C50235a.f443415a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AutotekaChoosingPurchaseLink.class, new com.avito.android.autoteka.deeplinks.choosingPurchase.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AutotekaChoosingPurchaseLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443416a);
    }
}
