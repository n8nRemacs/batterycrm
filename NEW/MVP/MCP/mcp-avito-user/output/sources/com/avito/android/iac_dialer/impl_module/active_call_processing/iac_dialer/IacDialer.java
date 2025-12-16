package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer;

import Y61.k;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.search.InlineFilterValue;
import dL.d;
import kotlin.Metadata;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.n2;

/* compiled from: IacDialer.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/IacDialer;", "LdL/d;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "action", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lkotlin/G0;", "accept", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;Ljava/lang/String;)V", "Lkotlinx/coroutines/flow/d2;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "getEvents", "()Lkotlinx/coroutines/flow/d2;", "events", "Lkotlinx/coroutines/flow/n2;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "getState", "()Lkotlinx/coroutines/flow/n2;", VoiceInfo.STATE, "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IacDialer extends d {
    void accept(@k IacAction action, @k String from);

    @k
    d2<IacEvent> getEvents();

    @k
    n2<IacState> getState();
}
