package Nz;

import com.avito.android.esia_webview.EsiaWebViewDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: EsiaWebViewDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Nz.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14633c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C14634d f11888a;

    public C14633c(C14634d c14634d) {
        this.f11888a = c14634d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C14634d c14634d = this.f11888a;
        C14632b.f11887a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(EsiaWebViewDeeplink.class, new C14635e(), new C43834a.b.C11809b(c14634d));
    }
}
