package hu.akarnokd.rxjava3.util;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class SelfComparator implements Comparator<Comparable> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ SelfComparator[] f398284b = {new SelfComparator("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    SelfComparator EF5;

    public SelfComparator() {
        throw null;
    }

    public static SelfComparator valueOf(String str) {
        return (SelfComparator) Enum.valueOf(SelfComparator.class, str);
    }

    public static SelfComparator[] values() {
        return (SelfComparator[]) f398284b.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }
}
