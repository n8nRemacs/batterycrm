package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.incoming.resolving;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.Appearance;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReason;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.preconditions.IncomingPreconditions;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.permissions.PermissionState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: OnIncomingCameraPermissionResultAction.kt */
@P
@s0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/resolving/OnIncomingCameraPermissionResultAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "Lcom/avito/android/permissions/PermissionState;", "cameraPermissionState", "<init>", "(Lcom/avito/android/permissions/PermissionState;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Lcom/avito/android/permissions/PermissionState;", "copy", "(Lcom/avito/android/permissions/PermissionState;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/resolving/OnIncomingCameraPermissionResultAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/permissions/PermissionState;", "getCameraPermissionState", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnIncomingCameraPermissionResultAction implements IacAction {
    public static final int $stable = 0;

    @k
    private final PermissionState cameraPermissionState;

    public OnIncomingCameraPermissionResultAction(@k PermissionState permissionState) {
        this.cameraPermissionState = permissionState;
    }

    public static /* synthetic */ OnIncomingCameraPermissionResultAction copy$default(OnIncomingCameraPermissionResultAction onIncomingCameraPermissionResultAction, PermissionState permissionState, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            permissionState = onIncomingCameraPermissionResultAction.cameraPermissionState;
        }
        return onIncomingCameraPermissionResultAction.copy(permissionState);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final PermissionState getCameraPermissionState() {
        return this.cameraPermissionState;
    }

    @k
    public final OnIncomingCameraPermissionResultAction copy(@k PermissionState cameraPermissionState) {
        return new OnIncomingCameraPermissionResultAction(cameraPermissionState);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnIncomingCameraPermissionResultAction) && this.cameraPermissionState == ((OnIncomingCameraPermissionResultAction) other).cameraPermissionState;
    }

    @k
    public final PermissionState getCameraPermissionState() {
        return this.cameraPermissionState;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return this.cameraPermissionState.hashCode();
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        IacState iacStateCopy$default;
        IacState iacStateCopy$default2;
        if (!(iacActionProcessing.getState() instanceof IacState.InUse.Alive.Incoming.Resolving)) {
            IacActionOutput out = iacActionProcessing.getOut();
            IacState state = iacActionProcessing.getState();
            if (state instanceof IacState.Idle) {
                IacState.Idle idle = (IacState.Idle) state;
                Appearance appearance = idle.getAppearance();
                iacStateCopy$default2 = IacState.Idle.copy$default(idle, appearance.copy((261631 & 1) != 0 ? appearance.callInits : null, (261631 & 2) != 0 ? appearance.service : null, (261631 & 4) != 0 ? appearance.screen : null, (261631 & 8) != 0 ? appearance.app : null, (261631 & 16) != 0 ? appearance.micPerm : null, (261631 & 32) != 0 ? appearance.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance.notifications : null, (261631 & 128) != 0 ? appearance.ringingMode : null, (261631 & 256) != 0 ? appearance.camera : null, (261631 & 512) != 0 ? appearance.isGsmBusy : false, (261631 & 1024) != 0 ? appearance.network : null, (261631 & 2048) != 0 ? appearance.connectionQuality : null, (261631 & 4096) != 0 ? appearance.power : null, (261631 & 8192) != 0 ? appearance.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance.isMiui : false, (261631 & 32768) != 0 ? appearance.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance.config : null, (261631 & 131072) != 0 ? appearance.stringResources : null), null, 2, null);
            } else if (state instanceof IacState.InUse.Alive.Outgoing.Launching) {
                IacState.InUse.Alive.Outgoing.Launching launching = (IacState.InUse.Alive.Outgoing.Launching) state;
                Appearance appearance2 = launching.getAppearance();
                iacStateCopy$default2 = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching, null, null, appearance2.copy((261631 & 1) != 0 ? appearance2.callInits : null, (261631 & 2) != 0 ? appearance2.service : null, (261631 & 4) != 0 ? appearance2.screen : null, (261631 & 8) != 0 ? appearance2.app : null, (261631 & 16) != 0 ? appearance2.micPerm : null, (261631 & 32) != 0 ? appearance2.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance2.notifications : null, (261631 & 128) != 0 ? appearance2.ringingMode : null, (261631 & 256) != 0 ? appearance2.camera : null, (261631 & 512) != 0 ? appearance2.isGsmBusy : false, (261631 & 1024) != 0 ? appearance2.network : null, (261631 & 2048) != 0 ? appearance2.connectionQuality : null, (261631 & 4096) != 0 ? appearance2.power : null, (261631 & 8192) != 0 ? appearance2.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance2.isMiui : false, (261631 & 32768) != 0 ? appearance2.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance2.config : null, (261631 & 131072) != 0 ? appearance2.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                IacState.InUse.Alive.Outgoing.Resolving resolving = (IacState.InUse.Alive.Outgoing.Resolving) state;
                Appearance appearance3 = resolving.getAppearance();
                iacStateCopy$default2 = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving, null, null, null, appearance3.copy((261631 & 1) != 0 ? appearance3.callInits : null, (261631 & 2) != 0 ? appearance3.service : null, (261631 & 4) != 0 ? appearance3.screen : null, (261631 & 8) != 0 ? appearance3.app : null, (261631 & 16) != 0 ? appearance3.micPerm : null, (261631 & 32) != 0 ? appearance3.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance3.notifications : null, (261631 & 128) != 0 ? appearance3.ringingMode : null, (261631 & 256) != 0 ? appearance3.camera : null, (261631 & 512) != 0 ? appearance3.isGsmBusy : false, (261631 & 1024) != 0 ? appearance3.network : null, (261631 & 2048) != 0 ? appearance3.connectionQuality : null, (261631 & 4096) != 0 ? appearance3.power : null, (261631 & 8192) != 0 ? appearance3.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance3.isMiui : false, (261631 & 32768) != 0 ? appearance3.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance3.config : null, (261631 & 131072) != 0 ? appearance3.stringResources : null), 7, null);
            } else if (state instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                IacState.InUse.Alive.Outgoing.Waiting waiting = (IacState.InUse.Alive.Outgoing.Waiting) state;
                Appearance appearance4 = waiting.getAppearance();
                iacStateCopy$default2 = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting, null, null, appearance4.copy((261631 & 1) != 0 ? appearance4.callInits : null, (261631 & 2) != 0 ? appearance4.service : null, (261631 & 4) != 0 ? appearance4.screen : null, (261631 & 8) != 0 ? appearance4.app : null, (261631 & 16) != 0 ? appearance4.micPerm : null, (261631 & 32) != 0 ? appearance4.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance4.notifications : null, (261631 & 128) != 0 ? appearance4.ringingMode : null, (261631 & 256) != 0 ? appearance4.camera : null, (261631 & 512) != 0 ? appearance4.isGsmBusy : false, (261631 & 1024) != 0 ? appearance4.network : null, (261631 & 2048) != 0 ? appearance4.connectionQuality : null, (261631 & 4096) != 0 ? appearance4.power : null, (261631 & 8192) != 0 ? appearance4.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance4.isMiui : false, (261631 & 32768) != 0 ? appearance4.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance4.config : null, (261631 & 131072) != 0 ? appearance4.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Incoming.Waiting) {
                IacState.InUse.Alive.Incoming.Waiting waiting2 = (IacState.InUse.Alive.Incoming.Waiting) state;
                Appearance appearance5 = waiting2.getAppearance();
                iacStateCopy$default2 = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting2, null, null, appearance5.copy((261631 & 1) != 0 ? appearance5.callInits : null, (261631 & 2) != 0 ? appearance5.service : null, (261631 & 4) != 0 ? appearance5.screen : null, (261631 & 8) != 0 ? appearance5.app : null, (261631 & 16) != 0 ? appearance5.micPerm : null, (261631 & 32) != 0 ? appearance5.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance5.notifications : null, (261631 & 128) != 0 ? appearance5.ringingMode : null, (261631 & 256) != 0 ? appearance5.camera : null, (261631 & 512) != 0 ? appearance5.isGsmBusy : false, (261631 & 1024) != 0 ? appearance5.network : null, (261631 & 2048) != 0 ? appearance5.connectionQuality : null, (261631 & 4096) != 0 ? appearance5.power : null, (261631 & 8192) != 0 ? appearance5.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance5.isMiui : false, (261631 & 32768) != 0 ? appearance5.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance5.config : null, (261631 & 131072) != 0 ? appearance5.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Incoming.Resolving) {
                IacState.InUse.Alive.Incoming.Resolving resolving2 = (IacState.InUse.Alive.Incoming.Resolving) state;
                Appearance appearance6 = resolving2.getAppearance();
                iacStateCopy$default2 = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving2, null, null, null, appearance6.copy((261631 & 1) != 0 ? appearance6.callInits : null, (261631 & 2) != 0 ? appearance6.service : null, (261631 & 4) != 0 ? appearance6.screen : null, (261631 & 8) != 0 ? appearance6.app : null, (261631 & 16) != 0 ? appearance6.micPerm : null, (261631 & 32) != 0 ? appearance6.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance6.notifications : null, (261631 & 128) != 0 ? appearance6.ringingMode : null, (261631 & 256) != 0 ? appearance6.camera : null, (261631 & 512) != 0 ? appearance6.isGsmBusy : false, (261631 & 1024) != 0 ? appearance6.network : null, (261631 & 2048) != 0 ? appearance6.connectionQuality : null, (261631 & 4096) != 0 ? appearance6.power : null, (261631 & 8192) != 0 ? appearance6.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance6.isMiui : false, (261631 & 32768) != 0 ? appearance6.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance6.config : null, (261631 & 131072) != 0 ? appearance6.stringResources : null), 7, null);
            } else if (state instanceof IacState.InUse.Alive.Incoming.Accepting) {
                IacState.InUse.Alive.Incoming.Accepting accepting = (IacState.InUse.Alive.Incoming.Accepting) state;
                Appearance appearance7 = accepting.getAppearance();
                iacStateCopy$default2 = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting, null, null, appearance7.copy((261631 & 1) != 0 ? appearance7.callInits : null, (261631 & 2) != 0 ? appearance7.service : null, (261631 & 4) != 0 ? appearance7.screen : null, (261631 & 8) != 0 ? appearance7.app : null, (261631 & 16) != 0 ? appearance7.micPerm : null, (261631 & 32) != 0 ? appearance7.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance7.notifications : null, (261631 & 128) != 0 ? appearance7.ringingMode : null, (261631 & 256) != 0 ? appearance7.camera : null, (261631 & 512) != 0 ? appearance7.isGsmBusy : false, (261631 & 1024) != 0 ? appearance7.network : null, (261631 & 2048) != 0 ? appearance7.connectionQuality : null, (261631 & 4096) != 0 ? appearance7.power : null, (261631 & 8192) != 0 ? appearance7.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance7.isMiui : false, (261631 & 32768) != 0 ? appearance7.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance7.config : null, (261631 & 131072) != 0 ? appearance7.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Talking) {
                IacState.InUse.Alive.Talking talking = (IacState.InUse.Alive.Talking) state;
                Appearance appearance8 = talking.getAppearance();
                iacStateCopy$default2 = IacState.InUse.Alive.Talking.copy$default(talking, null, null, appearance8.copy((261631 & 1) != 0 ? appearance8.callInits : null, (261631 & 2) != 0 ? appearance8.service : null, (261631 & 4) != 0 ? appearance8.screen : null, (261631 & 8) != 0 ? appearance8.app : null, (261631 & 16) != 0 ? appearance8.micPerm : null, (261631 & 32) != 0 ? appearance8.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance8.notifications : null, (261631 & 128) != 0 ? appearance8.ringingMode : null, (261631 & 256) != 0 ? appearance8.camera : null, (261631 & 512) != 0 ? appearance8.isGsmBusy : false, (261631 & 1024) != 0 ? appearance8.network : null, (261631 & 2048) != 0 ? appearance8.connectionQuality : null, (261631 & 4096) != 0 ? appearance8.power : null, (261631 & 8192) != 0 ? appearance8.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance8.isMiui : false, (261631 & 32768) != 0 ? appearance8.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance8.config : null, (261631 & 131072) != 0 ? appearance8.stringResources : null), 3, null);
            } else {
                if (!(state instanceof IacState.InUse.Finished)) {
                    throw new NoWhenBranchMatchedException();
                }
                IacState.InUse.Finished finished = (IacState.InUse.Finished) state;
                Appearance appearance9 = finished.getAppearance();
                iacStateCopy$default2 = IacState.InUse.Finished.copy$default(finished, null, null, appearance9.copy((261631 & 1) != 0 ? appearance9.callInits : null, (261631 & 2) != 0 ? appearance9.service : null, (261631 & 4) != 0 ? appearance9.screen : null, (261631 & 8) != 0 ? appearance9.app : null, (261631 & 16) != 0 ? appearance9.micPerm : null, (261631 & 32) != 0 ? appearance9.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance9.notifications : null, (261631 & 128) != 0 ? appearance9.ringingMode : null, (261631 & 256) != 0 ? appearance9.camera : null, (261631 & 512) != 0 ? appearance9.isGsmBusy : false, (261631 & 1024) != 0 ? appearance9.network : null, (261631 & 2048) != 0 ? appearance9.connectionQuality : null, (261631 & 4096) != 0 ? appearance9.power : null, (261631 & 8192) != 0 ? appearance9.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance9.isMiui : false, (261631 & 32768) != 0 ? appearance9.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance9.config : null, (261631 & 131072) != 0 ? appearance9.stringResources : null), 3, null);
            }
            if (iacStateCopy$default2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState");
            }
            iacActionProcessing.plusAssign(out, iacStateCopy$default2);
            f.s(null, 1, null, iacActionProcessing, iacActionProcessing.getOut());
            return;
        }
        if (this.cameraPermissionState.b()) {
            IacActionOutput out2 = iacActionProcessing.getOut();
            IacState.InUse.Alive.Incoming.Resolving resolvingCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default((IacState.InUse.Alive.Incoming.Resolving) iacActionProcessing.getState(), IncomingPreconditions.copy$default(((IacState.InUse.Alive.Incoming.Resolving) iacActionProcessing.getState()).getPreconditions(), IncomingPreconditions.Step.NotChecked.INSTANCE, 0, 2, null), null, null, null, 14, null);
            Appearance appearance10 = resolvingCopy$default.getAppearance();
            IacState.InUse.Alive.Incoming.Resolving resolvingCopy$default2 = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolvingCopy$default, null, null, null, appearance10.copy((261631 & 1) != 0 ? appearance10.callInits : null, (261631 & 2) != 0 ? appearance10.service : null, (261631 & 4) != 0 ? appearance10.screen : null, (261631 & 8) != 0 ? appearance10.app : null, (261631 & 16) != 0 ? appearance10.micPerm : null, (261631 & 32) != 0 ? appearance10.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance10.notifications : null, (261631 & 128) != 0 ? appearance10.ringingMode : null, (261631 & 256) != 0 ? appearance10.camera : null, (261631 & 512) != 0 ? appearance10.isGsmBusy : false, (261631 & 1024) != 0 ? appearance10.network : null, (261631 & 2048) != 0 ? appearance10.connectionQuality : null, (261631 & 4096) != 0 ? appearance10.power : null, (261631 & 8192) != 0 ? appearance10.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance10.isMiui : false, (261631 & 32768) != 0 ? appearance10.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance10.config : null, (261631 & 131072) != 0 ? appearance10.stringResources : null), 7, null);
            if (resolvingCopy$default2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Incoming.Resolving");
            }
            iacActionProcessing.plusAssign(out2, resolvingCopy$default2);
            return;
        }
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.AvCalls.TerminateCall(((IacState.InUse.Alive.Incoming.Resolving) iacActionProcessing.getState()).getCallId(), TerminateReason.NoMicAccess.INSTANCE));
        IacActionOutput out3 = iacActionProcessing.getOut();
        IacState state2 = iacActionProcessing.getState();
        if (state2 instanceof IacState.Idle) {
            IacState.Idle idle2 = (IacState.Idle) state2;
            Appearance appearance11 = idle2.getAppearance();
            iacStateCopy$default = IacState.Idle.copy$default(idle2, appearance11.copy((261631 & 1) != 0 ? appearance11.callInits : null, (261631 & 2) != 0 ? appearance11.service : null, (261631 & 4) != 0 ? appearance11.screen : null, (261631 & 8) != 0 ? appearance11.app : null, (261631 & 16) != 0 ? appearance11.micPerm : null, (261631 & 32) != 0 ? appearance11.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance11.notifications : null, (261631 & 128) != 0 ? appearance11.ringingMode : null, (261631 & 256) != 0 ? appearance11.camera : null, (261631 & 512) != 0 ? appearance11.isGsmBusy : false, (261631 & 1024) != 0 ? appearance11.network : null, (261631 & 2048) != 0 ? appearance11.connectionQuality : null, (261631 & 4096) != 0 ? appearance11.power : null, (261631 & 8192) != 0 ? appearance11.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance11.isMiui : false, (261631 & 32768) != 0 ? appearance11.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance11.config : null, (261631 & 131072) != 0 ? appearance11.stringResources : null), null, 2, null);
        } else if (state2 instanceof IacState.InUse.Alive.Outgoing.Launching) {
            IacState.InUse.Alive.Outgoing.Launching launching2 = (IacState.InUse.Alive.Outgoing.Launching) state2;
            Appearance appearance12 = launching2.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching2, null, null, appearance12.copy((261631 & 1) != 0 ? appearance12.callInits : null, (261631 & 2) != 0 ? appearance12.service : null, (261631 & 4) != 0 ? appearance12.screen : null, (261631 & 8) != 0 ? appearance12.app : null, (261631 & 16) != 0 ? appearance12.micPerm : null, (261631 & 32) != 0 ? appearance12.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance12.notifications : null, (261631 & 128) != 0 ? appearance12.ringingMode : null, (261631 & 256) != 0 ? appearance12.camera : null, (261631 & 512) != 0 ? appearance12.isGsmBusy : false, (261631 & 1024) != 0 ? appearance12.network : null, (261631 & 2048) != 0 ? appearance12.connectionQuality : null, (261631 & 4096) != 0 ? appearance12.power : null, (261631 & 8192) != 0 ? appearance12.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance12.isMiui : false, (261631 & 32768) != 0 ? appearance12.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance12.config : null, (261631 & 131072) != 0 ? appearance12.stringResources : null), 3, null);
        } else if (state2 instanceof IacState.InUse.Alive.Outgoing.Resolving) {
            IacState.InUse.Alive.Outgoing.Resolving resolving3 = (IacState.InUse.Alive.Outgoing.Resolving) state2;
            Appearance appearance13 = resolving3.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving3, null, null, null, appearance13.copy((261631 & 1) != 0 ? appearance13.callInits : null, (261631 & 2) != 0 ? appearance13.service : null, (261631 & 4) != 0 ? appearance13.screen : null, (261631 & 8) != 0 ? appearance13.app : null, (261631 & 16) != 0 ? appearance13.micPerm : null, (261631 & 32) != 0 ? appearance13.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance13.notifications : null, (261631 & 128) != 0 ? appearance13.ringingMode : null, (261631 & 256) != 0 ? appearance13.camera : null, (261631 & 512) != 0 ? appearance13.isGsmBusy : false, (261631 & 1024) != 0 ? appearance13.network : null, (261631 & 2048) != 0 ? appearance13.connectionQuality : null, (261631 & 4096) != 0 ? appearance13.power : null, (261631 & 8192) != 0 ? appearance13.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance13.isMiui : false, (261631 & 32768) != 0 ? appearance13.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance13.config : null, (261631 & 131072) != 0 ? appearance13.stringResources : null), 7, null);
        } else if (state2 instanceof IacState.InUse.Alive.Outgoing.Waiting) {
            IacState.InUse.Alive.Outgoing.Waiting waiting3 = (IacState.InUse.Alive.Outgoing.Waiting) state2;
            Appearance appearance14 = waiting3.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting3, null, null, appearance14.copy((261631 & 1) != 0 ? appearance14.callInits : null, (261631 & 2) != 0 ? appearance14.service : null, (261631 & 4) != 0 ? appearance14.screen : null, (261631 & 8) != 0 ? appearance14.app : null, (261631 & 16) != 0 ? appearance14.micPerm : null, (261631 & 32) != 0 ? appearance14.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance14.notifications : null, (261631 & 128) != 0 ? appearance14.ringingMode : null, (261631 & 256) != 0 ? appearance14.camera : null, (261631 & 512) != 0 ? appearance14.isGsmBusy : false, (261631 & 1024) != 0 ? appearance14.network : null, (261631 & 2048) != 0 ? appearance14.connectionQuality : null, (261631 & 4096) != 0 ? appearance14.power : null, (261631 & 8192) != 0 ? appearance14.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance14.isMiui : false, (261631 & 32768) != 0 ? appearance14.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance14.config : null, (261631 & 131072) != 0 ? appearance14.stringResources : null), 3, null);
        } else if (state2 instanceof IacState.InUse.Alive.Incoming.Waiting) {
            IacState.InUse.Alive.Incoming.Waiting waiting4 = (IacState.InUse.Alive.Incoming.Waiting) state2;
            Appearance appearance15 = waiting4.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting4, null, null, appearance15.copy((261631 & 1) != 0 ? appearance15.callInits : null, (261631 & 2) != 0 ? appearance15.service : null, (261631 & 4) != 0 ? appearance15.screen : null, (261631 & 8) != 0 ? appearance15.app : null, (261631 & 16) != 0 ? appearance15.micPerm : null, (261631 & 32) != 0 ? appearance15.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance15.notifications : null, (261631 & 128) != 0 ? appearance15.ringingMode : null, (261631 & 256) != 0 ? appearance15.camera : null, (261631 & 512) != 0 ? appearance15.isGsmBusy : false, (261631 & 1024) != 0 ? appearance15.network : null, (261631 & 2048) != 0 ? appearance15.connectionQuality : null, (261631 & 4096) != 0 ? appearance15.power : null, (261631 & 8192) != 0 ? appearance15.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance15.isMiui : false, (261631 & 32768) != 0 ? appearance15.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance15.config : null, (261631 & 131072) != 0 ? appearance15.stringResources : null), 3, null);
        } else if (state2 instanceof IacState.InUse.Alive.Incoming.Resolving) {
            IacState.InUse.Alive.Incoming.Resolving resolving4 = (IacState.InUse.Alive.Incoming.Resolving) state2;
            Appearance appearance16 = resolving4.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving4, null, null, null, appearance16.copy((261631 & 1) != 0 ? appearance16.callInits : null, (261631 & 2) != 0 ? appearance16.service : null, (261631 & 4) != 0 ? appearance16.screen : null, (261631 & 8) != 0 ? appearance16.app : null, (261631 & 16) != 0 ? appearance16.micPerm : null, (261631 & 32) != 0 ? appearance16.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance16.notifications : null, (261631 & 128) != 0 ? appearance16.ringingMode : null, (261631 & 256) != 0 ? appearance16.camera : null, (261631 & 512) != 0 ? appearance16.isGsmBusy : false, (261631 & 1024) != 0 ? appearance16.network : null, (261631 & 2048) != 0 ? appearance16.connectionQuality : null, (261631 & 4096) != 0 ? appearance16.power : null, (261631 & 8192) != 0 ? appearance16.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance16.isMiui : false, (261631 & 32768) != 0 ? appearance16.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance16.config : null, (261631 & 131072) != 0 ? appearance16.stringResources : null), 7, null);
        } else if (state2 instanceof IacState.InUse.Alive.Incoming.Accepting) {
            IacState.InUse.Alive.Incoming.Accepting accepting2 = (IacState.InUse.Alive.Incoming.Accepting) state2;
            Appearance appearance17 = accepting2.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting2, null, null, appearance17.copy((261631 & 1) != 0 ? appearance17.callInits : null, (261631 & 2) != 0 ? appearance17.service : null, (261631 & 4) != 0 ? appearance17.screen : null, (261631 & 8) != 0 ? appearance17.app : null, (261631 & 16) != 0 ? appearance17.micPerm : null, (261631 & 32) != 0 ? appearance17.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance17.notifications : null, (261631 & 128) != 0 ? appearance17.ringingMode : null, (261631 & 256) != 0 ? appearance17.camera : null, (261631 & 512) != 0 ? appearance17.isGsmBusy : false, (261631 & 1024) != 0 ? appearance17.network : null, (261631 & 2048) != 0 ? appearance17.connectionQuality : null, (261631 & 4096) != 0 ? appearance17.power : null, (261631 & 8192) != 0 ? appearance17.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance17.isMiui : false, (261631 & 32768) != 0 ? appearance17.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance17.config : null, (261631 & 131072) != 0 ? appearance17.stringResources : null), 3, null);
        } else if (state2 instanceof IacState.InUse.Alive.Talking) {
            IacState.InUse.Alive.Talking talking2 = (IacState.InUse.Alive.Talking) state2;
            Appearance appearance18 = talking2.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking2, null, null, appearance18.copy((261631 & 1) != 0 ? appearance18.callInits : null, (261631 & 2) != 0 ? appearance18.service : null, (261631 & 4) != 0 ? appearance18.screen : null, (261631 & 8) != 0 ? appearance18.app : null, (261631 & 16) != 0 ? appearance18.micPerm : null, (261631 & 32) != 0 ? appearance18.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance18.notifications : null, (261631 & 128) != 0 ? appearance18.ringingMode : null, (261631 & 256) != 0 ? appearance18.camera : null, (261631 & 512) != 0 ? appearance18.isGsmBusy : false, (261631 & 1024) != 0 ? appearance18.network : null, (261631 & 2048) != 0 ? appearance18.connectionQuality : null, (261631 & 4096) != 0 ? appearance18.power : null, (261631 & 8192) != 0 ? appearance18.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance18.isMiui : false, (261631 & 32768) != 0 ? appearance18.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance18.config : null, (261631 & 131072) != 0 ? appearance18.stringResources : null), 3, null);
        } else {
            if (!(state2 instanceof IacState.InUse.Finished)) {
                throw new NoWhenBranchMatchedException();
            }
            IacState.InUse.Finished finished2 = (IacState.InUse.Finished) state2;
            Appearance appearance19 = finished2.getAppearance();
            iacStateCopy$default = IacState.InUse.Finished.copy$default(finished2, null, null, appearance19.copy((261631 & 1) != 0 ? appearance19.callInits : null, (261631 & 2) != 0 ? appearance19.service : null, (261631 & 4) != 0 ? appearance19.screen : null, (261631 & 8) != 0 ? appearance19.app : null, (261631 & 16) != 0 ? appearance19.micPerm : null, (261631 & 32) != 0 ? appearance19.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance19.notifications : null, (261631 & 128) != 0 ? appearance19.ringingMode : null, (261631 & 256) != 0 ? appearance19.camera : null, (261631 & 512) != 0 ? appearance19.isGsmBusy : false, (261631 & 1024) != 0 ? appearance19.network : null, (261631 & 2048) != 0 ? appearance19.connectionQuality : null, (261631 & 4096) != 0 ? appearance19.power : null, (261631 & 8192) != 0 ? appearance19.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance19.isMiui : false, (261631 & 32768) != 0 ? appearance19.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance19.config : null, (261631 & 131072) != 0 ? appearance19.stringResources : null), 3, null);
        }
        if (iacStateCopy$default == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Incoming.Resolving");
        }
        iacActionProcessing.plusAssign(out3, (IacState.InUse.Alive.Incoming.Resolving) iacStateCopy$default);
    }

    @k
    public String toString() {
        return "OnIncomingCameraPermissionResultAction(cameraPermissionState=" + this.cameraPermissionState + ')';
    }
}
