package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareEffect;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.o;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.s;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import dL.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: IacMiddlewareProcessing.kt */
@P
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000e\u001a\u00020\r*\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u000e\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0012J\u001c\u0010\u000e\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001cR\u0011\u00104\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;", "LdL/d;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "oldState", "newState", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessingInfo;", "processingInfo", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareOutput;", "out", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessingInfo;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareOutput;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "action", "Lkotlin/G0;", "plusAssign", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareOutput;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "event", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareOutput;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/o;", "log", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareOutput;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/o;)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "component2", "component3", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessingInfo;", "component4", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareOutput;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessingInfo;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareOutput;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "getOldState", "getNewState", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessingInfo;", "getProcessingInfo", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareOutput;", "getOut", "", "getCurrentTime", "()J", "currentTime", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacMiddlewareProcessing implements d {
    public static final int $stable = 8;

    @k
    private final IacState newState;

    @k
    private final IacState oldState;

    @k
    private final IacMiddlewareOutput out;

    @k
    private final IacMiddlewareProcessingInfo processingInfo;

    public IacMiddlewareProcessing(@k IacState iacState, @k IacState iacState2, @k IacMiddlewareProcessingInfo iacMiddlewareProcessingInfo, @k IacMiddlewareOutput iacMiddlewareOutput) {
        this.oldState = iacState;
        this.newState = iacState2;
        this.processingInfo = iacMiddlewareProcessingInfo;
        this.out = iacMiddlewareOutput;
    }

    public static /* synthetic */ IacMiddlewareProcessing copy$default(IacMiddlewareProcessing iacMiddlewareProcessing, IacState iacState, IacState iacState2, IacMiddlewareProcessingInfo iacMiddlewareProcessingInfo, IacMiddlewareOutput iacMiddlewareOutput, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            iacState = iacMiddlewareProcessing.oldState;
        }
        if ((i12 & 2) != 0) {
            iacState2 = iacMiddlewareProcessing.newState;
        }
        if ((i12 & 4) != 0) {
            iacMiddlewareProcessingInfo = iacMiddlewareProcessing.processingInfo;
        }
        if ((i12 & 8) != 0) {
            iacMiddlewareOutput = iacMiddlewareProcessing.out;
        }
        return iacMiddlewareProcessing.copy(iacState, iacState2, iacMiddlewareProcessingInfo, iacMiddlewareOutput);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final IacState getOldState() {
        return this.oldState;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final IacState getNewState() {
        return this.newState;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final IacMiddlewareProcessingInfo getProcessingInfo() {
        return this.processingInfo;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final IacMiddlewareOutput getOut() {
        return this.out;
    }

    @k
    public final IacMiddlewareProcessing copy(@k IacState oldState, @k IacState newState, @k IacMiddlewareProcessingInfo processingInfo, @k IacMiddlewareOutput out) {
        return new IacMiddlewareProcessing(oldState, newState, processingInfo, out);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacMiddlewareProcessing)) {
            return false;
        }
        IacMiddlewareProcessing iacMiddlewareProcessing = (IacMiddlewareProcessing) other;
        return L.f(this.oldState, iacMiddlewareProcessing.oldState) && L.f(this.newState, iacMiddlewareProcessing.newState) && L.f(this.processingInfo, iacMiddlewareProcessing.processingInfo) && L.f(this.out, iacMiddlewareProcessing.out);
    }

    public final long getCurrentTime() {
        return this.processingInfo.getActionProcessingStartedAt();
    }

    @k
    public final IacState getNewState() {
        return this.newState;
    }

    @k
    public final IacState getOldState() {
        return this.oldState;
    }

    @k
    public final IacMiddlewareOutput getOut() {
        return this.out;
    }

    @k
    public final IacMiddlewareProcessingInfo getProcessingInfo() {
        return this.processingInfo;
    }

    public int hashCode() {
        return this.out.hashCode() + ((this.processingInfo.hashCode() + ((this.newState.hashCode() + (this.oldState.hashCode() * 31)) * 31)) * 31);
    }

    public final void plusAssign(@k IacMiddlewareOutput iacMiddlewareOutput, @k IacAction iacAction) {
        iacMiddlewareOutput.addEffect(new IacMiddlewareEffect.EmitAction(iacAction));
    }

    @k
    public String toString() {
        return "IacMiddlewareProcessing(oldState=" + this.oldState + ", newState=" + this.newState + ", processingInfo=" + this.processingInfo + ", out=" + this.out + ')';
    }

    public final void plusAssign(@k IacMiddlewareOutput iacMiddlewareOutput, @k IacEvent iacEvent) {
        iacMiddlewareOutput.addEffect(new IacMiddlewareEffect.EmitEvent(iacEvent));
    }

    public final void plusAssign(@k IacMiddlewareOutput iacMiddlewareOutput, @k o oVar) {
        if (oVar instanceof s) {
            s sVar = (s) oVar;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("in " + this.processingInfo.getMiddlewareName());
            String str = sVar.f165638a;
            if (!C43066x.K(str)) {
                sb2.append(":" + str);
            }
            sb2.append(". state=" + this.newState);
            sVar.f165639b = sb2.toString();
        }
        iacMiddlewareOutput.addEffect(new IacMiddlewareEffect.WriteLog(oVar));
    }
}
