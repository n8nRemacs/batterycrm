package net.bytebuddy.implementation;

import com.yandex.div2.D8;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.FieldAccess.b.C12105b;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.b;
import net.bytebuddy.jar.asm.B;
import net.bytebuddy.jar.asm.r;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.matcher.C44396e;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.M;
import net.bytebuddy.matcher.ModifierMatcher;
import net.bytebuddy.matcher.z;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class EqualsMethod implements Implementation {

    /* renamed from: g, reason: collision with root package name */
    public static final a.d f417178g = (a.d) ((net.bytebuddy.description.method.b) ((z.a) TypeDescription.f416317A2.q()).P1(C44411u.n())).M2();

    /* renamed from: b, reason: collision with root package name */
    public final SuperClassCheck f417179b;

    /* renamed from: c, reason: collision with root package name */
    public final TypeCompatibilityCheck f417180c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC44410t.a<? super a.c> f417181d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC44410t.a<? super a.c> f417182e;

    /* renamed from: f, reason: collision with root package name */
    public final Comparator<? super a.c> f417183f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NaturalOrderComparator implements Comparator<a.c> {

        /* renamed from: b, reason: collision with root package name */
        public static final NaturalOrderComparator f417184b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ NaturalOrderComparator[] f417185c;

        static {
            NaturalOrderComparator naturalOrderComparator = new NaturalOrderComparator("INSTANCE", 0);
            f417184b = naturalOrderComparator;
            f417185c = new NaturalOrderComparator[]{naturalOrderComparator};
        }

        public NaturalOrderComparator() {
            throw null;
        }

        public static NaturalOrderComparator valueOf(String str) {
            return (NaturalOrderComparator) Enum.valueOf(NaturalOrderComparator.class, str);
        }

        public static NaturalOrderComparator[] values() {
            return (NaturalOrderComparator[]) f417185c.clone();
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a.c cVar, a.c cVar2) {
            return 0;
        }
    }

    public interface NullValueGuard {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NoOp implements NullValueGuard {

            /* renamed from: b, reason: collision with root package name */
            public static final NoOp f417186b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ NoOp[] f417187c;

            static {
                NoOp noOp = new NoOp("INSTANCE", 0);
                f417186b = noOp;
                f417187c = new NoOp[]{noOp};
            }

            public NoOp() {
                throw null;
            }

            public static NoOp valueOf(String str) {
                return (NoOp) Enum.valueOf(NoOp.class, str);
            }

            public static NoOp[] values() {
                return (NoOp[]) f417187c.clone();
            }

            @Override // net.bytebuddy.implementation.EqualsMethod.NullValueGuard
            public final StackManipulation a() {
                return StackManipulation.Trivial.f417829b;
            }

            @Override // net.bytebuddy.implementation.EqualsMethod.NullValueGuard
            public final StackManipulation b() {
                return StackManipulation.Trivial.f417829b;
            }

            @Override // net.bytebuddy.implementation.EqualsMethod.NullValueGuard
            public final int c() {
                return 0;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements NullValueGuard {

            /* renamed from: f, reason: collision with root package name */
            public static final Object[] f417188f = new Object[0];

            /* renamed from: g, reason: collision with root package name */
            public static final Object[] f417189g = {B.l(Object.class)};

            /* renamed from: b, reason: collision with root package name */
            public final net.bytebuddy.description.method.a f417190b;

            /* renamed from: c, reason: collision with root package name */
            public final r f417191c = new r();

            /* renamed from: d, reason: collision with root package name */
            public final r f417192d = new r();

            /* renamed from: e, reason: collision with root package name */
            public final r f417193e = new r();

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.implementation.EqualsMethod$NullValueGuard$a$a, reason: collision with other inner class name */
            public class C12075a extends StackManipulation.a {
                public C12075a() {
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return a.this.equals(a.this);
                    }
                    return false;
                }

                public final int hashCode() {
                    return a.this.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public final StackManipulation.d n(s sVar, Implementation.Context context) {
                    a aVar = a.this;
                    sVar.r(167, aVar.f417193e);
                    sVar.s(aVar.f417192d);
                    ClassFileVersion classFileVersionB = context.b();
                    ClassFileVersion classFileVersion = ClassFileVersion.f415296h;
                    if (classFileVersionB.c(classFileVersion)) {
                        Object[] objArr = a.f417188f;
                        Object[] objArr2 = a.f417189g;
                        sVar.k(objArr, 4, objArr2, 0, objArr2.length);
                    }
                    r rVar = aVar.f417193e;
                    sVar.r(198, rVar);
                    sVar.s(aVar.f417191c);
                    if (context.b().c(classFileVersion)) {
                        Object[] objArr3 = a.f417188f;
                        sVar.k(objArr3, 3, objArr3, 0, 0);
                    }
                    sVar.m(3);
                    sVar.m(172);
                    sVar.s(rVar);
                    if (context.b().c(classFileVersion)) {
                        Object[] objArr4 = a.f417188f;
                        sVar.k(objArr4, 3, objArr4, 0, 0);
                    }
                    return StackManipulation.d.f417832c;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public class b extends StackManipulation.a {
                public b() {
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return a.this.equals(a.this);
                    }
                    return false;
                }

                public final int hashCode() {
                    return a.this.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public final StackManipulation.d n(s sVar, Implementation.Context context) {
                    a aVar = a.this;
                    sVar.J(58, aVar.f417190b.p());
                    sVar.J(58, aVar.f417190b.p() + 1);
                    sVar.J(25, aVar.f417190b.p() + 1);
                    sVar.J(25, aVar.f417190b.p());
                    sVar.r(198, aVar.f417192d);
                    sVar.r(198, aVar.f417191c);
                    sVar.J(25, aVar.f417190b.p() + 1);
                    sVar.J(25, aVar.f417190b.p());
                    return StackManipulation.d.f417832c;
                }
            }

            public a(net.bytebuddy.description.method.a aVar) {
                this.f417190b = aVar;
            }

            @Override // net.bytebuddy.implementation.EqualsMethod.NullValueGuard
            public final StackManipulation a() {
                return new C12075a();
            }

            @Override // net.bytebuddy.implementation.EqualsMethod.NullValueGuard
            public final StackManipulation b() {
                return new b();
            }

            @Override // net.bytebuddy.implementation.EqualsMethod.NullValueGuard
            public final int c() {
                return 2;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f417190b.equals(aVar.f417190b) && this.f417191c.equals(aVar.f417191c) && this.f417192d.equals(aVar.f417192d) && this.f417193e.equals(aVar.f417193e);
            }

            public final int hashCode() {
                return this.f417193e.hashCode() + ((this.f417192d.hashCode() + ((this.f417191c.hashCode() + D8.h(this.f417190b, getClass().hashCode() * 31, 31)) * 31)) * 31);
            }
        }

        StackManipulation a();

        StackManipulation b();

        int c();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class SuperClassCheck {

        /* renamed from: b, reason: collision with root package name */
        public static final SuperClassCheck f417196b;

        /* renamed from: c, reason: collision with root package name */
        public static final SuperClassCheck f417197c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ SuperClassCheck[] f417198d;

        public enum a extends SuperClassCheck {
            @Override // net.bytebuddy.implementation.EqualsMethod.SuperClassCheck
            public final StackManipulation a(TypeDescription typeDescription) {
                return StackManipulation.Trivial.f417829b;
            }
        }

        public enum b extends SuperClassCheck {
            @Override // net.bytebuddy.implementation.EqualsMethod.SuperClassCheck
            public final StackManipulation a(TypeDescription typeDescription) {
                TypeDescription.Generic genericC3 = typeDescription.C3();
                if (genericC3 != null) {
                    return new StackManipulation.b(MethodVariableAccess.c(), MethodVariableAccess.f418084i.new b(1), MethodInvocation.a(EqualsMethod.f417178g).h(genericC3.f5()), d.g());
                }
                throw new IllegalStateException(typeDescription + " does not declare a super class");
            }
        }

        static {
            a aVar = new a("DISABLED", 0, null);
            f417196b = aVar;
            b bVar = new b("ENABLED", 1, null);
            f417197c = bVar;
            f417198d = new SuperClassCheck[]{aVar, bVar};
        }

        public SuperClassCheck() {
            throw null;
        }

        public SuperClassCheck(String str, int i12, a aVar) {
        }

        public static SuperClassCheck valueOf(String str) {
            return (SuperClassCheck) Enum.valueOf(SuperClassCheck.class, str);
        }

        public static SuperClassCheck[] values() {
            return (SuperClassCheck[]) f417198d.clone();
        }

        public abstract StackManipulation a(TypeDescription typeDescription);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class TypeCompatibilityCheck {

        /* renamed from: b, reason: collision with root package name */
        public static final TypeCompatibilityCheck f417199b;

        /* renamed from: c, reason: collision with root package name */
        public static final TypeCompatibilityCheck f417200c;

        /* renamed from: d, reason: collision with root package name */
        public static final a.d f417201d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ TypeCompatibilityCheck[] f417202e;

        public enum a extends TypeCompatibilityCheck {
            @Override // net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck
            public final StackManipulation.b a(TypeDescription typeDescription) {
                MethodVariableAccess methodVariableAccess = MethodVariableAccess.f418084i;
                MethodVariableAccess.b bVar = methodVariableAccess.new b(1);
                d dVar = new d(199, 3);
                MethodVariableAccess.b bVar2 = methodVariableAccess.new b(0);
                a.d dVar2 = TypeCompatibilityCheck.f417201d;
                return new StackManipulation.b(bVar, dVar, bVar2, MethodInvocation.a(dVar2), methodVariableAccess.new b(1), MethodInvocation.a(dVar2), new d(165, 3));
            }
        }

        public enum b extends TypeCompatibilityCheck {
            @Override // net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck
            public final StackManipulation.b a(TypeDescription typeDescription) {
                MethodVariableAccess.b bVar = MethodVariableAccess.f418084i.new b(1);
                if (typeDescription.w5()) {
                    throw new IllegalArgumentException(D8.o("Cannot check an instance against a primitive type: ", typeDescription));
                }
                return new StackManipulation.b(bVar, new net.bytebuddy.implementation.bytecode.assign.a(typeDescription), d.g());
            }
        }

        static {
            a aVar = new a("EXACT", 0, null);
            f417199b = aVar;
            b bVar = new b("SUBCLASS", 1, null);
            f417200c = bVar;
            f417202e = new TypeCompatibilityCheck[]{aVar, bVar};
            f417201d = (a.d) TypeDescription.d.A0(Object.class).q().P1(C44411u.x("getClass")).M2();
        }

        public TypeCompatibilityCheck() {
            throw null;
        }

        public TypeCompatibilityCheck(String str, int i12, a aVar) {
        }

        public static TypeCompatibilityCheck valueOf(String str) {
            return (TypeCompatibilityCheck) Enum.valueOf(TypeCompatibilityCheck.class, str);
        }

        public static TypeCompatibilityCheck[] values() {
            return (TypeCompatibilityCheck[]) f417202e.clone();
        }

        public abstract StackManipulation.b a(TypeDescription typeDescription);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class TypePropertyComparator implements Comparator<a.c> {

        /* renamed from: b, reason: collision with root package name */
        public static final TypePropertyComparator f417203b;

        /* renamed from: c, reason: collision with root package name */
        public static final TypePropertyComparator f417204c;

        /* renamed from: d, reason: collision with root package name */
        public static final TypePropertyComparator f417205d;

        /* renamed from: e, reason: collision with root package name */
        public static final TypePropertyComparator f417206e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ TypePropertyComparator[] f417207f;

        public enum a extends TypePropertyComparator {
            @Override // net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator
            public final boolean b(TypeDescription.Generic generic) {
                return generic.w5();
            }

            @Override // net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator, java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(a.c cVar, a.c cVar2) {
                return compare(cVar, cVar2);
            }
        }

        public enum b extends TypePropertyComparator {
            @Override // net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator
            public final boolean b(TypeDescription.Generic generic) {
                return generic.I();
            }

            @Override // net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator, java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(a.c cVar, a.c cVar2) {
                return compare(cVar, cVar2);
            }
        }

        public enum c extends TypePropertyComparator {
            @Override // net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator
            public final boolean b(TypeDescription.Generic generic) {
                return generic.Q2(String.class);
            }

            @Override // net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator, java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(a.c cVar, a.c cVar2) {
                return compare(cVar, cVar2);
            }
        }

        public enum d extends TypePropertyComparator {
            @Override // net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator
            public final boolean b(TypeDescription.Generic generic) {
                return generic.f5().s0();
            }

            @Override // net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator, java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(a.c cVar, a.c cVar2) {
                return compare(cVar, cVar2);
            }
        }

        static {
            a aVar = new a("FOR_PRIMITIVE_TYPES", 0, null);
            f417203b = aVar;
            b bVar = new b("FOR_ENUMERATION_TYPES", 1, null);
            f417204c = bVar;
            c cVar = new c("FOR_STRING_TYPES", 2, null);
            f417205d = cVar;
            d dVar = new d("FOR_PRIMITIVE_WRAPPER_TYPES", 3, null);
            f417206e = dVar;
            f417207f = new TypePropertyComparator[]{aVar, bVar, cVar, dVar};
        }

        public TypePropertyComparator() {
            throw null;
        }

        public TypePropertyComparator(String str, int i12, a aVar) {
        }

        public static TypePropertyComparator valueOf(String str) {
            return (TypePropertyComparator) Enum.valueOf(TypePropertyComparator.class, str);
        }

        public static TypePropertyComparator[] values() {
            return (TypePropertyComparator[]) f417207f.clone();
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compare(a.c cVar, a.c cVar2) {
            if (!b(cVar.getType()) || b(cVar2.getType())) {
                return (b(cVar.getType()) || !b(cVar2.getType())) ? 0 : 1;
            }
            return -1;
        }

        public abstract boolean b(TypeDescription.Generic generic);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class ValueComparator implements StackManipulation {

        /* renamed from: b, reason: collision with root package name */
        public static final ValueComparator f417208b;

        /* renamed from: c, reason: collision with root package name */
        public static final ValueComparator f417209c;

        /* renamed from: d, reason: collision with root package name */
        public static final ValueComparator f417210d;

        /* renamed from: e, reason: collision with root package name */
        public static final ValueComparator f417211e;

        /* renamed from: f, reason: collision with root package name */
        public static final ValueComparator f417212f;

        /* renamed from: g, reason: collision with root package name */
        public static final ValueComparator f417213g;

        /* renamed from: h, reason: collision with root package name */
        public static final ValueComparator f417214h;

        /* renamed from: i, reason: collision with root package name */
        public static final ValueComparator f417215i;

        /* renamed from: j, reason: collision with root package name */
        public static final ValueComparator f417216j;

        /* renamed from: k, reason: collision with root package name */
        public static final ValueComparator f417217k;

        /* renamed from: l, reason: collision with root package name */
        public static final ValueComparator f417218l;

        /* renamed from: m, reason: collision with root package name */
        public static final ValueComparator f417219m;

        /* renamed from: n, reason: collision with root package name */
        public static final ValueComparator f417220n;

        /* renamed from: o, reason: collision with root package name */
        public static final /* synthetic */ ValueComparator[] f417221o;

        public enum a extends ValueComparator {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "equals", "([F[F)Z", 184, false);
                return new StackManipulation.d(-1, 0);
            }
        }

        public enum b extends ValueComparator {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "equals", "([D[D)Z", 184, false);
                return new StackManipulation.d(-1, 0);
            }
        }

        public enum c extends ValueComparator {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "equals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", 184, false);
                return new StackManipulation.d(-1, 0);
            }
        }

        public enum d extends ValueComparator {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "deepEquals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", 184, false);
                return new StackManipulation.d(-1, 0);
            }
        }

        public enum e extends ValueComparator {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.m(148);
                return new StackManipulation.d(-2, 0);
            }
        }

        public enum f extends ValueComparator {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/lang/Float", "compare", "(FF)I", 184, false);
                return new StackManipulation.d(-1, 0);
            }
        }

        public enum g extends ValueComparator {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/lang/Double", "compare", "(DD)I", 184, false);
                return new StackManipulation.d(-2, 0);
            }
        }

        public enum h extends ValueComparator {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "equals", "([Z[Z)Z", 184, false);
                return new StackManipulation.d(-1, 0);
            }
        }

        public enum i extends ValueComparator {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "equals", "([B[B)Z", 184, false);
                return new StackManipulation.d(-1, 0);
            }
        }

        public enum j extends ValueComparator {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "equals", "([S[S)Z", 184, false);
                return new StackManipulation.d(-1, 0);
            }
        }

        public enum k extends ValueComparator {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "equals", "([C[C)Z", 184, false);
                return new StackManipulation.d(-1, 0);
            }
        }

        public enum l extends ValueComparator {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "equals", "([I[I)Z", 184, false);
                return new StackManipulation.d(-1, 0);
            }
        }

        public enum m extends ValueComparator {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "equals", "([J[J)Z", 184, false);
                return new StackManipulation.d(-1, 0);
            }
        }

        static {
            e eVar = new e("LONG", 0, null);
            f417208b = eVar;
            f fVar = new f("FLOAT", 1, null);
            f417209c = fVar;
            g gVar = new g("DOUBLE", 2, null);
            f417210d = gVar;
            h hVar = new h("BOOLEAN_ARRAY", 3, null);
            f417211e = hVar;
            i iVar = new i("BYTE_ARRAY", 4, null);
            f417212f = iVar;
            j jVar = new j("SHORT_ARRAY", 5, null);
            f417213g = jVar;
            k kVar = new k("CHARACTER_ARRAY", 6, null);
            f417214h = kVar;
            l lVar = new l("INTEGER_ARRAY", 7, null);
            f417215i = lVar;
            m mVar = new m("LONG_ARRAY", 8, null);
            f417216j = mVar;
            a aVar = new a("FLOAT_ARRAY", 9, null);
            f417217k = aVar;
            b bVar = new b("DOUBLE_ARRAY", 10, null);
            f417218l = bVar;
            c cVar = new c("REFERENCE_ARRAY", 11, null);
            f417219m = cVar;
            d dVar = new d("NESTED_ARRAY", 12, null);
            f417220n = dVar;
            f417221o = new ValueComparator[]{eVar, fVar, gVar, hVar, iVar, jVar, kVar, lVar, mVar, aVar, bVar, cVar, dVar};
        }

        public ValueComparator() {
            throw null;
        }

        public ValueComparator(String str, int i12, a aVar) {
        }

        public static ValueComparator valueOf(String str) {
            return (ValueComparator) Enum.valueOf(ValueComparator.class, str);
        }

        public static ValueComparator[] values() {
            return (ValueComparator[]) f417221o.clone();
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            return true;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements net.bytebuddy.implementation.bytecode.a {

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription f417222b;

        /* renamed from: c, reason: collision with root package name */
        public final StackManipulation.b f417223c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f417224d;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC44410t<? super a.c> f417225e;

        public b(TypeDescription typeDescription, StackManipulation.b bVar, ArrayList arrayList, InterfaceC44410t interfaceC44410t) {
            this.f417222b = typeDescription;
            this.f417223c = bVar;
            this.f417224d = arrayList;
            this.f417225e = interfaceC44410t;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f417222b.equals(bVar.f417222b) && this.f417223c.equals(bVar.f417223c) && this.f417224d.equals(bVar.f417224d) && this.f417225e.equals(bVar.f417225e);
        }

        @Override // net.bytebuddy.implementation.bytecode.a
        public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
            StackManipulation dVar;
            StackManipulation bVar;
            if (aVar.b()) {
                throw new IllegalStateException(D8.m("Hash code method must not be static: ", aVar));
            }
            if (aVar.getParameters().size() != 1 || ((net.bytebuddy.description.method.c) aVar.getParameters().M2()).getType().w5()) {
                throw new IllegalStateException();
            }
            if (!aVar.getReturnType().Q2(Boolean.TYPE)) {
                throw new IllegalStateException(D8.m("Hash code method does not return primitive boolean: ", aVar));
            }
            ArrayList arrayList = this.f417224d;
            ArrayList arrayList2 = new ArrayList((arrayList.size() * 8) + 3);
            arrayList2.add(this.f417223c);
            Iterator it = arrayList.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                a.c cVar = (a.c) it.next();
                arrayList2.add(MethodVariableAccess.c());
                arrayList2.add(FieldAccess.b(cVar).new C12105b());
                arrayList2.add(MethodVariableAccess.f418084i.new b(1));
                arrayList2.add(net.bytebuddy.implementation.bytecode.assign.b.g(this.f417222b));
                arrayList2.add(FieldAccess.b(cVar).new C12105b());
                NullValueGuard aVar2 = (cVar.getType().w5() || cVar.getType().w2() || this.f417225e.b(cVar)) ? NullValueGuard.NoOp.f417186b : new NullValueGuard.a(aVar);
                arrayList2.add(aVar2.b());
                TypeDescription.Generic type = cVar.getType();
                ValueComparator valueComparator = ValueComparator.f417208b;
                if (type.Q2(Boolean.TYPE) || type.Q2(Byte.TYPE) || type.Q2(Short.TYPE) || type.Q2(Character.TYPE) || type.Q2(Integer.TYPE)) {
                    dVar = new d(159, 3);
                } else if (type.Q2(Long.TYPE)) {
                    dVar = new StackManipulation.b(ValueComparator.f417208b, new d(153, 3));
                } else if (type.Q2(Float.TYPE)) {
                    dVar = new StackManipulation.b(ValueComparator.f417209c, new d(153, 3));
                } else if (type.Q2(Double.TYPE)) {
                    dVar = new StackManipulation.b(ValueComparator.f417210d, new d(153, 3));
                } else if (type.Q2(boolean[].class)) {
                    dVar = new StackManipulation.b(ValueComparator.f417211e, d.g());
                } else if (type.Q2(byte[].class)) {
                    dVar = new StackManipulation.b(ValueComparator.f417212f, d.g());
                } else if (type.Q2(short[].class)) {
                    dVar = new StackManipulation.b(ValueComparator.f417213g, d.g());
                } else if (type.Q2(char[].class)) {
                    dVar = new StackManipulation.b(ValueComparator.f417214h, d.g());
                } else if (type.Q2(int[].class)) {
                    dVar = new StackManipulation.b(ValueComparator.f417215i, d.g());
                } else if (type.Q2(long[].class)) {
                    dVar = new StackManipulation.b(ValueComparator.f417216j, d.g());
                } else if (type.Q2(float[].class)) {
                    dVar = new StackManipulation.b(ValueComparator.f417217k, d.g());
                } else if (type.Q2(double[].class)) {
                    dVar = new StackManipulation.b(ValueComparator.f417218l, d.g());
                } else {
                    if (type.w2()) {
                        bVar = new StackManipulation.b(type.m().w2() ? ValueComparator.f417220n : ValueComparator.f417219m, d.g());
                    } else {
                        bVar = new StackManipulation.b(MethodInvocation.a(EqualsMethod.f417178g).i(type.f5()), d.g());
                    }
                    dVar = bVar;
                }
                arrayList2.add(dVar);
                arrayList2.add(aVar2.a());
                iMax = Math.max(iMax, aVar2.c());
            }
            arrayList2.add(IntegerConstant.ONE);
            arrayList2.add(MethodReturn.f418071d);
            return new a.c(new StackManipulation.b(arrayList2).n(sVar, context).f417834b, aVar.p() + iMax);
        }

        public final int hashCode() {
            return this.f417225e.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f417224d, (this.f417223c.hashCode() + D8.j(this.f417222b, getClass().hashCode() * 31, 31)) * 31, 31);
        }
    }

    @SuppressFBWarnings(justification = "Not used within a serializable instance", value = {"SE_COMPARATOR_SHOULD_BE_SERIALIZABLE"})
    @HashCodeAndEqualsPlugin.Enhance
    public static class c implements Comparator<a.c> {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f417226b;

        public c() {
            throw null;
        }

        public c(Comparator<? super a.c>... comparatorArr) {
            List<Comparator> listAsList = Arrays.asList(comparatorArr);
            this.f417226b = new ArrayList();
            for (Comparator comparator : listAsList) {
                if (comparator instanceof c) {
                    this.f417226b.addAll(((c) comparator).f417226b);
                } else if (!(comparator instanceof NaturalOrderComparator)) {
                    this.f417226b.add(comparator);
                }
            }
        }

        @Override // java.util.Comparator
        public final int compare(a.c cVar, a.c cVar2) {
            a.c cVar3 = cVar;
            a.c cVar4 = cVar2;
            Iterator it = this.f417226b.iterator();
            while (it.hasNext()) {
                int iCompare = ((Comparator) it.next()).compare(cVar3, cVar4);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return 0;
        }

        @Override // java.util.Comparator
        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f417226b.equals(((c) obj).f417226b);
        }

        public final int hashCode() {
            return this.f417226b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class d extends StackManipulation.a {

        /* renamed from: d, reason: collision with root package name */
        public static final Object[] f417227d = new Object[0];

        /* renamed from: b, reason: collision with root package name */
        public final int f417228b;

        /* renamed from: c, reason: collision with root package name */
        public final int f417229c;

        public d(int i12, int i13) {
            this.f417228b = i12;
            this.f417229c = i13;
        }

        public static d g() {
            return new d(154, 3);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f417228b == dVar.f417228b && this.f417229c == dVar.f417229c;
        }

        public final int hashCode() {
            return (((getClass().hashCode() * 31) + this.f417228b) * 31) + this.f417229c;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            r rVar = new r();
            sVar.r(this.f417228b, rVar);
            sVar.m(this.f417229c);
            sVar.m(172);
            sVar.s(rVar);
            if (context.b().c(ClassFileVersion.f415296h)) {
                Object[] objArr = f417227d;
                sVar.k(objArr, 3, objArr, 0, 0);
            }
            return new StackManipulation.d(-1, 1);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EqualsMethod(SuperClassCheck superClassCheck) {
        TypeCompatibilityCheck typeCompatibilityCheck = TypeCompatibilityCheck.f417199b;
        C44396e<?> c44396e = C44396e.f418423d;
        this(superClassCheck, typeCompatibilityCheck, c44396e, c44396e, NaturalOrderComparator.f417184b);
    }

    public final EqualsMethod a(Comparator<? super a.c> comparator) {
        return new EqualsMethod(this.f417179b, this.f417180c, this.f417181d, this.f417182e, new c(this.f417183f, comparator));
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EqualsMethod equalsMethod = (EqualsMethod) obj;
        return this.f417179b.equals(equalsMethod.f417179b) && this.f417180c.equals(equalsMethod.f417180c) && this.f417181d.equals(equalsMethod.f417181d) && this.f417182e.equals(equalsMethod.f417182e) && this.f417183f.equals(equalsMethod.f417183f);
    }

    public final int hashCode() {
        return this.f417183f.hashCode() + ((this.f417182e.hashCode() + ((this.f417181d.hashCode() + ((this.f417180c.hashCode() + ((this.f417179b.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // net.bytebuddy.implementation.Implementation
    public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
        if (target.a().E()) {
            throw new IllegalStateException("Cannot implement meaningful equals method for " + target.a());
        }
        ArrayList arrayList = new ArrayList(target.a().x().P1(new M(ModifierMatcher.Mode.STATIC.f418407d.d(this.f417181d))));
        Collections.sort(arrayList, this.f417183f);
        return new b(target.a(), new StackManipulation.b(this.f417179b.a(target.a()), MethodVariableAccess.c(), MethodVariableAccess.f418084i.new b(1), new d(new d(166, 3).f417228b, 4), this.f417180c.a(target.a())), arrayList, this.f417182e);
    }

    public EqualsMethod(SuperClassCheck superClassCheck, TypeCompatibilityCheck typeCompatibilityCheck, InterfaceC44410t.a<? super a.c> aVar, InterfaceC44410t.a<? super a.c> aVar2, Comparator<? super a.c> comparator) {
        this.f417179b = superClassCheck;
        this.f417180c = typeCompatibilityCheck;
        this.f417181d = aVar;
        this.f417182e = aVar2;
        this.f417183f = comparator;
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public final InstrumentedType e(InstrumentedType instrumentedType) {
        return instrumentedType;
    }
}
