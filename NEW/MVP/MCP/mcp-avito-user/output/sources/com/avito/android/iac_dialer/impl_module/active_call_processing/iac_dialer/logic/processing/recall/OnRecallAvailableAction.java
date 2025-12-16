package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.recall;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.init.OnNewCallInputAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.input.CallInput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer_models.abstract_module.IacCanCallResult;
import com.avito.android.iac_dialer_models.abstract_module.IacItemInfo;
import com.avito.android.iac_dialer_models.abstract_module.IacSupportData;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: OnRecallAvailableAction.kt */
@P
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000f¨\u0006!"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/recall/OnRecallAvailableAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$RecallFromSystemApi;", "callInput", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult$Can;", "canCallResult", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$RecallFromSystemApi;Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult$Can;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$RecallFromSystemApi;", "component2", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult$Can;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$RecallFromSystemApi;Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult$Can;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/recall/OnRecallAvailableAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$RecallFromSystemApi;", "getCallInput", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult$Can;", "getCanCallResult", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnRecallAvailableAction implements IacAction {
    public static final int $stable = 8;

    @k
    private final CallInput.RecallFromSystemApi callInput;

    @k
    private final IacCanCallResult.Can canCallResult;

    public OnRecallAvailableAction(@k CallInput.RecallFromSystemApi recallFromSystemApi, @k IacCanCallResult.Can can) {
        this.callInput = recallFromSystemApi;
        this.canCallResult = can;
    }

    public static /* synthetic */ OnRecallAvailableAction copy$default(OnRecallAvailableAction onRecallAvailableAction, CallInput.RecallFromSystemApi recallFromSystemApi, IacCanCallResult.Can can, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            recallFromSystemApi = onRecallAvailableAction.callInput;
        }
        if ((i12 & 2) != 0) {
            can = onRecallAvailableAction.canCallResult;
        }
        return onRecallAvailableAction.copy(recallFromSystemApi, can);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final CallInput.RecallFromSystemApi getCallInput() {
        return this.callInput;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final IacCanCallResult.Can getCanCallResult() {
        return this.canCallResult;
    }

    @k
    public final OnRecallAvailableAction copy(@k CallInput.RecallFromSystemApi callInput, @k IacCanCallResult.Can canCallResult) {
        return new OnRecallAvailableAction(callInput, canCallResult);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnRecallAvailableAction)) {
            return false;
        }
        OnRecallAvailableAction onRecallAvailableAction = (OnRecallAvailableAction) other;
        return L.f(this.callInput, onRecallAvailableAction.callInput) && L.f(this.canCallResult, onRecallAvailableAction.canCallResult);
    }

    @k
    public final CallInput.RecallFromSystemApi getCallInput() {
        return this.callInput;
    }

    @k
    public final IacCanCallResult.Can getCanCallResult() {
        return this.canCallResult;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return this.canCallResult.hashCode() + (this.callInput.hashCode() * 31);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        String str;
        IacActionOutput out = iacActionProcessing.getOut();
        String callId = this.callInput.getCallId();
        String str2 = this.canCallResult.getCallInfo().f166836f;
        String str3 = this.canCallResult.getCallInfo().f166833c.f166868b;
        String str4 = this.canCallResult.getCallInfo().f166835e;
        boolean zIsVideo = this.callInput.isVideo();
        IacItemInfo iacItemInfo = this.canCallResult.getCallInfo().f166834d;
        Long lZ02 = (iacItemInfo == null || (str = iacItemInfo.f166858b) == null) ? null : C43066x.z0(str);
        IacSupportData iacSupportData = this.canCallResult.getCallInfo().f166841k;
        iacActionProcessing.plusAssign(out, new OnNewCallInputAction(new CallInput.NewCall(callId, str2, zIsVideo, str3, str4, lZ02, iacSupportData != null ? iacSupportData.f166873b : null, null)));
    }

    @k
    public String toString() {
        return "OnRecallAvailableAction(callInput=" + this.callInput + ", canCallResult=" + this.canCallResult + ')';
    }
}
