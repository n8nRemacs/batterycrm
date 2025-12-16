package defpackage;

/* loaded from: classes2.dex */
public final class h5b {
    public static final h5b d = new h5b("OneMeGlobalThemeColorSpace", zeb.G1, zeb.x1);
    public static final h5b e = new h5b("OneMeGlobalThemeColorNature", zeb.E0, zeb.v0);
    public static final h5b f = new h5b("OneMeGlobalThemeColorNeon", zeb.W0, zeb.N0);
    public static final h5b g = new h5b("OneMeGlobalThemeColorSimple", zeb.o1, zeb.f1);
    public static final h5b h = new h5b("OneMeGlobalThemeColorMoscow", zeb.C, zeb.t);
    public static final h5b i = new h5b("OneMeGlobalThemeColorLebedev", zeb.k, zeb.b);
    public static final h5b j = new h5b("OneMeGlobalThemeColorNYGreen", zeb.U, zeb.L);
    public static final h5b k = new h5b("OneMeGlobalThemeColorNYOrange", zeb.m0, zeb.d0);
    public final String a;
    public final yeb b;
    public final yeb c;

    public h5b(String str, yeb yebVar, yeb yebVar2) {
        this.a = str;
        this.b = yebVar;
        this.c = yebVar2;
    }

    public final yeb a(boolean z) {
        return z ? this.c : this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5b)) {
            return false;
        }
        h5b h5bVar = (h5b) obj;
        return fni.a(this.a, h5bVar.a) && fni.a(this.b, h5bVar.b) && fni.a(this.c, h5bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OneMeGlobalTheme(name=" + this.a + ", lightMode=" + this.b + ", darkMode=" + this.c + ")";
    }
}
