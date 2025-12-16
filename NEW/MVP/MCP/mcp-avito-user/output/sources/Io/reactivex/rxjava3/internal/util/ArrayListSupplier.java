package io.reactivex.rxjava3.internal.util;

import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ArrayListSupplier implements l41.s<List<Object>>, l41.o<Object, List<Object>> {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayListSupplier f404815b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ArrayListSupplier[] f404816c;

    static {
        ArrayListSupplier arrayListSupplier = new ArrayListSupplier("INSTANCE", 0);
        f404815b = arrayListSupplier;
        f404816c = new ArrayListSupplier[]{arrayListSupplier};
    }

    public ArrayListSupplier() {
        throw null;
    }

    public static ArrayListSupplier valueOf(String str) {
        return (ArrayListSupplier) Enum.valueOf(ArrayListSupplier.class, str);
    }

    public static ArrayListSupplier[] values() {
        return (ArrayListSupplier[]) f404816c.clone();
    }

    @Override // l41.o
    public final List<Object> apply(Object obj) {
        return new ArrayList();
    }

    @Override // l41.s
    public final List<Object> get() {
        return new ArrayList();
    }
}
