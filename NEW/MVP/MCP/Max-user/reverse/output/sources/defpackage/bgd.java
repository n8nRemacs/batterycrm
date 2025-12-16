package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bgd {
    public static final bgd a;
    public static final bgd b;
    public static final /* synthetic */ bgd[] c;

    /* JADX INFO: Fake field, exist only in values array */
    bgd EF0;

    static {
        bgd bgdVar = new bgd("UNDEFINE", 0);
        bgd bgdVar2 = new bgd("OWNER_EXIT", 1);
        a = bgdVar2;
        bgd bgdVar3 = new bgd("RECORD_STOP", 2);
        b = bgdVar3;
        c = new bgd[]{bgdVar, bgdVar2, bgdVar3};
    }

    public static bgd valueOf(String str) {
        return (bgd) Enum.valueOf(bgd.class, str);
    }

    public static bgd[] values() {
        return (bgd[]) c.clone();
    }
}
