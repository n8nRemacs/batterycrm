package e40;

import X41.n;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.oauth.deeplink.OAuthDeepLink;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: OAuthDeepLinkModule_ProvideOAuthDeepLinkMappingFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Le40/c;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: e40.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C39946c implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f394949b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.oauth.deeplink.c f394950a;

    /* compiled from: OAuthDeepLinkModule_ProvideOAuthDeepLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le40/c$a;", "", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e40.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static C43834a a(@k com.avito.android.oauth.deeplink.c cVar) {
            C39945b.f394948a.getClass();
            C43834a.C11807a c11807a = C43834a.f414235d;
            return new C43834a(OAuthDeepLink.class, new com.avito.android.oauth.deeplink.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(OAuthDeepLink.class), cVar));
        }

        public a() {
        }
    }

    public C39946c(@k com.avito.android.oauth.deeplink.c cVar) {
        this.f394950a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.oauth.deeplink.c cVar = this.f394950a;
        f394949b.getClass();
        return a.a(cVar);
    }
}
