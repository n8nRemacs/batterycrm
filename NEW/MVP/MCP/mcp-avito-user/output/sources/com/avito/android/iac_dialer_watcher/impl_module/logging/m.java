package com.avito.android.iac_dialer_watcher.impl_module.logging;

import com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w;
import com.avito.android.util.InterfaceC35745a5;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.observable.T;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: IacLogSessionProvider.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/m;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/k;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class m implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f167883a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f167884b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e f167885c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<w> f167886d = new com.jakewharton.rxrelay3.b().M0();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f167887e = new AtomicBoolean(false);

    @Inject
    public m(@Y61.k com.avito.android.server_time.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e eVar) {
        this.f167883a = fVar;
        this.f167884b = interfaceC35745a5;
        this.f167885c = eVar;
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.logging.k
    @Y61.k
    public final T a() {
        boolean andSet = this.f167887e.getAndSet(true);
        com.jakewharton.rxrelay3.d<w> dVar = this.f167886d;
        if (!andSet) {
            this.f167885c.h(this.f167883a.now()).s(this.f167884b.a()).k(l.f167882b).x(dVar, io.reactivex.rxjava3.internal.functions.a.f401996f);
        }
        return dVar.S();
    }
}
