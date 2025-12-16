package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.input;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.input.CallInput;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CallInput.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/k;", "LJK/f;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class k extends JK.f<CallInput> {
    static {
        new k();
    }

    @Override // JK.f
    public final void a(StringBuilder sb2, String str, CallInput callInput, CallInput callInput2) {
        CallInput callInput3 = callInput;
        CallInput callInput4 = callInput2;
        JK.f.b(sb2, str, callInput3, callInput4, "subType", a.f165595l);
        JK.f.b(sb2, str, callInput3, callInput4, FailedBinderCallBack.CALLER_ID, b.f165596l);
        JK.f.b(sb2, str, callInput3, callInput4, "scenario", c.f165597l);
        if ((callInput3 instanceof CallInput.NewCall) && (callInput4 instanceof CallInput.NewCall)) {
            CallInput.NewCall newCall = (CallInput.NewCall) callInput4;
            CallInput.NewCall newCall2 = (CallInput.NewCall) callInput3;
            JK.f.b(sb2, str, newCall2, newCall, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, d.f165598l);
            JK.f.b(sb2, str, newCall2, newCall, InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, e.f165599l);
            JK.f.b(sb2, str, newCall2, newCall, "isVideo", f.f165600l);
            JK.f.b(sb2, str, newCall2, newCall, "itemId", g.f165601l);
            JK.f.b(sb2, str, newCall2, newCall, "extraInfo", h.f165602l);
            JK.f.b(sb2, str, newCall2, newCall, "analyticsExtraParams", i.f165603l);
        }
        if ((callInput3 instanceof CallInput.RecallFromSystemApi) && (callInput4 instanceof CallInput.RecallFromSystemApi)) {
            JK.f.b(sb2, str, (CallInput.RecallFromSystemApi) callInput3, (CallInput.RecallFromSystemApi) callInput4, "prevCallId", j.f165604l);
        }
    }

    public final boolean equals(@l Object obj) {
        return this == obj || (obj instanceof k);
    }

    public final int hashCode() {
        return 279458873;
    }

    @Y61.k
    public final String toString() {
        return "CallInputDiffPrinter";
    }
}
