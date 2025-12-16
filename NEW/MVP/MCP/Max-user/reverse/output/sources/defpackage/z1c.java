package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class z1c {
    public static final /* synthetic */ z1c[] b;
    public static final /* synthetic */ zg5 c;
    public final int a;

    static {
        z1c[] z1cVarArr = {new z1c("CALL", 0, 1), new z1c("VIDEO", 1, 2)};
        b = z1cVarArr;
        c = new zg5(z1cVarArr);
    }

    public z1c(String str, int i, int i2) {
        this.a = i2;
    }

    public static z1c valueOf(String str) {
        return (z1c) Enum.valueOf(z1c.class, str);
    }

    public static z1c[] values() {
        return (z1c[]) b.clone();
    }
}
