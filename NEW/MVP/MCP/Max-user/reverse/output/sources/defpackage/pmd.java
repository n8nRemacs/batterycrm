package defpackage;

/* loaded from: classes2.dex */
public final class pmd {
    public final double a;
    public final int b;
    public final int c;

    public pmd(int i, int i2, double d) {
        this.a = d;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmd)) {
            return false;
        }
        pmd pmdVar = (pmd) obj;
        return Double.compare(this.a, pmdVar.a) == 0 && this.b == pmdVar.b && this.c == pmdVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + iti.a(this.b, Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ReportNetworkStatusConfig(networkStatusReportThreshold=" + this.a + ", networkStatusReportIntervalMs=" + this.b + ", networkStatusReportForceIntervalMs=" + this.c + ")";
    }
}
