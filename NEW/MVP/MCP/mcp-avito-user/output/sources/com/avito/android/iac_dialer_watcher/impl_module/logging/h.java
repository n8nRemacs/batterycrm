package com.avito.android.iac_dialer_watcher.impl_module.logging;

import com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: IacLogObsolescence.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "session", "", "apply", "(Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;)Ljava/lang/Long;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final h<T, R> f167880b = new h<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return Long.valueOf(((w) obj).f167937b - TimeUnit.DAYS.toMillis(4L));
    }
}
