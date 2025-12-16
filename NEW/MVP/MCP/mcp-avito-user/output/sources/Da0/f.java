package dA0;

import com.avito.android.success.deeplink.SuccessLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SuccessDeeplinkHandlerModule_ProvideSuccessDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.success.deeplink.c f393723a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.success.deeplink.e f393724b;

    public f(com.avito.android.success.deeplink.c cVar, com.avito.android.success.deeplink.e eVar) {
        this.f393723a = cVar;
        this.f393724b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f393724b.getClass();
        com.avito.android.success.deeplink.d dVar = new com.avito.android.success.deeplink.d();
        com.avito.android.success.deeplink.c cVar = this.f393723a;
        e.f393722a.getClass();
        return new C43834a(SuccessLink.class, dVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SuccessLink.class), cVar));
    }
}
