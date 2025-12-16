package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: IacLogSessionHistoryUpdater.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/a;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f167991b;

    public b0(Y y12) {
        this.f167991b = y12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar = (com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w) q12.f406619b;
        List list = (List) q12.f406620c;
        StringBuilder sb2 = new StringBuilder("        In this log session ");
        sb2.append("IacLogSession(id=" + wVar.f167936a + ", createdAt=" + Y.f167985b.format(new Date(wVar.f167937b)) + ')');
        sb2.append(" there were ");
        sb2.append(list.size());
        sb2.append(" calls:\n");
        String string = sb2.toString();
        List list2 = list;
        Y y12 = this.f167991b;
        String strO = C42745f0.O(list2, "\n", string, null, new a0(y12), 28);
        com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e eVar = y12.f167986a;
        return eVar.j(eVar.f167909a.k(wVar.f167936a, strO));
    }
}
