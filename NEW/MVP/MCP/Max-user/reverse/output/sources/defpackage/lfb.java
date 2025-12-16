package defpackage;

/* loaded from: classes2.dex */
public final class lfb implements ofb {
    public final ufb a;
    public final ufb b;
    public final ufb c;

    public lfb(ufb ufbVar, ufb ufbVar2, rfb rfbVar) {
        this.a = ufbVar;
        this.b = ufbVar2;
        this.c = rfbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfb)) {
            return false;
        }
        lfb lfbVar = (lfb) obj;
        return fni.a(this.a, lfbVar.a) && fni.a(this.b, lfbVar.b) && fni.a(this.c, lfbVar.c);
    }

    public final int hashCode() {
        ufb ufbVar = this.a;
        int iHashCode = (ufbVar == null ? 0 : ufbVar.hashCode()) * 31;
        ufb ufbVar2 = this.b;
        int iHashCode2 = (iHashCode + (ufbVar2 == null ? 0 : ufbVar2.hashCode())) * 31;
        ufb ufbVar3 = this.c;
        return iHashCode2 + (ufbVar3 != null ? ufbVar3.hashCode() : 0);
    }

    public final String toString() {
        return "IconButtons(secondaryButton=" + this.a + ", primaryButton=" + this.b + ", thirdButton=" + this.c + ")";
    }
}
