package gI0;

import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.user_advert.deeplink.C35470f;
import dagger.internal.x;
import dagger.internal.y;
import hI0.C40832c;
import lv.C43834a;

/* compiled from: UserAdvertDeepLinkHandlerModule_MakeMyAdvertActivationV2DeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C40587a f396435a;

    /* renamed from: b, reason: collision with root package name */
    public final C35470f f396436b;

    public d(C40587a c40587a, C35470f c35470f) {
        this.f396435a = c40587a;
        this.f396436b = c35470f;
    }

    public static C43834a a(C40587a c40587a, C35470f c35470f) {
        c40587a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MyAdvertLink.ActivateV2.class, new C40832c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MyAdvertLink.ActivateV2.class), c35470f));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f396435a, this.f396436b);
    }
}
