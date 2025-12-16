package gI0;

import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.user_advert.deeplink.C35466b;
import dagger.internal.x;
import dagger.internal.y;
import hI0.C40831b;
import lv.C43834a;

/* compiled from: UserAdvertDeepLinkHandlerModule_MakeMyAdvertActivationDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C40587a f396433a;

    /* renamed from: b, reason: collision with root package name */
    public final C35466b f396434b;

    public c(C40587a c40587a, C35466b c35466b) {
        this.f396433a = c40587a;
        this.f396434b = c35466b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C35466b c35466b = this.f396434b;
        this.f396433a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MyAdvertLink.Activate.class, new C40831b(), new C43834a.b.C11809b(c35466b));
    }
}
