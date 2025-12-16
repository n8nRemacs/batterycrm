package defpackage;

import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class wxf {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final Map m;
    public final Set n;

    public wxf(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, Map map, Set set) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = z;
        this.l = z2;
        this.m = map;
        this.n = set;
    }

    public static wxf a(wxf wxfVar, boolean z, Map map, int i) {
        String str = wxfVar.a;
        long j = wxfVar.b;
        String str2 = wxfVar.c;
        String str3 = wxfVar.d;
        String str4 = wxfVar.e;
        String str5 = wxfVar.f;
        String str6 = wxfVar.g;
        String str7 = wxfVar.h;
        String str8 = wxfVar.i;
        String str9 = wxfVar.j;
        boolean z2 = (i & 1024) != 0 ? wxfVar.k : z;
        boolean z3 = wxfVar.l;
        Map map2 = (i & 4096) != 0 ? wxfVar.m : map;
        Set set = wxfVar.n;
        wxfVar.getClass();
        return new wxf(str, j, str2, str3, str4, str5, str6, str7, str8, str9, z2, z3, map2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxf)) {
            return false;
        }
        wxf wxfVar = (wxf) obj;
        return fni.a(this.a, wxfVar.a) && this.b == wxfVar.b && fni.a(this.c, wxfVar.c) && fni.a(this.d, wxfVar.d) && fni.a(this.e, wxfVar.e) && fni.a(this.f, wxfVar.f) && fni.a(this.g, wxfVar.g) && fni.a(this.h, wxfVar.h) && fni.a(this.i, wxfVar.i) && fni.a(this.j, wxfVar.j) && this.k == wxfVar.k && this.l == wxfVar.l && fni.a(this.m, wxfVar.m) && fni.a(this.n, wxfVar.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iE = u45.e(a9h.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iE2 = u45.e(u45.e(u45.e(u45.e(u45.e((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        boolean z = this.k;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iE2 + i) * 31;
        boolean z2 = this.l;
        return this.n.hashCode() + ((this.m.hashCode() + ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "SystemState(versionName=" + this.a + ", versionCode=" + this.b + ", packageName=" + this.c + ", environment=" + this.d + ", buildUuid=" + this.e + ", sessionUuid=" + this.f + ", device=" + this.g + ", deviceId=" + this.h + ", vendor=" + this.i + ", osVersion=" + this.j + ", isInBackground=" + this.k + ", isRooted=" + this.l + ", properties=" + this.m + ", hostedLibrariesInfo=" + this.n + ')';
    }
}
