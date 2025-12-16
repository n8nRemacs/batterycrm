package defpackage;

/* loaded from: classes2.dex */
public final class edh {
    public final String a;
    public final long b;
    public final String c;

    public edh(long j, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    public final String toString() {
        return vb9.f(xrf.q("VideoUploadInfo{url='", this.b, this.a, "', videoId="), ", token='", !l8g.c(this.c), "'}");
    }
}
