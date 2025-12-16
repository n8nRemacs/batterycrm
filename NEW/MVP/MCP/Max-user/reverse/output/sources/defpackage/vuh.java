package defpackage;

/* loaded from: classes2.dex */
public final class vuh implements avh {
    public final String a;
    public final hxh b;

    public vuh(String str, hxh hxhVar) {
        this.a = str;
        this.b = hxhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuh)) {
            return false;
        }
        vuh vuhVar = (vuh) obj;
        return fni.a(this.a, vuhVar.a) && fni.a(this.b, vuhVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        hxh hxhVar = this.b;
        return iHashCode + (hxhVar != null ? hxhVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShowShareDialog(text=" + this.a + ", fileInfo=" + this.b + ")";
    }
}
