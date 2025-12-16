package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class tdd {
    public static final tdd a;
    public static final tdd b;
    public static final /* synthetic */ tdd[] c;

    static {
        tdd tddVar = new tdd("VIDEO_MSG", 0);
        a = tddVar;
        tdd tddVar2 = new tdd("AUDIO_MSG", 1);
        b = tddVar2;
        c = new tdd[]{tddVar, tddVar2};
    }

    public static tdd valueOf(String str) {
        return (tdd) Enum.valueOf(tdd.class, str);
    }

    public static tdd[] values() {
        return (tdd[]) c.clone();
    }
}
