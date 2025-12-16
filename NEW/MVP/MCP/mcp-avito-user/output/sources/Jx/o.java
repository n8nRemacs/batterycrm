package JX;

import com.avito.android.permissions.G;
import com.avito.android.permissions.I;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MainStartOnboardingNotificationPermissionCheckerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final I f9022a;

    /* renamed from: b, reason: collision with root package name */
    public final P30.c f9023b;

    public o(I i12, P30.c cVar) {
        this.f9022a = i12;
        this.f9023b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((G) this.f9022a.get(), (P30.a) this.f9023b.get());
    }
}
