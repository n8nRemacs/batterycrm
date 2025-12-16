package ru.ok.tracer.heap.dumps;

import android.content.Context;
import defpackage.afg;
import defpackage.qn;
import defpackage.tl7;
import defpackage.u17;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ru.ok.tracer.TracerInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/heap/dumps/HeapDumpInitializer;", "Ltl7;", "Lu17;", "<init>", "()V", "tracer-heap-dumps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class HeapDumpInitializer implements tl7 {
    @Override // defpackage.tl7
    public final List a() {
        return Collections.singletonList(TracerInitializer.class);
    }

    @Override // defpackage.tl7
    public final Object b(Context context) {
        afg.a(new qn(context, 3));
        return u17.a;
    }
}
