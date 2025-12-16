package Ci;

import Y61.k;
import com.avito.android.beduin.v2.benchmark.BeduinV2BenchmarkPageDeepLink;
import com.avito.android.beduin.v2.benchmark.impl.deeplinks.d;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: BeduinV2BenchmarkPageDeepLinkModule_ProvideBeduinV2PageMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LCi/c;", "Ldagger/internal/h;", "Llv/a;", "a", "_design-modules_beduin-v2_benchmark_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ci.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13308c implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f2642b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.v2.benchmark.impl.deeplinks.c f2643a;

    /* compiled from: BeduinV2BenchmarkPageDeepLinkModule_ProvideBeduinV2PageMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCi/c$a;", "", "<init>", "()V", "_design-modules_beduin-v2_benchmark_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ci.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C13308c(@k com.avito.android.beduin.v2.benchmark.impl.deeplinks.c cVar) {
        this.f2643a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.beduin.v2.benchmark.impl.deeplinks.c cVar = this.f2643a;
        f2642b.getClass();
        C13307b.f2641a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(BeduinV2BenchmarkPageDeepLink.class, new d(), new C43834a.b.C11809b(cVar));
    }
}
