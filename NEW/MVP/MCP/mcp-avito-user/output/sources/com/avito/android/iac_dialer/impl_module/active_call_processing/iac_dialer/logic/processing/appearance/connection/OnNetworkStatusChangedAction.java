package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.appearance.connection;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.Appearance;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.device_status.connection_status.IacConnectionStatus;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: OnNetworkStatusChangedAction.kt */
@P
@s0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/appearance/connection/OnNetworkStatusChangedAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus;", "networkStatus", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/appearance/connection/OnNetworkStatusChangedAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus;", "getNetworkStatus", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnNetworkStatusChangedAction implements IacAction {
    public static final int $stable = 8;

    @k
    private final IacConnectionStatus networkStatus;

    public OnNetworkStatusChangedAction(@k IacConnectionStatus iacConnectionStatus) {
        this.networkStatus = iacConnectionStatus;
    }

    public static /* synthetic */ OnNetworkStatusChangedAction copy$default(OnNetworkStatusChangedAction onNetworkStatusChangedAction, IacConnectionStatus iacConnectionStatus, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            iacConnectionStatus = onNetworkStatusChangedAction.networkStatus;
        }
        return onNetworkStatusChangedAction.copy(iacConnectionStatus);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final IacConnectionStatus getNetworkStatus() {
        return this.networkStatus;
    }

    @k
    public final OnNetworkStatusChangedAction copy(@k IacConnectionStatus networkStatus) {
        return new OnNetworkStatusChangedAction(networkStatus);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnNetworkStatusChangedAction) && L.f(this.networkStatus, ((OnNetworkStatusChangedAction) other).networkStatus);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    @k
    public final IacConnectionStatus getNetworkStatus() {
        return this.networkStatus;
    }

    public int hashCode() {
        return this.networkStatus.hashCode();
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        IacState iacStateCopy$default;
        IacActionOutput out = iacActionProcessing.getOut();
        IacState state = iacActionProcessing.getState();
        if (state instanceof IacState.Idle) {
            IacState.Idle idle = (IacState.Idle) state;
            Appearance appearance = idle.getAppearance();
            iacStateCopy$default = IacState.Idle.copy$default(idle, appearance.copy((261631 & 1) != 0 ? appearance.callInits : null, (261631 & 2) != 0 ? appearance.service : null, (261631 & 4) != 0 ? appearance.screen : null, (261631 & 8) != 0 ? appearance.app : null, (261631 & 16) != 0 ? appearance.micPerm : null, (261631 & 32) != 0 ? appearance.cameraPerm : null, (261631 & 64) != 0 ? appearance.notifications : null, (261631 & 128) != 0 ? appearance.ringingMode : null, (261631 & 256) != 0 ? appearance.camera : null, (261631 & 512) != 0 ? appearance.isGsmBusy : false, (261631 & 1024) != 0 ? appearance.network : this.networkStatus, (261631 & 2048) != 0 ? appearance.connectionQuality : null, (261631 & 4096) != 0 ? appearance.power : null, (261631 & 8192) != 0 ? appearance.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance.isMiui : false, (261631 & 32768) != 0 ? appearance.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance.config : null, (261631 & 131072) != 0 ? appearance.stringResources : null), null, 2, null);
        } else if (state instanceof IacState.InUse.Alive.Outgoing.Launching) {
            IacState.InUse.Alive.Outgoing.Launching launching = (IacState.InUse.Alive.Outgoing.Launching) state;
            Appearance appearance2 = launching.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching, null, null, appearance2.copy((261631 & 1) != 0 ? appearance2.callInits : null, (261631 & 2) != 0 ? appearance2.service : null, (261631 & 4) != 0 ? appearance2.screen : null, (261631 & 8) != 0 ? appearance2.app : null, (261631 & 16) != 0 ? appearance2.micPerm : null, (261631 & 32) != 0 ? appearance2.cameraPerm : null, (261631 & 64) != 0 ? appearance2.notifications : null, (261631 & 128) != 0 ? appearance2.ringingMode : null, (261631 & 256) != 0 ? appearance2.camera : null, (261631 & 512) != 0 ? appearance2.isGsmBusy : false, (261631 & 1024) != 0 ? appearance2.network : this.networkStatus, (261631 & 2048) != 0 ? appearance2.connectionQuality : null, (261631 & 4096) != 0 ? appearance2.power : null, (261631 & 8192) != 0 ? appearance2.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance2.isMiui : false, (261631 & 32768) != 0 ? appearance2.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance2.config : null, (261631 & 131072) != 0 ? appearance2.stringResources : null), 3, null);
        } else if (state instanceof IacState.InUse.Alive.Outgoing.Resolving) {
            IacState.InUse.Alive.Outgoing.Resolving resolving = (IacState.InUse.Alive.Outgoing.Resolving) state;
            Appearance appearance3 = resolving.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving, null, null, null, appearance3.copy((261631 & 1) != 0 ? appearance3.callInits : null, (261631 & 2) != 0 ? appearance3.service : null, (261631 & 4) != 0 ? appearance3.screen : null, (261631 & 8) != 0 ? appearance3.app : null, (261631 & 16) != 0 ? appearance3.micPerm : null, (261631 & 32) != 0 ? appearance3.cameraPerm : null, (261631 & 64) != 0 ? appearance3.notifications : null, (261631 & 128) != 0 ? appearance3.ringingMode : null, (261631 & 256) != 0 ? appearance3.camera : null, (261631 & 512) != 0 ? appearance3.isGsmBusy : false, (261631 & 1024) != 0 ? appearance3.network : this.networkStatus, (261631 & 2048) != 0 ? appearance3.connectionQuality : null, (261631 & 4096) != 0 ? appearance3.power : null, (261631 & 8192) != 0 ? appearance3.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance3.isMiui : false, (261631 & 32768) != 0 ? appearance3.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance3.config : null, (261631 & 131072) != 0 ? appearance3.stringResources : null), 7, null);
        } else if (state instanceof IacState.InUse.Alive.Outgoing.Waiting) {
            IacState.InUse.Alive.Outgoing.Waiting waiting = (IacState.InUse.Alive.Outgoing.Waiting) state;
            Appearance appearance4 = waiting.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting, null, null, appearance4.copy((261631 & 1) != 0 ? appearance4.callInits : null, (261631 & 2) != 0 ? appearance4.service : null, (261631 & 4) != 0 ? appearance4.screen : null, (261631 & 8) != 0 ? appearance4.app : null, (261631 & 16) != 0 ? appearance4.micPerm : null, (261631 & 32) != 0 ? appearance4.cameraPerm : null, (261631 & 64) != 0 ? appearance4.notifications : null, (261631 & 128) != 0 ? appearance4.ringingMode : null, (261631 & 256) != 0 ? appearance4.camera : null, (261631 & 512) != 0 ? appearance4.isGsmBusy : false, (261631 & 1024) != 0 ? appearance4.network : this.networkStatus, (261631 & 2048) != 0 ? appearance4.connectionQuality : null, (261631 & 4096) != 0 ? appearance4.power : null, (261631 & 8192) != 0 ? appearance4.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance4.isMiui : false, (261631 & 32768) != 0 ? appearance4.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance4.config : null, (261631 & 131072) != 0 ? appearance4.stringResources : null), 3, null);
        } else if (state instanceof IacState.InUse.Alive.Incoming.Waiting) {
            IacState.InUse.Alive.Incoming.Waiting waiting2 = (IacState.InUse.Alive.Incoming.Waiting) state;
            Appearance appearance5 = waiting2.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting2, null, null, appearance5.copy((261631 & 1) != 0 ? appearance5.callInits : null, (261631 & 2) != 0 ? appearance5.service : null, (261631 & 4) != 0 ? appearance5.screen : null, (261631 & 8) != 0 ? appearance5.app : null, (261631 & 16) != 0 ? appearance5.micPerm : null, (261631 & 32) != 0 ? appearance5.cameraPerm : null, (261631 & 64) != 0 ? appearance5.notifications : null, (261631 & 128) != 0 ? appearance5.ringingMode : null, (261631 & 256) != 0 ? appearance5.camera : null, (261631 & 512) != 0 ? appearance5.isGsmBusy : false, (261631 & 1024) != 0 ? appearance5.network : this.networkStatus, (261631 & 2048) != 0 ? appearance5.connectionQuality : null, (261631 & 4096) != 0 ? appearance5.power : null, (261631 & 8192) != 0 ? appearance5.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance5.isMiui : false, (261631 & 32768) != 0 ? appearance5.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance5.config : null, (261631 & 131072) != 0 ? appearance5.stringResources : null), 3, null);
        } else if (state instanceof IacState.InUse.Alive.Incoming.Resolving) {
            IacState.InUse.Alive.Incoming.Resolving resolving2 = (IacState.InUse.Alive.Incoming.Resolving) state;
            Appearance appearance6 = resolving2.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving2, null, null, null, appearance6.copy((261631 & 1) != 0 ? appearance6.callInits : null, (261631 & 2) != 0 ? appearance6.service : null, (261631 & 4) != 0 ? appearance6.screen : null, (261631 & 8) != 0 ? appearance6.app : null, (261631 & 16) != 0 ? appearance6.micPerm : null, (261631 & 32) != 0 ? appearance6.cameraPerm : null, (261631 & 64) != 0 ? appearance6.notifications : null, (261631 & 128) != 0 ? appearance6.ringingMode : null, (261631 & 256) != 0 ? appearance6.camera : null, (261631 & 512) != 0 ? appearance6.isGsmBusy : false, (261631 & 1024) != 0 ? appearance6.network : this.networkStatus, (261631 & 2048) != 0 ? appearance6.connectionQuality : null, (261631 & 4096) != 0 ? appearance6.power : null, (261631 & 8192) != 0 ? appearance6.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance6.isMiui : false, (261631 & 32768) != 0 ? appearance6.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance6.config : null, (261631 & 131072) != 0 ? appearance6.stringResources : null), 7, null);
        } else if (state instanceof IacState.InUse.Alive.Incoming.Accepting) {
            IacState.InUse.Alive.Incoming.Accepting accepting = (IacState.InUse.Alive.Incoming.Accepting) state;
            Appearance appearance7 = accepting.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting, null, null, appearance7.copy((261631 & 1) != 0 ? appearance7.callInits : null, (261631 & 2) != 0 ? appearance7.service : null, (261631 & 4) != 0 ? appearance7.screen : null, (261631 & 8) != 0 ? appearance7.app : null, (261631 & 16) != 0 ? appearance7.micPerm : null, (261631 & 32) != 0 ? appearance7.cameraPerm : null, (261631 & 64) != 0 ? appearance7.notifications : null, (261631 & 128) != 0 ? appearance7.ringingMode : null, (261631 & 256) != 0 ? appearance7.camera : null, (261631 & 512) != 0 ? appearance7.isGsmBusy : false, (261631 & 1024) != 0 ? appearance7.network : this.networkStatus, (261631 & 2048) != 0 ? appearance7.connectionQuality : null, (261631 & 4096) != 0 ? appearance7.power : null, (261631 & 8192) != 0 ? appearance7.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance7.isMiui : false, (261631 & 32768) != 0 ? appearance7.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance7.config : null, (261631 & 131072) != 0 ? appearance7.stringResources : null), 3, null);
        } else if (state instanceof IacState.InUse.Alive.Talking) {
            IacState.InUse.Alive.Talking talking = (IacState.InUse.Alive.Talking) state;
            Appearance appearance8 = talking.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking, null, null, appearance8.copy((261631 & 1) != 0 ? appearance8.callInits : null, (261631 & 2) != 0 ? appearance8.service : null, (261631 & 4) != 0 ? appearance8.screen : null, (261631 & 8) != 0 ? appearance8.app : null, (261631 & 16) != 0 ? appearance8.micPerm : null, (261631 & 32) != 0 ? appearance8.cameraPerm : null, (261631 & 64) != 0 ? appearance8.notifications : null, (261631 & 128) != 0 ? appearance8.ringingMode : null, (261631 & 256) != 0 ? appearance8.camera : null, (261631 & 512) != 0 ? appearance8.isGsmBusy : false, (261631 & 1024) != 0 ? appearance8.network : this.networkStatus, (261631 & 2048) != 0 ? appearance8.connectionQuality : null, (261631 & 4096) != 0 ? appearance8.power : null, (261631 & 8192) != 0 ? appearance8.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance8.isMiui : false, (261631 & 32768) != 0 ? appearance8.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance8.config : null, (261631 & 131072) != 0 ? appearance8.stringResources : null), 3, null);
        } else {
            if (!(state instanceof IacState.InUse.Finished)) {
                throw new NoWhenBranchMatchedException();
            }
            IacState.InUse.Finished finished = (IacState.InUse.Finished) state;
            Appearance appearance9 = finished.getAppearance();
            iacStateCopy$default = IacState.InUse.Finished.copy$default(finished, null, null, appearance9.copy((261631 & 1) != 0 ? appearance9.callInits : null, (261631 & 2) != 0 ? appearance9.service : null, (261631 & 4) != 0 ? appearance9.screen : null, (261631 & 8) != 0 ? appearance9.app : null, (261631 & 16) != 0 ? appearance9.micPerm : null, (261631 & 32) != 0 ? appearance9.cameraPerm : null, (261631 & 64) != 0 ? appearance9.notifications : null, (261631 & 128) != 0 ? appearance9.ringingMode : null, (261631 & 256) != 0 ? appearance9.camera : null, (261631 & 512) != 0 ? appearance9.isGsmBusy : false, (261631 & 1024) != 0 ? appearance9.network : this.networkStatus, (261631 & 2048) != 0 ? appearance9.connectionQuality : null, (261631 & 4096) != 0 ? appearance9.power : null, (261631 & 8192) != 0 ? appearance9.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance9.isMiui : false, (261631 & 32768) != 0 ? appearance9.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance9.config : null, (261631 & 131072) != 0 ? appearance9.stringResources : null), 3, null);
        }
        if (iacStateCopy$default == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState");
        }
        iacActionProcessing.plusAssign(out, iacStateCopy$default);
    }

    @k
    public String toString() {
        return "OnNetworkStatusChangedAction(networkStatus=" + this.networkStatus + ')';
    }
}
