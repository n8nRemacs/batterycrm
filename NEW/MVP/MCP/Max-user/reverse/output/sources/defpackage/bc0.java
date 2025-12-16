package defpackage;

import android.media.MediaFormat;
import android.util.Size;

/* loaded from: classes.dex */
public final class bc0 implements me5 {
    public final String a;
    public final int b;
    public final f9g c;
    public final Size d;
    public final int e;
    public final cc0 f;
    public final int g;
    public final int h;
    public final int i;

    public bc0(String str, int i, f9g f9gVar, Size size, int i2, cc0 cc0Var, int i3, int i4, int i5) {
        this.a = str;
        this.b = i;
        this.c = f9gVar;
        this.d = size;
        this.e = i2;
        this.f = cc0Var;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public static j35 d() {
        j35 j35Var = new j35(1);
        j35Var.c = -1;
        j35Var.s0 = 1;
        j35Var.X = 2130708361;
        j35Var.Y = cc0.d;
        return j35Var;
    }

    @Override // defpackage.me5
    public final String a() {
        return this.a;
    }

    @Override // defpackage.me5
    public final MediaFormat b() {
        Size size = this.d;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.a, size.getWidth(), size.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", this.e);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.i);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.g);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.h);
        int i = this.b;
        if (i != -1) {
            mediaFormatCreateVideoFormat.setInteger("profile", i);
        }
        cc0 cc0Var = this.f;
        int i2 = cc0Var.a;
        if (i2 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", i2);
        }
        int i3 = cc0Var.b;
        if (i3 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", i3);
        }
        int i4 = cc0Var.c;
        if (i4 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", i4);
        }
        return mediaFormatCreateVideoFormat;
    }

    @Override // defpackage.me5
    public final f9g c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bc0) {
            bc0 bc0Var = (bc0) obj;
            if (this.a.equals(bc0Var.a) && this.b == bc0Var.b && this.c.equals(bc0Var.c) && this.d.equals(bc0Var.d) && this.e == bc0Var.e && this.f.equals(bc0Var.f) && this.g == bc0Var.g && this.h == bc0Var.h && this.i == bc0Var.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", resolution=");
        sb.append(this.d);
        sb.append(", colorFormat=");
        sb.append(this.e);
        sb.append(", dataSpace=");
        sb.append(this.f);
        sb.append(", frameRate=");
        sb.append(this.g);
        sb.append(", IFrameInterval=");
        sb.append(this.h);
        sb.append(", bitrate=");
        return ho7.j(sb, this.i, "}");
    }
}
