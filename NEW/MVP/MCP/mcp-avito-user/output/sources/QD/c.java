package qD;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.e0;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import pD.C46934a;
import pD.C46936c;

/* compiled from: AutotekaAbTestsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LqD/c;", "Ldagger/internal/h;", "LqD/b;", "a", "_avito-discouraged_avito-feature_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f429129d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C46936c f429130a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e0 f429131b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<InterfaceC27642e> f429132c;

    /* compiled from: AutotekaAbTestsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqD/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k C46936c c46936c, @k e0 e0Var, @k Provider provider) {
        this.f429130a = c46936c;
        this.f429131b = e0Var;
        this.f429132c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C46934a c46934a = (C46934a) this.f429130a.get();
        c0 c0Var = (c0) this.f429131b.get();
        InterfaceC27642e interfaceC27642e = this.f429132c.get();
        f429129d.getClass();
        return new b(c46934a, c0Var, interfaceC27642e);
    }
}
