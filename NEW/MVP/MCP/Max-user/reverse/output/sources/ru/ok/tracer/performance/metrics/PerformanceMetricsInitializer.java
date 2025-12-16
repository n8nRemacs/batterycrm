package ru.ok.tracer.performance.metrics;

import android.content.Context;
import defpackage.afg;
import defpackage.bj;
import defpackage.feg;
import defpackage.irb;
import defpackage.qn;
import defpackage.t6d;
import defpackage.tl7;
import defpackage.ueg;
import defpackage.xeg;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ru.ok.tracer.TracerInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/performance/metrics/PerformanceMetricsInitializer;", "Ltl7;", "Lxeg;", "<init>", "()V", "tracer-performance-metrics_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PerformanceMetricsInitializer implements tl7 {
    @Override // defpackage.tl7
    public final List a() {
        return Collections.singletonList(TracerInitializer.class);
    }

    @Override // defpackage.tl7
    public final Object b(Context context) {
        xeg xegVar = xeg.a;
        feg fegVar = feg.a;
        Object obj = feg.c().get(t6d.a);
        irb irbVar = obj instanceof irb ? (irb) obj : null;
        if (irbVar == null) {
            irbVar = new irb(new bj(12));
        }
        if (irbVar.a) {
            xeg.b = new ueg();
            afg.a(new qn(context, 6));
        }
        return xeg.a;
    }
}
