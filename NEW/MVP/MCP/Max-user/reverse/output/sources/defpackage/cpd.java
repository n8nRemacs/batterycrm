package defpackage;

/* loaded from: classes2.dex */
public final class cpd extends rj0 {
    public final long c;

    public cpd(long j) {
        super(new pzf("error.user.restricted.send", null, null));
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cpd) && this.c == ((cpd) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    @Override // defpackage.rj0, defpackage.sj0
    public final String toString() {
        return a9h.d(this.c, "RestrictedSendMessageErrorEvent(chatId=", ")");
    }
}
