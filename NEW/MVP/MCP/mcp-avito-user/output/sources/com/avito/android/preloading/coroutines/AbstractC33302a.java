package com.avito.android.preloading.coroutines;

import com.avito.android.analytics.InterfaceC28373a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: CoroutinesPreloadingPromise.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/preloading/coroutines/a;", "", "Params", "Response", "a", "b", "_common_preloading-promise"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.preloading.coroutines.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC33302a<Params, Response> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final C6710a f221798g = new C6710a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l<Params, Response> f221799a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final T f221800b;

    /* renamed from: c, reason: collision with root package name */
    public final int f221801c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final p f221802d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public b<? extends Params, ? extends Response> f221803e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Object f221804f;

    /* compiled from: CoroutinesPreloadingPromise.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/preloading/coroutines/a$a;", "", "<init>", "()V", "", "SUBSCRIBER_TIMEOUT", "J", "_common_preloading-promise"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.preloading.coroutines.a$a, reason: collision with other inner class name */
    public static final class C6710a {
        public /* synthetic */ C6710a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static AbstractC33302a a(@Y61.k Object obj, @Y61.k l lVar, @Y61.k C43238h c43238h, @Y61.k com.avito.android.util.C c12, boolean z12, int i12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k String str) {
            if (!z12) {
                return new n(lVar, c43238h, i12, new w());
            }
            m mVar = new m(lVar, c43238h, i12, new q(c12.s(), str, interfaceC28373a));
            mVar.a(obj);
            return mVar;
        }

        public static /* synthetic */ AbstractC33302a b(C6710a c6710a, Object obj, l lVar, com.avito.android.util.C c12, boolean z12, InterfaceC28373a interfaceC28373a, String str) {
            C43238h c43238hA = U.a(EmptyCoroutineContext.INSTANCE);
            c6710a.getClass();
            return a(obj, lVar, c43238hA, c12, z12, 30, interfaceC28373a, str);
        }

        public C6710a() {
        }
    }

    /* compiled from: CoroutinesPreloadingPromise.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\n\b\u0002\u0010\u0002 \u0001*\u00020\u0001*\n\b\u0003\u0010\u0003 \u0001*\u00020\u00012\u00020\u0001:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/preloading/coroutines/a$b;", "", "Params", "Response", "<init>", "()V", "a", "b", "Lcom/avito/android/preloading/coroutines/a$b$a;", "Lcom/avito/android/preloading/coroutines/a$b$b;", "_common_preloading-promise"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.preloading.coroutines.a$b */
    public static abstract class b<Params, Response> {

        /* compiled from: CoroutinesPreloadingPromise.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/preloading/coroutines/a$b$a;", "Lcom/avito/android/preloading/coroutines/a$b;", "", "<init>", "()V", "_common_preloading-promise"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.preloading.coroutines.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C6711a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C6711a f221805a = new C6711a();

            public C6711a() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C6711a);
            }

            public final int hashCode() {
                return 932393121;
            }

            @Y61.k
            public final String toString() {
                return "Idle";
            }
        }

        /* compiled from: CoroutinesPreloadingPromise.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0004\u0010\u0002 \u0001*\u00020\u0001*\n\b\u0005\u0010\u0003 \u0001*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/preloading/coroutines/a$b$b;", "", "Params", "Response", "Lcom/avito/android/preloading/coroutines/a$b;", "_common_preloading-promise"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.preloading.coroutines.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C6712b<Params, Response> extends b<Params, Response> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Params f221806a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final InterfaceC43160i<G<Response>> f221807b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final N0 f221808c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f221809d;

            public /* synthetic */ C6712b(Object obj, InterfaceC43160i interfaceC43160i, N0 n02, boolean z12, int i12, C42822w c42822w) {
                this(obj, interfaceC43160i, n02, (i12 & 8) != 0 ? false : z12);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6712b)) {
                    return false;
                }
                C6712b c6712b = (C6712b) obj;
                return L.f(this.f221806a, c6712b.f221806a) && L.f(this.f221807b, c6712b.f221807b) && L.f(this.f221808c, c6712b.f221808c) && this.f221809d == c6712b.f221809d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f221809d) + ((this.f221808c.hashCode() + ((this.f221807b.hashCode() + (this.f221806a.hashCode() * 31)) * 31)) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("StartedLoading(currentParams=");
                sb2.append(this.f221806a);
                sb2.append(", flow=");
                sb2.append(this.f221807b);
                sb2.append(", job=");
                sb2.append(this.f221808c);
                sb2.append(", hasSubscriber=");
                return androidx.appcompat.app.r.x(sb2, this.f221809d, ')');
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C6712b(@Y61.k Params params, @Y61.k InterfaceC43160i<? extends G<? extends Response>> interfaceC43160i, @Y61.k N0 n02, boolean z12) {
                super(null);
                this.f221806a = params;
                this.f221807b = interfaceC43160i;
                this.f221808c = n02;
                this.f221809d = z12;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: CoroutinesPreloadingPromise.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Params", "", "Response", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.preloading.coroutines.a$c */
    public static final class c extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f221810l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Preloading promise already in progress";
        }
    }

    /* compiled from: CoroutinesPreloadingPromise.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Params", "Response", "Lcom/avito/android/preloading/coroutines/a$b;", "it", "", "invoke", "(Lcom/avito/android/preloading/coroutines/a$b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.preloading.coroutines.a$d */
    public static final class d extends N implements Y41.l<b<? extends Params, ? extends Response>, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f221811l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((b) obj) instanceof b.C6711a);
        }
    }

    /* compiled from: CoroutinesPreloadingPromise.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Params", "Response", "Lcom/avito/android/preloading/coroutines/a$b;", "invoke", "()Lcom/avito/android/preloading/coroutines/a$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.preloading.coroutines.a$e */
    public static final class e extends N implements Y41.a<b<? extends Params, ? extends Response>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Params f221812l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d2<G<Response>> f221813m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AbstractC33302a<Params, Response> f221814n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Params params, d2<? extends G<? extends Response>> d2Var, AbstractC33302a<Params, Response> abstractC33302a) {
            super(0);
            this.f221812l = params;
            this.f221813m = d2Var;
            this.f221814n = abstractC33302a;
        }

        @Override // Y41.a
        public final Object invoke() {
            T t12 = this.f221814n.f221800b;
            d2<G<Response>> d2Var = this.f221813m;
            return new b.C6712b(this.f221812l, d2Var, C43175k.K(d2Var, t12), false, 8, null);
        }
    }

    /* compiled from: CoroutinesPreloadingPromise.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Params", "", "Response", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.preloading.coroutines.a$f */
    public static final class f extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f221815l = new f();

        public f() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Preloading promise is in wrong state";
        }
    }

    public AbstractC33302a(@Y61.k l<Params, Response> lVar, @Y61.k T t12, int i12, @Y61.k p pVar) {
        this.f221799a = lVar;
        this.f221800b = t12;
        this.f221801c = i12;
        this.f221802d = pVar;
        this.f221803e = b.C6711a.f221805a;
        this.f221804f = new Object();
    }

    public final void a(@Y61.k Params params) {
        b<? extends Params, ? extends Response> bVar;
        synchronized (this.f221804f) {
            bVar = this.f221803e;
        }
        boolean zF2 = L.f(bVar, b.C6711a.f221805a);
        B.f221784a.getClass();
        this.f221802d.a(zF2, A.f221783l, c.f221810l);
        InterfaceC43160i interfaceC43160iG = C43175k.G(new E(this.f221799a.a(params), null));
        i2.f411430a.getClass();
        d2 d2VarS = C43175k.S(interfaceC43160iG, this.f221800b, i2.a.a(3000L, 0L), this.f221801c);
        b(new e(params, d2VarS, this), d.f221811l);
    }

    public final void b(Y41.a aVar, Y41.l lVar) {
        b<? extends Params, ? extends Response> bVar;
        synchronized (this.f221804f) {
            synchronized (this.f221804f) {
                bVar = this.f221803e;
            }
            this.f221802d.a(((Boolean) lVar.invoke(bVar)).booleanValue(), null, f.f221815l);
            this.f221803e = (b) aVar.invoke();
            G0 g02 = G0.f406611a;
        }
    }

    public /* synthetic */ AbstractC33302a(l lVar, T t12, int i12, p pVar, int i13, C42822w c42822w) {
        this(lVar, (i13 & 2) != 0 ? U.a(EmptyCoroutineContext.INSTANCE) : t12, (i13 & 4) != 0 ? 30 : i12, pVar);
    }
}
