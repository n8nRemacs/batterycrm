package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.input;

import Y41.l;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.input.CallInput;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CallInput.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$NewCall;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$NewCall;)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class g extends N implements l<CallInput.NewCall, Long> {

    /* renamed from: l, reason: collision with root package name */
    public static final g f165601l = new g();

    public g() {
        super(1);
    }

    @Override // Y41.l
    public final Long invoke(CallInput.NewCall newCall) {
        return newCall.getItemId();
    }
}
