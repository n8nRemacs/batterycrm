package defpackage;

/* loaded from: classes2.dex */
public final class hxe {
    public final k18 a;
    public final bwf b = new bwf(new nte(7));

    public hxe(k18 k18Var) {
        this.a = k18Var;
    }

    public final boolean a(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        return str.equals(((yid) this.b.getValue()).a.matcher(vmf.c0(str2).toString()).replaceFirst(""));
    }
}
