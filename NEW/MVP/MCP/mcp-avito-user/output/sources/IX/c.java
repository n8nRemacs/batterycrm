package Ix;

import X41.n;
import Y61.k;
import com.avito.android.download_deeplink.link.DownloadFileLink;
import com.avito.android.download_deeplink.link.i;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: DownloadFileLinkHandlerModule_ProvideDownloadFileDeepLinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LIx/c;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f8643b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.download_deeplink.link.c f8644a;

    /* compiled from: DownloadFileLinkHandlerModule_ProvideDownloadFileDeepLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIx/c$a;", "", "<init>", "()V", "_avito_download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static C43834a a(@k com.avito.android.download_deeplink.link.c cVar) {
            C14170a.f8636a.getClass();
            C43834a.C11807a c11807a = C43834a.f414235d;
            return new C43834a(DownloadFileLink.class, new i(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DownloadFileLink.class), cVar));
        }

        public a() {
        }
    }

    public c(@k com.avito.android.download_deeplink.link.c cVar) {
        this.f8644a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.download_deeplink.link.c cVar = this.f8644a;
        f8643b.getClass();
        return a.a(cVar);
    }
}
