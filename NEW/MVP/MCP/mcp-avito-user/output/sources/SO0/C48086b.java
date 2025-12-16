package sO0;

import com.avito.android.virtual_deal_room_reference_category.deeplink.ClientAddDeeplink;
import com.avito.android.virtual_deal_room_reference_category.deeplink.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VirtualDealRoomDeeplinkHandlerModule_ProvideClientAddDeeplinkMappingFactory.java */
@e
@y
@x
/* renamed from: sO0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48086b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f437640a;

    public C48086b(d dVar) {
        this.f437640a = dVar;
    }

    public static C43834a a(d dVar) {
        C48085a.f437639a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ClientAddDeeplink.class, new com.avito.android.virtual_deal_room_reference_category.deeplink.e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ClientAddDeeplink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f437640a);
    }
}
