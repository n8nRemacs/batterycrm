package androidx.media3.exoplayer;

import java.util.Locale;

/* compiled from: DecoderCounters.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23138g {

    /* renamed from: a, reason: collision with root package name */
    public int f49155a;

    /* renamed from: b, reason: collision with root package name */
    public int f49156b;

    /* renamed from: c, reason: collision with root package name */
    public int f49157c;

    /* renamed from: d, reason: collision with root package name */
    public int f49158d;

    /* renamed from: e, reason: collision with root package name */
    public int f49159e;

    /* renamed from: f, reason: collision with root package name */
    public int f49160f;

    /* renamed from: g, reason: collision with root package name */
    public int f49161g;

    /* renamed from: h, reason: collision with root package name */
    public int f49162h;

    /* renamed from: i, reason: collision with root package name */
    public int f49163i;

    /* renamed from: j, reason: collision with root package name */
    public int f49164j;

    /* renamed from: k, reason: collision with root package name */
    public long f49165k;

    /* renamed from: l, reason: collision with root package name */
    public int f49166l;

    public final String toString() {
        int i12 = this.f49155a;
        int i13 = this.f49156b;
        int i14 = this.f49157c;
        int i15 = this.f49158d;
        int i16 = this.f49159e;
        int i17 = this.f49160f;
        int i18 = this.f49161g;
        int i19 = this.f49162h;
        int i22 = this.f49163i;
        int i23 = this.f49164j;
        long j12 = this.f49165k;
        int i24 = this.f49166l;
        int i25 = androidx.media3.common.util.M.f47887a;
        Locale locale = Locale.US;
        StringBuilder sbY = androidx.appcompat.app.r.y(i12, i13, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        C23179x.a(sbY, i14, "\n skippedInputBuffers=", i15, "\n renderedOutputBuffers=");
        C23179x.a(sbY, i16, "\n skippedOutputBuffers=", i17, "\n droppedBuffers=");
        C23179x.a(sbY, i18, "\n droppedInputBuffers=", i19, "\n maxConsecutiveDroppedBuffers=");
        C23179x.a(sbY, i22, "\n droppedToKeyframeEvents=", i23, "\n totalVideoFrameProcessingOffsetUs=");
        sbY.append(j12);
        sbY.append("\n videoFrameProcessingOffsetCount=");
        sbY.append(i24);
        sbY.append("\n}");
        return sbY.toString();
    }
}
