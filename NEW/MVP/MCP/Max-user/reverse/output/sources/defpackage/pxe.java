package defpackage;

/* loaded from: classes2.dex */
public final class pxe extends cda {
    public final long b;
    public final long c;
    public final String d;
    public final long e;
    public final String f;
    public final long g;
    public final String h;

    public pxe(long j, long j2, String str, long j3, String str2, String str3, long j4) {
        super(qqg.a);
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = j3;
        this.f = str2;
        this.g = j4;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxe)) {
            return false;
        }
        pxe pxeVar = (pxe) obj;
        return this.b == pxeVar.b && this.c == pxeVar.c && fni.a(this.d, pxeVar.d) && this.e == pxeVar.e && fni.a(this.f, pxeVar.f) && this.g == pxeVar.g && fni.a(this.h, pxeVar.h);
    }

    public final int hashCode() {
        int iA = a9h.a(Long.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        return this.h.hashCode() + a9h.a(u45.e(a9h.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.b, "ShowFileDownloadWarningBottomSheet(chatId=", ", messageId=");
        hf3.e(this.c, ", attachLocalId=", this.d, sbL);
        az1.r(this.e, ", fileId=", ", fileName=", sbL);
        sbL.append(this.f);
        sbL.append(", fileSize=");
        sbL.append(this.g);
        return ctd.j(sbL, ", fileUrl=", this.h, ")");
    }
}
