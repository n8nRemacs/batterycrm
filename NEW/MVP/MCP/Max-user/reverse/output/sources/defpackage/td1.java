package defpackage;

/* loaded from: classes.dex */
public final class td1 extends ud1 {
    public final txg a;

    public td1(txg txgVar) {
        this.a = txgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof td1) && fni.a(this.a, ((td1) obj).a);
    }

    public final int hashCode() {
        txg txgVar = this.a;
        if (txgVar == null) {
            return 0;
        }
        return txgVar.hashCode();
    }

    public final String toString() {
        return "VideoState(participant=" + this.a + ")";
    }
}
