package com.google.android.exoplayer2.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.google.android.exoplayer2.util.U;
import j.X;

/* compiled from: PlatformScheduler.java */
@X
/* loaded from: classes6.dex */
public final class a implements c {

    /* compiled from: PlatformScheduler.java */
    /* renamed from: com.google.android.exoplayer2.scheduler.a$a, reason: collision with other inner class name */
    public static final class JobServiceC10589a extends JobService {
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        @Override // android.app.job.JobService
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onStartJob(android.app.job.JobParameters r12) {
            /*
                Method dump skipped, instructions count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.scheduler.a.JobServiceC10589a.onStartJob(android.app.job.JobParameters):boolean");
        }

        @Override // android.app.job.JobService
        public final boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    static {
        int i12 = U.f348106a;
    }

    @Override // com.google.android.exoplayer2.scheduler.c
    public final boolean cancel() {
        throw null;
    }
}
