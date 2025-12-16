package gI0;

import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.user_advert.deeplink.o;
import dagger.internal.x;
import dagger.internal.y;
import hI0.C40833d;
import lv.C43834a;

/* compiled from: UserAdvertDeepLinkHandlerModule_MakeMyAdvertDeactivateV2DeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C40587a f396441a;

    /* renamed from: b, reason: collision with root package name */
    public final o f396442b;

    public g(C40587a c40587a, o oVar) {
        this.f396441a = c40587a;
        this.f396442b = oVar;
    }

    public static C43834a a(C40587a c40587a, o oVar) {
        c40587a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MyAdvertLink.DeactivateV2.class, new C40833d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MyAdvertLink.DeactivateV2.class), oVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f396441a, this.f396442b);
    }
}
