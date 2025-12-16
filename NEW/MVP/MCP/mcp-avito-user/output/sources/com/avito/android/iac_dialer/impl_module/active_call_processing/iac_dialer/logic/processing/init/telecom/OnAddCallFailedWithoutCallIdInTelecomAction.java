package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.telecom;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advertising.loaders.my_target.g;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.TerminateCallInAvCallsAndTelecomAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: OnAddCallFailedWithoutCallIdInTelecomAction.kt */
@P
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/telecom/OnAddCallFailedWithoutCallIdInTelecomAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "<init>", "()V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnAddCallFailedWithoutCallIdInTelecomAction implements IacAction {
    public static final int $stable = 0;

    @k
    public static final OnAddCallFailedWithoutCallIdInTelecomAction INSTANCE = new OnAddCallFailedWithoutCallIdInTelecomAction();

    /* compiled from: OnAddCallFailedWithoutCallIdInTelecomAction.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "<anonymous parameter 0>", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit;", "callInit", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<String, CallInit, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacActionProcessing f165486l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IacActionProcessing iacActionProcessing) {
            super(2);
            this.f165486l = iacActionProcessing;
        }

        @Override // Y41.p
        public final G0 invoke(String str, CallInit callInit) {
            CallInit callInit2 = callInit;
            if (L.f(callInit2.getTelecom(), CallInit.Telecom.Creating.INSTANCE)) {
                IacActionProcessing iacActionProcessing = this.f165486l;
                iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new TerminateCallInAvCallsAndTelecomAction(OnAddCallFailedWithoutCallIdInTelecomAction.INSTANCE.getName(), callInit2.getCallId(), null, 4, null));
                iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.Analytics.TrackStatsdCount("iac.dialer.init_fail.add_telecom_failed_without_callid"));
            }
            return G0.f406611a;
        }
    }

    private OnAddCallFailedWithoutCallIdInTelecomAction() {
    }

    public boolean equals(@l Object other) {
        return this == other || (other instanceof OnAddCallFailedWithoutCallIdInTelecomAction);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return 1134685947;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.p("Telecom.AddCall was failed for some call. We don't know callId. Let's terminate all calls with state telecom.Creating."));
        iacActionProcessing.getState().getAppearance().getCallInits().forEach(new g(2, new a(iacActionProcessing)));
    }

    @k
    public String toString() {
        return "OnAddCallFailedWithoutCallIdInTelecomAction";
    }
}
