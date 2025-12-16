package FN0;

import com.avito.android.virtual_deal_room.deeplink.ClientEditDeeplink;
import com.avito.android.virtual_deal_room.deeplink.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VirtualDealRoomDeeplinkHandlerModule_ProvideClientEditDeeplinkMappingFactory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f4693a;

    public c(d dVar) {
        this.f4693a = dVar;
    }

    public static C43834a a(d dVar) {
        a.f4691a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ClientEditDeeplink.class, new com.avito.android.virtual_deal_room.deeplink.e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ClientEditDeeplink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f4693a);
    }
}
