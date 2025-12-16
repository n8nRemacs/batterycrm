package com.avito.android.onboarding;

import com.avito.android.C36135w2;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import t3.InterfaceC48480k;

/* compiled from: BxOnboardingStepInteractorProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/G;", "Lcom/avito/android/onboarding/F;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class G implements F {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f208658a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f208659b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f208660c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E f208661d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final E f208662e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final E f208663f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final E f208664g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final E f208665h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final E f208666i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final E f208667j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final E f208668k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final E f208669l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final E f208670m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final u3.g<SimpleTestGroupWithNone> f208671n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f208672o = C42727D.c(new b());

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f208673p = C42727D.c(new c());

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f208674q = C42727D.c(new d());

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f208675r = C42727D.c(new a());

    /* compiled from: BxOnboardingStepInteractorProvider.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Ljava/lang/Class;", "Lcom/avito/android/onboarding/E;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<Map<Class<? extends E>, ? extends E>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<Class<? extends E>, ? extends E> invoke() {
            G g12 = G.this;
            return P0.k(P0.k(g12.a(), g12.c()), g12.b());
        }
    }

    /* compiled from: BxOnboardingStepInteractorProvider.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Ljava/lang/Class;", "Lcom/avito/android/onboarding/E;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<Map<Class<? extends E>, ? extends E>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Map<Class<? extends E>, ? extends E> invoke() {
            G g12 = G.this;
            if (g12.f208658a.w().invoke().booleanValue()) {
                return G.d(g12, g12.f208666i, g12.f208659b, g12.f208661d, !g12.f208671n.f439742a.f439749b.a() ? g12.f208660c : null, g12.f208662e, g12.f208663f);
            }
            return P0.c();
        }
    }

    /* compiled from: BxOnboardingStepInteractorProvider.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Ljava/lang/Class;", "Lcom/avito/android/onboarding/E;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<Map<Class<? extends E>, ? extends E>> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Map<Class<? extends E>, ? extends E> invoke() {
            G g12 = G.this;
            C36135w2 c36135w2 = g12.f208658a;
            c36135w2.getClass();
            kotlin.reflect.n<Object> nVar = C36135w2.f327457X[38];
            if (!((Boolean) c36135w2.f327466I.a().invoke()).booleanValue()) {
                return P0.c();
            }
            return G.d(g12, g12.f208667j, g12.f208668k, g12.f208669l, g12.f208670m);
        }
    }

    /* compiled from: BxOnboardingStepInteractorProvider.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Ljava/lang/Class;", "Lcom/avito/android/onboarding/E;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Map<Class<? extends E>, ? extends E>> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Map<Class<? extends E>, ? extends E> invoke() {
            G g12 = G.this;
            return g12.f208658a.w().invoke().booleanValue() ? G.d(g12, g12.f208664g, g12.f208665h) : P0.c();
        }
    }

    @Inject
    public G(@Y61.k C36135w2 c36135w2, @InterfaceC32918b @Y61.k E e12, @B @Y61.k E e13, @InterfaceC32917a @Y61.k E e14, @Y61.k @x E e15, @A @Y61.k E e16, @z @Y61.k E e17, @y @Y61.k E e18, @D @Y61.k E e19, @I @Y61.k E e22, @Y61.k @C E e23, @w @Y61.k E e24, @J @Y61.k E e25, @InterfaceC48480k @Y61.k u3.g<SimpleTestGroupWithNone> gVar) {
        this.f208658a = c36135w2;
        this.f208659b = e12;
        this.f208660c = e13;
        this.f208661d = e14;
        this.f208662e = e15;
        this.f208663f = e16;
        this.f208664g = e17;
        this.f208665h = e18;
        this.f208666i = e19;
        this.f208667j = e22;
        this.f208668k = e23;
        this.f208669l = e24;
        this.f208670m = e25;
        this.f208671n = gVar;
    }

    public static final LinkedHashMap d(G g12, E... eArr) {
        g12.getClass();
        ArrayList arrayListB = C42756l.B(eArr);
        int iF2 = P0.f(C42745f0.q(arrayListB, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((E) next).getClass(), next);
        }
        return linkedHashMap;
    }

    @Override // com.avito.android.onboarding.F
    @Y61.k
    public final Map<Class<? extends E>, E> a() {
        return (Map) this.f208672o.getValue();
    }

    @Override // com.avito.android.onboarding.F
    @Y61.k
    public final Map<Class<? extends E>, E> b() {
        return (Map) this.f208674q.getValue();
    }

    @Override // com.avito.android.onboarding.F
    @Y61.k
    public final Map<Class<? extends E>, E> c() {
        return (Map) this.f208673p.getValue();
    }

    @Override // com.avito.android.onboarding.F
    @Y61.k
    public final Map<Class<? extends E>, E> getAll() {
        return (Map) this.f208675r.getValue();
    }
}
