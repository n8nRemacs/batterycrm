package com.avito.android.iac_dialer_watcher.impl_module.logging.repository;

import kotlin.Metadata;

/* compiled from: IacLogRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "deleted", "apply", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f167922b;

    public k(e eVar) {
        this.f167922b = eVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        this.f167922b.f167912d.addAndGet(-iIntValue);
        return Integer.valueOf(iIntValue);
    }
}
