package net.bytebuddy.implementation;

import com.yandex.div2.D8;
import java.util.ArrayList;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.Addition;
import net.bytebuddy.implementation.bytecode.Multiplication;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.constant.ClassConstant;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.FieldAccess.b.C12105b;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
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
public class HashCodeMethod implements Implementation {

    /* renamed from: f, reason: collision with root package name */
    public static final a.d f417254f = (a.d) TypeDescription.d.A0(Object.class).q().P1(C44411u.p()).M2();

    /* renamed from: g, reason: collision with root package name */
    public static final a.d f417255g = (a.d) TypeDescription.d.A0(Object.class).q().P1(C44411u.x("getClass").a(C44411u.z(0))).M2();

    /* renamed from: b, reason: collision with root package name */
    public final OffsetProvider f417256b;

    /* renamed from: c, reason: collision with root package name */
    public final int f417257c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC44410t.a<? super a.c> f417258d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC44410t.a<? super a.c> f417259e;

    public interface NullValueGuard {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NoOp implements NullValueGuard {

            /* renamed from: b, reason: collision with root package name */
            public static final NoOp f417260b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ NoOp[] f417261c;

            static {
                NoOp noOp = new NoOp("INSTANCE", 0);
                f417260b = noOp;
                f417261c = new NoOp[]{noOp};
            }

            public NoOp() {
                throw null;
            }

            public static NoOp valueOf(String str) {
                return (NoOp) Enum.valueOf(NoOp.class, str);
            }

            public static NoOp[] values() {
                return (NoOp[]) f417261c.clone();
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.NullValueGuard
            public final StackManipulation a() {
                return StackManipulation.Trivial.f417829b;
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.NullValueGuard
            public final StackManipulation b() {
                return StackManipulation.Trivial.f417829b;
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.NullValueGuard
            public final int c() {
                return 0;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements NullValueGuard {

            /* renamed from: d, reason: collision with root package name */
            public static final Object[] f417262d = new Object[0];

            /* renamed from: e, reason: collision with root package name */
            public static final Object[] f417263e = {1};

            /* renamed from: b, reason: collision with root package name */
            public final net.bytebuddy.description.method.a f417264b;

            /* renamed from: c, reason: collision with root package name */
            public final r f417265c = new r();

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$a$a, reason: collision with other inner class name */
            public class C12077a extends StackManipulation.a {
                public C12077a() {
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
                    sVar.s(a.this.f417265c);
                    if (context.b().c(ClassFileVersion.f415296h)) {
                        sVar.k(a.f417262d, 4, a.f417263e, 0, 1);
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
                    sVar.J(58, aVar.f417264b.p());
                    sVar.J(25, aVar.f417264b.p());
                    sVar.r(198, aVar.f417265c);
                    sVar.J(25, aVar.f417264b.p());
                    return StackManipulation.d.f417832c;
                }
            }

            public a(net.bytebuddy.description.method.a aVar) {
                this.f417264b = aVar;
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.NullValueGuard
            public final StackManipulation a() {
                return new C12077a();
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.NullValueGuard
            public final StackManipulation b() {
                return new b();
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.NullValueGuard
            public final int c() {
                return 1;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f417264b.equals(aVar.f417264b) && this.f417265c.equals(aVar.f417265c);
            }

            public final int hashCode() {
                return this.f417265c.hashCode() + D8.h(this.f417264b, getClass().hashCode() * 31, 31);
            }
        }

        StackManipulation a();

        StackManipulation b();

        int c();
    }

    public interface OffsetProvider {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForDynamicTypeHash implements OffsetProvider {

            /* renamed from: b, reason: collision with root package name */
            public static final ForDynamicTypeHash f417268b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ ForDynamicTypeHash[] f417269c;

            static {
                ForDynamicTypeHash forDynamicTypeHash = new ForDynamicTypeHash("INSTANCE", 0);
                f417268b = forDynamicTypeHash;
                f417269c = new ForDynamicTypeHash[]{forDynamicTypeHash};
            }

            public ForDynamicTypeHash() {
                throw null;
            }

            public static ForDynamicTypeHash valueOf(String str) {
                return (ForDynamicTypeHash) Enum.valueOf(ForDynamicTypeHash.class, str);
            }

            public static ForDynamicTypeHash[] values() {
                return (ForDynamicTypeHash[]) f417269c.clone();
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.OffsetProvider
            public final StackManipulation a(TypeDescription typeDescription) {
                return new StackManipulation.b(MethodVariableAccess.c(), MethodInvocation.a(HashCodeMethod.f417255g).i(typeDescription), MethodInvocation.a(HashCodeMethod.f417254f).i(TypeDescription.f416319C2));
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForStaticTypeHash implements OffsetProvider {

            /* renamed from: b, reason: collision with root package name */
            public static final ForStaticTypeHash f417270b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ ForStaticTypeHash[] f417271c;

            static {
                ForStaticTypeHash forStaticTypeHash = new ForStaticTypeHash("INSTANCE", 0);
                f417270b = forStaticTypeHash;
                f417271c = new ForStaticTypeHash[]{forStaticTypeHash};
            }

            public ForStaticTypeHash() {
                throw null;
            }

            public static ForStaticTypeHash valueOf(String str) {
                return (ForStaticTypeHash) Enum.valueOf(ForStaticTypeHash.class, str);
            }

            public static ForStaticTypeHash[] values() {
                return (ForStaticTypeHash[]) f417271c.clone();
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.OffsetProvider
            public final StackManipulation a(TypeDescription typeDescription) {
                return new StackManipulation.b(ClassConstant.c(typeDescription), MethodInvocation.a(HashCodeMethod.f417254f).i(TypeDescription.f416319C2));
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForSuperMethodCall implements OffsetProvider {

            /* renamed from: b, reason: collision with root package name */
            public static final ForSuperMethodCall f417272b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ ForSuperMethodCall[] f417273c;

            static {
                ForSuperMethodCall forSuperMethodCall = new ForSuperMethodCall("INSTANCE", 0);
                f417272b = forSuperMethodCall;
                f417273c = new ForSuperMethodCall[]{forSuperMethodCall};
            }

            public ForSuperMethodCall() {
                throw null;
            }

            public static ForSuperMethodCall valueOf(String str) {
                return (ForSuperMethodCall) Enum.valueOf(ForSuperMethodCall.class, str);
            }

            public static ForSuperMethodCall[] values() {
                return (ForSuperMethodCall[]) f417273c.clone();
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.OffsetProvider
            public final StackManipulation a(TypeDescription typeDescription) {
                TypeDescription.Generic genericC3 = typeDescription.C3();
                if (genericC3 != null) {
                    return new StackManipulation.b(MethodVariableAccess.c(), MethodInvocation.a(HashCodeMethod.f417254f).h(genericC3.f5()));
                }
                throw new IllegalStateException(typeDescription + " does not declare a super class");
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements OffsetProvider {
            @Override // net.bytebuddy.implementation.HashCodeMethod.OffsetProvider
            public final StackManipulation a(TypeDescription typeDescription) {
                return IntegerConstant.c(17);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return (getClass().hashCode() * 31) + 17;
            }
        }

        StackManipulation a(TypeDescription typeDescription);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class ValueTransformer implements StackManipulation {

        /* renamed from: b, reason: collision with root package name */
        public static final ValueTransformer f417274b;

        /* renamed from: c, reason: collision with root package name */
        public static final ValueTransformer f417275c;

        /* renamed from: d, reason: collision with root package name */
        public static final ValueTransformer f417276d;

        /* renamed from: e, reason: collision with root package name */
        public static final ValueTransformer f417277e;

        /* renamed from: f, reason: collision with root package name */
        public static final ValueTransformer f417278f;

        /* renamed from: g, reason: collision with root package name */
        public static final ValueTransformer f417279g;

        /* renamed from: h, reason: collision with root package name */
        public static final ValueTransformer f417280h;

        /* renamed from: i, reason: collision with root package name */
        public static final ValueTransformer f417281i;

        /* renamed from: j, reason: collision with root package name */
        public static final ValueTransformer f417282j;

        /* renamed from: k, reason: collision with root package name */
        public static final ValueTransformer f417283k;

        /* renamed from: l, reason: collision with root package name */
        public static final ValueTransformer f417284l;

        /* renamed from: m, reason: collision with root package name */
        public static final ValueTransformer f417285m;

        /* renamed from: n, reason: collision with root package name */
        public static final ValueTransformer f417286n;

        /* renamed from: o, reason: collision with root package name */
        public static final /* synthetic */ ValueTransformer[] f417287o;

        public enum a extends ValueTransformer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "hashCode", "([F)I", 184, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum b extends ValueTransformer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "hashCode", "([D)I", 184, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum c extends ValueTransformer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "hashCode", "([Ljava/lang/Object;)I", 184, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum d extends ValueTransformer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "deepHashCode", "([Ljava/lang/Object;)I", 184, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum e extends ValueTransformer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.m(92);
                sVar.o(16, 32);
                sVar.m(125);
                sVar.m(131);
                sVar.m(136);
                return new StackManipulation.d(-1, 3);
            }
        }

        public enum f extends ValueTransformer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/lang/Float", "floatToIntBits", "(F)I", 184, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum g extends ValueTransformer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/lang/Double", "doubleToLongBits", "(D)J", 184, false);
                sVar.m(92);
                sVar.o(16, 32);
                sVar.m(125);
                sVar.m(131);
                sVar.m(136);
                return new StackManipulation.d(-1, 3);
            }
        }

        public enum h extends ValueTransformer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "hashCode", "([Z)I", 184, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum i extends ValueTransformer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "hashCode", "([B)I", 184, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum j extends ValueTransformer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "hashCode", "([S)I", 184, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum k extends ValueTransformer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "hashCode", "([C)I", 184, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum l extends ValueTransformer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "hashCode", "([I)I", 184, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum m extends ValueTransformer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "hashCode", "([J)I", 184, false);
                return StackManipulation.d.f417832c;
            }
        }

        static {
            e eVar = new e("LONG", 0, null);
            f417274b = eVar;
            f fVar = new f("FLOAT", 1, null);
            f417275c = fVar;
            g gVar = new g("DOUBLE", 2, null);
            f417276d = gVar;
            h hVar = new h("BOOLEAN_ARRAY", 3, null);
            f417277e = hVar;
            i iVar = new i("BYTE_ARRAY", 4, null);
            f417278f = iVar;
            j jVar = new j("SHORT_ARRAY", 5, null);
            f417279g = jVar;
            k kVar = new k("CHARACTER_ARRAY", 6, null);
            f417280h = kVar;
            l lVar = new l("INTEGER_ARRAY", 7, null);
            f417281i = lVar;
            m mVar = new m("LONG_ARRAY", 8, null);
            f417282j = mVar;
            a aVar = new a("FLOAT_ARRAY", 9, null);
            f417283k = aVar;
            b bVar = new b("DOUBLE_ARRAY", 10, null);
            f417284l = bVar;
            c cVar = new c("REFERENCE_ARRAY", 11, null);
            f417285m = cVar;
            d dVar = new d("NESTED_ARRAY", 12, null);
            f417286n = dVar;
            f417287o = new ValueTransformer[]{eVar, fVar, gVar, hVar, iVar, jVar, kVar, lVar, mVar, aVar, bVar, cVar, dVar};
        }

        public ValueTransformer() {
            throw null;
        }

        public ValueTransformer(String str, int i12, a aVar) {
        }

        public static ValueTransformer valueOf(String str) {
            return (ValueTransformer) Enum.valueOf(ValueTransformer.class, str);
        }

        public static ValueTransformer[] values() {
            return (ValueTransformer[]) f417287o.clone();
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            return true;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements net.bytebuddy.implementation.bytecode.a {

        /* renamed from: b, reason: collision with root package name */
        public final StackManipulation f417288b;

        /* renamed from: c, reason: collision with root package name */
        public final int f417289c;

        /* renamed from: d, reason: collision with root package name */
        public final z f417290d;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC44410t<? super a.c> f417291e;

        public b(StackManipulation stackManipulation, int i12, z zVar, InterfaceC44410t interfaceC44410t) {
            this.f417288b = stackManipulation;
            this.f417289c = i12;
            this.f417290d = zVar;
            this.f417291e = interfaceC44410t;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f417289c == bVar.f417289c && this.f417288b.equals(bVar.f417288b) && this.f417290d.equals(bVar.f417290d) && this.f417291e.equals(bVar.f417291e);
        }

        @Override // net.bytebuddy.implementation.bytecode.a
        public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
            if (aVar.b()) {
                throw new IllegalStateException(D8.m("Hash code method must not be static: ", aVar));
            }
            if (!aVar.getReturnType().Q2(Integer.TYPE)) {
                throw new IllegalStateException(D8.m("Hash code method does not return primitive integer: ", aVar));
            }
            z<a.c> zVar = this.f417290d;
            ArrayList arrayList = new ArrayList((zVar.size() * 8) + 2);
            arrayList.add(this.f417288b);
            int iMax = 0;
            for (a.c cVar : zVar) {
                arrayList.add(IntegerConstant.c(this.f417289c));
                arrayList.add(Multiplication.f417802d);
                arrayList.add(MethodVariableAccess.c());
                arrayList.add(FieldAccess.b(cVar).new C12105b());
                NullValueGuard aVar2 = (cVar.getType().w5() || cVar.getType().w2() || this.f417291e.b(cVar)) ? NullValueGuard.NoOp.f417260b : new NullValueGuard.a(aVar);
                arrayList.add(aVar2.b());
                TypeDescription.Generic type = cVar.getType();
                ValueTransformer valueTransformer = ValueTransformer.f417274b;
                arrayList.add((type.Q2(Boolean.TYPE) || type.Q2(Byte.TYPE) || type.Q2(Short.TYPE) || type.Q2(Character.TYPE) || type.Q2(Integer.TYPE)) ? StackManipulation.Trivial.f417829b : type.Q2(Long.TYPE) ? ValueTransformer.f417274b : type.Q2(Float.TYPE) ? ValueTransformer.f417275c : type.Q2(Double.TYPE) ? ValueTransformer.f417276d : type.Q2(boolean[].class) ? ValueTransformer.f417277e : type.Q2(byte[].class) ? ValueTransformer.f417278f : type.Q2(short[].class) ? ValueTransformer.f417279g : type.Q2(char[].class) ? ValueTransformer.f417280h : type.Q2(int[].class) ? ValueTransformer.f417281i : type.Q2(long[].class) ? ValueTransformer.f417282j : type.Q2(float[].class) ? ValueTransformer.f417283k : type.Q2(double[].class) ? ValueTransformer.f417284l : type.w2() ? type.m().w2() ? ValueTransformer.f417286n : ValueTransformer.f417285m : MethodInvocation.a(HashCodeMethod.f417254f).i(type.f5()));
                arrayList.add(Addition.f417785d);
                arrayList.add(aVar2.a());
                iMax = Math.max(iMax, aVar2.c());
            }
            arrayList.add(MethodReturn.f418071d);
            return new a.c(new StackManipulation.b(arrayList).n(sVar, context).f417834b, aVar.p() + iMax);
        }

        public final int hashCode() {
            return this.f417291e.hashCode() + ((this.f417290d.hashCode() + ((((this.f417288b.hashCode() + (getClass().hashCode() * 31)) * 31) + this.f417289c) * 31)) * 31);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashCodeMethod(OffsetProvider offsetProvider) {
        C44396e<?> c44396e = C44396e.f418423d;
        this(offsetProvider, 31, c44396e, c44396e);
    }

    public static HashCodeMethod a() {
        return new HashCodeMethod(new OffsetProvider.a());
    }

    public static HashCodeMethod d(boolean z12) {
        return new HashCodeMethod(z12 ? OffsetProvider.ForDynamicTypeHash.f417268b : OffsetProvider.ForStaticTypeHash.f417270b);
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HashCodeMethod hashCodeMethod = (HashCodeMethod) obj;
        return this.f417257c == hashCodeMethod.f417257c && this.f417256b.equals(hashCodeMethod.f417256b) && this.f417258d.equals(hashCodeMethod.f417258d) && this.f417259e.equals(hashCodeMethod.f417259e);
    }

    public final int hashCode() {
        return this.f417259e.hashCode() + ((this.f417258d.hashCode() + ((((this.f417256b.hashCode() + (getClass().hashCode() * 31)) * 31) + this.f417257c) * 31)) * 31);
    }

    @Override // net.bytebuddy.implementation.Implementation
    public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
        if (target.a().E()) {
            throw new IllegalStateException("Cannot implement meaningful hash code method for " + target.a());
        }
        return new b(this.f417256b.a(target.a()), this.f417257c, target.a().x().P1(new M(ModifierMatcher.Mode.STATIC.f418407d.d(this.f417258d))), this.f417259e);
    }

    public HashCodeMethod(OffsetProvider offsetProvider, int i12, InterfaceC44410t.a<? super a.c> aVar, InterfaceC44410t.a<? super a.c> aVar2) {
        this.f417256b = offsetProvider;
        this.f417257c = i12;
        this.f417258d = aVar;
        this.f417259e = aVar2;
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public final InstrumentedType e(InstrumentedType instrumentedType) {
        return instrumentedType;
    }
}
