package com.avito.android.app.task;

import com.avito.android.app.task.ScheduleMetricSendingTask;
import com.avito.android.service.short_task.ShortTask;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: ScheduleMetricSendingTask.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "startTimeElapsedMs", "Lkotlin/G0;", "accept", "(Ljava/lang/Long;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class E1<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleMetricSendingTask.b f91394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f91395c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ScheduleMetricSendingTask f91396d;

    public E1(ScheduleMetricSendingTask.b bVar, long j12, ScheduleMetricSendingTask scheduleMetricSendingTask) {
        this.f91394b = bVar;
        this.f91395c = j12;
        this.f91396d = scheduleMetricSendingTask;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ScheduleMetricSendingTask.b bVar = this.f91394b;
        this.f91396d.taskScheduler.c(com.avito.android.service.short_task.metrics.t.class, ShortTask.NetworkState.f274023b, false, false, false, false, 1000L, true, com.avito.android.actions_sheet.a.m("TIME_TO_INTERACT", bVar.f91519b.a(this.f91395c - ((Long) obj).longValue(), TimeUnit.MILLISECONDS)), ShortTask.BackoffPolicy.f274019b, 30000L);
    }
}
