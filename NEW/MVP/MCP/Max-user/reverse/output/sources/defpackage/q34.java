package defpackage;

/* loaded from: classes2.dex */
public final class q34 {
    public final /* synthetic */ int a = 0;
    public long b;
    public String c;
    public String d;
    public String e;

    public /* synthetic */ q34() {
    }

    public boolean a() {
        String str = this.d;
        return (str == null || str.length() == 0 || !dnf.r(str, "image/", true) || vmf.s(str, "djvu", true)) ? false : true;
    }

    public boolean b() {
        String str = this.d;
        return (str == null || str.length() == 0 || !dnf.r(str, "video/", true)) ? false : true;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                long j = this.b;
                String str = this.c;
                String str2 = this.d;
                String str3 = this.e;
                StringBuilder sbN = ho7.n("ContentUriParams{contentLength=", j, ", contentName='", str);
                ho7.r(sbN, "', mimeType='", str2, "', path='", str3);
                sbN.append("'}");
                return sbN.toString();
            default:
                return super.toString();
        }
    }

    public q34(q34 q34Var) {
        this.b = q34Var.b;
        this.c = q34Var.c;
        this.d = q34Var.d;
        this.e = q34Var.e;
    }
}
