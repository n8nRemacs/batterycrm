package oO;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DevelopmentsCatalogInfrastructureLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: oO.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C44671b implements dagger.internal.h<C44670a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f419747a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f419748b;

    public C44671b(g gVar, dv.b bVar) {
        this.f419747a = gVar;
        this.f419748b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44670a((f) this.f419747a.get(), (a.InterfaceC4053a) this.f419748b.get());
    }
}
