package cr0;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SendEsiaDataDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<C39402a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f392975a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.send_esia_data_screen.ui.d f392976b;

    public d(dv.b bVar, com.avito.android.send_esia_data_screen.ui.d dVar) {
        this.f392975a = bVar;
        this.f392976b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C39402a((a.InterfaceC4053a) this.f392975a.get(), (com.avito.android.send_esia_data_screen.ui.b) this.f392976b.get());
    }
}
