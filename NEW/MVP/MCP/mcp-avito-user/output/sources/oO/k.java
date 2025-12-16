package oO;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ShowPinMapLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f419755a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f419756b;

    public k(g gVar, dv.b bVar) {
        this.f419755a = gVar;
        this.f419756b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((f) this.f419755a.get(), (a.InterfaceC4053a) this.f419756b.get());
    }
}
