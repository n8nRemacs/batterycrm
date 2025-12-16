package defpackage;

/* loaded from: classes.dex */
public final class j3h {
    public static final j3h l = new j3h(-1, 1, -1, -1, 1.0f, -1, -1, -1, -1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final int f;
    public final int g;
    public final long h;
    public final int i;
    public final int j;
    public final int k;

    public j3h(int i, int i2, int i3, int i4, float f, int i5, int i6, long j, int i7, int i8, int i9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
        this.f = i5;
        this.g = i6;
        this.h = j;
        this.i = i7;
        this.j = i8;
        this.k = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3h)) {
            return false;
        }
        j3h j3hVar = (j3h) obj;
        return this.a == j3hVar.a && this.b == j3hVar.b && this.c == j3hVar.c && this.d == j3hVar.d && this.e == j3hVar.e && this.f == j3hVar.f && this.g == j3hVar.g && this.h == j3hVar.h && this.i == j3hVar.i && this.j == j3hVar.j && this.k == j3hVar.k;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((Float.floatToIntBits(this.e) + ((((((((217 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31) + this.f) * 31) + this.g) * 31;
        long j = this.h;
        return ((((((iFloatToIntBits + ((int) (j ^ (j >>> 32)))) * 31) + this.i) * 31) + this.j) * 31) + this.k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderSettings{bitrate=");
        sb.append(this.a);
        sb.append(", bitrateMode=");
        sb.append(this.b);
        sb.append(", profile=");
        sb.append(this.c);
        sb.append(", level=");
        sb.append(this.d);
        sb.append(", iFrameIntervalSeconds=");
        sb.append(this.e);
        sb.append(", operatingRate=");
        sb.append(this.f);
        sb.append(", priority=");
        sb.append(this.g);
        sb.append(", repeatPreviousFrameIntervalUs=");
        sb.append(this.h);
        sb.append(", maxBFrames=");
        sb.append(this.i);
        sb.append(", numNonBidirectionalTemporalLayers=");
        sb.append(this.j);
        sb.append(", numBidirectionalTemporalLayers=");
        return xc0.h(sb, this.k, '}');
    }
}
