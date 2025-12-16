package Z30;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileNotificationsLinkSyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Y30.c f19850a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f19851b;

    public f(Y30.c cVar, dv.b bVar) {
        this.f19850a = cVar;
        this.f19851b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Y30.a) this.f19850a.get(), (a.InterfaceC4053a) this.f19851b.get());
    }
}
