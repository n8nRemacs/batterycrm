package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g9d {
    public static final g9d b;
    public static final /* synthetic */ g9d[] c;
    public static final /* synthetic */ zg5 d;
    public final int a;

    static {
        g9d g9dVar = new g9d("EMOJI", 0, 0);
        b = g9dVar;
        g9d[] g9dVarArr = {g9dVar, new g9d("STICKER", 1, 1)};
        c = g9dVarArr;
        d = new zg5(g9dVarArr);
    }

    public g9d(String str, int i, int i2) {
        this.a = i2;
    }

    public static g9d valueOf(String str) {
        return (g9d) Enum.valueOf(g9d.class, str);
    }

    public static g9d[] values() {
        return (g9d[]) c.clone();
    }
}
