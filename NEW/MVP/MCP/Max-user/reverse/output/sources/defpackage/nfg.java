package defpackage;

/* loaded from: classes.dex */
public final class nfg {
    public static final nfg d = new nfg(new lfg[0]);
    public static final String e;
    public final int a;
    public final zjd b;
    public int c;

    static {
        String str = zxg.a;
        e = Integer.toString(0, 36);
    }

    public nfg(lfg... lfgVarArr) {
        zjd zjdVarK = wg7.k(lfgVarArr);
        this.b = zjdVarK;
        this.a = lfgVarArr.length;
        int i = 0;
        while (i < zjdVarK.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < zjdVarK.d; i3++) {
                if (((lfg) zjdVarK.get(i)).equals(zjdVarK.get(i3))) {
                    a8i.h("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final lfg a(int i) {
        return (lfg) this.b.get(i);
    }

    public final int b(lfg lfgVar) {
        int iIndexOf = this.b.indexOf(lfgVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nfg.class != obj.getClass()) {
            return false;
        }
        nfg nfgVar = (nfg) obj;
        return this.a == nfgVar.a && this.b.equals(nfgVar.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    public final String toString() {
        return this.b.toString();
    }
}
