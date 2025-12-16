package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class k7a {
    public final CharSequence a;
    public final CharSequence b;
    public final Object c;

    public k7a(CharSequence charSequence, CharSequence charSequence2, Map map) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7a)) {
            return false;
        }
        k7a k7aVar = (k7a) obj;
        return fni.a(this.a, k7aVar.a) && this.b.equals(k7aVar.b) && this.c.equals(k7aVar.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.c.hashCode() + u45.g(this.b, (charSequence == null ? 0 : charSequence.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "MediaMetadata(artist=" + ((Object) this.a) + ", track=" + ((Object) this.b) + ", extras=" + this.c + ")";
    }
}
