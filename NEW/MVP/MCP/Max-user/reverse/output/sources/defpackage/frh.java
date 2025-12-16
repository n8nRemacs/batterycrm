package defpackage;

/* loaded from: classes2.dex */
public final class frh {
    public static final erh Companion = new erh();
    public static final zy7[] d = {null, sna.Companion.serializer(), null};
    public final String a;
    public final sna b;
    public final boolean c;

    public /* synthetic */ frh(int i, String str, sna snaVar, boolean z) {
        if (7 != (i & 7)) {
            g5j.c(i, 7, drh.a.d());
            throw null;
        }
        this.a = str;
        this.b = snaVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frh)) {
            return false;
        }
        frh frhVar = (frh) obj;
        return fni.a(this.a, frhVar.a) && this.b == frhVar.b && this.c == frhVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppHapticFeedbackNotification(requestId=");
        sb.append(this.a);
        sb.append(", notificationType=");
        sb.append(this.b);
        sb.append(", disableVibrationFallback=");
        return az1.k(sb, this.c, ")");
    }
}
