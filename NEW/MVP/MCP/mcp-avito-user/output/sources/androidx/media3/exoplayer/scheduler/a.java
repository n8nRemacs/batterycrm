package androidx.media3.exoplayer.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.X;

/* compiled from: PlatformScheduler.java */
@J
@X
/* loaded from: classes.dex */
public final class a implements c {

    /* compiled from: PlatformScheduler.java */
    /* renamed from: androidx.media3.exoplayer.scheduler.a$a, reason: collision with other inner class name */
    public static final class JobServiceC1831a extends JobService {
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        @Override // android.app.job.JobService
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onStartJob(android.app.job.JobParameters r12) {
            /*
                Method dump skipped, instructions count: 269
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.scheduler.a.JobServiceC1831a.onStartJob(android.app.job.JobParameters):boolean");
        }

        @Override // android.app.job.JobService
        public final boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    static {
        int i12 = M.f47887a;
    }

    @Override // androidx.media3.exoplayer.scheduler.c
    public final boolean cancel() {
        throw null;
    }
}
