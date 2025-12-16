package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.telecom.state;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnSetInactiveCommandResultTelecomAction.kt */
@P
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\r\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0011\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/telecom/state/OnSetInactiveCommandResultTelecomAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "", "resultErrCode", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/telecom/state/OnSetInactiveCommandResultTelecomAction;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallId", "Ljava/lang/Integer;", "getResultErrCode", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnSetInactiveCommandResultTelecomAction implements IacAction {
    public static final int $stable = 0;

    @k
    private final String callId;

    @l
    private final Integer resultErrCode;

    public OnSetInactiveCommandResultTelecomAction(@k String str, @l Integer num) {
        this.callId = str;
        this.resultErrCode = num;
    }

    public static /* synthetic */ OnSetInactiveCommandResultTelecomAction copy$default(OnSetInactiveCommandResultTelecomAction onSetInactiveCommandResultTelecomAction, String str, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = onSetInactiveCommandResultTelecomAction.callId;
        }
        if ((i12 & 2) != 0) {
            num = onSetInactiveCommandResultTelecomAction.resultErrCode;
        }
        return onSetInactiveCommandResultTelecomAction.copy(str, num);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getResultErrCode() {
        return this.resultErrCode;
    }

    @k
    public final OnSetInactiveCommandResultTelecomAction copy(@k String callId, @l Integer resultErrCode) {
        return new OnSetInactiveCommandResultTelecomAction(callId, resultErrCode);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnSetInactiveCommandResultTelecomAction)) {
            return false;
        }
        OnSetInactiveCommandResultTelecomAction onSetInactiveCommandResultTelecomAction = (OnSetInactiveCommandResultTelecomAction) other;
        return L.f(this.callId, onSetInactiveCommandResultTelecomAction.callId) && L.f(this.resultErrCode, onSetInactiveCommandResultTelecomAction.resultErrCode);
    }

    @k
    public final String getCallId() {
        return this.callId;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    @l
    public final Integer getResultErrCode() {
        return this.resultErrCode;
    }

    public int hashCode() {
        int iHashCode = this.callId.hashCode() * 31;
        Integer num = this.resultErrCode;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("OnSetInactiveCommandResultTelecomAction(callId=");
        sb2.append(this.callId);
        sb2.append(", resultErrCode=");
        return s.j(sb2, this.resultErrCode, ')');
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
    }
}
