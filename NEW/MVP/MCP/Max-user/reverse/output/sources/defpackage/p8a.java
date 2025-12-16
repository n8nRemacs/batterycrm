package defpackage;

import java.util.EnumMap;

/* loaded from: classes2.dex */
public final class p8a {
    public h29 a;
    public h29 b;
    public h29 c;
    public h29 d;

    public p8a(h29 h29Var, h29 h29Var2, h29 h29Var3, h29 h29Var4) {
        this.a = h29Var;
        this.b = h29Var2;
        this.c = h29Var3;
        this.d = h29Var4;
    }

    public final EnumMap a() {
        EnumMap enumMap = new EnumMap(g29.class);
        enumMap.put((EnumMap) g29.a, (g29) this.a);
        enumMap.put((EnumMap) g29.b, (g29) this.b);
        enumMap.put((EnumMap) g29.c, (g29) this.c);
        enumMap.put((EnumMap) g29.d, (g29) this.d);
        return enumMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8a)) {
            return false;
        }
        p8a p8aVar = (p8a) obj;
        return this.a == p8aVar.a && this.b == p8aVar.b && this.c == p8aVar.c && this.d == p8aVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MutableMediaOptions(audioState=" + this.a + ", videoState=" + this.b + ", screenshareState=" + this.c + ", movieSharingState=" + this.d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ p8a() {
        h29 h29Var = h29.a;
        this(h29Var, h29Var, h29Var, h29Var);
    }
}
