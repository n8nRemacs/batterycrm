package net.bytebuddy.implementation.bytecode;

import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class Remainder implements StackManipulation {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Remainder[] f417806d;

    /* renamed from: b, reason: collision with root package name */
    public final int f417807b;

    /* renamed from: c, reason: collision with root package name */
    public final StackSize f417808c;

    /* JADX INFO: Fake field, exist only in values array */
    Remainder EF0;

    static {
        StackSize stackSize = StackSize.SINGLE;
        Remainder remainder = new Remainder(0, 112, "INTEGER", stackSize);
        StackSize stackSize2 = StackSize.DOUBLE;
        f417806d = new Remainder[]{remainder, new Remainder(1, 113, "LONG", stackSize2), new Remainder(2, 114, "FLOAT", stackSize), new Remainder(3, 115, "DOUBLE", stackSize2)};
    }

    public Remainder(int i12, int i13, String str, StackSize stackSize) {
        this.f417807b = i13;
        this.f417808c = stackSize;
    }

    public static Remainder valueOf(String str) {
        return (Remainder) Enum.valueOf(Remainder.class, str);
    }

    public static Remainder[] values() {
        return (Remainder[]) f417806d.clone();
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.m(this.f417807b);
        return this.f417808c.b();
    }
}
