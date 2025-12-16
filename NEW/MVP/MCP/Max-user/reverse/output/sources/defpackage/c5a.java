package defpackage;

/* loaded from: classes2.dex */
public final class c5a extends l0g {
    public final m8a c;

    public c5a(m8a m8aVar) {
        this.c = m8aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c5a) && fni.a(this.c, ((c5a) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(messagesReactions=" + this.c + ")";
    }
}
