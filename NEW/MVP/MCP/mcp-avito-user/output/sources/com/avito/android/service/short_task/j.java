package com.avito.android.service.short_task;

import android.os.Bundle;
import com.avito.android.service.short_task.ShortTask;
import kotlin.Metadata;

/* compiled from: ShortTaskScheduler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/j;", "", "_common_job-scheduler_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface j {

    /* compiled from: ShortTaskScheduler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void a(@Y61.k Class<? extends ShortTask> cls, @Y61.k ShortTask.NetworkState networkState, boolean z12, boolean z13, boolean z14, boolean z15, long j12, long j13, long j14, boolean z16, @Y61.l Bundle bundle, @Y61.k ShortTask.BackoffPolicy backoffPolicy, long j15);

    void b(@Y61.k Class<? extends ShortTask> cls);

    void c(@Y61.k Class<? extends ShortTask> cls, @Y61.k ShortTask.NetworkState networkState, boolean z12, boolean z13, boolean z14, boolean z15, long j12, boolean z16, @Y61.l Bundle bundle, @Y61.k ShortTask.BackoffPolicy backoffPolicy, long j13);
}
