package ru.ok.tracer.profiler.sampling;

import android.content.Context;
import defpackage.kxd;
import defpackage.tl7;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ru.ok.tracer.TracerInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/profiler/sampling/SamplingProfilerInitializer;", "Ltl7;", "Lkxd;", "<init>", "()V", "tracer-profiler-sampling_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SamplingProfilerInitializer implements tl7 {
    @Override // defpackage.tl7
    public final List a() {
        return Collections.singletonList(TracerInitializer.class);
    }

    @Override // defpackage.tl7
    public final Object b(Context context) {
        return kxd.a;
    }
}
