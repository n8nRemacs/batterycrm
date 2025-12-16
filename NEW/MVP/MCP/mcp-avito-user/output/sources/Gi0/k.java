package gI0;

import com.avito.android.deep_linking.links.MyAdvertLink;
import dagger.internal.x;
import dagger.internal.y;
import hI0.C40834e;
import lv.C43834a;

/* compiled from: UserAdvertDeepLinkHandlerModule_MakeMyAdvertRestorationDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C40587a f396449a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.user_advert.deeplink.x f396450b;

    public k(C40587a c40587a, com.avito.android.user_advert.deeplink.x xVar) {
        this.f396449a = c40587a;
        this.f396450b = xVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.user_advert.deeplink.x xVar = this.f396450b;
        this.f396449a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MyAdvertLink.Restore.class, new C40834e(), new C43834a.b.C11809b(xVar));
    }
}
