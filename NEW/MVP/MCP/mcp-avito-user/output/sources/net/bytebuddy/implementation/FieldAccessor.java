package net.bytebuddy.implementation;

import com.yandex.div2.D8;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.FieldLocator;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.constant.DefaultValue;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.FieldAccess.b.C12105b;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.s;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public abstract class FieldAccessor implements Implementation {

    /* renamed from: b, reason: collision with root package name */
    public final c.C12076c f417230b;

    public interface FieldNameExtractor {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForBeanProperty implements FieldNameExtractor {

            /* renamed from: b, reason: collision with root package name */
            public static final ForBeanProperty f417231b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ ForBeanProperty[] f417232c;

            static {
                ForBeanProperty forBeanProperty = new ForBeanProperty("INSTANCE", 0);
                f417231b = forBeanProperty;
                f417232c = new ForBeanProperty[]{forBeanProperty};
            }

            public ForBeanProperty() {
                throw null;
            }

            public static ForBeanProperty valueOf(String str) {
                return (ForBeanProperty) Enum.valueOf(ForBeanProperty.class, str);
            }

            public static ForBeanProperty[] values() {
                return (ForBeanProperty[]) f417232c.clone();
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor
            public final String a(net.bytebuddy.description.method.a aVar) {
                int i12;
                String strV = aVar.V();
                if (strV.startsWith("get") || strV.startsWith("set")) {
                    i12 = 3;
                } else {
                    if (!strV.startsWith("is")) {
                        throw new IllegalArgumentException(aVar + " does not follow Java bean naming conventions");
                    }
                    i12 = 2;
                }
                String strSubstring = strV.substring(i12);
                if (strSubstring.length() != 0) {
                    return Character.toLowerCase(strSubstring.charAt(0)) + strSubstring.substring(1);
                }
                throw new IllegalArgumentException(aVar + " does not specify a bean name");
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements FieldNameExtractor {

            /* renamed from: b, reason: collision with root package name */
            public final String f417233b;

            public a(String str) {
                this.f417233b = str;
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor
            public final String a(net.bytebuddy.description.method.a aVar) {
                return this.f417233b;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417233b.equals(((a) obj).f417233b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417233b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        String a(net.bytebuddy.description.method.a aVar);
    }

    public interface b extends f {
    }

    public interface c {

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements c, b {
            @Override // net.bytebuddy.implementation.FieldAccessor.c.b
            public final net.bytebuddy.description.field.a a(net.bytebuddy.description.method.a aVar) {
                return null;
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

        public interface b {
            net.bytebuddy.description.field.a a(net.bytebuddy.description.method.a aVar);
        }

        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.implementation.FieldAccessor$c$c, reason: collision with other inner class name */
        public static class C12076c implements c {

            /* renamed from: a, reason: collision with root package name */
            public final FieldNameExtractor f417243a;

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.implementation.FieldAccessor$c$c$a */
            public static class a implements b {

                /* renamed from: a, reason: collision with root package name */
                public final FieldNameExtractor f417244a;

                /* renamed from: b, reason: collision with root package name */
                public final FieldLocator f417245b;

                public a(FieldNameExtractor fieldNameExtractor, FieldLocator fieldLocator) {
                    this.f417244a = fieldNameExtractor;
                    this.f417245b = fieldLocator;
                }

                @Override // net.bytebuddy.implementation.FieldAccessor.c.b
                public final net.bytebuddy.description.field.a a(net.bytebuddy.description.method.a aVar) {
                    String strA = this.f417244a.a(aVar);
                    FieldLocator fieldLocator = this.f417245b;
                    FieldLocator.Resolution resolutionK = fieldLocator.K(strA);
                    if (resolutionK.b()) {
                        return resolutionK.a();
                    }
                    throw new IllegalStateException("Cannot resolve field for " + aVar + " using " + fieldLocator);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.f417244a.equals(aVar.f417244a) && this.f417245b.equals(aVar.f417245b);
                }

                public final int hashCode() {
                    return this.f417245b.hashCode() + ((this.f417244a.hashCode() + (getClass().hashCode() * 31)) * 31);
                }
            }

            public C12076c(FieldNameExtractor fieldNameExtractor) {
                this.f417243a = fieldNameExtractor;
            }

            public final b a(TypeDescription typeDescription) {
                return new a(this.f417243a, new FieldLocator.ForClassHierarchy(typeDescription));
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                if (!this.f417243a.equals(((C12076c) obj).f417243a)) {
                    return false;
                }
                Object obj2 = FieldLocator.ForClassHierarchy.Factory.f416817b;
                return obj2.equals(obj2);
            }

            public final int hashCode() {
                return FieldLocator.ForClassHierarchy.Factory.f416817b.hashCode() + ((this.f417243a.hashCode() + (getClass().hashCode() * 31)) * 31);
            }
        }
    }

    public interface e extends b {
    }

    public interface f extends Implementation {
    }

    public FieldAccessor(c.C12076c c12076c) {
        this.f417230b = c12076c;
    }

    public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FieldAccessor fieldAccessor = (FieldAccessor) obj;
        Object obj2 = Assigner.Typing.STATIC;
        if (!obj2.equals(obj2) || !this.f417230b.equals(fieldAccessor.f417230b)) {
            return false;
        }
        net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
        return bVar.equals(bVar);
    }

    public int hashCode() {
        return Assigner.Typing.STATIC.hashCode() + ((Assigner.f417851M2.hashCode() + ((this.f417230b.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31);
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static abstract class ForSetter<T> extends FieldAccessor implements Implementation.b {

        /* renamed from: c, reason: collision with root package name */
        public final TerminationHandler f417234c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static abstract class TerminationHandler {

            /* renamed from: b, reason: collision with root package name */
            public static final TerminationHandler f417235b;

            /* renamed from: c, reason: collision with root package name */
            public static final TerminationHandler f417236c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ TerminationHandler[] f417237d;

            public enum a extends TerminationHandler {
                @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler
                public final StackManipulation a(net.bytebuddy.description.method.a aVar) {
                    if (aVar.getReturnType().Q2(Void.TYPE)) {
                        return MethodReturn.f418075h;
                    }
                    throw new IllegalStateException(D8.m("Cannot implement setter with return value for ", aVar));
                }
            }

            public enum b extends TerminationHandler {
                @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler
                public final StackManipulation a(net.bytebuddy.description.method.a aVar) {
                    return StackManipulation.Trivial.f417829b;
                }
            }

            static {
                a aVar = new a("RETURNING", 0, null);
                f417235b = aVar;
                b bVar = new b("NON_OPERATIONAL", 1, null);
                f417236c = bVar;
                f417237d = new TerminationHandler[]{aVar, bVar};
            }

            public TerminationHandler() {
                throw null;
            }

            public TerminationHandler(String str, int i12, a aVar) {
            }

            public static TerminationHandler valueOf(String str) {
                return (TerminationHandler) Enum.valueOf(TerminationHandler.class, str);
            }

            public static TerminationHandler[] values() {
                return (TerminationHandler[]) f417237d.clone();
            }

            public abstract StackManipulation a(net.bytebuddy.description.method.a aVar);
        }

        @HashCodeAndEqualsPlugin.Enhance
        public class a implements net.bytebuddy.implementation.bytecode.a {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f417238b;

            /* renamed from: c, reason: collision with root package name */
            @HashCodeAndEqualsPlugin.ValueHandling
            @net.bytebuddy.utility.nullability.b
            public final T f417239c;

            /* renamed from: d, reason: collision with root package name */
            public final c.b f417240d;

            public a(TypeDescription typeDescription, @net.bytebuddy.utility.nullability.b T t12, c.b bVar) {
                this.f417238b = typeDescription;
                this.f417239c = t12;
                this.f417240d = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
            
                if (r2 != null) goto L21;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean equals(@net.bytebuddy.utility.nullability.b java.lang.Object r5) {
                /*
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r5 != 0) goto L8
                    return r1
                L8:
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L13
                    return r1
                L13:
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$a r5 = (net.bytebuddy.implementation.FieldAccessor.ForSetter.a) r5
                    net.bytebuddy.description.type.TypeDescription r2 = r5.f417238b
                    net.bytebuddy.description.type.TypeDescription r3 = r4.f417238b
                    boolean r2 = r3.equals(r2)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    T r2 = r4.f417239c
                    T r3 = r5.f417239c
                    if (r3 == 0) goto L2f
                    if (r2 == 0) goto L31
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L32
                    return r1
                L2f:
                    if (r2 == 0) goto L32
                L31:
                    return r1
                L32:
                    net.bytebuddy.implementation.FieldAccessor$c$b r2 = r4.f417240d
                    net.bytebuddy.implementation.FieldAccessor$c$b r3 = r5.f417240d
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L3d
                    return r1
                L3d:
                    net.bytebuddy.implementation.FieldAccessor$ForSetter r2 = net.bytebuddy.implementation.FieldAccessor.ForSetter.this
                    net.bytebuddy.implementation.FieldAccessor$ForSetter r5 = net.bytebuddy.implementation.FieldAccessor.ForSetter.this
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L48
                    return r1
                L48:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.implementation.FieldAccessor.ForSetter.a.equals(java.lang.Object):boolean");
            }

            @Override // net.bytebuddy.implementation.bytecode.a
            public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                net.bytebuddy.description.field.a aVarA = this.f417240d.a(aVar);
                if (!aVarA.b() && aVar.b()) {
                    throw new IllegalStateException("Cannot set instance field " + aVarA + " from " + aVar);
                }
                if (aVarA.isFinal() && aVar.C()) {
                    throw new IllegalStateException("Cannot set final field " + aVarA + " from " + aVar);
                }
                ForSetter forSetter = ForSetter.this;
                StackManipulation stackManipulationD = forSetter.d(this.f417239c, aVarA, aVar);
                if (stackManipulationD.isValid()) {
                    return new a.c(new StackManipulation.b(aVar.b() ? StackManipulation.Trivial.f417829b : MethodVariableAccess.c(), stackManipulationD, FieldAccess.c(aVarA).a(), forSetter.f417234c.a(aVar)).n(sVar, context).f417834b, aVar.p());
                }
                throw new IllegalStateException("Set value cannot be assigned to " + aVarA);
            }

            public final int hashCode() {
                int iJ2 = D8.j(this.f417238b, getClass().hashCode() * 31, 31);
                T t12 = this.f417239c;
                if (t12 != null) {
                    iJ2 += t12.hashCode();
                }
                return ForSetter.this.hashCode() + ((this.f417240d.hashCode() + (iJ2 * 31)) * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class f extends ForSetter<a.c> {
            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            public final a.c a(TypeDescription typeDescription) {
                typeDescription.x();
                throw null;
            }

            @Override // net.bytebuddy.implementation.Implementation.b
            public final Implementation.b c(Implementation.b bVar) {
                TerminationHandler terminationHandler = TerminationHandler.f417235b;
                throw null;
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            @SuppressFBWarnings(justification = "Expects its own initialized value as argument", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public final StackManipulation d(@net.bytebuddy.utility.nullability.b Object obj, net.bytebuddy.description.field.a aVar, net.bytebuddy.description.method.a aVar2) {
                a.c cVar = (a.c) obj;
                if (!aVar.isFinal() || !aVar2.C()) {
                    FieldAccess.b(cVar).new C12105b();
                    throw null;
                }
                throw new IllegalArgumentException("Cannot set final field " + aVar + " from " + aVar2);
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                throw null;
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                throw null;
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public final int hashCode() {
                super.hashCode();
                throw null;
            }
        }

        public ForSetter(c.C12076c c12076c, TerminationHandler terminationHandler) {
            super(c12076c);
            this.f417234c = terminationHandler;
        }

        @net.bytebuddy.utility.nullability.b
        public abstract T a(TypeDescription typeDescription);

        public abstract StackManipulation d(@net.bytebuddy.utility.nullability.b Object obj, net.bytebuddy.description.field.a aVar, net.bytebuddy.description.method.a aVar2);

        @Override // net.bytebuddy.implementation.FieldAccessor
        public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f417234c.equals(((ForSetter) obj).f417234c);
            }
            return false;
        }

        @Override // net.bytebuddy.implementation.FieldAccessor
        public int hashCode() {
            return this.f417234c.hashCode() + (super.hashCode() * 31);
        }

        @Override // net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
            return new a(target.a(), a(target.a()), this.f417230b.a(target.a()));
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b extends ForSetter<Void> {
            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            @net.bytebuddy.utility.nullability.a
            public final /* bridge */ /* synthetic */ Void a(TypeDescription typeDescription) {
                return null;
            }

            @Override // net.bytebuddy.implementation.Implementation.b
            public final Implementation.b c(Implementation.b bVar) {
                TerminationHandler terminationHandler = TerminationHandler.f417235b;
                throw null;
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            public final StackManipulation d(@net.bytebuddy.utility.nullability.b Object obj, net.bytebuddy.description.field.a aVar, net.bytebuddy.description.method.a aVar2) {
                aVar.getType();
                throw null;
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                throw null;
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public final int hashCode() {
                super.hashCode();
                throw null;
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }

        public static class c extends ForSetter<Void> {
            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            @net.bytebuddy.utility.nullability.a
            public final /* bridge */ /* synthetic */ Void a(TypeDescription typeDescription) {
                return null;
            }

            @Override // net.bytebuddy.implementation.Implementation.b
            public final Implementation.b c(Implementation.b bVar) {
                return new Implementation.c.a(new c(this.f417230b, TerminationHandler.f417236c), bVar);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            public final StackManipulation d(@net.bytebuddy.utility.nullability.b Object obj, net.bytebuddy.description.field.a aVar, net.bytebuddy.description.method.a aVar2) {
                return DefaultValue.c(aVar.getType());
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class d extends ForSetter<c.b> {
            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            public final c.b a(TypeDescription typeDescription) {
                throw null;
            }

            @Override // net.bytebuddy.implementation.Implementation.b
            public final Implementation.b c(Implementation.b bVar) {
                TerminationHandler terminationHandler = TerminationHandler.f417235b;
                throw null;
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            @SuppressFBWarnings(justification = "Expects its own initialized value as argument", value = {"NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE"})
            public final StackManipulation d(@net.bytebuddy.utility.nullability.b Object obj, net.bytebuddy.description.field.a aVar, net.bytebuddy.description.method.a aVar2) {
                net.bytebuddy.description.field.a aVarA = ((c.b) obj).a(aVar2);
                if (aVarA.b() || !aVar2.b()) {
                    return new StackManipulation.b(aVarA.b() ? StackManipulation.Trivial.f417829b : MethodVariableAccess.c(), FieldAccess.c(aVarA).read(), Assigner.f417851M2.a(aVarA.getType(), aVar.getType(), Assigner.Typing.STATIC));
                }
                throw new IllegalStateException("Cannot set instance field " + aVar + " from " + aVar2);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                throw null;
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public final int hashCode() {
                super.hashCode();
                throw null;
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class e extends ForSetter<Void> {

            /* renamed from: d, reason: collision with root package name */
            public final int f417242d;

            public e(c.C12076c c12076c, TerminationHandler terminationHandler, int i12) {
                super(c12076c, terminationHandler);
                this.f417242d = i12;
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            @net.bytebuddy.utility.nullability.a
            public final /* bridge */ /* synthetic */ Void a(TypeDescription typeDescription) {
                return null;
            }

            @Override // net.bytebuddy.implementation.Implementation.b
            public final Implementation.b c(Implementation.b bVar) {
                return new Implementation.c.a(new e(this.f417230b, TerminationHandler.f417236c, this.f417242d), bVar);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            public final StackManipulation d(@net.bytebuddy.utility.nullability.b Object obj, net.bytebuddy.description.field.a aVar, net.bytebuddy.description.method.a aVar2) {
                int size = aVar2.getParameters().size();
                int i12 = this.f417242d;
                if (size > i12) {
                    return new StackManipulation.b(MethodVariableAccess.b((net.bytebuddy.description.method.c) aVar2.getParameters().get(i12)), Assigner.f417851M2.a(((net.bytebuddy.description.method.c) aVar2.getParameters().get(i12)).getType(), aVar.getType(), Assigner.Typing.STATIC));
                }
                throw new IllegalStateException(aVar2 + " does not define a parameter with index " + i12);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417242d == ((e) obj).f417242d;
                }
                return false;
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public final int hashCode() {
                return (super.hashCode() * 31) + this.f417242d;
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }
    }

    public static class d extends FieldAccessor implements e {

        @HashCodeAndEqualsPlugin.Enhance
        public class a implements net.bytebuddy.implementation.bytecode.a {

            /* renamed from: b, reason: collision with root package name */
            public final c.b f417246b;

            public a(c.b bVar) {
                this.f417246b = bVar;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f417246b.equals(aVar.f417246b) && d.this.equals(d.this);
            }

            @Override // net.bytebuddy.implementation.bytecode.a
            public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                StackManipulation.b bVar;
                if (!aVar.C()) {
                    throw new IllegalArgumentException(aVar + " does not describe a field getter or setter");
                }
                net.bytebuddy.description.field.a aVarA = this.f417246b.a(aVar);
                if (!aVarA.b() && aVar.b()) {
                    throw new IllegalStateException("Cannot set instance field " + aVarA + " from " + aVar);
                }
                StackManipulation stackManipulationC = aVarA.b() ? StackManipulation.Trivial.f417829b : MethodVariableAccess.c();
                TypeDescription.Generic returnType = aVar.getReturnType();
                Class cls = Void.TYPE;
                boolean zQ2 = returnType.Q2(cls);
                Assigner.Typing typing = Assigner.Typing.STATIC;
                net.bytebuddy.implementation.bytecode.assign.primitive.b bVar2 = Assigner.f417851M2;
                d dVar = d.this;
                if (!zQ2) {
                    StackManipulation stackManipulation = FieldAccess.c(aVarA).read();
                    dVar.getClass();
                    bVar = new StackManipulation.b(stackManipulationC, stackManipulation, bVar2.a(aVarA.getType(), aVar.getReturnType(), typing), MethodReturn.c(aVar.getReturnType()));
                } else {
                    if (!aVar.getReturnType().Q2(cls) || aVar.getParameters().size() != 1) {
                        throw new IllegalArgumentException("Method " + aVar + " is no bean accessor");
                    }
                    if (aVarA.isFinal() && aVar.C()) {
                        throw new IllegalStateException("Cannot set final field " + aVarA + " from " + aVar);
                    }
                    MethodVariableAccess.b bVarB = MethodVariableAccess.b((net.bytebuddy.description.method.c) aVar.getParameters().get(0));
                    dVar.getClass();
                    bVar = new StackManipulation.b(stackManipulationC, bVarB, bVar2.a(((net.bytebuddy.description.method.c) aVar.getParameters().get(0)).getType(), aVarA.getType(), typing), FieldAccess.c(aVarA).a(), MethodReturn.f418075h);
                }
                if (bVar.isValid()) {
                    return new a.c(bVar.n(sVar, context).f417834b, aVar.p());
                }
                throw new IllegalStateException("Cannot set or get value of " + aVar + " using " + aVarA);
            }

            public final int hashCode() {
                return d.this.hashCode() + ((this.f417246b.hashCode() + (getClass().hashCode() * 31)) * 31);
            }
        }

        public final ForSetter.e a(int i12) {
            if (i12 < 0) {
                throw new IllegalArgumentException(AK.c.g(i12, "A parameter index cannot be negative: "));
            }
            return new ForSetter.e(this.f417230b, ForSetter.TerminationHandler.f417235b, i12);
        }

        @Override // net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
            return new a(this.f417230b.a(target.a()));
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public final InstrumentedType e(InstrumentedType instrumentedType) {
            return instrumentedType;
        }
    }
}
