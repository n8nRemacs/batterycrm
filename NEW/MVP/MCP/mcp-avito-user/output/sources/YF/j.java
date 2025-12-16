package yf;

import com.avito.android.autoteka.deeplinks.AutotekaUnifiedButtonLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AutotekaDeepLinkHandlerModule_ProvideAutotekaUnifiedButtonDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.deeplinks.unifiedButton.c f443424a;

    public j(com.avito.android.autoteka.deeplinks.unifiedButton.c cVar) {
        this.f443424a = cVar;
    }

    public static C43834a a(com.avito.android.autoteka.deeplinks.unifiedButton.c cVar) {
        C50235a.f443415a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AutotekaUnifiedButtonLink.class, new com.avito.android.autoteka.deeplinks.unifiedButton.f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AutotekaUnifiedButtonLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443424a);
    }
}
