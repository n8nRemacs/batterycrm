package PJ;

import RJ.e;
import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.e0;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvCallsNetworkTestAbTestsImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LPJ/d;", "Ldagger/internal/h;", "LPJ/b;", "a", "_avito_iac-avcalls-network-test_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements h<b> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f12960d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f12961a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e0 f12962b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<InterfaceC27642e> f12963c;

    /* compiled from: AvCallsNetworkTestAbTestsImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPJ/d$a;", "", "<init>", "()V", "_avito_iac-avcalls-network-test_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k e eVar, @k e0 e0Var, @k Provider provider) {
        this.f12961a = eVar;
        this.f12962b = e0Var;
        this.f12963c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        RJ.a aVar = (RJ.a) this.f12961a.get();
        c0 c0Var = (c0) this.f12962b.get();
        InterfaceC27642e interfaceC27642e = this.f12963c.get();
        f12960d.getClass();
        return new b(aVar, c0Var, interfaceC27642e);
    }
}
