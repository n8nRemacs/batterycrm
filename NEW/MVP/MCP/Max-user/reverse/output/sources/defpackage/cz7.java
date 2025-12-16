package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cz7 {
    public static final /* synthetic */ cz7[] a = {new cz7("PUBLIC", 0), new cz7("PROTECTED", 1), new cz7("INTERNAL", 2), new cz7("PRIVATE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    cz7 EF5;

    public static cz7 valueOf(String str) {
        return (cz7) Enum.valueOf(cz7.class, str);
    }

    public static cz7[] values() {
        return (cz7[]) a.clone();
    }
}
