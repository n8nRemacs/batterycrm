package ru.ok.tracer.disk.usage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import defpackage.afg;
import defpackage.bwf;
import defpackage.g30;
import defpackage.qn;
import defpackage.tl7;
import defpackage.v17;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ru.ok.tracer.TracerInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/disk/usage/DiskUsageInitializer;", "Ltl7;", "Lv17;", "<init>", "()V", "tracer-disk-usage_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DiskUsageInitializer implements tl7 {
    @Override // defpackage.tl7
    public final List a() {
        return Collections.singletonList(TracerInitializer.class);
    }

    @Override // defpackage.tl7
    public final Object b(Context context) {
        bwf bwfVar = afg.a;
        new Handler(Looper.getMainLooper()).post(new g30(new qn(context, 2), 6));
        return v17.u0;
    }
}
