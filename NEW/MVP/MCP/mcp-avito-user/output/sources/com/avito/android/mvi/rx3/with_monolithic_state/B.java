package com.avito.android.mvi.rx3.with_monolithic_state;

import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Reducible.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "S", "oldState", "Lio/reactivex/rxjava3/core/I;", "invoke", "(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class B extends N implements Y41.l<Object, I<Object>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C32891b<Object> f207116l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C32891b<Object> c32891b) {
        super(1);
        this.f207116l = c32891b;
    }

    @Override // Y41.l
    public final I<Object> invoke(Object obj) {
        C32891b<Object> c32891b = this.f207116l;
        return c32891b.f207129b.invoke(obj).r(new androidx.room.rxjava3.b(obj, 15)).u(new com.avito.android.iac_dialer_watcher.impl_module.logging.repository.d(7, c32891b, obj));
    }
}
