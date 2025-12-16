package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import java.util.List;
import kotlin.Metadata;

/* compiled from: IacLogSessionHistoryUpdater.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/a;", "<name for destructuring parameter 0>", "", "test", "(Lkotlin/Q;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class Z<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w f167987b;

    public Z(com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar) {
        this.f167987b = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.r
    public final boolean test(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar = (com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w) q12.f406619b;
        return (wVar.f167936a == this.f167987b.f167936a || ((List) q12.f406620c).isEmpty() || wVar.f167938c.length() != 0) ? false : true;
    }
}
