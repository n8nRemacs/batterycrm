package defpackage;

/* loaded from: classes2.dex */
public final class yxh {
    public static final xxh Companion = new xxh();
    public static final zy7[] c = {null, ayh.Companion.serializer()};
    public final String a;
    public final ayh b;

    public /* synthetic */ yxh(int i, String str, ayh ayhVar) {
        if (3 != (i & 3)) {
            g5j.c(i, 3, wxh.a.d());
            throw null;
        }
        this.a = str;
        this.b = ayhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxh)) {
            return false;
        }
        yxh yxhVar = (yxh) obj;
        return fni.a(this.a, yxhVar.a) && this.b == yxhVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppShareResponse(requestId=" + this.a + ", status=" + this.b + ")";
    }

    public yxh(String str) {
        ayh ayhVar = ayh.b;
        this.a = str;
        this.b = ayhVar;
    }
}
