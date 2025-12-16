package FN0;

import com.avito.android.virtual_deal_room.deeplink.ClientRoomDeeplink;
import com.avito.android.virtual_deal_room.deeplink.k;
import com.avito.android.virtual_deal_room.deeplink.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VirtualDealRoomDeeplinkHandlerModule_ProvideCategoryDeeplinkMappingFactory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f4692a;

    public b(k kVar) {
        this.f4692a = kVar;
    }

    public static C43834a a(k kVar) {
        a.f4691a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ClientRoomDeeplink.class, new l(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ClientRoomDeeplink.class), kVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f4692a);
    }
}
