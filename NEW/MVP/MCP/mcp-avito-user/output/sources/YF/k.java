package yf;

import com.avito.android.autoteka.deeplinks.AutotekaWaitingForPaymentLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AutotekaDeepLinkHandlerModule_ProvideAutotekaWaitingForPaymentDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.deeplinks.waitingForPayment.c f443425a;

    public k(com.avito.android.autoteka.deeplinks.waitingForPayment.c cVar) {
        this.f443425a = cVar;
    }

    public static C43834a a(com.avito.android.autoteka.deeplinks.waitingForPayment.c cVar) {
        C50235a.f443415a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AutotekaWaitingForPaymentLink.class, new com.avito.android.autoteka.deeplinks.waitingForPayment.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AutotekaWaitingForPaymentLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443425a);
    }
}
