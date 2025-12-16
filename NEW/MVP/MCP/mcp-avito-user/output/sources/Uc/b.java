package UC;

import com.avito.android.favorites.link.GetSimilarPushLink;
import com.avito.android.favorites.link.c;
import com.avito.android.favorites.link.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GetSimilarPushLinkModule_ProvideGetSimilarPushLinkMappingFactory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f16265a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.favorites.link.e f16266b;

    public b(c cVar, com.avito.android.favorites.link.e eVar) {
        this.f16265a = cVar;
        this.f16266b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f16266b.getClass();
        d dVar = new d();
        c cVar = this.f16265a;
        a.f16264a.getClass();
        return new C43834a(GetSimilarPushLink.class, dVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GetSimilarPushLink.class), cVar));
    }
}
