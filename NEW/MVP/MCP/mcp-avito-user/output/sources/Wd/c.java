package WD;

import VD.d;
import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.e0;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RatingAbTestsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LWD/c;", "Ldagger/internal/h;", "LWD/b;", "a", "_avito-discouraged_avito-feature_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f17831d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f17832a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<InterfaceC27642e> f17833b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e0 f17834c;

    /* compiled from: RatingAbTestsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWD/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k d dVar, @k Provider provider, @k e0 e0Var) {
        this.f17832a = dVar;
        this.f17833b = provider;
        this.f17834c = e0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        VD.b bVar = (VD.b) this.f17832a.get();
        InterfaceC27642e interfaceC27642e = this.f17833b.get();
        c0 c0Var = (c0) this.f17834c.get();
        f17831d.getClass();
        return new b(bVar, interfaceC27642e, c0Var);
    }
}
