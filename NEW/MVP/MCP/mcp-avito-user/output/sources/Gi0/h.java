package gI0;

import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.user_advert.deeplink.r;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: UserAdvertDeepLinkHandlerModule_MakeMyAdvertDeleteDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C40587a f396443a;

    /* renamed from: b, reason: collision with root package name */
    public final r f396444b;

    public h(C40587a c40587a, r rVar) {
        this.f396443a = c40587a;
        this.f396444b = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = this.f396444b;
        this.f396443a.getClass();
        return new C43834a(MyAdvertLink.Delete.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MyAdvertLink.Delete.class), rVar));
    }
}
