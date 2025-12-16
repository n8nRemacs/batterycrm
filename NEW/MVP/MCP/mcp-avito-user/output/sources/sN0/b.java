package SN0;

import com.avito.android.virtual_deal_room.deeplink.CreateClientDeeplink;
import com.avito.android.virtual_deal_room_client_creation.deeplink.c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VirtualDealRoomClientCreationDeeplinkHandlerModule_ProvideCategoryDeeplinkMappingFactory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.virtual_deal_room_client_creation.deeplink.b f14950a;

    public b(com.avito.android.virtual_deal_room_client_creation.deeplink.b bVar) {
        this.f14950a = bVar;
    }

    public static C43834a a(com.avito.android.virtual_deal_room_client_creation.deeplink.b bVar) {
        a.f14949a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CreateClientDeeplink.class, new c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CreateClientDeeplink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f14950a);
    }
}
