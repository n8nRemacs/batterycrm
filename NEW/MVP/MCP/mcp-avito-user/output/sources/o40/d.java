package o40;

import Y61.k;
import com.avito.android.I1;
import com.avito.android.K1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinPatternCacheMetricsDelegate_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lo40/d;", "Ldagger/internal/h;", "Lo40/b;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<C44579b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f419366c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final K1 f419367a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f419368b;

    /* compiled from: BeduinPatternCacheMetricsDelegate_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo40/d$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k K1 k12, @k g gVar) {
        this.f419367a = k12;
        this.f419368b = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i12 = (I1) this.f419367a.get();
        f419366c.getClass();
        return new C44579b(i12, this.f419368b);
    }
}
