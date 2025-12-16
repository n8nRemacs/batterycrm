package defpackage;

/* loaded from: classes2.dex */
public final class tqh extends vqh {
    public final String c;
    public final sna d;
    public final boolean e;

    public tqh(String str, sna snaVar, boolean z) {
        this.c = str;
        this.d = snaVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqh)) {
            return false;
        }
        tqh tqhVar = (tqh) obj;
        return fni.a(this.c, tqhVar.c) && this.d == tqhVar.d && this.e == tqhVar.e;
    }

    @Override // defpackage.vqh
    public final boolean f() {
        return this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Notification(queryId=");
        sb.append(this.c);
        sb.append(", notificationType=");
        sb.append(this.d);
        sb.append(", disableVibrationFallback=");
        return az1.k(sb, this.e, ")");
    }
}
