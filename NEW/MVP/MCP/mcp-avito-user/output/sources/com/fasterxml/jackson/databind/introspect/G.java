package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

/* compiled from: POJOPropertyBuilder.java */
/* loaded from: classes4.dex */
public class G extends u implements Comparable<G> {

    /* renamed from: n, reason: collision with root package name */
    public static final AnnotationIntrospector.ReferenceProperty f341966n = new AnnotationIntrospector.ReferenceProperty(AnnotationIntrospector.ReferenceProperty.Type.f341342b, "");

    /* renamed from: c, reason: collision with root package name */
    public final boolean f341967c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.cfg.m f341968d;

    /* renamed from: e, reason: collision with root package name */
    public final AnnotationIntrospector f341969e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.v f341970f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.v f341971g;

    /* renamed from: h, reason: collision with root package name */
    public f<C36469h> f341972h;

    /* renamed from: i, reason: collision with root package name */
    public f<n> f341973i;

    /* renamed from: j, reason: collision with root package name */
    public f<C36472k> f341974j;

    /* renamed from: k, reason: collision with root package name */
    public f<C36472k> f341975k;

    /* renamed from: l, reason: collision with root package name */
    public transient com.fasterxml.jackson.databind.u f341976l;

    /* renamed from: m, reason: collision with root package name */
    public transient AnnotationIntrospector.ReferenceProperty f341977m;

    /* compiled from: POJOPropertyBuilder.java */
    public class a implements h<Class<?>[]> {
        public a() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.G.h
        public final Class<?>[] a(AbstractC36471j abstractC36471j) {
            return G.this.f341969e.f0(abstractC36471j);
        }
    }

    /* compiled from: POJOPropertyBuilder.java */
    public class b implements h<AnnotationIntrospector.ReferenceProperty> {
        public b() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.G.h
        public final AnnotationIntrospector.ReferenceProperty a(AbstractC36471j abstractC36471j) {
            return G.this.f341969e.Q(abstractC36471j);
        }
    }

    /* compiled from: POJOPropertyBuilder.java */
    public class c implements h<Boolean> {
        public c() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.G.h
        public final Boolean a(AbstractC36471j abstractC36471j) {
            return G.this.f341969e.t0(abstractC36471j);
        }
    }

    /* compiled from: POJOPropertyBuilder.java */
    public class d implements h<D> {
        public d() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.G.h
        public final D a(AbstractC36471j abstractC36471j) {
            G g12 = G.this;
            D dZ2 = g12.f341969e.z(abstractC36471j);
            return dZ2 != null ? g12.f341969e.A(abstractC36471j, dZ2) : dZ2;
        }
    }

    /* compiled from: POJOPropertyBuilder.java */
    public static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f341982a;

        static {
            int[] iArr = new int[JsonProperty.Access.values().length];
            f341982a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f341982a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f341982a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f341982a[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: POJOPropertyBuilder.java */
    public static final class f<T> {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC36471j f341983a;

        /* renamed from: b, reason: collision with root package name */
        public final f<T> f341984b;

        /* renamed from: c, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.v f341985c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f341986d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f341987e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f341988f;

        public f(AbstractC36471j abstractC36471j, f fVar, com.fasterxml.jackson.databind.v vVar, boolean z12, boolean z13, boolean z14) {
            this.f341983a = abstractC36471j;
            this.f341984b = fVar;
            com.fasterxml.jackson.databind.v vVar2 = (vVar == null || vVar.c()) ? null : vVar;
            this.f341985c = vVar2;
            if (z12) {
                if (vVar2 == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                }
                if (vVar.f342656b.isEmpty()) {
                    z12 = false;
                }
            }
            this.f341986d = z12;
            this.f341987e = z13;
            this.f341988f = z14;
        }

        public final f<T> a(f<T> fVar) {
            f<T> fVar2 = this.f341984b;
            return fVar2 == null ? c(fVar) : c(fVar2.a(fVar));
        }

        public final f<T> b() {
            f<T> fVar = this.f341984b;
            if (fVar == null) {
                return this;
            }
            f<T> fVarB = fVar.b();
            if (this.f341985c != null) {
                return fVarB.f341985c == null ? c(null) : c(fVarB);
            }
            if (fVarB.f341985c != null) {
                return fVarB;
            }
            boolean z12 = fVarB.f341987e;
            boolean z13 = this.f341987e;
            return z13 == z12 ? c(fVarB) : z13 ? c(null) : fVarB;
        }

        public final f<T> c(f<T> fVar) {
            if (fVar == this.f341984b) {
                return this;
            }
            return new f<>(this.f341983a, fVar, this.f341985c, this.f341986d, this.f341987e, this.f341988f);
        }

        public final f<T> d() {
            f<T> fVarD;
            boolean z12 = this.f341988f;
            f<T> fVar = this.f341984b;
            if (!z12) {
                return (fVar == null || (fVarD = fVar.d()) == fVar) ? this : c(fVarD);
            }
            if (fVar == null) {
                return null;
            }
            return fVar.d();
        }

        public final f<T> e() {
            if (this.f341984b == null) {
                return this;
            }
            return new f<>(this.f341983a, null, this.f341985c, this.f341986d, this.f341987e, this.f341988f);
        }

        public final f<T> f() {
            f<T> fVar = this.f341984b;
            f<T> fVarF = fVar == null ? null : fVar.f();
            return this.f341987e ? c(fVarF) : fVarF;
        }

        public final String toString() {
            StringBuilder sbZ = androidx.appcompat.app.r.z(this.f341983a.toString(), "[visible=");
            sbZ.append(this.f341987e);
            sbZ.append(",ignore=");
            sbZ.append(this.f341988f);
            sbZ.append(",explicitName=");
            String strS = androidx.appcompat.app.r.s("]", sbZ, this.f341986d);
            f<T> fVar = this.f341984b;
            if (fVar == null) {
                return strS;
            }
            StringBuilder sbZ2 = androidx.appcompat.app.r.z(strS, ", ");
            sbZ2.append(fVar.toString());
            return sbZ2.toString();
        }
    }

    /* compiled from: POJOPropertyBuilder.java */
    public static class g<T extends AbstractC36471j> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public f<T> f341989b;

        public g() {
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f341989b != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            f<T> fVar = this.f341989b;
            if (fVar == null) {
                throw new NoSuchElementException();
            }
            this.f341989b = fVar.f341984b;
            return fVar.f341983a;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: POJOPropertyBuilder.java */
    public interface h<T> {
        T a(AbstractC36471j abstractC36471j);
    }

    public G() {
        throw null;
    }

    public G(com.fasterxml.jackson.databind.cfg.m mVar, AnnotationIntrospector annotationIntrospector, boolean z12, com.fasterxml.jackson.databind.v vVar, com.fasterxml.jackson.databind.v vVar2) {
        this.f341968d = mVar;
        this.f341969e = annotationIntrospector;
        this.f341971g = vVar;
        this.f341970f = vVar2;
        this.f341967c = z12;
    }

    public static boolean C(f fVar) {
        while (fVar != null) {
            if (fVar.f341985c != null && fVar.f341986d) {
                return true;
            }
            fVar = fVar.f341984b;
        }
        return false;
    }

    public static boolean D(f fVar) {
        while (fVar != null) {
            com.fasterxml.jackson.databind.v vVar = fVar.f341985c;
            if (vVar != null && !vVar.f342656b.isEmpty()) {
                return true;
            }
            fVar = fVar.f341984b;
        }
        return false;
    }

    public static boolean E(f fVar) {
        while (fVar != null) {
            if (fVar.f341988f) {
                return true;
            }
            fVar = fVar.f341984b;
        }
        return false;
    }

    public static boolean F(f fVar) {
        while (fVar != null) {
            if (fVar.f341987e) {
                return true;
            }
            fVar = fVar.f341984b;
        }
        return false;
    }

    public static f G(f fVar, r rVar) {
        AbstractC36471j abstractC36471j = (AbstractC36471j) fVar.f341983a.o(rVar);
        f<T> fVar2 = fVar.f341984b;
        if (fVar2 != 0) {
            fVar = fVar.c(G(fVar2, rVar));
        }
        if (abstractC36471j == fVar.f341983a) {
            return fVar;
        }
        return new f(abstractC36471j, fVar.f341984b, fVar.f341985c, fVar.f341986d, fVar.f341987e, fVar.f341988f);
    }

    public static Set J(f fVar, Set set) {
        com.fasterxml.jackson.databind.v vVar;
        while (fVar != null) {
            if (fVar.f341986d && (vVar = fVar.f341985c) != null) {
                if (set == null) {
                    set = new HashSet();
                }
                set.add(vVar);
            }
            fVar = fVar.f341984b;
        }
        return set;
    }

    public static r K(f fVar) {
        r rVar = fVar.f341983a.f342053c;
        f<T> fVar2 = fVar.f341984b;
        return fVar2 != 0 ? r.b(rVar, K(fVar2)) : rVar;
    }

    public static int L(C36472k c36472k) {
        String name = c36472k.f342054e.getName();
        if (!name.startsWith("get") || name.length() <= 3) {
            return (!name.startsWith("is") || name.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    public static r M(int i12, f... fVarArr) {
        r rVarK = K(fVarArr[i12]);
        do {
            i12++;
            if (i12 >= fVarArr.length) {
                return rVarK;
            }
        } while (fVarArr[i12] == null);
        return r.b(rVarK, M(i12, fVarArr));
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final boolean A() {
        return C(this.f341972h) || C(this.f341974j) || C(this.f341975k) || C(this.f341973i);
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final boolean B() {
        Boolean bool = (Boolean) P(new c());
        return bool != null && bool.booleanValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x0023: INVOKE (r11v0 ?? I:java.util.HashMap), (r1v10 ?? I:java.lang.Object), (r8v0 ?? I:java.lang.Object) VIRTUAL call: java.util.HashMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:36)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void H(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x0023: INVOKE (r11v0 ?? I:java.util.HashMap), (r1v10 ?? I:java.lang.Object), (r8v0 ?? I:java.lang.Object) VIRTUAL call: java.util.HashMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:36)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */

    public final C36472k N(C36472k c36472k, C36472k c36472k2) {
        Class<?> declaringClass = c36472k.f342054e.getDeclaringClass();
        Class<?> declaringClass2 = c36472k2.f342054e.getDeclaringClass();
        if (declaringClass != declaringClass2) {
            if (declaringClass.isAssignableFrom(declaringClass2)) {
                return c36472k2;
            }
            if (declaringClass2.isAssignableFrom(declaringClass)) {
                return c36472k;
            }
        }
        String name = c36472k2.f342054e.getName();
        char c12 = 2;
        char c13 = (!name.startsWith("set") || name.length() <= 3) ? (char) 2 : (char) 1;
        String name2 = c36472k.f342054e.getName();
        if (name2.startsWith("set") && name2.length() > 3) {
            c12 = 1;
        }
        if (c13 != c12) {
            return c13 < c12 ? c36472k2 : c36472k;
        }
        AnnotationIntrospector annotationIntrospector = this.f341969e;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.w0(c36472k, c36472k2);
    }

    public final void O(G g12) {
        f<C36469h> fVarA = this.f341972h;
        f<C36469h> fVar = g12.f341972h;
        if (fVarA == null) {
            fVarA = fVar;
        } else if (fVar != null) {
            fVarA = fVarA.a(fVar);
        }
        this.f341972h = fVarA;
        f<n> fVarA2 = this.f341973i;
        f<n> fVar2 = g12.f341973i;
        if (fVarA2 == null) {
            fVarA2 = fVar2;
        } else if (fVar2 != null) {
            fVarA2 = fVarA2.a(fVar2);
        }
        this.f341973i = fVarA2;
        f<C36472k> fVarA3 = this.f341974j;
        f<C36472k> fVar3 = g12.f341974j;
        if (fVarA3 == null) {
            fVarA3 = fVar3;
        } else if (fVar3 != null) {
            fVarA3 = fVarA3.a(fVar3);
        }
        this.f341974j = fVarA3;
        f<C36472k> fVarA4 = this.f341975k;
        f<C36472k> fVar4 = g12.f341975k;
        if (fVarA4 == null) {
            fVarA4 = fVar4;
        } else if (fVar4 != null) {
            fVarA4 = fVarA4.a(fVar4);
        }
        this.f341975k = fVarA4;
    }

    public final <T> T P(h<T> hVar) {
        f<C36472k> fVar;
        f<C36469h> fVar2;
        if (this.f341969e == null) {
            return null;
        }
        if (this.f341967c) {
            f<C36472k> fVar3 = this.f341974j;
            if (fVar3 != null) {
                tA = hVar.a(fVar3.f341983a);
            }
        } else {
            f<n> fVar4 = this.f341973i;
            tA = fVar4 != null ? hVar.a(fVar4.f341983a) : null;
            if (tA == null && (fVar = this.f341975k) != null) {
                tA = hVar.a(fVar.f341983a);
            }
        }
        return (tA != null || (fVar2 = this.f341972h) == null) ? tA : hVar.a(fVar2.f341983a);
    }

    public final AbstractC36471j Q() {
        if (this.f341967c) {
            return l();
        }
        AbstractC36471j abstractC36471jM = m();
        if (abstractC36471jM == null && (abstractC36471jM = s()) == null) {
            abstractC36471jM = o();
        }
        return abstractC36471jM == null ? l() : abstractC36471jM;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final boolean a() {
        return (this.f341973i == null && this.f341975k == null && this.f341972h == null) ? false : true;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final com.fasterxml.jackson.databind.v c() {
        return this.f341970f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(G g12) {
        G g13 = g12;
        if (this.f341973i != null) {
            if (g13.f341973i == null) {
                return -1;
            }
        } else if (g13.f341973i != null) {
            return 1;
        }
        return getName().compareTo(g13.getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final boolean f() {
        return (this.f341974j == null && this.f341972h == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cb  */
    @Override // com.fasterxml.jackson.databind.introspect.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.u getMetadata() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.G.getMetadata():com.fasterxml.jackson.databind.u");
    }

    @Override // com.fasterxml.jackson.databind.util.u
    public final String getName() {
        com.fasterxml.jackson.databind.v vVar = this.f341970f;
        if (vVar == null) {
            return null;
        }
        return vVar.f342656b;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final JsonInclude.a h() {
        AbstractC36471j abstractC36471jL = l();
        AnnotationIntrospector annotationIntrospector = this.f341969e;
        JsonInclude.a aVarL = annotationIntrospector == null ? null : annotationIntrospector.L(abstractC36471jL);
        return aVarL == null ? JsonInclude.a.f340960f : aVarL;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final D i() {
        return (D) P(new d());
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final AnnotationIntrospector.ReferenceProperty j() {
        AnnotationIntrospector.ReferenceProperty referenceProperty = this.f341977m;
        AnnotationIntrospector.ReferenceProperty referenceProperty2 = f341966n;
        if (referenceProperty != null) {
            if (referenceProperty == referenceProperty2) {
                return null;
            }
            return referenceProperty;
        }
        AnnotationIntrospector.ReferenceProperty referenceProperty3 = (AnnotationIntrospector.ReferenceProperty) P(new b());
        if (referenceProperty3 != null) {
            referenceProperty2 = referenceProperty3;
        }
        this.f341977m = referenceProperty2;
        return referenceProperty3;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final Class<?>[] k() {
        return (Class[]) P(new a());
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final n m() {
        f fVar = this.f341973i;
        if (fVar == null) {
            return null;
        }
        do {
            n nVar = (n) fVar.f341983a;
            if (nVar.f342066d instanceof C36467f) {
                return nVar;
            }
            fVar = fVar.f341984b;
        } while (fVar != null);
        return (n) this.f341973i.f341983a;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final Iterator<n> n() {
        f<n> fVar = this.f341973i;
        if (fVar == null) {
            return com.fasterxml.jackson.databind.util.g.f342598c;
        }
        g gVar = new g();
        gVar.f341989b = fVar;
        return gVar;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final C36469h o() {
        f<C36469h> fVar = this.f341972h;
        if (fVar == null) {
            return null;
        }
        C36469h c36469h = (C36469h) fVar.f341983a;
        for (f fVar2 = fVar.f341984b; fVar2 != null; fVar2 = fVar2.f341984b) {
            C36469h c36469h2 = (C36469h) fVar2.f341983a;
            Class<?> declaringClass = c36469h.f342042d.getDeclaringClass();
            Class<?> declaringClass2 = c36469h2.f342042d.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    c36469h = c36469h2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
            }
            throw new IllegalArgumentException("Multiple fields representing property \"" + getName() + "\": " + c36469h.i() + " vs " + c36469h2.i());
        }
        return c36469h;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    @Override // com.fasterxml.jackson.databind.introspect.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.introspect.C36472k p() {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.introspect.G$f<com.fasterxml.jackson.databind.introspect.k> r0 = r7.f341974j
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.fasterxml.jackson.databind.introspect.G$f<T> r1 = r0.f341984b
            if (r1 != 0) goto Lf
            com.fasterxml.jackson.databind.introspect.j r0 = r0.f341983a
            com.fasterxml.jackson.databind.introspect.k r0 = (com.fasterxml.jackson.databind.introspect.C36472k) r0
            return r0
        Lf:
            com.fasterxml.jackson.databind.introspect.j r2 = r0.f341983a
            if (r1 == 0) goto L75
            com.fasterxml.jackson.databind.introspect.k r2 = (com.fasterxml.jackson.databind.introspect.C36472k) r2
            java.lang.reflect.Method r3 = r2.f342054e
            java.lang.Class r3 = r3.getDeclaringClass()
            com.fasterxml.jackson.databind.introspect.j r4 = r1.f341983a
            com.fasterxml.jackson.databind.introspect.k r4 = (com.fasterxml.jackson.databind.introspect.C36472k) r4
            java.lang.reflect.Method r5 = r4.f342054e
            java.lang.Class r5 = r5.getDeclaringClass()
            if (r3 == r5) goto L35
            boolean r6 = r3.isAssignableFrom(r5)
            if (r6 == 0) goto L2e
            goto L41
        L2e:
            boolean r3 = r5.isAssignableFrom(r3)
            if (r3 == 0) goto L35
            goto L42
        L35:
            int r3 = L(r4)
            int r5 = L(r2)
            if (r3 == r5) goto L45
            if (r3 >= r5) goto L42
        L41:
            r0 = r1
        L42:
            com.fasterxml.jackson.databind.introspect.G$f<T> r1 = r1.f341984b
            goto Lf
        L45:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Conflicting getter definitions for property \""
            r1.<init>(r3)
            java.lang.String r3 = r7.getName()
            r1.append(r3)
            java.lang.String r3 = "\": "
            r1.append(r3)
            java.lang.String r2 = r2.i()
            r1.append(r2)
            java.lang.String r2 = " vs "
            r1.append(r2)
            java.lang.String r2 = r4.i()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L75:
            com.fasterxml.jackson.databind.introspect.G$f r0 = r0.e()
            r7.f341974j = r0
            com.fasterxml.jackson.databind.introspect.k r2 = (com.fasterxml.jackson.databind.introspect.C36472k) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.G.p():com.fasterxml.jackson.databind.introspect.k");
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final com.fasterxml.jackson.databind.h q() {
        if (this.f341967c) {
            AbstractC36463b abstractC36463bP = p();
            return (abstractC36463bP == null && (abstractC36463bP = o()) == null) ? com.fasterxml.jackson.databind.type.n.p() : abstractC36463bP.f();
        }
        AbstractC36463b abstractC36463bM = m();
        if (abstractC36463bM == null) {
            C36472k c36472kS = s();
            if (c36472kS != null) {
                return c36472kS.u(0);
            }
            abstractC36463bM = o();
        }
        return (abstractC36463bM == null && (abstractC36463bM = p()) == null) ? com.fasterxml.jackson.databind.type.n.p() : abstractC36463bM.f();
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final Class<?> r() {
        return q().f341930b;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final C36472k s() {
        AbstractC36471j abstractC36471j;
        f<C36472k> fVar = this.f341975k;
        if (fVar == null) {
            return null;
        }
        f<C36472k> fVar2 = fVar.f341984b;
        if (fVar2 == null) {
            return (C36472k) fVar.f341983a;
        }
        while (true) {
            AbstractC36471j abstractC36471j2 = fVar.f341983a;
            if (fVar2 == null) {
                this.f341975k = fVar.e();
                return (C36472k) abstractC36471j2;
            }
            AbstractC36471j abstractC36471j3 = fVar2.f341983a;
            C36472k c36472kN = N((C36472k) abstractC36471j2, (C36472k) abstractC36471j3);
            f<C36472k> fVar3 = fVar2.f341984b;
            if (c36472kN != abstractC36471j2) {
                if (c36472kN != abstractC36471j3) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(abstractC36471j2);
                    arrayList.add(abstractC36471j3);
                    f<C36472k> fVar4 = fVar3;
                    while (true) {
                        abstractC36471j = fVar.f341983a;
                        if (fVar4 == null) {
                            break;
                        }
                        AbstractC36471j abstractC36471j4 = fVar4.f341983a;
                        C36472k c36472kN2 = N((C36472k) abstractC36471j, (C36472k) abstractC36471j4);
                        if (c36472kN2 != abstractC36471j) {
                            if (c36472kN2 == abstractC36471j4) {
                                arrayList.clear();
                                fVar = fVar4;
                            } else {
                                arrayList.add(abstractC36471j4);
                            }
                        }
                        fVar4 = fVar4.f341984b;
                    }
                    if (arrayList.isEmpty()) {
                        this.f341975k = fVar.e();
                        return (C36472k) abstractC36471j;
                    }
                    throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.n("Conflicting setter definitions for property \"", getName(), "\": ", (String) arrayList.stream().map(new F(0)).collect(Collectors.joining(" vs "))));
                }
                fVar = fVar2;
            }
            fVar2 = fVar3;
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final com.fasterxml.jackson.databind.v t() {
        AnnotationIntrospector annotationIntrospector;
        if (Q() == null || (annotationIntrospector = this.f341969e) == null) {
            return null;
        }
        return annotationIntrospector.g0();
    }

    public final String toString() {
        return "[Property '" + this.f341970f + "'; ctors: " + this.f341973i + ", field(s): " + this.f341972h + ", getter(s): " + this.f341974j + ", setter(s): " + this.f341975k + "]";
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final boolean u() {
        return this.f341973i != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final boolean v() {
        return this.f341972h != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final boolean w(com.fasterxml.jackson.databind.v vVar) {
        return this.f341970f.equals(vVar);
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final boolean x() {
        return this.f341975k != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final boolean z() {
        return D(this.f341972h) || D(this.f341974j) || D(this.f341975k) || C(this.f341973i);
    }

    public G(G g12, com.fasterxml.jackson.databind.v vVar) {
        this.f341968d = g12.f341968d;
        this.f341969e = g12.f341969e;
        this.f341971g = g12.f341971g;
        this.f341970f = vVar;
        this.f341972h = g12.f341972h;
        this.f341973i = g12.f341973i;
        this.f341974j = g12.f341974j;
        this.f341975k = g12.f341975k;
        this.f341967c = g12.f341967c;
    }
}
