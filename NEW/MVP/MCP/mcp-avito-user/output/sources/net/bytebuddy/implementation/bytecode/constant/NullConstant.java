package net.bytebuddy.implementation.bytecode.constant;

import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class NullConstant implements StackManipulation {

    /* renamed from: b, reason: collision with root package name */
    public static final NullConstant f418029b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ NullConstant[] f418030c;

    static {
        NullConstant nullConstant = new NullConstant("INSTANCE", 0);
        f418029b = nullConstant;
        f418030c = new NullConstant[]{nullConstant};
    }

    public NullConstant() {
        throw null;
    }

    public static NullConstant valueOf(String str) {
        return (NullConstant) Enum.valueOf(NullConstant.class, str);
    }

    public static NullConstant[] values() {
        return (NullConstant[]) f418030c.clone();
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.m(1);
        return new StackManipulation.d(1, 1);
    }
}
