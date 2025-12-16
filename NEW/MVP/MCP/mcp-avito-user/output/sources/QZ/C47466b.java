package qz;

import com.avito.android.entry_point_client_room.deeplink.SendReportDeepLink;
import com.avito.android.entry_point_client_room.deeplink.c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SendReportDeepLinkModule_ProvideSendReportDeeplinkMappingFactory.java */
@e
@y
@x
/* renamed from: qz.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C47466b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.entry_point_client_room.deeplink.b f429539a;

    public C47466b(com.avito.android.entry_point_client_room.deeplink.b bVar) {
        this.f429539a = bVar;
    }

    public static C43834a a(com.avito.android.entry_point_client_room.deeplink.b bVar) {
        C47465a.f429538a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SendReportDeepLink.class, new c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SendReportDeepLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f429539a);
    }
}
