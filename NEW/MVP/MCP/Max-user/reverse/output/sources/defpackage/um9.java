package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class um9 {
    public final cl9 a;
    public final String b;
    public final long c;
    public final wvg d;
    public final p2h e;
    public final String f;

    public um9(wo8 wo8Var) {
        this.a = (cl9) wo8Var.c;
        this.b = (String) wo8Var.b;
        this.c = wo8Var.a;
        this.d = (wvg) wo8Var.d;
        this.e = (p2h) wo8Var.o;
        this.f = (String) wo8Var.X;
    }

    public final wo8 a() {
        wo8 wo8Var = new wo8();
        wo8Var.c = this.a;
        wo8Var.b = this.b;
        wo8Var.X = this.f;
        wo8Var.a = this.c;
        wo8Var.d = this.d;
        wo8Var.o = this.e;
        return wo8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && um9.class == obj.getClass()) {
            um9 um9Var = (um9) obj;
            p2h p2hVar = um9Var.e;
            String str = um9Var.b;
            cl9 cl9Var = um9Var.a;
            if (this.c != um9Var.c) {
                return false;
            }
            cl9 cl9Var2 = this.a;
            if (cl9Var2 == null ? cl9Var != null : !cl9Var2.equals(cl9Var)) {
                return false;
            }
            String str2 = this.b;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            if (this.d != um9Var.d || !Objects.equals(this.f, um9Var.f)) {
                return false;
            }
            p2h p2hVar2 = this.e;
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
        cl9 cl9Var = this.a;
        int iHashCode = (cl9Var != null ? cl9Var.hashCode() : 0) * 31;
        String str = this.b;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        long j = this.c;
        int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        wvg wvgVar = this.d;
        int iHashCode3 = (i + (wvgVar != null ? wvgVar.hashCode() : 0)) * 31;
        p2h p2hVar = this.e;
        int iHashCode4 = (iHashCode3 + (p2hVar != null ? p2hVar.hashCode() : 0)) * 31;
        String str2 = this.f;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageUpload{messageMediaUploadKey=");
        sb.append(this.a);
        sb.append(", path='");
        sb.append(wqi.a() ? this.b : "****");
        sb.append("', attachLocalId='");
        sb.append(this.f);
        sb.append("', lastModified=");
        sb.append(this.c);
        sb.append(", uploadType=");
        sb.append(this.d);
        sb.append(", videoConvertOptions=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
