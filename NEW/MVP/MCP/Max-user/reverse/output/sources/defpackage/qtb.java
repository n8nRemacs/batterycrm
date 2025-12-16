package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class qtb {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final String g;
    public final String h;
    public String i;

    public qtb(int i, String str, String str2, String str3, List list, List list2, String str4, String str5) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = list2;
        this.g = str4;
        this.h = str5;
        this.i = r5b.b(str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qtb.class == obj.getClass()) {
            qtb qtbVar = (qtb) obj;
            String str = qtbVar.h;
            String str2 = qtbVar.g;
            List list = qtbVar.f;
            List list2 = qtbVar.e;
            String str3 = qtbVar.b;
            if (this.a != qtbVar.a) {
                return false;
            }
            String str4 = this.b;
            if (str4 == null ? str3 != null : !str4.equals(str3)) {
                return false;
            }
            List list3 = this.e;
            if (list3 == null ? list2 != null : !list3.equals(list2)) {
                return false;
            }
            List list4 = this.f;
            if (list4 == null ? list != null : !list4.equals(list)) {
                return false;
            }
            String str5 = this.g;
            if (str5 == null ? str2 != null : !str5.equals(str2)) {
                return false;
            }
            String str6 = this.h;
            if (str6 != null) {
                return str6.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.e;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str2 = this.g;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.h;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Phone{contactId=");
        sb.append(this.a);
        sb.append(", name='");
        sb.append(this.b);
        sb.append("', phones=");
        sb.append(this.e);
        sb.append(", serverPhones=");
        sb.append(this.f);
        sb.append(", avatarPath='");
        sb.append(this.g);
        sb.append("', email='");
        return ho7.l(sb, this.h, "'}");
    }
}
