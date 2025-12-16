package net.bytebuddy.implementation.bytecode;

import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
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
public final class Subtraction implements StackManipulation {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Subtraction[] f417841d;

    /* renamed from: b, reason: collision with root package name */
    public final int f417842b;

    /* renamed from: c, reason: collision with root package name */
    public final StackSize f417843c;

    /* JADX INFO: Fake field, exist only in values array */
    Subtraction EF0;

    static {
        StackSize stackSize = StackSize.SINGLE;
        Subtraction subtraction = new Subtraction(0, 100, "INTEGER", stackSize);
        StackSize stackSize2 = StackSize.DOUBLE;
        f417841d = new Subtraction[]{subtraction, new Subtraction(1, UpdateStatusCode.DialogButton.CONFIRM, "LONG", stackSize2), new Subtraction(2, 102, "FLOAT", stackSize), new Subtraction(3, 103, "DOUBLE", stackSize2)};
    }

    public Subtraction(int i12, int i13, String str, StackSize stackSize) {
        this.f417842b = i13;
        this.f417843c = stackSize;
    }

    public static Subtraction valueOf(String str) {
        return (Subtraction) Enum.valueOf(Subtraction.class, str);
    }

    public static Subtraction[] values() {
        return (Subtraction[]) f417841d.clone();
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.m(this.f417842b);
        return this.f417843c.b();
    }
}
