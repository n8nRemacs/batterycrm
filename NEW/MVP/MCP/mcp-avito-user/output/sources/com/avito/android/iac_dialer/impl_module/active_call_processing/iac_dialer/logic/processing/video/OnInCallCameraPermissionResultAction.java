package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.video;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.Appearance;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.r;
import com.avito.android.permissions.PermissionState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: OnInCallCameraPermissionResultAction.kt */
@P
@s0
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u000f\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/video/OnInCallCameraPermissionResultAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "Lcom/avito/android/permissions/PermissionState;", "cameraPermissionState", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "<init>", "(Lcom/avito/android/permissions/PermissionState;Ljava/lang/String;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Lcom/avito/android/permissions/PermissionState;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/permissions/PermissionState;Ljava/lang/String;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/video/OnInCallCameraPermissionResultAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/permissions/PermissionState;", "getCameraPermissionState", "Ljava/lang/String;", "getCallId", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnInCallCameraPermissionResultAction implements IacAction {
    public static final int $stable = 0;

    @k
    private final String callId;

    @k
    private final PermissionState cameraPermissionState;

    public OnInCallCameraPermissionResultAction(@k PermissionState permissionState, @k String str) {
        this.cameraPermissionState = permissionState;
        this.callId = str;
    }

    public static /* synthetic */ OnInCallCameraPermissionResultAction copy$default(OnInCallCameraPermissionResultAction onInCallCameraPermissionResultAction, PermissionState permissionState, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            permissionState = onInCallCameraPermissionResultAction.cameraPermissionState;
        }
        if ((i12 & 2) != 0) {
            str = onInCallCameraPermissionResultAction.callId;
        }
        return onInCallCameraPermissionResultAction.copy(permissionState, str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final PermissionState getCameraPermissionState() {
        return this.cameraPermissionState;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @k
    public final OnInCallCameraPermissionResultAction copy(@k PermissionState cameraPermissionState, @k String callId) {
        return new OnInCallCameraPermissionResultAction(cameraPermissionState, callId);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnInCallCameraPermissionResultAction)) {
            return false;
        }
        OnInCallCameraPermissionResultAction onInCallCameraPermissionResultAction = (OnInCallCameraPermissionResultAction) other;
        return this.cameraPermissionState == onInCallCameraPermissionResultAction.cameraPermissionState && L.f(this.callId, onInCallCameraPermissionResultAction.callId);
    }

    @k
    public final String getCallId() {
        return this.callId;
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
        return this.callId.hashCode() + (this.cameraPermissionState.hashCode() * 31);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        IacState iacStateCopy$default;
        IacActionOutput out = iacActionProcessing.getOut();
        IacState state = iacActionProcessing.getState();
        if (state instanceof IacState.Idle) {
            IacState.Idle idle = (IacState.Idle) state;
            Appearance appearance = idle.getAppearance();
            iacStateCopy$default = IacState.Idle.copy$default(idle, appearance.copy((261631 & 1) != 0 ? appearance.callInits : null, (261631 & 2) != 0 ? appearance.service : null, (261631 & 4) != 0 ? appearance.screen : null, (261631 & 8) != 0 ? appearance.app : null, (261631 & 16) != 0 ? appearance.micPerm : null, (261631 & 32) != 0 ? appearance.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance.notifications : null, (261631 & 128) != 0 ? appearance.ringingMode : null, (261631 & 256) != 0 ? appearance.camera : null, (261631 & 512) != 0 ? appearance.isGsmBusy : false, (261631 & 1024) != 0 ? appearance.network : null, (261631 & 2048) != 0 ? appearance.connectionQuality : null, (261631 & 4096) != 0 ? appearance.power : null, (261631 & 8192) != 0 ? appearance.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance.isMiui : false, (261631 & 32768) != 0 ? appearance.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance.config : null, (261631 & 131072) != 0 ? appearance.stringResources : null), null, 2, null);
        } else if (state instanceof IacState.InUse.Alive.Outgoing.Launching) {
            IacState.InUse.Alive.Outgoing.Launching launching = (IacState.InUse.Alive.Outgoing.Launching) state;
            Appearance appearance2 = launching.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching, null, null, appearance2.copy((261631 & 1) != 0 ? appearance2.callInits : null, (261631 & 2) != 0 ? appearance2.service : null, (261631 & 4) != 0 ? appearance2.screen : null, (261631 & 8) != 0 ? appearance2.app : null, (261631 & 16) != 0 ? appearance2.micPerm : null, (261631 & 32) != 0 ? appearance2.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance2.notifications : null, (261631 & 128) != 0 ? appearance2.ringingMode : null, (261631 & 256) != 0 ? appearance2.camera : null, (261631 & 512) != 0 ? appearance2.isGsmBusy : false, (261631 & 1024) != 0 ? appearance2.network : null, (261631 & 2048) != 0 ? appearance2.connectionQuality : null, (261631 & 4096) != 0 ? appearance2.power : null, (261631 & 8192) != 0 ? appearance2.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance2.isMiui : false, (261631 & 32768) != 0 ? appearance2.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance2.config : null, (261631 & 131072) != 0 ? appearance2.stringResources : null), 3, null);
        } else if (state instanceof IacState.InUse.Alive.Outgoing.Resolving) {
            IacState.InUse.Alive.Outgoing.Resolving resolving = (IacState.InUse.Alive.Outgoing.Resolving) state;
            Appearance appearance3 = resolving.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving, null, null, null, appearance3.copy((261631 & 1) != 0 ? appearance3.callInits : null, (261631 & 2) != 0 ? appearance3.service : null, (261631 & 4) != 0 ? appearance3.screen : null, (261631 & 8) != 0 ? appearance3.app : null, (261631 & 16) != 0 ? appearance3.micPerm : null, (261631 & 32) != 0 ? appearance3.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance3.notifications : null, (261631 & 128) != 0 ? appearance3.ringingMode : null, (261631 & 256) != 0 ? appearance3.camera : null, (261631 & 512) != 0 ? appearance3.isGsmBusy : false, (261631 & 1024) != 0 ? appearance3.network : null, (261631 & 2048) != 0 ? appearance3.connectionQuality : null, (261631 & 4096) != 0 ? appearance3.power : null, (261631 & 8192) != 0 ? appearance3.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance3.isMiui : false, (261631 & 32768) != 0 ? appearance3.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance3.config : null, (261631 & 131072) != 0 ? appearance3.stringResources : null), 7, null);
        } else if (state instanceof IacState.InUse.Alive.Outgoing.Waiting) {
            IacState.InUse.Alive.Outgoing.Waiting waiting = (IacState.InUse.Alive.Outgoing.Waiting) state;
            Appearance appearance4 = waiting.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting, null, null, appearance4.copy((261631 & 1) != 0 ? appearance4.callInits : null, (261631 & 2) != 0 ? appearance4.service : null, (261631 & 4) != 0 ? appearance4.screen : null, (261631 & 8) != 0 ? appearance4.app : null, (261631 & 16) != 0 ? appearance4.micPerm : null, (261631 & 32) != 0 ? appearance4.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance4.notifications : null, (261631 & 128) != 0 ? appearance4.ringingMode : null, (261631 & 256) != 0 ? appearance4.camera : null, (261631 & 512) != 0 ? appearance4.isGsmBusy : false, (261631 & 1024) != 0 ? appearance4.network : null, (261631 & 2048) != 0 ? appearance4.connectionQuality : null, (261631 & 4096) != 0 ? appearance4.power : null, (261631 & 8192) != 0 ? appearance4.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance4.isMiui : false, (261631 & 32768) != 0 ? appearance4.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance4.config : null, (261631 & 131072) != 0 ? appearance4.stringResources : null), 3, null);
        } else if (state instanceof IacState.InUse.Alive.Incoming.Waiting) {
            IacState.InUse.Alive.Incoming.Waiting waiting2 = (IacState.InUse.Alive.Incoming.Waiting) state;
            Appearance appearance5 = waiting2.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting2, null, null, appearance5.copy((261631 & 1) != 0 ? appearance5.callInits : null, (261631 & 2) != 0 ? appearance5.service : null, (261631 & 4) != 0 ? appearance5.screen : null, (261631 & 8) != 0 ? appearance5.app : null, (261631 & 16) != 0 ? appearance5.micPerm : null, (261631 & 32) != 0 ? appearance5.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance5.notifications : null, (261631 & 128) != 0 ? appearance5.ringingMode : null, (261631 & 256) != 0 ? appearance5.camera : null, (261631 & 512) != 0 ? appearance5.isGsmBusy : false, (261631 & 1024) != 0 ? appearance5.network : null, (261631 & 2048) != 0 ? appearance5.connectionQuality : null, (261631 & 4096) != 0 ? appearance5.power : null, (261631 & 8192) != 0 ? appearance5.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance5.isMiui : false, (261631 & 32768) != 0 ? appearance5.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance5.config : null, (261631 & 131072) != 0 ? appearance5.stringResources : null), 3, null);
        } else if (state instanceof IacState.InUse.Alive.Incoming.Resolving) {
            IacState.InUse.Alive.Incoming.Resolving resolving2 = (IacState.InUse.Alive.Incoming.Resolving) state;
            Appearance appearance6 = resolving2.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving2, null, null, null, appearance6.copy((261631 & 1) != 0 ? appearance6.callInits : null, (261631 & 2) != 0 ? appearance6.service : null, (261631 & 4) != 0 ? appearance6.screen : null, (261631 & 8) != 0 ? appearance6.app : null, (261631 & 16) != 0 ? appearance6.micPerm : null, (261631 & 32) != 0 ? appearance6.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance6.notifications : null, (261631 & 128) != 0 ? appearance6.ringingMode : null, (261631 & 256) != 0 ? appearance6.camera : null, (261631 & 512) != 0 ? appearance6.isGsmBusy : false, (261631 & 1024) != 0 ? appearance6.network : null, (261631 & 2048) != 0 ? appearance6.connectionQuality : null, (261631 & 4096) != 0 ? appearance6.power : null, (261631 & 8192) != 0 ? appearance6.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance6.isMiui : false, (261631 & 32768) != 0 ? appearance6.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance6.config : null, (261631 & 131072) != 0 ? appearance6.stringResources : null), 7, null);
        } else if (state instanceof IacState.InUse.Alive.Incoming.Accepting) {
            IacState.InUse.Alive.Incoming.Accepting accepting = (IacState.InUse.Alive.Incoming.Accepting) state;
            Appearance appearance7 = accepting.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting, null, null, appearance7.copy((261631 & 1) != 0 ? appearance7.callInits : null, (261631 & 2) != 0 ? appearance7.service : null, (261631 & 4) != 0 ? appearance7.screen : null, (261631 & 8) != 0 ? appearance7.app : null, (261631 & 16) != 0 ? appearance7.micPerm : null, (261631 & 32) != 0 ? appearance7.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance7.notifications : null, (261631 & 128) != 0 ? appearance7.ringingMode : null, (261631 & 256) != 0 ? appearance7.camera : null, (261631 & 512) != 0 ? appearance7.isGsmBusy : false, (261631 & 1024) != 0 ? appearance7.network : null, (261631 & 2048) != 0 ? appearance7.connectionQuality : null, (261631 & 4096) != 0 ? appearance7.power : null, (261631 & 8192) != 0 ? appearance7.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance7.isMiui : false, (261631 & 32768) != 0 ? appearance7.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance7.config : null, (261631 & 131072) != 0 ? appearance7.stringResources : null), 3, null);
        } else if (state instanceof IacState.InUse.Alive.Talking) {
            IacState.InUse.Alive.Talking talking = (IacState.InUse.Alive.Talking) state;
            Appearance appearance8 = talking.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking, null, null, appearance8.copy((261631 & 1) != 0 ? appearance8.callInits : null, (261631 & 2) != 0 ? appearance8.service : null, (261631 & 4) != 0 ? appearance8.screen : null, (261631 & 8) != 0 ? appearance8.app : null, (261631 & 16) != 0 ? appearance8.micPerm : null, (261631 & 32) != 0 ? appearance8.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance8.notifications : null, (261631 & 128) != 0 ? appearance8.ringingMode : null, (261631 & 256) != 0 ? appearance8.camera : null, (261631 & 512) != 0 ? appearance8.isGsmBusy : false, (261631 & 1024) != 0 ? appearance8.network : null, (261631 & 2048) != 0 ? appearance8.connectionQuality : null, (261631 & 4096) != 0 ? appearance8.power : null, (261631 & 8192) != 0 ? appearance8.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance8.isMiui : false, (261631 & 32768) != 0 ? appearance8.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance8.config : null, (261631 & 131072) != 0 ? appearance8.stringResources : null), 3, null);
        } else {
            if (!(state instanceof IacState.InUse.Finished)) {
                throw new NoWhenBranchMatchedException();
            }
            IacState.InUse.Finished finished = (IacState.InUse.Finished) state;
            Appearance appearance9 = finished.getAppearance();
            iacStateCopy$default = IacState.InUse.Finished.copy$default(finished, null, null, appearance9.copy((261631 & 1) != 0 ? appearance9.callInits : null, (261631 & 2) != 0 ? appearance9.service : null, (261631 & 4) != 0 ? appearance9.screen : null, (261631 & 8) != 0 ? appearance9.app : null, (261631 & 16) != 0 ? appearance9.micPerm : null, (261631 & 32) != 0 ? appearance9.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance9.notifications : null, (261631 & 128) != 0 ? appearance9.ringingMode : null, (261631 & 256) != 0 ? appearance9.camera : null, (261631 & 512) != 0 ? appearance9.isGsmBusy : false, (261631 & 1024) != 0 ? appearance9.network : null, (261631 & 2048) != 0 ? appearance9.connectionQuality : null, (261631 & 4096) != 0 ? appearance9.power : null, (261631 & 8192) != 0 ? appearance9.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance9.isMiui : false, (261631 & 32768) != 0 ? appearance9.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance9.config : null, (261631 & 131072) != 0 ? appearance9.stringResources : null), 3, null);
        }
        if (iacStateCopy$default == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState");
        }
        iacActionProcessing.plusAssign(out, iacStateCopy$default);
        if (!(iacActionProcessing.getState() instanceof IacState.InUse) || !com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.e.b(iacActionProcessing.getState()) || !L.f(((IacState.InUse) iacActionProcessing.getState()).getCallId(), this.callId)) {
            com.avito.android.bxcontent.mvi.entity.f.s(null, 1, null, iacActionProcessing, iacActionProcessing.getOut());
        } else if (this.cameraPermissionState.b()) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.AvCalls.EnableSendingVideo(((IacState.InUse) iacActionProcessing.getState()).getCallId(), true ^ ((IacState.InUse) iacActionProcessing.getState()).getCall().getLocalSendingVideo()));
        } else {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new r("camera permission was not granted"));
        }
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("OnInCallCameraPermissionResultAction(cameraPermissionState=");
        sb2.append(this.cameraPermissionState);
        sb2.append(", callId=");
        return C22026a.c(sb2, this.callId, ')');
    }
}
