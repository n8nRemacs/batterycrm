package hu.akarnokd.rxjava3.util;

import l41.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class AlwaysFalseBooleanSupplier implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AlwaysFalseBooleanSupplier[] f398281b = {new AlwaysFalseBooleanSupplier("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    AlwaysFalseBooleanSupplier EF5;

    public AlwaysFalseBooleanSupplier() {
        throw null;
    }

    public static AlwaysFalseBooleanSupplier valueOf(String str) {
        return (AlwaysFalseBooleanSupplier) Enum.valueOf(AlwaysFalseBooleanSupplier.class, str);
    }

    public static AlwaysFalseBooleanSupplier[] values() {
        return (AlwaysFalseBooleanSupplier[]) f398281b.clone();
    }

    @Override // l41.e
    public final boolean a() {
        return false;
    }
}
