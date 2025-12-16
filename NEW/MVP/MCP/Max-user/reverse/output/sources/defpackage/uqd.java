package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class uqd {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final Set e;
    public final boolean f;
    public final List g;
    public final Map h;
    public final List i;
    public final Set j;
    public final long k;
    public final n8a l;
    public final Long m;
    public final Long n;

    public uqd(String str, String str2, int i, String str3, Set set, boolean z, List list, Map map, List list2, Set set2, long j, n8a n8aVar, Long l, Long l2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = set;
        this.f = z;
        this.g = list;
        this.h = map;
        this.i = list2;
        this.j = set2;
        this.k = j;
        this.l = n8aVar;
        this.m = l;
        this.n = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!uqd.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        uqd uqdVar = (uqd) obj;
        if (this.c != uqdVar.c || this.f != uqdVar.f || this.k != uqdVar.k || !fni.a(this.m, uqdVar.m) || !fni.a(this.n, uqdVar.n) || !fni.a(this.a, uqdVar.a) || !fni.a(this.b, uqdVar.b) || !fni.a(this.d, uqdVar.d) || !fni.a(this.e, uqdVar.e) || !fni.a(this.g, uqdVar.g)) {
            return false;
        }
        LinkedHashSet linkedHashSet = da6.b;
        return ee4.b(this.h, uqdVar.h) && fni.a(this.i, uqdVar.i) && fni.a(this.j, uqdVar.j) && fni.a(this.l, uqdVar.l);
    }

    public final int hashCode() {
        int iC;
        int iA = a9h.a(a9h.b(this.c * 31, 31, this.f), 31, this.k);
        Long l = this.m;
        int iHashCode = (iA + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.n;
        int iE = u45.e(u45.e((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.a), 31, this.b);
        String str = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        List list = this.g;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Map map = this.h;
        if (map != null) {
            LinkedHashSet linkedHashSet = da6.b;
            iC = ee4.c(map);
        } else {
            iC = 0;
        }
        int i = (iHashCode3 + iC) * 31;
        List list2 = this.i;
        int iHashCode4 = (i + (list2 != null ? list2.hashCode() : 0)) * 31;
        Set set = this.j;
        int iHashCode5 = (iHashCode4 + (set != null ? set.hashCode() : 0)) * 31;
        n8a n8aVar = this.l;
        return iHashCode5 + (n8aVar != null ? n8aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("RoomChatFolder(id=", this.a, ", title=", this.b, ", order=");
        sbL.append(this.c);
        sbL.append(", emoji=");
        sbL.append(this.d);
        sbL.append(", filters=");
        sbL.append(this.e);
        sbL.append(", isHiddenForAllFolder=");
        sbL.append(this.f);
        sbL.append(", elements=");
        sbL.append(this.g);
        sbL.append(", filterSubjects=");
        sbL.append(this.h);
        sbL.append(", widgets=");
        sbL.append(this.i);
        sbL.append(", options=");
        sbL.append(this.j);
        sbL.append(", updateTime=");
        sbL.append(this.k);
        sbL.append(", favorites=");
        sbL.append(this.l);
        sbL.append(", templateId=");
        sbL.append(this.m);
        sbL.append(", sourceId=");
        sbL.append(this.n);
        sbL.append(")");
        return sbL.toString();
    }
}
