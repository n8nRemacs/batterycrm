package defpackage;

import android.media.MediaFormat;

/* loaded from: classes.dex */
public final class e90 implements me5 {
    public final String a;
    public final int b;
    public final f9g c;
    public final int d;
    public final int e;
    public final int f;

    public e90(String str, int i, f9g f9gVar, int i2, int i3, int i4) {
        this.a = str;
        this.b = i;
        this.c = f9gVar;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    @Override // defpackage.me5
    public final String a() {
        return this.a;
    }

    @Override // defpackage.me5
    public final MediaFormat b() {
        int i = this.e;
        int i2 = this.f;
        String str = this.a;
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, i, i2);
        mediaFormatCreateAudioFormat.setInteger("bitrate", this.d);
        int i3 = this.b;
        if (i3 != -1) {
            if (str.equals("audio/mp4a-latm")) {
                mediaFormatCreateAudioFormat.setInteger("aac-profile", i3);
                return mediaFormatCreateAudioFormat;
            }
            mediaFormatCreateAudioFormat.setInteger("profile", i3);
        }
        return mediaFormatCreateAudioFormat;
    }

    @Override // defpackage.me5
    public final f9g c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e90) {
            e90 e90Var = (e90) obj;
            if (this.a.equals(e90Var.a) && this.b == e90Var.b && this.c.equals(e90Var.c) && this.d == e90Var.d && this.e == e90Var.e && this.f == e90Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", bitrate=");
        sb.append(this.d);
        sb.append(", sampleRate=");
        sb.append(this.e);
        sb.append(", channelCount=");
        return ho7.j(sb, this.f, "}");
    }
}
