package defpackage;

/* loaded from: classes2.dex */
public final class u30 implements xy8 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;

    public u30(String str, String str2, String str3, int i, int i2, int i3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str4;
        this.h = str5;
    }

    @Override // defpackage.xy8
    public final String a() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("AudioFormat(id: ", this.a, ", sampleMimeType: ", this.b, ", codecs: ");
        sbL.append(this.c);
        sbL.append(", bitrate: ");
        sbL.append(this.d);
        sbL.append(", sampleRate: ");
        hf3.g(sbL, this.e, ", channelCount: ", this.f, ", label: ");
        sbL.append(this.g);
        sbL.append(", language: ");
        sbL.append(this.h);
        sbL.append(")");
        return sbL.toString();
    }
}
