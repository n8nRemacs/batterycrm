package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import io.reactivex.rxjava3.internal.operators.observable.C41986s0;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: IacLogSessionHistoryUpdater.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/a;", "callsBySessions", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w f167993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y f167994c;

    public c0(com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar, Y y12) {
        this.f167993b = wVar;
        this.f167994c = y12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new C41986s0(new C41936b0(io.reactivex.rxjava3.core.z.X(P0.o((Map) obj)).N(new Z(this.f167993b)), new b0(this.f167994c))).B(G0.f406611a);
    }
}
