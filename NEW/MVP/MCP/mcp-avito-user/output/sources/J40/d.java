package J40;

import com.avito.android.onboarding_manager.e;
import com.avito.android.util.C;
import com.avito.android.util.E;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingManagerModule_ProvideBxContentOnboardingPriorityInteractorFactory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<com.avito.android.onboarding_manager.e> {

    /* renamed from: a, reason: collision with root package name */
    public final K40.d f8747a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f8748b;

    public d(K40.d dVar, Provider provider) {
        this.f8747a = dVar;
        this.f8748b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = g.a(w.a(this.f8747a));
        C c12 = this.f8748b.get();
        c.f8746a.getClass();
        Object obj = E.a(c12.getF125491k()) ? e.c.f209428a : (com.avito.android.onboarding_manager.e) eVarA.get();
        t.d(obj);
        return obj;
    }
}
