package defpackage;

/* loaded from: classes2.dex */
public final class l2h {
    public final String a;
    public final p2h b;

    public l2h(xpb xpbVar) {
        this.a = (String) xpbVar.b;
        this.b = (p2h) xpbVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l2h.class == obj.getClass()) {
            l2h l2hVar = (l2h) obj;
            p2h p2hVar = l2hVar.b;
            String str = l2hVar.a;
            String str2 = this.a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            p2h p2hVar2 = this.b;
            if (p2hVar2 != null) {
                return p2hVar2.equals(p2hVar);
            }
            if (p2hVar == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        p2h p2hVar = this.b;
        return iHashCode + (p2hVar != null ? p2hVar.hashCode() : 0);
    }

    public final String toString() {
        return "VideoConversionData{sourceUri='" + this.a + "', convertOptions=" + this.b + '}';
    }
}
