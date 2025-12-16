package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionEffect;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.o;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.s;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import dL.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: IacActionProcessing.kt */
@P
@s0
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\r\u001a\u00020\f*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\r\u001a\u00020\f*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\r\u0010\u0011J\u001c\u0010\r\u001a\u00020\f*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\r\u0010\u0012J\u001c\u0010\r\u001a\u00020\f*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\r\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0019R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u00100R\u0011\u00102\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b1\u0010\u0017R\u0011\u00106\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "LdL/d;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", VoiceInfo.STATE, "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessingInfo;", "processingInfo", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionOutput;", "out", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessingInfo;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionOutput;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "action", "Lkotlin/G0;", "plusAssign", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionOutput;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "event", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionOutput;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;)V", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionOutput;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/o;", "log", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionOutput;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/o;)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "component2", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessingInfo;", "component3", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionOutput;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessingInfo;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionOutput;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "getState", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessingInfo;", "getProcessingInfo", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionOutput;", "getOut", "setOut", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionOutput;)V", "getLastState", "lastState", "", "getCurrentTime", "()J", "currentTime", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacActionProcessing implements d {
    public static final int $stable = 8;

    @k
    private IacActionOutput out;

    @k
    private final IacActionProcessingInfo processingInfo;

    @k
    private final IacState state;

    public IacActionProcessing(@k IacState iacState, @k IacActionProcessingInfo iacActionProcessingInfo, @k IacActionOutput iacActionOutput) {
        this.state = iacState;
        this.processingInfo = iacActionProcessingInfo;
        this.out = iacActionOutput;
    }

    public static /* synthetic */ IacActionProcessing copy$default(IacActionProcessing iacActionProcessing, IacState iacState, IacActionProcessingInfo iacActionProcessingInfo, IacActionOutput iacActionOutput, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            iacState = iacActionProcessing.state;
        }
        if ((i12 & 2) != 0) {
            iacActionProcessingInfo = iacActionProcessing.processingInfo;
        }
        if ((i12 & 4) != 0) {
            iacActionOutput = iacActionProcessing.out;
        }
        return iacActionProcessing.copy(iacState, iacActionProcessingInfo, iacActionOutput);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final IacState getState() {
        return this.state;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final IacActionProcessingInfo getProcessingInfo() {
        return this.processingInfo;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final IacActionOutput getOut() {
        return this.out;
    }

    @k
    public final IacActionProcessing copy(@k IacState state, @k IacActionProcessingInfo processingInfo, @k IacActionOutput out) {
        return new IacActionProcessing(state, processingInfo, out);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacActionProcessing)) {
            return false;
        }
        IacActionProcessing iacActionProcessing = (IacActionProcessing) other;
        return L.f(this.state, iacActionProcessing.state) && L.f(this.processingInfo, iacActionProcessing.processingInfo) && L.f(this.out, iacActionProcessing.out);
    }

    public final long getCurrentTime() {
        return this.processingInfo.getProcessingStartedAt();
    }

    @k
    public final IacState getLastState() {
        IacState state;
        List<IacActionEffect> effects = this.out.getEffects();
        if (effects != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : effects) {
                if (obj instanceof IacActionEffect.EmitState) {
                    arrayList.add(obj);
                }
            }
            IacActionEffect.EmitState emitState = (IacActionEffect.EmitState) C42745f0.S(arrayList);
            if (emitState != null && (state = emitState.getState()) != null) {
                return state;
            }
        }
        return this.state;
    }

    @k
    public final IacActionOutput getOut() {
        return this.out;
    }

    @k
    public final IacActionProcessingInfo getProcessingInfo() {
        return this.processingInfo;
    }

    @k
    public final IacState getState() {
        return this.state;
    }

    public int hashCode() {
        return this.out.hashCode() + ((this.processingInfo.hashCode() + (this.state.hashCode() * 31)) * 31);
    }

    public final void plusAssign(@k IacActionOutput iacActionOutput, @k IacAction iacAction) {
        iacActionOutput.addEffect(new IacActionEffect.EmitAction(iacAction));
    }

    public final void setOut(@k IacActionOutput iacActionOutput) {
        this.out = iacActionOutput;
    }

    @k
    public String toString() {
        return "IacActionProcessing(state=" + this.state + ", processingInfo=" + this.processingInfo + ", out=" + this.out + ')';
    }

    public final void plusAssign(@k IacActionOutput iacActionOutput, @k IacEvent iacEvent) {
        iacActionOutput.addEffect(new IacActionEffect.EmitEvent(iacEvent));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@k IacActionOutput iacActionOutput, @k IacState iacState) {
        iacActionOutput.addEffect(new IacActionEffect.EmitState(iacState, null, 2, 0 == true ? 1 : 0));
    }

    public final void plusAssign(@k IacActionOutput iacActionOutput, @k o oVar) {
        if (oVar instanceof s) {
            s sVar = (s) oVar;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("in " + this.processingInfo.getActionName());
            String str = sVar.f165638a;
            if (!C43066x.K(str)) {
                sb2.append(" '" + str + '\'');
            }
            sb2.append(". state=" + getLastState());
            sVar.f165639b = sb2.toString();
        }
        iacActionOutput.addEffect(new IacActionEffect.WriteLog(oVar));
    }
}
