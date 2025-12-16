package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
final class wg {

    /* renamed from: a, reason: collision with root package name */
    private long f391399a;

    /* renamed from: b, reason: collision with root package name */
    private long f391400b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f391401c;

    public final void a() {
        this.f391399a = 0L;
        this.f391400b = 0L;
        this.f391401c = false;
    }

    public final long a(vw vwVar, vn vnVar) {
        if (this.f391400b == 0) {
            this.f391399a = vnVar.f390953e;
        }
        if (this.f391401c) {
            return vnVar.f390953e;
        }
        ByteBuffer byteBuffer = vnVar.f390951c;
        byteBuffer.getClass();
        int i12 = 0;
        for (int i13 = 0; i13 < 4; i13++) {
            i12 = (i12 << 8) | (byteBuffer.get(i13) & 255);
        }
        int iC2 = oh0.c(i12);
        if (iC2 == -1) {
            this.f391401c = true;
            this.f391400b = 0L;
            this.f391399a = vnVar.f390953e;
            ka0.d("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return vnVar.f390953e;
        }
        long jMax = Math.max(0L, ((this.f391400b - 529) * 1000000) / vwVar.f391195z) + this.f391399a;
        this.f391400b += iC2;
        return jMax;
    }

    public final long a(vw vwVar) {
        return Math.max(0L, ((this.f391400b - 529) * 1000000) / vwVar.f391195z) + this.f391399a;
    }
}
