package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j07 {
    public static final j07 a;
    public static final /* synthetic */ j07[] b;

    static {
        j07 j07Var = new j07("ONE_VIDEO_TIMEOUT", 0);
        a = j07Var;
        b = new j07[]{j07Var};
    }

    public static j07 valueOf(String str) {
        return (j07) Enum.valueOf(j07.class, str);
    }

    public static j07[] values() {
        return (j07[]) b.clone();
    }
}
