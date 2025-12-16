package net.bytebuddy.implementation.bytecode;

import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class Multiplication implements StackManipulation {

    /* renamed from: d, reason: collision with root package name */
    public static final Multiplication f417802d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Multiplication[] f417803e;

    /* renamed from: b, reason: collision with root package name */
    public final int f417804b;

    /* renamed from: c, reason: collision with root package name */
    public final StackSize f417805c;

    static {
        StackSize stackSize = StackSize.SINGLE;
        Multiplication multiplication = new Multiplication(0, 104, "INTEGER", stackSize);
        f417802d = multiplication;
        StackSize stackSize2 = StackSize.DOUBLE;
        f417803e = new Multiplication[]{multiplication, new Multiplication(1, 105, "LONG", stackSize2), new Multiplication(2, 106, "FLOAT", stackSize), new Multiplication(3, 107, "DOUBLE", stackSize2)};
    }

    public Multiplication(int i12, int i13, String str, StackSize stackSize) {
        this.f417804b = i13;
        this.f417805c = stackSize;
    }

    public static Multiplication valueOf(String str) {
        return (Multiplication) Enum.valueOf(Multiplication.class, str);
    }

    public static Multiplication[] values() {
        return (Multiplication[]) f417803e.clone();
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.m(this.f417804b);
        return this.f417805c.b();
    }
}
