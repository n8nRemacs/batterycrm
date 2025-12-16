package Jm;

import com.avito.android.deep_linking.links.CartLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CartDeeplinkHandlerModule_ProvideCartDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Jm.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14218e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cart.deep_link.c f9129a;

    public C14218e(com.avito.android.cart.deep_link.c cVar) {
        this.f9129a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.cart.deep_link.c cVar = this.f9129a;
        C14217d.f9128a.getClass();
        return new C43834a(CartLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CartLink.class), cVar));
    }
}
