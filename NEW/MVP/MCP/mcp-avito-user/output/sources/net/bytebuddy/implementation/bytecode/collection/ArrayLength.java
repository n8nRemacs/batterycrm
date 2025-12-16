package net.bytebuddy.implementation.bytecode.collection;

import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ArrayLength implements StackManipulation {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ArrayLength[] f417959b = {new ArrayLength("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    ArrayLength EF5;

    public ArrayLength() {
        throw null;
    }

    public static ArrayLength valueOf(String str) {
        return (ArrayLength) Enum.valueOf(ArrayLength.class, str);
    }

    public static ArrayLength[] values() {
        return (ArrayLength[]) f417959b.clone();
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.m(190);
        return StackManipulation.d.f417832c;
    }
}
