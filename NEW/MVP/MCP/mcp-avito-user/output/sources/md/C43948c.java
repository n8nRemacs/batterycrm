package mD;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.e0;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lD.C43617a;
import lD.C43619c;

/* compiled from: AutoAbTestsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LmD/c;", "Ldagger/internal/h;", "LmD/b;", "a", "_avito-discouraged_avito-feature_auto"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mD.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C43948c implements h<C43947b> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f414406d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43619c f414407a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e0 f414408b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<InterfaceC27642e> f414409c;

    /* compiled from: AutoAbTestsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmD/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_auto"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mD.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C43948c(@k C43619c c43619c, @k e0 e0Var, @k Provider provider) {
        this.f414407a = c43619c;
        this.f414408b = e0Var;
        this.f414409c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C43617a c43617a = (C43617a) this.f414407a.get();
        c0 c0Var = (c0) this.f414408b.get();
        InterfaceC27642e interfaceC27642e = this.f414409c.get();
        f414406d.getClass();
        return new C43947b(c43617a, c0Var, interfaceC27642e);
    }
}
