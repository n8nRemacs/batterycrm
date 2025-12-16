package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42867k;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;
import kotlin.reflect.jvm.internal.impl.types.C42993s;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.q0;

/* compiled from: NotFoundClasses.kt */
/* loaded from: classes8.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.f f407424a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f407425b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.name.c, K> f407426c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.i<a, InterfaceC42851d> f407427d;

    /* compiled from: NotFoundClasses.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.name.b f407428a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<Integer> f407429b;

        public a(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.k List<Integer> list) {
            this.f407428a = bVar;
            this.f407429b = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f407428a, aVar.f407428a) && kotlin.jvm.internal.L.f(this.f407429b, aVar.f407429b);
        }

        public final int hashCode() {
            return this.f407429b.hashCode() + (this.f407428a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClassRequest(classId=");
            sb2.append(this.f407428a);
            sb2.append(", typeParametersCount=");
            return androidx.compose.foundation.H.p(sb2, this.f407429b, ')');
        }
    }

    /* compiled from: NotFoundClasses.kt */
    @s0
    public static final class b extends AbstractC42867k {

        /* renamed from: i, reason: collision with root package name */
        public final boolean f407430i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final ArrayList f407431j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final C42993s f407432k;

        public b(@Y61.k kotlin.reflect.jvm.internal.impl.storage.f fVar, @Y61.k InterfaceC42852e interfaceC42852e, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar2, boolean z12, int i12) {
            super(fVar, interfaceC42852e, fVar2, b0.f407539a);
            this.f407430i = z12;
            kotlin.ranges.l lVarR = kotlin.ranges.s.r(0, i12);
            ArrayList arrayList = new ArrayList(C42745f0.q(lVarR, 10));
            kotlin.ranges.k it = lVarR.iterator();
            while (it.f406910d) {
                int iA2 = it.a();
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
                arrayList.add(kotlin.reflect.jvm.internal.impl.descriptors.impl.U.I0(this, g.a.f407524b, Variance.f410069d, kotlin.reflect.jvm.internal.impl.name.f.e("T" + iA2), iA2, fVar));
            }
            this.f407431j = arrayList;
            List<g0> listB = h0.b(this);
            int i13 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
            this.f407432k = new C42993s(this, listB, Collections.singleton(kotlin.reflect.jvm.internal.impl.resolve.j.d(this).m().e()), fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
        @Y61.k
        public final Collection<InterfaceC42850c> G() {
            return B0.f406639b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
        @Y61.l
        public final i0<kotlin.reflect.jvm.internal.impl.types.Y> I() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
        public final boolean M() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.A
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j N(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
            return j.c.f409687b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
        public final boolean O() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j P() {
            return j.c.f409687b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
        public final boolean W() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g
        public final boolean Y() {
            return this.f407430i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
            return g.a.f407524b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
        @Y61.k
        public final ClassKind getKind() {
            return ClassKind.f407413b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42886o, kotlin.reflect.jvm.internal.impl.descriptors.B
        @Y61.k
        public final AbstractC42900s getVisibility() {
            return r.f407789e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.B
        @Y61.k
        public final Modality i() {
            return Modality.f407439c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42867k, kotlin.reflect.jvm.internal.impl.descriptors.B
        public final boolean isExternal() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
        public final boolean isInline() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f
        public final q0 l() {
            return this.f407432k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
        @Y61.k
        public final Collection<InterfaceC42851d> q0() {
            return C42784z0.f406748b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g
        @Y61.k
        public final List<g0> r() {
            return this.f407431j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
        @Y61.l
        public final InterfaceC42850c t() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
        public final boolean t0() {
            return false;
        }

        @Y61.k
        public final String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
        public final boolean v0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
        public final boolean w0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
        @Y61.l
        public final InterfaceC42851d x0() {
            return null;
        }
    }

    public H(@Y61.k kotlin.reflect.jvm.internal.impl.storage.f fVar, @Y61.k E e12) {
        this.f407424a = fVar;
        this.f407425b = e12;
        this.f407426c = fVar.c(new J(this));
        this.f407427d = fVar.c(new I(this));
    }

    @Y61.k
    public final InterfaceC42851d a(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.k List<Integer> list) {
        return this.f407427d.invoke(new a(bVar, list));
    }
}
