package com.avito.android.iac_avcalls.public_module.analytics;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.adjust.sdk.Constants;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCallDirection;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCallMetaInfo;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCreateCallMetaInfo;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import dL.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AvCallsFunnelEventsObserver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver;", "", "CallActiveAndConnectedEvent", "Event", "IncomingCallAllocatedEvent", "IncomingCallRingingEvent", "OutgoingCallAllocatingEvent", "OutgoingCallRingingEvent", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface AvCallsFunnelEventsObserver {

    /* compiled from: AvCallsFunnelEventsObserver.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\r\u0010\u0013\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\nHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver$CallActiveAndConnectedEvent;", "Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver$Event;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallId;", "isVideo", "", "direction", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallDirection;", Constants.REFERRER_API_META, "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallMetaInfo;", "(Ljava/lang/String;ZLcom/avito/android/iac_avcalls/public_module/models/AvCallsCallDirection;Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallMetaInfo;)V", "getCallId", "()Ljava/lang/String;", "getDirection", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallDirection;", "()Z", "getMeta", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallMetaInfo;", "component1", "component2", "component3", "component4", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CallActiveAndConnectedEvent extends Event {

        @k
        private final String callId;

        @k
        private final AvCallsCallDirection direction;
        private final boolean isVideo;

        @k
        private final AvCallsCallMetaInfo meta;

        public CallActiveAndConnectedEvent(@k String str, boolean z12, @k AvCallsCallDirection avCallsCallDirection, @k AvCallsCallMetaInfo avCallsCallMetaInfo) {
            super(null);
            this.callId = str;
            this.isVideo = z12;
            this.direction = avCallsCallDirection;
            this.meta = avCallsCallMetaInfo;
        }

        public static /* synthetic */ CallActiveAndConnectedEvent copy$default(CallActiveAndConnectedEvent callActiveAndConnectedEvent, String str, boolean z12, AvCallsCallDirection avCallsCallDirection, AvCallsCallMetaInfo avCallsCallMetaInfo, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = callActiveAndConnectedEvent.callId;
            }
            if ((i12 & 2) != 0) {
                z12 = callActiveAndConnectedEvent.isVideo;
            }
            if ((i12 & 4) != 0) {
                avCallsCallDirection = callActiveAndConnectedEvent.direction;
            }
            if ((i12 & 8) != 0) {
                avCallsCallMetaInfo = callActiveAndConnectedEvent.meta;
            }
            return callActiveAndConnectedEvent.copy(str, z12, avCallsCallDirection, avCallsCallMetaInfo);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsVideo() {
            return this.isVideo;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final AvCallsCallDirection getDirection() {
            return this.direction;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final AvCallsCallMetaInfo getMeta() {
            return this.meta;
        }

        @k
        public final CallActiveAndConnectedEvent copy(@k String callId, boolean isVideo, @k AvCallsCallDirection direction, @k AvCallsCallMetaInfo meta) {
            return new CallActiveAndConnectedEvent(callId, isVideo, direction, meta);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CallActiveAndConnectedEvent)) {
                return false;
            }
            CallActiveAndConnectedEvent callActiveAndConnectedEvent = (CallActiveAndConnectedEvent) other;
            return L.f(this.callId, callActiveAndConnectedEvent.callId) && this.isVideo == callActiveAndConnectedEvent.isVideo && this.direction == callActiveAndConnectedEvent.direction && L.f(this.meta, callActiveAndConnectedEvent.meta);
        }

        @k
        public final String getCallId() {
            return this.callId;
        }

        @k
        public final AvCallsCallDirection getDirection() {
            return this.direction;
        }

        @k
        public final AvCallsCallMetaInfo getMeta() {
            return this.meta;
        }

        public int hashCode() {
            return this.meta.hashCode() + ((this.direction.hashCode() + r.i(this.callId.hashCode() * 31, 31, this.isVideo)) * 31);
        }

        public final boolean isVideo() {
            return this.isVideo;
        }

        @k
        public String toString() {
            return "CallActiveAndConnectedEvent(callId=" + this.callId + ", isVideo=" + this.isVideo + ", direction=" + this.direction + ", meta=" + this.meta + ')';
        }
    }

    /* compiled from: AvCallsFunnelEventsObserver.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver$Event;", "LdL/d;", "<init>", "()V", "Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver$CallActiveAndConnectedEvent;", "Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver$IncomingCallAllocatedEvent;", "Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver$IncomingCallRingingEvent;", "Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver$OutgoingCallAllocatingEvent;", "Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver$OutgoingCallRingingEvent;", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Event implements d {
        public /* synthetic */ Event(C42822w c42822w) {
            this();
        }

        private Event() {
        }
    }

    /* compiled from: AvCallsFunnelEventsObserver.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\r\u0010\u000f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver$IncomingCallAllocatedEvent;", "Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver$Event;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallId;", "isVideo", "", Constants.REFERRER_API_META, "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallMetaInfo;", "(Ljava/lang/String;ZLcom/avito/android/iac_avcalls/public_module/models/AvCallsCallMetaInfo;)V", "getCallId", "()Ljava/lang/String;", "()Z", "getMeta", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallMetaInfo;", "component1", "component2", "component3", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IncomingCallAllocatedEvent extends Event {

        @k
        private final String callId;
        private final boolean isVideo;

        @k
        private final AvCallsCallMetaInfo meta;

        public IncomingCallAllocatedEvent(@k String str, boolean z12, @k AvCallsCallMetaInfo avCallsCallMetaInfo) {
            super(null);
            this.callId = str;
            this.isVideo = z12;
            this.meta = avCallsCallMetaInfo;
        }

        public static /* synthetic */ IncomingCallAllocatedEvent copy$default(IncomingCallAllocatedEvent incomingCallAllocatedEvent, String str, boolean z12, AvCallsCallMetaInfo avCallsCallMetaInfo, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = incomingCallAllocatedEvent.callId;
            }
            if ((i12 & 2) != 0) {
                z12 = incomingCallAllocatedEvent.isVideo;
            }
            if ((i12 & 4) != 0) {
                avCallsCallMetaInfo = incomingCallAllocatedEvent.meta;
            }
            return incomingCallAllocatedEvent.copy(str, z12, avCallsCallMetaInfo);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsVideo() {
            return this.isVideo;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final AvCallsCallMetaInfo getMeta() {
            return this.meta;
        }

        @k
        public final IncomingCallAllocatedEvent copy(@k String callId, boolean isVideo, @k AvCallsCallMetaInfo meta) {
            return new IncomingCallAllocatedEvent(callId, isVideo, meta);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IncomingCallAllocatedEvent)) {
                return false;
            }
            IncomingCallAllocatedEvent incomingCallAllocatedEvent = (IncomingCallAllocatedEvent) other;
            return L.f(this.callId, incomingCallAllocatedEvent.callId) && this.isVideo == incomingCallAllocatedEvent.isVideo && L.f(this.meta, incomingCallAllocatedEvent.meta);
        }

        @k
        public final String getCallId() {
            return this.callId;
        }

        @k
        public final AvCallsCallMetaInfo getMeta() {
            return this.meta;
        }

        public int hashCode() {
            return this.meta.hashCode() + r.i(this.callId.hashCode() * 31, 31, this.isVideo);
        }

        public final boolean isVideo() {
            return this.isVideo;
        }

        @k
        public String toString() {
            return "IncomingCallAllocatedEvent(callId=" + this.callId + ", isVideo=" + this.isVideo + ", meta=" + this.meta + ')';
        }
    }

    /* compiled from: AvCallsFunnelEventsObserver.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\r\u0010\u000f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver$IncomingCallRingingEvent;", "Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver$Event;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallId;", "isVideo", "", Constants.REFERRER_API_META, "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallMetaInfo;", "(Ljava/lang/String;ZLcom/avito/android/iac_avcalls/public_module/models/AvCallsCallMetaInfo;)V", "getCallId", "()Ljava/lang/String;", "()Z", "getMeta", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallMetaInfo;", "component1", "component2", "component3", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IncomingCallRingingEvent extends Event {

        @k
        private final String callId;
        private final boolean isVideo;

        @k
        private final AvCallsCallMetaInfo meta;

        public IncomingCallRingingEvent(@k String str, boolean z12, @k AvCallsCallMetaInfo avCallsCallMetaInfo) {
            super(null);
            this.callId = str;
            this.isVideo = z12;
            this.meta = avCallsCallMetaInfo;
        }

        public static /* synthetic */ IncomingCallRingingEvent copy$default(IncomingCallRingingEvent incomingCallRingingEvent, String str, boolean z12, AvCallsCallMetaInfo avCallsCallMetaInfo, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = incomingCallRingingEvent.callId;
            }
            if ((i12 & 2) != 0) {
                z12 = incomingCallRingingEvent.isVideo;
            }
            if ((i12 & 4) != 0) {
                avCallsCallMetaInfo = incomingCallRingingEvent.meta;
            }
            return incomingCallRingingEvent.copy(str, z12, avCallsCallMetaInfo);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsVideo() {
            return this.isVideo;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final AvCallsCallMetaInfo getMeta() {
            return this.meta;
        }

        @k
        public final IncomingCallRingingEvent copy(@k String callId, boolean isVideo, @k AvCallsCallMetaInfo meta) {
            return new IncomingCallRingingEvent(callId, isVideo, meta);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IncomingCallRingingEvent)) {
                return false;
            }
            IncomingCallRingingEvent incomingCallRingingEvent = (IncomingCallRingingEvent) other;
            return L.f(this.callId, incomingCallRingingEvent.callId) && this.isVideo == incomingCallRingingEvent.isVideo && L.f(this.meta, incomingCallRingingEvent.meta);
        }

        @k
        public final String getCallId() {
            return this.callId;
        }

        @k
        public final AvCallsCallMetaInfo getMeta() {
            return this.meta;
        }

        public int hashCode() {
            return this.meta.hashCode() + r.i(this.callId.hashCode() * 31, 31, this.isVideo);
        }

        public final boolean isVideo() {
            return this.isVideo;
        }

        @k
        public String toString() {
            return "IncomingCallRingingEvent(callId=" + this.callId + ", isVideo=" + this.isVideo + ", meta=" + this.meta + ')';
        }
    }

    /* compiled from: AvCallsFunnelEventsObserver.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\r\u0010\u000f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver$OutgoingCallAllocatingEvent;", "Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver$Event;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallId;", "isVideo", "", "createCallMeta", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCreateCallMetaInfo;", "(Ljava/lang/String;ZLcom/avito/android/iac_avcalls/public_module/models/AvCallsCreateCallMetaInfo;)V", "getCallId", "()Ljava/lang/String;", "getCreateCallMeta", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCreateCallMetaInfo;", "()Z", "component1", "component2", "component3", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OutgoingCallAllocatingEvent extends Event {

        @k
        private final String callId;

        @k
        private final AvCallsCreateCallMetaInfo createCallMeta;
        private final boolean isVideo;

        public OutgoingCallAllocatingEvent(@k String str, boolean z12, @k AvCallsCreateCallMetaInfo avCallsCreateCallMetaInfo) {
            super(null);
            this.callId = str;
            this.isVideo = z12;
            this.createCallMeta = avCallsCreateCallMetaInfo;
        }

        public static /* synthetic */ OutgoingCallAllocatingEvent copy$default(OutgoingCallAllocatingEvent outgoingCallAllocatingEvent, String str, boolean z12, AvCallsCreateCallMetaInfo avCallsCreateCallMetaInfo, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = outgoingCallAllocatingEvent.callId;
            }
            if ((i12 & 2) != 0) {
                z12 = outgoingCallAllocatingEvent.isVideo;
            }
            if ((i12 & 4) != 0) {
                avCallsCreateCallMetaInfo = outgoingCallAllocatingEvent.createCallMeta;
            }
            return outgoingCallAllocatingEvent.copy(str, z12, avCallsCreateCallMetaInfo);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsVideo() {
            return this.isVideo;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final AvCallsCreateCallMetaInfo getCreateCallMeta() {
            return this.createCallMeta;
        }

        @k
        public final OutgoingCallAllocatingEvent copy(@k String callId, boolean isVideo, @k AvCallsCreateCallMetaInfo createCallMeta) {
            return new OutgoingCallAllocatingEvent(callId, isVideo, createCallMeta);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OutgoingCallAllocatingEvent)) {
                return false;
            }
            OutgoingCallAllocatingEvent outgoingCallAllocatingEvent = (OutgoingCallAllocatingEvent) other;
            return L.f(this.callId, outgoingCallAllocatingEvent.callId) && this.isVideo == outgoingCallAllocatingEvent.isVideo && L.f(this.createCallMeta, outgoingCallAllocatingEvent.createCallMeta);
        }

        @k
        public final String getCallId() {
            return this.callId;
        }

        @k
        public final AvCallsCreateCallMetaInfo getCreateCallMeta() {
            return this.createCallMeta;
        }

        public int hashCode() {
            return this.createCallMeta.hashCode() + r.i(this.callId.hashCode() * 31, 31, this.isVideo);
        }

        public final boolean isVideo() {
            return this.isVideo;
        }

        @k
        public String toString() {
            return "OutgoingCallAllocatingEvent(callId=" + this.callId + ", isVideo=" + this.isVideo + ", createCallMeta=" + this.createCallMeta + ')';
        }
    }

    /* compiled from: AvCallsFunnelEventsObserver.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\r\u0010\u000f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver$OutgoingCallRingingEvent;", "Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver$Event;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallId;", "isVideo", "", Constants.REFERRER_API_META, "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallMetaInfo;", "(Ljava/lang/String;ZLcom/avito/android/iac_avcalls/public_module/models/AvCallsCallMetaInfo;)V", "getCallId", "()Ljava/lang/String;", "()Z", "getMeta", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallMetaInfo;", "component1", "component2", "component3", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OutgoingCallRingingEvent extends Event {

        @k
        private final String callId;
        private final boolean isVideo;

        @k
        private final AvCallsCallMetaInfo meta;

        public OutgoingCallRingingEvent(@k String str, boolean z12, @k AvCallsCallMetaInfo avCallsCallMetaInfo) {
            super(null);
            this.callId = str;
            this.isVideo = z12;
            this.meta = avCallsCallMetaInfo;
        }

        public static /* synthetic */ OutgoingCallRingingEvent copy$default(OutgoingCallRingingEvent outgoingCallRingingEvent, String str, boolean z12, AvCallsCallMetaInfo avCallsCallMetaInfo, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = outgoingCallRingingEvent.callId;
            }
            if ((i12 & 2) != 0) {
                z12 = outgoingCallRingingEvent.isVideo;
            }
            if ((i12 & 4) != 0) {
                avCallsCallMetaInfo = outgoingCallRingingEvent.meta;
            }
            return outgoingCallRingingEvent.copy(str, z12, avCallsCallMetaInfo);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsVideo() {
            return this.isVideo;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final AvCallsCallMetaInfo getMeta() {
            return this.meta;
        }

        @k
        public final OutgoingCallRingingEvent copy(@k String callId, boolean isVideo, @k AvCallsCallMetaInfo meta) {
            return new OutgoingCallRingingEvent(callId, isVideo, meta);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OutgoingCallRingingEvent)) {
                return false;
            }
            OutgoingCallRingingEvent outgoingCallRingingEvent = (OutgoingCallRingingEvent) other;
            return L.f(this.callId, outgoingCallRingingEvent.callId) && this.isVideo == outgoingCallRingingEvent.isVideo && L.f(this.meta, outgoingCallRingingEvent.meta);
        }

        @k
        public final String getCallId() {
            return this.callId;
        }

        @k
        public final AvCallsCallMetaInfo getMeta() {
            return this.meta;
        }

        public int hashCode() {
            return this.meta.hashCode() + r.i(this.callId.hashCode() * 31, 31, this.isVideo);
        }

        public final boolean isVideo() {
            return this.isVideo;
        }

        @k
        public String toString() {
            return "OutgoingCallRingingEvent(callId=" + this.callId + ", isVideo=" + this.isVideo + ", meta=" + this.meta + ')';
        }
    }

    @k
    InterfaceC43160i<Event> getEvents();
}
