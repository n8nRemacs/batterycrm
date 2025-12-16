package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: IacLogCleaner.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a.\u0012*\b\u0001\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "allSessionIdsFromCalls", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/l0;", "", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30898e<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C30908o f167998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w> f167999c;

    public C30898e(C30908o c30908o, List<com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w> list) {
        this.f167998b = c30908o;
        this.f167999c = list;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e eVar = this.f167998b.f168019a;
        return eVar.k(eVar.f167909a.j(), C42784z0.f406748b).r(new C30897d(this.f167999c, (List) obj));
    }
}
