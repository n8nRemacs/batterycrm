package net.bytebuddy.implementation.bytecode;

import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.s;

/* loaded from: classes7.dex */
public enum ShiftLeft implements StackManipulation {
    /* JADX INFO: Fake field, exist only in values array */
    EF9("INTEGER", StackSize.SINGLE),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("LONG", StackSize.DOUBLE);


    /* renamed from: b, reason: collision with root package name */
    public final int f417817b;

    /* renamed from: c, reason: collision with root package name */
    public final StackSize f417818c;

    ShiftLeft(String str, StackSize stackSize) {
        this.f417817b = i;
        this.f417818c = stackSize;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.m(this.f417817b);
        return this.f417818c.b();
    }
}
