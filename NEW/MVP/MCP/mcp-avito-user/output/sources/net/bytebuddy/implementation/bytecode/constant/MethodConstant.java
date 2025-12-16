package net.bytebuddy.implementation.bytecode.constant;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Iterator;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import net.bytebuddy.implementation.bytecode.collection.ArrayFactory.a;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.FieldAccess.b.C12105b;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.matcher.MethodSortMatcher;

/* loaded from: classes7.dex */
public abstract class MethodConstant extends StackManipulation.a {

    /* renamed from: c, reason: collision with root package name */
    @net.bytebuddy.utility.nullability.b
    public static final a.c f418015c;

    /* renamed from: b, reason: collision with root package name */
    public final a.d f418016b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CanCacheIllegal implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final CanCacheIllegal f418017b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ CanCacheIllegal[] f418018c;

        static {
            CanCacheIllegal canCacheIllegal = new CanCacheIllegal("INSTANCE", 0);
            f418017b = canCacheIllegal;
            f418018c = new CanCacheIllegal[]{canCacheIllegal};
        }

        public CanCacheIllegal() {
            throw null;
        }

        public static CanCacheIllegal valueOf(String str) {
            return (CanCacheIllegal) Enum.valueOf(CanCacheIllegal.class, str);
        }

        public static CanCacheIllegal[] values() {
            return (CanCacheIllegal[]) f418018c.clone();
        }

        @Override // net.bytebuddy.implementation.bytecode.constant.MethodConstant.c
        public final StackManipulation f() {
            return StackManipulation.Illegal.f417827b;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            return false;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            StackManipulation.Illegal.f417827b.n(sVar, context);
            throw null;
        }
    }

    public static class a implements StackManipulation {

        /* renamed from: c, reason: collision with root package name */
        public static final TypeDescription f418019c = TypeDescription.d.A0(Constructor.class);

        /* renamed from: b, reason: collision with root package name */
        public final c f418020b;

        public a(c cVar) {
            this.f418020b = cVar;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f418020b.equals(((a) obj).f418020b);
        }

        public final int hashCode() {
            return this.f418020b.hashCode();
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            return this.f418020b.isValid();
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            return FieldAccess.b(context.h(this.f418020b, f418019c)).new C12105b().n(sVar, context);
        }
    }

    public static class b implements StackManipulation {

        /* renamed from: c, reason: collision with root package name */
        public static final TypeDescription f418021c = TypeDescription.d.A0(Method.class);

        /* renamed from: b, reason: collision with root package name */
        public final c f418022b;

        public b(c cVar) {
            this.f418022b = cVar;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f418022b.equals(((b) obj).f418022b);
        }

        public final int hashCode() {
            return this.f418022b.hashCode();
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            return this.f418022b.isValid();
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            return FieldAccess.b(context.h(this.f418022b, f418021c)).new C12105b().n(sVar, context);
        }
    }

    public interface c extends StackManipulation {
        StackManipulation f();
    }

    public static class d extends MethodConstant implements c {

        /* renamed from: d, reason: collision with root package name */
        public static final a.c f418023d;

        /* renamed from: e, reason: collision with root package name */
        public static final a.c f418024e;

        static {
            try {
                f418023d = new a.c(Class.class.getMethod("getConstructor", Class[].class));
                f418024e = new a.c(Class.class.getMethod("getDeclaredConstructor", Class[].class));
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("Could not locate Class::getDeclaredConstructor", e12);
            }
        }

        @Override // net.bytebuddy.implementation.bytecode.constant.MethodConstant.c
        public final StackManipulation f() {
            return new a(this);
        }

        @Override // net.bytebuddy.implementation.bytecode.constant.MethodConstant
        public final a.c g() {
            return this.f418016b.e0() ? f418023d : f418024e;
        }

        @Override // net.bytebuddy.implementation.bytecode.constant.MethodConstant
        public final StackManipulation j() {
            return StackManipulation.Trivial.f417829b;
        }
    }

    public static class e extends MethodConstant implements c {

        /* renamed from: d, reason: collision with root package name */
        public static final a.c f418025d;

        /* renamed from: e, reason: collision with root package name */
        public static final a.c f418026e;

        static {
            try {
                f418025d = new a.c(Class.class.getMethod("getMethod", String.class, Class[].class));
                f418026e = new a.c(Class.class.getMethod("getDeclaredMethod", String.class, Class[].class));
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("Could not locate method lookup", e12);
            }
        }

        @Override // net.bytebuddy.implementation.bytecode.constant.MethodConstant.c
        public final StackManipulation f() {
            return new b(this);
        }

        @Override // net.bytebuddy.implementation.bytecode.constant.MethodConstant
        public final a.c g() {
            return this.f418016b.e0() ? f418025d : f418026e;
        }

        @Override // net.bytebuddy.implementation.bytecode.constant.MethodConstant
        public final StackManipulation j() {
            return new net.bytebuddy.implementation.bytecode.constant.c(this.f418016b.V());
        }
    }

    public static class f implements StackManipulation, c {

        /* renamed from: b, reason: collision with root package name */
        public final a.d f418027b;

        /* renamed from: c, reason: collision with root package name */
        public final StackManipulation f418028c;

        public f(a.d dVar, StackManipulation stackManipulation) {
            this.f418027b = dVar;
            this.f418028c = stackManipulation;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f418027b.equals(((f) obj).f418027b);
        }

        @Override // net.bytebuddy.implementation.bytecode.constant.MethodConstant.c
        public final StackManipulation f() {
            return this.f418027b.v0() ? new a(this) : new b(this);
        }

        public final int hashCode() {
            return this.f418027b.hashCode();
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            return this.f418028c.isValid();
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            PrivilegedMemberLookupAction privilegedMemberLookupAction;
            a.c cVar = MethodConstant.f418015c;
            if (cVar == null) {
                throw new IllegalStateException("Privileged method invocation is not supported on the current VM");
            }
            PrivilegedMemberLookupAction privilegedMemberLookupAction2 = PrivilegedMemberLookupAction.FOR_PUBLIC_METHOD;
            a.d dVar = this.f418027b;
            if (dVar.v0()) {
                privilegedMemberLookupAction = dVar.e0() ? PrivilegedMemberLookupAction.FOR_PUBLIC_CONSTRUCTOR : PrivilegedMemberLookupAction.FOR_DECLARED_CONSTRUCTOR;
            } else {
                if (!dVar.C()) {
                    throw new IllegalStateException("Cannot load constant for type initializer: " + dVar);
                }
                privilegedMemberLookupAction = dVar.e0() ? PrivilegedMemberLookupAction.FOR_PUBLIC_METHOD : PrivilegedMemberLookupAction.FOR_DECLARED_METHOD;
            }
            TypeDescription typeDescriptionE = context.e(privilegedMemberLookupAction);
            return new StackManipulation.b(net.bytebuddy.implementation.bytecode.b.g(typeDescriptionE), Duplication.f417792d, ClassConstant.c(dVar.n()), this.f418028c, ArrayFactory.a(TypeDescription.Generic.f416324y2).new a(MethodConstant.r(dVar.getParameters().p2().f1())), MethodInvocation.a((a.d) typeDescriptionE.q().P1(MethodSortMatcher.Sort.f418387e.f418392c).M2()), MethodInvocation.a(cVar), net.bytebuddy.implementation.bytecode.assign.b.g(TypeDescription.d.A0(dVar.v0() ? Constructor.class : Method.class))).n(sVar, context);
        }
    }

    static {
        a.c cVar = null;
        try {
            a.c cVar2 = new a.c(Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class));
            if (Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"))) {
                cVar = cVar2;
            }
        } catch (Exception unused) {
        }
        f418015c = cVar;
    }

    public MethodConstant(a.d dVar) {
        this.f418016b = dVar;
    }

    public static c p(a.d dVar) {
        return dVar.d0() ? CanCacheIllegal.f418017b : dVar.v0() ? new d(dVar) : new e(dVar);
    }

    public static c q(a.d dVar) {
        if (f418015c == null) {
            return p(dVar);
        }
        if (dVar.d0()) {
            return CanCacheIllegal.f418017b;
        }
        if (dVar.v0()) {
            d dVar2 = new d(dVar);
            return new f(dVar2.f418016b, StackManipulation.Trivial.f417829b);
        }
        e eVar = new e(dVar);
        return new f(eVar.f418016b, eVar.j());
    }

    public static ArrayList r(net.bytebuddy.description.type.d dVar) {
        ArrayList arrayList = new ArrayList(dVar.size());
        Iterator<TypeDescription> it = dVar.iterator();
        while (it.hasNext()) {
            arrayList.add(ClassConstant.c(it.next()));
        }
        return arrayList;
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f418016b.equals(((MethodConstant) obj).f418016b);
    }

    public abstract a.c g();

    public final int hashCode() {
        return this.f418016b.hashCode();
    }

    public abstract StackManipulation j();

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        a.d dVar = this.f418016b;
        return new StackManipulation.b(ClassConstant.c(dVar.n()), j(), ArrayFactory.a(TypeDescription.Generic.f416324y2).new a(r(dVar.getParameters().p2().f1())), MethodInvocation.a(g())).n(sVar, context);
    }
}
