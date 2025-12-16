package hu.akarnokd.rxjava3.operators;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ExpandStrategy {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ExpandStrategy[] f397918b = {new ExpandStrategy("DEPTH_FIRST", 0), new ExpandStrategy("BREADTH_FIRST", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ExpandStrategy EF5;

    public ExpandStrategy() {
        throw null;
    }

    public static ExpandStrategy valueOf(String str) {
        return (ExpandStrategy) Enum.valueOf(ExpandStrategy.class, str);
    }

    public static ExpandStrategy[] values() {
        return (ExpandStrategy[]) f397918b.clone();
    }
}
