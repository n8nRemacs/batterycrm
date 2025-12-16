package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCreateCallMetaInfo;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewarePayload;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.Appearance;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.huawei.hms.api.FailedBinderCallBack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: OnCallInitiatedMiddleware.kt */
@P
@s0
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u00020\u0017*\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/OnCallInitiatedMiddleware;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareDistinctBy;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/OnCallInitiatedMiddleware$Payload;", "<init>", "()V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", VoiceInfo.STATE, "getPayloadFromState", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/OnCallInitiatedMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;", "oldPayload", "newPayload", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/OnCallInitiatedMiddleware$Payload;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/OnCallInitiatedMiddleware$Payload;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit;", "isReadyToAvcalls", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit;)Z", "Action", "Payload", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@C11.a
/* loaded from: classes14.dex */
public final /* data */ class OnCallInitiatedMiddleware implements IacMiddlewareDistinctBy<Payload> {
    public static final int $stable = 0;

    @k
    public static final OnCallInitiatedMiddleware INSTANCE = new OnCallInitiatedMiddleware();

    /* compiled from: OnCallInitiatedMiddleware.kt */
    @P
    @s0
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\r\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\bJ\u001e\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/OnCallInitiatedMiddleware$Action;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "copy", "(Ljava/lang/String;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/OnCallInitiatedMiddleware$Action;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallId", "name", "getName", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Action implements IacAction {
        public static final int $stable = 0;

        @k
        private final String callId;

        @k
        private final String name = "OnCallInitiatedMiddleware.Action";

        public Action(@k String str) {
            this.callId = str;
        }

        public static /* synthetic */ Action copy$default(Action action, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = action.callId;
            }
            return action.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        @k
        public final Action copy(@k String callId) {
            return new Action(callId);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Action) && L.f(this.callId, ((Action) other).callId);
        }

        @k
        public final String getCallId() {
            return this.callId;
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
        @k
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.callId.hashCode();
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
        public void process(@k IacActionProcessing iacActionProcessing) {
            IacState iacStateCopy$default;
            CallInit callInit = iacActionProcessing.getState().getAppearance().getCallInits().get(this.callId);
            if (callInit == null) {
                iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new TerminateCallInAvCallsAndTelecomAction(getName(), this.callId, null, 4, null));
                iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.Analytics.TrackStatsdCount("iac.dialer.init_fail.call_init_not_found." + getName()));
                return;
            }
            if (callInit.getPayloadSent()) {
                return;
            }
            IacActionOutput out = iacActionProcessing.getOut();
            IacState state = iacActionProcessing.getState();
            String str = this.callId;
            CallInit callInitCopy$default = CallInit.copy$default(callInit, null, null, false, null, true, null, null, 111, null);
            if (callInitCopy$default == null) {
                if (state instanceof IacState.Idle) {
                    IacState.Idle idle = (IacState.Idle) state;
                    Appearance appearance = idle.getAppearance();
                    iacStateCopy$default = IacState.Idle.copy$default(idle, appearance.copy((261631 & 1) != 0 ? appearance.callInits : P0.i(appearance.getCallInits(), str), (261631 & 2) != 0 ? appearance.service : null, (261631 & 4) != 0 ? appearance.screen : null, (261631 & 8) != 0 ? appearance.app : null, (261631 & 16) != 0 ? appearance.micPerm : null, (261631 & 32) != 0 ? appearance.cameraPerm : null, (261631 & 64) != 0 ? appearance.notifications : null, (261631 & 128) != 0 ? appearance.ringingMode : null, (261631 & 256) != 0 ? appearance.camera : null, (261631 & 512) != 0 ? appearance.isGsmBusy : false, (261631 & 1024) != 0 ? appearance.network : null, (261631 & 2048) != 0 ? appearance.connectionQuality : null, (261631 & 4096) != 0 ? appearance.power : null, (261631 & 8192) != 0 ? appearance.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance.isMiui : false, (261631 & 32768) != 0 ? appearance.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance.config : null, (261631 & 131072) != 0 ? appearance.stringResources : null), null, 2, null);
                } else if (state instanceof IacState.InUse.Alive.Outgoing.Launching) {
                    IacState.InUse.Alive.Outgoing.Launching launching = (IacState.InUse.Alive.Outgoing.Launching) state;
                    Appearance appearance2 = launching.getAppearance();
                    iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching, null, null, appearance2.copy((261631 & 1) != 0 ? appearance2.callInits : P0.i(appearance2.getCallInits(), str), (261631 & 2) != 0 ? appearance2.service : null, (261631 & 4) != 0 ? appearance2.screen : null, (261631 & 8) != 0 ? appearance2.app : null, (261631 & 16) != 0 ? appearance2.micPerm : null, (261631 & 32) != 0 ? appearance2.cameraPerm : null, (261631 & 64) != 0 ? appearance2.notifications : null, (261631 & 128) != 0 ? appearance2.ringingMode : null, (261631 & 256) != 0 ? appearance2.camera : null, (261631 & 512) != 0 ? appearance2.isGsmBusy : false, (261631 & 1024) != 0 ? appearance2.network : null, (261631 & 2048) != 0 ? appearance2.connectionQuality : null, (261631 & 4096) != 0 ? appearance2.power : null, (261631 & 8192) != 0 ? appearance2.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance2.isMiui : false, (261631 & 32768) != 0 ? appearance2.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance2.config : null, (261631 & 131072) != 0 ? appearance2.stringResources : null), 3, null);
                } else if (state instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                    IacState.InUse.Alive.Outgoing.Resolving resolving = (IacState.InUse.Alive.Outgoing.Resolving) state;
                    Appearance appearance3 = resolving.getAppearance();
                    iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving, null, null, null, appearance3.copy((261631 & 1) != 0 ? appearance3.callInits : P0.i(appearance3.getCallInits(), str), (261631 & 2) != 0 ? appearance3.service : null, (261631 & 4) != 0 ? appearance3.screen : null, (261631 & 8) != 0 ? appearance3.app : null, (261631 & 16) != 0 ? appearance3.micPerm : null, (261631 & 32) != 0 ? appearance3.cameraPerm : null, (261631 & 64) != 0 ? appearance3.notifications : null, (261631 & 128) != 0 ? appearance3.ringingMode : null, (261631 & 256) != 0 ? appearance3.camera : null, (261631 & 512) != 0 ? appearance3.isGsmBusy : false, (261631 & 1024) != 0 ? appearance3.network : null, (261631 & 2048) != 0 ? appearance3.connectionQuality : null, (261631 & 4096) != 0 ? appearance3.power : null, (261631 & 8192) != 0 ? appearance3.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance3.isMiui : false, (261631 & 32768) != 0 ? appearance3.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance3.config : null, (261631 & 131072) != 0 ? appearance3.stringResources : null), 7, null);
                } else if (state instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                    IacState.InUse.Alive.Outgoing.Waiting waiting = (IacState.InUse.Alive.Outgoing.Waiting) state;
                    Appearance appearance4 = waiting.getAppearance();
                    iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting, null, null, appearance4.copy((261631 & 1) != 0 ? appearance4.callInits : P0.i(appearance4.getCallInits(), str), (261631 & 2) != 0 ? appearance4.service : null, (261631 & 4) != 0 ? appearance4.screen : null, (261631 & 8) != 0 ? appearance4.app : null, (261631 & 16) != 0 ? appearance4.micPerm : null, (261631 & 32) != 0 ? appearance4.cameraPerm : null, (261631 & 64) != 0 ? appearance4.notifications : null, (261631 & 128) != 0 ? appearance4.ringingMode : null, (261631 & 256) != 0 ? appearance4.camera : null, (261631 & 512) != 0 ? appearance4.isGsmBusy : false, (261631 & 1024) != 0 ? appearance4.network : null, (261631 & 2048) != 0 ? appearance4.connectionQuality : null, (261631 & 4096) != 0 ? appearance4.power : null, (261631 & 8192) != 0 ? appearance4.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance4.isMiui : false, (261631 & 32768) != 0 ? appearance4.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance4.config : null, (261631 & 131072) != 0 ? appearance4.stringResources : null), 3, null);
                } else if (state instanceof IacState.InUse.Alive.Incoming.Waiting) {
                    IacState.InUse.Alive.Incoming.Waiting waiting2 = (IacState.InUse.Alive.Incoming.Waiting) state;
                    Appearance appearance5 = waiting2.getAppearance();
                    iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting2, null, null, appearance5.copy((261631 & 1) != 0 ? appearance5.callInits : P0.i(appearance5.getCallInits(), str), (261631 & 2) != 0 ? appearance5.service : null, (261631 & 4) != 0 ? appearance5.screen : null, (261631 & 8) != 0 ? appearance5.app : null, (261631 & 16) != 0 ? appearance5.micPerm : null, (261631 & 32) != 0 ? appearance5.cameraPerm : null, (261631 & 64) != 0 ? appearance5.notifications : null, (261631 & 128) != 0 ? appearance5.ringingMode : null, (261631 & 256) != 0 ? appearance5.camera : null, (261631 & 512) != 0 ? appearance5.isGsmBusy : false, (261631 & 1024) != 0 ? appearance5.network : null, (261631 & 2048) != 0 ? appearance5.connectionQuality : null, (261631 & 4096) != 0 ? appearance5.power : null, (261631 & 8192) != 0 ? appearance5.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance5.isMiui : false, (261631 & 32768) != 0 ? appearance5.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance5.config : null, (261631 & 131072) != 0 ? appearance5.stringResources : null), 3, null);
                } else if (state instanceof IacState.InUse.Alive.Incoming.Resolving) {
                    IacState.InUse.Alive.Incoming.Resolving resolving2 = (IacState.InUse.Alive.Incoming.Resolving) state;
                    Appearance appearance6 = resolving2.getAppearance();
                    iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving2, null, null, null, appearance6.copy((261631 & 1) != 0 ? appearance6.callInits : P0.i(appearance6.getCallInits(), str), (261631 & 2) != 0 ? appearance6.service : null, (261631 & 4) != 0 ? appearance6.screen : null, (261631 & 8) != 0 ? appearance6.app : null, (261631 & 16) != 0 ? appearance6.micPerm : null, (261631 & 32) != 0 ? appearance6.cameraPerm : null, (261631 & 64) != 0 ? appearance6.notifications : null, (261631 & 128) != 0 ? appearance6.ringingMode : null, (261631 & 256) != 0 ? appearance6.camera : null, (261631 & 512) != 0 ? appearance6.isGsmBusy : false, (261631 & 1024) != 0 ? appearance6.network : null, (261631 & 2048) != 0 ? appearance6.connectionQuality : null, (261631 & 4096) != 0 ? appearance6.power : null, (261631 & 8192) != 0 ? appearance6.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance6.isMiui : false, (261631 & 32768) != 0 ? appearance6.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance6.config : null, (261631 & 131072) != 0 ? appearance6.stringResources : null), 7, null);
                } else if (state instanceof IacState.InUse.Alive.Incoming.Accepting) {
                    IacState.InUse.Alive.Incoming.Accepting accepting = (IacState.InUse.Alive.Incoming.Accepting) state;
                    Appearance appearance7 = accepting.getAppearance();
                    iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting, null, null, appearance7.copy((261631 & 1) != 0 ? appearance7.callInits : P0.i(appearance7.getCallInits(), str), (261631 & 2) != 0 ? appearance7.service : null, (261631 & 4) != 0 ? appearance7.screen : null, (261631 & 8) != 0 ? appearance7.app : null, (261631 & 16) != 0 ? appearance7.micPerm : null, (261631 & 32) != 0 ? appearance7.cameraPerm : null, (261631 & 64) != 0 ? appearance7.notifications : null, (261631 & 128) != 0 ? appearance7.ringingMode : null, (261631 & 256) != 0 ? appearance7.camera : null, (261631 & 512) != 0 ? appearance7.isGsmBusy : false, (261631 & 1024) != 0 ? appearance7.network : null, (261631 & 2048) != 0 ? appearance7.connectionQuality : null, (261631 & 4096) != 0 ? appearance7.power : null, (261631 & 8192) != 0 ? appearance7.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance7.isMiui : false, (261631 & 32768) != 0 ? appearance7.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance7.config : null, (261631 & 131072) != 0 ? appearance7.stringResources : null), 3, null);
                } else if (state instanceof IacState.InUse.Alive.Talking) {
                    IacState.InUse.Alive.Talking talking = (IacState.InUse.Alive.Talking) state;
                    Appearance appearance8 = talking.getAppearance();
                    iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking, null, null, appearance8.copy((261631 & 1) != 0 ? appearance8.callInits : P0.i(appearance8.getCallInits(), str), (261631 & 2) != 0 ? appearance8.service : null, (261631 & 4) != 0 ? appearance8.screen : null, (261631 & 8) != 0 ? appearance8.app : null, (261631 & 16) != 0 ? appearance8.micPerm : null, (261631 & 32) != 0 ? appearance8.cameraPerm : null, (261631 & 64) != 0 ? appearance8.notifications : null, (261631 & 128) != 0 ? appearance8.ringingMode : null, (261631 & 256) != 0 ? appearance8.camera : null, (261631 & 512) != 0 ? appearance8.isGsmBusy : false, (261631 & 1024) != 0 ? appearance8.network : null, (261631 & 2048) != 0 ? appearance8.connectionQuality : null, (261631 & 4096) != 0 ? appearance8.power : null, (261631 & 8192) != 0 ? appearance8.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance8.isMiui : false, (261631 & 32768) != 0 ? appearance8.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance8.config : null, (261631 & 131072) != 0 ? appearance8.stringResources : null), 3, null);
                } else {
                    if (!(state instanceof IacState.InUse.Finished)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IacState.InUse.Finished finished = (IacState.InUse.Finished) state;
                    Appearance appearance9 = finished.getAppearance();
                    iacStateCopy$default = IacState.InUse.Finished.copy$default(finished, null, null, appearance9.copy((261631 & 1) != 0 ? appearance9.callInits : P0.i(appearance9.getCallInits(), str), (261631 & 2) != 0 ? appearance9.service : null, (261631 & 4) != 0 ? appearance9.screen : null, (261631 & 8) != 0 ? appearance9.app : null, (261631 & 16) != 0 ? appearance9.micPerm : null, (261631 & 32) != 0 ? appearance9.cameraPerm : null, (261631 & 64) != 0 ? appearance9.notifications : null, (261631 & 128) != 0 ? appearance9.ringingMode : null, (261631 & 256) != 0 ? appearance9.camera : null, (261631 & 512) != 0 ? appearance9.isGsmBusy : false, (261631 & 1024) != 0 ? appearance9.network : null, (261631 & 2048) != 0 ? appearance9.connectionQuality : null, (261631 & 4096) != 0 ? appearance9.power : null, (261631 & 8192) != 0 ? appearance9.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance9.isMiui : false, (261631 & 32768) != 0 ? appearance9.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance9.config : null, (261631 & 131072) != 0 ? appearance9.stringResources : null), 3, null);
                }
                if (iacStateCopy$default == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState");
                }
            } else {
                if (state instanceof IacState.Idle) {
                    IacState.Idle idle2 = (IacState.Idle) state;
                    Appearance appearance10 = idle2.getAppearance();
                    iacStateCopy$default = IacState.Idle.copy$default(idle2, appearance10.copy((261631 & 1) != 0 ? appearance10.callInits : f.p(str, callInitCopy$default, appearance10.getCallInits()), (261631 & 2) != 0 ? appearance10.service : null, (261631 & 4) != 0 ? appearance10.screen : null, (261631 & 8) != 0 ? appearance10.app : null, (261631 & 16) != 0 ? appearance10.micPerm : null, (261631 & 32) != 0 ? appearance10.cameraPerm : null, (261631 & 64) != 0 ? appearance10.notifications : null, (261631 & 128) != 0 ? appearance10.ringingMode : null, (261631 & 256) != 0 ? appearance10.camera : null, (261631 & 512) != 0 ? appearance10.isGsmBusy : false, (261631 & 1024) != 0 ? appearance10.network : null, (261631 & 2048) != 0 ? appearance10.connectionQuality : null, (261631 & 4096) != 0 ? appearance10.power : null, (261631 & 8192) != 0 ? appearance10.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance10.isMiui : false, (261631 & 32768) != 0 ? appearance10.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance10.config : null, (261631 & 131072) != 0 ? appearance10.stringResources : null), null, 2, null);
                } else if (state instanceof IacState.InUse.Alive.Outgoing.Launching) {
                    IacState.InUse.Alive.Outgoing.Launching launching2 = (IacState.InUse.Alive.Outgoing.Launching) state;
                    Appearance appearance11 = launching2.getAppearance();
                    iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching2, null, null, appearance11.copy((261631 & 1) != 0 ? appearance11.callInits : f.p(str, callInitCopy$default, appearance11.getCallInits()), (261631 & 2) != 0 ? appearance11.service : null, (261631 & 4) != 0 ? appearance11.screen : null, (261631 & 8) != 0 ? appearance11.app : null, (261631 & 16) != 0 ? appearance11.micPerm : null, (261631 & 32) != 0 ? appearance11.cameraPerm : null, (261631 & 64) != 0 ? appearance11.notifications : null, (261631 & 128) != 0 ? appearance11.ringingMode : null, (261631 & 256) != 0 ? appearance11.camera : null, (261631 & 512) != 0 ? appearance11.isGsmBusy : false, (261631 & 1024) != 0 ? appearance11.network : null, (261631 & 2048) != 0 ? appearance11.connectionQuality : null, (261631 & 4096) != 0 ? appearance11.power : null, (261631 & 8192) != 0 ? appearance11.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance11.isMiui : false, (261631 & 32768) != 0 ? appearance11.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance11.config : null, (261631 & 131072) != 0 ? appearance11.stringResources : null), 3, null);
                } else if (state instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                    IacState.InUse.Alive.Outgoing.Resolving resolving3 = (IacState.InUse.Alive.Outgoing.Resolving) state;
                    Appearance appearance12 = resolving3.getAppearance();
                    iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving3, null, null, null, appearance12.copy((261631 & 1) != 0 ? appearance12.callInits : f.p(str, callInitCopy$default, appearance12.getCallInits()), (261631 & 2) != 0 ? appearance12.service : null, (261631 & 4) != 0 ? appearance12.screen : null, (261631 & 8) != 0 ? appearance12.app : null, (261631 & 16) != 0 ? appearance12.micPerm : null, (261631 & 32) != 0 ? appearance12.cameraPerm : null, (261631 & 64) != 0 ? appearance12.notifications : null, (261631 & 128) != 0 ? appearance12.ringingMode : null, (261631 & 256) != 0 ? appearance12.camera : null, (261631 & 512) != 0 ? appearance12.isGsmBusy : false, (261631 & 1024) != 0 ? appearance12.network : null, (261631 & 2048) != 0 ? appearance12.connectionQuality : null, (261631 & 4096) != 0 ? appearance12.power : null, (261631 & 8192) != 0 ? appearance12.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance12.isMiui : false, (261631 & 32768) != 0 ? appearance12.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance12.config : null, (261631 & 131072) != 0 ? appearance12.stringResources : null), 7, null);
                } else if (state instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                    IacState.InUse.Alive.Outgoing.Waiting waiting3 = (IacState.InUse.Alive.Outgoing.Waiting) state;
                    Appearance appearance13 = waiting3.getAppearance();
                    iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting3, null, null, appearance13.copy((261631 & 1) != 0 ? appearance13.callInits : f.p(str, callInitCopy$default, appearance13.getCallInits()), (261631 & 2) != 0 ? appearance13.service : null, (261631 & 4) != 0 ? appearance13.screen : null, (261631 & 8) != 0 ? appearance13.app : null, (261631 & 16) != 0 ? appearance13.micPerm : null, (261631 & 32) != 0 ? appearance13.cameraPerm : null, (261631 & 64) != 0 ? appearance13.notifications : null, (261631 & 128) != 0 ? appearance13.ringingMode : null, (261631 & 256) != 0 ? appearance13.camera : null, (261631 & 512) != 0 ? appearance13.isGsmBusy : false, (261631 & 1024) != 0 ? appearance13.network : null, (261631 & 2048) != 0 ? appearance13.connectionQuality : null, (261631 & 4096) != 0 ? appearance13.power : null, (261631 & 8192) != 0 ? appearance13.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance13.isMiui : false, (261631 & 32768) != 0 ? appearance13.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance13.config : null, (261631 & 131072) != 0 ? appearance13.stringResources : null), 3, null);
                } else if (state instanceof IacState.InUse.Alive.Incoming.Waiting) {
                    IacState.InUse.Alive.Incoming.Waiting waiting4 = (IacState.InUse.Alive.Incoming.Waiting) state;
                    Appearance appearance14 = waiting4.getAppearance();
                    iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting4, null, null, appearance14.copy((261631 & 1) != 0 ? appearance14.callInits : f.p(str, callInitCopy$default, appearance14.getCallInits()), (261631 & 2) != 0 ? appearance14.service : null, (261631 & 4) != 0 ? appearance14.screen : null, (261631 & 8) != 0 ? appearance14.app : null, (261631 & 16) != 0 ? appearance14.micPerm : null, (261631 & 32) != 0 ? appearance14.cameraPerm : null, (261631 & 64) != 0 ? appearance14.notifications : null, (261631 & 128) != 0 ? appearance14.ringingMode : null, (261631 & 256) != 0 ? appearance14.camera : null, (261631 & 512) != 0 ? appearance14.isGsmBusy : false, (261631 & 1024) != 0 ? appearance14.network : null, (261631 & 2048) != 0 ? appearance14.connectionQuality : null, (261631 & 4096) != 0 ? appearance14.power : null, (261631 & 8192) != 0 ? appearance14.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance14.isMiui : false, (261631 & 32768) != 0 ? appearance14.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance14.config : null, (261631 & 131072) != 0 ? appearance14.stringResources : null), 3, null);
                } else if (state instanceof IacState.InUse.Alive.Incoming.Resolving) {
                    IacState.InUse.Alive.Incoming.Resolving resolving4 = (IacState.InUse.Alive.Incoming.Resolving) state;
                    Appearance appearance15 = resolving4.getAppearance();
                    iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving4, null, null, null, appearance15.copy((261631 & 1) != 0 ? appearance15.callInits : f.p(str, callInitCopy$default, appearance15.getCallInits()), (261631 & 2) != 0 ? appearance15.service : null, (261631 & 4) != 0 ? appearance15.screen : null, (261631 & 8) != 0 ? appearance15.app : null, (261631 & 16) != 0 ? appearance15.micPerm : null, (261631 & 32) != 0 ? appearance15.cameraPerm : null, (261631 & 64) != 0 ? appearance15.notifications : null, (261631 & 128) != 0 ? appearance15.ringingMode : null, (261631 & 256) != 0 ? appearance15.camera : null, (261631 & 512) != 0 ? appearance15.isGsmBusy : false, (261631 & 1024) != 0 ? appearance15.network : null, (261631 & 2048) != 0 ? appearance15.connectionQuality : null, (261631 & 4096) != 0 ? appearance15.power : null, (261631 & 8192) != 0 ? appearance15.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance15.isMiui : false, (261631 & 32768) != 0 ? appearance15.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance15.config : null, (261631 & 131072) != 0 ? appearance15.stringResources : null), 7, null);
                } else if (state instanceof IacState.InUse.Alive.Incoming.Accepting) {
                    IacState.InUse.Alive.Incoming.Accepting accepting2 = (IacState.InUse.Alive.Incoming.Accepting) state;
                    Appearance appearance16 = accepting2.getAppearance();
                    iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting2, null, null, appearance16.copy((261631 & 1) != 0 ? appearance16.callInits : f.p(str, callInitCopy$default, appearance16.getCallInits()), (261631 & 2) != 0 ? appearance16.service : null, (261631 & 4) != 0 ? appearance16.screen : null, (261631 & 8) != 0 ? appearance16.app : null, (261631 & 16) != 0 ? appearance16.micPerm : null, (261631 & 32) != 0 ? appearance16.cameraPerm : null, (261631 & 64) != 0 ? appearance16.notifications : null, (261631 & 128) != 0 ? appearance16.ringingMode : null, (261631 & 256) != 0 ? appearance16.camera : null, (261631 & 512) != 0 ? appearance16.isGsmBusy : false, (261631 & 1024) != 0 ? appearance16.network : null, (261631 & 2048) != 0 ? appearance16.connectionQuality : null, (261631 & 4096) != 0 ? appearance16.power : null, (261631 & 8192) != 0 ? appearance16.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance16.isMiui : false, (261631 & 32768) != 0 ? appearance16.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance16.config : null, (261631 & 131072) != 0 ? appearance16.stringResources : null), 3, null);
                } else if (state instanceof IacState.InUse.Alive.Talking) {
                    IacState.InUse.Alive.Talking talking2 = (IacState.InUse.Alive.Talking) state;
                    Appearance appearance17 = talking2.getAppearance();
                    iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking2, null, null, appearance17.copy((261631 & 1) != 0 ? appearance17.callInits : f.p(str, callInitCopy$default, appearance17.getCallInits()), (261631 & 2) != 0 ? appearance17.service : null, (261631 & 4) != 0 ? appearance17.screen : null, (261631 & 8) != 0 ? appearance17.app : null, (261631 & 16) != 0 ? appearance17.micPerm : null, (261631 & 32) != 0 ? appearance17.cameraPerm : null, (261631 & 64) != 0 ? appearance17.notifications : null, (261631 & 128) != 0 ? appearance17.ringingMode : null, (261631 & 256) != 0 ? appearance17.camera : null, (261631 & 512) != 0 ? appearance17.isGsmBusy : false, (261631 & 1024) != 0 ? appearance17.network : null, (261631 & 2048) != 0 ? appearance17.connectionQuality : null, (261631 & 4096) != 0 ? appearance17.power : null, (261631 & 8192) != 0 ? appearance17.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance17.isMiui : false, (261631 & 32768) != 0 ? appearance17.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance17.config : null, (261631 & 131072) != 0 ? appearance17.stringResources : null), 3, null);
                } else {
                    if (!(state instanceof IacState.InUse.Finished)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IacState.InUse.Finished finished2 = (IacState.InUse.Finished) state;
                    Appearance appearance18 = finished2.getAppearance();
                    iacStateCopy$default = IacState.InUse.Finished.copy$default(finished2, null, null, appearance18.copy((261631 & 1) != 0 ? appearance18.callInits : f.p(str, callInitCopy$default, appearance18.getCallInits()), (261631 & 2) != 0 ? appearance18.service : null, (261631 & 4) != 0 ? appearance18.screen : null, (261631 & 8) != 0 ? appearance18.app : null, (261631 & 16) != 0 ? appearance18.micPerm : null, (261631 & 32) != 0 ? appearance18.cameraPerm : null, (261631 & 64) != 0 ? appearance18.notifications : null, (261631 & 128) != 0 ? appearance18.ringingMode : null, (261631 & 256) != 0 ? appearance18.camera : null, (261631 & 512) != 0 ? appearance18.isGsmBusy : false, (261631 & 1024) != 0 ? appearance18.network : null, (261631 & 2048) != 0 ? appearance18.connectionQuality : null, (261631 & 4096) != 0 ? appearance18.power : null, (261631 & 8192) != 0 ? appearance18.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance18.isMiui : false, (261631 & 32768) != 0 ? appearance18.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance18.config : null, (261631 & 131072) != 0 ? appearance18.stringResources : null), 3, null);
                }
                if (iacStateCopy$default == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState");
                }
            }
            iacActionProcessing.plusAssign(out, iacStateCopy$default);
            CallInit.Payload payload = callInit.getPayload();
            if (payload instanceof CallInit.IncomingPayload) {
                CallInit.IncomingPayload incomingPayload = (CallInit.IncomingPayload) payload;
                if (incomingPayload.isFromPush()) {
                    iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.AvCalls.HandleCallDeliveredByPush(incomingPayload.getJson()));
                    return;
                } else {
                    iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.AvCalls.HandleSocketMessage(incomingPayload.getJson()));
                    return;
                }
            }
            if (payload instanceof CallInit.OutgoingPayload) {
                IacActionOutput out2 = iacActionProcessing.getOut();
                CallInit.OutgoingPayload outgoingPayload = (CallInit.OutgoingPayload) payload;
                String callId = outgoingPayload.getInput().getCallId();
                String to2 = outgoingPayload.getInput().getTo();
                String from = outgoingPayload.getInput().getFrom();
                boolean zIsVideo = outgoingPayload.getInput().isVideo();
                Long itemId = outgoingPayload.getInput().getItemId();
                String scenario = outgoingPayload.getInput().getScenario();
                Map<String, String> extraInfo = outgoingPayload.getInput().getExtraInfo();
                if (extraInfo == null) {
                    extraInfo = P0.c();
                }
                iacActionProcessing.plusAssign(out2, new IacEvent.AvCalls.CreateOutgoingCall(callId, to2, from, zIsVideo, new AvCallsCreateCallMetaInfo(itemId, scenario, extraInfo)));
            }
        }

        @k
        public String toString() {
            return getName();
        }
    }

    /* compiled from: OnCallInitiatedMiddleware.kt */
    @P
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0013\u0010\t\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/OnCallInitiatedMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewarePayload;", "callIds", "", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "(Ljava/util/Set;)V", "getCallIds", "()Ljava/util/Set;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload implements IacMiddlewarePayload {
        public static final int $stable = 8;

        @k
        private final Set<String> callIds;

        public Payload(@k Set<String> set) {
            this.callIds = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Payload copy$default(Payload payload, Set set, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                set = payload.callIds;
            }
            return payload.copy(set);
        }

        @k
        public final Set<String> component1() {
            return this.callIds;
        }

        @k
        public final Payload copy(@k Set<String> callIds) {
            return new Payload(callIds);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Payload) && L.f(this.callIds, ((Payload) other).callIds);
        }

        @k
        public final Set<String> getCallIds() {
            return this.callIds;
        }

        public int hashCode() {
            return this.callIds.hashCode();
        }

        @k
        public String toString() {
            return AK.c.u(new StringBuilder("Payload(callIds="), this.callIds, ')');
        }
    }

    private OnCallInitiatedMiddleware() {
    }

    private final boolean isReadyToAvcalls(CallInit callInit) {
        if (!callInit.getPayloadSent() && (callInit.getTelecom() instanceof CallInit.Telecom.New)) {
            return callInit.getDirection() != IacCallDirection.INCOMING || callInit.getNotification();
        }
        return false;
    }

    public boolean equals(@l Object other) {
        return this == other || (other instanceof OnCallInitiatedMiddleware);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return -294159346;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing) {
        IacMiddlewareDistinctBy.a.a(this, iacMiddlewareProcessing);
    }

    @k
    public String toString() {
        return "OnCallInitiatedMiddleware";
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    @k
    public Payload getPayloadFromState(@k IacState state) {
        Collection<CallInit> collectionValues = state.getAppearance().getCallInits().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (INSTANCE.isReadyToAvcalls((CallInit) obj) && state.getAppearance().getService() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((CallInit) it.next()).getCallId());
        }
        return new Payload(C42745f0.P0(arrayList2));
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing, @k Payload payload, @k Payload payload2) {
        for (String str : payload2.getCallIds()) {
            if (!payload.getCallIds().contains(str)) {
                iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), new Action(str));
            }
        }
    }
}
