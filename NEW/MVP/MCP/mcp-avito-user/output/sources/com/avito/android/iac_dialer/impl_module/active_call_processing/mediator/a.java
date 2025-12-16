package com.avito.android.iac_dialer.impl_module.active_call_processing.mediator;

import Y61.k;
import kotlin.Metadata;
import kotlinx.coroutines.flow.n2;

/* compiled from: IacDialerMediator.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/mediator/a;", "MediatorAction", "MediatorState", "MediatorEvent", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a<MediatorAction, MediatorState, MediatorEvent> {
    void a(MediatorAction mediatoraction, @k String str);

    @k
    c getEvents();

    @k
    n2<MediatorState> getState();
}
