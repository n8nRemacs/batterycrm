package defpackage;

/* loaded from: classes2.dex */
public enum ww0 {
    DEFAULT("DEFAULT"),
    POSITIVE("POSITIVE"),
    NEGATIVE("NEGATIVE"),
    UNKNOWN("UNKNOWN");

    public static final ww0[] X = values();
    public final String a;

    ww0(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return ho7.i("{value='", this.a, "'}");
    }
}
