package com.avito.android.iac_dialer_watcher.impl_module.watcher;

import com.avito.android.util.InterfaceC35745a5;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: IacWatcherTimer.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/watcher/o;", "Lcom/avito/android/iac_dialer_watcher/impl_module/watcher/m;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f168182a;

    @Inject
    public o(@Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f168182a = interfaceC35745a5;
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.watcher.m
    public final void a(@Y61.k Y41.a aVar) {
        A1.f(AbstractC41768a.y(5000L, TimeUnit.MILLISECONDS, this.f168182a.a()), null, new n(aVar), 1);
    }
}
