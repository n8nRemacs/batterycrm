package gI0;

import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.user_advert.deeplink.C35473i;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: UserAdvertDeepLinkHandlerModule_MakeMyAdvertDeactivateDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C40587a f396439a;

    /* renamed from: b, reason: collision with root package name */
    public final C35473i f396440b;

    public f(C40587a c40587a, C35473i c35473i) {
        this.f396439a = c40587a;
        this.f396440b = c35473i;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C35473i c35473i = this.f396440b;
        this.f396439a.getClass();
        return new C43834a(MyAdvertLink.Deactivate.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MyAdvertLink.Deactivate.class), c35473i));
    }
}
