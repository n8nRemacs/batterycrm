package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.telecom;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.TerminateCallInAvCallsAndTelecomAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.Appearance;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.i;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.q;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: OnAddCallCommandResultTelecomAction.kt */
@P
@s0
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J6\u0010\u0015\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\b\u0010\u0014¨\u0006$"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/telecom/OnAddCallCommandResultTelecomAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "", "t", "", "isRealTelecomImpl", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Boolean;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Boolean;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/telecom/OnAddCallCommandResultTelecomAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallId", "Ljava/lang/Throwable;", "getT", "Ljava/lang/Boolean;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnAddCallCommandResultTelecomAction implements IacAction {
    public static final int $stable = 8;

    @k
    private final String callId;

    @l
    private final Boolean isRealTelecomImpl;

    @l
    private final Throwable t;

    public OnAddCallCommandResultTelecomAction(@k String str, @l Throwable th2, @l Boolean bool) {
        this.callId = str;
        this.t = th2;
        this.isRealTelecomImpl = bool;
    }

    public static /* synthetic */ OnAddCallCommandResultTelecomAction copy$default(OnAddCallCommandResultTelecomAction onAddCallCommandResultTelecomAction, String str, Throwable th2, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = onAddCallCommandResultTelecomAction.callId;
        }
        if ((i12 & 2) != 0) {
            th2 = onAddCallCommandResultTelecomAction.t;
        }
        if ((i12 & 4) != 0) {
            bool = onAddCallCommandResultTelecomAction.isRealTelecomImpl;
        }
        return onAddCallCommandResultTelecomAction.copy(str, th2, bool);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Throwable getT() {
        return this.t;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getIsRealTelecomImpl() {
        return this.isRealTelecomImpl;
    }

    @k
    public final OnAddCallCommandResultTelecomAction copy(@k String callId, @l Throwable t12, @l Boolean isRealTelecomImpl) {
        return new OnAddCallCommandResultTelecomAction(callId, t12, isRealTelecomImpl);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnAddCallCommandResultTelecomAction)) {
            return false;
        }
        OnAddCallCommandResultTelecomAction onAddCallCommandResultTelecomAction = (OnAddCallCommandResultTelecomAction) other;
        return L.f(this.callId, onAddCallCommandResultTelecomAction.callId) && L.f(this.t, onAddCallCommandResultTelecomAction.t) && L.f(this.isRealTelecomImpl, onAddCallCommandResultTelecomAction.isRealTelecomImpl);
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
    public final Throwable getT() {
        return this.t;
    }

    public int hashCode() {
        int iHashCode = this.callId.hashCode() * 31;
        Throwable th2 = this.t;
        int iHashCode2 = (iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31;
        Boolean bool = this.isRealTelecomImpl;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @l
    public final Boolean isRealTelecomImpl() {
        return this.isRealTelecomImpl;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        IacState iacStateCopy$default;
        IacState iacStateCopy$default2;
        if (this.t != null) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new q("Error in outgoing telecom.addCall", this.t));
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.Analytics.TrackStatsdCount("iac.dialer.init_fail.add_telecom_error"));
            IacActionOutput out = iacActionProcessing.getOut();
            IacState state = iacActionProcessing.getState();
            String str = this.callId;
            if (state instanceof IacState.Idle) {
                IacState.Idle idle = (IacState.Idle) state;
                Appearance appearance = idle.getAppearance();
                iacStateCopy$default2 = IacState.Idle.copy$default(idle, appearance.copy((261631 & 1) != 0 ? appearance.callInits : P0.i(appearance.getCallInits(), str), (261631 & 2) != 0 ? appearance.service : null, (261631 & 4) != 0 ? appearance.screen : null, (261631 & 8) != 0 ? appearance.app : null, (261631 & 16) != 0 ? appearance.micPerm : null, (261631 & 32) != 0 ? appearance.cameraPerm : null, (261631 & 64) != 0 ? appearance.notifications : null, (261631 & 128) != 0 ? appearance.ringingMode : null, (261631 & 256) != 0 ? appearance.camera : null, (261631 & 512) != 0 ? appearance.isGsmBusy : false, (261631 & 1024) != 0 ? appearance.network : null, (261631 & 2048) != 0 ? appearance.connectionQuality : null, (261631 & 4096) != 0 ? appearance.power : null, (261631 & 8192) != 0 ? appearance.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance.isMiui : false, (261631 & 32768) != 0 ? appearance.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance.config : null, (261631 & 131072) != 0 ? appearance.stringResources : null), null, 2, null);
            } else if (state instanceof IacState.InUse.Alive.Outgoing.Launching) {
                IacState.InUse.Alive.Outgoing.Launching launching = (IacState.InUse.Alive.Outgoing.Launching) state;
                Appearance appearance2 = launching.getAppearance();
                iacStateCopy$default2 = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching, null, null, appearance2.copy((261631 & 1) != 0 ? appearance2.callInits : P0.i(appearance2.getCallInits(), str), (261631 & 2) != 0 ? appearance2.service : null, (261631 & 4) != 0 ? appearance2.screen : null, (261631 & 8) != 0 ? appearance2.app : null, (261631 & 16) != 0 ? appearance2.micPerm : null, (261631 & 32) != 0 ? appearance2.cameraPerm : null, (261631 & 64) != 0 ? appearance2.notifications : null, (261631 & 128) != 0 ? appearance2.ringingMode : null, (261631 & 256) != 0 ? appearance2.camera : null, (261631 & 512) != 0 ? appearance2.isGsmBusy : false, (261631 & 1024) != 0 ? appearance2.network : null, (261631 & 2048) != 0 ? appearance2.connectionQuality : null, (261631 & 4096) != 0 ? appearance2.power : null, (261631 & 8192) != 0 ? appearance2.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance2.isMiui : false, (261631 & 32768) != 0 ? appearance2.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance2.config : null, (261631 & 131072) != 0 ? appearance2.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                IacState.InUse.Alive.Outgoing.Resolving resolving = (IacState.InUse.Alive.Outgoing.Resolving) state;
                Appearance appearance3 = resolving.getAppearance();
                iacStateCopy$default2 = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving, null, null, null, appearance3.copy((261631 & 1) != 0 ? appearance3.callInits : P0.i(appearance3.getCallInits(), str), (261631 & 2) != 0 ? appearance3.service : null, (261631 & 4) != 0 ? appearance3.screen : null, (261631 & 8) != 0 ? appearance3.app : null, (261631 & 16) != 0 ? appearance3.micPerm : null, (261631 & 32) != 0 ? appearance3.cameraPerm : null, (261631 & 64) != 0 ? appearance3.notifications : null, (261631 & 128) != 0 ? appearance3.ringingMode : null, (261631 & 256) != 0 ? appearance3.camera : null, (261631 & 512) != 0 ? appearance3.isGsmBusy : false, (261631 & 1024) != 0 ? appearance3.network : null, (261631 & 2048) != 0 ? appearance3.connectionQuality : null, (261631 & 4096) != 0 ? appearance3.power : null, (261631 & 8192) != 0 ? appearance3.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance3.isMiui : false, (261631 & 32768) != 0 ? appearance3.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance3.config : null, (261631 & 131072) != 0 ? appearance3.stringResources : null), 7, null);
            } else if (state instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                IacState.InUse.Alive.Outgoing.Waiting waiting = (IacState.InUse.Alive.Outgoing.Waiting) state;
                Appearance appearance4 = waiting.getAppearance();
                iacStateCopy$default2 = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting, null, null, appearance4.copy((261631 & 1) != 0 ? appearance4.callInits : P0.i(appearance4.getCallInits(), str), (261631 & 2) != 0 ? appearance4.service : null, (261631 & 4) != 0 ? appearance4.screen : null, (261631 & 8) != 0 ? appearance4.app : null, (261631 & 16) != 0 ? appearance4.micPerm : null, (261631 & 32) != 0 ? appearance4.cameraPerm : null, (261631 & 64) != 0 ? appearance4.notifications : null, (261631 & 128) != 0 ? appearance4.ringingMode : null, (261631 & 256) != 0 ? appearance4.camera : null, (261631 & 512) != 0 ? appearance4.isGsmBusy : false, (261631 & 1024) != 0 ? appearance4.network : null, (261631 & 2048) != 0 ? appearance4.connectionQuality : null, (261631 & 4096) != 0 ? appearance4.power : null, (261631 & 8192) != 0 ? appearance4.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance4.isMiui : false, (261631 & 32768) != 0 ? appearance4.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance4.config : null, (261631 & 131072) != 0 ? appearance4.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Incoming.Waiting) {
                IacState.InUse.Alive.Incoming.Waiting waiting2 = (IacState.InUse.Alive.Incoming.Waiting) state;
                Appearance appearance5 = waiting2.getAppearance();
                iacStateCopy$default2 = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting2, null, null, appearance5.copy((261631 & 1) != 0 ? appearance5.callInits : P0.i(appearance5.getCallInits(), str), (261631 & 2) != 0 ? appearance5.service : null, (261631 & 4) != 0 ? appearance5.screen : null, (261631 & 8) != 0 ? appearance5.app : null, (261631 & 16) != 0 ? appearance5.micPerm : null, (261631 & 32) != 0 ? appearance5.cameraPerm : null, (261631 & 64) != 0 ? appearance5.notifications : null, (261631 & 128) != 0 ? appearance5.ringingMode : null, (261631 & 256) != 0 ? appearance5.camera : null, (261631 & 512) != 0 ? appearance5.isGsmBusy : false, (261631 & 1024) != 0 ? appearance5.network : null, (261631 & 2048) != 0 ? appearance5.connectionQuality : null, (261631 & 4096) != 0 ? appearance5.power : null, (261631 & 8192) != 0 ? appearance5.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance5.isMiui : false, (261631 & 32768) != 0 ? appearance5.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance5.config : null, (261631 & 131072) != 0 ? appearance5.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Incoming.Resolving) {
                IacState.InUse.Alive.Incoming.Resolving resolving2 = (IacState.InUse.Alive.Incoming.Resolving) state;
                Appearance appearance6 = resolving2.getAppearance();
                iacStateCopy$default2 = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving2, null, null, null, appearance6.copy((261631 & 1) != 0 ? appearance6.callInits : P0.i(appearance6.getCallInits(), str), (261631 & 2) != 0 ? appearance6.service : null, (261631 & 4) != 0 ? appearance6.screen : null, (261631 & 8) != 0 ? appearance6.app : null, (261631 & 16) != 0 ? appearance6.micPerm : null, (261631 & 32) != 0 ? appearance6.cameraPerm : null, (261631 & 64) != 0 ? appearance6.notifications : null, (261631 & 128) != 0 ? appearance6.ringingMode : null, (261631 & 256) != 0 ? appearance6.camera : null, (261631 & 512) != 0 ? appearance6.isGsmBusy : false, (261631 & 1024) != 0 ? appearance6.network : null, (261631 & 2048) != 0 ? appearance6.connectionQuality : null, (261631 & 4096) != 0 ? appearance6.power : null, (261631 & 8192) != 0 ? appearance6.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance6.isMiui : false, (261631 & 32768) != 0 ? appearance6.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance6.config : null, (261631 & 131072) != 0 ? appearance6.stringResources : null), 7, null);
            } else if (state instanceof IacState.InUse.Alive.Incoming.Accepting) {
                IacState.InUse.Alive.Incoming.Accepting accepting = (IacState.InUse.Alive.Incoming.Accepting) state;
                Appearance appearance7 = accepting.getAppearance();
                iacStateCopy$default2 = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting, null, null, appearance7.copy((261631 & 1) != 0 ? appearance7.callInits : P0.i(appearance7.getCallInits(), str), (261631 & 2) != 0 ? appearance7.service : null, (261631 & 4) != 0 ? appearance7.screen : null, (261631 & 8) != 0 ? appearance7.app : null, (261631 & 16) != 0 ? appearance7.micPerm : null, (261631 & 32) != 0 ? appearance7.cameraPerm : null, (261631 & 64) != 0 ? appearance7.notifications : null, (261631 & 128) != 0 ? appearance7.ringingMode : null, (261631 & 256) != 0 ? appearance7.camera : null, (261631 & 512) != 0 ? appearance7.isGsmBusy : false, (261631 & 1024) != 0 ? appearance7.network : null, (261631 & 2048) != 0 ? appearance7.connectionQuality : null, (261631 & 4096) != 0 ? appearance7.power : null, (261631 & 8192) != 0 ? appearance7.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance7.isMiui : false, (261631 & 32768) != 0 ? appearance7.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance7.config : null, (261631 & 131072) != 0 ? appearance7.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Talking) {
                IacState.InUse.Alive.Talking talking = (IacState.InUse.Alive.Talking) state;
                Appearance appearance8 = talking.getAppearance();
                iacStateCopy$default2 = IacState.InUse.Alive.Talking.copy$default(talking, null, null, appearance8.copy((261631 & 1) != 0 ? appearance8.callInits : P0.i(appearance8.getCallInits(), str), (261631 & 2) != 0 ? appearance8.service : null, (261631 & 4) != 0 ? appearance8.screen : null, (261631 & 8) != 0 ? appearance8.app : null, (261631 & 16) != 0 ? appearance8.micPerm : null, (261631 & 32) != 0 ? appearance8.cameraPerm : null, (261631 & 64) != 0 ? appearance8.notifications : null, (261631 & 128) != 0 ? appearance8.ringingMode : null, (261631 & 256) != 0 ? appearance8.camera : null, (261631 & 512) != 0 ? appearance8.isGsmBusy : false, (261631 & 1024) != 0 ? appearance8.network : null, (261631 & 2048) != 0 ? appearance8.connectionQuality : null, (261631 & 4096) != 0 ? appearance8.power : null, (261631 & 8192) != 0 ? appearance8.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance8.isMiui : false, (261631 & 32768) != 0 ? appearance8.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance8.config : null, (261631 & 131072) != 0 ? appearance8.stringResources : null), 3, null);
            } else {
                if (!(state instanceof IacState.InUse.Finished)) {
                    throw new NoWhenBranchMatchedException();
                }
                IacState.InUse.Finished finished = (IacState.InUse.Finished) state;
                Appearance appearance9 = finished.getAppearance();
                iacStateCopy$default2 = IacState.InUse.Finished.copy$default(finished, null, null, appearance9.copy((261631 & 1) != 0 ? appearance9.callInits : P0.i(appearance9.getCallInits(), str), (261631 & 2) != 0 ? appearance9.service : null, (261631 & 4) != 0 ? appearance9.screen : null, (261631 & 8) != 0 ? appearance9.app : null, (261631 & 16) != 0 ? appearance9.micPerm : null, (261631 & 32) != 0 ? appearance9.cameraPerm : null, (261631 & 64) != 0 ? appearance9.notifications : null, (261631 & 128) != 0 ? appearance9.ringingMode : null, (261631 & 256) != 0 ? appearance9.camera : null, (261631 & 512) != 0 ? appearance9.isGsmBusy : false, (261631 & 1024) != 0 ? appearance9.network : null, (261631 & 2048) != 0 ? appearance9.connectionQuality : null, (261631 & 4096) != 0 ? appearance9.power : null, (261631 & 8192) != 0 ? appearance9.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance9.isMiui : false, (261631 & 32768) != 0 ? appearance9.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance9.config : null, (261631 & 131072) != 0 ? appearance9.stringResources : null), 3, null);
            }
            if (iacStateCopy$default2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState");
            }
            iacActionProcessing.plusAssign(out, iacStateCopy$default2);
            return;
        }
        CallInit callInitA = i.a(iacActionProcessing.getState(), this.callId);
        if (callInitA == null) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new TerminateCallInAvCallsAndTelecomAction(getName(), this.callId, null, 4, null));
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.Analytics.TrackStatsdCount("iac.dialer.init_fail.call_init_not_found." + getName()));
            return;
        }
        if (iacActionProcessing.getState().getAppearance().isGsmBusy() && !L.f(this.isRealTelecomImpl, Boolean.TRUE)) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new TerminateCallInAvCallsAndTelecomAction(getName(), this.callId, null, 4, null));
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new r("Can't start " + callInitA.getDirection() + " call cause GSM is busy and 'isRealTelecomImpl'!=true"));
            return;
        }
        IacActionOutput out2 = iacActionProcessing.getOut();
        IacState state2 = iacActionProcessing.getState();
        String str2 = this.callId;
        CallInit callInitCopy$default = CallInit.copy$default(callInitA, CallInit.Telecom.New.INSTANCE, this.isRealTelecomImpl, false, null, false, null, null, 124, null);
        if (callInitCopy$default == null) {
            if (state2 instanceof IacState.Idle) {
                IacState.Idle idle2 = (IacState.Idle) state2;
                Appearance appearance10 = idle2.getAppearance();
                iacStateCopy$default = IacState.Idle.copy$default(idle2, appearance10.copy((261631 & 1) != 0 ? appearance10.callInits : P0.i(appearance10.getCallInits(), str2), (261631 & 2) != 0 ? appearance10.service : null, (261631 & 4) != 0 ? appearance10.screen : null, (261631 & 8) != 0 ? appearance10.app : null, (261631 & 16) != 0 ? appearance10.micPerm : null, (261631 & 32) != 0 ? appearance10.cameraPerm : null, (261631 & 64) != 0 ? appearance10.notifications : null, (261631 & 128) != 0 ? appearance10.ringingMode : null, (261631 & 256) != 0 ? appearance10.camera : null, (261631 & 512) != 0 ? appearance10.isGsmBusy : false, (261631 & 1024) != 0 ? appearance10.network : null, (261631 & 2048) != 0 ? appearance10.connectionQuality : null, (261631 & 4096) != 0 ? appearance10.power : null, (261631 & 8192) != 0 ? appearance10.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance10.isMiui : false, (261631 & 32768) != 0 ? appearance10.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance10.config : null, (261631 & 131072) != 0 ? appearance10.stringResources : null), null, 2, null);
            } else if (state2 instanceof IacState.InUse.Alive.Outgoing.Launching) {
                IacState.InUse.Alive.Outgoing.Launching launching2 = (IacState.InUse.Alive.Outgoing.Launching) state2;
                Appearance appearance11 = launching2.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching2, null, null, appearance11.copy((261631 & 1) != 0 ? appearance11.callInits : P0.i(appearance11.getCallInits(), str2), (261631 & 2) != 0 ? appearance11.service : null, (261631 & 4) != 0 ? appearance11.screen : null, (261631 & 8) != 0 ? appearance11.app : null, (261631 & 16) != 0 ? appearance11.micPerm : null, (261631 & 32) != 0 ? appearance11.cameraPerm : null, (261631 & 64) != 0 ? appearance11.notifications : null, (261631 & 128) != 0 ? appearance11.ringingMode : null, (261631 & 256) != 0 ? appearance11.camera : null, (261631 & 512) != 0 ? appearance11.isGsmBusy : false, (261631 & 1024) != 0 ? appearance11.network : null, (261631 & 2048) != 0 ? appearance11.connectionQuality : null, (261631 & 4096) != 0 ? appearance11.power : null, (261631 & 8192) != 0 ? appearance11.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance11.isMiui : false, (261631 & 32768) != 0 ? appearance11.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance11.config : null, (261631 & 131072) != 0 ? appearance11.stringResources : null), 3, null);
            } else if (state2 instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                IacState.InUse.Alive.Outgoing.Resolving resolving3 = (IacState.InUse.Alive.Outgoing.Resolving) state2;
                Appearance appearance12 = resolving3.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving3, null, null, null, appearance12.copy((261631 & 1) != 0 ? appearance12.callInits : P0.i(appearance12.getCallInits(), str2), (261631 & 2) != 0 ? appearance12.service : null, (261631 & 4) != 0 ? appearance12.screen : null, (261631 & 8) != 0 ? appearance12.app : null, (261631 & 16) != 0 ? appearance12.micPerm : null, (261631 & 32) != 0 ? appearance12.cameraPerm : null, (261631 & 64) != 0 ? appearance12.notifications : null, (261631 & 128) != 0 ? appearance12.ringingMode : null, (261631 & 256) != 0 ? appearance12.camera : null, (261631 & 512) != 0 ? appearance12.isGsmBusy : false, (261631 & 1024) != 0 ? appearance12.network : null, (261631 & 2048) != 0 ? appearance12.connectionQuality : null, (261631 & 4096) != 0 ? appearance12.power : null, (261631 & 8192) != 0 ? appearance12.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance12.isMiui : false, (261631 & 32768) != 0 ? appearance12.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance12.config : null, (261631 & 131072) != 0 ? appearance12.stringResources : null), 7, null);
            } else if (state2 instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                IacState.InUse.Alive.Outgoing.Waiting waiting3 = (IacState.InUse.Alive.Outgoing.Waiting) state2;
                Appearance appearance13 = waiting3.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting3, null, null, appearance13.copy((261631 & 1) != 0 ? appearance13.callInits : P0.i(appearance13.getCallInits(), str2), (261631 & 2) != 0 ? appearance13.service : null, (261631 & 4) != 0 ? appearance13.screen : null, (261631 & 8) != 0 ? appearance13.app : null, (261631 & 16) != 0 ? appearance13.micPerm : null, (261631 & 32) != 0 ? appearance13.cameraPerm : null, (261631 & 64) != 0 ? appearance13.notifications : null, (261631 & 128) != 0 ? appearance13.ringingMode : null, (261631 & 256) != 0 ? appearance13.camera : null, (261631 & 512) != 0 ? appearance13.isGsmBusy : false, (261631 & 1024) != 0 ? appearance13.network : null, (261631 & 2048) != 0 ? appearance13.connectionQuality : null, (261631 & 4096) != 0 ? appearance13.power : null, (261631 & 8192) != 0 ? appearance13.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance13.isMiui : false, (261631 & 32768) != 0 ? appearance13.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance13.config : null, (261631 & 131072) != 0 ? appearance13.stringResources : null), 3, null);
            } else if (state2 instanceof IacState.InUse.Alive.Incoming.Waiting) {
                IacState.InUse.Alive.Incoming.Waiting waiting4 = (IacState.InUse.Alive.Incoming.Waiting) state2;
                Appearance appearance14 = waiting4.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting4, null, null, appearance14.copy((261631 & 1) != 0 ? appearance14.callInits : P0.i(appearance14.getCallInits(), str2), (261631 & 2) != 0 ? appearance14.service : null, (261631 & 4) != 0 ? appearance14.screen : null, (261631 & 8) != 0 ? appearance14.app : null, (261631 & 16) != 0 ? appearance14.micPerm : null, (261631 & 32) != 0 ? appearance14.cameraPerm : null, (261631 & 64) != 0 ? appearance14.notifications : null, (261631 & 128) != 0 ? appearance14.ringingMode : null, (261631 & 256) != 0 ? appearance14.camera : null, (261631 & 512) != 0 ? appearance14.isGsmBusy : false, (261631 & 1024) != 0 ? appearance14.network : null, (261631 & 2048) != 0 ? appearance14.connectionQuality : null, (261631 & 4096) != 0 ? appearance14.power : null, (261631 & 8192) != 0 ? appearance14.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance14.isMiui : false, (261631 & 32768) != 0 ? appearance14.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance14.config : null, (261631 & 131072) != 0 ? appearance14.stringResources : null), 3, null);
            } else if (state2 instanceof IacState.InUse.Alive.Incoming.Resolving) {
                IacState.InUse.Alive.Incoming.Resolving resolving4 = (IacState.InUse.Alive.Incoming.Resolving) state2;
                Appearance appearance15 = resolving4.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving4, null, null, null, appearance15.copy((261631 & 1) != 0 ? appearance15.callInits : P0.i(appearance15.getCallInits(), str2), (261631 & 2) != 0 ? appearance15.service : null, (261631 & 4) != 0 ? appearance15.screen : null, (261631 & 8) != 0 ? appearance15.app : null, (261631 & 16) != 0 ? appearance15.micPerm : null, (261631 & 32) != 0 ? appearance15.cameraPerm : null, (261631 & 64) != 0 ? appearance15.notifications : null, (261631 & 128) != 0 ? appearance15.ringingMode : null, (261631 & 256) != 0 ? appearance15.camera : null, (261631 & 512) != 0 ? appearance15.isGsmBusy : false, (261631 & 1024) != 0 ? appearance15.network : null, (261631 & 2048) != 0 ? appearance15.connectionQuality : null, (261631 & 4096) != 0 ? appearance15.power : null, (261631 & 8192) != 0 ? appearance15.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance15.isMiui : false, (261631 & 32768) != 0 ? appearance15.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance15.config : null, (261631 & 131072) != 0 ? appearance15.stringResources : null), 7, null);
            } else if (state2 instanceof IacState.InUse.Alive.Incoming.Accepting) {
                IacState.InUse.Alive.Incoming.Accepting accepting2 = (IacState.InUse.Alive.Incoming.Accepting) state2;
                Appearance appearance16 = accepting2.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting2, null, null, appearance16.copy((261631 & 1) != 0 ? appearance16.callInits : P0.i(appearance16.getCallInits(), str2), (261631 & 2) != 0 ? appearance16.service : null, (261631 & 4) != 0 ? appearance16.screen : null, (261631 & 8) != 0 ? appearance16.app : null, (261631 & 16) != 0 ? appearance16.micPerm : null, (261631 & 32) != 0 ? appearance16.cameraPerm : null, (261631 & 64) != 0 ? appearance16.notifications : null, (261631 & 128) != 0 ? appearance16.ringingMode : null, (261631 & 256) != 0 ? appearance16.camera : null, (261631 & 512) != 0 ? appearance16.isGsmBusy : false, (261631 & 1024) != 0 ? appearance16.network : null, (261631 & 2048) != 0 ? appearance16.connectionQuality : null, (261631 & 4096) != 0 ? appearance16.power : null, (261631 & 8192) != 0 ? appearance16.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance16.isMiui : false, (261631 & 32768) != 0 ? appearance16.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance16.config : null, (261631 & 131072) != 0 ? appearance16.stringResources : null), 3, null);
            } else if (state2 instanceof IacState.InUse.Alive.Talking) {
                IacState.InUse.Alive.Talking talking2 = (IacState.InUse.Alive.Talking) state2;
                Appearance appearance17 = talking2.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking2, null, null, appearance17.copy((261631 & 1) != 0 ? appearance17.callInits : P0.i(appearance17.getCallInits(), str2), (261631 & 2) != 0 ? appearance17.service : null, (261631 & 4) != 0 ? appearance17.screen : null, (261631 & 8) != 0 ? appearance17.app : null, (261631 & 16) != 0 ? appearance17.micPerm : null, (261631 & 32) != 0 ? appearance17.cameraPerm : null, (261631 & 64) != 0 ? appearance17.notifications : null, (261631 & 128) != 0 ? appearance17.ringingMode : null, (261631 & 256) != 0 ? appearance17.camera : null, (261631 & 512) != 0 ? appearance17.isGsmBusy : false, (261631 & 1024) != 0 ? appearance17.network : null, (261631 & 2048) != 0 ? appearance17.connectionQuality : null, (261631 & 4096) != 0 ? appearance17.power : null, (261631 & 8192) != 0 ? appearance17.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance17.isMiui : false, (261631 & 32768) != 0 ? appearance17.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance17.config : null, (261631 & 131072) != 0 ? appearance17.stringResources : null), 3, null);
            } else {
                if (!(state2 instanceof IacState.InUse.Finished)) {
                    throw new NoWhenBranchMatchedException();
                }
                IacState.InUse.Finished finished2 = (IacState.InUse.Finished) state2;
                Appearance appearance18 = finished2.getAppearance();
                iacStateCopy$default = IacState.InUse.Finished.copy$default(finished2, null, null, appearance18.copy((261631 & 1) != 0 ? appearance18.callInits : P0.i(appearance18.getCallInits(), str2), (261631 & 2) != 0 ? appearance18.service : null, (261631 & 4) != 0 ? appearance18.screen : null, (261631 & 8) != 0 ? appearance18.app : null, (261631 & 16) != 0 ? appearance18.micPerm : null, (261631 & 32) != 0 ? appearance18.cameraPerm : null, (261631 & 64) != 0 ? appearance18.notifications : null, (261631 & 128) != 0 ? appearance18.ringingMode : null, (261631 & 256) != 0 ? appearance18.camera : null, (261631 & 512) != 0 ? appearance18.isGsmBusy : false, (261631 & 1024) != 0 ? appearance18.network : null, (261631 & 2048) != 0 ? appearance18.connectionQuality : null, (261631 & 4096) != 0 ? appearance18.power : null, (261631 & 8192) != 0 ? appearance18.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance18.isMiui : false, (261631 & 32768) != 0 ? appearance18.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance18.config : null, (261631 & 131072) != 0 ? appearance18.stringResources : null), 3, null);
            }
            if (iacStateCopy$default == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState");
            }
        } else {
            if (state2 instanceof IacState.Idle) {
                IacState.Idle idle3 = (IacState.Idle) state2;
                Appearance appearance19 = idle3.getAppearance();
                iacStateCopy$default = IacState.Idle.copy$default(idle3, appearance19.copy((261631 & 1) != 0 ? appearance19.callInits : f.p(str2, callInitCopy$default, appearance19.getCallInits()), (261631 & 2) != 0 ? appearance19.service : null, (261631 & 4) != 0 ? appearance19.screen : null, (261631 & 8) != 0 ? appearance19.app : null, (261631 & 16) != 0 ? appearance19.micPerm : null, (261631 & 32) != 0 ? appearance19.cameraPerm : null, (261631 & 64) != 0 ? appearance19.notifications : null, (261631 & 128) != 0 ? appearance19.ringingMode : null, (261631 & 256) != 0 ? appearance19.camera : null, (261631 & 512) != 0 ? appearance19.isGsmBusy : false, (261631 & 1024) != 0 ? appearance19.network : null, (261631 & 2048) != 0 ? appearance19.connectionQuality : null, (261631 & 4096) != 0 ? appearance19.power : null, (261631 & 8192) != 0 ? appearance19.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance19.isMiui : false, (261631 & 32768) != 0 ? appearance19.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance19.config : null, (261631 & 131072) != 0 ? appearance19.stringResources : null), null, 2, null);
            } else if (state2 instanceof IacState.InUse.Alive.Outgoing.Launching) {
                IacState.InUse.Alive.Outgoing.Launching launching3 = (IacState.InUse.Alive.Outgoing.Launching) state2;
                Appearance appearance20 = launching3.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching3, null, null, appearance20.copy((261631 & 1) != 0 ? appearance20.callInits : f.p(str2, callInitCopy$default, appearance20.getCallInits()), (261631 & 2) != 0 ? appearance20.service : null, (261631 & 4) != 0 ? appearance20.screen : null, (261631 & 8) != 0 ? appearance20.app : null, (261631 & 16) != 0 ? appearance20.micPerm : null, (261631 & 32) != 0 ? appearance20.cameraPerm : null, (261631 & 64) != 0 ? appearance20.notifications : null, (261631 & 128) != 0 ? appearance20.ringingMode : null, (261631 & 256) != 0 ? appearance20.camera : null, (261631 & 512) != 0 ? appearance20.isGsmBusy : false, (261631 & 1024) != 0 ? appearance20.network : null, (261631 & 2048) != 0 ? appearance20.connectionQuality : null, (261631 & 4096) != 0 ? appearance20.power : null, (261631 & 8192) != 0 ? appearance20.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance20.isMiui : false, (261631 & 32768) != 0 ? appearance20.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance20.config : null, (261631 & 131072) != 0 ? appearance20.stringResources : null), 3, null);
            } else if (state2 instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                IacState.InUse.Alive.Outgoing.Resolving resolving5 = (IacState.InUse.Alive.Outgoing.Resolving) state2;
                Appearance appearance21 = resolving5.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving5, null, null, null, appearance21.copy((261631 & 1) != 0 ? appearance21.callInits : f.p(str2, callInitCopy$default, appearance21.getCallInits()), (261631 & 2) != 0 ? appearance21.service : null, (261631 & 4) != 0 ? appearance21.screen : null, (261631 & 8) != 0 ? appearance21.app : null, (261631 & 16) != 0 ? appearance21.micPerm : null, (261631 & 32) != 0 ? appearance21.cameraPerm : null, (261631 & 64) != 0 ? appearance21.notifications : null, (261631 & 128) != 0 ? appearance21.ringingMode : null, (261631 & 256) != 0 ? appearance21.camera : null, (261631 & 512) != 0 ? appearance21.isGsmBusy : false, (261631 & 1024) != 0 ? appearance21.network : null, (261631 & 2048) != 0 ? appearance21.connectionQuality : null, (261631 & 4096) != 0 ? appearance21.power : null, (261631 & 8192) != 0 ? appearance21.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance21.isMiui : false, (261631 & 32768) != 0 ? appearance21.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance21.config : null, (261631 & 131072) != 0 ? appearance21.stringResources : null), 7, null);
            } else if (state2 instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                IacState.InUse.Alive.Outgoing.Waiting waiting5 = (IacState.InUse.Alive.Outgoing.Waiting) state2;
                Appearance appearance22 = waiting5.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting5, null, null, appearance22.copy((261631 & 1) != 0 ? appearance22.callInits : f.p(str2, callInitCopy$default, appearance22.getCallInits()), (261631 & 2) != 0 ? appearance22.service : null, (261631 & 4) != 0 ? appearance22.screen : null, (261631 & 8) != 0 ? appearance22.app : null, (261631 & 16) != 0 ? appearance22.micPerm : null, (261631 & 32) != 0 ? appearance22.cameraPerm : null, (261631 & 64) != 0 ? appearance22.notifications : null, (261631 & 128) != 0 ? appearance22.ringingMode : null, (261631 & 256) != 0 ? appearance22.camera : null, (261631 & 512) != 0 ? appearance22.isGsmBusy : false, (261631 & 1024) != 0 ? appearance22.network : null, (261631 & 2048) != 0 ? appearance22.connectionQuality : null, (261631 & 4096) != 0 ? appearance22.power : null, (261631 & 8192) != 0 ? appearance22.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance22.isMiui : false, (261631 & 32768) != 0 ? appearance22.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance22.config : null, (261631 & 131072) != 0 ? appearance22.stringResources : null), 3, null);
            } else if (state2 instanceof IacState.InUse.Alive.Incoming.Waiting) {
                IacState.InUse.Alive.Incoming.Waiting waiting6 = (IacState.InUse.Alive.Incoming.Waiting) state2;
                Appearance appearance23 = waiting6.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting6, null, null, appearance23.copy((261631 & 1) != 0 ? appearance23.callInits : f.p(str2, callInitCopy$default, appearance23.getCallInits()), (261631 & 2) != 0 ? appearance23.service : null, (261631 & 4) != 0 ? appearance23.screen : null, (261631 & 8) != 0 ? appearance23.app : null, (261631 & 16) != 0 ? appearance23.micPerm : null, (261631 & 32) != 0 ? appearance23.cameraPerm : null, (261631 & 64) != 0 ? appearance23.notifications : null, (261631 & 128) != 0 ? appearance23.ringingMode : null, (261631 & 256) != 0 ? appearance23.camera : null, (261631 & 512) != 0 ? appearance23.isGsmBusy : false, (261631 & 1024) != 0 ? appearance23.network : null, (261631 & 2048) != 0 ? appearance23.connectionQuality : null, (261631 & 4096) != 0 ? appearance23.power : null, (261631 & 8192) != 0 ? appearance23.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance23.isMiui : false, (261631 & 32768) != 0 ? appearance23.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance23.config : null, (261631 & 131072) != 0 ? appearance23.stringResources : null), 3, null);
            } else if (state2 instanceof IacState.InUse.Alive.Incoming.Resolving) {
                IacState.InUse.Alive.Incoming.Resolving resolving6 = (IacState.InUse.Alive.Incoming.Resolving) state2;
                Appearance appearance24 = resolving6.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving6, null, null, null, appearance24.copy((261631 & 1) != 0 ? appearance24.callInits : f.p(str2, callInitCopy$default, appearance24.getCallInits()), (261631 & 2) != 0 ? appearance24.service : null, (261631 & 4) != 0 ? appearance24.screen : null, (261631 & 8) != 0 ? appearance24.app : null, (261631 & 16) != 0 ? appearance24.micPerm : null, (261631 & 32) != 0 ? appearance24.cameraPerm : null, (261631 & 64) != 0 ? appearance24.notifications : null, (261631 & 128) != 0 ? appearance24.ringingMode : null, (261631 & 256) != 0 ? appearance24.camera : null, (261631 & 512) != 0 ? appearance24.isGsmBusy : false, (261631 & 1024) != 0 ? appearance24.network : null, (261631 & 2048) != 0 ? appearance24.connectionQuality : null, (261631 & 4096) != 0 ? appearance24.power : null, (261631 & 8192) != 0 ? appearance24.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance24.isMiui : false, (261631 & 32768) != 0 ? appearance24.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance24.config : null, (261631 & 131072) != 0 ? appearance24.stringResources : null), 7, null);
            } else if (state2 instanceof IacState.InUse.Alive.Incoming.Accepting) {
                IacState.InUse.Alive.Incoming.Accepting accepting3 = (IacState.InUse.Alive.Incoming.Accepting) state2;
                Appearance appearance25 = accepting3.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting3, null, null, appearance25.copy((261631 & 1) != 0 ? appearance25.callInits : f.p(str2, callInitCopy$default, appearance25.getCallInits()), (261631 & 2) != 0 ? appearance25.service : null, (261631 & 4) != 0 ? appearance25.screen : null, (261631 & 8) != 0 ? appearance25.app : null, (261631 & 16) != 0 ? appearance25.micPerm : null, (261631 & 32) != 0 ? appearance25.cameraPerm : null, (261631 & 64) != 0 ? appearance25.notifications : null, (261631 & 128) != 0 ? appearance25.ringingMode : null, (261631 & 256) != 0 ? appearance25.camera : null, (261631 & 512) != 0 ? appearance25.isGsmBusy : false, (261631 & 1024) != 0 ? appearance25.network : null, (261631 & 2048) != 0 ? appearance25.connectionQuality : null, (261631 & 4096) != 0 ? appearance25.power : null, (261631 & 8192) != 0 ? appearance25.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance25.isMiui : false, (261631 & 32768) != 0 ? appearance25.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance25.config : null, (261631 & 131072) != 0 ? appearance25.stringResources : null), 3, null);
            } else if (state2 instanceof IacState.InUse.Alive.Talking) {
                IacState.InUse.Alive.Talking talking3 = (IacState.InUse.Alive.Talking) state2;
                Appearance appearance26 = talking3.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking3, null, null, appearance26.copy((261631 & 1) != 0 ? appearance26.callInits : f.p(str2, callInitCopy$default, appearance26.getCallInits()), (261631 & 2) != 0 ? appearance26.service : null, (261631 & 4) != 0 ? appearance26.screen : null, (261631 & 8) != 0 ? appearance26.app : null, (261631 & 16) != 0 ? appearance26.micPerm : null, (261631 & 32) != 0 ? appearance26.cameraPerm : null, (261631 & 64) != 0 ? appearance26.notifications : null, (261631 & 128) != 0 ? appearance26.ringingMode : null, (261631 & 256) != 0 ? appearance26.camera : null, (261631 & 512) != 0 ? appearance26.isGsmBusy : false, (261631 & 1024) != 0 ? appearance26.network : null, (261631 & 2048) != 0 ? appearance26.connectionQuality : null, (261631 & 4096) != 0 ? appearance26.power : null, (261631 & 8192) != 0 ? appearance26.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance26.isMiui : false, (261631 & 32768) != 0 ? appearance26.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance26.config : null, (261631 & 131072) != 0 ? appearance26.stringResources : null), 3, null);
            } else {
                if (!(state2 instanceof IacState.InUse.Finished)) {
                    throw new NoWhenBranchMatchedException();
                }
                IacState.InUse.Finished finished3 = (IacState.InUse.Finished) state2;
                Appearance appearance27 = finished3.getAppearance();
                iacStateCopy$default = IacState.InUse.Finished.copy$default(finished3, null, null, appearance27.copy((261631 & 1) != 0 ? appearance27.callInits : f.p(str2, callInitCopy$default, appearance27.getCallInits()), (261631 & 2) != 0 ? appearance27.service : null, (261631 & 4) != 0 ? appearance27.screen : null, (261631 & 8) != 0 ? appearance27.app : null, (261631 & 16) != 0 ? appearance27.micPerm : null, (261631 & 32) != 0 ? appearance27.cameraPerm : null, (261631 & 64) != 0 ? appearance27.notifications : null, (261631 & 128) != 0 ? appearance27.ringingMode : null, (261631 & 256) != 0 ? appearance27.camera : null, (261631 & 512) != 0 ? appearance27.isGsmBusy : false, (261631 & 1024) != 0 ? appearance27.network : null, (261631 & 2048) != 0 ? appearance27.connectionQuality : null, (261631 & 4096) != 0 ? appearance27.power : null, (261631 & 8192) != 0 ? appearance27.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance27.isMiui : false, (261631 & 32768) != 0 ? appearance27.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance27.config : null, (261631 & 131072) != 0 ? appearance27.stringResources : null), 3, null);
            }
            if (iacStateCopy$default == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState");
            }
        }
        iacActionProcessing.plusAssign(out2, iacStateCopy$default);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("OnAddCallCommandResultTelecomAction(callId=");
        sb2.append(this.callId);
        sb2.append(", t=");
        sb2.append(this.t);
        sb2.append(", isRealTelecomImpl=");
        return C0.g(sb2, this.isRealTelecomImpl, ')');
    }
}
