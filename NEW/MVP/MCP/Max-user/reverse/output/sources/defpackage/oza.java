package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class oza {
    public static final oza a;
    public static final oza b;
    public static final /* synthetic */ oza[] c;

    static {
        oza ozaVar = new oza("ICON", 0);
        a = ozaVar;
        oza ozaVar2 = new oza("ICON_WITH_TEXT", 1);
        b = ozaVar2;
        c = new oza[]{ozaVar, ozaVar2};
    }

    public static oza valueOf(String str) {
        return (oza) Enum.valueOf(oza.class, str);
    }

    public static oza[] values() {
        return (oza[]) c.clone();
    }
}
