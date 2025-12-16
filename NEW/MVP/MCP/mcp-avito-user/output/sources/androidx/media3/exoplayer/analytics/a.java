package androidx.media3.exoplayer.analytics;

import android.os.Looper;
import androidx.media3.common.C23108t;
import androidx.media3.common.H;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.C23138g;
import androidx.media3.exoplayer.C23139h;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.upstream.d;
import j.P;
import java.util.List;

/* compiled from: AnalyticsCollector.java */
@J
/* loaded from: classes.dex */
public interface a extends H.g, D, d.a, androidx.media3.exoplayer.drm.f {
    void Ac(s sVar);

    void Bc(List<A.b> list, @P A.b bVar);

    void E2(long j12, long j13, String str);

    void F2(int i12, long j12, long j13);

    void I2(String str);

    void L2(String str);

    void R2(int i12, long j12);

    void a2(long j12, Object obj);

    void b1(Exception exc);

    void d2(long j12, long j13, String str);

    void f3(long j12);

    void g2(int i12, long j12);

    void g3(Exception exc);

    void h3(C23138g c23138g);

    void i3(C23108t c23108t, @P C23139h c23139h);

    void j3(C23138g c23138g);

    void k3(C23138g c23138g);

    void l2(Exception exc);

    void l3(C23108t c23108t, @P C23139h c23139h);

    void m3(C23138g c23138g);

    void release();

    void yc();

    void zc(H h12, Looper looper);
}
