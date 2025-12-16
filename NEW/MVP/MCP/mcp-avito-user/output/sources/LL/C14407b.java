package Ll;

import com.avito.android.c2c_trx.deepLinks.AddAutoToC2CTrxLink;
import com.avito.android.c2c_trx.deeplinks.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AutoC2CTrxDeepLinkHandlerModule_ProvideDeepLinkHandlerFactory.java */
@e
@y
@x
/* renamed from: Ll.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14407b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f10097a;

    public C14407b(d dVar) {
        this.f10097a = dVar;
    }

    public static C43834a a(d dVar) {
        C14406a.f10096a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AddAutoToC2CTrxLink.class, new com.avito.android.c2c_trx.deeplinks.e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AddAutoToC2CTrxLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f10097a);
    }
}
