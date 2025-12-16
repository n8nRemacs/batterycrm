package defpackage;

/* loaded from: classes2.dex */
public enum jt2 {
    SOUND("SOUND"),
    VIBRATION("VIBR"),
    LED("LED");

    public static final int o = values().length;
    public final String a;

    jt2(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return ho7.i("{value='", this.a, "'}");
    }
}
