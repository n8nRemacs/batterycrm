package defpackage;

/* loaded from: classes2.dex */
public final class ttg {
    public final bug a;
    public final String b;
    public final String c;
    public final String d;
    public final float e;
    public final long f;
    public final vvg g;
    public final tvg h;
    public final long i;

    public ttg(stg stgVar) {
        this.a = stgVar.a;
        this.b = stgVar.b;
        this.c = stgVar.c;
        this.d = stgVar.d;
        this.e = stgVar.e;
        this.f = stgVar.f;
        this.g = stgVar.g;
        this.h = stgVar.h;
        this.i = stgVar.i;
    }

    public final boolean a() {
        return this.g == vvg.UPLOADED && this.h != null;
    }

    public final stg b() {
        stg stgVar = new stg();
        vvg vvgVar = vvg.UNKNOWN;
        stgVar.a = this.a;
        stgVar.b = this.b;
        stgVar.c = this.c;
        stgVar.d = this.d;
        stgVar.h = this.h;
        stgVar.g = this.g;
        stgVar.f = this.f;
        stgVar.e = this.e;
        stgVar.i = this.i;
        return stgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ttg.class == obj.getClass()) {
            ttg ttgVar = (ttg) obj;
            tvg tvgVar = ttgVar.h;
            String str = ttgVar.d;
            String str2 = ttgVar.c;
            String str3 = ttgVar.b;
            bug bugVar = ttgVar.a;
            if (Float.compare(ttgVar.e, this.e) != 0 || this.f != ttgVar.f || this.i != ttgVar.i) {
                return false;
            }
            bug bugVar2 = this.a;
            if (bugVar2 == null ? bugVar != null : !bugVar2.equals(bugVar)) {
                return false;
            }
            String str4 = this.b;
            if (str4 == null ? str3 != null : !str4.equals(str3)) {
                return false;
            }
            String str5 = this.c;
            if (str5 == null ? str2 != null : !str5.equals(str2)) {
                return false;
            }
            String str6 = this.d;
            if (str6 == null ? str != null : !str6.equals(str)) {
                return false;
            }
            if (this.g != ttgVar.g) {
                return false;
            }
            tvg tvgVar2 = this.h;
            if (tvgVar2 != null) {
                return tvgVar2.equals(tvgVar);
            }
            if (tvgVar == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        bug bugVar = this.a;
        int iHashCode = (bugVar != null ? bugVar.hashCode() : 0) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode4 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        long j = this.f;
        int i = (iFloatToIntBits + ((int) (j ^ (j >>> 32)))) * 31;
        vvg vvgVar = this.g;
        int iHashCode5 = (i + (vvgVar != null ? vvgVar.hashCode() : 0)) * 31;
        tvg tvgVar = this.h;
        int iHashCode6 = tvgVar != null ? tvgVar.hashCode() : 0;
        long j2 = this.i;
        return ((iHashCode5 + iHashCode6) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Upload{uploadData=");
        sb.append(this.a);
        sb.append(", preparedPath='");
        sb.append(wqi.a() ? this.b : "*****");
        sb.append("', fileName='");
        sb.append(wqi.a() ? this.c : "*****");
        sb.append("', uploadUrl='");
        sb.append(wqi.a() ? this.d : "*****");
        sb.append("', uploadProgress=");
        sb.append(this.e);
        sb.append(", totalBytes=");
        sb.append(this.f);
        sb.append(", uploadStatus=");
        sb.append(this.g);
        sb.append(", uploadResult=");
        sb.append(this.h);
        sb.append(", createdTime=");
        return utb.l(sb, this.i, '}');
    }
}
