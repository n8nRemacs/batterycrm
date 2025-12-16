package FD;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.e0;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HomeAbTestsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LFD/c;", "Ldagger/internal/h;", "LFD/b;", "a", "_avito-discouraged_avito-feature_home"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f4640d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ED.c f4641a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e0 f4642b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<InterfaceC27642e> f4643c;

    /* compiled from: HomeAbTestsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFD/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_home"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k ED.c cVar, @k e0 e0Var, @k Provider provider) {
        this.f4641a = cVar;
        this.f4642b = e0Var;
        this.f4643c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ED.a aVar = (ED.a) this.f4641a.get();
        c0 c0Var = (c0) this.f4642b.get();
        InterfaceC27642e interfaceC27642e = this.f4643c.get();
        f4640d.getClass();
        return new b(aVar, c0Var, interfaceC27642e);
    }
}
