package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import kotlin.Metadata;

/* compiled from: IacLogSender.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/O;", "", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/a;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class K<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f167961b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w f167962c;

    public K(T t12, com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar) {
        this.f167961b = t12;
        this.f167962c = wVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f167961b.f167978f.b().r(new I(this.f167962c));
    }
}
