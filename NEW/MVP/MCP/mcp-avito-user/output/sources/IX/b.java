package Ix;

import Y61.k;
import com.avito.android.H0;
import com.avito.android.cookie_provider.e;
import com.avito.android.cookie_provider.f;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.remote.interceptor.D0;
import com.avito.android.remote.interceptor.R0;
import com.avito.android.util.C;
import dagger.internal.h;
import java.util.Collections;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DownloadFileLinkHandlerModule_ProvideCookieProviderFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LIx/b;", "Ldagger/internal/h;", "Lcom/avito/android/cookie_provider/e;", "a", "_avito_download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements h<e> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f8637f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final D0 f8638a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f8639b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.cookie_provider.d f8640c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Provider<C> f8641d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Provider<H0> f8642e;

    /* compiled from: DownloadFileLinkHandlerModule_ProvideCookieProviderFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIx/b$a;", "", "<init>", "()V", "_avito_download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k D0 d02, @k R0 r02, @k com.avito.android.cookie_provider.d dVar, @k Provider provider, @k Provider provider2) {
        this.f8638a = d02;
        this.f8639b = r02;
        this.f8640c = dVar;
        this.f8641d = provider;
        this.f8642e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        B0 b02 = (B0) this.f8638a.get();
        this.f8639b.get();
        com.avito.android.cookie_provider.c cVar = (com.avito.android.cookie_provider.c) this.f8640c.get();
        C c12 = this.f8641d.get();
        H0 h02 = this.f8642e.get();
        f8637f.getClass();
        C14170a.f8636a.getClass();
        c12.getF125491k().getClass();
        return new f(Collections.singletonList(b02), cVar, c12, h02);
    }
}
