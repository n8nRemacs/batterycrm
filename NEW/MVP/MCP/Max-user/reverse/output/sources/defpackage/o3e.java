package defpackage;

/* loaded from: classes2.dex */
public final class o3e {
    public static final o3e e = new o3e(0, false, false, null);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final n3e d;

    public o3e(int i, boolean z, boolean z2, n3e n3eVar) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = n3eVar;
    }

    public static o3e a(o3e o3eVar, int i, boolean z, boolean z2, n3e n3eVar, int i2) {
        if ((i2 & 1) != 0) {
            i = o3eVar.a;
        }
        if ((i2 & 2) != 0) {
            z = o3eVar.b;
        }
        if ((i2 & 4) != 0) {
            z2 = o3eVar.c;
        }
        if ((i2 & 8) != 0) {
            n3eVar = o3eVar.d;
        }
        o3eVar.getClass();
        return new o3e(i, z, z2, n3eVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3e)) {
            return false;
        }
        o3e o3eVar = (o3e) obj;
        return this.a == o3eVar.a && this.b == o3eVar.b && this.c == o3eVar.c && fni.a(this.d, o3eVar.d);
    }

    public final int hashCode() {
        int iB = a9h.b(a9h.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        n3e n3eVar = this.d;
        return iB + (n3eVar == null ? 0 : n3eVar.hashCode());
    }

    public final String toString() {
        return "ScrollState(unreadMessages=" + this.a + ", isUnreadButtonVisible=" + this.b + ", isMentionButtonVisible=" + this.c + ", lastReaction=" + this.d + ")";
    }
}
