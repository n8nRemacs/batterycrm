package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.input;

import Y41.l;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.input.CallInput;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CallInput.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$RecallFromSystemApi;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class j extends N implements l<CallInput.RecallFromSystemApi, String> {

    /* renamed from: l, reason: collision with root package name */
    public static final j f165604l = new j();

    public j() {
        super(1);
    }

    @Override // Y41.l
    public final String invoke(CallInput.RecallFromSystemApi recallFromSystemApi) {
        return recallFromSystemApi.getPrevCallId();
    }
}
