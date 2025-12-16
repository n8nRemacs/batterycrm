package E30;

import com.avito.android.notification_center.list.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: NotificationsCenterListPreloadable_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f3717a;

    public c(u uVar) {
        this.f3717a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((j) this.f3717a.get());
    }
}
