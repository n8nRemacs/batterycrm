package lj0;

import Y61.k;
import com.avito.android.util.C;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TelephonySubscriptionManagerWrapper_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Llj0/g;", "Ldagger/internal/h;", "Llj0/f;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class g implements h<f> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f414177b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<C> f414178a;

    /* compiled from: TelephonySubscriptionManagerWrapper_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llj0/g$a;", "", "<init>", "()V", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k Provider<C> provider) {
        this.f414178a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f414178a.get();
        f414177b.getClass();
        return new f(c12);
    }
}
