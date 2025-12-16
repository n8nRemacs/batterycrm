package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state;

import Y61.k;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params.CallParams;
import fK.InterfaceC40303a;
import kotlin.Metadata;

/* compiled from: IacState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/a;", "LfK/a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a extends InterfaceC40303a {

    /* compiled from: IacState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a$a, reason: collision with other inner class name */
    public static final class C4905a {
    }

    @k
    CallState getCall();

    @k
    CallParams getParams();
}
