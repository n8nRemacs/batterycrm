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
public final class Addition implements StackManipulation {

    /* renamed from: d, reason: collision with root package name */
    public static final Addition f417785d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Addition[] f417786e;

    /* renamed from: b, reason: collision with root package name */
    public final int f417787b;

    /* renamed from: c, reason: collision with root package name */
    public final StackSize f417788c;

    static {
        StackSize stackSize = StackSize.SINGLE;
        Addition addition = new Addition(0, 96, "INTEGER", stackSize);
        f417785d = addition;
        StackSize stackSize2 = StackSize.DOUBLE;
        f417786e = new Addition[]{addition, new Addition(1, 97, "LONG", stackSize2), new Addition(2, 98, "FLOAT", stackSize), new Addition(3, 99, "DOUBLE", stackSize2)};
    }

    public Addition(int i12, int i13, String str, StackSize stackSize) {
        this.f417787b = i13;
        this.f417788c = stackSize;
    }

    public static Addition valueOf(String str) {
        return (Addition) Enum.valueOf(Addition.class, str);
    }

    public static Addition[] values() {
        return (Addition[]) f417786e.clone();
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.m(this.f417787b);
        return this.f417788c.b();
    }
}
