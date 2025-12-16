package yf;

import com.avito.android.autoteka.deeplinks.AutotekaPaymentLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AutotekaDeepLinkHandlerModule_ProvideAutotekaPaymentDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.deeplinks.payment.c f443420a;

    public f(com.avito.android.autoteka.deeplinks.payment.c cVar) {
        this.f443420a = cVar;
    }

    public static C43834a a(com.avito.android.autoteka.deeplinks.payment.c cVar) {
        C50235a.f443415a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AutotekaPaymentLink.class, new com.avito.android.autoteka.deeplinks.payment.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AutotekaPaymentLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443420a);
    }
}
