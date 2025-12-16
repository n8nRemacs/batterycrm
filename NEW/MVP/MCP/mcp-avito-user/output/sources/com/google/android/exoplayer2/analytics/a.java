package com.google.android.exoplayer2.analytics;

import android.os.Looper;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.source.A;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.InterfaceC36574d;
import j.P;
import java.util.List;

/* compiled from: AnalyticsCollector.java */
/* loaded from: classes6.dex */
public interface a extends d0.g, A, InterfaceC36574d.a, com.google.android.exoplayer2.drm.e {
    void E2(long j12, long j13, String str);

    void F2(int i12, long j12, long j13);

    void I2(String str);

    void Ih(d0 d0Var, Looper looper);

    void L2(String str);

    void M7(I i12, @P com.google.android.exoplayer2.decoder.h hVar);

    void R2(int i12, long j12);

    void Vw(b bVar);

    void XL(b bVar);

    void Yc(I i12, @P com.google.android.exoplayer2.decoder.h hVar);

    void Yd(com.google.android.exoplayer2.decoder.f fVar);

    void a2(long j12, Object obj);

    void b1(Exception exc);

    void cD(List<y.b> list, @P y.b bVar);

    void d2(long j12, long j13, String str);

    void f3(long j12);

    void g2(int i12, long j12);

    void g3(Exception exc);

    void g9(com.google.android.exoplayer2.decoder.f fVar);

    void l2(Exception exc);

    void md(com.google.android.exoplayer2.decoder.f fVar);

    void release();

    void u8(com.google.android.exoplayer2.decoder.f fVar);

    void yc();
}
