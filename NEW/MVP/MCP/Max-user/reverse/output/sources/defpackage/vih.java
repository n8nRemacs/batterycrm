package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vih {
    public static final /* synthetic */ vih[] a = {new vih("UNKNOWN", 0), new vih("VISIBLE", 1), new vih("INVISIBLE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    vih EF5;

    static {
        values();
    }

    public static vih valueOf(String str) {
        return (vih) Enum.valueOf(vih.class, str);
    }

    public static vih[] values() {
        return (vih[]) a.clone();
    }
}
