package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.InvitingState;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CallInit.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class w extends N implements Y41.l<CallInit, InvitingState> {

    /* renamed from: l, reason: collision with root package name */
    public static final w f165541l = new w();

    public w() {
        super(1);
    }

    @Override // Y41.l
    public final InvitingState invoke(CallInit callInit) {
        return callInit.getAvCalls();
    }
}
