package on0;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.e0;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import nn0.C44453a;
import nn0.C44455c;

/* compiled from: MotivationProgramAbTestsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lon0/c;", "Ldagger/internal/h;", "Lon0/b;", "a", "_avito-discouraged_avito-feature_reward-program"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: on0.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44829c implements h<C44828b> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f420177d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e0 f420178a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<InterfaceC27642e> f420179b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C44455c f420180c;

    /* compiled from: MotivationProgramAbTestsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lon0/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_reward-program"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: on0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C44829c(@k e0 e0Var, @k Provider provider, @k C44455c c44455c) {
        this.f420178a = e0Var;
        this.f420179b = provider;
        this.f420180c = c44455c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c0 c0Var = (c0) this.f420178a.get();
        InterfaceC27642e interfaceC27642e = this.f420179b.get();
        C44453a c44453a = (C44453a) this.f420180c.get();
        f420177d.getClass();
        return new C44828b(c0Var, interfaceC27642e, c44453a);
    }
}
