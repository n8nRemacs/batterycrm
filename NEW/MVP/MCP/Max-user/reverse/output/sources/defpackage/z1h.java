package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class z1h extends l0g {
    public final String c;
    public final String d;
    public final List o;

    public z1h(String str, String str2, List list) {
        this.c = str;
        this.d = str2;
        this.o = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1h)) {
            return false;
        }
        z1h z1hVar = (z1h) obj;
        return fni.a(this.c, z1hVar.c) && fni.a(this.d, z1hVar.d) && fni.a(this.o, z1hVar.o);
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.o;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return az1.j(wy1.l("Response(conversationId=", this.c, ", internalCallerParams=", this.d, ", error="), this.o, ")");
    }
}
