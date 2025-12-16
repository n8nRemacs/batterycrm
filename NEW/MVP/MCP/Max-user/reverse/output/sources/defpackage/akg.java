package defpackage;

/* loaded from: classes2.dex */
public final class akg implements bkg {
    public final String a;

    public akg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof akg) && fni.a(this.a, ((akg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("GoToTwoFASettings(trackId=", this.a, ")");
    }
}
