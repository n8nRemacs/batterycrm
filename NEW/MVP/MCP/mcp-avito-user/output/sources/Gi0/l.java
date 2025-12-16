package gI0;

import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.user_advert.deeplink.B;
import dagger.internal.x;
import dagger.internal.y;
import hI0.C40835f;
import lv.C43834a;

/* compiled from: UserAdvertDeepLinkHandlerModule_MakeMyAdvertRestorationV2DeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C40587a f396451a;

    /* renamed from: b, reason: collision with root package name */
    public final B f396452b;

    public l(C40587a c40587a, B b12) {
        this.f396451a = c40587a;
        this.f396452b = b12;
    }

    public static C43834a a(C40587a c40587a, B b12) {
        c40587a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MyAdvertLink.RestoreV2.class, new C40835f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MyAdvertLink.RestoreV2.class), b12));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f396451a, this.f396452b);
    }
}
