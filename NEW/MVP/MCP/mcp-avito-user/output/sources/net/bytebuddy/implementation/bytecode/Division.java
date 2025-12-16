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
public final class Division implements StackManipulation {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Division[] f417789d;

    /* renamed from: b, reason: collision with root package name */
    public final int f417790b;

    /* renamed from: c, reason: collision with root package name */
    public final StackSize f417791c;

    /* JADX INFO: Fake field, exist only in values array */
    Division EF0;

    static {
        StackSize stackSize = StackSize.SINGLE;
        Division division = new Division(0, 108, "INTEGER", stackSize);
        StackSize stackSize2 = StackSize.DOUBLE;
        f417789d = new Division[]{division, new Division(1, 109, "LONG", stackSize2), new Division(2, 110, "FLOAT", stackSize), new Division(3, 111, "DOUBLE", stackSize2)};
    }

    public Division(int i12, int i13, String str, StackSize stackSize) {
        this.f417790b = i13;
        this.f417791c = stackSize;
    }

    public static Division valueOf(String str) {
        return (Division) Enum.valueOf(Division.class, str);
    }

    public static Division[] values() {
        return (Division[]) f417789d.clone();
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.m(this.f417790b);
        return this.f417791c.b();
    }
}
