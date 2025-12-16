package BY;

import android.app.Application;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ForegroundScreenProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f1465a;

    public c(l lVar) {
        this.f1465a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f1465a.f393949a;
        b bVar = new b();
        application.registerActivityLifecycleCallbacks(new a(bVar));
        return bVar;
    }
}
