package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class cne {
    public final int a;
    public final String b;
    public final String c;
    public final bne d;
    public final ArrayList e;

    public cne(int i, String str, String str2, bne bneVar, ArrayList arrayList) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = bneVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cne)) {
            return false;
        }
        cne cneVar = (cne) obj;
        return this.a == cneVar.a && fni.a(this.b, cneVar.b) && fni.a(this.c, cneVar.c) && this.d == cneVar.d && fni.a(this.e, cneVar.e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "SettingsBannerSection(id=" + this.a + ", logo=" + this.b + ", title=" + this.c + ", align=" + this.d + ", items=" + this.e + ")";
    }
}
