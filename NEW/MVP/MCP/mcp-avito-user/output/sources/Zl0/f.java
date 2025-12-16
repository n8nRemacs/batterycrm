package zl0;

import Y61.k;
import com.avito.android.remote.analytics.y;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RetryRecoverableErrorsInterceptorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lzl0/f;", "Ldagger/internal/h;", "Lzl0/e;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements h<e> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f444231e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C50586c f444232a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<y> f444233b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<com.avito.android.quic.performance.a> f444234c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Provider<com.avito.android.quic.tracking.a> f444235d;

    /* compiled from: RetryRecoverableErrorsInterceptorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzl0/f$a;", "", "<init>", "()V", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k C50586c c50586c, @k Provider provider, @k Provider provider2, @k Provider provider3) {
        this.f444232a = c50586c;
        this.f444233b = provider;
        this.f444234c = provider2;
        this.f444235d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C50585b c50585b = (C50585b) this.f444232a.get();
        y yVar = this.f444233b.get();
        com.avito.android.quic.performance.a aVar = this.f444234c.get();
        com.avito.android.quic.tracking.a aVar2 = this.f444235d.get();
        f444231e.getClass();
        return new e(c50585b, yVar, aVar, aVar2, 0, 0L, 48, null);
    }
}
