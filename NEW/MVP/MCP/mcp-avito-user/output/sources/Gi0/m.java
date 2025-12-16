package gI0;

import com.avito.android.deep_linking.links.DraftDeletionLink;
import com.avito.android.user_advert.deeplink.G;
import dagger.internal.x;
import dagger.internal.y;
import hI0.C40830a;
import lv.C43834a;

/* compiled from: UserAdvertDeepLinkHandlerModule_MakeMyDraftDeleteDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C40587a f396453a;

    /* renamed from: b, reason: collision with root package name */
    public final G f396454b;

    public m(C40587a c40587a, G g12) {
        this.f396453a = c40587a;
        this.f396454b = g12;
    }

    public static C43834a a(C40587a c40587a, G g12) {
        c40587a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(DraftDeletionLink.class, new C40830a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DraftDeletionLink.class), g12));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f396453a, this.f396454b);
    }
}
