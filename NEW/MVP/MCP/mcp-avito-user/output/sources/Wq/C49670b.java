package wq;

import com.avito.android.comfortable_deal_invite.deeplink.ComfortableDealInviteDeeplink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ComfortableDealInviteDeeplinkModule_ProvideComfortableDealInviteDeeplinkMappingFactory.java */
@e
@y
@x
/* renamed from: wq.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49670b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal_invite.deeplinks.b f441809a;

    public C49670b(com.avito.android.comfortable_deal_invite.deeplinks.b bVar) {
        this.f441809a = bVar;
    }

    public static C43834a a(com.avito.android.comfortable_deal_invite.deeplinks.b bVar) {
        C49669a.f441808a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ComfortableDealInviteDeeplink.class, new com.avito.android.comfortable_deal_invite.deeplinks.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ComfortableDealInviteDeeplink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f441809a);
    }
}
