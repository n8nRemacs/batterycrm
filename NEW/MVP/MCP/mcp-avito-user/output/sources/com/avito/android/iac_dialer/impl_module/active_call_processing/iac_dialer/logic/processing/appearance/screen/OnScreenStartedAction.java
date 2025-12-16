package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.appearance.screen;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.Appearance;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params.CallParams;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.r;
import com.avito.android.permissions.PermissionState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: OnScreenStartedAction.kt */
@P
@s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u0010¨\u0006\""}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/appearance/screen/OnScreenStartedAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "", "screenId", "Lcom/avito/android/permissions/PermissionState;", "micPermissionState", "cameraPermissionState", "<init>", "(ILcom/avito/android/permissions/PermissionState;Lcom/avito/android/permissions/PermissionState;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()I", "component2", "()Lcom/avito/android/permissions/PermissionState;", "component3", "copy", "(ILcom/avito/android/permissions/PermissionState;Lcom/avito/android/permissions/PermissionState;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/appearance/screen/OnScreenStartedAction;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "I", "getScreenId", "Lcom/avito/android/permissions/PermissionState;", "getMicPermissionState", "getCameraPermissionState", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnScreenStartedAction implements IacAction {
    public static final int $stable = 0;

    @k
    private final PermissionState cameraPermissionState;

    @k
    private final PermissionState micPermissionState;
    private final int screenId;

    public OnScreenStartedAction(int i12, @k PermissionState permissionState, @k PermissionState permissionState2) {
        this.screenId = i12;
        this.micPermissionState = permissionState;
        this.cameraPermissionState = permissionState2;
    }

    public static /* synthetic */ OnScreenStartedAction copy$default(OnScreenStartedAction onScreenStartedAction, int i12, PermissionState permissionState, PermissionState permissionState2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = onScreenStartedAction.screenId;
        }
        if ((i13 & 2) != 0) {
            permissionState = onScreenStartedAction.micPermissionState;
        }
        if ((i13 & 4) != 0) {
            permissionState2 = onScreenStartedAction.cameraPermissionState;
        }
        return onScreenStartedAction.copy(i12, permissionState, permissionState2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getScreenId() {
        return this.screenId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final PermissionState getMicPermissionState() {
        return this.micPermissionState;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final PermissionState getCameraPermissionState() {
        return this.cameraPermissionState;
    }

    @k
    public final OnScreenStartedAction copy(int screenId, @k PermissionState micPermissionState, @k PermissionState cameraPermissionState) {
        return new OnScreenStartedAction(screenId, micPermissionState, cameraPermissionState);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnScreenStartedAction)) {
            return false;
        }
        OnScreenStartedAction onScreenStartedAction = (OnScreenStartedAction) other;
        return this.screenId == onScreenStartedAction.screenId && this.micPermissionState == onScreenStartedAction.micPermissionState && this.cameraPermissionState == onScreenStartedAction.cameraPermissionState;
    }

    @k
    public final PermissionState getCameraPermissionState() {
        return this.cameraPermissionState;
    }

    @k
    public final PermissionState getMicPermissionState() {
        return this.micPermissionState;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    public final int getScreenId() {
        return this.screenId;
    }

    public int hashCode() {
        return this.cameraPermissionState.hashCode() + ((this.micPermissionState.hashCode() + (Integer.hashCode(this.screenId) * 31)) * 31);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        IacState iacStateCopy$default;
        if (iacActionProcessing.getState().getAppearance().getScreen().getId() != this.screenId) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new r("ignore changes of old screen instance"));
            return;
        }
        IacActionOutput out = iacActionProcessing.getOut();
        IacState state = iacActionProcessing.getState();
        if (state instanceof IacState.Idle) {
            IacState.Idle idle = (IacState.Idle) state;
            Appearance appearance = idle.getAppearance();
            iacStateCopy$default = IacState.Idle.copy$default(idle, appearance.copy((261631 & 1) != 0 ? appearance.callInits : null, (261631 & 2) != 0 ? appearance.service : null, (261631 & 4) != 0 ? appearance.screen : new LifecycleStatus.Components.Started(this.screenId), (261631 & 8) != 0 ? appearance.app : null, (261631 & 16) != 0 ? appearance.micPerm : this.micPermissionState, (261631 & 32) != 0 ? appearance.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance.notifications : null, (261631 & 128) != 0 ? appearance.ringingMode : null, (261631 & 256) != 0 ? appearance.camera : null, (261631 & 512) != 0 ? appearance.isGsmBusy : false, (261631 & 1024) != 0 ? appearance.network : null, (261631 & 2048) != 0 ? appearance.connectionQuality : null, (261631 & 4096) != 0 ? appearance.power : null, (261631 & 8192) != 0 ? appearance.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance.isMiui : false, (261631 & 32768) != 0 ? appearance.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance.config : null, (261631 & 131072) != 0 ? appearance.stringResources : null), null, 2, null);
        } else if (state instanceof IacState.InUse.Alive.Outgoing.Launching) {
            IacState.InUse.Alive.Outgoing.Launching launching = (IacState.InUse.Alive.Outgoing.Launching) state;
            Appearance appearance2 = launching.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching, null, null, appearance2.copy((261631 & 1) != 0 ? appearance2.callInits : null, (261631 & 2) != 0 ? appearance2.service : null, (261631 & 4) != 0 ? appearance2.screen : new LifecycleStatus.Components.Started(this.screenId), (261631 & 8) != 0 ? appearance2.app : null, (261631 & 16) != 0 ? appearance2.micPerm : this.micPermissionState, (261631 & 32) != 0 ? appearance2.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance2.notifications : null, (261631 & 128) != 0 ? appearance2.ringingMode : null, (261631 & 256) != 0 ? appearance2.camera : null, (261631 & 512) != 0 ? appearance2.isGsmBusy : false, (261631 & 1024) != 0 ? appearance2.network : null, (261631 & 2048) != 0 ? appearance2.connectionQuality : null, (261631 & 4096) != 0 ? appearance2.power : null, (261631 & 8192) != 0 ? appearance2.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance2.isMiui : false, (261631 & 32768) != 0 ? appearance2.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance2.config : null, (261631 & 131072) != 0 ? appearance2.stringResources : null), 3, null);
        } else if (state instanceof IacState.InUse.Alive.Outgoing.Resolving) {
            IacState.InUse.Alive.Outgoing.Resolving resolving = (IacState.InUse.Alive.Outgoing.Resolving) state;
            Appearance appearance3 = resolving.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving, null, null, null, appearance3.copy((261631 & 1) != 0 ? appearance3.callInits : null, (261631 & 2) != 0 ? appearance3.service : null, (261631 & 4) != 0 ? appearance3.screen : new LifecycleStatus.Components.Started(this.screenId), (261631 & 8) != 0 ? appearance3.app : null, (261631 & 16) != 0 ? appearance3.micPerm : this.micPermissionState, (261631 & 32) != 0 ? appearance3.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance3.notifications : null, (261631 & 128) != 0 ? appearance3.ringingMode : null, (261631 & 256) != 0 ? appearance3.camera : null, (261631 & 512) != 0 ? appearance3.isGsmBusy : false, (261631 & 1024) != 0 ? appearance3.network : null, (261631 & 2048) != 0 ? appearance3.connectionQuality : null, (261631 & 4096) != 0 ? appearance3.power : null, (261631 & 8192) != 0 ? appearance3.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance3.isMiui : false, (261631 & 32768) != 0 ? appearance3.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance3.config : null, (261631 & 131072) != 0 ? appearance3.stringResources : null), 7, null);
        } else if (state instanceof IacState.InUse.Alive.Outgoing.Waiting) {
            IacState.InUse.Alive.Outgoing.Waiting waiting = (IacState.InUse.Alive.Outgoing.Waiting) state;
            Appearance appearance4 = waiting.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting, null, null, appearance4.copy((261631 & 1) != 0 ? appearance4.callInits : null, (261631 & 2) != 0 ? appearance4.service : null, (261631 & 4) != 0 ? appearance4.screen : new LifecycleStatus.Components.Started(this.screenId), (261631 & 8) != 0 ? appearance4.app : null, (261631 & 16) != 0 ? appearance4.micPerm : this.micPermissionState, (261631 & 32) != 0 ? appearance4.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance4.notifications : null, (261631 & 128) != 0 ? appearance4.ringingMode : null, (261631 & 256) != 0 ? appearance4.camera : null, (261631 & 512) != 0 ? appearance4.isGsmBusy : false, (261631 & 1024) != 0 ? appearance4.network : null, (261631 & 2048) != 0 ? appearance4.connectionQuality : null, (261631 & 4096) != 0 ? appearance4.power : null, (261631 & 8192) != 0 ? appearance4.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance4.isMiui : false, (261631 & 32768) != 0 ? appearance4.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance4.config : null, (261631 & 131072) != 0 ? appearance4.stringResources : null), 3, null);
        } else if (state instanceof IacState.InUse.Alive.Incoming.Waiting) {
            IacState.InUse.Alive.Incoming.Waiting waiting2 = (IacState.InUse.Alive.Incoming.Waiting) state;
            Appearance appearance5 = waiting2.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting2, null, null, appearance5.copy((261631 & 1) != 0 ? appearance5.callInits : null, (261631 & 2) != 0 ? appearance5.service : null, (261631 & 4) != 0 ? appearance5.screen : new LifecycleStatus.Components.Started(this.screenId), (261631 & 8) != 0 ? appearance5.app : null, (261631 & 16) != 0 ? appearance5.micPerm : this.micPermissionState, (261631 & 32) != 0 ? appearance5.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance5.notifications : null, (261631 & 128) != 0 ? appearance5.ringingMode : null, (261631 & 256) != 0 ? appearance5.camera : null, (261631 & 512) != 0 ? appearance5.isGsmBusy : false, (261631 & 1024) != 0 ? appearance5.network : null, (261631 & 2048) != 0 ? appearance5.connectionQuality : null, (261631 & 4096) != 0 ? appearance5.power : null, (261631 & 8192) != 0 ? appearance5.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance5.isMiui : false, (261631 & 32768) != 0 ? appearance5.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance5.config : null, (261631 & 131072) != 0 ? appearance5.stringResources : null), 3, null);
        } else if (state instanceof IacState.InUse.Alive.Incoming.Resolving) {
            IacState.InUse.Alive.Incoming.Resolving resolving2 = (IacState.InUse.Alive.Incoming.Resolving) state;
            Appearance appearance6 = resolving2.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving2, null, null, null, appearance6.copy((261631 & 1) != 0 ? appearance6.callInits : null, (261631 & 2) != 0 ? appearance6.service : null, (261631 & 4) != 0 ? appearance6.screen : new LifecycleStatus.Components.Started(this.screenId), (261631 & 8) != 0 ? appearance6.app : null, (261631 & 16) != 0 ? appearance6.micPerm : this.micPermissionState, (261631 & 32) != 0 ? appearance6.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance6.notifications : null, (261631 & 128) != 0 ? appearance6.ringingMode : null, (261631 & 256) != 0 ? appearance6.camera : null, (261631 & 512) != 0 ? appearance6.isGsmBusy : false, (261631 & 1024) != 0 ? appearance6.network : null, (261631 & 2048) != 0 ? appearance6.connectionQuality : null, (261631 & 4096) != 0 ? appearance6.power : null, (261631 & 8192) != 0 ? appearance6.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance6.isMiui : false, (261631 & 32768) != 0 ? appearance6.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance6.config : null, (261631 & 131072) != 0 ? appearance6.stringResources : null), 7, null);
        } else if (state instanceof IacState.InUse.Alive.Incoming.Accepting) {
            IacState.InUse.Alive.Incoming.Accepting accepting = (IacState.InUse.Alive.Incoming.Accepting) state;
            Appearance appearance7 = accepting.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting, null, null, appearance7.copy((261631 & 1) != 0 ? appearance7.callInits : null, (261631 & 2) != 0 ? appearance7.service : null, (261631 & 4) != 0 ? appearance7.screen : new LifecycleStatus.Components.Started(this.screenId), (261631 & 8) != 0 ? appearance7.app : null, (261631 & 16) != 0 ? appearance7.micPerm : this.micPermissionState, (261631 & 32) != 0 ? appearance7.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance7.notifications : null, (261631 & 128) != 0 ? appearance7.ringingMode : null, (261631 & 256) != 0 ? appearance7.camera : null, (261631 & 512) != 0 ? appearance7.isGsmBusy : false, (261631 & 1024) != 0 ? appearance7.network : null, (261631 & 2048) != 0 ? appearance7.connectionQuality : null, (261631 & 4096) != 0 ? appearance7.power : null, (261631 & 8192) != 0 ? appearance7.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance7.isMiui : false, (261631 & 32768) != 0 ? appearance7.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance7.config : null, (261631 & 131072) != 0 ? appearance7.stringResources : null), 3, null);
        } else if (state instanceof IacState.InUse.Alive.Talking) {
            IacState.InUse.Alive.Talking talking = (IacState.InUse.Alive.Talking) state;
            Appearance appearance8 = talking.getAppearance();
            iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking, null, null, appearance8.copy((261631 & 1) != 0 ? appearance8.callInits : null, (261631 & 2) != 0 ? appearance8.service : null, (261631 & 4) != 0 ? appearance8.screen : new LifecycleStatus.Components.Started(this.screenId), (261631 & 8) != 0 ? appearance8.app : null, (261631 & 16) != 0 ? appearance8.micPerm : this.micPermissionState, (261631 & 32) != 0 ? appearance8.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance8.notifications : null, (261631 & 128) != 0 ? appearance8.ringingMode : null, (261631 & 256) != 0 ? appearance8.camera : null, (261631 & 512) != 0 ? appearance8.isGsmBusy : false, (261631 & 1024) != 0 ? appearance8.network : null, (261631 & 2048) != 0 ? appearance8.connectionQuality : null, (261631 & 4096) != 0 ? appearance8.power : null, (261631 & 8192) != 0 ? appearance8.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance8.isMiui : false, (261631 & 32768) != 0 ? appearance8.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance8.config : null, (261631 & 131072) != 0 ? appearance8.stringResources : null), 3, null);
        } else {
            if (!(state instanceof IacState.InUse.Finished)) {
                throw new NoWhenBranchMatchedException();
            }
            IacState.InUse.Finished finished = (IacState.InUse.Finished) state;
            Appearance appearance9 = finished.getAppearance();
            iacStateCopy$default = IacState.InUse.Finished.copy$default(finished, null, null, appearance9.copy((261631 & 1) != 0 ? appearance9.callInits : null, (261631 & 2) != 0 ? appearance9.service : null, (261631 & 4) != 0 ? appearance9.screen : new LifecycleStatus.Components.Started(this.screenId), (261631 & 8) != 0 ? appearance9.app : null, (261631 & 16) != 0 ? appearance9.micPerm : this.micPermissionState, (261631 & 32) != 0 ? appearance9.cameraPerm : this.cameraPermissionState, (261631 & 64) != 0 ? appearance9.notifications : null, (261631 & 128) != 0 ? appearance9.ringingMode : null, (261631 & 256) != 0 ? appearance9.camera : null, (261631 & 512) != 0 ? appearance9.isGsmBusy : false, (261631 & 1024) != 0 ? appearance9.network : null, (261631 & 2048) != 0 ? appearance9.connectionQuality : null, (261631 & 4096) != 0 ? appearance9.power : null, (261631 & 8192) != 0 ? appearance9.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance9.isMiui : false, (261631 & 32768) != 0 ? appearance9.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance9.config : null, (261631 & 131072) != 0 ? appearance9.stringResources : null), 3, null);
        }
        if (iacStateCopy$default == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState");
        }
        if (!(iacStateCopy$default instanceof IacState.Idle)) {
            if (!(iacStateCopy$default instanceof IacState.InUse)) {
                throw new NoWhenBranchMatchedException();
            }
            IacState.InUse inUse = (IacState.InUse) iacStateCopy$default;
            if (inUse instanceof IacState.InUse.Alive.Outgoing.Launching) {
                IacState.InUse.Alive.Outgoing.Launching launching2 = (IacState.InUse.Alive.Outgoing.Launching) inUse;
                CallParams params = launching2.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching2, null, params.copy((251 & 1) != 0 ? params.time : launching2.getParams().getTime().e(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params.wasScreenStarted : false, (251 & 4) != 0 ? params.hideControlsInVideo : false, (251 & 8) != 0 ? params.hideVpnToast : false, (251 & 16) != 0 ? params.dtmfOpened : false, (251 & 32) != 0 ? params.customParams : null, (251 & 64) != 0 ? params.analyticsExtraParams : null, (251 & 128) != 0 ? params.muteRingtone : false), null, 5, null);
            } else if (inUse instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                IacState.InUse.Alive.Outgoing.Resolving resolving3 = (IacState.InUse.Alive.Outgoing.Resolving) inUse;
                CallParams params2 = resolving3.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving3, null, null, params2.copy((251 & 1) != 0 ? params2.time : resolving3.getParams().getTime().e(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params2.wasScreenStarted : false, (251 & 4) != 0 ? params2.hideControlsInVideo : false, (251 & 8) != 0 ? params2.hideVpnToast : false, (251 & 16) != 0 ? params2.dtmfOpened : false, (251 & 32) != 0 ? params2.customParams : null, (251 & 64) != 0 ? params2.analyticsExtraParams : null, (251 & 128) != 0 ? params2.muteRingtone : false), null, 11, null);
            } else if (inUse instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                IacState.InUse.Alive.Outgoing.Waiting waiting3 = (IacState.InUse.Alive.Outgoing.Waiting) inUse;
                CallParams params3 = waiting3.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting3, null, params3.copy((251 & 1) != 0 ? params3.time : waiting3.getParams().getTime().e(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params3.wasScreenStarted : false, (251 & 4) != 0 ? params3.hideControlsInVideo : false, (251 & 8) != 0 ? params3.hideVpnToast : false, (251 & 16) != 0 ? params3.dtmfOpened : false, (251 & 32) != 0 ? params3.customParams : null, (251 & 64) != 0 ? params3.analyticsExtraParams : null, (251 & 128) != 0 ? params3.muteRingtone : false), null, 5, null);
            } else if (inUse instanceof IacState.InUse.Alive.Incoming.Waiting) {
                IacState.InUse.Alive.Incoming.Waiting waiting4 = (IacState.InUse.Alive.Incoming.Waiting) inUse;
                CallParams params4 = waiting4.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting4, null, params4.copy((251 & 1) != 0 ? params4.time : waiting4.getParams().getTime().e(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params4.wasScreenStarted : false, (251 & 4) != 0 ? params4.hideControlsInVideo : false, (251 & 8) != 0 ? params4.hideVpnToast : false, (251 & 16) != 0 ? params4.dtmfOpened : false, (251 & 32) != 0 ? params4.customParams : null, (251 & 64) != 0 ? params4.analyticsExtraParams : null, (251 & 128) != 0 ? params4.muteRingtone : false), null, 5, null);
            } else if (inUse instanceof IacState.InUse.Alive.Incoming.Resolving) {
                IacState.InUse.Alive.Incoming.Resolving resolving4 = (IacState.InUse.Alive.Incoming.Resolving) inUse;
                CallParams params5 = resolving4.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving4, null, null, params5.copy((251 & 1) != 0 ? params5.time : resolving4.getParams().getTime().e(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params5.wasScreenStarted : false, (251 & 4) != 0 ? params5.hideControlsInVideo : false, (251 & 8) != 0 ? params5.hideVpnToast : false, (251 & 16) != 0 ? params5.dtmfOpened : false, (251 & 32) != 0 ? params5.customParams : null, (251 & 64) != 0 ? params5.analyticsExtraParams : null, (251 & 128) != 0 ? params5.muteRingtone : false), null, 11, null);
            } else if (inUse instanceof IacState.InUse.Alive.Incoming.Accepting) {
                IacState.InUse.Alive.Incoming.Accepting accepting2 = (IacState.InUse.Alive.Incoming.Accepting) inUse;
                CallParams params6 = accepting2.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting2, null, params6.copy((251 & 1) != 0 ? params6.time : accepting2.getParams().getTime().e(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params6.wasScreenStarted : false, (251 & 4) != 0 ? params6.hideControlsInVideo : false, (251 & 8) != 0 ? params6.hideVpnToast : false, (251 & 16) != 0 ? params6.dtmfOpened : false, (251 & 32) != 0 ? params6.customParams : null, (251 & 64) != 0 ? params6.analyticsExtraParams : null, (251 & 128) != 0 ? params6.muteRingtone : false), null, 5, null);
            } else if (inUse instanceof IacState.InUse.Alive.Talking) {
                IacState.InUse.Alive.Talking talking2 = (IacState.InUse.Alive.Talking) inUse;
                CallParams params7 = talking2.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking2, null, params7.copy((251 & 1) != 0 ? params7.time : talking2.getParams().getTime().e(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params7.wasScreenStarted : false, (251 & 4) != 0 ? params7.hideControlsInVideo : false, (251 & 8) != 0 ? params7.hideVpnToast : false, (251 & 16) != 0 ? params7.dtmfOpened : false, (251 & 32) != 0 ? params7.customParams : null, (251 & 64) != 0 ? params7.analyticsExtraParams : null, (251 & 128) != 0 ? params7.muteRingtone : false), null, 5, null);
            } else {
                if (!(inUse instanceof IacState.InUse.Finished)) {
                    throw new NoWhenBranchMatchedException();
                }
                IacState.InUse.Finished finished2 = (IacState.InUse.Finished) inUse;
                CallParams params8 = finished2.getParams();
                iacStateCopy$default = IacState.InUse.Finished.copy$default(finished2, null, params8.copy((251 & 1) != 0 ? params8.time : finished2.getParams().getTime().e(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params8.wasScreenStarted : false, (251 & 4) != 0 ? params8.hideControlsInVideo : false, (251 & 8) != 0 ? params8.hideVpnToast : false, (251 & 16) != 0 ? params8.dtmfOpened : false, (251 & 32) != 0 ? params8.customParams : null, (251 & 64) != 0 ? params8.analyticsExtraParams : null, (251 & 128) != 0 ? params8.muteRingtone : false), null, 5, null);
            }
            if (iacStateCopy$default == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse");
            }
        }
        if (!(iacStateCopy$default instanceof IacState.Idle)) {
            if (!(iacStateCopy$default instanceof IacState.InUse)) {
                throw new NoWhenBranchMatchedException();
            }
            IacState.InUse inUse2 = (IacState.InUse) iacStateCopy$default;
            if (inUse2 instanceof IacState.InUse.Alive.Outgoing.Launching) {
                IacState.InUse.Alive.Outgoing.Launching launching3 = (IacState.InUse.Alive.Outgoing.Launching) inUse2;
                CallParams params9 = launching3.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching3, null, params9.copy((251 & 1) != 0 ? params9.time : null, (251 & 2) != 0 ? params9.wasScreenStarted : true, (251 & 4) != 0 ? params9.hideControlsInVideo : false, (251 & 8) != 0 ? params9.hideVpnToast : false, (251 & 16) != 0 ? params9.dtmfOpened : false, (251 & 32) != 0 ? params9.customParams : null, (251 & 64) != 0 ? params9.analyticsExtraParams : null, (251 & 128) != 0 ? params9.muteRingtone : false), null, 5, null);
            } else if (inUse2 instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                IacState.InUse.Alive.Outgoing.Resolving resolving5 = (IacState.InUse.Alive.Outgoing.Resolving) inUse2;
                CallParams params10 = resolving5.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving5, null, null, params10.copy((251 & 1) != 0 ? params10.time : null, (251 & 2) != 0 ? params10.wasScreenStarted : true, (251 & 4) != 0 ? params10.hideControlsInVideo : false, (251 & 8) != 0 ? params10.hideVpnToast : false, (251 & 16) != 0 ? params10.dtmfOpened : false, (251 & 32) != 0 ? params10.customParams : null, (251 & 64) != 0 ? params10.analyticsExtraParams : null, (251 & 128) != 0 ? params10.muteRingtone : false), null, 11, null);
            } else if (inUse2 instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                IacState.InUse.Alive.Outgoing.Waiting waiting5 = (IacState.InUse.Alive.Outgoing.Waiting) inUse2;
                CallParams params11 = waiting5.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting5, null, params11.copy((251 & 1) != 0 ? params11.time : null, (251 & 2) != 0 ? params11.wasScreenStarted : true, (251 & 4) != 0 ? params11.hideControlsInVideo : false, (251 & 8) != 0 ? params11.hideVpnToast : false, (251 & 16) != 0 ? params11.dtmfOpened : false, (251 & 32) != 0 ? params11.customParams : null, (251 & 64) != 0 ? params11.analyticsExtraParams : null, (251 & 128) != 0 ? params11.muteRingtone : false), null, 5, null);
            } else if (inUse2 instanceof IacState.InUse.Alive.Incoming.Waiting) {
                IacState.InUse.Alive.Incoming.Waiting waiting6 = (IacState.InUse.Alive.Incoming.Waiting) inUse2;
                CallParams params12 = waiting6.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting6, null, params12.copy((251 & 1) != 0 ? params12.time : null, (251 & 2) != 0 ? params12.wasScreenStarted : true, (251 & 4) != 0 ? params12.hideControlsInVideo : false, (251 & 8) != 0 ? params12.hideVpnToast : false, (251 & 16) != 0 ? params12.dtmfOpened : false, (251 & 32) != 0 ? params12.customParams : null, (251 & 64) != 0 ? params12.analyticsExtraParams : null, (251 & 128) != 0 ? params12.muteRingtone : false), null, 5, null);
            } else if (inUse2 instanceof IacState.InUse.Alive.Incoming.Resolving) {
                IacState.InUse.Alive.Incoming.Resolving resolving6 = (IacState.InUse.Alive.Incoming.Resolving) inUse2;
                CallParams params13 = resolving6.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving6, null, null, params13.copy((251 & 1) != 0 ? params13.time : null, (251 & 2) != 0 ? params13.wasScreenStarted : true, (251 & 4) != 0 ? params13.hideControlsInVideo : false, (251 & 8) != 0 ? params13.hideVpnToast : false, (251 & 16) != 0 ? params13.dtmfOpened : false, (251 & 32) != 0 ? params13.customParams : null, (251 & 64) != 0 ? params13.analyticsExtraParams : null, (251 & 128) != 0 ? params13.muteRingtone : false), null, 11, null);
            } else if (inUse2 instanceof IacState.InUse.Alive.Incoming.Accepting) {
                IacState.InUse.Alive.Incoming.Accepting accepting3 = (IacState.InUse.Alive.Incoming.Accepting) inUse2;
                CallParams params14 = accepting3.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting3, null, params14.copy((251 & 1) != 0 ? params14.time : null, (251 & 2) != 0 ? params14.wasScreenStarted : true, (251 & 4) != 0 ? params14.hideControlsInVideo : false, (251 & 8) != 0 ? params14.hideVpnToast : false, (251 & 16) != 0 ? params14.dtmfOpened : false, (251 & 32) != 0 ? params14.customParams : null, (251 & 64) != 0 ? params14.analyticsExtraParams : null, (251 & 128) != 0 ? params14.muteRingtone : false), null, 5, null);
            } else if (inUse2 instanceof IacState.InUse.Alive.Talking) {
                IacState.InUse.Alive.Talking talking3 = (IacState.InUse.Alive.Talking) inUse2;
                CallParams params15 = talking3.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking3, null, params15.copy((251 & 1) != 0 ? params15.time : null, (251 & 2) != 0 ? params15.wasScreenStarted : true, (251 & 4) != 0 ? params15.hideControlsInVideo : false, (251 & 8) != 0 ? params15.hideVpnToast : false, (251 & 16) != 0 ? params15.dtmfOpened : false, (251 & 32) != 0 ? params15.customParams : null, (251 & 64) != 0 ? params15.analyticsExtraParams : null, (251 & 128) != 0 ? params15.muteRingtone : false), null, 5, null);
            } else {
                if (!(inUse2 instanceof IacState.InUse.Finished)) {
                    throw new NoWhenBranchMatchedException();
                }
                IacState.InUse.Finished finished3 = (IacState.InUse.Finished) inUse2;
                CallParams params16 = finished3.getParams();
                iacStateCopy$default = IacState.InUse.Finished.copy$default(finished3, null, params16.copy((251 & 1) != 0 ? params16.time : null, (251 & 2) != 0 ? params16.wasScreenStarted : true, (251 & 4) != 0 ? params16.hideControlsInVideo : false, (251 & 8) != 0 ? params16.hideVpnToast : false, (251 & 16) != 0 ? params16.dtmfOpened : false, (251 & 32) != 0 ? params16.customParams : null, (251 & 64) != 0 ? params16.analyticsExtraParams : null, (251 & 128) != 0 ? params16.muteRingtone : false), null, 5, null);
            }
            if (iacStateCopy$default == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse");
            }
        }
        iacActionProcessing.plusAssign(out, iacStateCopy$default);
    }

    @k
    public String toString() {
        return "OnScreenStartedAction(screenId=" + this.screenId + ", micPermissionState=" + this.micPermissionState + ", cameraPermissionState=" + this.cameraPermissionState + ')';
    }
}
