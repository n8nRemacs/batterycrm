package B30;

import com.avito.android.notification.m;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: NotificationCenterPluginModule_ProvideNotificationsPluginFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<A3.b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f857a;

    public g(dagger.internal.f fVar) {
        this.f857a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        m mVar = (m) this.f857a.get();
        e.f855a.getClass();
        return new d(mVar);
    }
}
