package defpackage;

/* loaded from: classes2.dex */
public enum fi8 {
    LOGIN("LOGIN"),
    RECOVERY("RECOVERY"),
    PHONE_BINDING("PHONE_BINDING"),
    PHONE_CONFIRM("PHONE_CONFIRM");

    public final String a;

    fi8(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return ho7.i("{value='", this.a, "'}");
    }
}
