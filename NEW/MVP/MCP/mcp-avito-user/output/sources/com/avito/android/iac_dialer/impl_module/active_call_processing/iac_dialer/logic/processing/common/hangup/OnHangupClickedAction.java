package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.hangup;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.TerminateCallInAvCallsAndTelecomAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.Appearance;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallStorage;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReason;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.i;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.p;
import com.avito.android.iac_dialer_models.abstract_module.IacCallTime;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.huawei.hms.api.FailedBinderCallBack;
import dL.d;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import mJ.AbstractC43973b;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: OnHangupClickedAction.kt */
@P
@s0
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0004*+,-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u0007*\u00020\u00062\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\tJ\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u001b¨\u0006."}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/hangup/OnHangupClickedAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/hangup/OnHangupClickedAction$FromArg;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/hangup/OnHangupClickedAction$FromArg;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "processHangupFromCallScreen", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "processHangupFromNotification", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;Ljava/lang/String;)V", "LmJ/b;", "iacDialerScenario", "track4683", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;LmJ/b;)V", "sendHangupToSdk", "showWaitBottomSheetIfNeeded", "", "", "isLessThenOneDayAgo", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;J)Z", "process", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/hangup/OnHangupClickedAction$FromArg;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/hangup/OnHangupClickedAction$FromArg;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/hangup/OnHangupClickedAction;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/hangup/OnHangupClickedAction$FromArg;", "getFrom", "Companion", "a", "FromArg", "FromCallScreen", "FromNotification", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnHangupClickedAction implements IacAction {
    private static final long SECONDS_10 = 10000;
    private static final long SECONDS_3 = 3000;
    private static final long SECONDS_30 = 30000;

    @k
    private final FromArg from;
    public static final int $stable = 8;

    /* compiled from: OnHangupClickedAction.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/hangup/OnHangupClickedAction$FromArg;", "LdL/d;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/hangup/OnHangupClickedAction$FromCallScreen;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/hangup/OnHangupClickedAction$FromNotification;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface FromArg extends d {
    }

    /* compiled from: OnHangupClickedAction.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/hangup/OnHangupClickedAction$FromCallScreen;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/hangup/OnHangupClickedAction$FromArg;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FromCallScreen implements FromArg {
        public static final int $stable = 0;

        @k
        public static final FromCallScreen INSTANCE = new FromCallScreen();

        private FromCallScreen() {
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof FromCallScreen);
        }

        public int hashCode() {
            return 1292942395;
        }

        @k
        public String toString() {
            return "FromCallScreen";
        }
    }

    /* compiled from: OnHangupClickedAction.kt */
    @P
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/hangup/OnHangupClickedAction$FromNotification;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/hangup/OnHangupClickedAction$FromArg;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "(Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FromNotification implements FromArg {
        public static final int $stable = 0;

        @k
        private final String callId;

        public FromNotification(@k String str) {
            this.callId = str;
        }

        public static /* synthetic */ FromNotification copy$default(FromNotification fromNotification, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = fromNotification.callId;
            }
            return fromNotification.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        @k
        public final FromNotification copy(@k String callId) {
            return new FromNotification(callId);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FromNotification) && L.f(this.callId, ((FromNotification) other).callId);
        }

        @k
        public final String getCallId() {
            return this.callId;
        }

        public int hashCode() {
            return this.callId.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("FromNotification(callId="), this.callId, ')');
        }
    }

    public OnHangupClickedAction(@k FromArg fromArg) {
        this.from = fromArg;
    }

    public static /* synthetic */ OnHangupClickedAction copy$default(OnHangupClickedAction onHangupClickedAction, FromArg fromArg, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            fromArg = onHangupClickedAction.from;
        }
        return onHangupClickedAction.copy(fromArg);
    }

    private final boolean isLessThenOneDayAgo(IacActionProcessing iacActionProcessing, long j12) {
        return iacActionProcessing.getCurrentTime() - j12 <= TimeUnit.DAYS.toMillis(1L);
    }

    private final void processHangupFromCallScreen(IacActionProcessing iacActionProcessing) {
        if (!(iacActionProcessing.getState() instanceof IacState.InUse.Alive)) {
            f.s(null, 1, null, iacActionProcessing, iacActionProcessing.getOut());
            return;
        }
        IacState.InUse.Alive alive = (IacState.InUse.Alive) iacActionProcessing.getState();
        if (alive instanceof IacState.InUse.Alive.Outgoing) {
            showWaitBottomSheetIfNeeded(iacActionProcessing);
            return;
        }
        if (alive instanceof IacState.InUse.Alive.Incoming ? true : alive instanceof IacState.InUse.Alive.Talking) {
            sendHangupToSdk(iacActionProcessing, AbstractC43973b.C11823b.f414452b);
        }
    }

    private final void processHangupFromNotification(IacActionProcessing iacActionProcessing, String str) {
        if (i.a(iacActionProcessing.getState(), str) != null) {
            sendHangupToSdk(iacActionProcessing, AbstractC43973b.g.f414457b);
        } else {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new TerminateCallInAvCallsAndTelecomAction(getName(), str, null, 4, null));
        }
    }

    private final void sendHangupToSdk(IacActionProcessing iacActionProcessing, AbstractC43973b abstractC43973b) {
        track4683(iacActionProcessing, abstractC43973b);
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.AvCalls.TerminateCall(((IacState.InUse) iacActionProcessing.getState()).getCallId(), TerminateReason.Hangup.INSTANCE));
    }

    private final void showWaitBottomSheetIfNeeded(IacActionProcessing iacActionProcessing) {
        IacState iacStateCopy$default;
        IacState iacStateCopy$default2;
        IacState iacStateCopy$default3;
        IacState iacStateCopy$default4;
        IacCallTime time = ((IacState.InUse) iacActionProcessing.getState()).getParams().getTime();
        Long lValueOf = time.f166851h ? Long.valueOf(iacActionProcessing.getCurrentTime() - time.f166847d) : null;
        long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
        IacActionOutput out = iacActionProcessing.getOut();
        StringBuilder sb2 = new StringBuilder();
        C43066x.j(sb2, "initializedCallDuration=", Long.valueOf(jLongValue));
        C43066x.j(sb2, ", wasRingingReceived=", Boolean.valueOf(((IacState.InUse) iacActionProcessing.getState()).getCall().getWasRingingReceived()));
        C43066x.j(sb2, ", storage=", iacActionProcessing.getState().getAppearance().getStorage());
        C43066x.j(sb2, ", isLessThenOneDayAgo(waitDialing)=", Boolean.valueOf(isLessThenOneDayAgo(iacActionProcessing, iacActionProcessing.getState().getAppearance().getStorage().getWaitDialingBottomSheetLastShowTime())));
        C43066x.j(sb2, ", isLessThenOneDayAgo(waitRinging)=", Boolean.valueOf(isLessThenOneDayAgo(iacActionProcessing, iacActionProcessing.getState().getAppearance().getStorage().getWaitRingingBottomSheetLastShowTime())));
        C43066x.j(sb2, ", gsmLink=", ((IacState.InUse) iacActionProcessing.getState()).getCall().getMeta().getGsmLink());
        G0 g02 = G0.f406611a;
        iacActionProcessing.plusAssign(out, new p(sb2.toString()));
        if (jLongValue <= SECONDS_3) {
            sendHangupToSdk(iacActionProcessing, AbstractC43973b.C11823b.f414452b);
            return;
        }
        if (jLongValue < SECONDS_10) {
            if (((IacState.InUse) iacActionProcessing.getState()).getCall().getWasRingingReceived()) {
                sendHangupToSdk(iacActionProcessing, AbstractC43973b.C11823b.f414452b);
                return;
            }
            if (isLessThenOneDayAgo(iacActionProcessing, iacActionProcessing.getState().getAppearance().getStorage().getWaitDialingBottomSheetLastShowTime())) {
                sendHangupToSdk(iacActionProcessing, AbstractC43973b.C11823b.f414452b);
                return;
            }
            track4683(iacActionProcessing, AbstractC43973b.d.f414454b);
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), IacEvent.CallScreen.WaitBottomSheet.DisplayWaitDialingBottomSheet.INSTANCE);
            IacActionOutput out2 = iacActionProcessing.getOut();
            IacState state = iacActionProcessing.getState();
            if (state instanceof IacState.Idle) {
                IacState.Idle idle = (IacState.Idle) state;
                Appearance appearance = idle.getAppearance();
                iacStateCopy$default4 = IacState.Idle.copy$default(idle, appearance.copy((261631 & 1) != 0 ? appearance.callInits : null, (261631 & 2) != 0 ? appearance.service : null, (261631 & 4) != 0 ? appearance.screen : null, (261631 & 8) != 0 ? appearance.app : null, (261631 & 16) != 0 ? appearance.micPerm : null, (261631 & 32) != 0 ? appearance.cameraPerm : null, (261631 & 64) != 0 ? appearance.notifications : null, (261631 & 128) != 0 ? appearance.ringingMode : null, (261631 & 256) != 0 ? appearance.camera : null, (261631 & 512) != 0 ? appearance.isGsmBusy : false, (261631 & 1024) != 0 ? appearance.network : null, (261631 & 2048) != 0 ? appearance.connectionQuality : null, (261631 & 4096) != 0 ? appearance.power : null, (261631 & 8192) != 0 ? appearance.storage : CallStorage.copy$default(appearance.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance.isMiui : false, (261631 & 32768) != 0 ? appearance.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance.config : null, (261631 & 131072) != 0 ? appearance.stringResources : null), null, 2, null);
            } else if (state instanceof IacState.InUse.Alive.Outgoing.Launching) {
                IacState.InUse.Alive.Outgoing.Launching launching = (IacState.InUse.Alive.Outgoing.Launching) state;
                Appearance appearance2 = launching.getAppearance();
                iacStateCopy$default4 = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching, null, null, appearance2.copy((261631 & 1) != 0 ? appearance2.callInits : null, (261631 & 2) != 0 ? appearance2.service : null, (261631 & 4) != 0 ? appearance2.screen : null, (261631 & 8) != 0 ? appearance2.app : null, (261631 & 16) != 0 ? appearance2.micPerm : null, (261631 & 32) != 0 ? appearance2.cameraPerm : null, (261631 & 64) != 0 ? appearance2.notifications : null, (261631 & 128) != 0 ? appearance2.ringingMode : null, (261631 & 256) != 0 ? appearance2.camera : null, (261631 & 512) != 0 ? appearance2.isGsmBusy : false, (261631 & 1024) != 0 ? appearance2.network : null, (261631 & 2048) != 0 ? appearance2.connectionQuality : null, (261631 & 4096) != 0 ? appearance2.power : null, (261631 & 8192) != 0 ? appearance2.storage : CallStorage.copy$default(appearance2.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance2.isMiui : false, (261631 & 32768) != 0 ? appearance2.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance2.config : null, (261631 & 131072) != 0 ? appearance2.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                IacState.InUse.Alive.Outgoing.Resolving resolving = (IacState.InUse.Alive.Outgoing.Resolving) state;
                Appearance appearance3 = resolving.getAppearance();
                iacStateCopy$default4 = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving, null, null, null, appearance3.copy((261631 & 1) != 0 ? appearance3.callInits : null, (261631 & 2) != 0 ? appearance3.service : null, (261631 & 4) != 0 ? appearance3.screen : null, (261631 & 8) != 0 ? appearance3.app : null, (261631 & 16) != 0 ? appearance3.micPerm : null, (261631 & 32) != 0 ? appearance3.cameraPerm : null, (261631 & 64) != 0 ? appearance3.notifications : null, (261631 & 128) != 0 ? appearance3.ringingMode : null, (261631 & 256) != 0 ? appearance3.camera : null, (261631 & 512) != 0 ? appearance3.isGsmBusy : false, (261631 & 1024) != 0 ? appearance3.network : null, (261631 & 2048) != 0 ? appearance3.connectionQuality : null, (261631 & 4096) != 0 ? appearance3.power : null, (261631 & 8192) != 0 ? appearance3.storage : CallStorage.copy$default(appearance3.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance3.isMiui : false, (261631 & 32768) != 0 ? appearance3.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance3.config : null, (261631 & 131072) != 0 ? appearance3.stringResources : null), 7, null);
            } else if (state instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                IacState.InUse.Alive.Outgoing.Waiting waiting = (IacState.InUse.Alive.Outgoing.Waiting) state;
                Appearance appearance4 = waiting.getAppearance();
                iacStateCopy$default4 = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting, null, null, appearance4.copy((261631 & 1) != 0 ? appearance4.callInits : null, (261631 & 2) != 0 ? appearance4.service : null, (261631 & 4) != 0 ? appearance4.screen : null, (261631 & 8) != 0 ? appearance4.app : null, (261631 & 16) != 0 ? appearance4.micPerm : null, (261631 & 32) != 0 ? appearance4.cameraPerm : null, (261631 & 64) != 0 ? appearance4.notifications : null, (261631 & 128) != 0 ? appearance4.ringingMode : null, (261631 & 256) != 0 ? appearance4.camera : null, (261631 & 512) != 0 ? appearance4.isGsmBusy : false, (261631 & 1024) != 0 ? appearance4.network : null, (261631 & 2048) != 0 ? appearance4.connectionQuality : null, (261631 & 4096) != 0 ? appearance4.power : null, (261631 & 8192) != 0 ? appearance4.storage : CallStorage.copy$default(appearance4.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance4.isMiui : false, (261631 & 32768) != 0 ? appearance4.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance4.config : null, (261631 & 131072) != 0 ? appearance4.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Incoming.Waiting) {
                IacState.InUse.Alive.Incoming.Waiting waiting2 = (IacState.InUse.Alive.Incoming.Waiting) state;
                Appearance appearance5 = waiting2.getAppearance();
                iacStateCopy$default4 = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting2, null, null, appearance5.copy((261631 & 1) != 0 ? appearance5.callInits : null, (261631 & 2) != 0 ? appearance5.service : null, (261631 & 4) != 0 ? appearance5.screen : null, (261631 & 8) != 0 ? appearance5.app : null, (261631 & 16) != 0 ? appearance5.micPerm : null, (261631 & 32) != 0 ? appearance5.cameraPerm : null, (261631 & 64) != 0 ? appearance5.notifications : null, (261631 & 128) != 0 ? appearance5.ringingMode : null, (261631 & 256) != 0 ? appearance5.camera : null, (261631 & 512) != 0 ? appearance5.isGsmBusy : false, (261631 & 1024) != 0 ? appearance5.network : null, (261631 & 2048) != 0 ? appearance5.connectionQuality : null, (261631 & 4096) != 0 ? appearance5.power : null, (261631 & 8192) != 0 ? appearance5.storage : CallStorage.copy$default(appearance5.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance5.isMiui : false, (261631 & 32768) != 0 ? appearance5.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance5.config : null, (261631 & 131072) != 0 ? appearance5.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Incoming.Resolving) {
                IacState.InUse.Alive.Incoming.Resolving resolving2 = (IacState.InUse.Alive.Incoming.Resolving) state;
                Appearance appearance6 = resolving2.getAppearance();
                iacStateCopy$default4 = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving2, null, null, null, appearance6.copy((261631 & 1) != 0 ? appearance6.callInits : null, (261631 & 2) != 0 ? appearance6.service : null, (261631 & 4) != 0 ? appearance6.screen : null, (261631 & 8) != 0 ? appearance6.app : null, (261631 & 16) != 0 ? appearance6.micPerm : null, (261631 & 32) != 0 ? appearance6.cameraPerm : null, (261631 & 64) != 0 ? appearance6.notifications : null, (261631 & 128) != 0 ? appearance6.ringingMode : null, (261631 & 256) != 0 ? appearance6.camera : null, (261631 & 512) != 0 ? appearance6.isGsmBusy : false, (261631 & 1024) != 0 ? appearance6.network : null, (261631 & 2048) != 0 ? appearance6.connectionQuality : null, (261631 & 4096) != 0 ? appearance6.power : null, (261631 & 8192) != 0 ? appearance6.storage : CallStorage.copy$default(appearance6.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance6.isMiui : false, (261631 & 32768) != 0 ? appearance6.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance6.config : null, (261631 & 131072) != 0 ? appearance6.stringResources : null), 7, null);
            } else if (state instanceof IacState.InUse.Alive.Incoming.Accepting) {
                IacState.InUse.Alive.Incoming.Accepting accepting = (IacState.InUse.Alive.Incoming.Accepting) state;
                Appearance appearance7 = accepting.getAppearance();
                iacStateCopy$default4 = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting, null, null, appearance7.copy((261631 & 1) != 0 ? appearance7.callInits : null, (261631 & 2) != 0 ? appearance7.service : null, (261631 & 4) != 0 ? appearance7.screen : null, (261631 & 8) != 0 ? appearance7.app : null, (261631 & 16) != 0 ? appearance7.micPerm : null, (261631 & 32) != 0 ? appearance7.cameraPerm : null, (261631 & 64) != 0 ? appearance7.notifications : null, (261631 & 128) != 0 ? appearance7.ringingMode : null, (261631 & 256) != 0 ? appearance7.camera : null, (261631 & 512) != 0 ? appearance7.isGsmBusy : false, (261631 & 1024) != 0 ? appearance7.network : null, (261631 & 2048) != 0 ? appearance7.connectionQuality : null, (261631 & 4096) != 0 ? appearance7.power : null, (261631 & 8192) != 0 ? appearance7.storage : CallStorage.copy$default(appearance7.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance7.isMiui : false, (261631 & 32768) != 0 ? appearance7.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance7.config : null, (261631 & 131072) != 0 ? appearance7.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Talking) {
                IacState.InUse.Alive.Talking talking = (IacState.InUse.Alive.Talking) state;
                Appearance appearance8 = talking.getAppearance();
                iacStateCopy$default4 = IacState.InUse.Alive.Talking.copy$default(talking, null, null, appearance8.copy((261631 & 1) != 0 ? appearance8.callInits : null, (261631 & 2) != 0 ? appearance8.service : null, (261631 & 4) != 0 ? appearance8.screen : null, (261631 & 8) != 0 ? appearance8.app : null, (261631 & 16) != 0 ? appearance8.micPerm : null, (261631 & 32) != 0 ? appearance8.cameraPerm : null, (261631 & 64) != 0 ? appearance8.notifications : null, (261631 & 128) != 0 ? appearance8.ringingMode : null, (261631 & 256) != 0 ? appearance8.camera : null, (261631 & 512) != 0 ? appearance8.isGsmBusy : false, (261631 & 1024) != 0 ? appearance8.network : null, (261631 & 2048) != 0 ? appearance8.connectionQuality : null, (261631 & 4096) != 0 ? appearance8.power : null, (261631 & 8192) != 0 ? appearance8.storage : CallStorage.copy$default(appearance8.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance8.isMiui : false, (261631 & 32768) != 0 ? appearance8.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance8.config : null, (261631 & 131072) != 0 ? appearance8.stringResources : null), 3, null);
            } else {
                if (!(state instanceof IacState.InUse.Finished)) {
                    throw new NoWhenBranchMatchedException();
                }
                IacState.InUse.Finished finished = (IacState.InUse.Finished) state;
                Appearance appearance9 = finished.getAppearance();
                iacStateCopy$default4 = IacState.InUse.Finished.copy$default(finished, null, null, appearance9.copy((261631 & 1) != 0 ? appearance9.callInits : null, (261631 & 2) != 0 ? appearance9.service : null, (261631 & 4) != 0 ? appearance9.screen : null, (261631 & 8) != 0 ? appearance9.app : null, (261631 & 16) != 0 ? appearance9.micPerm : null, (261631 & 32) != 0 ? appearance9.cameraPerm : null, (261631 & 64) != 0 ? appearance9.notifications : null, (261631 & 128) != 0 ? appearance9.ringingMode : null, (261631 & 256) != 0 ? appearance9.camera : null, (261631 & 512) != 0 ? appearance9.isGsmBusy : false, (261631 & 1024) != 0 ? appearance9.network : null, (261631 & 2048) != 0 ? appearance9.connectionQuality : null, (261631 & 4096) != 0 ? appearance9.power : null, (261631 & 8192) != 0 ? appearance9.storage : CallStorage.copy$default(appearance9.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance9.isMiui : false, (261631 & 32768) != 0 ? appearance9.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance9.config : null, (261631 & 131072) != 0 ? appearance9.stringResources : null), 3, null);
            }
            if (iacStateCopy$default4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse");
            }
            iacActionProcessing.plusAssign(out2, (IacState.InUse) iacStateCopy$default4);
            return;
        }
        if (((IacState.InUse) iacActionProcessing.getState()).getCall().getWasRingingReceived()) {
            if (jLongValue > SECONDS_30) {
                sendHangupToSdk(iacActionProcessing, AbstractC43973b.C11823b.f414452b);
                return;
            }
            if (isLessThenOneDayAgo(iacActionProcessing, iacActionProcessing.getState().getAppearance().getStorage().getWaitRingingBottomSheetLastShowTime())) {
                sendHangupToSdk(iacActionProcessing, AbstractC43973b.C11823b.f414452b);
                return;
            }
            track4683(iacActionProcessing, AbstractC43973b.d.f414454b);
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), IacEvent.CallScreen.WaitBottomSheet.DisplayWaitRingingBottomSheet.INSTANCE);
            IacActionOutput out3 = iacActionProcessing.getOut();
            IacState state2 = iacActionProcessing.getState();
            if (state2 instanceof IacState.Idle) {
                IacState.Idle idle2 = (IacState.Idle) state2;
                Appearance appearance10 = idle2.getAppearance();
                iacStateCopy$default = IacState.Idle.copy$default(idle2, appearance10.copy((261631 & 1) != 0 ? appearance10.callInits : null, (261631 & 2) != 0 ? appearance10.service : null, (261631 & 4) != 0 ? appearance10.screen : null, (261631 & 8) != 0 ? appearance10.app : null, (261631 & 16) != 0 ? appearance10.micPerm : null, (261631 & 32) != 0 ? appearance10.cameraPerm : null, (261631 & 64) != 0 ? appearance10.notifications : null, (261631 & 128) != 0 ? appearance10.ringingMode : null, (261631 & 256) != 0 ? appearance10.camera : null, (261631 & 512) != 0 ? appearance10.isGsmBusy : false, (261631 & 1024) != 0 ? appearance10.network : null, (261631 & 2048) != 0 ? appearance10.connectionQuality : null, (261631 & 4096) != 0 ? appearance10.power : null, (261631 & 8192) != 0 ? appearance10.storage : CallStorage.copy$default(appearance10.getStorage(), 0L, iacActionProcessing.getCurrentTime(), 1, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance10.isMiui : false, (261631 & 32768) != 0 ? appearance10.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance10.config : null, (261631 & 131072) != 0 ? appearance10.stringResources : null), null, 2, null);
            } else if (state2 instanceof IacState.InUse.Alive.Outgoing.Launching) {
                IacState.InUse.Alive.Outgoing.Launching launching2 = (IacState.InUse.Alive.Outgoing.Launching) state2;
                Appearance appearance11 = launching2.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching2, null, null, appearance11.copy((261631 & 1) != 0 ? appearance11.callInits : null, (261631 & 2) != 0 ? appearance11.service : null, (261631 & 4) != 0 ? appearance11.screen : null, (261631 & 8) != 0 ? appearance11.app : null, (261631 & 16) != 0 ? appearance11.micPerm : null, (261631 & 32) != 0 ? appearance11.cameraPerm : null, (261631 & 64) != 0 ? appearance11.notifications : null, (261631 & 128) != 0 ? appearance11.ringingMode : null, (261631 & 256) != 0 ? appearance11.camera : null, (261631 & 512) != 0 ? appearance11.isGsmBusy : false, (261631 & 1024) != 0 ? appearance11.network : null, (261631 & 2048) != 0 ? appearance11.connectionQuality : null, (261631 & 4096) != 0 ? appearance11.power : null, (261631 & 8192) != 0 ? appearance11.storage : CallStorage.copy$default(appearance11.getStorage(), 0L, iacActionProcessing.getCurrentTime(), 1, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance11.isMiui : false, (261631 & 32768) != 0 ? appearance11.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance11.config : null, (261631 & 131072) != 0 ? appearance11.stringResources : null), 3, null);
            } else if (state2 instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                IacState.InUse.Alive.Outgoing.Resolving resolving3 = (IacState.InUse.Alive.Outgoing.Resolving) state2;
                Appearance appearance12 = resolving3.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving3, null, null, null, appearance12.copy((261631 & 1) != 0 ? appearance12.callInits : null, (261631 & 2) != 0 ? appearance12.service : null, (261631 & 4) != 0 ? appearance12.screen : null, (261631 & 8) != 0 ? appearance12.app : null, (261631 & 16) != 0 ? appearance12.micPerm : null, (261631 & 32) != 0 ? appearance12.cameraPerm : null, (261631 & 64) != 0 ? appearance12.notifications : null, (261631 & 128) != 0 ? appearance12.ringingMode : null, (261631 & 256) != 0 ? appearance12.camera : null, (261631 & 512) != 0 ? appearance12.isGsmBusy : false, (261631 & 1024) != 0 ? appearance12.network : null, (261631 & 2048) != 0 ? appearance12.connectionQuality : null, (261631 & 4096) != 0 ? appearance12.power : null, (261631 & 8192) != 0 ? appearance12.storage : CallStorage.copy$default(appearance12.getStorage(), 0L, iacActionProcessing.getCurrentTime(), 1, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance12.isMiui : false, (261631 & 32768) != 0 ? appearance12.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance12.config : null, (261631 & 131072) != 0 ? appearance12.stringResources : null), 7, null);
            } else if (state2 instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                IacState.InUse.Alive.Outgoing.Waiting waiting3 = (IacState.InUse.Alive.Outgoing.Waiting) state2;
                Appearance appearance13 = waiting3.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting3, null, null, appearance13.copy((261631 & 1) != 0 ? appearance13.callInits : null, (261631 & 2) != 0 ? appearance13.service : null, (261631 & 4) != 0 ? appearance13.screen : null, (261631 & 8) != 0 ? appearance13.app : null, (261631 & 16) != 0 ? appearance13.micPerm : null, (261631 & 32) != 0 ? appearance13.cameraPerm : null, (261631 & 64) != 0 ? appearance13.notifications : null, (261631 & 128) != 0 ? appearance13.ringingMode : null, (261631 & 256) != 0 ? appearance13.camera : null, (261631 & 512) != 0 ? appearance13.isGsmBusy : false, (261631 & 1024) != 0 ? appearance13.network : null, (261631 & 2048) != 0 ? appearance13.connectionQuality : null, (261631 & 4096) != 0 ? appearance13.power : null, (261631 & 8192) != 0 ? appearance13.storage : CallStorage.copy$default(appearance13.getStorage(), 0L, iacActionProcessing.getCurrentTime(), 1, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance13.isMiui : false, (261631 & 32768) != 0 ? appearance13.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance13.config : null, (261631 & 131072) != 0 ? appearance13.stringResources : null), 3, null);
            } else if (state2 instanceof IacState.InUse.Alive.Incoming.Waiting) {
                IacState.InUse.Alive.Incoming.Waiting waiting4 = (IacState.InUse.Alive.Incoming.Waiting) state2;
                Appearance appearance14 = waiting4.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting4, null, null, appearance14.copy((261631 & 1) != 0 ? appearance14.callInits : null, (261631 & 2) != 0 ? appearance14.service : null, (261631 & 4) != 0 ? appearance14.screen : null, (261631 & 8) != 0 ? appearance14.app : null, (261631 & 16) != 0 ? appearance14.micPerm : null, (261631 & 32) != 0 ? appearance14.cameraPerm : null, (261631 & 64) != 0 ? appearance14.notifications : null, (261631 & 128) != 0 ? appearance14.ringingMode : null, (261631 & 256) != 0 ? appearance14.camera : null, (261631 & 512) != 0 ? appearance14.isGsmBusy : false, (261631 & 1024) != 0 ? appearance14.network : null, (261631 & 2048) != 0 ? appearance14.connectionQuality : null, (261631 & 4096) != 0 ? appearance14.power : null, (261631 & 8192) != 0 ? appearance14.storage : CallStorage.copy$default(appearance14.getStorage(), 0L, iacActionProcessing.getCurrentTime(), 1, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance14.isMiui : false, (261631 & 32768) != 0 ? appearance14.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance14.config : null, (261631 & 131072) != 0 ? appearance14.stringResources : null), 3, null);
            } else if (state2 instanceof IacState.InUse.Alive.Incoming.Resolving) {
                IacState.InUse.Alive.Incoming.Resolving resolving4 = (IacState.InUse.Alive.Incoming.Resolving) state2;
                Appearance appearance15 = resolving4.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving4, null, null, null, appearance15.copy((261631 & 1) != 0 ? appearance15.callInits : null, (261631 & 2) != 0 ? appearance15.service : null, (261631 & 4) != 0 ? appearance15.screen : null, (261631 & 8) != 0 ? appearance15.app : null, (261631 & 16) != 0 ? appearance15.micPerm : null, (261631 & 32) != 0 ? appearance15.cameraPerm : null, (261631 & 64) != 0 ? appearance15.notifications : null, (261631 & 128) != 0 ? appearance15.ringingMode : null, (261631 & 256) != 0 ? appearance15.camera : null, (261631 & 512) != 0 ? appearance15.isGsmBusy : false, (261631 & 1024) != 0 ? appearance15.network : null, (261631 & 2048) != 0 ? appearance15.connectionQuality : null, (261631 & 4096) != 0 ? appearance15.power : null, (261631 & 8192) != 0 ? appearance15.storage : CallStorage.copy$default(appearance15.getStorage(), 0L, iacActionProcessing.getCurrentTime(), 1, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance15.isMiui : false, (261631 & 32768) != 0 ? appearance15.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance15.config : null, (261631 & 131072) != 0 ? appearance15.stringResources : null), 7, null);
            } else if (state2 instanceof IacState.InUse.Alive.Incoming.Accepting) {
                IacState.InUse.Alive.Incoming.Accepting accepting2 = (IacState.InUse.Alive.Incoming.Accepting) state2;
                Appearance appearance16 = accepting2.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting2, null, null, appearance16.copy((261631 & 1) != 0 ? appearance16.callInits : null, (261631 & 2) != 0 ? appearance16.service : null, (261631 & 4) != 0 ? appearance16.screen : null, (261631 & 8) != 0 ? appearance16.app : null, (261631 & 16) != 0 ? appearance16.micPerm : null, (261631 & 32) != 0 ? appearance16.cameraPerm : null, (261631 & 64) != 0 ? appearance16.notifications : null, (261631 & 128) != 0 ? appearance16.ringingMode : null, (261631 & 256) != 0 ? appearance16.camera : null, (261631 & 512) != 0 ? appearance16.isGsmBusy : false, (261631 & 1024) != 0 ? appearance16.network : null, (261631 & 2048) != 0 ? appearance16.connectionQuality : null, (261631 & 4096) != 0 ? appearance16.power : null, (261631 & 8192) != 0 ? appearance16.storage : CallStorage.copy$default(appearance16.getStorage(), 0L, iacActionProcessing.getCurrentTime(), 1, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance16.isMiui : false, (261631 & 32768) != 0 ? appearance16.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance16.config : null, (261631 & 131072) != 0 ? appearance16.stringResources : null), 3, null);
            } else if (state2 instanceof IacState.InUse.Alive.Talking) {
                IacState.InUse.Alive.Talking talking2 = (IacState.InUse.Alive.Talking) state2;
                Appearance appearance17 = talking2.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking2, null, null, appearance17.copy((261631 & 1) != 0 ? appearance17.callInits : null, (261631 & 2) != 0 ? appearance17.service : null, (261631 & 4) != 0 ? appearance17.screen : null, (261631 & 8) != 0 ? appearance17.app : null, (261631 & 16) != 0 ? appearance17.micPerm : null, (261631 & 32) != 0 ? appearance17.cameraPerm : null, (261631 & 64) != 0 ? appearance17.notifications : null, (261631 & 128) != 0 ? appearance17.ringingMode : null, (261631 & 256) != 0 ? appearance17.camera : null, (261631 & 512) != 0 ? appearance17.isGsmBusy : false, (261631 & 1024) != 0 ? appearance17.network : null, (261631 & 2048) != 0 ? appearance17.connectionQuality : null, (261631 & 4096) != 0 ? appearance17.power : null, (261631 & 8192) != 0 ? appearance17.storage : CallStorage.copy$default(appearance17.getStorage(), 0L, iacActionProcessing.getCurrentTime(), 1, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance17.isMiui : false, (261631 & 32768) != 0 ? appearance17.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance17.config : null, (261631 & 131072) != 0 ? appearance17.stringResources : null), 3, null);
            } else {
                if (!(state2 instanceof IacState.InUse.Finished)) {
                    throw new NoWhenBranchMatchedException();
                }
                IacState.InUse.Finished finished2 = (IacState.InUse.Finished) state2;
                Appearance appearance18 = finished2.getAppearance();
                iacStateCopy$default = IacState.InUse.Finished.copy$default(finished2, null, null, appearance18.copy((261631 & 1) != 0 ? appearance18.callInits : null, (261631 & 2) != 0 ? appearance18.service : null, (261631 & 4) != 0 ? appearance18.screen : null, (261631 & 8) != 0 ? appearance18.app : null, (261631 & 16) != 0 ? appearance18.micPerm : null, (261631 & 32) != 0 ? appearance18.cameraPerm : null, (261631 & 64) != 0 ? appearance18.notifications : null, (261631 & 128) != 0 ? appearance18.ringingMode : null, (261631 & 256) != 0 ? appearance18.camera : null, (261631 & 512) != 0 ? appearance18.isGsmBusy : false, (261631 & 1024) != 0 ? appearance18.network : null, (261631 & 2048) != 0 ? appearance18.connectionQuality : null, (261631 & 4096) != 0 ? appearance18.power : null, (261631 & 8192) != 0 ? appearance18.storage : CallStorage.copy$default(appearance18.getStorage(), 0L, iacActionProcessing.getCurrentTime(), 1, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance18.isMiui : false, (261631 & 32768) != 0 ? appearance18.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance18.config : null, (261631 & 131072) != 0 ? appearance18.stringResources : null), 3, null);
            }
            if (iacStateCopy$default == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse");
            }
            iacActionProcessing.plusAssign(out3, (IacState.InUse) iacStateCopy$default);
            return;
        }
        if (((IacState.InUse) iacActionProcessing.getState()).getCall().getMeta().getGsmLink() != null) {
            track4683(iacActionProcessing, AbstractC43973b.c.f414453b);
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), IacEvent.CallScreen.WaitBottomSheet.DisplayWaitGsmBottomSheet.INSTANCE);
            IacActionOutput out4 = iacActionProcessing.getOut();
            IacState state3 = iacActionProcessing.getState();
            if (state3 instanceof IacState.Idle) {
                IacState.Idle idle3 = (IacState.Idle) state3;
                Appearance appearance19 = idle3.getAppearance();
                iacStateCopy$default3 = IacState.Idle.copy$default(idle3, appearance19.copy((261631 & 1) != 0 ? appearance19.callInits : null, (261631 & 2) != 0 ? appearance19.service : null, (261631 & 4) != 0 ? appearance19.screen : null, (261631 & 8) != 0 ? appearance19.app : null, (261631 & 16) != 0 ? appearance19.micPerm : null, (261631 & 32) != 0 ? appearance19.cameraPerm : null, (261631 & 64) != 0 ? appearance19.notifications : null, (261631 & 128) != 0 ? appearance19.ringingMode : null, (261631 & 256) != 0 ? appearance19.camera : null, (261631 & 512) != 0 ? appearance19.isGsmBusy : false, (261631 & 1024) != 0 ? appearance19.network : null, (261631 & 2048) != 0 ? appearance19.connectionQuality : null, (261631 & 4096) != 0 ? appearance19.power : null, (261631 & 8192) != 0 ? appearance19.storage : CallStorage.copy$default(appearance19.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance19.isMiui : false, (261631 & 32768) != 0 ? appearance19.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance19.config : null, (261631 & 131072) != 0 ? appearance19.stringResources : null), null, 2, null);
            } else if (state3 instanceof IacState.InUse.Alive.Outgoing.Launching) {
                IacState.InUse.Alive.Outgoing.Launching launching3 = (IacState.InUse.Alive.Outgoing.Launching) state3;
                Appearance appearance20 = launching3.getAppearance();
                iacStateCopy$default3 = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching3, null, null, appearance20.copy((261631 & 1) != 0 ? appearance20.callInits : null, (261631 & 2) != 0 ? appearance20.service : null, (261631 & 4) != 0 ? appearance20.screen : null, (261631 & 8) != 0 ? appearance20.app : null, (261631 & 16) != 0 ? appearance20.micPerm : null, (261631 & 32) != 0 ? appearance20.cameraPerm : null, (261631 & 64) != 0 ? appearance20.notifications : null, (261631 & 128) != 0 ? appearance20.ringingMode : null, (261631 & 256) != 0 ? appearance20.camera : null, (261631 & 512) != 0 ? appearance20.isGsmBusy : false, (261631 & 1024) != 0 ? appearance20.network : null, (261631 & 2048) != 0 ? appearance20.connectionQuality : null, (261631 & 4096) != 0 ? appearance20.power : null, (261631 & 8192) != 0 ? appearance20.storage : CallStorage.copy$default(appearance20.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance20.isMiui : false, (261631 & 32768) != 0 ? appearance20.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance20.config : null, (261631 & 131072) != 0 ? appearance20.stringResources : null), 3, null);
            } else if (state3 instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                IacState.InUse.Alive.Outgoing.Resolving resolving5 = (IacState.InUse.Alive.Outgoing.Resolving) state3;
                Appearance appearance21 = resolving5.getAppearance();
                iacStateCopy$default3 = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving5, null, null, null, appearance21.copy((261631 & 1) != 0 ? appearance21.callInits : null, (261631 & 2) != 0 ? appearance21.service : null, (261631 & 4) != 0 ? appearance21.screen : null, (261631 & 8) != 0 ? appearance21.app : null, (261631 & 16) != 0 ? appearance21.micPerm : null, (261631 & 32) != 0 ? appearance21.cameraPerm : null, (261631 & 64) != 0 ? appearance21.notifications : null, (261631 & 128) != 0 ? appearance21.ringingMode : null, (261631 & 256) != 0 ? appearance21.camera : null, (261631 & 512) != 0 ? appearance21.isGsmBusy : false, (261631 & 1024) != 0 ? appearance21.network : null, (261631 & 2048) != 0 ? appearance21.connectionQuality : null, (261631 & 4096) != 0 ? appearance21.power : null, (261631 & 8192) != 0 ? appearance21.storage : CallStorage.copy$default(appearance21.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance21.isMiui : false, (261631 & 32768) != 0 ? appearance21.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance21.config : null, (261631 & 131072) != 0 ? appearance21.stringResources : null), 7, null);
            } else if (state3 instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                IacState.InUse.Alive.Outgoing.Waiting waiting5 = (IacState.InUse.Alive.Outgoing.Waiting) state3;
                Appearance appearance22 = waiting5.getAppearance();
                iacStateCopy$default3 = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting5, null, null, appearance22.copy((261631 & 1) != 0 ? appearance22.callInits : null, (261631 & 2) != 0 ? appearance22.service : null, (261631 & 4) != 0 ? appearance22.screen : null, (261631 & 8) != 0 ? appearance22.app : null, (261631 & 16) != 0 ? appearance22.micPerm : null, (261631 & 32) != 0 ? appearance22.cameraPerm : null, (261631 & 64) != 0 ? appearance22.notifications : null, (261631 & 128) != 0 ? appearance22.ringingMode : null, (261631 & 256) != 0 ? appearance22.camera : null, (261631 & 512) != 0 ? appearance22.isGsmBusy : false, (261631 & 1024) != 0 ? appearance22.network : null, (261631 & 2048) != 0 ? appearance22.connectionQuality : null, (261631 & 4096) != 0 ? appearance22.power : null, (261631 & 8192) != 0 ? appearance22.storage : CallStorage.copy$default(appearance22.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance22.isMiui : false, (261631 & 32768) != 0 ? appearance22.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance22.config : null, (261631 & 131072) != 0 ? appearance22.stringResources : null), 3, null);
            } else if (state3 instanceof IacState.InUse.Alive.Incoming.Waiting) {
                IacState.InUse.Alive.Incoming.Waiting waiting6 = (IacState.InUse.Alive.Incoming.Waiting) state3;
                Appearance appearance23 = waiting6.getAppearance();
                iacStateCopy$default3 = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting6, null, null, appearance23.copy((261631 & 1) != 0 ? appearance23.callInits : null, (261631 & 2) != 0 ? appearance23.service : null, (261631 & 4) != 0 ? appearance23.screen : null, (261631 & 8) != 0 ? appearance23.app : null, (261631 & 16) != 0 ? appearance23.micPerm : null, (261631 & 32) != 0 ? appearance23.cameraPerm : null, (261631 & 64) != 0 ? appearance23.notifications : null, (261631 & 128) != 0 ? appearance23.ringingMode : null, (261631 & 256) != 0 ? appearance23.camera : null, (261631 & 512) != 0 ? appearance23.isGsmBusy : false, (261631 & 1024) != 0 ? appearance23.network : null, (261631 & 2048) != 0 ? appearance23.connectionQuality : null, (261631 & 4096) != 0 ? appearance23.power : null, (261631 & 8192) != 0 ? appearance23.storage : CallStorage.copy$default(appearance23.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance23.isMiui : false, (261631 & 32768) != 0 ? appearance23.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance23.config : null, (261631 & 131072) != 0 ? appearance23.stringResources : null), 3, null);
            } else if (state3 instanceof IacState.InUse.Alive.Incoming.Resolving) {
                IacState.InUse.Alive.Incoming.Resolving resolving6 = (IacState.InUse.Alive.Incoming.Resolving) state3;
                Appearance appearance24 = resolving6.getAppearance();
                iacStateCopy$default3 = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving6, null, null, null, appearance24.copy((261631 & 1) != 0 ? appearance24.callInits : null, (261631 & 2) != 0 ? appearance24.service : null, (261631 & 4) != 0 ? appearance24.screen : null, (261631 & 8) != 0 ? appearance24.app : null, (261631 & 16) != 0 ? appearance24.micPerm : null, (261631 & 32) != 0 ? appearance24.cameraPerm : null, (261631 & 64) != 0 ? appearance24.notifications : null, (261631 & 128) != 0 ? appearance24.ringingMode : null, (261631 & 256) != 0 ? appearance24.camera : null, (261631 & 512) != 0 ? appearance24.isGsmBusy : false, (261631 & 1024) != 0 ? appearance24.network : null, (261631 & 2048) != 0 ? appearance24.connectionQuality : null, (261631 & 4096) != 0 ? appearance24.power : null, (261631 & 8192) != 0 ? appearance24.storage : CallStorage.copy$default(appearance24.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance24.isMiui : false, (261631 & 32768) != 0 ? appearance24.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance24.config : null, (261631 & 131072) != 0 ? appearance24.stringResources : null), 7, null);
            } else if (state3 instanceof IacState.InUse.Alive.Incoming.Accepting) {
                IacState.InUse.Alive.Incoming.Accepting accepting3 = (IacState.InUse.Alive.Incoming.Accepting) state3;
                Appearance appearance25 = accepting3.getAppearance();
                iacStateCopy$default3 = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting3, null, null, appearance25.copy((261631 & 1) != 0 ? appearance25.callInits : null, (261631 & 2) != 0 ? appearance25.service : null, (261631 & 4) != 0 ? appearance25.screen : null, (261631 & 8) != 0 ? appearance25.app : null, (261631 & 16) != 0 ? appearance25.micPerm : null, (261631 & 32) != 0 ? appearance25.cameraPerm : null, (261631 & 64) != 0 ? appearance25.notifications : null, (261631 & 128) != 0 ? appearance25.ringingMode : null, (261631 & 256) != 0 ? appearance25.camera : null, (261631 & 512) != 0 ? appearance25.isGsmBusy : false, (261631 & 1024) != 0 ? appearance25.network : null, (261631 & 2048) != 0 ? appearance25.connectionQuality : null, (261631 & 4096) != 0 ? appearance25.power : null, (261631 & 8192) != 0 ? appearance25.storage : CallStorage.copy$default(appearance25.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance25.isMiui : false, (261631 & 32768) != 0 ? appearance25.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance25.config : null, (261631 & 131072) != 0 ? appearance25.stringResources : null), 3, null);
            } else if (state3 instanceof IacState.InUse.Alive.Talking) {
                IacState.InUse.Alive.Talking talking3 = (IacState.InUse.Alive.Talking) state3;
                Appearance appearance26 = talking3.getAppearance();
                iacStateCopy$default3 = IacState.InUse.Alive.Talking.copy$default(talking3, null, null, appearance26.copy((261631 & 1) != 0 ? appearance26.callInits : null, (261631 & 2) != 0 ? appearance26.service : null, (261631 & 4) != 0 ? appearance26.screen : null, (261631 & 8) != 0 ? appearance26.app : null, (261631 & 16) != 0 ? appearance26.micPerm : null, (261631 & 32) != 0 ? appearance26.cameraPerm : null, (261631 & 64) != 0 ? appearance26.notifications : null, (261631 & 128) != 0 ? appearance26.ringingMode : null, (261631 & 256) != 0 ? appearance26.camera : null, (261631 & 512) != 0 ? appearance26.isGsmBusy : false, (261631 & 1024) != 0 ? appearance26.network : null, (261631 & 2048) != 0 ? appearance26.connectionQuality : null, (261631 & 4096) != 0 ? appearance26.power : null, (261631 & 8192) != 0 ? appearance26.storage : CallStorage.copy$default(appearance26.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance26.isMiui : false, (261631 & 32768) != 0 ? appearance26.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance26.config : null, (261631 & 131072) != 0 ? appearance26.stringResources : null), 3, null);
            } else {
                if (!(state3 instanceof IacState.InUse.Finished)) {
                    throw new NoWhenBranchMatchedException();
                }
                IacState.InUse.Finished finished3 = (IacState.InUse.Finished) state3;
                Appearance appearance27 = finished3.getAppearance();
                iacStateCopy$default3 = IacState.InUse.Finished.copy$default(finished3, null, null, appearance27.copy((261631 & 1) != 0 ? appearance27.callInits : null, (261631 & 2) != 0 ? appearance27.service : null, (261631 & 4) != 0 ? appearance27.screen : null, (261631 & 8) != 0 ? appearance27.app : null, (261631 & 16) != 0 ? appearance27.micPerm : null, (261631 & 32) != 0 ? appearance27.cameraPerm : null, (261631 & 64) != 0 ? appearance27.notifications : null, (261631 & 128) != 0 ? appearance27.ringingMode : null, (261631 & 256) != 0 ? appearance27.camera : null, (261631 & 512) != 0 ? appearance27.isGsmBusy : false, (261631 & 1024) != 0 ? appearance27.network : null, (261631 & 2048) != 0 ? appearance27.connectionQuality : null, (261631 & 4096) != 0 ? appearance27.power : null, (261631 & 8192) != 0 ? appearance27.storage : CallStorage.copy$default(appearance27.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance27.isMiui : false, (261631 & 32768) != 0 ? appearance27.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance27.config : null, (261631 & 131072) != 0 ? appearance27.stringResources : null), 3, null);
            }
            if (iacStateCopy$default3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse");
            }
            iacActionProcessing.plusAssign(out4, (IacState.InUse) iacStateCopy$default3);
            return;
        }
        if (isLessThenOneDayAgo(iacActionProcessing, iacActionProcessing.getState().getAppearance().getStorage().getWaitDialingBottomSheetLastShowTime())) {
            sendHangupToSdk(iacActionProcessing, AbstractC43973b.C11823b.f414452b);
            return;
        }
        track4683(iacActionProcessing, AbstractC43973b.d.f414454b);
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), IacEvent.CallScreen.WaitBottomSheet.DisplayWaitDialingBottomSheet.INSTANCE);
        IacActionOutput out5 = iacActionProcessing.getOut();
        IacState state4 = iacActionProcessing.getState();
        if (state4 instanceof IacState.Idle) {
            IacState.Idle idle4 = (IacState.Idle) state4;
            Appearance appearance28 = idle4.getAppearance();
            iacStateCopy$default2 = IacState.Idle.copy$default(idle4, appearance28.copy((261631 & 1) != 0 ? appearance28.callInits : null, (261631 & 2) != 0 ? appearance28.service : null, (261631 & 4) != 0 ? appearance28.screen : null, (261631 & 8) != 0 ? appearance28.app : null, (261631 & 16) != 0 ? appearance28.micPerm : null, (261631 & 32) != 0 ? appearance28.cameraPerm : null, (261631 & 64) != 0 ? appearance28.notifications : null, (261631 & 128) != 0 ? appearance28.ringingMode : null, (261631 & 256) != 0 ? appearance28.camera : null, (261631 & 512) != 0 ? appearance28.isGsmBusy : false, (261631 & 1024) != 0 ? appearance28.network : null, (261631 & 2048) != 0 ? appearance28.connectionQuality : null, (261631 & 4096) != 0 ? appearance28.power : null, (261631 & 8192) != 0 ? appearance28.storage : CallStorage.copy$default(appearance28.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance28.isMiui : false, (261631 & 32768) != 0 ? appearance28.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance28.config : null, (261631 & 131072) != 0 ? appearance28.stringResources : null), null, 2, null);
        } else if (state4 instanceof IacState.InUse.Alive.Outgoing.Launching) {
            IacState.InUse.Alive.Outgoing.Launching launching4 = (IacState.InUse.Alive.Outgoing.Launching) state4;
            Appearance appearance29 = launching4.getAppearance();
            iacStateCopy$default2 = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching4, null, null, appearance29.copy((261631 & 1) != 0 ? appearance29.callInits : null, (261631 & 2) != 0 ? appearance29.service : null, (261631 & 4) != 0 ? appearance29.screen : null, (261631 & 8) != 0 ? appearance29.app : null, (261631 & 16) != 0 ? appearance29.micPerm : null, (261631 & 32) != 0 ? appearance29.cameraPerm : null, (261631 & 64) != 0 ? appearance29.notifications : null, (261631 & 128) != 0 ? appearance29.ringingMode : null, (261631 & 256) != 0 ? appearance29.camera : null, (261631 & 512) != 0 ? appearance29.isGsmBusy : false, (261631 & 1024) != 0 ? appearance29.network : null, (261631 & 2048) != 0 ? appearance29.connectionQuality : null, (261631 & 4096) != 0 ? appearance29.power : null, (261631 & 8192) != 0 ? appearance29.storage : CallStorage.copy$default(appearance29.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance29.isMiui : false, (261631 & 32768) != 0 ? appearance29.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance29.config : null, (261631 & 131072) != 0 ? appearance29.stringResources : null), 3, null);
        } else if (state4 instanceof IacState.InUse.Alive.Outgoing.Resolving) {
            IacState.InUse.Alive.Outgoing.Resolving resolving7 = (IacState.InUse.Alive.Outgoing.Resolving) state4;
            Appearance appearance30 = resolving7.getAppearance();
            iacStateCopy$default2 = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving7, null, null, null, appearance30.copy((261631 & 1) != 0 ? appearance30.callInits : null, (261631 & 2) != 0 ? appearance30.service : null, (261631 & 4) != 0 ? appearance30.screen : null, (261631 & 8) != 0 ? appearance30.app : null, (261631 & 16) != 0 ? appearance30.micPerm : null, (261631 & 32) != 0 ? appearance30.cameraPerm : null, (261631 & 64) != 0 ? appearance30.notifications : null, (261631 & 128) != 0 ? appearance30.ringingMode : null, (261631 & 256) != 0 ? appearance30.camera : null, (261631 & 512) != 0 ? appearance30.isGsmBusy : false, (261631 & 1024) != 0 ? appearance30.network : null, (261631 & 2048) != 0 ? appearance30.connectionQuality : null, (261631 & 4096) != 0 ? appearance30.power : null, (261631 & 8192) != 0 ? appearance30.storage : CallStorage.copy$default(appearance30.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance30.isMiui : false, (261631 & 32768) != 0 ? appearance30.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance30.config : null, (261631 & 131072) != 0 ? appearance30.stringResources : null), 7, null);
        } else if (state4 instanceof IacState.InUse.Alive.Outgoing.Waiting) {
            IacState.InUse.Alive.Outgoing.Waiting waiting7 = (IacState.InUse.Alive.Outgoing.Waiting) state4;
            Appearance appearance31 = waiting7.getAppearance();
            iacStateCopy$default2 = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting7, null, null, appearance31.copy((261631 & 1) != 0 ? appearance31.callInits : null, (261631 & 2) != 0 ? appearance31.service : null, (261631 & 4) != 0 ? appearance31.screen : null, (261631 & 8) != 0 ? appearance31.app : null, (261631 & 16) != 0 ? appearance31.micPerm : null, (261631 & 32) != 0 ? appearance31.cameraPerm : null, (261631 & 64) != 0 ? appearance31.notifications : null, (261631 & 128) != 0 ? appearance31.ringingMode : null, (261631 & 256) != 0 ? appearance31.camera : null, (261631 & 512) != 0 ? appearance31.isGsmBusy : false, (261631 & 1024) != 0 ? appearance31.network : null, (261631 & 2048) != 0 ? appearance31.connectionQuality : null, (261631 & 4096) != 0 ? appearance31.power : null, (261631 & 8192) != 0 ? appearance31.storage : CallStorage.copy$default(appearance31.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance31.isMiui : false, (261631 & 32768) != 0 ? appearance31.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance31.config : null, (261631 & 131072) != 0 ? appearance31.stringResources : null), 3, null);
        } else if (state4 instanceof IacState.InUse.Alive.Incoming.Waiting) {
            IacState.InUse.Alive.Incoming.Waiting waiting8 = (IacState.InUse.Alive.Incoming.Waiting) state4;
            Appearance appearance32 = waiting8.getAppearance();
            iacStateCopy$default2 = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting8, null, null, appearance32.copy((261631 & 1) != 0 ? appearance32.callInits : null, (261631 & 2) != 0 ? appearance32.service : null, (261631 & 4) != 0 ? appearance32.screen : null, (261631 & 8) != 0 ? appearance32.app : null, (261631 & 16) != 0 ? appearance32.micPerm : null, (261631 & 32) != 0 ? appearance32.cameraPerm : null, (261631 & 64) != 0 ? appearance32.notifications : null, (261631 & 128) != 0 ? appearance32.ringingMode : null, (261631 & 256) != 0 ? appearance32.camera : null, (261631 & 512) != 0 ? appearance32.isGsmBusy : false, (261631 & 1024) != 0 ? appearance32.network : null, (261631 & 2048) != 0 ? appearance32.connectionQuality : null, (261631 & 4096) != 0 ? appearance32.power : null, (261631 & 8192) != 0 ? appearance32.storage : CallStorage.copy$default(appearance32.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance32.isMiui : false, (261631 & 32768) != 0 ? appearance32.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance32.config : null, (261631 & 131072) != 0 ? appearance32.stringResources : null), 3, null);
        } else if (state4 instanceof IacState.InUse.Alive.Incoming.Resolving) {
            IacState.InUse.Alive.Incoming.Resolving resolving8 = (IacState.InUse.Alive.Incoming.Resolving) state4;
            Appearance appearance33 = resolving8.getAppearance();
            iacStateCopy$default2 = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving8, null, null, null, appearance33.copy((261631 & 1) != 0 ? appearance33.callInits : null, (261631 & 2) != 0 ? appearance33.service : null, (261631 & 4) != 0 ? appearance33.screen : null, (261631 & 8) != 0 ? appearance33.app : null, (261631 & 16) != 0 ? appearance33.micPerm : null, (261631 & 32) != 0 ? appearance33.cameraPerm : null, (261631 & 64) != 0 ? appearance33.notifications : null, (261631 & 128) != 0 ? appearance33.ringingMode : null, (261631 & 256) != 0 ? appearance33.camera : null, (261631 & 512) != 0 ? appearance33.isGsmBusy : false, (261631 & 1024) != 0 ? appearance33.network : null, (261631 & 2048) != 0 ? appearance33.connectionQuality : null, (261631 & 4096) != 0 ? appearance33.power : null, (261631 & 8192) != 0 ? appearance33.storage : CallStorage.copy$default(appearance33.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance33.isMiui : false, (261631 & 32768) != 0 ? appearance33.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance33.config : null, (261631 & 131072) != 0 ? appearance33.stringResources : null), 7, null);
        } else if (state4 instanceof IacState.InUse.Alive.Incoming.Accepting) {
            IacState.InUse.Alive.Incoming.Accepting accepting4 = (IacState.InUse.Alive.Incoming.Accepting) state4;
            Appearance appearance34 = accepting4.getAppearance();
            iacStateCopy$default2 = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting4, null, null, appearance34.copy((261631 & 1) != 0 ? appearance34.callInits : null, (261631 & 2) != 0 ? appearance34.service : null, (261631 & 4) != 0 ? appearance34.screen : null, (261631 & 8) != 0 ? appearance34.app : null, (261631 & 16) != 0 ? appearance34.micPerm : null, (261631 & 32) != 0 ? appearance34.cameraPerm : null, (261631 & 64) != 0 ? appearance34.notifications : null, (261631 & 128) != 0 ? appearance34.ringingMode : null, (261631 & 256) != 0 ? appearance34.camera : null, (261631 & 512) != 0 ? appearance34.isGsmBusy : false, (261631 & 1024) != 0 ? appearance34.network : null, (261631 & 2048) != 0 ? appearance34.connectionQuality : null, (261631 & 4096) != 0 ? appearance34.power : null, (261631 & 8192) != 0 ? appearance34.storage : CallStorage.copy$default(appearance34.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance34.isMiui : false, (261631 & 32768) != 0 ? appearance34.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance34.config : null, (261631 & 131072) != 0 ? appearance34.stringResources : null), 3, null);
        } else if (state4 instanceof IacState.InUse.Alive.Talking) {
            IacState.InUse.Alive.Talking talking4 = (IacState.InUse.Alive.Talking) state4;
            Appearance appearance35 = talking4.getAppearance();
            iacStateCopy$default2 = IacState.InUse.Alive.Talking.copy$default(talking4, null, null, appearance35.copy((261631 & 1) != 0 ? appearance35.callInits : null, (261631 & 2) != 0 ? appearance35.service : null, (261631 & 4) != 0 ? appearance35.screen : null, (261631 & 8) != 0 ? appearance35.app : null, (261631 & 16) != 0 ? appearance35.micPerm : null, (261631 & 32) != 0 ? appearance35.cameraPerm : null, (261631 & 64) != 0 ? appearance35.notifications : null, (261631 & 128) != 0 ? appearance35.ringingMode : null, (261631 & 256) != 0 ? appearance35.camera : null, (261631 & 512) != 0 ? appearance35.isGsmBusy : false, (261631 & 1024) != 0 ? appearance35.network : null, (261631 & 2048) != 0 ? appearance35.connectionQuality : null, (261631 & 4096) != 0 ? appearance35.power : null, (261631 & 8192) != 0 ? appearance35.storage : CallStorage.copy$default(appearance35.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance35.isMiui : false, (261631 & 32768) != 0 ? appearance35.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance35.config : null, (261631 & 131072) != 0 ? appearance35.stringResources : null), 3, null);
        } else {
            if (!(state4 instanceof IacState.InUse.Finished)) {
                throw new NoWhenBranchMatchedException();
            }
            IacState.InUse.Finished finished4 = (IacState.InUse.Finished) state4;
            Appearance appearance36 = finished4.getAppearance();
            iacStateCopy$default2 = IacState.InUse.Finished.copy$default(finished4, null, null, appearance36.copy((261631 & 1) != 0 ? appearance36.callInits : null, (261631 & 2) != 0 ? appearance36.service : null, (261631 & 4) != 0 ? appearance36.screen : null, (261631 & 8) != 0 ? appearance36.app : null, (261631 & 16) != 0 ? appearance36.micPerm : null, (261631 & 32) != 0 ? appearance36.cameraPerm : null, (261631 & 64) != 0 ? appearance36.notifications : null, (261631 & 128) != 0 ? appearance36.ringingMode : null, (261631 & 256) != 0 ? appearance36.camera : null, (261631 & 512) != 0 ? appearance36.isGsmBusy : false, (261631 & 1024) != 0 ? appearance36.network : null, (261631 & 2048) != 0 ? appearance36.connectionQuality : null, (261631 & 4096) != 0 ? appearance36.power : null, (261631 & 8192) != 0 ? appearance36.storage : CallStorage.copy$default(appearance36.getStorage(), iacActionProcessing.getCurrentTime(), 0L, 2, null), (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance36.isMiui : false, (261631 & 32768) != 0 ? appearance36.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance36.config : null, (261631 & 131072) != 0 ? appearance36.stringResources : null), 3, null);
        }
        if (iacStateCopy$default2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse");
        }
        iacActionProcessing.plusAssign(out5, (IacState.InUse) iacStateCopy$default2);
    }

    private final void track4683(IacActionProcessing iacActionProcessing, AbstractC43973b abstractC43973b) {
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.Analytics.TrackRedButtonClickedEvent4683(((IacState.InUse) iacActionProcessing.getState()).getCallId(), ((IacState.InUse) iacActionProcessing.getState()).getCall().getMeta().getScenario(), abstractC43973b));
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final FromArg getFrom() {
        return this.from;
    }

    @k
    public final OnHangupClickedAction copy(@k FromArg from) {
        return new OnHangupClickedAction(from);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnHangupClickedAction) && L.f(this.from, ((OnHangupClickedAction) other).from);
    }

    @k
    public final FromArg getFrom() {
        return this.from;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return this.from.hashCode();
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        FromArg fromArg = this.from;
        if (L.f(fromArg, FromCallScreen.INSTANCE)) {
            processHangupFromCallScreen(iacActionProcessing);
        } else if (fromArg instanceof FromNotification) {
            processHangupFromNotification(iacActionProcessing, ((FromNotification) this.from).getCallId());
        }
    }

    @k
    public String toString() {
        return "OnHangupClickedAction(from=" + this.from + ')';
    }
}
