package com.yandex.mobile.ads.impl;

import android.os.Looper;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.pd;
import java.util.List;

/* loaded from: classes8.dex */
public interface j9 extends gt0.b, kd0, pd.a, com.yandex.mobile.ads.exo.drm.f {
    void a(int i12, long j12);

    void a(int i12, long j12, long j13);

    void a(long j12);

    void a(bd0 bd0Var);

    void a(gt0 gt0Var, Looper looper);

    void a(tn tnVar);

    void a(vw vwVar, @j.P xn xnVar);

    void a(Exception exc);

    void a(Object obj, long j12);

    void a(String str);

    void a(String str, long j12, long j13);

    void a(List<jd0.b> list, @j.P jd0.b bVar);

    void b(int i12, long j12);

    void b(tn tnVar);

    void b(vw vwVar, @j.P xn xnVar);

    void b(Exception exc);

    void b(String str);

    void b(String str, long j12, long j13);

    void c(tn tnVar);

    void c(Exception exc);

    void d(tn tnVar);

    void release();
}
