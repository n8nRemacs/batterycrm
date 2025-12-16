package net.bytebuddy.implementation;

import com.huawei.hms.framework.common.ContainerUtils;
import com.yandex.div2.D8;
import java.util.ArrayList;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.FieldAccess.b.C12105b;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.M;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.matcher.ModifierMatcher;
import net.bytebuddy.matcher.z;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class ToStringMethod implements Implementation {

    /* renamed from: d, reason: collision with root package name */
    public static final a.d f417456d = (a.d) TypeDescription.d.A0(StringBuilder.class).q().P1(MethodSortMatcher.Sort.f418387e.f418392c.a(C44411u.B(C44411u.c(new d.e(String.class))))).M2();

    /* renamed from: e, reason: collision with root package name */
    public static final a.d f417457e = (a.d) TypeDescription.d.A0(StringBuilder.class).q().P1(C44411u.u()).M2();

    /* renamed from: b, reason: collision with root package name */
    public final PrefixResolver.Default f417458b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC44410t.a<? super a.c> f417459c;

    public interface PrefixResolver {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static abstract class Default implements PrefixResolver {

            /* renamed from: b, reason: collision with root package name */
            public static final Default f417460b;

            /* renamed from: c, reason: collision with root package name */
            public static final Default f417461c;

            /* renamed from: d, reason: collision with root package name */
            public static final Default f417462d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ Default[] f417463e;

            public enum a extends Default {
                @Override // net.bytebuddy.implementation.ToStringMethod.PrefixResolver
                public final String a(TypeDescription typeDescription) {
                    return typeDescription.getName();
                }
            }

            public enum b extends Default {
                @Override // net.bytebuddy.implementation.ToStringMethod.PrefixResolver
                @net.bytebuddy.utility.nullability.b
                public final String a(TypeDescription typeDescription) {
                    return typeDescription.s5();
                }
            }

            public enum c extends Default {
                @Override // net.bytebuddy.implementation.ToStringMethod.PrefixResolver
                public final String a(TypeDescription typeDescription) {
                    return typeDescription.l0();
                }
            }

            static {
                a aVar = new a("FULLY_QUALIFIED_CLASS_NAME", 0, null);
                f417460b = aVar;
                b bVar = new b("CANONICAL_CLASS_NAME", 1, null);
                f417461c = bVar;
                c cVar = new c("SIMPLE_CLASS_NAME", 2, null);
                f417462d = cVar;
                f417463e = new Default[]{aVar, bVar, cVar};
            }

            public Default() {
                throw null;
            }

            public Default(String str, int i12, a aVar) {
            }

            public static Default valueOf(String str) {
                return (Default) Enum.valueOf(Default.class, str);
            }

            public static Default[] values() {
                return (Default[]) f417463e.clone();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements PrefixResolver {
            @Override // net.bytebuddy.implementation.ToStringMethod.PrefixResolver
            public final String a(TypeDescription typeDescription) {
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

        @net.bytebuddy.utility.nullability.b
        String a(TypeDescription typeDescription);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class ValueConsumer implements StackManipulation {

        /* renamed from: b, reason: collision with root package name */
        public static final ValueConsumer f417464b;

        /* renamed from: c, reason: collision with root package name */
        public static final ValueConsumer f417465c;

        /* renamed from: d, reason: collision with root package name */
        public static final ValueConsumer f417466d;

        /* renamed from: e, reason: collision with root package name */
        public static final ValueConsumer f417467e;

        /* renamed from: f, reason: collision with root package name */
        public static final ValueConsumer f417468f;

        /* renamed from: g, reason: collision with root package name */
        public static final ValueConsumer f417469g;

        /* renamed from: h, reason: collision with root package name */
        public static final ValueConsumer f417470h;

        /* renamed from: i, reason: collision with root package name */
        public static final ValueConsumer f417471i;

        /* renamed from: j, reason: collision with root package name */
        public static final ValueConsumer f417472j;

        /* renamed from: k, reason: collision with root package name */
        public static final ValueConsumer f417473k;

        /* renamed from: l, reason: collision with root package name */
        public static final ValueConsumer f417474l;

        /* renamed from: m, reason: collision with root package name */
        public static final ValueConsumer f417475m;

        /* renamed from: n, reason: collision with root package name */
        public static final ValueConsumer f417476n;

        /* renamed from: o, reason: collision with root package name */
        public static final ValueConsumer f417477o;

        /* renamed from: p, reason: collision with root package name */
        public static final ValueConsumer f417478p;

        /* renamed from: q, reason: collision with root package name */
        public static final ValueConsumer f417479q;

        /* renamed from: r, reason: collision with root package name */
        public static final ValueConsumer f417480r;

        /* renamed from: s, reason: collision with root package name */
        public static final ValueConsumer f417481s;

        /* renamed from: t, reason: collision with root package name */
        public static final ValueConsumer f417482t;

        /* renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ ValueConsumer[] f417483u;

        public enum a extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "toString", "([Z)Ljava/lang/String;", 184, false);
                sVar.A("java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", 182, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum b extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "toString", "([B)Ljava/lang/String;", 184, false);
                sVar.A("java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", 182, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum c extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "toString", "([S)Ljava/lang/String;", 184, false);
                sVar.A("java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", 182, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum d extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "toString", "([C)Ljava/lang/String;", 184, false);
                sVar.A("java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", 182, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum e extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "toString", "([I)Ljava/lang/String;", 184, false);
                sVar.A("java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", 182, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum f extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "toString", "([J)Ljava/lang/String;", 184, false);
                sVar.A("java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", 182, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum g extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "toString", "([F)Ljava/lang/String;", 184, false);
                sVar.A("java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", 182, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum h extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "toString", "([D)Ljava/lang/String;", 184, false);
                sVar.A("java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", 182, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum i extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "toString", "([Ljava/lang/Object;)Ljava/lang/String;", 184, false);
                sVar.A("java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", 182, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum j extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/util/Arrays", "deepToString", "([Ljava/lang/Object;)Ljava/lang/String;", 184, false);
                sVar.A("java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", 182, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum k extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/lang/StringBuilder", "append", "(Z)Ljava/lang/StringBuilder;", 182, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum l extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", 182, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum m extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", 182, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum n extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", 182, false);
                return new StackManipulation.d(-1, 0);
            }
        }

        public enum o extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/lang/StringBuilder", "append", "(F)Ljava/lang/StringBuilder;", 182, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum p extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/lang/StringBuilder", "append", "(D)Ljava/lang/StringBuilder;", 182, false);
                return new StackManipulation.d(-1, 0);
            }
        }

        public enum q extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", 182, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum r extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/lang/StringBuilder", "append", "(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;", 182, false);
                return StackManipulation.d.f417832c;
            }
        }

        public enum s extends ValueConsumer {
            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                sVar.A("java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", 182, false);
                return StackManipulation.d.f417832c;
            }
        }

        static {
            k kVar = new k("BOOLEAN", 0, null);
            f417464b = kVar;
            l lVar = new l("CHARACTER", 1, null);
            f417465c = lVar;
            m mVar = new m("INTEGER", 2, null);
            f417466d = mVar;
            n nVar = new n("LONG", 3, null);
            f417467e = nVar;
            o oVar = new o("FLOAT", 4, null);
            f417468f = oVar;
            p pVar = new p("DOUBLE", 5, null);
            f417469g = pVar;
            q qVar = new q("STRING", 6, null);
            f417470h = qVar;
            r rVar = new r("CHARACTER_SEQUENCE", 7, null);
            f417471i = rVar;
            s sVar = new s("OBJECT", 8, null);
            f417472j = sVar;
            a aVar = new a("BOOLEAN_ARRAY", 9, null);
            f417473k = aVar;
            b bVar = new b("BYTE_ARRAY", 10, null);
            f417474l = bVar;
            c cVar = new c("SHORT_ARRAY", 11, null);
            f417475m = cVar;
            d dVar = new d("CHARACTER_ARRAY", 12, null);
            f417476n = dVar;
            e eVar = new e("INTEGER_ARRAY", 13, null);
            f417477o = eVar;
            f fVar = new f("LONG_ARRAY", 14, null);
            f417478p = fVar;
            g gVar = new g("FLOAT_ARRAY", 15, null);
            f417479q = gVar;
            h hVar = new h("DOUBLE_ARRAY", 16, null);
            f417480r = hVar;
            i iVar = new i("REFERENCE_ARRAY", 17, null);
            f417481s = iVar;
            j jVar = new j("NESTED_ARRAY", 18, null);
            f417482t = jVar;
            f417483u = new ValueConsumer[]{kVar, lVar, mVar, nVar, oVar, pVar, qVar, rVar, sVar, aVar, bVar, cVar, dVar, eVar, fVar, gVar, hVar, iVar, jVar};
        }

        public ValueConsumer() {
            throw null;
        }

        public ValueConsumer(String str, int i12, a aVar) {
        }

        public static ValueConsumer valueOf(String str) {
            return (ValueConsumer) Enum.valueOf(ValueConsumer.class, str);
        }

        public static ValueConsumer[] values() {
            return (ValueConsumer[]) f417483u.clone();
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            return true;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements net.bytebuddy.implementation.bytecode.a {

        /* renamed from: b, reason: collision with root package name */
        public final String f417484b;

        /* renamed from: c, reason: collision with root package name */
        public final z f417485c;

        public b(String str, z zVar) {
            this.f417484b = str;
            this.f417485c = zVar;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f417484b.equals(bVar.f417484b) && this.f417485c.equals(bVar.f417485c);
        }

        @Override // net.bytebuddy.implementation.bytecode.a
        public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
            if (aVar.b()) {
                throw new IllegalStateException(D8.m("toString method must not be static: ", aVar));
            }
            if (!aVar.getReturnType().f5().A1(String.class)) {
                throw new IllegalStateException(D8.m("toString method does not return String-compatible type: ", aVar));
            }
            z<a.c> zVar = this.f417485c;
            ArrayList arrayList = new ArrayList(Math.max(0, (zVar.size() * 7) - 2) + 10);
            arrayList.add(net.bytebuddy.implementation.bytecode.b.g(TypeDescription.d.A0(StringBuilder.class)));
            arrayList.add(Duplication.f417792d);
            arrayList.add(new net.bytebuddy.implementation.bytecode.constant.c(this.f417484b));
            arrayList.add(MethodInvocation.a(ToStringMethod.f417456d));
            arrayList.add(new net.bytebuddy.implementation.bytecode.constant.c("{"));
            arrayList.add(ValueConsumer.f417470h);
            boolean z12 = true;
            for (a.c cVar : zVar) {
                if (z12) {
                    z12 = false;
                } else {
                    arrayList.add(new net.bytebuddy.implementation.bytecode.constant.c(", "));
                    arrayList.add(ValueConsumer.f417470h);
                }
                arrayList.add(new net.bytebuddy.implementation.bytecode.constant.c(cVar.getName() + ContainerUtils.KEY_VALUE_DELIMITER));
                ValueConsumer valueConsumer = ValueConsumer.f417470h;
                arrayList.add(valueConsumer);
                arrayList.add(MethodVariableAccess.c());
                arrayList.add(FieldAccess.b(cVar).new C12105b());
                TypeDescription typeDescriptionF5 = cVar.getType().f5();
                if (typeDescriptionF5.Q2(Boolean.TYPE)) {
                    valueConsumer = ValueConsumer.f417464b;
                } else if (typeDescriptionF5.Q2(Character.TYPE)) {
                    valueConsumer = ValueConsumer.f417465c;
                } else if (typeDescriptionF5.Q2(Byte.TYPE) || typeDescriptionF5.Q2(Short.TYPE) || typeDescriptionF5.Q2(Integer.TYPE)) {
                    valueConsumer = ValueConsumer.f417466d;
                } else if (typeDescriptionF5.Q2(Long.TYPE)) {
                    valueConsumer = ValueConsumer.f417467e;
                } else if (typeDescriptionF5.Q2(Float.TYPE)) {
                    valueConsumer = ValueConsumer.f417468f;
                } else if (typeDescriptionF5.Q2(Double.TYPE)) {
                    valueConsumer = ValueConsumer.f417469g;
                } else if (!typeDescriptionF5.Q2(String.class)) {
                    if (typeDescriptionF5.e5(CharSequence.class)) {
                        valueConsumer = ValueConsumer.f417471i;
                    } else if (typeDescriptionF5.Q2(boolean[].class)) {
                        valueConsumer = ValueConsumer.f417473k;
                    } else if (typeDescriptionF5.Q2(byte[].class)) {
                        valueConsumer = ValueConsumer.f417474l;
                    } else if (typeDescriptionF5.Q2(short[].class)) {
                        valueConsumer = ValueConsumer.f417475m;
                    } else if (typeDescriptionF5.Q2(char[].class)) {
                        valueConsumer = ValueConsumer.f417476n;
                    } else if (typeDescriptionF5.Q2(int[].class)) {
                        valueConsumer = ValueConsumer.f417477o;
                    } else if (typeDescriptionF5.Q2(long[].class)) {
                        valueConsumer = ValueConsumer.f417478p;
                    } else if (typeDescriptionF5.Q2(float[].class)) {
                        valueConsumer = ValueConsumer.f417479q;
                    } else if (typeDescriptionF5.Q2(double[].class)) {
                        valueConsumer = ValueConsumer.f417480r;
                    } else if (typeDescriptionF5.w2()) {
                        valueConsumer = typeDescriptionF5.m().w2() ? ValueConsumer.f417482t : ValueConsumer.f417481s;
                    } else {
                        valueConsumer = ValueConsumer.f417472j;
                    }
                }
                arrayList.add(valueConsumer);
            }
            arrayList.add(new net.bytebuddy.implementation.bytecode.constant.c("}"));
            arrayList.add(ValueConsumer.f417470h);
            arrayList.add(MethodInvocation.a(ToStringMethod.f417457e));
            arrayList.add(MethodReturn.f418076i);
            return new a.c(new StackManipulation.b(arrayList).n(sVar, context).f417834b, aVar.p());
        }

        public final int hashCode() {
            return this.f417485c.hashCode() + ((((((((((this.f417484b.hashCode() + (getClass().hashCode() * 31)) * 31) + 123) * 31) + 125) * 31) + 1396) * 31) + 61) * 31);
        }
    }

    public ToStringMethod(PrefixResolver.Default r12, InterfaceC44410t.a aVar) {
        this.f417458b = r12;
        this.f417459c = aVar;
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ToStringMethod toStringMethod = (ToStringMethod) obj;
        return this.f417458b.equals(toStringMethod.f417458b) && this.f417459c.equals(toStringMethod.f417459c);
    }

    public final int hashCode() {
        return this.f417459c.hashCode() + ((((((((((this.f417458b.hashCode() + (getClass().hashCode() * 31)) * 31) + 123) * 31) + 125) * 31) + 1396) * 31) + 61) * 31);
    }

    @Override // net.bytebuddy.implementation.Implementation
    public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
        if (target.a().E()) {
            throw new IllegalStateException("Cannot implement meaningful toString method for " + target.a());
        }
        String strA = this.f417458b.a(target.a());
        if (strA != null) {
            return new b(strA, target.a().x().P1(new M(ModifierMatcher.Mode.STATIC.f418407d.d(this.f417459c))));
        }
        throw new IllegalStateException("Prefix for toString method cannot be null");
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public final InstrumentedType e(InstrumentedType instrumentedType) {
        return instrumentedType;
    }
}
