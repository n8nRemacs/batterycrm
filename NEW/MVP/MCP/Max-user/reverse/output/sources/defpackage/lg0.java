package defpackage;

/* loaded from: classes2.dex */
public final class lg0 {
    public final boolean a;
    public final boolean b;

    public lg0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static void a(boolean z, y6d y6dVar, String str, String str2) {
        if (z) {
            y6dVar.log("BadNetworkIndicatorConfig", wy1.i("[", str, "]: ", str2));
        }
    }

    public final void b(y6d y6dVar, String str, String str2) {
        a(this.a, y6dVar, str, str2);
    }

    public final void c(y6d y6dVar, String str, String str2) {
        a(this.b, y6dVar, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg0)) {
            return false;
        }
        lg0 lg0Var = (lg0) obj;
        return this.a == lg0Var.a && this.b == lg0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xc0.g("DebugLoggingConfig(debugLogging=", this.a, ", debugVerboseLogging=", this.b, ")");
    }
}
