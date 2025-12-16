package B30;

import com.avito.android.notification_center.counter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: NotificationCenterPluginModule_ProvideCounterPluginFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<A3.b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f856a;

    public f(u uVar) {
        this.f856a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f856a.get();
        e.f855a.getClass();
        return new c(jVar);
    }
}
