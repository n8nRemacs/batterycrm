package C30;

import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: NotificationCenterLandingMainDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f1900a;

    public b(f fVar) {
        this.f1900a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.deeplink_handler.handler.composite.a) this.f1900a.get());
    }
}
