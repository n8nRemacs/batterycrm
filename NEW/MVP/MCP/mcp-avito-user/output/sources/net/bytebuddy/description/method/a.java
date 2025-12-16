package net.bytebuddy.description.method;

import c61.C26950c;
import com.yandex.div2.D8;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.k;
import net.bytebuddy.description.TypeVariableSource;
import net.bytebuddy.description.a;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.annotation.AnnotationValue;
import net.bytebuddy.description.annotation.a;
import net.bytebuddy.description.b;
import net.bytebuddy.description.c;
import net.bytebuddy.description.d;
import net.bytebuddy.description.method.c;
import net.bytebuddy.description.method.d;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.description.modifier.a;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d.e.a;
import net.bytebuddy.description.type.d;
import net.bytebuddy.jar.asm.B;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.M;
import net.bytebuddy.matcher.V;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;

/* compiled from: MethodDescription.java */
/* loaded from: classes8.dex */
public interface a extends TypeVariableSource, b.a, c.InterfaceC11968c, d.b, net.bytebuddy.description.a, a.b<d, h> {

    /* compiled from: MethodDescription.java */
    /* renamed from: net.bytebuddy.description.method.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC11974a extends TypeVariableSource.a implements a {

        /* renamed from: b, reason: collision with root package name */
        public transient /* synthetic */ int f416168b;

        @Override // net.bytebuddy.description.method.a
        public boolean C() {
            return (v0() || d0()) ? false : true;
        }

        @Override // net.bytebuddy.description.method.a
        public final boolean K(j jVar) {
            net.bytebuddy.description.type.d dVarF1 = getParameters().p2().f1();
            List<? extends TypeDescription> list = jVar.f416207b;
            if (dVarF1.size() != list.size()) {
                return false;
            }
            for (int i12 = 0; i12 < dVarF1.size(); i12++) {
                if (!dVarF1.get(i12).equals(list.get(i12)) && (dVarF1.get(i12).w5() || list.get(i12).w5())) {
                    return false;
                }
            }
            TypeDescription typeDescriptionF5 = getReturnType().f5();
            TypeDescription typeDescription = jVar.f416206a;
            return typeDescriptionF5.equals(typeDescription) || !(typeDescriptionF5.w5() || typeDescription.w5());
        }

        @Override // net.bytebuddy.description.a
        public final boolean P(TypeDescription typeDescription) {
            if (q0() || n().f5().o0(typeDescription)) {
                if (x0(1) || typeDescription.equals(n().f5())) {
                    return true;
                }
                if (!x0(2) && typeDescription.Y3(n().f5())) {
                    return true;
                }
            }
            return x0(2) && typeDescription.Y5(n().f5());
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public final boolean Q() {
            return !r().isEmpty();
        }

        @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.d
        public final String R() {
            return C() ? getName() : "";
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public final boolean T() {
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:118:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
        /* JADX WARN: Removed duplicated region for block: B:132:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        @Override // net.bytebuddy.description.method.a
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean Z(net.bytebuddy.description.annotation.AnnotationValue<?, ?> r9) {
            /*
                Method dump skipped, instructions count: 436
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.description.method.a.AbstractC11974a.Z(net.bytebuddy.description.annotation.AnnotationValue):boolean");
        }

        @Override // net.bytebuddy.description.a.b
        public final a.InterfaceC11963a a(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
            TypeDescription.Generic generic;
            TypeDescription.Generic genericL = l();
            String strV = V();
            int modifiers = getModifiers();
            a.InterfaceC11963a.C11964a c11964aC = r().c(abstractC12113a);
            TypeDescription.Generic generic2 = (TypeDescription.Generic) getReturnType().h0(new TypeDescription.Generic.Visitor.d.b(abstractC12113a));
            a.InterfaceC11963a.C11964a c11964aC2 = getParameters().c(abstractC12113a);
            d.f fVarH0 = N().h0(new TypeDescription.Generic.Visitor.d.b(abstractC12113a));
            net.bytebuddy.description.annotation.a declaredAnnotations = getDeclaredAnnotations();
            AnnotationValue<?, ?> defaultValue = getDefaultValue();
            if (genericL == null) {
                TypeDescription.Generic.d.b bVar = TypeDescription.Generic.f416323x2;
                generic = null;
            } else {
                generic = (TypeDescription.Generic) genericL.h0(new TypeDescription.Generic.Visitor.d.b(abstractC12113a));
            }
            return new h(strV, modifiers, c11964aC, generic2, c11964aC2, fVarH0, declaredAnnotations, defaultValue, generic);
        }

        @Override // net.bytebuddy.description.method.a
        public final int b0(boolean z12, Visibility visibility) {
            return new a.e(Collections.singleton(getVisibility().c(visibility))).a(f(z12));
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        @net.bytebuddy.utility.nullability.b
        public final TypeVariableSource c0() {
            if (x0(8)) {
                return null;
            }
            return n().f5();
        }

        @Override // net.bytebuddy.description.method.a
        public final int d() {
            return getModifiers() | (getDeclaredAnnotations().isAnnotationPresent(Deprecated.class) ? 131072 : 0);
        }

        @Override // net.bytebuddy.description.method.a
        public boolean d0() {
            return "<clinit>".equals(V());
        }

        @Override // net.bytebuddy.description.method.a
        public final g e() {
            return new g(V(), getReturnType().f5(), getParameters().p2().f1());
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return V().equals(aVar.V()) && n().equals(aVar.n()) && getReturnType().f5().equals(aVar.getReturnType().f5()) && getParameters().p2().f1().equals(aVar.getParameters().p2().f1());
        }

        @Override // net.bytebuddy.description.method.a
        public final int f(boolean z12) {
            return z12 ? d() & (-1281) : (d() & (-257)) | 1024;
        }

        @Override // net.bytebuddy.description.method.a
        public final j f0() {
            return new j(getReturnType().f5(), getParameters().p2().f1());
        }

        @Override // net.bytebuddy.description.d.a
        public String getDescriptor() {
            StringBuilder sb2 = new StringBuilder("(");
            Iterator<TypeDescription> it = getParameters().p2().f1().iterator();
            while (it.hasNext()) {
                sb2.append(it.next().getDescriptor());
            }
            sb2.append(')');
            sb2.append(getReturnType().f5().getDescriptor());
            return sb2.toString();
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public String getName() {
            return C() ? V() : n().f5().getName();
        }

        @Override // net.bytebuddy.description.d.a
        @net.bytebuddy.utility.nullability.b
        public String h() {
            try {
                C26950c c26950c = new C26950c();
                boolean z12 = false;
                for (TypeDescription.Generic generic : r()) {
                    c26950c.h(generic.g0());
                    boolean z13 = true;
                    for (TypeDescription.Generic generic2 : generic.getUpperBounds()) {
                        if (!z13) {
                            c26950c.k();
                        }
                        generic2.h0(new TypeDescription.Generic.Visitor.b(c26950c));
                        z13 = false;
                    }
                    z12 = true;
                }
                for (TypeDescription.Generic generic3 : getParameters().p2()) {
                    c26950c.l();
                    generic3.h0(new TypeDescription.Generic.Visitor.b(c26950c));
                    z12 = z12 || !generic3.o().b();
                }
                TypeDescription.Generic returnType = getReturnType();
                c26950c.m();
                returnType.h0(new TypeDescription.Generic.Visitor.b(c26950c));
                boolean z14 = z12 || !returnType.o().b();
                d.f fVarN = N();
                if (!fVarN.P1(new M(new V(C44411u.f(TypeDefinition.Sort.f416307b)))).isEmpty()) {
                    for (TypeDescription.Generic generic4 : fVarN) {
                        c26950c.g();
                        generic4.h0(new TypeDescription.Generic.Visitor.b(c26950c));
                        z14 = z14 || !generic4.o().b();
                    }
                }
                if (z14) {
                    return c26950c.f57665a.toString();
                }
                return null;
            } catch (GenericSignatureFormatError unused) {
                return null;
            }
        }

        @k.c
        public final int hashCode() {
            int iHashCode;
            if (this.f416168b != 0) {
                iHashCode = 0;
            } else {
                iHashCode = ((getReturnType().f5().hashCode() + ((V().hashCode() + ((n().hashCode() + 17) * 31)) * 31)) * 31) + getParameters().p2().f1().hashCode();
            }
            if (iHashCode == 0) {
                return this.f416168b;
            }
            this.f416168b = iHashCode;
            return iHashCode;
        }

        @Override // net.bytebuddy.description.method.a
        public final boolean i0() {
            return (x0(1024) || y() || !n().E()) ? false : true;
        }

        @Override // net.bytebuddy.description.a
        public final boolean o0(TypeDescription typeDescription) {
            if (q0() || n().f5().o0(typeDescription)) {
                if (x0(1) || typeDescription.equals(n().f5())) {
                    return true;
                }
                if (x0(4) && n().f5().Z5(typeDescription)) {
                    return true;
                }
                if (!x0(2) && typeDescription.Y3(n().f5())) {
                    return true;
                }
                if (x0(2) && typeDescription.Y5(n().f5())) {
                    return true;
                }
            }
            return false;
        }

        @Override // net.bytebuddy.description.method.a
        public final int p() {
            return getParameters().p2().p() + (!x0(8) ? 1 : 0);
        }

        @Override // net.bytebuddy.description.method.a
        public final boolean q0() {
            return (v0() || x0(2) || b() || d0()) ? false : true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            if (net.bytebuddy.description.type.TypeDescription.b.y0(r0, r1) == false) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
        @Override // net.bytebuddy.description.method.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean r0() {
            /*
                Method dump skipped, instructions count: 297
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.description.method.a.AbstractC11974a.r0():boolean");
        }

        @Override // net.bytebuddy.description.method.a
        public final boolean s(TypeDescription typeDescription) {
            if (x0(8)) {
                return false;
            }
            return (x0(2) || v0()) ? n().equals(typeDescription) : !x0(1024) && n().f5().Z5(typeDescription);
        }

        @Override // net.bytebuddy.description.method.a
        public final boolean t0(TypeDescription typeDescription) {
            return !x0(8) && !d0() && o0(typeDescription) && (!q0() ? !n().f5().equals(typeDescription) : !n().f5().Z5(typeDescription));
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            int modifiers = getModifiers() & 1343;
            if (modifiers != 0) {
                sb2.append(Modifier.toString(modifiers));
                sb2.append(' ');
            }
            if (C()) {
                sb2.append(getReturnType().f5().R());
                sb2.append(' ');
                sb2.append(n().f5().R());
                sb2.append('.');
            }
            sb2.append(getName());
            sb2.append('(');
            boolean z12 = true;
            boolean z13 = true;
            for (TypeDescription typeDescription : getParameters().p2().f1()) {
                if (z13) {
                    z13 = false;
                } else {
                    sb2.append(',');
                }
                sb2.append(typeDescription.R());
            }
            sb2.append(')');
            net.bytebuddy.description.type.d dVarF1 = N().f1();
            if (!dVarF1.isEmpty()) {
                sb2.append(" throws ");
                for (TypeDescription typeDescription2 : dVarF1) {
                    if (z12) {
                        z12 = false;
                    } else {
                        sb2.append(',');
                    }
                    sb2.append(typeDescription2.R());
                }
            }
            return sb2.toString();
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public final Object v(TypeDescription.Generic.Visitor.d.e.b bVar) {
            i();
            return TypeDescription.Generic.Visitor.d.e.this.new a(bVar.f416427b);
        }

        @Override // net.bytebuddy.description.method.a
        public boolean v0() {
            return "<init>".equals(V());
        }
    }

    /* compiled from: MethodDescription.java */
    public static class b extends d.AbstractC11975a.b<Constructor<?>> implements c.b.f {

        /* renamed from: f, reason: collision with root package name */
        public transient /* synthetic */ d.a f416169f;

        /* renamed from: g, reason: collision with root package name */
        public transient /* synthetic */ a.d f416170g;

        /* renamed from: h, reason: collision with root package name */
        public transient /* synthetic */ Annotation[][] f416171h;

        public b() {
            throw null;
        }

        @Override // net.bytebuddy.description.method.a
        public final d.f N() {
            return new d.f.C12004f((Constructor) this.f416177c);
        }

        @Override // net.bytebuddy.description.method.c.b.f
        @k.c
        public final Annotation[][] S() {
            Annotation[][] parameterAnnotations = this.f416171h != null ? null : ((Constructor) this.f416177c).getParameterAnnotations();
            if (parameterAnnotations == null) {
                return this.f416171h;
            }
            this.f416171h = parameterAnnotations;
            return parameterAnnotations;
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public final String V() {
            return "<init>";
        }

        @Override // net.bytebuddy.description.method.a.AbstractC11974a, net.bytebuddy.description.method.a
        public final boolean d0() {
            return false;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        @k.c
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            a.d dVar = this.f416170g != null ? null : new a.d(((Constructor) this.f416177c).getDeclaredAnnotations());
            if (dVar == null) {
                return this.f416170g;
            }
            this.f416170g = dVar;
            return dVar;
        }

        @Override // net.bytebuddy.description.method.a
        @net.bytebuddy.utility.nullability.a
        public final AnnotationValue<?, ?> getDefaultValue() {
            return null;
        }

        @Override // net.bytebuddy.description.method.a.AbstractC11974a, net.bytebuddy.description.d.a
        public final String getDescriptor() {
            return B.g((Constructor) this.f416177c);
        }

        @Override // net.bytebuddy.description.c
        public final int getModifiers() {
            return ((Constructor) this.f416177c).getModifiers();
        }

        @Override // net.bytebuddy.description.method.a.AbstractC11974a, net.bytebuddy.description.d.InterfaceC11969d
        public final String getName() {
            return ((Constructor) this.f416177c).getName();
        }

        @Override // net.bytebuddy.description.method.a
        @k.c
        public final net.bytebuddy.description.method.d<c.InterfaceC11982c> getParameters() {
            d.a bVar;
            if (this.f416169f != null) {
                bVar = null;
            } else {
                Constructor constructor = (Constructor) this.f416177c;
                bVar = d.AbstractC11983d.f416250d.a() ? new d.AbstractC11983d.b(constructor, this) : new d.AbstractC11983d.c(constructor, this);
            }
            if (bVar == null) {
                return this.f416169f;
            }
            this.f416169f = bVar;
            return bVar;
        }

        @Override // net.bytebuddy.description.method.a
        public final TypeDescription.Generic getReturnType() {
            return TypeDescription.Generic.f416325z2;
        }

        @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.c
        public final boolean isSynthetic() {
            return ((Constructor) this.f416177c).isSynthetic();
        }

        @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @I41.g
        public final TypeDescription n() {
            return TypeDescription.d.A0(((Constructor) this.f416177c).getDeclaringClass());
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public final d.f r() {
            return new d.f.e.a(this.f416177c.getTypeParameters());
        }

        @Override // net.bytebuddy.description.method.a.AbstractC11974a, net.bytebuddy.description.method.a
        public final boolean v0() {
            return true;
        }
    }

    /* compiled from: MethodDescription.java */
    public static class c extends d.AbstractC11975a.b<Method> implements c.b.f {

        /* renamed from: f, reason: collision with root package name */
        public transient /* synthetic */ d.a f416172f;

        /* renamed from: g, reason: collision with root package name */
        public transient /* synthetic */ a.d f416173g;

        /* renamed from: h, reason: collision with root package name */
        public transient /* synthetic */ Annotation[][] f416174h;

        @Override // net.bytebuddy.description.method.a
        public final d.f N() {
            boolean z12 = TypeDescription.b.f416496c;
            Executable executable = this.f416177c;
            return z12 ? new d.f.e(((Method) executable).getExceptionTypes()) : new d.f.h((Method) executable);
        }

        @Override // net.bytebuddy.description.method.c.b.f
        @k.c
        public final Annotation[][] S() {
            Annotation[][] parameterAnnotations = this.f416174h != null ? null : ((Method) this.f416177c).getParameterAnnotations();
            if (parameterAnnotations == null) {
                return this.f416174h;
            }
            this.f416174h = parameterAnnotations;
            return parameterAnnotations;
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public final String V() {
            return ((Method) this.f416177c).getName();
        }

        @Override // net.bytebuddy.description.method.a.AbstractC11974a, net.bytebuddy.description.method.a
        public final boolean d0() {
            return false;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        @k.c
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            a.d dVar = this.f416173g != null ? null : new a.d(((Method) this.f416177c).getDeclaredAnnotations());
            if (dVar == null) {
                return this.f416173g;
            }
            this.f416173g = dVar;
            return dVar;
        }

        @Override // net.bytebuddy.description.method.a
        @net.bytebuddy.utility.nullability.b
        public final AnnotationValue<?, ?> getDefaultValue() {
            Method method = (Method) this.f416177c;
            Object defaultValue = method.getDefaultValue();
            if (defaultValue == null) {
                return null;
            }
            return AnnotationDescription.e.i(method.getReturnType(), defaultValue);
        }

        @Override // net.bytebuddy.description.method.a.AbstractC11974a, net.bytebuddy.description.d.a
        public final String getDescriptor() {
            return B.m((Method) this.f416177c);
        }

        @Override // net.bytebuddy.description.c
        public final int getModifiers() {
            return ((Method) this.f416177c).getModifiers();
        }

        @Override // net.bytebuddy.description.method.a.AbstractC11974a, net.bytebuddy.description.d.InterfaceC11969d
        public final String getName() {
            return ((Method) this.f416177c).getName();
        }

        @Override // net.bytebuddy.description.method.a
        @k.c
        public final net.bytebuddy.description.method.d<c.InterfaceC11982c> getParameters() {
            d.a eVar;
            if (this.f416172f != null) {
                eVar = null;
            } else {
                Method method = (Method) this.f416177c;
                eVar = d.AbstractC11983d.f416250d.a() ? new d.AbstractC11983d.e(method, this) : new d.AbstractC11983d.C11984d(method, this);
            }
            if (eVar == null) {
                return this.f416172f;
            }
            this.f416172f = eVar;
            return eVar;
        }

        @Override // net.bytebuddy.description.method.a
        public final TypeDescription.Generic getReturnType() {
            boolean z12 = TypeDescription.b.f416496c;
            Executable executable = this.f416177c;
            return z12 ? TypeDescription.Generic.d.b.y0(((Method) executable).getReturnType()) : new TypeDescription.Generic.b.C11992b((Method) executable);
        }

        @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.c
        public final boolean isSynthetic() {
            return ((Method) this.f416177c).isSynthetic();
        }

        @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @I41.g
        public final TypeDescription n() {
            return TypeDescription.d.A0(((Method) this.f416177c).getDeclaringClass());
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public final d.f r() {
            return TypeDescription.b.f416496c ? new d.f.b() : new d.f.e.a(this.f416177c.getTypeParameters());
        }

        @Override // net.bytebuddy.description.method.a.AbstractC11974a, net.bytebuddy.description.method.a
        public final boolean v0() {
            return false;
        }

        @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.c.InterfaceC11968c
        public final boolean y() {
            return ((Method) this.f416177c).isBridge();
        }
    }

    /* compiled from: MethodDescription.java */
    public interface e extends a {
    }

    /* compiled from: MethodDescription.java */
    public static class f extends d.AbstractC11975a {

        /* renamed from: c, reason: collision with root package name */
        public final TypeDescription f416178c;

        /* renamed from: d, reason: collision with root package name */
        public final String f416179d;

        /* renamed from: e, reason: collision with root package name */
        public final int f416180e;

        /* renamed from: f, reason: collision with root package name */
        public final List<? extends net.bytebuddy.description.type.e> f416181f;

        /* renamed from: g, reason: collision with root package name */
        public final TypeDescription.Generic f416182g;

        /* renamed from: h, reason: collision with root package name */
        public final List<? extends c.f> f416183h;

        /* renamed from: i, reason: collision with root package name */
        public final List<? extends TypeDescription.Generic> f416184i;

        /* renamed from: j, reason: collision with root package name */
        public final List<? extends AnnotationDescription> f416185j;

        /* renamed from: k, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.b
        public final AnnotationValue<?, ?> f416186k;

        /* renamed from: l, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription.Generic f416187l;

        /* compiled from: MethodDescription.java */
        /* renamed from: net.bytebuddy.description.method.a$f$a, reason: collision with other inner class name */
        public static class C11977a extends d.AbstractC11975a {

            /* renamed from: c, reason: collision with root package name */
            public final TypeDescription f416188c;

            public C11977a(TypeDescription typeDescription) {
                this.f416188c = typeDescription;
            }

            @Override // net.bytebuddy.description.method.a
            public final d.f N() {
                return new d.f.b();
            }

            @Override // net.bytebuddy.description.d.InterfaceC11969d
            public final String V() {
                return "<clinit>";
            }

            @Override // net.bytebuddy.description.annotation.AnnotationSource
            public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                return new a.b();
            }

            @Override // net.bytebuddy.description.method.a
            @net.bytebuddy.utility.nullability.a
            public final AnnotationValue<?, ?> getDefaultValue() {
                return null;
            }

            @Override // net.bytebuddy.description.c
            public final int getModifiers() {
                return 8;
            }

            @Override // net.bytebuddy.description.method.a
            public final net.bytebuddy.description.method.d<c.InterfaceC11982c> getParameters() {
                return new d.b();
            }

            @Override // net.bytebuddy.description.method.a
            public final TypeDescription.Generic getReturnType() {
                return TypeDescription.Generic.f416325z2;
            }

            @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
            @I41.g
            public final TypeDefinition n() {
                return this.f416188c;
            }

            @Override // net.bytebuddy.description.TypeVariableSource
            public final d.f r() {
                return new d.f.b();
            }

            @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
            @I41.g
            public final TypeDescription n() {
                return this.f416188c;
            }
        }

        public f(TypeDescription typeDescription, String str, int i12, List<? extends net.bytebuddy.description.type.e> list, TypeDescription.Generic generic, List<? extends c.f> list2, List<? extends TypeDescription.Generic> list3, List<? extends AnnotationDescription> list4, @net.bytebuddy.utility.nullability.b AnnotationValue<?, ?> annotationValue, @net.bytebuddy.utility.nullability.b TypeDescription.Generic generic2) {
            this.f416178c = typeDescription;
            this.f416179d = str;
            this.f416180e = i12;
            this.f416181f = list;
            this.f416182g = generic;
            this.f416183h = list2;
            this.f416184i = list3;
            this.f416185j = list4;
            this.f416186k = annotationValue;
            this.f416187l = generic2;
        }

        @Override // net.bytebuddy.description.method.a
        public final d.f N() {
            return new d.f.C12002d(this.f416184i, TypeDescription.Generic.Visitor.d.a.k(this));
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public final String V() {
            return this.f416179d;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            return new a.c(this.f416185j);
        }

        @Override // net.bytebuddy.description.method.a
        @net.bytebuddy.utility.nullability.b
        public final AnnotationValue<?, ?> getDefaultValue() {
            return this.f416186k;
        }

        @Override // net.bytebuddy.description.c
        public final int getModifiers() {
            return this.f416180e;
        }

        @Override // net.bytebuddy.description.method.a
        public final net.bytebuddy.description.method.d<c.InterfaceC11982c> getParameters() {
            return new d.e(this, this.f416183h);
        }

        @Override // net.bytebuddy.description.method.a
        public final TypeDescription.Generic getReturnType() {
            return (TypeDescription.Generic) this.f416182g.h0(new TypeDescription.Generic.Visitor.d.a((TypeDefinition) this.f416178c, (TypeVariableSource) this));
        }

        @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.method.a
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription.Generic l() {
            TypeDescription.Generic generic = this.f416187l;
            return generic == null ? super.l() : (TypeDescription.Generic) generic.h0(new TypeDescription.Generic.Visitor.d.a(n(), this));
        }

        @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @I41.g
        public final TypeDefinition n() {
            return this.f416178c;
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public final d.f r() {
            int i12 = d.f.C12002d.f416532d;
            return new d.f.C12002d.a(this, this.f416181f, TypeDescription.Generic.Visitor.d.a.k(this));
        }

        @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @I41.g
        public final TypeDescription n() {
            return this.f416178c;
        }

        public f(TypeDescription.b.a aVar, h hVar) {
            this(aVar, hVar.f416193a, hVar.f416194b, hVar.g(), hVar.f416196d, hVar.f(), hVar.e(), hVar.d(), hVar.f416200h, hVar.f416201i);
        }
    }

    /* compiled from: MethodDescription.java */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public final String f416189a;

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription f416190b;

        /* renamed from: c, reason: collision with root package name */
        public final List<? extends TypeDescription> f416191c;

        /* renamed from: d, reason: collision with root package name */
        public transient /* synthetic */ int f416192d;

        public g(String str, TypeDescription.b bVar, TypeDescription... typeDescriptionArr) {
            this(str, bVar, (List<? extends TypeDescription>) Arrays.asList(typeDescriptionArr));
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f416189a.equals(gVar.f416189a) && this.f416190b.equals(gVar.f416190b) && this.f416191c.equals(gVar.f416191c);
        }

        @k.c
        public final int hashCode() {
            int iJ2;
            if (this.f416192d != 0) {
                iJ2 = 0;
            } else {
                iJ2 = D8.j(this.f416190b, this.f416189a.hashCode() * 31, 31) + this.f416191c.hashCode();
            }
            if (iJ2 == 0) {
                return this.f416192d;
            }
            this.f416192d = iJ2;
            return iJ2;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f416190b);
            sb2.append(' ');
            sb2.append(this.f416189a);
            sb2.append('(');
            boolean z12 = true;
            for (TypeDescription typeDescription : this.f416191c) {
                if (z12) {
                    z12 = false;
                } else {
                    sb2.append(',');
                }
                sb2.append(typeDescription);
            }
            sb2.append(')');
            return sb2.toString();
        }

        public g(String str, TypeDescription typeDescription, List<? extends TypeDescription> list) {
            this.f416189a = str;
            this.f416190b = typeDescription;
            this.f416191c = list;
        }
    }

    /* compiled from: MethodDescription.java */
    public static class h implements a.InterfaceC11963a<h> {

        /* renamed from: a, reason: collision with root package name */
        public final String f416193a;

        /* renamed from: b, reason: collision with root package name */
        public final int f416194b;

        /* renamed from: c, reason: collision with root package name */
        public final List<? extends net.bytebuddy.description.type.e> f416195c;

        /* renamed from: d, reason: collision with root package name */
        public final TypeDescription.Generic f416196d;

        /* renamed from: e, reason: collision with root package name */
        public final List<? extends c.f> f416197e;

        /* renamed from: f, reason: collision with root package name */
        public final List<? extends TypeDescription.Generic> f416198f;

        /* renamed from: g, reason: collision with root package name */
        public final List<? extends AnnotationDescription> f416199g;

        /* renamed from: h, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.b
        public final AnnotationValue<?, ?> f416200h;

        /* renamed from: i, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription.Generic f416201i;

        /* renamed from: j, reason: collision with root package name */
        public transient /* synthetic */ int f416202j;

        public h(int i12) {
            this("<init>", i12, TypeDescription.Generic.f416325z2);
        }

        @Override // net.bytebuddy.description.a.InterfaceC11963a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h a(TypeDescription.Generic.Visitor.d.b bVar) {
            TypeDescription.Generic generic;
            a.InterfaceC11963a.C11964a c11964aB = g().b(bVar);
            TypeDescription.Generic generic2 = (TypeDescription.Generic) this.f416196d.h0(bVar);
            a.InterfaceC11963a.C11964a c11964aB2 = f().b(bVar);
            d.f fVarH0 = e().h0(bVar);
            TypeDescription.Generic generic3 = this.f416201i;
            if (generic3 == null) {
                TypeDescription.Generic.d.b bVar2 = TypeDescription.Generic.f416323x2;
                generic = null;
            } else {
                generic = (TypeDescription.Generic) generic3.h0(bVar);
            }
            TypeDescription.Generic generic4 = generic;
            return new h(this.f416193a, this.f416194b, c11964aB, generic2, c11964aB2, fVarH0, this.f416199g, this.f416200h, generic4);
        }

        public final g c(TypeDescription typeDescription) {
            TypeDescription.Generic.Visitor.c cVar = new TypeDescription.Generic.Visitor.c(typeDescription, this.f416195c);
            List<? extends c.f> list = this.f416197e;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<? extends c.f> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f416238a.h0(cVar));
            }
            return new g(this.f416193a, (TypeDescription) this.f416196d.h0(cVar), arrayList);
        }

        public final net.bytebuddy.description.annotation.a d() {
            return new a.c(this.f416199g);
        }

        public final d.f.c e() {
            return new d.f.c(this.f416198f);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            h hVar = (h) obj;
            if (this.f416194b == hVar.f416194b && this.f416193a.equals(hVar.f416193a) && this.f416195c.equals(hVar.f416195c) && this.f416196d.equals(hVar.f416196d) && this.f416197e.equals(hVar.f416197e) && this.f416198f.equals(hVar.f416198f) && this.f416199g.equals(hVar.f416199g)) {
                AnnotationValue<?, ?> annotationValue = hVar.f416200h;
                AnnotationValue<?, ?> annotationValue2 = this.f416200h;
                if (annotationValue2 == null ? annotationValue == null : annotationValue2.equals(annotationValue)) {
                    TypeDescription.Generic generic = hVar.f416201i;
                    TypeDescription.Generic generic2 = this.f416201i;
                    if (generic2 != null) {
                        if (generic2.equals(generic)) {
                            return true;
                        }
                    } else if (generic == null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final a.InterfaceC11963a.C11964a<c.f> f() {
            return new a.InterfaceC11963a.C11964a<>(this.f416197e);
        }

        public final a.InterfaceC11963a.C11964a<net.bytebuddy.description.type.e> g() {
            return new a.InterfaceC11963a.C11964a<>(this.f416195c);
        }

        @k.c
        public final int hashCode() {
            if (this.f416202j == 0) {
                int iHashCode = (this.f416199g.hashCode() + ((this.f416198f.hashCode() + ((this.f416197e.hashCode() + D8.i(this.f416196d, (this.f416195c.hashCode() + (((this.f416193a.hashCode() * 31) + this.f416194b) * 31)) * 31, 31)) * 31)) * 31)) * 31;
                AnnotationValue<?, ?> annotationValue = this.f416200h;
                int iHashCode2 = (iHashCode + (annotationValue != null ? annotationValue.hashCode() : 0)) * 31;
                TypeDescription.Generic generic = this.f416201i;
                iHashCode = (generic != null ? generic.hashCode() : 0) + iHashCode2;
            }
            if (iHashCode == 0) {
                return this.f416202j;
            }
            this.f416202j = iHashCode;
            return iHashCode;
        }

        public final String toString() {
            return "MethodDescription.Token{name='" + this.f416193a + "', modifiers=" + this.f416194b + ", typeVariableTokens=" + this.f416195c + ", returnType=" + this.f416196d + ", parameterTokens=" + this.f416197e + ", exceptionTypes=" + this.f416198f + ", annotations=" + this.f416199g + ", defaultValue=" + this.f416200h + ", receiverType=" + this.f416201i + '}';
        }

        public h(String str, int i12, TypeDescription.Generic generic) {
            this(str, i12, generic, Collections.emptyList());
        }

        public h(String str, int i12, TypeDescription.Generic generic, List<? extends TypeDescription.Generic> list) {
            List listEmptyList = Collections.emptyList();
            c.f.a aVar = new c.f.a(list);
            List listEmptyList2 = Collections.emptyList();
            List listEmptyList3 = Collections.emptyList();
            TypeDescription.Generic.d.b bVar = TypeDescription.Generic.f416323x2;
            this(str, i12, listEmptyList, generic, aVar, listEmptyList2, listEmptyList3, null, null);
        }

        public h(String str, int i12, List<? extends net.bytebuddy.description.type.e> list, TypeDescription.Generic generic, List<? extends c.f> list2, List<? extends TypeDescription.Generic> list3, List<? extends AnnotationDescription> list4, @net.bytebuddy.utility.nullability.b AnnotationValue<?, ?> annotationValue, @net.bytebuddy.utility.nullability.b TypeDescription.Generic generic2) {
            this.f416193a = str;
            this.f416194b = i12;
            this.f416195c = list;
            this.f416196d = generic;
            this.f416197e = list2;
            this.f416198f = list3;
            this.f416199g = list4;
            this.f416200h = annotationValue;
            this.f416201i = generic2;
        }
    }

    /* compiled from: MethodDescription.java */
    public static class i extends AbstractC11974a implements e {

        /* renamed from: c, reason: collision with root package name */
        public final TypeDescription.Generic.a f416203c;

        /* renamed from: d, reason: collision with root package name */
        public final a f416204d;

        /* renamed from: e, reason: collision with root package name */
        public final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> f416205e;

        public i(TypeDescription.Generic.a aVar, a aVar2, TypeDescription.Generic.Visitor visitor) {
            this.f416203c = aVar;
            this.f416204d = aVar2;
            this.f416205e = visitor;
        }

        @Override // net.bytebuddy.description.method.a.AbstractC11974a, net.bytebuddy.description.method.a
        public final boolean C() {
            return this.f416204d.C();
        }

        @Override // net.bytebuddy.description.method.a
        public final d.f N() {
            return new d.f.C12002d(this.f416204d.N(), this.f416205e);
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public final String V() {
            return this.f416204d.V();
        }

        @Override // net.bytebuddy.description.method.a.AbstractC11974a, net.bytebuddy.description.method.a
        public final boolean d0() {
            return this.f416204d.d0();
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            return this.f416204d.getDeclaredAnnotations();
        }

        @Override // net.bytebuddy.description.method.a
        @net.bytebuddy.utility.nullability.b
        public final AnnotationValue<?, ?> getDefaultValue() {
            return this.f416204d.getDefaultValue();
        }

        @Override // net.bytebuddy.description.c
        public final int getModifiers() {
            return this.f416204d.getModifiers();
        }

        @Override // net.bytebuddy.description.method.a
        public final net.bytebuddy.description.method.d<c.d> getParameters() {
            return new d.f(this, this.f416204d.getParameters(), this.f416205e);
        }

        @Override // net.bytebuddy.description.method.a
        public final TypeDescription.Generic getReturnType() {
            return (TypeDescription.Generic) this.f416204d.getReturnType().h0(this.f416205e);
        }

        @Override // net.bytebuddy.description.a.b
        public final a.b i() {
            return this.f416204d.i();
        }

        @Override // net.bytebuddy.description.method.a
        public final TypeDescription.Generic l() {
            TypeDescription.Generic genericL = this.f416204d.l();
            if (genericL != null) {
                return (TypeDescription.Generic) genericL.h0(this.f416205e);
            }
            TypeDescription.Generic.d.b bVar = TypeDescription.Generic.f416323x2;
            return null;
        }

        @Override // net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @I41.g
        public final TypeDefinition n() {
            return this.f416203c;
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public final d.f r() {
            return this.f416204d.r().h0(this.f416205e).P1(new V(C44411u.f(TypeDefinition.Sort.f416311f)));
        }

        @Override // net.bytebuddy.description.method.a.AbstractC11974a, net.bytebuddy.description.method.a
        public final boolean v0() {
            return this.f416204d.v0();
        }
    }

    /* compiled from: MethodDescription.java */
    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public final TypeDescription f416206a;

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends TypeDescription> f416207b;

        /* renamed from: c, reason: collision with root package name */
        public transient /* synthetic */ int f416208c;

        public j(TypeDescription typeDescription, List<? extends TypeDescription> list) {
            this.f416206a = typeDescription;
            this.f416207b = list;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f416206a.equals(jVar.f416206a) && this.f416207b.equals(jVar.f416207b);
        }

        @k.c
        public final int hashCode() {
            int iHashCode = this.f416208c != 0 ? 0 : (this.f416206a.hashCode() * 31) + this.f416207b.hashCode();
            if (iHashCode == 0) {
                return this.f416208c;
            }
            this.f416208c = iHashCode;
            return iHashCode;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            Iterator<? extends TypeDescription> it = this.f416207b.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().getDescriptor());
            }
            sb2.append(')');
            sb2.append(this.f416206a.getDescriptor());
            return sb2.toString();
        }
    }

    boolean C();

    boolean K(j jVar);

    d.f N();

    boolean Z(AnnotationValue<?, ?> annotationValue);

    int b0(boolean z12, Visibility visibility);

    int d();

    boolean d0();

    g e();

    int f(boolean z12);

    j f0();

    @net.bytebuddy.utility.nullability.b
    AnnotationValue<?, ?> getDefaultValue();

    net.bytebuddy.description.method.d<?> getParameters();

    TypeDescription.Generic getReturnType();

    boolean i0();

    @net.bytebuddy.utility.nullability.b
    TypeDescription.Generic l();

    int p();

    boolean q0();

    boolean r0();

    boolean s(TypeDescription typeDescription);

    boolean t0(TypeDescription typeDescription);

    boolean v0();

    /* compiled from: MethodDescription.java */
    public interface d extends a {
        @Override // net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @I41.g
        TypeDescription n();

        /* compiled from: MethodDescription.java */
        /* renamed from: net.bytebuddy.description.method.a$d$a, reason: collision with other inner class name */
        public static abstract class AbstractC11975a extends AbstractC11974a implements d {

            /* compiled from: MethodDescription.java */
            @JavaDispatcher.i("java.lang.reflect.Executable")
            /* renamed from: net.bytebuddy.description.method.a$d$a$a, reason: collision with other inner class name */
            public interface InterfaceC11976a {
                @JavaDispatcher.i("getAnnotatedReceiverType")
                @JavaDispatcher.c
                @net.bytebuddy.utility.nullability.b
                AnnotatedElement a();
            }

            @Override // net.bytebuddy.description.method.a
            @net.bytebuddy.utility.nullability.b
            public TypeDescription.Generic l() {
                if (x0(8)) {
                    TypeDescription.Generic.d.b bVar = TypeDescription.Generic.f416323x2;
                    return null;
                }
                if (!v0()) {
                    return TypeDescription.Generic.OfParameterizedType.a.y0(n());
                }
                TypeDescription typeDescriptionN = n();
                TypeDescription typeDescriptionH5 = n().H5();
                return typeDescriptionH5 == null ? TypeDescription.Generic.OfParameterizedType.a.y0(typeDescriptionN) : typeDescriptionN.b() ? typeDescriptionH5.P0() : TypeDescription.Generic.OfParameterizedType.a.y0(typeDescriptionH5);
            }

            /* compiled from: MethodDescription.java */
            /* renamed from: net.bytebuddy.description.method.a$d$a$b */
            public static abstract class b<T extends AnnotatedElement> extends AbstractC11975a {

                /* renamed from: d, reason: collision with root package name */
                public static final InterfaceC11976a f416175d;

                /* renamed from: e, reason: collision with root package name */
                public static final boolean f416176e;

                /* renamed from: c, reason: collision with root package name */
                public final Executable f416177c;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
                static {
                    /*
                        r0 = 0
                        java.lang.String r1 = "java.security.AccessController"
                        r2 = 0
                        java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                        java.lang.String r1 = "net.bytebuddy.securitymanager"
                        java.lang.String r2 = "true"
                        java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                        boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                        net.bytebuddy.description.method.a.d.AbstractC11975a.b.f416176e = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                        goto L19
                    L16:
                        r0 = 1
                    L17:
                        net.bytebuddy.description.method.a.d.AbstractC11975a.b.f416176e = r0
                    L19:
                        java.lang.Class<net.bytebuddy.description.method.a$d$a$a> r0 = net.bytebuddy.description.method.a.d.AbstractC11975a.InterfaceC11976a.class
                        net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.a(r0)
                        boolean r1 = net.bytebuddy.description.method.a.d.AbstractC11975a.b.f416176e
                        if (r1 == 0) goto L28
                        java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                        goto L2c
                    L28:
                        java.lang.Object r0 = r0.run()
                    L2c:
                        net.bytebuddy.description.method.a$d$a$a r0 = (net.bytebuddy.description.method.a.d.AbstractC11975a.InterfaceC11976a) r0
                        net.bytebuddy.description.method.a.d.AbstractC11975a.b.f416175d = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.description.method.a.d.AbstractC11975a.b.<clinit>():void");
                }

                public b(Executable executable) {
                    this.f416177c = executable;
                }

                @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.method.a
                public final TypeDescription.Generic l() {
                    AnnotatedElement annotatedElementA = f416175d.a();
                    if (annotatedElementA == null) {
                        return super.l();
                    }
                    TypeDefinition.Sort.a aVar = TypeDefinition.Sort.f416313h;
                    if (aVar.a()) {
                        return TypeDefinition.Sort.a(aVar.getType(), new TypeDescription.Generic.AnnotationReader.a.j(annotatedElementA));
                    }
                    throw new IllegalArgumentException("Not an instance of AnnotatedType: " + annotatedElementA);
                }

                @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.a.b
                public final a.b i() {
                    return this;
                }
            }

            @Override // net.bytebuddy.description.a.b
            public a.b i() {
                return this;
            }
        }
    }
}
