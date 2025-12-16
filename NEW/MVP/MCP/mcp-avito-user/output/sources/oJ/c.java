package Oj;

import Rj.C15047a;
import Sj.C15192b;
import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.e0;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BottomNavigationAbTestsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LOj/c;", "Ldagger/internal/h;", "LOj/b;", "a", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f12500d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C15192b f12501a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e0 f12502b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<InterfaceC27642e> f12503c;

    /* compiled from: BottomNavigationAbTestsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOj/c$a;", "", "<init>", "()V", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k C15192b c15192b, @k e0 e0Var, @k Provider provider) {
        this.f12501a = c15192b;
        this.f12502b = e0Var;
        this.f12503c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C15047a c15047a = (C15047a) this.f12501a.get();
        c0 c0Var = (c0) this.f12502b.get();
        InterfaceC27642e interfaceC27642e = this.f12503c.get();
        f12500d.getClass();
        return new b(c15047a, c0Var, interfaceC27642e);
    }
}
