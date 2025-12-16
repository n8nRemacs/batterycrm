package defpackage;

import androidx.work.WorkRequest;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class mrb extends WorkRequest.Builder {
    public mrb(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        r5i workSpec = getWorkSpec();
        long millis = timeUnit.toMillis(j);
        workSpec.getClass();
        String str = r5i.u;
        if (millis < 900000) {
            cei.g().o(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long j2 = millis < 900000 ? 900000L : millis;
        long j3 = millis < 900000 ? 900000L : millis;
        if (j2 < 900000) {
            cei.g().o(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        workSpec.h = j2 >= 900000 ? j2 : 900000L;
        if (j3 < 300000) {
            cei.g().o(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j3 > workSpec.h) {
            cei.g().o(str, "Flex duration greater than interval duration; Changed to " + j2);
        }
        workSpec.i = n7j.e(j3, 300000L, workSpec.h);
    }

    @Override // androidx.work.WorkRequest.Builder
    public final WorkRequest buildInternal$work_runtime_release() {
        if (getBackoffCriteriaSet() && getWorkSpec().j.c) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        if (getWorkSpec().q) {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        return new nrb(getId(), getWorkSpec(), getTags$work_runtime_release());
    }

    @Override // androidx.work.WorkRequest.Builder
    public final WorkRequest.Builder getThisObject$work_runtime_release() {
        return this;
    }
}
