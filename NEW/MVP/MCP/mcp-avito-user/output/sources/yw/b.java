package YW;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReputationUnavailableLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final HW.c f19489a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f19490b;

    public b(HW.c cVar, dv.b bVar) {
        this.f19489a = cVar;
        this.f19490b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((HW.a) this.f19489a.get(), (a.InterfaceC4053a) this.f19490b.get());
    }
}
