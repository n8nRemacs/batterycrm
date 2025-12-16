package Bk0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: NotificationGrafanaTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes17.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f1668a;

    public c(dagger.internal.f fVar) {
        this.f1668a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC28373a) this.f1668a.get());
    }
}
