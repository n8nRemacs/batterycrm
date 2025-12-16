package oH;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import oO.f;
import oO.g;

/* compiled from: GigSlotMapDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<C44644c> {

    /* renamed from: a, reason: collision with root package name */
    public final g f419689a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f419690b;

    public d(g gVar, dv.b bVar) {
        this.f419689a = gVar;
        this.f419690b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44644c((f) this.f419689a.get(), (a.InterfaceC4053a) this.f419690b.get());
    }
}
