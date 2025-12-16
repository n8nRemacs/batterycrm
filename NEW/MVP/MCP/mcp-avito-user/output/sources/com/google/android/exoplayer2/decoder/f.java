package com.google.android.exoplayer2.decoder;

import androidx.appcompat.app.r;
import androidx.media3.exoplayer.C23179x;
import com.google.android.exoplayer2.util.U;
import java.util.Locale;

/* compiled from: DecoderCounters.java */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f344223a;

    /* renamed from: b, reason: collision with root package name */
    public int f344224b;

    /* renamed from: c, reason: collision with root package name */
    public int f344225c;

    /* renamed from: d, reason: collision with root package name */
    public int f344226d;

    /* renamed from: e, reason: collision with root package name */
    public int f344227e;

    /* renamed from: f, reason: collision with root package name */
    public int f344228f;

    /* renamed from: g, reason: collision with root package name */
    public int f344229g;

    /* renamed from: h, reason: collision with root package name */
    public int f344230h;

    /* renamed from: i, reason: collision with root package name */
    public int f344231i;

    /* renamed from: j, reason: collision with root package name */
    public int f344232j;

    /* renamed from: k, reason: collision with root package name */
    public long f344233k;

    /* renamed from: l, reason: collision with root package name */
    public int f344234l;

    public final String toString() {
        int i12 = this.f344223a;
        int i13 = this.f344224b;
        int i14 = this.f344225c;
        int i15 = this.f344226d;
        int i16 = this.f344227e;
        int i17 = this.f344228f;
        int i18 = this.f344229g;
        int i19 = this.f344230h;
        int i22 = this.f344231i;
        int i23 = this.f344232j;
        long j12 = this.f344233k;
        int i24 = this.f344234l;
        int i25 = U.f348106a;
        Locale locale = Locale.US;
        StringBuilder sbY = r.y(i12, i13, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
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
