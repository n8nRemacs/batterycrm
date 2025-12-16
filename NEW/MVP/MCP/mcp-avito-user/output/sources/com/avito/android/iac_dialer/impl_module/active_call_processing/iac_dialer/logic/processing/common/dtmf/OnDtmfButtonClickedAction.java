package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.dtmf;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnDtmfButtonClickedAction.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/dtmf/OnDtmfButtonClickedAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "", "tone", "<init>", "(Ljava/lang/String;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/dtmf/OnDtmfButtonClickedAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTone", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnDtmfButtonClickedAction implements IacAction {
    public static final int $stable = 0;

    @k
    private final String tone;

    public OnDtmfButtonClickedAction(@k String str) {
        this.tone = str;
    }

    public static /* synthetic */ OnDtmfButtonClickedAction copy$default(OnDtmfButtonClickedAction onDtmfButtonClickedAction, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = onDtmfButtonClickedAction.tone;
        }
        return onDtmfButtonClickedAction.copy(str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTone() {
        return this.tone;
    }

    @k
    public final OnDtmfButtonClickedAction copy(@k String tone) {
        return new OnDtmfButtonClickedAction(tone);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnDtmfButtonClickedAction) && L.f(this.tone, ((OnDtmfButtonClickedAction) other).tone);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    @k
    public final String getTone() {
        return this.tone;
    }

    public int hashCode() {
        return this.tone.hashCode();
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        if (!(iacActionProcessing.getState() instanceof IacState.InUse)) {
            f.s(null, 1, null, iacActionProcessing, iacActionProcessing.getOut());
        } else {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.AvCalls.SendDtmf(((IacState.InUse) iacActionProcessing.getState()).getCallId(), this.tone));
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.TonePlayer.PlayDtmf(this.tone));
        }
    }

    @k
    public String toString() {
        return C22026a.c(new StringBuilder("OnDtmfButtonClickedAction(tone="), this.tone, ')');
    }
}
