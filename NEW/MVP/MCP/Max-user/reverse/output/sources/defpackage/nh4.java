package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class nh4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public int m;

    public /* synthetic */ nh4(int i) {
        this.a = i;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                int i = this.b;
                int i2 = this.c;
                int i3 = this.d;
                int i4 = this.e;
                int i5 = this.f;
                int i6 = this.g;
                int i7 = this.h;
                int i8 = this.i;
                int i9 = this.j;
                int i10 = this.k;
                long j = this.l;
                int i11 = this.m;
                int i12 = xxg.a;
                Locale locale = Locale.US;
                StringBuilder sbK = wy1.k("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", i2, "\n queuedInputBuffers=");
                hf3.g(sbK, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
                hf3.g(sbK, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
                hf3.g(sbK, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
                hf3.g(sbK, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
                utb.n(sbK, j, "\n videoFrameProcessingOffsetCount=", i11);
                sbK.append("\n}");
                return sbK.toString();
            default:
                int i13 = this.b;
                int i14 = this.c;
                int i15 = this.d;
                int i16 = this.e;
                int i17 = this.f;
                int i18 = this.g;
                int i19 = this.h;
                int i20 = this.i;
                int i21 = this.j;
                int i22 = this.k;
                long j2 = this.l;
                int i23 = this.m;
                String str = zxg.a;
                Locale locale2 = Locale.US;
                StringBuilder sbK2 = wy1.k("DecoderCounters {\n decoderInits=", i13, ",\n decoderReleases=", i14, "\n queuedInputBuffers=");
                hf3.g(sbK2, i15, "\n skippedInputBuffers=", i16, "\n renderedOutputBuffers=");
                hf3.g(sbK2, i17, "\n skippedOutputBuffers=", i18, "\n droppedBuffers=");
                hf3.g(sbK2, i19, "\n droppedInputBuffers=", i20, "\n maxConsecutiveDroppedBuffers=");
                hf3.g(sbK2, i21, "\n droppedToKeyframeEvents=", i22, "\n totalVideoFrameProcessingOffsetUs=");
                utb.n(sbK2, j2, "\n videoFrameProcessingOffsetCount=", i23);
                sbK2.append("\n}");
                return sbK2.toString();
        }
    }
}
