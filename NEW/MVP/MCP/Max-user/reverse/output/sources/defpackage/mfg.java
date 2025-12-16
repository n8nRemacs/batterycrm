package defpackage;

/* loaded from: classes.dex */
public final class mfg implements lw0 {
    public static final mfg d = new mfg(new kfg[0]);
    public final int a;
    public final zjd b;
    public int c;

    public mfg(kfg... kfgVarArr) {
        zjd zjdVarK = wg7.k(kfgVarArr);
        this.b = zjdVarK;
        this.a = kfgVarArr.length;
        int i = 0;
        while (i < zjdVarK.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < zjdVarK.d; i3++) {
                if (((kfg) zjdVarK.get(i)).equals(zjdVarK.get(i3))) {
                    pai.c("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final kfg a(int i) {
        return (kfg) this.b.get(i);
    }

    public final int b(kfg kfgVar) {
        int iIndexOf = this.b.indexOf(kfgVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mfg.class != obj.getClass()) {
            return false;
        }
        mfg mfgVar = (mfg) obj;
        return this.a == mfgVar.a && this.b.equals(mfgVar.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }
}
