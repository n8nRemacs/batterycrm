package com.yandex.mobile.ads.impl;

import androidx.media3.exoplayer.C23179x;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class tn {

    /* renamed from: a, reason: collision with root package name */
    public int f390229a;

    /* renamed from: b, reason: collision with root package name */
    public int f390230b;

    /* renamed from: c, reason: collision with root package name */
    public int f390231c;

    /* renamed from: d, reason: collision with root package name */
    public int f390232d;

    /* renamed from: e, reason: collision with root package name */
    public int f390233e;

    /* renamed from: f, reason: collision with root package name */
    public int f390234f;

    /* renamed from: g, reason: collision with root package name */
    public int f390235g;

    /* renamed from: h, reason: collision with root package name */
    public int f390236h;

    /* renamed from: i, reason: collision with root package name */
    public int f390237i;

    /* renamed from: j, reason: collision with root package name */
    public int f390238j;

    /* renamed from: k, reason: collision with root package name */
    public long f390239k;

    /* renamed from: l, reason: collision with root package name */
    public int f390240l;

    public final String toString() {
        int i12 = this.f390229a;
        int i13 = this.f390230b;
        int i14 = this.f390231c;
        int i15 = this.f390232d;
        int i16 = this.f390233e;
        int i17 = this.f390234f;
        int i18 = this.f390235g;
        int i19 = this.f390236h;
        int i22 = this.f390237i;
        int i23 = this.f390238j;
        long j12 = this.f390239k;
        int i24 = this.f390240l;
        int i25 = pc1.f388768a;
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
