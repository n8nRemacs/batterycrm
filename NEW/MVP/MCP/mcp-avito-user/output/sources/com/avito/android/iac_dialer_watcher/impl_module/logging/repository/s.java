package com.avito.android.iac_dialer_watcher.impl_module.logging.repository;

import com.avito.android.iac_dialer_watcher.impl_module.db.C;
import kotlin.Metadata;

/* compiled from: IacLogRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "id", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "apply", "(J)Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class s<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f167931b;

    public s(C c12) {
        this.f167931b = c12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        C c12 = this.f167931b;
        return new w(jLongValue, c12.f167803b, c12.f167804c);
    }
}
