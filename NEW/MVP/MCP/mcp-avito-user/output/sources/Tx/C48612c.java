package tX;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.e0;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import yX.C50195a;
import zX.C50519b;

/* compiled from: LoyaltyProgramAbTestsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LtX/c;", "Ldagger/internal/h;", "LtX/b;", "a", "_avito_loyalty-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tX.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48612c implements h<C48611b> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f439262d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C50519b f439263a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e0 f439264b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<InterfaceC27642e> f439265c;

    /* compiled from: LoyaltyProgramAbTestsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LtX/c$a;", "", "<init>", "()V", "_avito_loyalty-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tX.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48612c(@k C50519b c50519b, @k e0 e0Var, @k Provider provider) {
        this.f439263a = c50519b;
        this.f439264b = e0Var;
        this.f439265c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C50195a c50195a = (C50195a) this.f439263a.get();
        c0 c0Var = (c0) this.f439264b.get();
        InterfaceC27642e interfaceC27642e = this.f439265c.get();
        f439262d.getClass();
        return new C48611b(c50195a, c0Var, interfaceC27642e);
    }
}
