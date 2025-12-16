package xi;

import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HomeTabBeduinScreenLinkHandler_Factory.java */
@e
@y
@x
/* renamed from: xi.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49949b implements h<C49948a> {

    /* renamed from: a, reason: collision with root package name */
    public final O f442607a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f442608b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.navigation.c f442609c;

    public C49949b(O o12, dv.b bVar, com.avito.android.navigation.c cVar) {
        this.f442607a = o12;
        this.f442608b = bVar;
        this.f442609c = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49948a((L) this.f442607a.get(), (a.InterfaceC4053a) this.f442608b.get(), (com.avito.android.navigation.a) this.f442609c.get());
    }
}
