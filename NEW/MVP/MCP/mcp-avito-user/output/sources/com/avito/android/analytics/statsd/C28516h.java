package com.avito.android.analytics.statsd;

import com.avito.android.analytics.inhouse_transport.A;
import com.avito.android.service.short_task.ShortTask;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SendStatsdEventsTaskDelegateImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/analytics/inhouse_transport/A;", "it", "Lcom/avito/android/service/short_task/ShortTask$Status;", "apply", "(Lcom/avito/android/analytics/inhouse_transport/A;)Lcom/avito/android/service/short_task/ShortTask$Status;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.analytics.statsd.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28516h<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28517i f91054b;

    public C28516h(C28517i c28517i) {
        this.f91054b = c28517i;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        com.avito.android.analytics.inhouse_transport.A a12 = (com.avito.android.analytics.inhouse_transport.A) obj;
        this.f91054b.getClass();
        if (a12 instanceof A.b) {
            return ShortTask.Status.f274030b;
        }
        if (a12 instanceof A.c) {
            return ShortTask.Status.f274031c;
        }
        if (a12 instanceof A.a) {
            return ShortTask.Status.f274032d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
