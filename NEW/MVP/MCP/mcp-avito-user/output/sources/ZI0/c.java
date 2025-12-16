package Zi0;

import com.avito.android.registration_self_employment_redirect_screen.SelfEmploymentRedirectDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SelfEmploymentRedirectDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f20484a;

    public c(d dVar) {
        this.f20484a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f20484a;
        C19567b.f20483a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SelfEmploymentRedirectDeeplink.class, new e(), new C43834a.b.C11809b(dVar));
    }
}
