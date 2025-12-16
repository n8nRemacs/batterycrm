package net.bytebuddy.implementation.bytecode.assign.primitive;

import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class PrimitiveBoxingDelegate {

    /* renamed from: f, reason: collision with root package name */
    public static final PrimitiveBoxingDelegate f417860f;

    /* renamed from: g, reason: collision with root package name */
    public static final PrimitiveBoxingDelegate f417861g;

    /* renamed from: h, reason: collision with root package name */
    public static final PrimitiveBoxingDelegate f417862h;

    /* renamed from: i, reason: collision with root package name */
    public static final PrimitiveBoxingDelegate f417863i;

    /* renamed from: j, reason: collision with root package name */
    public static final PrimitiveBoxingDelegate f417864j;

    /* renamed from: k, reason: collision with root package name */
    public static final PrimitiveBoxingDelegate f417865k;

    /* renamed from: l, reason: collision with root package name */
    public static final PrimitiveBoxingDelegate f417866l;

    /* renamed from: m, reason: collision with root package name */
    public static final PrimitiveBoxingDelegate f417867m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ PrimitiveBoxingDelegate[] f417868n;

    /* renamed from: b, reason: collision with root package name */
    public final TypeDescription f417869b;

    /* renamed from: c, reason: collision with root package name */
    public final StackManipulation.d f417870c;

    /* renamed from: d, reason: collision with root package name */
    public final String f417871d = "valueOf";

    /* renamed from: e, reason: collision with root package name */
    public final String f417872e;

    public class a implements StackManipulation {

        /* renamed from: b, reason: collision with root package name */
        public final StackManipulation f417873b;

        public a(StackManipulation stackManipulation) {
            this.f417873b = stackManipulation;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            return this.f417873b.isValid();
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            PrimitiveBoxingDelegate primitiveBoxingDelegate = PrimitiveBoxingDelegate.this;
            sVar.A(primitiveBoxingDelegate.f417869b.V(), primitiveBoxingDelegate.f417871d, primitiveBoxingDelegate.f417872e, 184, false);
            return primitiveBoxingDelegate.f417870c.a(this.f417873b.n(sVar, context));
        }
    }

    static {
        StackSize stackSize = StackSize.ZERO;
        PrimitiveBoxingDelegate primitiveBoxingDelegate = new PrimitiveBoxingDelegate("BOOLEAN", 0, Boolean.class, stackSize, "(Z)Ljava/lang/Boolean;");
        f417860f = primitiveBoxingDelegate;
        PrimitiveBoxingDelegate primitiveBoxingDelegate2 = new PrimitiveBoxingDelegate("BYTE", 1, Byte.class, stackSize, "(B)Ljava/lang/Byte;");
        f417861g = primitiveBoxingDelegate2;
        PrimitiveBoxingDelegate primitiveBoxingDelegate3 = new PrimitiveBoxingDelegate("SHORT", 2, Short.class, stackSize, "(S)Ljava/lang/Short;");
        f417862h = primitiveBoxingDelegate3;
        PrimitiveBoxingDelegate primitiveBoxingDelegate4 = new PrimitiveBoxingDelegate("CHARACTER", 3, Character.class, stackSize, "(C)Ljava/lang/Character;");
        f417863i = primitiveBoxingDelegate4;
        PrimitiveBoxingDelegate primitiveBoxingDelegate5 = new PrimitiveBoxingDelegate("INTEGER", 4, Integer.class, stackSize, "(I)Ljava/lang/Integer;");
        f417864j = primitiveBoxingDelegate5;
        StackSize stackSize2 = StackSize.SINGLE;
        PrimitiveBoxingDelegate primitiveBoxingDelegate6 = new PrimitiveBoxingDelegate("LONG", 5, Long.class, stackSize2, "(J)Ljava/lang/Long;");
        f417865k = primitiveBoxingDelegate6;
        PrimitiveBoxingDelegate primitiveBoxingDelegate7 = new PrimitiveBoxingDelegate("FLOAT", 6, Float.class, stackSize, "(F)Ljava/lang/Float;");
        f417866l = primitiveBoxingDelegate7;
        PrimitiveBoxingDelegate primitiveBoxingDelegate8 = new PrimitiveBoxingDelegate("DOUBLE", 7, Double.class, stackSize2, "(D)Ljava/lang/Double;");
        f417867m = primitiveBoxingDelegate8;
        f417868n = new PrimitiveBoxingDelegate[]{primitiveBoxingDelegate, primitiveBoxingDelegate2, primitiveBoxingDelegate3, primitiveBoxingDelegate4, primitiveBoxingDelegate5, primitiveBoxingDelegate6, primitiveBoxingDelegate7, primitiveBoxingDelegate8};
    }

    public PrimitiveBoxingDelegate(String str, int i12, Class cls, StackSize stackSize, String str2) {
        this.f417869b = TypeDescription.d.A0(cls);
        this.f417870c = stackSize.b();
        this.f417872e = str2;
    }

    public static PrimitiveBoxingDelegate valueOf(String str) {
        return (PrimitiveBoxingDelegate) Enum.valueOf(PrimitiveBoxingDelegate.class, str);
    }

    public static PrimitiveBoxingDelegate[] values() {
        return (PrimitiveBoxingDelegate[]) f417868n.clone();
    }
}
