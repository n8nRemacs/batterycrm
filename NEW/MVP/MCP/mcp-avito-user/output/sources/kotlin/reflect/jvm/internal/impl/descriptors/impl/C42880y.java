package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.b;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42880y extends AbstractC42870n implements kotlin.reflect.jvm.internal.impl.descriptors.P {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f407754i;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final G f407755d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.c f407756e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f407757f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f407758g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.i f407759h;

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.y$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            C42880y c42880y = C42880y.this;
            G g12 = c42880y.f407755d;
            g12.U();
            return Boolean.valueOf(kotlin.reflect.jvm.internal.impl.descriptors.N.b((C42869m) g12.f407560l.getValue(), c42880y.f407756e));
        }
    }

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.y$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.K>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.K> invoke() {
            C42880y c42880y = C42880y.this;
            G g12 = c42880y.f407755d;
            g12.U();
            C42869m c42869m = (C42869m) g12.f407560l.getValue();
            ArrayList arrayList = new ArrayList();
            kotlin.reflect.jvm.internal.impl.descriptors.N.a(c42869m, c42880y.f407756e, arrayList);
            return arrayList;
        }
    }

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    @s0
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.y$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.j> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j invoke() {
            C42880y c42880y = C42880y.this;
            if (c42880y.isEmpty()) {
                return j.c.f409687b;
            }
            List<kotlin.reflect.jvm.internal.impl.descriptors.K> listW = c42880y.w();
            ArrayList arrayList = new ArrayList(C42745f0.q(listW, 10));
            Iterator<T> it = listW.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.K) it.next()).n());
            }
            G g12 = c42880y.f407755d;
            kotlin.reflect.jvm.internal.impl.name.c cVar = c42880y.f407756e;
            ArrayList arrayListI0 = C42745f0.i0(new Q(g12, cVar), arrayList);
            b.a aVar = kotlin.reflect.jvm.internal.impl.resolve.scopes.b.f409648d;
            String str = "package view scope for " + cVar + " in " + g12.getName();
            aVar.getClass();
            return b.a.a(arrayListI0, str);
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f407754i = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(C42880y.class), "fragments", "getFragments()Ljava/util/List;")), n0Var.i(new h0(n0Var.b(C42880y.class), "empty", "getEmpty()Z"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42880y(@Y61.k G g12, @Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar) {
        super(g.a.f407524b, cVar.g());
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        this.f407755d = g12;
        this.f407756e = cVar;
        this.f407757f = pVar.g(new b());
        this.f407758g = pVar.g(new a());
        this.f407759h = new kotlin.reflect.jvm.internal.impl.resolve.scopes.i(pVar, new c());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final <R, D> R A(@Y61.k InterfaceC42884m<R, D> interfaceC42884m, D d12) {
        return (R) interfaceC42884m.c(this, d12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.P
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.c d() {
        return this.f407756e;
    }

    public final boolean equals(@Y61.l Object obj) {
        kotlin.reflect.jvm.internal.impl.descriptors.P p12 = obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.P ? (kotlin.reflect.jvm.internal.impl.descriptors.P) obj : null;
        if (p12 == null) {
            return false;
        }
        if (kotlin.jvm.internal.L.f(this.f407756e, p12.d())) {
            return kotlin.jvm.internal.L.f(this.f407755d, p12.h());
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final InterfaceC42882k f() {
        kotlin.reflect.jvm.internal.impl.name.c cVar = this.f407756e;
        if (cVar.d()) {
            return null;
        }
        return this.f407755d.i0(cVar.e());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.P
    public final G h() {
        return this.f407755d;
    }

    public final int hashCode() {
        return this.f407756e.hashCode() + (this.f407755d.hashCode() * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.P
    public final boolean isEmpty() {
        kotlin.reflect.n<Object> nVar = f407754i[1];
        return ((Boolean) this.f407758g.invoke()).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.P
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j n() {
        return this.f407759h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.P
    @Y61.k
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.K> w() {
        kotlin.reflect.n<Object> nVar = f407754i[0];
        return (List) this.f407757f.invoke();
    }
}
