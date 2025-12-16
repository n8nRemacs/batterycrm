package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.recall;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.idle.IdleNavigation;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.input.CallInput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen.IacFinishedFallbackScreenLink;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnRecallUnavailableAction.kt */
@P
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0012¨\u0006%"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/recall/OnRecallUnavailableAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$RecallFromSystemApi;", "callInput", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/recall/OnRecallUnavailableAction$a;", "reason", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$RecallFromSystemApi;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/recall/OnRecallUnavailableAction$a;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lcom/avito/android/deep_linking/links/DeepLink;", "createFinalLink", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)Lcom/avito/android/deep_linking/links/DeepLink;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$RecallFromSystemApi;", "component2", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/recall/OnRecallUnavailableAction$a;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$RecallFromSystemApi;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/recall/OnRecallUnavailableAction$a;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/recall/OnRecallUnavailableAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$RecallFromSystemApi;", "getCallInput", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/recall/OnRecallUnavailableAction$a;", "getReason", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnRecallUnavailableAction implements IacAction {
    public static final int $stable = 8;

    @k
    private final CallInput.RecallFromSystemApi callInput;

    @k
    private final a reason;

    /* compiled from: OnRecallUnavailableAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/recall/OnRecallUnavailableAction$a;", "", "a", "b", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/recall/OnRecallUnavailableAction$a$a;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/recall/OnRecallUnavailableAction$a$b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: OnRecallUnavailableAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/recall/OnRecallUnavailableAction$a$a;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/recall/OnRecallUnavailableAction$a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.recall.OnRecallUnavailableAction$a$a, reason: collision with other inner class name */
        public static final /* data */ class C4904a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f165499a;

            public C4904a(@k String str) {
                this.f165499a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4904a) && L.f(this.f165499a, ((C4904a) obj).f165499a);
            }

            public final int hashCode() {
                return this.f165499a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("CanRecallReason(canRecallReason="), this.f165499a, ')');
            }
        }

        /* compiled from: OnRecallUnavailableAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/recall/OnRecallUnavailableAction$a$b;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/recall/OnRecallUnavailableAction$a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Throwable f165500a;

            public b(@k Throwable th2) {
                this.f165500a = th2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f165500a, ((b) obj).f165500a);
            }

            public final int hashCode() {
                return this.f165500a.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ErrorReason(error="), this.f165500a, ')');
            }
        }
    }

    public OnRecallUnavailableAction(@k CallInput.RecallFromSystemApi recallFromSystemApi, @k a aVar) {
        this.callInput = recallFromSystemApi;
        this.reason = aVar;
    }

    public static /* synthetic */ OnRecallUnavailableAction copy$default(OnRecallUnavailableAction onRecallUnavailableAction, CallInput.RecallFromSystemApi recallFromSystemApi, a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            recallFromSystemApi = onRecallUnavailableAction.callInput;
        }
        if ((i12 & 2) != 0) {
            aVar = onRecallUnavailableAction.reason;
        }
        return onRecallUnavailableAction.copy(recallFromSystemApi, aVar);
    }

    private final DeepLink createFinalLink(IacActionProcessing iacActionProcessing) {
        return new IacFinishedFallbackScreenLink(this.callInput.getCallId(), this.callInput.isVideo(), null, null, this.callInput.getScenario(), iacActionProcessing.getState().getAppearance().getStringResources().getFinishedCallStatusOnRecallUnavailable(), IacCallDirection.OUTGOING, null, null, null, null, null, null, null, null, null, 3L, null);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final CallInput.RecallFromSystemApi getCallInput() {
        return this.callInput;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final a getReason() {
        return this.reason;
    }

    @k
    public final OnRecallUnavailableAction copy(@k CallInput.RecallFromSystemApi callInput, @k a reason) {
        return new OnRecallUnavailableAction(callInput, reason);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnRecallUnavailableAction)) {
            return false;
        }
        OnRecallUnavailableAction onRecallUnavailableAction = (OnRecallUnavailableAction) other;
        return L.f(this.callInput, onRecallUnavailableAction.callInput) && L.f(this.reason, onRecallUnavailableAction.reason);
    }

    @k
    public final CallInput.RecallFromSystemApi getCallInput() {
        return this.callInput;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    @k
    public final a getReason() {
        return this.reason;
    }

    public int hashCode() {
        return this.reason.hashCode() + (this.callInput.hashCode() * 31);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        if (iacActionProcessing.getState() instanceof IacState.Idle) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), IacState.Idle.copy$default((IacState.Idle) iacActionProcessing.getState(), null, new IdleNavigation.FinalLink(new IacPiiDeepLink(createFinalLink(iacActionProcessing))), 1, null));
        } else {
            f.s(null, 1, null, iacActionProcessing, iacActionProcessing.getOut());
        }
    }

    @k
    public String toString() {
        return "OnRecallUnavailableAction(callInput=" + this.callInput + ", reason=" + this.reason + ')';
    }
}
