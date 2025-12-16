package XK0;

import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvitoUxFeedbackPluginModule_ProvideAuthorizationPluginFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LXK0/e;", "Ldagger/internal/h;", "LA3/b;", "a", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<A3.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f18835b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f18836a;

    /* compiled from: AvitoUxFeedbackPluginModule_ProvideAuthorizationPluginFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXK0/e$a;", "", "<init>", "()V", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.k u uVar) {
        this.f18836a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        WK0.g gVar = (WK0.g) this.f18836a.get();
        f18835b.getClass();
        int i12 = d.f18834a;
        return new c(gVar);
    }
}
