package com.avito.android.mvi.rx3.locks.legacy;

import io.reactivex.rxjava3.core.H;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LegacyRxLockImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "KeyT", "Lhu/akarnokd/rxjava3/schedulers/c;", "invoke", "()Lhu/akarnokd/rxjava3/schedulers/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements Y41.a<hu.akarnokd.rxjava3.schedulers.c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<H> f207109l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Y41.a<? extends H> aVar) {
        super(0);
        this.f207109l = aVar;
    }

    @Override // Y41.a
    public final hu.akarnokd.rxjava3.schedulers.c invoke() {
        return new hu.akarnokd.rxjava3.schedulers.c(this.f207109l.invoke());
    }
}
