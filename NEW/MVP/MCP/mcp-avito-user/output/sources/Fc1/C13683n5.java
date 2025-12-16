package Fc1;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: Fc1.n5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13683n5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L3 f5701a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f5702b = new a();

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public C13629h5 f5703c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final b f5704d;

    /* renamed from: Fc1.n5$a */
    public static final class a implements InterfaceC13654k3 {
        public a() {
        }
    }

    /* renamed from: Fc1.n5$b */
    public static final class b implements N1 {
        public b() {
        }

        @Override // Fc1.N1
        public final void a() {
            C13683n5 c13683n5 = C13683n5.this;
            c13683n5.f5703c = null;
            c13683n5.f5701a.a(null);
        }
    }

    @Inject
    public C13683n5(@Y61.k L3 l32) {
        this.f5701a = l32;
        kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
        this.f5704d = new b();
    }
}
