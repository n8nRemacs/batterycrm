package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class iv5 {
    public static final /* synthetic */ iv5[] a = {new iv5("ALREADY_DOWNLOADING", 0), new iv5("FILE_IS_NULL", 1), new iv5("INTERRUPTED", 2), new iv5("FAIL", 3), new iv5("CANCELLED", 4), new iv5("MAX_FAIL_COUNT", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    iv5 EF5;

    public static iv5 valueOf(String str) {
        return (iv5) Enum.valueOf(iv5.class, str);
    }

    public static iv5[] values() {
        return (iv5[]) a.clone();
    }
}
