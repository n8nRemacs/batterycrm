package com.avito.android.iac_dialer_watcher.impl_module.logging.repository;

import kotlin.Metadata;

/* compiled from: IacLogRepository.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "deletedLines", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/Q;", "apply", "(I)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class j<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f167920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f167921c;

    public j(e eVar, long j12) {
        this.f167920b = eVar;
        this.f167921c = j12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        e eVar = this.f167920b;
        return eVar.k(eVar.f167909a.b(this.f167921c), 0).r(new i(iIntValue));
    }
}
