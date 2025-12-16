package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.flow.d2;

/* compiled from: OverlayLazyStateInitializerBootstrap.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u0010\u001a\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/bootstraps/OverlayLazyStateInitializerBootstrap;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap;", "Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/h;", "overlayInitializer", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/h;)V", "Lkotlinx/coroutines/flow/d2;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "eventsFlow", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "initialState", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$a;", "actionCollector", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$d;", "waiter", "Lkotlin/G0;", "process", "(Lkotlinx/coroutines/flow/d2;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$a;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$d;)V", "Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/h;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@C11.a
/* loaded from: classes14.dex */
public final class OverlayLazyStateInitializerBootstrap implements IacBootstrap {
    public static final int $stable = 8;

    @Y61.k
    private final com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.h overlayInitializer;

    @Inject
    public OverlayLazyStateInitializerBootstrap(@Y61.k com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.h hVar) {
        this.overlayInitializer = hVar;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap
    @Y61.k
    public String getName() {
        return b.a.a(this);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap
    public void process(@Y61.k d2<? extends IacEvent> eventsFlow, @Y61.k IacState initialState, @Y61.k IacBootstrap.a actionCollector, @Y61.k IacBootstrap.d waiter) {
        this.overlayInitializer.b();
    }
}
