package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import io.reactivex.rxjava3.internal.operators.observable.C41957i0;
import io.reactivex.rxjava3.internal.operators.observable.C41986s0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: IacLogSender.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/a;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class Q<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f167971b;

    public Q(T t12) {
        this.f167971b = t12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar = (com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w) q12.f406619b;
        C41957i0 c41957i0X = io.reactivex.rxjava3.core.z.X((List) q12.f406620c);
        T t12 = this.f167971b;
        return new C41986s0(c41957i0X.w(new O(t12, wVar))).B(G0.f406611a).n(new P(t12, wVar));
    }
}
