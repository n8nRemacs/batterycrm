package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext;

import Y61.l;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ModifyTelecom.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i {
    @l
    public static final CallInit a(@Y61.k IacState iacState, @Y61.k String str) {
        return iacState.getAppearance().getCallInits().get(str);
    }
}
