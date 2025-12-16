package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l09 {
    public static final /* synthetic */ zg5 X;
    public static final l09 a;
    public static final l09 b;
    public static final l09 c;
    public static final l09 d;
    public static final /* synthetic */ l09[] o;

    static {
        l09 l09Var = new l09("UNKNOWN", 0);
        a = l09Var;
        l09 l09Var2 = new l09("AUDIO_MESSAGE", 1);
        b = l09Var2;
        l09 l09Var3 = new l09("AUDIO_DRAFT", 2);
        l09 l09Var4 = new l09("AUDIO_RECORD", 3);
        c = l09Var4;
        l09 l09Var5 = new l09("MUSIC_FILE", 4);
        d = l09Var5;
        l09[] l09VarArr = {l09Var, l09Var2, l09Var3, l09Var4, l09Var5};
        o = l09VarArr;
        X = new zg5(l09VarArr);
    }

    public static l09 valueOf(String str) {
        return (l09) Enum.valueOf(l09.class, str);
    }

    public static l09[] values() {
        return (l09[]) o.clone();
    }
}
