package defpackage;

/* loaded from: classes2.dex */
public final class q51 extends l0g {
    public final String c;

    public q51(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q51) && fni.a(this.c, ((q51) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.pj0
    public final String toString() {
        String str = this.c;
        return ho7.i("Response(joinLink=", vmf.O(str, 0, str.length(), "*").toString(), ")");
    }
}
