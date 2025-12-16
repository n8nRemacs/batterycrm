package eO0;

import com.avito.android.virtual_deal_room_invite.deeplink.InviteDeeplink;
import com.avito.android.virtual_deal_room_invite.deeplink.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: InviteDeeplinkHandlerModule_ProvideInviteDeeplinkMappingFactory.java */
@e
@y
@x
/* renamed from: eO0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40032b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f395168a;

    public C40032b(d dVar) {
        this.f395168a = dVar;
    }

    public static C43834a a(d dVar) {
        C40031a.f395167a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(InviteDeeplink.class, new com.avito.android.virtual_deal_room_invite.deeplink.e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(InviteDeeplink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f395168a);
    }
}
