package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.service.short_task.j;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: IacLogSendingShortTaskScheduler.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/short_task/d;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/short_task/c;", "a", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f168035a;

    /* compiled from: IacLogSendingShortTaskScheduler.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/short_task/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "TASK_DELAY_MILLIS", "J", "TASK_NO_DELAY_MILLIS", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@k j jVar) {
        this.f168035a = jVar;
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task.c
    public final void a(@l Long l12, boolean z12) {
        long j12 = z12 ? 86400000L : 1000L;
        ShortTask.NetworkState networkState = ShortTask.NetworkState.f274024c;
        com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task.a.f168025e.getClass();
        Bundle bundle = new Bundle();
        if (l12 != null) {
            bundle.putLong("IacLogSendingShortTask.scheduledSessionId.key", l12.longValue());
        }
        this.f168035a.c(com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task.a.class, networkState, false, false, false, false, j12, true, bundle, ShortTask.BackoffPolicy.f274019b, 30000L);
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacLogSendingShortTaskScheduler", androidx.compose.ui.graphics.colorspace.e.i(j12, "IacLogSendingShortTask scheduled to start in ", " millis"), null);
    }
}
