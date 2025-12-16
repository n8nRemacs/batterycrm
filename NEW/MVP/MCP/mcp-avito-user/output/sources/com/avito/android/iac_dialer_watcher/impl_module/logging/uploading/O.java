package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import kotlin.Metadata;

/* compiled from: IacLogSender.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/a;", "call", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/a;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class O<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f167967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w f167968c;

    public O(T t12, com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar) {
        this.f167967b = t12;
        this.f167968c = wVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        com.avito.android.iac_dialer_watcher.impl_module.logging.repository.a aVar = (com.avito.android.iac_dialer_watcher.impl_module.logging.repository.a) obj;
        T t12 = this.f167967b;
        return t12.f167976d.a(this.f167968c, aVar).n(new M(t12, aVar)).k(new N(aVar));
    }
}
