package EU;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.compose.design.shared.benchmark.BenchmarkComposeDeepLink;
import com.avito.android.lib.compose.design.shared.benchmark.deeplinks.c;
import com.avito.android.lib.compose.design.shared.benchmark.deeplinks.d;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: BenchmarkComposeDeepLinkModule_ProvideMappingFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LEU/b;", "Ldagger/internal/h;", "Llv/a;", "a", "_design-modules_compose_shared_benchmark_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f4026b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f4027a;

    /* compiled from: BenchmarkComposeDeepLinkModule_ProvideMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEU/b$a;", "", "<init>", "()V", "_design-modules_compose_shared_benchmark_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k c cVar) {
        this.f4027a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = this.f4027a;
        f4026b.getClass();
        EU.a.f4025a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(BenchmarkComposeDeepLink.class, new d(), new C43834a.b.C11809b(cVar));
    }
}
