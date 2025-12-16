package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class cf0 {
    public static final /* synthetic */ cf0[] c;
    public static final /* synthetic */ zg5 d;
    public final String a;
    public final boolean b;

    static {
        cf0[] cf0VarArr = {new cf0("LIGHT", 0, "Light", false), new cf0("DARK", 1, "Dark", true)};
        c = cf0VarArr;
        d = new zg5(cf0VarArr);
    }

    public cf0(String str, int i, String str2, boolean z) {
        this.a = str2;
        this.b = z;
    }

    public static cf0 valueOf(String str) {
        return (cf0) Enum.valueOf(cf0.class, str);
    }

    public static cf0[] values() {
        return (cf0[]) c.clone();
    }
}
