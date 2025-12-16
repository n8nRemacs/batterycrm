package Z30;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SettingsNotificationsLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f19854a;

    /* renamed from: b, reason: collision with root package name */
    public final Y30.c f19855b;

    public h(Y30.c cVar, dv.b bVar) {
        this.f19854a = bVar;
        this.f19855b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Y30.a) this.f19855b.get(), (a.InterfaceC4053a) this.f19854a.get());
    }
}
