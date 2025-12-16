package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import io.reactivex.rxjava3.internal.operators.observable.C41986s0;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import java.util.Objects;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: IacLogSender.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "currentSession", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class S<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f167972b;

    public S(T t12) {
        this.f167972b = t12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar = (com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w) obj;
        T t12 = this.f167972b;
        C42026y c42026yN = t12.f167974b.b(wVar).n(new J(t12, wVar)).n(new K(t12, wVar));
        L<T, R> l12 = L.f167963b;
        Objects.requireNonNull(l12, "mapper is null");
        return new C41986s0(new io.reactivex.rxjava3.internal.operators.single.C(c42026yN, l12).w(new Q(t12))).B(G0.f406611a);
    }
}
