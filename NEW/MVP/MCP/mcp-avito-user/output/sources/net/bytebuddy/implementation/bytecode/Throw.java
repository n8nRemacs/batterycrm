package net.bytebuddy.implementation.bytecode;

import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class Throw implements StackManipulation {

    /* renamed from: b, reason: collision with root package name */
    public static final Throw f417844b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Throw[] f417845c;

    static {
        Throw r02 = new Throw("INSTANCE", 0);
        f417844b = r02;
        f417845c = new Throw[]{r02};
    }

    public Throw() {
        throw null;
    }

    public static Throw valueOf(String str) {
        return (Throw) Enum.valueOf(Throw.class, str);
    }

    public static Throw[] values() {
        return (Throw[]) f417845c.clone();
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.m(191);
        return StackSize.SINGLE.b();
    }
}
