package yf;

import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AutotekaDeepLinkHandlerModule_ProvideAutotekaPreviewSearchFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.deeplinks.previewsearch.b f443421a;

    public g(com.avito.android.autoteka.deeplinks.previewsearch.b bVar) {
        this.f443421a = bVar;
    }

    public static C43834a a(com.avito.android.autoteka.deeplinks.previewsearch.b bVar) {
        C50235a.f443415a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AutotekaPreviewSearchLink.class, new com.avito.android.autoteka.deeplinks.previewsearch.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AutotekaPreviewSearchLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f443421a);
    }
}
