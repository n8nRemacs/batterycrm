package com.avito.android.esia_redirect_screen.deeplink;

import com.avito.android.esia_redirect_screen.EsiaRedirectDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: EsiaRedirectDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f147994a;

    public b(d dVar) {
        this.f147994a = dVar;
    }

    public static C43834a a(d dVar) {
        a.f147993a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(EsiaRedirectDeeplink.class, new e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(EsiaRedirectDeeplink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f147994a);
    }
}
