package com.avito.android.iac_dialer.impl_module.notifications.new_impl;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacNotification.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u000b\fR\u0018\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification;", "LdL/d;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "getCallId", "()Ljava/lang/String;", FailedBinderCallBack.CALLER_ID, "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "getDirection", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "direction", "Call", "CallInitializing", "Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call;", "Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$CallInitializing;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IacNotification extends dL.d {

    /* compiled from: IacNotification.kt */
    @P
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002./BM\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0011J\r\u0010\u001f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003Ja\u0010'\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call;", "Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "highPriority", "", "type", "Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call$Type;", CrashHianalyticsData.TIME, "Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call$Time;", "direction", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "isVideo", "peerName", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "itemTitle", "(Ljava/lang/String;ZLcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call$Type;Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call$Time;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;ZLcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;)V", "getCallId", "()Ljava/lang/String;", "getDirection", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "getHighPriority", "()Z", "getItemTitle", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "getPeerName", "getTime", "()Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call$Time;", "getType", "()Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Time", "Type", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Call implements IacNotification {
        public static final int $stable = 8;

        @Y61.k
        private final String callId;

        @Y61.k
        private final IacCallDirection direction;
        private final boolean highPriority;
        private final boolean isVideo;

        @Y61.l
        private final IacPiiString itemTitle;

        @Y61.l
        private final IacPiiString peerName;

        @Y61.k
        private final Time time;

        @Y61.k
        private final Type type;

        /* compiled from: IacNotification.kt */
        @P
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\tR\u0017\u0010\u001d\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010 \u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u001fR\u0017\u0010!\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010\u001f¨\u0006\""}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call$Time;", "LdL/d;", "", "activatedAt", "initializedAt", "finishedAt", "<init>", "(JJJ)V", "component1", "()J", "component2", "component3", "copy", "(JJJ)Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call$Time;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "J", "getActivatedAt", "getInitializedAt", "getFinishedAt", "isInitialized", "Z", "()Z", "isActivated", "isFinished", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Time implements dL.d {
            public static final int $stable = 0;
            private final long activatedAt;
            private final long finishedAt;
            private final long initializedAt;
            private final boolean isActivated;
            private final boolean isFinished;
            private final boolean isInitialized;

            public Time(long j12, long j13, long j14) {
                this.activatedAt = j12;
                this.initializedAt = j13;
                this.finishedAt = j14;
                this.isInitialized = j13 != -1;
                this.isActivated = j12 != -1;
                this.isFinished = j14 != -1;
            }

            public static /* synthetic */ Time copy$default(Time time, long j12, long j13, long j14, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    j12 = time.activatedAt;
                }
                long j15 = j12;
                if ((i12 & 2) != 0) {
                    j13 = time.initializedAt;
                }
                long j16 = j13;
                if ((i12 & 4) != 0) {
                    j14 = time.finishedAt;
                }
                return time.copy(j15, j16, j14);
            }

            /* renamed from: component1, reason: from getter */
            public final long getActivatedAt() {
                return this.activatedAt;
            }

            /* renamed from: component2, reason: from getter */
            public final long getInitializedAt() {
                return this.initializedAt;
            }

            /* renamed from: component3, reason: from getter */
            public final long getFinishedAt() {
                return this.finishedAt;
            }

            @Y61.k
            public final Time copy(long activatedAt, long initializedAt, long finishedAt) {
                return new Time(activatedAt, initializedAt, finishedAt);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Time)) {
                    return false;
                }
                Time time = (Time) other;
                return this.activatedAt == time.activatedAt && this.initializedAt == time.initializedAt && this.finishedAt == time.finishedAt;
            }

            public final long getActivatedAt() {
                return this.activatedAt;
            }

            public final long getFinishedAt() {
                return this.finishedAt;
            }

            public final long getInitializedAt() {
                return this.initializedAt;
            }

            public int hashCode() {
                return Long.hashCode(this.finishedAt) + r.g(Long.hashCode(this.activatedAt) * 31, 31, this.initializedAt);
            }

            /* renamed from: isActivated, reason: from getter */
            public final boolean getIsActivated() {
                return this.isActivated;
            }

            /* renamed from: isFinished, reason: from getter */
            public final boolean getIsFinished() {
                return this.isFinished;
            }

            /* renamed from: isInitialized, reason: from getter */
            public final boolean getIsInitialized() {
                return this.isInitialized;
            }

            @Y61.k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Time(activatedAt=");
                sb2.append(this.activatedAt);
                sb2.append(", initializedAt=");
                sb2.append(this.initializedAt);
                sb2.append(", finishedAt=");
                return r.u(sb2, this.finishedAt, ')');
            }
        }

        /* compiled from: IacNotification.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call$Type;", "LdL/d;", "Incoming", "Ongoing", "Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call$Type$Incoming;", "Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call$Type$Ongoing;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface Type extends dL.d {

            /* compiled from: IacNotification.kt */
            @P
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call$Type$Incoming;", "Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call$Type;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Incoming implements Type {
                public static final int $stable = 0;

                @Y61.k
                public static final Incoming INSTANCE = new Incoming();

                private Incoming() {
                }

                public boolean equals(@Y61.l Object other) {
                    return this == other || (other instanceof Incoming);
                }

                public int hashCode() {
                    return 755263510;
                }

                @Y61.k
                public String toString() {
                    return "Incoming";
                }
            }

            /* compiled from: IacNotification.kt */
            @P
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call$Type$Ongoing;", "Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call$Type;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Ongoing implements Type {
                public static final int $stable = 0;

                @Y61.k
                public static final Ongoing INSTANCE = new Ongoing();

                private Ongoing() {
                }

                public boolean equals(@Y61.l Object other) {
                    return this == other || (other instanceof Ongoing);
                }

                public int hashCode() {
                    return -1851385461;
                }

                @Y61.k
                public String toString() {
                    return "Ongoing";
                }
            }
        }

        public Call(@Y61.k String str, boolean z12, @Y61.k Type type, @Y61.k Time time, @Y61.k IacCallDirection iacCallDirection, boolean z13, @Y61.l IacPiiString iacPiiString, @Y61.l IacPiiString iacPiiString2) {
            this.callId = str;
            this.highPriority = z12;
            this.type = type;
            this.time = time;
            this.direction = iacCallDirection;
            this.isVideo = z13;
            this.peerName = iacPiiString;
            this.itemTitle = iacPiiString2;
        }

        @Y61.k
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHighPriority() {
            return this.highPriority;
        }

        @Y61.k
        /* renamed from: component3, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        @Y61.k
        /* renamed from: component4, reason: from getter */
        public final Time getTime() {
            return this.time;
        }

        @Y61.k
        /* renamed from: component5, reason: from getter */
        public final IacCallDirection getDirection() {
            return this.direction;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsVideo() {
            return this.isVideo;
        }

        @Y61.l
        /* renamed from: component7, reason: from getter */
        public final IacPiiString getPeerName() {
            return this.peerName;
        }

        @Y61.l
        /* renamed from: component8, reason: from getter */
        public final IacPiiString getItemTitle() {
            return this.itemTitle;
        }

        @Y61.k
        public final Call copy(@Y61.k String callId, boolean highPriority, @Y61.k Type type, @Y61.k Time time, @Y61.k IacCallDirection direction, boolean isVideo, @Y61.l IacPiiString peerName, @Y61.l IacPiiString itemTitle) {
            return new Call(callId, highPriority, type, time, direction, isVideo, peerName, itemTitle);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Call)) {
                return false;
            }
            Call call = (Call) other;
            return L.f(this.callId, call.callId) && this.highPriority == call.highPriority && L.f(this.type, call.type) && L.f(this.time, call.time) && this.direction == call.direction && this.isVideo == call.isVideo && L.f(this.peerName, call.peerName) && L.f(this.itemTitle, call.itemTitle);
        }

        @Override // com.avito.android.iac_dialer.impl_module.notifications.new_impl.IacNotification
        @Y61.k
        public String getCallId() {
            return this.callId;
        }

        @Override // com.avito.android.iac_dialer.impl_module.notifications.new_impl.IacNotification
        @Y61.k
        public IacCallDirection getDirection() {
            return this.direction;
        }

        public final boolean getHighPriority() {
            return this.highPriority;
        }

        @Y61.l
        public final IacPiiString getItemTitle() {
            return this.itemTitle;
        }

        @Y61.l
        public final IacPiiString getPeerName() {
            return this.peerName;
        }

        @Y61.k
        public final Time getTime() {
            return this.time;
        }

        @Y61.k
        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            int i12 = r.i((this.direction.hashCode() + ((this.time.hashCode() + ((this.type.hashCode() + r.i(this.callId.hashCode() * 31, 31, this.highPriority)) * 31)) * 31)) * 31, 31, this.isVideo);
            IacPiiString iacPiiString = this.peerName;
            int iHashCode = (i12 + (iacPiiString == null ? 0 : iacPiiString.hashCode())) * 31;
            IacPiiString iacPiiString2 = this.itemTitle;
            return iHashCode + (iacPiiString2 != null ? iacPiiString2.hashCode() : 0);
        }

        public final boolean isVideo() {
            return this.isVideo;
        }

        @Y61.k
        public String toString() {
            return "Call(callId=" + this.callId + ", highPriority=" + this.highPriority + ", type=" + this.type + ", time=" + this.time + ", direction=" + this.direction + ", isVideo=" + this.isVideo + ", peerName=" + this.peerName + ", itemTitle=" + this.itemTitle + ')';
        }
    }

    /* compiled from: IacNotification.kt */
    @P
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\r\u0010\u000f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$CallInitializing;", "Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "isVideo", "", "direction", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "(Ljava/lang/String;ZLcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;)V", "getCallId", "()Ljava/lang/String;", "getDirection", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "()Z", "component1", "component2", "component3", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CallInitializing implements IacNotification {
        public static final int $stable = 0;

        @Y61.k
        private final String callId;

        @Y61.k
        private final IacCallDirection direction;
        private final boolean isVideo;

        public CallInitializing(@Y61.k String str, boolean z12, @Y61.k IacCallDirection iacCallDirection) {
            this.callId = str;
            this.isVideo = z12;
            this.direction = iacCallDirection;
        }

        public static /* synthetic */ CallInitializing copy$default(CallInitializing callInitializing, String str, boolean z12, IacCallDirection iacCallDirection, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = callInitializing.callId;
            }
            if ((i12 & 2) != 0) {
                z12 = callInitializing.isVideo;
            }
            if ((i12 & 4) != 0) {
                iacCallDirection = callInitializing.direction;
            }
            return callInitializing.copy(str, z12, iacCallDirection);
        }

        @Y61.k
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsVideo() {
            return this.isVideo;
        }

        @Y61.k
        /* renamed from: component3, reason: from getter */
        public final IacCallDirection getDirection() {
            return this.direction;
        }

        @Y61.k
        public final CallInitializing copy(@Y61.k String callId, boolean isVideo, @Y61.k IacCallDirection direction) {
            return new CallInitializing(callId, isVideo, direction);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CallInitializing)) {
                return false;
            }
            CallInitializing callInitializing = (CallInitializing) other;
            return L.f(this.callId, callInitializing.callId) && this.isVideo == callInitializing.isVideo && this.direction == callInitializing.direction;
        }

        @Override // com.avito.android.iac_dialer.impl_module.notifications.new_impl.IacNotification
        @Y61.k
        public String getCallId() {
            return this.callId;
        }

        @Override // com.avito.android.iac_dialer.impl_module.notifications.new_impl.IacNotification
        @Y61.k
        public IacCallDirection getDirection() {
            return this.direction;
        }

        public int hashCode() {
            return this.direction.hashCode() + r.i(this.callId.hashCode() * 31, 31, this.isVideo);
        }

        public final boolean isVideo() {
            return this.isVideo;
        }

        @Y61.k
        public String toString() {
            return "CallInitializing(callId=" + this.callId + ", isVideo=" + this.isVideo + ", direction=" + this.direction + ')';
        }
    }

    @Y61.k
    String getCallId();

    @Y61.k
    IacCallDirection getDirection();
}
