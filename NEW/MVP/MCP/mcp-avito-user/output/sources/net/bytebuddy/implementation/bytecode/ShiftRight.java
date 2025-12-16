package net.bytebuddy.implementation.bytecode;

import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.s;

/* loaded from: classes7.dex */
public enum ShiftRight implements StackManipulation {
    /* JADX INFO: Fake field, exist only in values array */
    INTEGER(122, StackSize.SINGLE, Unsigned.f417822d),
    /* JADX INFO: Fake field, exist only in values array */
    LONG(123, StackSize.DOUBLE, Unsigned.f417823e);


    /* renamed from: b, reason: collision with root package name */
    public final int f417820b;

    /* renamed from: c, reason: collision with root package name */
    public final StackSize f417821c;

    public enum Unsigned implements StackManipulation {
        f417822d("INTEGER", StackSize.SINGLE),
        f417823e("LONG", StackSize.DOUBLE);


        /* renamed from: b, reason: collision with root package name */
        public final int f417825b;

        /* renamed from: c, reason: collision with root package name */
        public final StackSize f417826c;

        Unsigned(String str, StackSize stackSize) {
            this.f417825b = i;
            this.f417826c = stackSize;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            return true;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            sVar.m(this.f417825b);
            return this.f417826c.b();
        }
    }

    ShiftRight(int i12, StackSize stackSize, Unsigned unsigned) {
        this.f417820b = i12;
        this.f417821c = stackSize;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.m(this.f417820b);
        return this.f417821c.b();
    }
}
