package D7;

import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.advert_collection.InterfaceC28257e;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertCollectionLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert_collection.h f2945a;

    /* renamed from: b, reason: collision with root package name */
    public final O f2946b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f2947c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.navigation.c f2948d;

    public c(com.avito.android.advert_collection.h hVar, O o12, dv.b bVar, com.avito.android.navigation.c cVar) {
        this.f2945a = hVar;
        this.f2946b = o12;
        this.f2947c = bVar;
        this.f2948d = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC28257e) this.f2945a.get(), (L) this.f2946b.get(), (a.InterfaceC4053a) this.f2947c.get(), (com.avito.android.navigation.a) this.f2948d.get());
    }
}
