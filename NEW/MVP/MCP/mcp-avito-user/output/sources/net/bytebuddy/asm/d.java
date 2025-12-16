package net.bytebuddy.asm;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.jar.asm.AbstractC44388a;
import net.bytebuddy.jar.asm.B;
import net.bytebuddy.jar.asm.C;
import net.bytebuddy.jar.asm.f;
import net.bytebuddy.jar.asm.h;
import net.bytebuddy.jar.asm.m;
import net.bytebuddy.jar.asm.p;
import net.bytebuddy.jar.asm.r;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.jar.asm.x;
import net.bytebuddy.pool.TypePool;

/* compiled from: TypeReferenceAdjustment.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes8.dex */
public class d extends AsmVisitorWrapper.a {

    /* compiled from: TypeReferenceAdjustment.java */
    public static class a extends f {

        /* renamed from: d, reason: collision with root package name */
        public final TypePool f415936d;

        /* renamed from: e, reason: collision with root package name */
        public final HashSet f415937e;

        /* renamed from: f, reason: collision with root package name */
        public final HashSet f415938f;

        /* compiled from: TypeReferenceAdjustment.java */
        /* renamed from: net.bytebuddy.asm.d$a$a, reason: collision with other inner class name */
        public class C11951a extends AbstractC44388a {
            public C11951a(AbstractC44388a abstractC44388a) {
                super(net.bytebuddy.utility.e.f418981b, abstractC44388a);
            }

            @Override // net.bytebuddy.jar.asm.AbstractC44388a
            public final void a(Object obj, String str) {
                a.this.s(obj);
                super.a(obj, str);
            }

            @Override // net.bytebuddy.jar.asm.AbstractC44388a
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a b(String str, String str2) {
                a aVar = a.this;
                aVar.f415937e.add(B.v(str2).k());
                AbstractC44388a abstractC44388aB = super.b(str, str2);
                if (abstractC44388aB != null) {
                    return aVar.new C11951a(abstractC44388aB);
                }
                return null;
            }

            @Override // net.bytebuddy.jar.asm.AbstractC44388a
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a c(String str) {
                AbstractC44388a abstractC44388aC = super.c(str);
                if (abstractC44388aC != null) {
                    return a.this.new C11951a(abstractC44388aC);
                }
                return null;
            }

            @Override // net.bytebuddy.jar.asm.AbstractC44388a
            public final void e(String str, String str2, String str3) {
                a.this.f415937e.add(B.v(str2).k());
                super.e(str, str2, str3);
            }
        }

        /* compiled from: TypeReferenceAdjustment.java */
        public class b extends m {
            public b(m mVar) {
                super(net.bytebuddy.utility.e.f418981b, mVar);
            }

            @Override // net.bytebuddy.jar.asm.m
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a a(String str, boolean z12) {
                a aVar = a.this;
                aVar.f415937e.add(B.v(str).k());
                AbstractC44388a abstractC44388aA = super.a(str, z12);
                if (abstractC44388aA != null) {
                    return aVar.new C11951a(abstractC44388aA);
                }
                return null;
            }
        }

        /* compiled from: TypeReferenceAdjustment.java */
        public class c extends s {
            public c(s sVar) {
                super(net.bytebuddy.utility.e.f418981b, sVar);
            }

            @Override // net.bytebuddy.jar.asm.s
            public final void A(String str, String str2, String str3, int i12, boolean z12) {
                a aVar = a.this;
                a.r(aVar, str);
                aVar.u(B.v(str3));
                super.A(str, str2, str3, i12, z12);
            }

            @Override // net.bytebuddy.jar.asm.s
            public final void B(int i12, String str) {
                a.this.u(B.v(str));
                super.B(i12, str);
            }

            @Override // net.bytebuddy.jar.asm.s
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a D(int i12, String str, boolean z12) {
                a aVar = a.this;
                aVar.f415937e.add(B.v(str).k());
                AbstractC44388a abstractC44388aD = super.D(i12, str, z12);
                if (abstractC44388aD != null) {
                    return aVar.new C11951a(abstractC44388aD);
                }
                return null;
            }

            @Override // net.bytebuddy.jar.asm.s
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a F(int i12, @net.bytebuddy.utility.nullability.b C c12, String str, boolean z12) {
                a aVar = a.this;
                aVar.f415937e.add(B.v(str).k());
                AbstractC44388a abstractC44388aF = super.F(i12, c12, str, z12);
                if (abstractC44388aF != null) {
                    return aVar.new C11951a(abstractC44388aF);
                }
                return null;
            }

            @Override // net.bytebuddy.jar.asm.s
            public final void G(r rVar, r rVar2, r rVar3, @net.bytebuddy.utility.nullability.b String str) {
                if (str != null) {
                    a.this.f415937e.add(str);
                }
                super.G(rVar, rVar2, rVar3, str);
            }

            @Override // net.bytebuddy.jar.asm.s
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a H(int i12, @net.bytebuddy.utility.nullability.b C c12, String str, boolean z12) {
                a aVar = a.this;
                aVar.f415937e.add(B.v(str).k());
                AbstractC44388a abstractC44388aH = super.H(i12, c12, str, z12);
                if (abstractC44388aH != null) {
                    return aVar.new C11951a(abstractC44388aH);
                }
                return null;
            }

            @Override // net.bytebuddy.jar.asm.s
            public final void I(int i12, String str) {
                a.r(a.this, str);
                super.I(i12, str);
            }

            @Override // net.bytebuddy.jar.asm.s
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a e(String str, boolean z12) {
                a aVar = a.this;
                aVar.f415937e.add(B.v(str).k());
                AbstractC44388a abstractC44388aE = super.e(str, z12);
                if (abstractC44388aE != null) {
                    return aVar.new C11951a(abstractC44388aE);
                }
                return null;
            }

            @Override // net.bytebuddy.jar.asm.s
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a f() {
                AbstractC44388a abstractC44388aF = super.f();
                if (abstractC44388aF != null) {
                    return a.this.new C11951a(abstractC44388aF);
                }
                return null;
            }

            @Override // net.bytebuddy.jar.asm.s
            public final void j(int i12, String str, String str2, String str3) {
                a aVar = a.this;
                a.r(aVar, str);
                aVar.u(B.v(str3));
                super.j(i12, str, str2, str3);
            }

            @Override // net.bytebuddy.jar.asm.s
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a n(int i12, @net.bytebuddy.utility.nullability.b C c12, String str, boolean z12) {
                a aVar = a.this;
                aVar.f415937e.add(B.v(str).k());
                AbstractC44388a abstractC44388aN = super.n(i12, c12, str, z12);
                if (abstractC44388aN != null) {
                    return aVar.new C11951a(abstractC44388aN);
                }
                return null;
            }

            @Override // net.bytebuddy.jar.asm.s
            public final void p(String str, String str2, p pVar, Object... objArr) {
                B bV2 = B.v(str2);
                a aVar = a.this;
                aVar.u(bV2);
                aVar.t(pVar);
                for (Object obj : objArr) {
                    aVar.s(obj);
                }
                super.p(str, str2, pVar, objArr);
            }

            @Override // net.bytebuddy.jar.asm.s
            public final void t(Object obj) {
                a.this.s(obj);
                super.t(obj);
            }

            @Override // net.bytebuddy.jar.asm.s
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a w(int i12, @net.bytebuddy.utility.nullability.b C c12, r[] rVarArr, r[] rVarArr2, int[] iArr, String str, boolean z12) {
                a aVar = a.this;
                aVar.f415937e.add(B.v(str).k());
                AbstractC44388a abstractC44388aW = super.w(i12, c12, rVarArr, rVarArr2, iArr, str, z12);
                if (abstractC44388aW != null) {
                    return aVar.new C11951a(abstractC44388aW);
                }
                return null;
            }
        }

        public a(f fVar, TypePool typePool) {
            super(net.bytebuddy.utility.e.f418981b, fVar);
            this.f415936d = typePool;
            this.f415937e = new HashSet();
            this.f415938f = new HashSet();
        }

        public static void r(a aVar, String str) {
            aVar.getClass();
            int iLastIndexOf = str.lastIndexOf(91);
            if (iLastIndexOf != -1) {
                str = androidx.compose.ui.graphics.colorspace.e.h(1, iLastIndexOf + 2, str);
            }
            aVar.f415937e.add(str);
        }

        @Override // net.bytebuddy.jar.asm.f
        public final void c(int i12, int i13, String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr) {
            HashSet hashSet = this.f415937e;
            if (str3 != null) {
                hashSet.add(str3);
            }
            if (strArr != null) {
                hashSet.addAll(Arrays.asList(strArr));
            }
            super.c(i12, i13, str, str2, str3, strArr);
        }

        @Override // net.bytebuddy.jar.asm.f
        @net.bytebuddy.utility.nullability.b
        public final AbstractC44388a d(String str, boolean z12) {
            this.f415937e.add(B.v(str).k());
            AbstractC44388a abstractC44388aD = super.d(str, z12);
            if (abstractC44388aD != null) {
                return new C11951a(abstractC44388aD);
            }
            return null;
        }

        @Override // net.bytebuddy.jar.asm.f
        @SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public final void f() {
            Iterator it = this.f415937e.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (this.f415938f.add(str)) {
                    TypePool.Resolution resolutionA = this.f415936d.a(str.replace('/', '.'));
                    if (resolutionA.b()) {
                        resolutionA.a();
                        throw null;
                    }
                }
            }
            super.f();
        }

        @Override // net.bytebuddy.jar.asm.f
        @net.bytebuddy.utility.nullability.b
        public final m g(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b Object obj) {
            m mVarG = super.g(i12, str, str2, str3, obj);
            if (mVarG == null) {
                return null;
            }
            u(B.v(str2));
            return new b(mVarG);
        }

        @Override // net.bytebuddy.jar.asm.f
        public final void h(int i12, String str, String str2, String str3) {
            this.f415938f.add(str);
            super.h(i12, str, str2, str3);
        }

        @Override // net.bytebuddy.jar.asm.f
        @net.bytebuddy.utility.nullability.b
        public final s i(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr) {
            s sVarI = super.i(i12, str, str2, str3, strArr);
            if (sVarI == null) {
                return null;
            }
            u(B.v(str2));
            if (strArr != null) {
                this.f415937e.addAll(Arrays.asList(strArr));
            }
            return new c(sVarI);
        }

        @Override // net.bytebuddy.jar.asm.f
        public final void k(String str) {
            this.f415937e.add(str);
            super.k(str);
        }

        @Override // net.bytebuddy.jar.asm.f
        public final void l(String str) {
            this.f415937e.add(str);
            super.l(str);
        }

        @Override // net.bytebuddy.jar.asm.f
        public final void m(String str, String str2, String str3) {
            this.f415937e.add(str);
            super.m(str, str2, str3);
        }

        @Override // net.bytebuddy.jar.asm.f
        @net.bytebuddy.utility.nullability.b
        public final x o(String str, String str2, @net.bytebuddy.utility.nullability.b String str3) {
            this.f415937e.add(B.v(str2).k());
            return super.o(str, str2, str3);
        }

        @Override // net.bytebuddy.jar.asm.f
        @net.bytebuddy.utility.nullability.b
        public final AbstractC44388a q(int i12, @net.bytebuddy.utility.nullability.b C c12, String str, boolean z12) {
            this.f415937e.add(B.v(str).k());
            AbstractC44388a abstractC44388aQ = super.q(i12, c12, str, z12);
            if (abstractC44388aQ != null) {
                return new C11951a(abstractC44388aQ);
            }
            return null;
        }

        public final void s(Object obj) {
            if (obj instanceof B) {
                u((B) obj);
                return;
            }
            if (obj instanceof p) {
                t((p) obj);
                return;
            }
            if (!(obj instanceof h)) {
                return;
            }
            h hVar = (h) obj;
            B bV2 = B.v(hVar.f418209b);
            String strH = bV2.h();
            u(B.w(B.r(strH), strH.length(), strH));
            int i12 = 0;
            for (B b12 : bV2.c()) {
                u(b12);
            }
            t(hVar.f418210c);
            while (true) {
                Object[] objArr = hVar.f418211d;
                if (i12 >= objArr.length) {
                    return;
                }
                s(objArr[i12]);
                i12++;
            }
        }

        public final void t(p pVar) {
            this.f415937e.add(pVar.f418257b);
            B bV2 = B.v(pVar.f418259d);
            String strH = bV2.h();
            u(B.w(B.r(strH), strH.length(), strH));
            for (B b12 : bV2.c()) {
                u(b12);
            }
        }

        public final void u(B b12) {
            if (b12.t() != 11) {
                while (b12.t() == 9) {
                    b12 = B.w(b12.f418146c + b12.j(), b12.f418147d, b12.f418145b);
                }
                if (b12.t() == 10) {
                    this.f415937e.add(b12.k());
                    return;
                }
                return;
            }
            String strH = b12.h();
            u(B.w(B.r(strH), strH.length(), strH));
            for (B b13 : b12.c()) {
                u(b13);
            }
        }
    }

    @Override // net.bytebuddy.asm.AsmVisitorWrapper
    public final f b(TypeDescription typeDescription, f fVar, Implementation.Context context, TypePool typePool, net.bytebuddy.description.field.b<a.c> bVar, net.bytebuddy.description.method.b<?> bVar2, int i12, int i13) {
        return new a(fVar, typePool);
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        getClass().hashCode();
        throw null;
    }
}
