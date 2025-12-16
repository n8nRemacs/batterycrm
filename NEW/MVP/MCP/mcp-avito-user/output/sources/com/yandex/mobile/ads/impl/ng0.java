package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.metrica.IReporter;
import com.yandex.mobile.ads.impl.mg0;

/* loaded from: classes8.dex */
public final class ng0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private static volatile mg0 f388274a;

    private static mg0 a(Context context) {
        py0 py0Var = new py0(new e31(), q21.b());
        IReporter iReporterA = new qa(py0Var).a(context);
        new w11(iReporterA, py0Var).a();
        return new mg0(iReporterA);
    }

    @X41.n
    @Y61.k
    public static final ny0 b(@Y61.k Context context) {
        if (f388274a == null) {
            synchronized (mg0.a.a()) {
                try {
                    if (f388274a == null) {
                        f388274a = a(context.getApplicationContext());
                    }
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        mg0 mg0Var = f388274a;
        if (mg0Var != null) {
            return mg0Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
