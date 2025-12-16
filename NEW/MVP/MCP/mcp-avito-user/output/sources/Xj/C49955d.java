package xj;

import X41.n;
import Y61.k;
import com.avito.android.beduin_snippet_response_manager.deeplink.BeduinSnippetJobResponseDeeplink;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: BeduinSnippetJobResponseDeeplinkModule_ProvideJobApplyCreateDeeplinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lxj/d;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_job_beduin-snippet-response-manager_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xj.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49955d implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f442615b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C49953b f442616a;

    /* compiled from: BeduinSnippetJobResponseDeeplinkModule_ProvideJobApplyCreateDeeplinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxj/d$a;", "", "<init>", "()V", "_avito_job_beduin-snippet-response-manager_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xj.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static C43834a a(@k C49953b c49953b) {
            C49954c.f442614a.getClass();
            C43834a.C11807a c11807a = C43834a.f414235d;
            return new C43834a(BeduinSnippetJobResponseDeeplink.class, new C49956e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(BeduinSnippetJobResponseDeeplink.class), c49953b));
        }

        public a() {
        }
    }

    public C49955d(@k C49953b c49953b) {
        this.f442616a = c49953b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C49953b c49953b = this.f442616a;
        f442615b.getClass();
        return a.a(c49953b);
    }
}
