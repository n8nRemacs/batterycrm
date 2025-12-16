package hu.akarnokd.rxjava3.util;

import l41.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class AlwaysTrueBooleanSupplier implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AlwaysTrueBooleanSupplier[] f398282b = {new AlwaysTrueBooleanSupplier("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    AlwaysTrueBooleanSupplier EF5;

    public AlwaysTrueBooleanSupplier() {
        throw null;
    }

    public static AlwaysTrueBooleanSupplier valueOf(String str) {
        return (AlwaysTrueBooleanSupplier) Enum.valueOf(AlwaysTrueBooleanSupplier.class, str);
    }

    public static AlwaysTrueBooleanSupplier[] values() {
        return (AlwaysTrueBooleanSupplier[]) f398282b.clone();
    }

    @Override // l41.e
    public final boolean a() {
        return true;
    }
}
