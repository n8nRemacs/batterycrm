package defpackage;

/* loaded from: classes.dex */
public final class eb implements lb {
    public final boolean a;

    public eb(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb)) {
            return false;
        }
        eb ebVar = (eb) obj;
        ebVar.getClass();
        return this.a == ebVar.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return xrf.p("DisableAllScreenRecordInCall(isSuccess=true, isEnabled=", ")", this.a);
    }
}
