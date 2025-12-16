package w30;

import I30.d;
import com.avito.android.remote.notification.A;
import com.avito.android.remote.notification.C;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: NotificationChannelHelperImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<C49435a> {

    /* renamed from: a, reason: collision with root package name */
    public final C f441245a;

    /* renamed from: b, reason: collision with root package name */
    public final I30.b f441246b;

    public b(C c12, I30.b bVar) {
        this.f441245a = c12;
        this.f441246b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49435a((A) this.f441245a.get(), (d) this.f441246b.get());
    }
}
