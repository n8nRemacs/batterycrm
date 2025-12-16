package yf;

import com.avito.android.autoteka.deeplinks.AutotekaLandingLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import xf.C49934b;
import xf.C49935c;

/* compiled from: AutotekaDeepLinkHandlerModule_ProvideAutotekaLandingDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C49934b f443419a;

    public e(C49934b c49934b) {
        this.f443419a = c49934b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C49934b c49934b = this.f443419a;
        C50235a.f443415a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AutotekaLandingLink.class, new C49935c(), new C43834a.b.C11809b(c49934b));
    }
}
