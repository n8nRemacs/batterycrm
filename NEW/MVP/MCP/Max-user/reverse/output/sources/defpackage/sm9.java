package defpackage;

/* loaded from: classes2.dex */
public enum sm9 {
    UNKNOWN("UNKNOWN"),
    USER("USER"),
    GROUP("GROUP"),
    CHANNEL("CHANNEL"),
    CHANNEL_ADMIN("CHANNEL_ADMIN");

    public final String a;

    sm9(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return ho7.i("{value='", this.a, "'}");
    }
}
