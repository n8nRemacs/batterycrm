package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nh7 {

    /* JADX INFO: Fake field, exist only in values array */
    nh7 EF5;
    public static final /* synthetic */ nh7[] b = {new nh7("LIGHT", 0), new nh7("MEDIUM", 1), new nh7("HEAVY", 2), new nh7("RIGID", 3), new nh7("SOFT", 4)};
    public static final mh7 Companion = new mh7();
    public static final Object a = ipi.b(2, new i77(4));

    public static nh7 valueOf(String str) {
        return (nh7) Enum.valueOf(nh7.class, str);
    }

    public static nh7[] values() {
        return (nh7[]) b.clone();
    }
}
