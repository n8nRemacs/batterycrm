package defpackage;

/* loaded from: classes2.dex */
public enum sj3 {
    SPAM("SPAM"),
    PORNO("PORNO"),
    EXTREMISM("EXTREMISM"),
    FAKE("FAKE"),
    THREAT("THREAT"),
    OTHER("OTHER");

    public final String a;

    sj3(String str) {
        this.a = str;
    }

    public static sj3 a(String str) {
        str.getClass();
        switch (str) {
            case "THREAT":
                return THREAT;
            case "EXTREMISM":
                return EXTREMISM;
            case "FAKE":
                return FAKE;
            case "SPAM":
                return SPAM;
            case "OTHER":
                return OTHER;
            case "PORNO":
                return PORNO;
            default:
                throw new IllegalArgumentException(ho7.i("No such value ", str, " for Complaint"));
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return ho7.i("{value='", this.a, "'}");
    }
}
