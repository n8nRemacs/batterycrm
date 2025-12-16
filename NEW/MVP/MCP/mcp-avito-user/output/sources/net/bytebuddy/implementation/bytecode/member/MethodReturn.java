package net.bytebuddy.implementation.bytecode.member;

import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
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
public final class MethodReturn implements StackManipulation {

    /* renamed from: d, reason: collision with root package name */
    public static final MethodReturn f418071d;

    /* renamed from: e, reason: collision with root package name */
    public static final MethodReturn f418072e;

    /* renamed from: f, reason: collision with root package name */
    public static final MethodReturn f418073f;

    /* renamed from: g, reason: collision with root package name */
    public static final MethodReturn f418074g;

    /* renamed from: h, reason: collision with root package name */
    public static final MethodReturn f418075h;

    /* renamed from: i, reason: collision with root package name */
    public static final MethodReturn f418076i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ MethodReturn[] f418077j;

    /* renamed from: b, reason: collision with root package name */
    public final int f418078b;

    /* renamed from: c, reason: collision with root package name */
    public final StackManipulation.d f418079c;

    static {
        StackSize stackSize = StackSize.SINGLE;
        MethodReturn methodReturn = new MethodReturn(0, 172, "INTEGER", stackSize);
        f418071d = methodReturn;
        StackSize stackSize2 = StackSize.DOUBLE;
        MethodReturn methodReturn2 = new MethodReturn(1, 175, "DOUBLE", stackSize2);
        f418072e = methodReturn2;
        MethodReturn methodReturn3 = new MethodReturn(2, 174, "FLOAT", stackSize);
        f418073f = methodReturn3;
        MethodReturn methodReturn4 = new MethodReturn(3, 173, "LONG", stackSize2);
        f418074g = methodReturn4;
        MethodReturn methodReturn5 = new MethodReturn(4, 177, "VOID", StackSize.ZERO);
        f418075h = methodReturn5;
        MethodReturn methodReturn6 = new MethodReturn(5, 176, "REFERENCE", stackSize);
        f418076i = methodReturn6;
        f418077j = new MethodReturn[]{methodReturn, methodReturn2, methodReturn3, methodReturn4, methodReturn5, methodReturn6};
    }

    public MethodReturn(int i12, int i13, String str, StackSize stackSize) {
        this.f418078b = i13;
        this.f418079c = stackSize.b();
    }

    public static MethodReturn c(TypeDefinition typeDefinition) {
        return typeDefinition.w5() ? typeDefinition.Q2(Long.TYPE) ? f418074g : typeDefinition.Q2(Double.TYPE) ? f418072e : typeDefinition.Q2(Float.TYPE) ? f418073f : typeDefinition.Q2(Void.TYPE) ? f418075h : f418071d : f418076i;
    }

    public static MethodReturn valueOf(String str) {
        return (MethodReturn) Enum.valueOf(MethodReturn.class, str);
    }

    public static MethodReturn[] values() {
        return (MethodReturn[]) f418077j.clone();
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.m(this.f418078b);
        return this.f418079c;
    }
}
