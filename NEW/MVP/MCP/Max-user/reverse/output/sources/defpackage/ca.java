package defpackage;

/* loaded from: classes.dex */
public final class ca {
    public static final ca h = new ca(false, true, true, true, true, true, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public ca(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
    }

    public static ca a(ca caVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        if ((i & 1) != 0) {
            z = caVar.a;
        }
        boolean z7 = z;
        if ((i & 2) != 0) {
            z2 = caVar.b;
        }
        boolean z8 = z2;
        if ((i & 4) != 0) {
            z3 = caVar.c;
        }
        boolean z9 = z3;
        if ((i & 8) != 0) {
            z4 = caVar.d;
        }
        boolean z10 = z4;
        if ((i & 16) != 0) {
            z5 = caVar.e;
        }
        boolean z11 = z5;
        boolean z12 = caVar.f;
        if ((i & 64) != 0) {
            z6 = caVar.g;
        }
        caVar.getClass();
        return new ca(z7, z8, z9, z10, z11, z12, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca)) {
            return false;
        }
        ca caVar = (ca) obj;
        return this.a == caVar.a && this.b == caVar.b && this.c == caVar.c && this.d == caVar.d && this.e == caVar.e && this.f == caVar.f && this.g == caVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + a9h.b(a9h.b(a9h.b(a9h.b(a9h.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbP = ho7.p("AdminCallState(isAdminOrCreator=", this.a, ", isEnableCameraAvailableInCall=", this.b, ", isEnableMicrophoneAvailableInCall=");
        az1.t(", isEnableSharingScreenAvailableInCall=", ", isEnableRecordScreenAvailableInCall=", sbP, this.c, this.d);
        az1.t(", isEnableHandsUpAvailableInCall=", ", isEnableWaitingRoom=", sbP, this.e, this.f);
        return az1.k(sbP, this.g, ")");
    }
}
