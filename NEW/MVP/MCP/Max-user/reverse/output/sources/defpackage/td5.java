package defpackage;

/* loaded from: classes2.dex */
public final class td5 implements vd5 {
    public final fff a;

    public td5(fff fffVar) {
        this.a = fffVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof td5) && fni.a(this.a, ((td5) obj).a);
    }

    public final int hashCode() {
        fff fffVar = this.a;
        if (fffVar == null) {
            return 0;
        }
        return fffVar.hashCode();
    }

    public final String toString() {
        return "EmptyDialog(sticker=" + this.a + ")";
    }
}
