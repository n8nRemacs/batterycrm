package gI0;

import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.user_advert.deeplink.D;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: UserAdvertDeepLinkHandlerModule_MakeMyAdvertAllowDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C40587a f396437a;

    /* renamed from: b, reason: collision with root package name */
    public final D f396438b;

    public e(C40587a c40587a, D d12) {
        this.f396437a = c40587a;
        this.f396438b = d12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        D d12 = this.f396438b;
        this.f396437a.getClass();
        return new C43834a(MyAdvertLink.Allow.class, null, new C43834a.b.C11809b(d12));
    }
}
