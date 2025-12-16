package net.bytebuddy.implementation.bytecode.assign.primitive;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner;
import net.bytebuddy.jar.asm.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class PrimitiveUnboxingDelegate implements StackManipulation {

    /* renamed from: g, reason: collision with root package name */
    public static final PrimitiveUnboxingDelegate f417875g;

    /* renamed from: h, reason: collision with root package name */
    public static final PrimitiveUnboxingDelegate f417876h;

    /* renamed from: i, reason: collision with root package name */
    public static final PrimitiveUnboxingDelegate f417877i;

    /* renamed from: j, reason: collision with root package name */
    public static final PrimitiveUnboxingDelegate f417878j;

    /* renamed from: k, reason: collision with root package name */
    public static final PrimitiveUnboxingDelegate f417879k;

    /* renamed from: l, reason: collision with root package name */
    public static final PrimitiveUnboxingDelegate f417880l;

    /* renamed from: m, reason: collision with root package name */
    public static final PrimitiveUnboxingDelegate f417881m;

    /* renamed from: n, reason: collision with root package name */
    public static final PrimitiveUnboxingDelegate f417882n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ PrimitiveUnboxingDelegate[] f417883o;

    /* renamed from: b, reason: collision with root package name */
    public final TypeDescription f417884b;

    /* renamed from: c, reason: collision with root package name */
    public final TypeDescription f417885c;

    /* renamed from: d, reason: collision with root package name */
    public final StackManipulation.d f417886d;

    /* renamed from: e, reason: collision with root package name */
    public final String f417887e;

    /* renamed from: f, reason: collision with root package name */
    public final String f417888f;

    public enum ExplicitlyTypedUnboxingResponsible implements b {
        BOOLEAN(PrimitiveUnboxingDelegate.f417875g),
        BYTE(PrimitiveUnboxingDelegate.f417876h),
        SHORT(PrimitiveUnboxingDelegate.f417877i),
        CHARACTER(PrimitiveUnboxingDelegate.f417878j),
        INTEGER(PrimitiveUnboxingDelegate.f417879k),
        LONG(PrimitiveUnboxingDelegate.f417880l),
        FLOAT(PrimitiveUnboxingDelegate.f417881m),
        DOUBLE(PrimitiveUnboxingDelegate.f417882n);


        /* renamed from: b, reason: collision with root package name */
        public final PrimitiveUnboxingDelegate f417898b;

        ExplicitlyTypedUnboxingResponsible(PrimitiveUnboxingDelegate primitiveUnboxingDelegate) {
            this.f417898b = primitiveUnboxingDelegate;
        }

        @Override // net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.b
        public final StackManipulation.b a(TypeDescription.Generic generic, Assigner.Typing typing) {
            PrimitiveUnboxingDelegate primitiveUnboxingDelegate = this.f417898b;
            return new StackManipulation.b(primitiveUnboxingDelegate, PrimitiveWideningDelegate.a(primitiveUnboxingDelegate.f417885c).b(generic));
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements b {

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription.Generic f417899b;

        public a(TypeDescription.Generic generic) {
            this.f417899b = generic;
        }

        @Override // net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.b
        public final StackManipulation.b a(TypeDescription.Generic generic, Assigner.Typing typing) {
            PrimitiveUnboxingDelegate primitiveUnboxingDelegate;
            ReferenceTypeAwareAssigner referenceTypeAwareAssigner = ReferenceTypeAwareAssigner.f417926b;
            PrimitiveUnboxingDelegate primitiveUnboxingDelegate2 = PrimitiveUnboxingDelegate.f417875g;
            if (generic.Q2(Boolean.TYPE)) {
                primitiveUnboxingDelegate = PrimitiveUnboxingDelegate.f417875g;
            } else if (generic.Q2(Byte.TYPE)) {
                primitiveUnboxingDelegate = PrimitiveUnboxingDelegate.f417876h;
            } else if (generic.Q2(Short.TYPE)) {
                primitiveUnboxingDelegate = PrimitiveUnboxingDelegate.f417877i;
            } else if (generic.Q2(Character.TYPE)) {
                primitiveUnboxingDelegate = PrimitiveUnboxingDelegate.f417878j;
            } else if (generic.Q2(Integer.TYPE)) {
                primitiveUnboxingDelegate = PrimitiveUnboxingDelegate.f417879k;
            } else if (generic.Q2(Long.TYPE)) {
                primitiveUnboxingDelegate = PrimitiveUnboxingDelegate.f417880l;
            } else if (generic.Q2(Float.TYPE)) {
                primitiveUnboxingDelegate = PrimitiveUnboxingDelegate.f417881m;
            } else {
                if (!generic.Q2(Double.TYPE)) {
                    throw new IllegalArgumentException("Expected non-void primitive type instead of " + generic);
                }
                primitiveUnboxingDelegate = PrimitiveUnboxingDelegate.f417882n;
            }
            return new StackManipulation.b(referenceTypeAwareAssigner.a(this.f417899b, primitiveUnboxingDelegate.f417884b.P0(), typing), primitiveUnboxingDelegate);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f417899b.equals(((a) obj).f417899b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f417899b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    public interface b {
        StackManipulation.b a(TypeDescription.Generic generic, Assigner.Typing typing);
    }

    static {
        Class cls = Boolean.TYPE;
        StackSize stackSize = StackSize.ZERO;
        PrimitiveUnboxingDelegate primitiveUnboxingDelegate = new PrimitiveUnboxingDelegate("BOOLEAN", 0, Boolean.class, cls, stackSize, "booleanValue", "()Z");
        f417875g = primitiveUnboxingDelegate;
        PrimitiveUnboxingDelegate primitiveUnboxingDelegate2 = new PrimitiveUnboxingDelegate("BYTE", 1, Byte.class, Byte.TYPE, stackSize, "byteValue", "()B");
        f417876h = primitiveUnboxingDelegate2;
        PrimitiveUnboxingDelegate primitiveUnboxingDelegate3 = new PrimitiveUnboxingDelegate("SHORT", 2, Short.class, Short.TYPE, stackSize, "shortValue", "()S");
        f417877i = primitiveUnboxingDelegate3;
        PrimitiveUnboxingDelegate primitiveUnboxingDelegate4 = new PrimitiveUnboxingDelegate("CHARACTER", 3, Character.class, Character.TYPE, stackSize, "charValue", "()C");
        f417878j = primitiveUnboxingDelegate4;
        PrimitiveUnboxingDelegate primitiveUnboxingDelegate5 = new PrimitiveUnboxingDelegate("INTEGER", 4, Integer.class, Integer.TYPE, stackSize, "intValue", "()I");
        f417879k = primitiveUnboxingDelegate5;
        Class cls2 = Long.TYPE;
        StackSize stackSize2 = StackSize.SINGLE;
        PrimitiveUnboxingDelegate primitiveUnboxingDelegate6 = new PrimitiveUnboxingDelegate("LONG", 5, Long.class, cls2, stackSize2, "longValue", "()J");
        f417880l = primitiveUnboxingDelegate6;
        PrimitiveUnboxingDelegate primitiveUnboxingDelegate7 = new PrimitiveUnboxingDelegate("FLOAT", 6, Float.class, Float.TYPE, stackSize, "floatValue", "()F");
        f417881m = primitiveUnboxingDelegate7;
        PrimitiveUnboxingDelegate primitiveUnboxingDelegate8 = new PrimitiveUnboxingDelegate("DOUBLE", 7, Double.class, Double.TYPE, stackSize2, "doubleValue", "()D");
        f417882n = primitiveUnboxingDelegate8;
        f417883o = new PrimitiveUnboxingDelegate[]{primitiveUnboxingDelegate, primitiveUnboxingDelegate2, primitiveUnboxingDelegate3, primitiveUnboxingDelegate4, primitiveUnboxingDelegate5, primitiveUnboxingDelegate6, primitiveUnboxingDelegate7, primitiveUnboxingDelegate8};
    }

    public PrimitiveUnboxingDelegate(String str, int i12, Class cls, Class cls2, StackSize stackSize, String str2, String str3) {
        this.f417886d = stackSize.c();
        this.f417884b = TypeDescription.d.A0(cls);
        this.f417885c = TypeDescription.d.A0(cls2);
        this.f417887e = str2;
        this.f417888f = str3;
    }

    public static PrimitiveUnboxingDelegate valueOf(String str) {
        return (PrimitiveUnboxingDelegate) Enum.valueOf(PrimitiveUnboxingDelegate.class, str);
    }

    public static PrimitiveUnboxingDelegate[] values() {
        return (PrimitiveUnboxingDelegate[]) f417883o.clone();
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.A(this.f417884b.f5().V(), this.f417887e, this.f417888f, 182, false);
        return this.f417886d;
    }
}
