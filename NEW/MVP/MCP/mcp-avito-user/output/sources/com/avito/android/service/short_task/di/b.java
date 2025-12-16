package com.avito.android.service.short_task.di;

import Y61.k;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.service.short_task.ShortTaskWorker;
import h31.d;
import kotlin.Metadata;

/* compiled from: JobSchedulerComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service/short_task/di/b;", "Lcom/avito/android/di/h;", "a", "_common_job-scheduler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes3.dex */
public interface b extends InterfaceC29971h {

    /* compiled from: JobSchedulerComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/di/b$a;", "", "_common_job-scheduler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k c cVar);
    }

    void Mj(@k ShortTaskWorker shortTaskWorker);
}
