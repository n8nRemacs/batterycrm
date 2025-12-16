package gI0;

import com.avito.android.deep_linking.links.MyAdvertDetailsLink;
import com.avito.android.user_advert.deeplink.t;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: UserAdvertDeepLinkHandlerModule_MakeMyAdvertDetailsDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C40587a f396445a;

    /* renamed from: b, reason: collision with root package name */
    public final t f396446b;

    public i(C40587a c40587a, t tVar) {
        this.f396445a = c40587a;
        this.f396446b = tVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        t tVar = this.f396446b;
        this.f396445a.getClass();
        return new C43834a(MyAdvertDetailsLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MyAdvertDetailsLink.class), tVar));
    }
}
