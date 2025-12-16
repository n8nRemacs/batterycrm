package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.analytics.provider.clickstream.a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCreateCallMetaInfo;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallStorage;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.FgType;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReason;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.input.CallInput;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioDevice;
import com.avito.android.iac_dialer.impl_module.audio.ringtone.IacRingingMode;
import com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.e;
import com.avito.android.iac_dialer.impl_module.audio.tone.IacToneType;
import com.avito.android.iac_dialer.impl_module.camera.IacCameraPosition;
import com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor;
import com.avito.android.iac_dialer.impl_module.final_link.IacMetaInfoStorage;
import com.avito.android.iac_dialer.impl_module.notifications.new_impl.IacNotification;
import com.avito.android.iac_dialer.impl_module.timer_interactor.IacTimerInteractor;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.huawei.hms.api.FailedBinderCallBack;
import dL.d;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import mJ.AbstractC43973b;

/* compiled from: IacEvent.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "LdL/d;", "ActivityLauncher", "Analytics", "AvCalls", "BackClicksSuppressor", "CallScreen", "CanRecallInteractor", "Finalizing", "FirebaseLog", "MediaService", "Notification", "ProximityWakeLocker", "RingingPlayer", "Storage", "Telecom", "TimerInteractor", "TonePlayer", "Watcher", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$ActivityLauncher;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$BackClicksSuppressor;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CanRecallInteractor;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Finalizing;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$FirebaseLog;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$MediaService;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Notification;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$ProximityWakeLocker;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$RingingPlayer;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Storage;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$TimerInteractor;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$TonePlayer;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Watcher;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IacEvent extends d {

    /* compiled from: IacEvent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$ActivityLauncher;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "Launch", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$ActivityLauncher$Launch;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ActivityLauncher extends IacEvent {

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$ActivityLauncher$Launch;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$ActivityLauncher;", "argument", "Landroid/os/Parcelable;", "(Landroid/os/Parcelable;)V", "getArgument", "()Landroid/os/Parcelable;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Launch implements ActivityLauncher {
            public static final int $stable = 8;

            @k
            private final Parcelable argument;

            public Launch(@k Parcelable parcelable) {
                this.argument = parcelable;
            }

            public static /* synthetic */ Launch copy$default(Launch launch, Parcelable parcelable, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    parcelable = launch.argument;
                }
                return launch.copy(parcelable);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final Parcelable getArgument() {
                return this.argument;
            }

            @k
            public final Launch copy(@k Parcelable argument) {
                return new Launch(argument);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Launch) && L.f(this.argument, ((Launch) other).argument);
            }

            @k
            public final Parcelable getArgument() {
                return this.argument;
            }

            public int hashCode() {
                return this.argument.hashCode();
            }

            @k
            public String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.o(new StringBuilder("Launch(argument="), this.argument, ')');
            }
        }
    }

    /* compiled from: IacEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "Track", "TrackCallFetchedEvent5446", "TrackGreenButtonClickedEvent4682", "TrackNonFatal", "TrackOnce", "TrackRedButtonClickedEvent4683", "TrackStatsdCount", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics$Track;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics$TrackCallFetchedEvent5446;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics$TrackGreenButtonClickedEvent4682;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics$TrackNonFatal;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics$TrackOnce;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics$TrackRedButtonClickedEvent4683;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics$TrackStatsdCount;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Analytics extends IacEvent {

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics$Track;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics;", "Lcom/avito/android/analytics/o;", "event", "<init>", "(Lcom/avito/android/analytics/o;)V", "component1", "()Lcom/avito/android/analytics/o;", "copy", "(Lcom/avito/android/analytics/o;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics$Track;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/analytics/o;", "getEvent", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Track implements Analytics {
            public static final int $stable = 8;

            @k
            private final InterfaceC28464o event;

            public Track(@k InterfaceC28464o interfaceC28464o) {
                this.event = interfaceC28464o;
            }

            public static /* synthetic */ Track copy$default(Track track, InterfaceC28464o interfaceC28464o, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    interfaceC28464o = track.event;
                }
                return track.copy(interfaceC28464o);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final InterfaceC28464o getEvent() {
                return this.event;
            }

            @k
            public final Track copy(@k InterfaceC28464o event) {
                return new Track(event);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Track) && L.f(this.event, ((Track) other).event);
            }

            @k
            public final InterfaceC28464o getEvent() {
                return this.event;
            }

            public int hashCode() {
                return this.event.hashCode();
            }

            @k
            public String toString() {
                return "Track(event=" + this.event + ')';
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics$TrackCallFetchedEvent5446;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics;", FailedBinderCallBack.CALLER_ID, "", "(Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TrackCallFetchedEvent5446 implements Analytics {
            public static final int $stable = 0;

            @k
            private final String callId;

            public TrackCallFetchedEvent5446(@k String str) {
                this.callId = str;
            }

            public static /* synthetic */ TrackCallFetchedEvent5446 copy$default(TrackCallFetchedEvent5446 trackCallFetchedEvent5446, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = trackCallFetchedEvent5446.callId;
                }
                return trackCallFetchedEvent5446.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final TrackCallFetchedEvent5446 copy(@k String callId) {
                return new TrackCallFetchedEvent5446(callId);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TrackCallFetchedEvent5446) && L.f(this.callId, ((TrackCallFetchedEvent5446) other).callId);
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
                return C22026a.c(new StringBuilder("TrackCallFetchedEvent5446(callId="), this.callId, ')');
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u000b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J!\u0010\r\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics$TrackGreenButtonClickedEvent4682;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "isFromAppUi", "", "(Ljava/lang/String;Z)V", "getCallId", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TrackGreenButtonClickedEvent4682 implements Analytics {
            public static final int $stable = 0;

            @k
            private final String callId;
            private final boolean isFromAppUi;

            public TrackGreenButtonClickedEvent4682(@k String str, boolean z12) {
                this.callId = str;
                this.isFromAppUi = z12;
            }

            public static /* synthetic */ TrackGreenButtonClickedEvent4682 copy$default(TrackGreenButtonClickedEvent4682 trackGreenButtonClickedEvent4682, String str, boolean z12, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = trackGreenButtonClickedEvent4682.callId;
                }
                if ((i12 & 2) != 0) {
                    z12 = trackGreenButtonClickedEvent4682.isFromAppUi;
                }
                return trackGreenButtonClickedEvent4682.copy(str, z12);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsFromAppUi() {
                return this.isFromAppUi;
            }

            @k
            public final TrackGreenButtonClickedEvent4682 copy(@k String callId, boolean isFromAppUi) {
                return new TrackGreenButtonClickedEvent4682(callId, isFromAppUi);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TrackGreenButtonClickedEvent4682)) {
                    return false;
                }
                TrackGreenButtonClickedEvent4682 trackGreenButtonClickedEvent4682 = (TrackGreenButtonClickedEvent4682) other;
                return L.f(this.callId, trackGreenButtonClickedEvent4682.callId) && this.isFromAppUi == trackGreenButtonClickedEvent4682.isFromAppUi;
            }

            @k
            public final String getCallId() {
                return this.callId;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isFromAppUi) + (this.callId.hashCode() * 31);
            }

            public final boolean isFromAppUi() {
                return this.isFromAppUi;
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("TrackGreenButtonClickedEvent4682(callId=");
                sb2.append(this.callId);
                sb2.append(", isFromAppUi=");
                return r.x(sb2, this.isFromAppUi, ')');
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics$TrackNonFatal;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics;", "event", "Lcom/avito/android/error_reporting/non_fatal/NonFatalErrorEvent;", "(Lcom/avito/android/error_reporting/non_fatal/NonFatalErrorEvent;)V", "getEvent", "()Lcom/avito/android/error_reporting/non_fatal/NonFatalErrorEvent;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TrackNonFatal implements Analytics {
            public static final int $stable = 8;

            @k
            private final NonFatalErrorEvent event;

            public TrackNonFatal(@k NonFatalErrorEvent nonFatalErrorEvent) {
                this.event = nonFatalErrorEvent;
            }

            public static /* synthetic */ TrackNonFatal copy$default(TrackNonFatal trackNonFatal, NonFatalErrorEvent nonFatalErrorEvent, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    nonFatalErrorEvent = trackNonFatal.event;
                }
                return trackNonFatal.copy(nonFatalErrorEvent);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final NonFatalErrorEvent getEvent() {
                return this.event;
            }

            @k
            public final TrackNonFatal copy(@k NonFatalErrorEvent event) {
                return new TrackNonFatal(event);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TrackNonFatal) && L.f(this.event, ((TrackNonFatal) other).event);
            }

            @k
            public final NonFatalErrorEvent getEvent() {
                return this.event;
            }

            public int hashCode() {
                return this.event.hashCode();
            }

            @k
            public String toString() {
                return "TrackNonFatal(event=" + this.event + ')';
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics$TrackOnce;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics;", "Lcom/avito/android/analytics/provider/clickstream/a;", "event", "<init>", "(Lcom/avito/android/analytics/provider/clickstream/a;)V", "component1", "()Lcom/avito/android/analytics/provider/clickstream/a;", "copy", "(Lcom/avito/android/analytics/provider/clickstream/a;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics$TrackOnce;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/analytics/provider/clickstream/a;", "getEvent", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TrackOnce implements Analytics {
            public static final int $stable = 8;

            @k
            private final a event;

            public TrackOnce(@k a aVar) {
                this.event = aVar;
            }

            public static /* synthetic */ TrackOnce copy$default(TrackOnce trackOnce, a aVar, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    aVar = trackOnce.event;
                }
                return trackOnce.copy(aVar);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final a getEvent() {
                return this.event;
            }

            @k
            public final TrackOnce copy(@k a event) {
                return new TrackOnce(event);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TrackOnce) && L.f(this.event, ((TrackOnce) other).event);
            }

            @k
            public final a getEvent() {
                return this.event;
            }

            public int hashCode() {
                return this.event.hashCode();
            }

            @k
            public String toString() {
                return "TrackOnce(event=" + this.event + ')';
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics$TrackRedButtonClickedEvent4683;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics;", "", FailedBinderCallBack.CALLER_ID, "scenario", "LmJ/b;", "iacDialerScenario", "<init>", "(Ljava/lang/String;Ljava/lang/String;LmJ/b;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()LmJ/b;", "copy", "(Ljava/lang/String;Ljava/lang/String;LmJ/b;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics$TrackRedButtonClickedEvent4683;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallId", "getScenario", "LmJ/b;", "getIacDialerScenario", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TrackRedButtonClickedEvent4683 implements Analytics {
            public static final int $stable = 8;

            @k
            private final String callId;

            @k
            private final AbstractC43973b iacDialerScenario;

            @k
            private final String scenario;

            public TrackRedButtonClickedEvent4683(@k String str, @k String str2, @k AbstractC43973b abstractC43973b) {
                this.callId = str;
                this.scenario = str2;
                this.iacDialerScenario = abstractC43973b;
            }

            public static /* synthetic */ TrackRedButtonClickedEvent4683 copy$default(TrackRedButtonClickedEvent4683 trackRedButtonClickedEvent4683, String str, String str2, AbstractC43973b abstractC43973b, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = trackRedButtonClickedEvent4683.callId;
                }
                if ((i12 & 2) != 0) {
                    str2 = trackRedButtonClickedEvent4683.scenario;
                }
                if ((i12 & 4) != 0) {
                    abstractC43973b = trackRedButtonClickedEvent4683.iacDialerScenario;
                }
                return trackRedButtonClickedEvent4683.copy(str, str2, abstractC43973b);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getScenario() {
                return this.scenario;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final AbstractC43973b getIacDialerScenario() {
                return this.iacDialerScenario;
            }

            @k
            public final TrackRedButtonClickedEvent4683 copy(@k String callId, @k String scenario, @k AbstractC43973b iacDialerScenario) {
                return new TrackRedButtonClickedEvent4683(callId, scenario, iacDialerScenario);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TrackRedButtonClickedEvent4683)) {
                    return false;
                }
                TrackRedButtonClickedEvent4683 trackRedButtonClickedEvent4683 = (TrackRedButtonClickedEvent4683) other;
                return L.f(this.callId, trackRedButtonClickedEvent4683.callId) && L.f(this.scenario, trackRedButtonClickedEvent4683.scenario) && L.f(this.iacDialerScenario, trackRedButtonClickedEvent4683.iacDialerScenario);
            }

            @k
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final AbstractC43973b getIacDialerScenario() {
                return this.iacDialerScenario;
            }

            @k
            public final String getScenario() {
                return this.scenario;
            }

            public int hashCode() {
                return this.iacDialerScenario.hashCode() + H.d(this.callId.hashCode() * 31, 31, this.scenario);
            }

            @k
            public String toString() {
                return "TrackRedButtonClickedEvent4683(callId=" + this.callId + ", scenario=" + this.scenario + ", iacDialerScenario=" + this.iacDialerScenario + ')';
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics$TrackStatsdCount;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics;", "keys", "", "", "([Ljava/lang/String;)V", "v", "", "k", "", "(JLjava/util/List;)V", "getK", "()Ljava/util/List;", "getV", "()J", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TrackStatsdCount implements Analytics {
            public static final int $stable = 8;

            @k
            private final List<String> k;
            private final long v;

            public TrackStatsdCount(@k String... strArr) {
                this(1L, Arrays.asList(strArr));
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TrackStatsdCount copy$default(TrackStatsdCount trackStatsdCount, long j12, List list, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    j12 = trackStatsdCount.v;
                }
                if ((i12 & 2) != 0) {
                    list = trackStatsdCount.k;
                }
                return trackStatsdCount.copy(j12, list);
            }

            /* renamed from: component1, reason: from getter */
            public final long getV() {
                return this.v;
            }

            @k
            public final List<String> component2() {
                return this.k;
            }

            @k
            public final TrackStatsdCount copy(long v12, @k List<String> k12) {
                return new TrackStatsdCount(v12, k12);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TrackStatsdCount)) {
                    return false;
                }
                TrackStatsdCount trackStatsdCount = (TrackStatsdCount) other;
                return this.v == trackStatsdCount.v && L.f(this.k, trackStatsdCount.k);
            }

            @k
            public final List<String> getK() {
                return this.k;
            }

            public final long getV() {
                return this.v;
            }

            public int hashCode() {
                return this.k.hashCode() + (Long.hashCode(this.v) * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("TrackStatsdCount(v=");
                sb2.append(this.v);
                sb2.append(", k=");
                return H.p(sb2, this.k, ')');
            }

            public TrackStatsdCount(long j12, @k List<String> list) {
                this.v = j12;
                this.k = list;
            }
        }
    }

    /* compiled from: IacEvent.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "AcceptIncomingCall", "AttachVideoRenderer", "CreateOutgoingCall", "DetachVideoRenderer", "EnableSendingAudio", "EnableSendingVideo", "HandleCallDeliveredByPush", "HandleSocketMessage", "SendDtmf", "SendRingingForIncomingCall", "StartOutgoingCall", "SwitchCamera", "TerminateCall", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$AcceptIncomingCall;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$AttachVideoRenderer;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$CreateOutgoingCall;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$DetachVideoRenderer;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$EnableSendingAudio;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$EnableSendingVideo;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$HandleCallDeliveredByPush;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$HandleSocketMessage;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$SendDtmf;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$SendRingingForIncomingCall;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$StartOutgoingCall;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$SwitchCamera;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$TerminateCall;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface AvCalls extends IacEvent {

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$AcceptIncomingCall;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "(Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AcceptIncomingCall implements AvCalls {
            public static final int $stable = 0;

            @k
            private final String callId;

            public AcceptIncomingCall(@k String str) {
                this.callId = str;
            }

            public static /* synthetic */ AcceptIncomingCall copy$default(AcceptIncomingCall acceptIncomingCall, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = acceptIncomingCall.callId;
                }
                return acceptIncomingCall.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final AcceptIncomingCall copy(@k String callId) {
                return new AcceptIncomingCall(callId);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AcceptIncomingCall) && L.f(this.callId, ((AcceptIncomingCall) other).callId);
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
                return C22026a.c(new StringBuilder("AcceptIncomingCall(callId="), this.callId, ')');
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$AttachVideoRenderer;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "(Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AttachVideoRenderer implements AvCalls {
            public static final int $stable = 0;

            @k
            private final String callId;

            public AttachVideoRenderer(@k String str) {
                this.callId = str;
            }

            public static /* synthetic */ AttachVideoRenderer copy$default(AttachVideoRenderer attachVideoRenderer, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = attachVideoRenderer.callId;
                }
                return attachVideoRenderer.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final AttachVideoRenderer copy(@k String callId) {
                return new AttachVideoRenderer(callId);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AttachVideoRenderer) && L.f(this.callId, ((AttachVideoRenderer) other).callId);
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
                return C22026a.c(new StringBuilder("AttachVideoRenderer(callId="), this.callId, ')');
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006\u0012\n\u0010\u0007\u001a\u00060\u0003j\u0002`\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\r\u0010\u0014\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u0015\u001a\u00060\u0003j\u0002`\u0006HÆ\u0003J\r\u0010\u0016\u001a\u00060\u0003j\u0002`\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\u000bHÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00062\f\b\u0002\u0010\u0007\u001a\u00060\u0003j\u0002`\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u00060\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0015\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006 "}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$CreateOutgoingCall;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallId;", InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsUserId;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "isVideo", "", "createCallMetaInfo", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCreateCallMetaInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/iac_avcalls/public_module/models/AvCallsCreateCallMetaInfo;)V", "getCallId", "()Ljava/lang/String;", "getCreateCallMetaInfo", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCreateCallMetaInfo;", "getFrom", "()Z", "getTo", "component1", "component2", "component3", "component4", "component5", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CreateOutgoingCall implements AvCalls {
            public static final int $stable = 8;

            @k
            private final String callId;

            @k
            private final AvCallsCreateCallMetaInfo createCallMetaInfo;

            @k
            private final String from;
            private final boolean isVideo;

            @k
            private final String to;

            public CreateOutgoingCall(@k String str, @k String str2, @k String str3, boolean z12, @k AvCallsCreateCallMetaInfo avCallsCreateCallMetaInfo) {
                this.callId = str;
                this.to = str2;
                this.from = str3;
                this.isVideo = z12;
                this.createCallMetaInfo = avCallsCreateCallMetaInfo;
            }

            public static /* synthetic */ CreateOutgoingCall copy$default(CreateOutgoingCall createOutgoingCall, String str, String str2, String str3, boolean z12, AvCallsCreateCallMetaInfo avCallsCreateCallMetaInfo, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = createOutgoingCall.callId;
                }
                if ((i12 & 2) != 0) {
                    str2 = createOutgoingCall.to;
                }
                String str4 = str2;
                if ((i12 & 4) != 0) {
                    str3 = createOutgoingCall.from;
                }
                String str5 = str3;
                if ((i12 & 8) != 0) {
                    z12 = createOutgoingCall.isVideo;
                }
                boolean z13 = z12;
                if ((i12 & 16) != 0) {
                    avCallsCreateCallMetaInfo = createOutgoingCall.createCallMetaInfo;
                }
                return createOutgoingCall.copy(str, str4, str5, z13, avCallsCreateCallMetaInfo);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getTo() {
                return this.to;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final String getFrom() {
                return this.from;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsVideo() {
                return this.isVideo;
            }

            @k
            /* renamed from: component5, reason: from getter */
            public final AvCallsCreateCallMetaInfo getCreateCallMetaInfo() {
                return this.createCallMetaInfo;
            }

            @k
            public final CreateOutgoingCall copy(@k String callId, @k String to2, @k String from, boolean isVideo, @k AvCallsCreateCallMetaInfo createCallMetaInfo) {
                return new CreateOutgoingCall(callId, to2, from, isVideo, createCallMetaInfo);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CreateOutgoingCall)) {
                    return false;
                }
                CreateOutgoingCall createOutgoingCall = (CreateOutgoingCall) other;
                return L.f(this.callId, createOutgoingCall.callId) && L.f(this.to, createOutgoingCall.to) && L.f(this.from, createOutgoingCall.from) && this.isVideo == createOutgoingCall.isVideo && L.f(this.createCallMetaInfo, createOutgoingCall.createCallMetaInfo);
            }

            @k
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final AvCallsCreateCallMetaInfo getCreateCallMetaInfo() {
                return this.createCallMetaInfo;
            }

            @k
            public final String getFrom() {
                return this.from;
            }

            @k
            public final String getTo() {
                return this.to;
            }

            public int hashCode() {
                return this.createCallMetaInfo.hashCode() + r.i(H.d(H.d(this.callId.hashCode() * 31, 31, this.to), 31, this.from), 31, this.isVideo);
            }

            public final boolean isVideo() {
                return this.isVideo;
            }

            @k
            public String toString() {
                return "CreateOutgoingCall(callId=" + this.callId + ", to=" + this.to + ", from=" + this.from + ", isVideo=" + this.isVideo + ", createCallMetaInfo=" + this.createCallMetaInfo + ')';
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$DetachVideoRenderer;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "(Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DetachVideoRenderer implements AvCalls {
            public static final int $stable = 0;

            @k
            private final String callId;

            public DetachVideoRenderer(@k String str) {
                this.callId = str;
            }

            public static /* synthetic */ DetachVideoRenderer copy$default(DetachVideoRenderer detachVideoRenderer, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = detachVideoRenderer.callId;
                }
                return detachVideoRenderer.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final DetachVideoRenderer copy(@k String callId) {
                return new DetachVideoRenderer(callId);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DetachVideoRenderer) && L.f(this.callId, ((DetachVideoRenderer) other).callId);
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
                return C22026a.c(new StringBuilder("DetachVideoRenderer(callId="), this.callId, ')');
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u000b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J!\u0010\r\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$EnableSendingAudio;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "isEnabled", "", "(Ljava/lang/String;Z)V", "getCallId", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class EnableSendingAudio implements AvCalls {
            public static final int $stable = 0;

            @k
            private final String callId;
            private final boolean isEnabled;

            public EnableSendingAudio(@k String str, boolean z12) {
                this.callId = str;
                this.isEnabled = z12;
            }

            public static /* synthetic */ EnableSendingAudio copy$default(EnableSendingAudio enableSendingAudio, String str, boolean z12, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = enableSendingAudio.callId;
                }
                if ((i12 & 2) != 0) {
                    z12 = enableSendingAudio.isEnabled;
                }
                return enableSendingAudio.copy(str, z12);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            @k
            public final EnableSendingAudio copy(@k String callId, boolean isEnabled) {
                return new EnableSendingAudio(callId, isEnabled);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EnableSendingAudio)) {
                    return false;
                }
                EnableSendingAudio enableSendingAudio = (EnableSendingAudio) other;
                return L.f(this.callId, enableSendingAudio.callId) && this.isEnabled == enableSendingAudio.isEnabled;
            }

            @k
            public final String getCallId() {
                return this.callId;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isEnabled) + (this.callId.hashCode() * 31);
            }

            public final boolean isEnabled() {
                return this.isEnabled;
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("EnableSendingAudio(callId=");
                sb2.append(this.callId);
                sb2.append(", isEnabled=");
                return r.x(sb2, this.isEnabled, ')');
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u000b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J!\u0010\r\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$EnableSendingVideo;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "isEnabled", "", "(Ljava/lang/String;Z)V", "getCallId", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class EnableSendingVideo implements AvCalls {
            public static final int $stable = 0;

            @k
            private final String callId;
            private final boolean isEnabled;

            public EnableSendingVideo(@k String str, boolean z12) {
                this.callId = str;
                this.isEnabled = z12;
            }

            public static /* synthetic */ EnableSendingVideo copy$default(EnableSendingVideo enableSendingVideo, String str, boolean z12, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = enableSendingVideo.callId;
                }
                if ((i12 & 2) != 0) {
                    z12 = enableSendingVideo.isEnabled;
                }
                return enableSendingVideo.copy(str, z12);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            @k
            public final EnableSendingVideo copy(@k String callId, boolean isEnabled) {
                return new EnableSendingVideo(callId, isEnabled);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EnableSendingVideo)) {
                    return false;
                }
                EnableSendingVideo enableSendingVideo = (EnableSendingVideo) other;
                return L.f(this.callId, enableSendingVideo.callId) && this.isEnabled == enableSendingVideo.isEnabled;
            }

            @k
            public final String getCallId() {
                return this.callId;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isEnabled) + (this.callId.hashCode() * 31);
            }

            public final boolean isEnabled() {
                return this.isEnabled;
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("EnableSendingVideo(callId=");
                sb2.append(this.callId);
                sb2.append(", isEnabled=");
                return r.x(sb2, this.isEnabled, ')');
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$HandleCallDeliveredByPush;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls;", "json", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;)V", "getJson", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class HandleCallDeliveredByPush implements AvCalls {
            public static final int $stable = 8;

            @k
            private final IacPiiString json;

            public HandleCallDeliveredByPush(@k IacPiiString iacPiiString) {
                this.json = iacPiiString;
            }

            public static /* synthetic */ HandleCallDeliveredByPush copy$default(HandleCallDeliveredByPush handleCallDeliveredByPush, IacPiiString iacPiiString, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    iacPiiString = handleCallDeliveredByPush.json;
                }
                return handleCallDeliveredByPush.copy(iacPiiString);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final IacPiiString getJson() {
                return this.json;
            }

            @k
            public final HandleCallDeliveredByPush copy(@k IacPiiString json) {
                return new HandleCallDeliveredByPush(json);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HandleCallDeliveredByPush) && L.f(this.json, ((HandleCallDeliveredByPush) other).json);
            }

            @k
            public final IacPiiString getJson() {
                return this.json;
            }

            public int hashCode() {
                return this.json.hashCode();
            }

            @k
            public String toString() {
                return "HandleCallDeliveredByPush(json=" + this.json + ')';
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$HandleSocketMessage;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls;", "json", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;)V", "getJson", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class HandleSocketMessage implements AvCalls {
            public static final int $stable = 8;

            @k
            private final IacPiiString json;

            public HandleSocketMessage(@k IacPiiString iacPiiString) {
                this.json = iacPiiString;
            }

            public static /* synthetic */ HandleSocketMessage copy$default(HandleSocketMessage handleSocketMessage, IacPiiString iacPiiString, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    iacPiiString = handleSocketMessage.json;
                }
                return handleSocketMessage.copy(iacPiiString);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final IacPiiString getJson() {
                return this.json;
            }

            @k
            public final HandleSocketMessage copy(@k IacPiiString json) {
                return new HandleSocketMessage(json);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HandleSocketMessage) && L.f(this.json, ((HandleSocketMessage) other).json);
            }

            @k
            public final IacPiiString getJson() {
                return this.json;
            }

            public int hashCode() {
                return this.json.hashCode();
            }

            @k
            public String toString() {
                return "HandleSocketMessage(json=" + this.json + ')';
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\r\u0010\n\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$SendDtmf;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "tone", "(Ljava/lang/String;Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "getTone", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SendDtmf implements AvCalls {
            public static final int $stable = 0;

            @k
            private final String callId;

            @k
            private final String tone;

            public SendDtmf(@k String str, @k String str2) {
                this.callId = str;
                this.tone = str2;
            }

            public static /* synthetic */ SendDtmf copy$default(SendDtmf sendDtmf, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = sendDtmf.callId;
                }
                if ((i12 & 2) != 0) {
                    str2 = sendDtmf.tone;
                }
                return sendDtmf.copy(str, str2);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getTone() {
                return this.tone;
            }

            @k
            public final SendDtmf copy(@k String callId, @k String tone) {
                return new SendDtmf(callId, tone);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SendDtmf)) {
                    return false;
                }
                SendDtmf sendDtmf = (SendDtmf) other;
                return L.f(this.callId, sendDtmf.callId) && L.f(this.tone, sendDtmf.tone);
            }

            @k
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final String getTone() {
                return this.tone;
            }

            public int hashCode() {
                return this.tone.hashCode() + (this.callId.hashCode() * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("SendDtmf(callId=");
                sb2.append(this.callId);
                sb2.append(", tone=");
                return C22026a.c(sb2, this.tone, ')');
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$SendRingingForIncomingCall;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "(Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SendRingingForIncomingCall implements AvCalls {
            public static final int $stable = 0;

            @k
            private final String callId;

            public SendRingingForIncomingCall(@k String str) {
                this.callId = str;
            }

            public static /* synthetic */ SendRingingForIncomingCall copy$default(SendRingingForIncomingCall sendRingingForIncomingCall, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = sendRingingForIncomingCall.callId;
                }
                return sendRingingForIncomingCall.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final SendRingingForIncomingCall copy(@k String callId) {
                return new SendRingingForIncomingCall(callId);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SendRingingForIncomingCall) && L.f(this.callId, ((SendRingingForIncomingCall) other).callId);
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
                return C22026a.c(new StringBuilder("SendRingingForIncomingCall(callId="), this.callId, ')');
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$StartOutgoingCall;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "(Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class StartOutgoingCall implements AvCalls {
            public static final int $stable = 0;

            @k
            private final String callId;

            public StartOutgoingCall(@k String str) {
                this.callId = str;
            }

            public static /* synthetic */ StartOutgoingCall copy$default(StartOutgoingCall startOutgoingCall, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = startOutgoingCall.callId;
                }
                return startOutgoingCall.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final StartOutgoingCall copy(@k String callId) {
                return new StartOutgoingCall(callId);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StartOutgoingCall) && L.f(this.callId, ((StartOutgoingCall) other).callId);
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
                return C22026a.c(new StringBuilder("StartOutgoingCall(callId="), this.callId, ')');
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$SwitchCamera;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls;", "position", "Lcom/avito/android/iac_dialer/impl_module/camera/IacCameraPosition;", "(Lcom/avito/android/iac_dialer/impl_module/camera/IacCameraPosition;)V", "getPosition", "()Lcom/avito/android/iac_dialer/impl_module/camera/IacCameraPosition;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SwitchCamera implements AvCalls {
            public static final int $stable = 0;

            @k
            private final IacCameraPosition position;

            public SwitchCamera(@k IacCameraPosition iacCameraPosition) {
                this.position = iacCameraPosition;
            }

            public static /* synthetic */ SwitchCamera copy$default(SwitchCamera switchCamera, IacCameraPosition iacCameraPosition, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    iacCameraPosition = switchCamera.position;
                }
                return switchCamera.copy(iacCameraPosition);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final IacCameraPosition getPosition() {
                return this.position;
            }

            @k
            public final SwitchCamera copy(@k IacCameraPosition position) {
                return new SwitchCamera(position);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SwitchCamera) && this.position == ((SwitchCamera) other).position;
            }

            @k
            public final IacCameraPosition getPosition() {
                return this.position;
            }

            public int hashCode() {
                return this.position.hashCode();
            }

            @k
            public String toString() {
                return "SwitchCamera(position=" + this.position + ')';
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls$TerminateCall;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$AvCalls;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "terminateReason", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "(Ljava/lang/String;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;)V", "getCallId", "()Ljava/lang/String;", "getTerminateReason", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TerminateCall implements AvCalls {
            public static final int $stable = 0;

            @k
            private final String callId;

            @k
            private final TerminateReason terminateReason;

            public TerminateCall(@k String str, @k TerminateReason terminateReason) {
                this.callId = str;
                this.terminateReason = terminateReason;
            }

            public static /* synthetic */ TerminateCall copy$default(TerminateCall terminateCall, String str, TerminateReason terminateReason, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = terminateCall.callId;
                }
                if ((i12 & 2) != 0) {
                    terminateReason = terminateCall.terminateReason;
                }
                return terminateCall.copy(str, terminateReason);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final TerminateReason getTerminateReason() {
                return this.terminateReason;
            }

            @k
            public final TerminateCall copy(@k String callId, @k TerminateReason terminateReason) {
                return new TerminateCall(callId, terminateReason);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TerminateCall)) {
                    return false;
                }
                TerminateCall terminateCall = (TerminateCall) other;
                return L.f(this.callId, terminateCall.callId) && L.f(this.terminateReason, terminateCall.terminateReason);
            }

            @k
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final TerminateReason getTerminateReason() {
                return this.terminateReason;
            }

            public int hashCode() {
                return this.terminateReason.hashCode() + (this.callId.hashCode() * 31);
            }

            @k
            public String toString() {
                return "TerminateCall(callId=" + this.callId + ", terminateReason=" + this.terminateReason + ')';
            }
        }
    }

    /* compiled from: IacEvent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$BackClicksSuppressor;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "SetEnabled", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$BackClicksSuppressor$SetEnabled;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface BackClicksSuppressor extends IacEvent {

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$BackClicksSuppressor$SetEnabled;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$BackClicksSuppressor;", "enabled", "", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SetEnabled implements BackClicksSuppressor {
            public static final int $stable = 0;
            private final boolean enabled;

            public SetEnabled(boolean z12) {
                this.enabled = z12;
            }

            public static /* synthetic */ SetEnabled copy$default(SetEnabled setEnabled, boolean z12, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    z12 = setEnabled.enabled;
                }
                return setEnabled.copy(z12);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            @k
            public final SetEnabled copy(boolean enabled) {
                return new SetEnabled(enabled);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetEnabled) && this.enabled == ((SetEnabled) other).enabled;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public int hashCode() {
                return Boolean.hashCode(this.enabled);
            }

            @k
            public String toString() {
                return r.x(new StringBuilder("SetEnabled(enabled="), this.enabled, ')');
            }
        }
    }

    /* compiled from: IacEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "ActiveFallbackDialog", "CloseScreenAfterUnsuitableEmptyArgument", "OpenAudioDevicesBottomSheet", "RequestCameraPermission", "RequestMicPermission", "RunDeepLinkInAppActivityTask", "WaitBottomSheet", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$ActiveFallbackDialog;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$CloseScreenAfterUnsuitableEmptyArgument;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$OpenAudioDevicesBottomSheet;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$RequestCameraPermission;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$RequestMicPermission;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$RunDeepLinkInAppActivityTask;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$WaitBottomSheet;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface CallScreen extends IacEvent {

        /* compiled from: IacEvent.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$ActiveFallbackDialog;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen;", "CloseActiveFallbackDialog", "DisplayActiveFallbackDialog", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$ActiveFallbackDialog$CloseActiveFallbackDialog;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$ActiveFallbackDialog$DisplayActiveFallbackDialog;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface ActiveFallbackDialog extends CallScreen {

            /* compiled from: IacEvent.kt */
            @P
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$ActiveFallbackDialog$CloseActiveFallbackDialog;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$ActiveFallbackDialog;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class CloseActiveFallbackDialog implements ActiveFallbackDialog {
                public static final int $stable = 0;

                @k
                public static final CloseActiveFallbackDialog INSTANCE = new CloseActiveFallbackDialog();

                private CloseActiveFallbackDialog() {
                }

                public boolean equals(@l Object other) {
                    return this == other || (other instanceof CloseActiveFallbackDialog);
                }

                public int hashCode() {
                    return -1617612398;
                }

                @k
                public String toString() {
                    return "CloseActiveFallbackDialog";
                }
            }

            /* compiled from: IacEvent.kt */
            @P
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$ActiveFallbackDialog$DisplayActiveFallbackDialog;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$ActiveFallbackDialog;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class DisplayActiveFallbackDialog implements ActiveFallbackDialog {
                public static final int $stable = 0;

                @k
                public static final DisplayActiveFallbackDialog INSTANCE = new DisplayActiveFallbackDialog();

                private DisplayActiveFallbackDialog() {
                }

                public boolean equals(@l Object other) {
                    return this == other || (other instanceof DisplayActiveFallbackDialog);
                }

                public int hashCode() {
                    return -1149482788;
                }

                @k
                public String toString() {
                    return "DisplayActiveFallbackDialog";
                }
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$CloseScreenAfterUnsuitableEmptyArgument;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CloseScreenAfterUnsuitableEmptyArgument implements CallScreen {
            public static final int $stable = 0;

            @k
            public static final CloseScreenAfterUnsuitableEmptyArgument INSTANCE = new CloseScreenAfterUnsuitableEmptyArgument();

            private CloseScreenAfterUnsuitableEmptyArgument() {
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof CloseScreenAfterUnsuitableEmptyArgument);
            }

            public int hashCode() {
                return -48904054;
            }

            @k
            public String toString() {
                return "CloseScreenAfterUnsuitableEmptyArgument";
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$OpenAudioDevicesBottomSheet;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenAudioDevicesBottomSheet implements CallScreen {
            public static final int $stable = 0;

            @k
            public static final OpenAudioDevicesBottomSheet INSTANCE = new OpenAudioDevicesBottomSheet();

            private OpenAudioDevicesBottomSheet() {
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof OpenAudioDevicesBottomSheet);
            }

            public int hashCode() {
                return 1890363771;
            }

            @k
            public String toString() {
                return "OpenAudioDevicesBottomSheet";
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0014\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$RequestCameraPermission;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen;", "isInCall", "", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "scenario", "itemId", "direction", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;)V", "getCallId", "()Ljava/lang/String;", "getDirection", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "()Z", "getItemId", "getScenario", "component1", "component2", "component3", "component4", "component5", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RequestCameraPermission implements CallScreen {
            public static final int $stable = 0;

            @k
            private final String callId;

            @k
            private final IacCallDirection direction;
            private final boolean isInCall;

            @l
            private final String itemId;

            @k
            private final String scenario;

            public RequestCameraPermission(boolean z12, @k String str, @k String str2, @l String str3, @k IacCallDirection iacCallDirection) {
                this.isInCall = z12;
                this.callId = str;
                this.scenario = str2;
                this.itemId = str3;
                this.direction = iacCallDirection;
            }

            public static /* synthetic */ RequestCameraPermission copy$default(RequestCameraPermission requestCameraPermission, boolean z12, String str, String str2, String str3, IacCallDirection iacCallDirection, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    z12 = requestCameraPermission.isInCall;
                }
                if ((i12 & 2) != 0) {
                    str = requestCameraPermission.callId;
                }
                String str4 = str;
                if ((i12 & 4) != 0) {
                    str2 = requestCameraPermission.scenario;
                }
                String str5 = str2;
                if ((i12 & 8) != 0) {
                    str3 = requestCameraPermission.itemId;
                }
                String str6 = str3;
                if ((i12 & 16) != 0) {
                    iacCallDirection = requestCameraPermission.direction;
                }
                return requestCameraPermission.copy(z12, str4, str5, str6, iacCallDirection);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsInCall() {
                return this.isInCall;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final String getScenario() {
                return this.scenario;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final String getItemId() {
                return this.itemId;
            }

            @k
            /* renamed from: component5, reason: from getter */
            public final IacCallDirection getDirection() {
                return this.direction;
            }

            @k
            public final RequestCameraPermission copy(boolean isInCall, @k String callId, @k String scenario, @l String itemId, @k IacCallDirection direction) {
                return new RequestCameraPermission(isInCall, callId, scenario, itemId, direction);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RequestCameraPermission)) {
                    return false;
                }
                RequestCameraPermission requestCameraPermission = (RequestCameraPermission) other;
                return this.isInCall == requestCameraPermission.isInCall && L.f(this.callId, requestCameraPermission.callId) && L.f(this.scenario, requestCameraPermission.scenario) && L.f(this.itemId, requestCameraPermission.itemId) && this.direction == requestCameraPermission.direction;
            }

            @k
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final IacCallDirection getDirection() {
                return this.direction;
            }

            @l
            public final String getItemId() {
                return this.itemId;
            }

            @k
            public final String getScenario() {
                return this.scenario;
            }

            public int hashCode() {
                int iD2 = H.d(H.d(Boolean.hashCode(this.isInCall) * 31, 31, this.callId), 31, this.scenario);
                String str = this.itemId;
                return this.direction.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final boolean isInCall() {
                return this.isInCall;
            }

            @k
            public String toString() {
                return "RequestCameraPermission(isInCall=" + this.isInCall + ", callId=" + this.callId + ", scenario=" + this.scenario + ", itemId=" + this.itemId + ", direction=" + this.direction + ')';
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\r\u0010\u0010\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$RequestMicPermission;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "scenario", "itemId", "direction", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;)V", "getCallId", "()Ljava/lang/String;", "getDirection", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "getItemId", "getScenario", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RequestMicPermission implements CallScreen {
            public static final int $stable = 0;

            @k
            private final String callId;

            @k
            private final IacCallDirection direction;

            @l
            private final String itemId;

            @k
            private final String scenario;

            public RequestMicPermission(@k String str, @k String str2, @l String str3, @k IacCallDirection iacCallDirection) {
                this.callId = str;
                this.scenario = str2;
                this.itemId = str3;
                this.direction = iacCallDirection;
            }

            public static /* synthetic */ RequestMicPermission copy$default(RequestMicPermission requestMicPermission, String str, String str2, String str3, IacCallDirection iacCallDirection, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = requestMicPermission.callId;
                }
                if ((i12 & 2) != 0) {
                    str2 = requestMicPermission.scenario;
                }
                if ((i12 & 4) != 0) {
                    str3 = requestMicPermission.itemId;
                }
                if ((i12 & 8) != 0) {
                    iacCallDirection = requestMicPermission.direction;
                }
                return requestMicPermission.copy(str, str2, str3, iacCallDirection);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getScenario() {
                return this.scenario;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final String getItemId() {
                return this.itemId;
            }

            @k
            /* renamed from: component4, reason: from getter */
            public final IacCallDirection getDirection() {
                return this.direction;
            }

            @k
            public final RequestMicPermission copy(@k String callId, @k String scenario, @l String itemId, @k IacCallDirection direction) {
                return new RequestMicPermission(callId, scenario, itemId, direction);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RequestMicPermission)) {
                    return false;
                }
                RequestMicPermission requestMicPermission = (RequestMicPermission) other;
                return L.f(this.callId, requestMicPermission.callId) && L.f(this.scenario, requestMicPermission.scenario) && L.f(this.itemId, requestMicPermission.itemId) && this.direction == requestMicPermission.direction;
            }

            @k
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final IacCallDirection getDirection() {
                return this.direction;
            }

            @l
            public final String getItemId() {
                return this.itemId;
            }

            @k
            public final String getScenario() {
                return this.scenario;
            }

            public int hashCode() {
                int iD2 = H.d(this.callId.hashCode() * 31, 31, this.scenario);
                String str = this.itemId;
                return this.direction.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
            }

            @k
            public String toString() {
                return "RequestMicPermission(callId=" + this.callId + ", scenario=" + this.scenario + ", itemId=" + this.itemId + ", direction=" + this.direction + ')';
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$RunDeepLinkInAppActivityTask;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen;", Constants.DEEPLINK, "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;)V", "getDeeplink", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RunDeepLinkInAppActivityTask implements CallScreen {
            public static final int $stable = 8;

            @k
            private final IacPiiDeepLink deeplink;

            public RunDeepLinkInAppActivityTask(@k IacPiiDeepLink iacPiiDeepLink) {
                this.deeplink = iacPiiDeepLink;
            }

            public static /* synthetic */ RunDeepLinkInAppActivityTask copy$default(RunDeepLinkInAppActivityTask runDeepLinkInAppActivityTask, IacPiiDeepLink iacPiiDeepLink, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    iacPiiDeepLink = runDeepLinkInAppActivityTask.deeplink;
                }
                return runDeepLinkInAppActivityTask.copy(iacPiiDeepLink);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final IacPiiDeepLink getDeeplink() {
                return this.deeplink;
            }

            @k
            public final RunDeepLinkInAppActivityTask copy(@k IacPiiDeepLink deeplink) {
                return new RunDeepLinkInAppActivityTask(deeplink);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RunDeepLinkInAppActivityTask) && L.f(this.deeplink, ((RunDeepLinkInAppActivityTask) other).deeplink);
            }

            @k
            public final IacPiiDeepLink getDeeplink() {
                return this.deeplink;
            }

            public int hashCode() {
                return this.deeplink.hashCode();
            }

            @k
            public String toString() {
                return "RunDeepLinkInAppActivityTask(deeplink=" + this.deeplink + ')';
            }
        }

        /* compiled from: IacEvent.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$WaitBottomSheet;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen;", "CloseAnyWaitBottomSheet", "DisplayWaitDialingBottomSheet", "DisplayWaitGsmBottomSheet", "DisplayWaitRingingBottomSheet", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$WaitBottomSheet$CloseAnyWaitBottomSheet;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$WaitBottomSheet$DisplayWaitDialingBottomSheet;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$WaitBottomSheet$DisplayWaitGsmBottomSheet;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$WaitBottomSheet$DisplayWaitRingingBottomSheet;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface WaitBottomSheet extends CallScreen {

            /* compiled from: IacEvent.kt */
            @P
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$WaitBottomSheet$CloseAnyWaitBottomSheet;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$WaitBottomSheet;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class CloseAnyWaitBottomSheet implements WaitBottomSheet {
                public static final int $stable = 0;

                @k
                public static final CloseAnyWaitBottomSheet INSTANCE = new CloseAnyWaitBottomSheet();

                private CloseAnyWaitBottomSheet() {
                }

                public boolean equals(@l Object other) {
                    return this == other || (other instanceof CloseAnyWaitBottomSheet);
                }

                public int hashCode() {
                    return 1896387028;
                }

                @k
                public String toString() {
                    return "CloseAnyWaitBottomSheet";
                }
            }

            /* compiled from: IacEvent.kt */
            @P
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$WaitBottomSheet$DisplayWaitDialingBottomSheet;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$WaitBottomSheet;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class DisplayWaitDialingBottomSheet implements WaitBottomSheet {
                public static final int $stable = 0;

                @k
                public static final DisplayWaitDialingBottomSheet INSTANCE = new DisplayWaitDialingBottomSheet();

                private DisplayWaitDialingBottomSheet() {
                }

                public boolean equals(@l Object other) {
                    return this == other || (other instanceof DisplayWaitDialingBottomSheet);
                }

                public int hashCode() {
                    return -1193705694;
                }

                @k
                public String toString() {
                    return "DisplayWaitDialingBottomSheet";
                }
            }

            /* compiled from: IacEvent.kt */
            @P
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$WaitBottomSheet$DisplayWaitGsmBottomSheet;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$WaitBottomSheet;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class DisplayWaitGsmBottomSheet implements WaitBottomSheet {
                public static final int $stable = 0;

                @k
                public static final DisplayWaitGsmBottomSheet INSTANCE = new DisplayWaitGsmBottomSheet();

                private DisplayWaitGsmBottomSheet() {
                }

                public boolean equals(@l Object other) {
                    return this == other || (other instanceof DisplayWaitGsmBottomSheet);
                }

                public int hashCode() {
                    return 609887539;
                }

                @k
                public String toString() {
                    return "DisplayWaitGsmBottomSheet";
                }
            }

            /* compiled from: IacEvent.kt */
            @P
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$WaitBottomSheet$DisplayWaitRingingBottomSheet;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CallScreen$WaitBottomSheet;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class DisplayWaitRingingBottomSheet implements WaitBottomSheet {
                public static final int $stable = 0;

                @k
                public static final DisplayWaitRingingBottomSheet INSTANCE = new DisplayWaitRingingBottomSheet();

                private DisplayWaitRingingBottomSheet() {
                }

                public boolean equals(@l Object other) {
                    return this == other || (other instanceof DisplayWaitRingingBottomSheet);
                }

                public int hashCode() {
                    return 737349090;
                }

                @k
                public String toString() {
                    return "DisplayWaitRingingBottomSheet";
                }
            }
        }
    }

    /* compiled from: IacEvent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CanRecallInteractor;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "CheckCanRecall", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CanRecallInteractor$CheckCanRecall;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface CanRecallInteractor extends IacEvent {

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CanRecallInteractor$CheckCanRecall;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$CanRecallInteractor;", "callInput", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$RecallFromSystemApi;", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$RecallFromSystemApi;)V", "getCallInput", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$RecallFromSystemApi;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CheckCanRecall implements CanRecallInteractor {
            public static final int $stable = 0;

            @k
            private final CallInput.RecallFromSystemApi callInput;

            public CheckCanRecall(@k CallInput.RecallFromSystemApi recallFromSystemApi) {
                this.callInput = recallFromSystemApi;
            }

            public static /* synthetic */ CheckCanRecall copy$default(CheckCanRecall checkCanRecall, CallInput.RecallFromSystemApi recallFromSystemApi, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    recallFromSystemApi = checkCanRecall.callInput;
                }
                return checkCanRecall.copy(recallFromSystemApi);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final CallInput.RecallFromSystemApi getCallInput() {
                return this.callInput;
            }

            @k
            public final CheckCanRecall copy(@k CallInput.RecallFromSystemApi callInput) {
                return new CheckCanRecall(callInput);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CheckCanRecall) && L.f(this.callInput, ((CheckCanRecall) other).callInput);
            }

            @k
            public final CallInput.RecallFromSystemApi getCallInput() {
                return this.callInput;
            }

            public int hashCode() {
                return this.callInput.hashCode();
            }

            @k
            public String toString() {
                return "CheckCanRecall(callInput=" + this.callInput + ')';
            }
        }
    }

    /* compiled from: IacEvent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Finalizing;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "ResolveFinalLink", "SaveMetaToFinalLinkStorage", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Finalizing$ResolveFinalLink;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Finalizing$SaveMetaToFinalLinkStorage;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Finalizing extends IacEvent {

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Finalizing$ResolveFinalLink;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Finalizing;", "params", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$Params;", "(Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$Params;)V", "getParams", "()Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$Params;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ResolveFinalLink implements Finalizing {
            public static final int $stable = 8;

            @k
            private final IacFinalLinkInteractor.Params params;

            public ResolveFinalLink(@k IacFinalLinkInteractor.Params params) {
                this.params = params;
            }

            public static /* synthetic */ ResolveFinalLink copy$default(ResolveFinalLink resolveFinalLink, IacFinalLinkInteractor.Params params, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    params = resolveFinalLink.params;
                }
                return resolveFinalLink.copy(params);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final IacFinalLinkInteractor.Params getParams() {
                return this.params;
            }

            @k
            public final ResolveFinalLink copy(@k IacFinalLinkInteractor.Params params) {
                return new ResolveFinalLink(params);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ResolveFinalLink) && L.f(this.params, ((ResolveFinalLink) other).params);
            }

            @k
            public final IacFinalLinkInteractor.Params getParams() {
                return this.params;
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            @k
            public String toString() {
                return "ResolveFinalLink(params=" + this.params + ')';
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Finalizing$SaveMetaToFinalLinkStorage;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Finalizing;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "data", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$Data;", "(Ljava/lang/String;Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$Data;)V", "getCallId", "()Ljava/lang/String;", "getData", "()Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$Data;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SaveMetaToFinalLinkStorage implements Finalizing {
            public static final int $stable = 8;

            @k
            private final String callId;

            @k
            private final IacMetaInfoStorage.Data data;

            public SaveMetaToFinalLinkStorage(@k String str, @k IacMetaInfoStorage.Data data) {
                this.callId = str;
                this.data = data;
            }

            public static /* synthetic */ SaveMetaToFinalLinkStorage copy$default(SaveMetaToFinalLinkStorage saveMetaToFinalLinkStorage, String str, IacMetaInfoStorage.Data data, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = saveMetaToFinalLinkStorage.callId;
                }
                if ((i12 & 2) != 0) {
                    data = saveMetaToFinalLinkStorage.data;
                }
                return saveMetaToFinalLinkStorage.copy(str, data);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final IacMetaInfoStorage.Data getData() {
                return this.data;
            }

            @k
            public final SaveMetaToFinalLinkStorage copy(@k String callId, @k IacMetaInfoStorage.Data data) {
                return new SaveMetaToFinalLinkStorage(callId, data);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SaveMetaToFinalLinkStorage)) {
                    return false;
                }
                SaveMetaToFinalLinkStorage saveMetaToFinalLinkStorage = (SaveMetaToFinalLinkStorage) other;
                return L.f(this.callId, saveMetaToFinalLinkStorage.callId) && L.f(this.data, saveMetaToFinalLinkStorage.data);
            }

            @k
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final IacMetaInfoStorage.Data getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode() + (this.callId.hashCode() * 31);
            }

            @k
            public String toString() {
                return "SaveMetaToFinalLinkStorage(callId=" + this.callId + ", data=" + this.data + ')';
            }
        }
    }

    /* compiled from: IacEvent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$FirebaseLog;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "Log", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$FirebaseLog$Log;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface FirebaseLog extends IacEvent {

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$FirebaseLog$Log;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$FirebaseLog;", "msg", "", "(Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Log implements FirebaseLog {
            public static final int $stable = 0;

            @k
            private final String msg;

            public Log(@k String str) {
                this.msg = str;
            }

            public static /* synthetic */ Log copy$default(Log log, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = log.msg;
                }
                return log.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getMsg() {
                return this.msg;
            }

            @k
            public final Log copy(@k String msg) {
                return new Log(msg);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Log) && L.f(this.msg, ((Log) other).msg);
            }

            @k
            public final String getMsg() {
                return this.msg;
            }

            public int hashCode() {
                return this.msg.hashCode();
            }

            @k
            public String toString() {
                return C22026a.c(new StringBuilder("Log(msg="), this.msg, ')');
            }
        }
    }

    /* compiled from: IacEvent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$MediaService;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "Start", "Stop", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$MediaService$Start;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$MediaService$Stop;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MediaService extends IacEvent {

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$MediaService$Start;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$MediaService;", "wantedFgType", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/FgType;", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/FgType;)V", "getWantedFgType", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/FgType;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Start implements MediaService {
            public static final int $stable = 0;

            @k
            private final FgType wantedFgType;

            public Start(@k FgType fgType) {
                this.wantedFgType = fgType;
            }

            public static /* synthetic */ Start copy$default(Start start, FgType fgType, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    fgType = start.wantedFgType;
                }
                return start.copy(fgType);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final FgType getWantedFgType() {
                return this.wantedFgType;
            }

            @k
            public final Start copy(@k FgType wantedFgType) {
                return new Start(wantedFgType);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Start) && L.f(this.wantedFgType, ((Start) other).wantedFgType);
            }

            @k
            public final FgType getWantedFgType() {
                return this.wantedFgType;
            }

            public int hashCode() {
                return this.wantedFgType.hashCode();
            }

            @k
            public String toString() {
                return "Start(wantedFgType=" + this.wantedFgType + ')';
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$MediaService$Stop;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$MediaService;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Stop implements MediaService {
            public static final int $stable = 0;

            @k
            public static final Stop INSTANCE = new Stop();

            private Stop() {
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof Stop);
            }

            public int hashCode() {
                return 1233422531;
            }

            @k
            public String toString() {
                return "Stop";
            }
        }
    }

    /* compiled from: IacEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0007\b\tR\u0016\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Notification;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "getCallId", "()Ljava/lang/String;", "Cancel", "Display", "EnsureNotificationWasDisplayed", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Notification$Cancel;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Notification$Display;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Notification$EnsureNotificationWasDisplayed;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Notification extends IacEvent {

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Notification$Cancel;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Notification;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "(Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Cancel implements Notification {
            public static final int $stable = 0;

            @k
            private final String callId;

            public Cancel(@k String str) {
                this.callId = str;
            }

            public static /* synthetic */ Cancel copy$default(Cancel cancel, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = cancel.callId;
                }
                return cancel.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final Cancel copy(@k String callId) {
                return new Cancel(callId);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cancel) && L.f(this.callId, ((Cancel) other).callId);
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent.Notification
            @k
            public String getCallId() {
                return this.callId;
            }

            public int hashCode() {
                return this.callId.hashCode();
            }

            @k
            public String toString() {
                return C22026a.c(new StringBuilder("Cancel(callId="), this.callId, ')');
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\u0005\u001a\u00060\u0006j\u0002`\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Notification$Display;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Notification;", NotificationsSettings.Section.SECTION_PAID_SERVICES, "Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification;", "(Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification;)V", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "getCallId", "()Ljava/lang/String;", "getNotification", "()Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Display implements Notification {
            public static final int $stable = 8;

            @k
            private final IacNotification notification;

            public Display(@k IacNotification iacNotification) {
                this.notification = iacNotification;
            }

            public static /* synthetic */ Display copy$default(Display display, IacNotification iacNotification, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    iacNotification = display.notification;
                }
                return display.copy(iacNotification);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final IacNotification getNotification() {
                return this.notification;
            }

            @k
            public final Display copy(@k IacNotification notification) {
                return new Display(notification);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Display) && L.f(this.notification, ((Display) other).notification);
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent.Notification
            @k
            public String getCallId() {
                return this.notification.getCallId();
            }

            @k
            public final IacNotification getNotification() {
                return this.notification;
            }

            public int hashCode() {
                return this.notification.hashCode();
            }

            @k
            public String toString() {
                return "Display(notification=" + this.notification + ')';
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Notification$EnsureNotificationWasDisplayed;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Notification;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "(Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class EnsureNotificationWasDisplayed implements Notification {
            public static final int $stable = 0;

            @k
            private final String callId;

            public EnsureNotificationWasDisplayed(@k String str) {
                this.callId = str;
            }

            public static /* synthetic */ EnsureNotificationWasDisplayed copy$default(EnsureNotificationWasDisplayed ensureNotificationWasDisplayed, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = ensureNotificationWasDisplayed.callId;
                }
                return ensureNotificationWasDisplayed.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final EnsureNotificationWasDisplayed copy(@k String callId) {
                return new EnsureNotificationWasDisplayed(callId);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EnsureNotificationWasDisplayed) && L.f(this.callId, ((EnsureNotificationWasDisplayed) other).callId);
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent.Notification
            @k
            public String getCallId() {
                return this.callId;
            }

            public int hashCode() {
                return this.callId.hashCode();
            }

            @k
            public String toString() {
                return C22026a.c(new StringBuilder("EnsureNotificationWasDisplayed(callId="), this.callId, ')');
            }
        }

        @k
        String getCallId();
    }

    /* compiled from: IacEvent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$ProximityWakeLocker;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "SetEnabled", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$ProximityWakeLocker$SetEnabled;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ProximityWakeLocker extends IacEvent {

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$ProximityWakeLocker$SetEnabled;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$ProximityWakeLocker;", "enabled", "", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SetEnabled implements ProximityWakeLocker {
            public static final int $stable = 0;
            private final boolean enabled;

            public SetEnabled(boolean z12) {
                this.enabled = z12;
            }

            public static /* synthetic */ SetEnabled copy$default(SetEnabled setEnabled, boolean z12, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    z12 = setEnabled.enabled;
                }
                return setEnabled.copy(z12);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            @k
            public final SetEnabled copy(boolean enabled) {
                return new SetEnabled(enabled);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetEnabled) && this.enabled == ((SetEnabled) other).enabled;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public int hashCode() {
                return Boolean.hashCode(this.enabled);
            }

            @k
            public String toString() {
                return r.x(new StringBuilder("SetEnabled(enabled="), this.enabled, ')');
            }
        }
    }

    /* compiled from: IacEvent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$RingingPlayer;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "ShortVibration", "Update", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$RingingPlayer$ShortVibration;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$RingingPlayer$Update;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RingingPlayer extends IacEvent {

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$RingingPlayer$ShortVibration;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$RingingPlayer;", "ringingMode", "Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/IacRingingMode;", "(Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/IacRingingMode;)V", "getRingingMode", "()Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/IacRingingMode;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShortVibration implements RingingPlayer {
            public static final int $stable = 0;

            @k
            private final IacRingingMode ringingMode;

            public ShortVibration(@k IacRingingMode iacRingingMode) {
                this.ringingMode = iacRingingMode;
            }

            public static /* synthetic */ ShortVibration copy$default(ShortVibration shortVibration, IacRingingMode iacRingingMode, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    iacRingingMode = shortVibration.ringingMode;
                }
                return shortVibration.copy(iacRingingMode);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final IacRingingMode getRingingMode() {
                return this.ringingMode;
            }

            @k
            public final ShortVibration copy(@k IacRingingMode ringingMode) {
                return new ShortVibration(ringingMode);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShortVibration) && this.ringingMode == ((ShortVibration) other).ringingMode;
            }

            @k
            public final IacRingingMode getRingingMode() {
                return this.ringingMode;
            }

            public int hashCode() {
                return this.ringingMode.hashCode();
            }

            @k
            public String toString() {
                return "ShortVibration(ringingMode=" + this.ringingMode + ')';
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$RingingPlayer$Update;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$RingingPlayer;", "Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/e;", "ringingPlayerState", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/e;)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/e;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/e;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$RingingPlayer$Update;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/e;", "getRingingPlayerState", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Update implements RingingPlayer {
            public static final int $stable = 0;

            @k
            private final e ringingPlayerState;

            public Update(@k e eVar) {
                this.ringingPlayerState = eVar;
            }

            public static /* synthetic */ Update copy$default(Update update, e eVar, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    eVar = update.ringingPlayerState;
                }
                return update.copy(eVar);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final e getRingingPlayerState() {
                return this.ringingPlayerState;
            }

            @k
            public final Update copy(@k e ringingPlayerState) {
                return new Update(ringingPlayerState);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Update) && L.f(this.ringingPlayerState, ((Update) other).ringingPlayerState);
            }

            @k
            public final e getRingingPlayerState() {
                return this.ringingPlayerState;
            }

            public int hashCode() {
                return this.ringingPlayerState.hashCode();
            }

            @k
            public String toString() {
                return "Update(ringingPlayerState=" + this.ringingPlayerState + ')';
            }
        }
    }

    /* compiled from: IacEvent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Storage;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "Update", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Storage$Update;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Storage extends IacEvent {

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Storage$Update;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Storage;", "storage", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallStorage;", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallStorage;)V", "getStorage", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallStorage;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Update implements Storage {
            public static final int $stable = 0;

            @k
            private final CallStorage storage;

            public Update(@k CallStorage callStorage) {
                this.storage = callStorage;
            }

            public static /* synthetic */ Update copy$default(Update update, CallStorage callStorage, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    callStorage = update.storage;
                }
                return update.copy(callStorage);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final CallStorage getStorage() {
                return this.storage;
            }

            @k
            public final Update copy(@k CallStorage storage) {
                return new Update(storage);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Update) && L.f(this.storage, ((Update) other).storage);
            }

            @k
            public final CallStorage getStorage() {
                return this.storage;
            }

            public int hashCode() {
                return this.storage.hashCode();
            }

            @k
            public String toString() {
                return "Update(storage=" + this.storage + ')';
            }
        }
    }

    /* compiled from: IacEvent.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0007\bR\u0016\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "getCallId", "()Ljava/lang/String;", "AddCall", "Registered", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$AddCall;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$Registered;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Telecom extends IacEvent {

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\r\u0010\u0013\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$AddCall;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "direction", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "isVideo", "", "tags", "", "(Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;ZLjava/util/List;)V", "getCallId", "()Ljava/lang/String;", "getDirection", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "()Z", "getTags", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AddCall implements Telecom {
            public static final int $stable = 8;

            @k
            private final String callId;

            @k
            private final IacCallDirection direction;
            private final boolean isVideo;

            @l
            private final List<String> tags;

            public AddCall(@k String str, @k IacCallDirection iacCallDirection, boolean z12, @l List<String> list) {
                this.callId = str;
                this.direction = iacCallDirection;
                this.isVideo = z12;
                this.tags = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AddCall copy$default(AddCall addCall, String str, IacCallDirection iacCallDirection, boolean z12, List list, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = addCall.callId;
                }
                if ((i12 & 2) != 0) {
                    iacCallDirection = addCall.direction;
                }
                if ((i12 & 4) != 0) {
                    z12 = addCall.isVideo;
                }
                if ((i12 & 8) != 0) {
                    list = addCall.tags;
                }
                return addCall.copy(str, iacCallDirection, z12, list);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final IacCallDirection getDirection() {
                return this.direction;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsVideo() {
                return this.isVideo;
            }

            @l
            public final List<String> component4() {
                return this.tags;
            }

            @k
            public final AddCall copy(@k String callId, @k IacCallDirection direction, boolean isVideo, @l List<String> tags) {
                return new AddCall(callId, direction, isVideo, tags);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddCall)) {
                    return false;
                }
                AddCall addCall = (AddCall) other;
                return L.f(this.callId, addCall.callId) && this.direction == addCall.direction && this.isVideo == addCall.isVideo && L.f(this.tags, addCall.tags);
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent.Telecom
            @k
            public String getCallId() {
                return this.callId;
            }

            @k
            public final IacCallDirection getDirection() {
                return this.direction;
            }

            @l
            public final List<String> getTags() {
                return this.tags;
            }

            public int hashCode() {
                int i12 = r.i((this.direction.hashCode() + (this.callId.hashCode() * 31)) * 31, 31, this.isVideo);
                List<String> list = this.tags;
                return i12 + (list == null ? 0 : list.hashCode());
            }

            public final boolean isVideo() {
                return this.isVideo;
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("AddCall(callId=");
                sb2.append(this.callId);
                sb2.append(", direction=");
                sb2.append(this.direction);
                sb2.append(", isVideo=");
                sb2.append(this.isVideo);
                sb2.append(", tags=");
                return H.p(sb2, this.tags, ')');
            }
        }

        /* compiled from: IacEvent.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$Registered;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom;", "Answer", "Disconnect", "RequestAudioDeviceChange", "SetActive", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$Registered$Answer;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$Registered$Disconnect;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$Registered$RequestAudioDeviceChange;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$Registered$SetActive;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface Registered extends Telecom {

            /* compiled from: IacEvent.kt */
            @P
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u000b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J!\u0010\r\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$Registered$Answer;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$Registered;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "isVideo", "", "(Ljava/lang/String;Z)V", "getCallId", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Answer implements Registered {
                public static final int $stable = 0;

                @k
                private final String callId;
                private final boolean isVideo;

                public Answer(@k String str, boolean z12) {
                    this.callId = str;
                    this.isVideo = z12;
                }

                public static /* synthetic */ Answer copy$default(Answer answer, String str, boolean z12, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = answer.callId;
                    }
                    if ((i12 & 2) != 0) {
                        z12 = answer.isVideo;
                    }
                    return answer.copy(str, z12);
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
                public final Answer copy(@k String callId, boolean isVideo) {
                    return new Answer(callId, isVideo);
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Answer)) {
                        return false;
                    }
                    Answer answer = (Answer) other;
                    return L.f(this.callId, answer.callId) && this.isVideo == answer.isVideo;
                }

                @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent.Telecom
                @k
                public String getCallId() {
                    return this.callId;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.isVideo) + (this.callId.hashCode() * 31);
                }

                public final boolean isVideo() {
                    return this.isVideo;
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Answer(callId=");
                    sb2.append(this.callId);
                    sb2.append(", isVideo=");
                    return r.x(sb2, this.isVideo, ')');
                }
            }

            /* compiled from: IacEvent.kt */
            @P
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\r\u0010\u000f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$Registered$Disconnect;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$Registered;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "reason", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "isLocal", "", "(Ljava/lang/String;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;Z)V", "getCallId", "()Ljava/lang/String;", "()Z", "getReason", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "component1", "component2", "component3", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Disconnect implements Registered {
                public static final int $stable = 0;

                @k
                private final String callId;
                private final boolean isLocal;

                @k
                private final TerminateReason reason;

                public Disconnect(@k String str, @k TerminateReason terminateReason, boolean z12) {
                    this.callId = str;
                    this.reason = terminateReason;
                    this.isLocal = z12;
                }

                public static /* synthetic */ Disconnect copy$default(Disconnect disconnect, String str, TerminateReason terminateReason, boolean z12, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = disconnect.callId;
                    }
                    if ((i12 & 2) != 0) {
                        terminateReason = disconnect.reason;
                    }
                    if ((i12 & 4) != 0) {
                        z12 = disconnect.isLocal;
                    }
                    return disconnect.copy(str, terminateReason, z12);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getCallId() {
                    return this.callId;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final TerminateReason getReason() {
                    return this.reason;
                }

                /* renamed from: component3, reason: from getter */
                public final boolean getIsLocal() {
                    return this.isLocal;
                }

                @k
                public final Disconnect copy(@k String callId, @k TerminateReason reason, boolean isLocal) {
                    return new Disconnect(callId, reason, isLocal);
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Disconnect)) {
                        return false;
                    }
                    Disconnect disconnect = (Disconnect) other;
                    return L.f(this.callId, disconnect.callId) && L.f(this.reason, disconnect.reason) && this.isLocal == disconnect.isLocal;
                }

                @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent.Telecom
                @k
                public String getCallId() {
                    return this.callId;
                }

                @k
                public final TerminateReason getReason() {
                    return this.reason;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.isLocal) + ((this.reason.hashCode() + (this.callId.hashCode() * 31)) * 31);
                }

                public final boolean isLocal() {
                    return this.isLocal;
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Disconnect(callId=");
                    sb2.append(this.callId);
                    sb2.append(", reason=");
                    sb2.append(this.reason);
                    sb2.append(", isLocal=");
                    return r.x(sb2, this.isLocal, ')');
                }
            }

            /* compiled from: IacEvent.kt */
            @P
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$Registered$RequestAudioDeviceChange;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$Registered;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "device", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioDevice;", "(Ljava/lang/String;Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioDevice;)V", "getCallId", "()Ljava/lang/String;", "getDevice", "()Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioDevice;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class RequestAudioDeviceChange implements Registered {
                public static final int $stable = 8;

                @k
                private final String callId;

                @k
                private final AudioDevice device;

                public RequestAudioDeviceChange(@k String str, @k AudioDevice audioDevice) {
                    this.callId = str;
                    this.device = audioDevice;
                }

                public static /* synthetic */ RequestAudioDeviceChange copy$default(RequestAudioDeviceChange requestAudioDeviceChange, String str, AudioDevice audioDevice, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = requestAudioDeviceChange.callId;
                    }
                    if ((i12 & 2) != 0) {
                        audioDevice = requestAudioDeviceChange.device;
                    }
                    return requestAudioDeviceChange.copy(str, audioDevice);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getCallId() {
                    return this.callId;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final AudioDevice getDevice() {
                    return this.device;
                }

                @k
                public final RequestAudioDeviceChange copy(@k String callId, @k AudioDevice device) {
                    return new RequestAudioDeviceChange(callId, device);
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof RequestAudioDeviceChange)) {
                        return false;
                    }
                    RequestAudioDeviceChange requestAudioDeviceChange = (RequestAudioDeviceChange) other;
                    return L.f(this.callId, requestAudioDeviceChange.callId) && L.f(this.device, requestAudioDeviceChange.device);
                }

                @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent.Telecom
                @k
                public String getCallId() {
                    return this.callId;
                }

                @k
                public final AudioDevice getDevice() {
                    return this.device;
                }

                public int hashCode() {
                    return this.device.hashCode() + (this.callId.hashCode() * 31);
                }

                @k
                public String toString() {
                    return "RequestAudioDeviceChange(callId=" + this.callId + ", device=" + this.device + ')';
                }
            }

            /* compiled from: IacEvent.kt */
            @P
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$Registered$SetActive;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Telecom$Registered;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "(Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class SetActive implements Registered {
                public static final int $stable = 0;

                @k
                private final String callId;

                public SetActive(@k String str) {
                    this.callId = str;
                }

                public static /* synthetic */ SetActive copy$default(SetActive setActive, String str, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = setActive.callId;
                    }
                    return setActive.copy(str);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getCallId() {
                    return this.callId;
                }

                @k
                public final SetActive copy(@k String callId) {
                    return new SetActive(callId);
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof SetActive) && L.f(this.callId, ((SetActive) other).callId);
                }

                @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent.Telecom
                @k
                public String getCallId() {
                    return this.callId;
                }

                public int hashCode() {
                    return this.callId.hashCode();
                }

                @k
                public String toString() {
                    return C22026a.c(new StringBuilder("SetActive(callId="), this.callId, ')');
                }
            }
        }

        @k
        String getCallId();
    }

    /* compiled from: IacEvent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$TimerInteractor;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "StartTimer", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$TimerInteractor$StartTimer;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface TimerInteractor extends IacEvent {

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$TimerInteractor$StartTimer;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$TimerInteractor;", "timer", "Lcom/avito/android/iac_dialer/impl_module/timer_interactor/IacTimerInteractor$Timer;", "(Lcom/avito/android/iac_dialer/impl_module/timer_interactor/IacTimerInteractor$Timer;)V", "getTimer", "()Lcom/avito/android/iac_dialer/impl_module/timer_interactor/IacTimerInteractor$Timer;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class StartTimer implements TimerInteractor {
            public static final int $stable = 8;

            @k
            private final IacTimerInteractor.Timer timer;

            public StartTimer(@k IacTimerInteractor.Timer timer) {
                this.timer = timer;
            }

            public static /* synthetic */ StartTimer copy$default(StartTimer startTimer, IacTimerInteractor.Timer timer, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    timer = startTimer.timer;
                }
                return startTimer.copy(timer);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final IacTimerInteractor.Timer getTimer() {
                return this.timer;
            }

            @k
            public final StartTimer copy(@k IacTimerInteractor.Timer timer) {
                return new StartTimer(timer);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StartTimer) && L.f(this.timer, ((StartTimer) other).timer);
            }

            @k
            public final IacTimerInteractor.Timer getTimer() {
                return this.timer;
            }

            public int hashCode() {
                return this.timer.hashCode();
            }

            @k
            public String toString() {
                return "StartTimer(timer=" + this.timer + ')';
            }
        }
    }

    /* compiled from: IacEvent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$TonePlayer;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "PlayDtmf", "UpdateDialing", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$TonePlayer$PlayDtmf;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$TonePlayer$UpdateDialing;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface TonePlayer extends IacEvent {

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$TonePlayer$PlayDtmf;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$TonePlayer;", "tone", "", "(Ljava/lang/String;)V", "getTone", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PlayDtmf implements TonePlayer {
            public static final int $stable = 0;

            @k
            private final String tone;

            public PlayDtmf(@k String str) {
                this.tone = str;
            }

            public static /* synthetic */ PlayDtmf copy$default(PlayDtmf playDtmf, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = playDtmf.tone;
                }
                return playDtmf.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTone() {
                return this.tone;
            }

            @k
            public final PlayDtmf copy(@k String tone) {
                return new PlayDtmf(tone);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PlayDtmf) && L.f(this.tone, ((PlayDtmf) other).tone);
            }

            @k
            public final String getTone() {
                return this.tone;
            }

            public int hashCode() {
                return this.tone.hashCode();
            }

            @k
            public String toString() {
                return C22026a.c(new StringBuilder("PlayDtmf(tone="), this.tone, ')');
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$TonePlayer$UpdateDialing;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$TonePlayer;", "toneType", "Lcom/avito/android/iac_dialer/impl_module/audio/tone/IacToneType;", "(Lcom/avito/android/iac_dialer/impl_module/audio/tone/IacToneType;)V", "getToneType", "()Lcom/avito/android/iac_dialer/impl_module/audio/tone/IacToneType;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UpdateDialing implements TonePlayer {
            public static final int $stable = 0;

            @k
            private final IacToneType toneType;

            public UpdateDialing(@k IacToneType iacToneType) {
                this.toneType = iacToneType;
            }

            public static /* synthetic */ UpdateDialing copy$default(UpdateDialing updateDialing, IacToneType iacToneType, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    iacToneType = updateDialing.toneType;
                }
                return updateDialing.copy(iacToneType);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final IacToneType getToneType() {
                return this.toneType;
            }

            @k
            public final UpdateDialing copy(@k IacToneType toneType) {
                return new UpdateDialing(toneType);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateDialing) && this.toneType == ((UpdateDialing) other).toneType;
            }

            @k
            public final IacToneType getToneType() {
                return this.toneType;
            }

            public int hashCode() {
                return this.toneType.hashCode();
            }

            @k
            public String toString() {
                return "UpdateDialing(toneType=" + this.toneType + ')';
            }
        }
    }

    /* compiled from: IacEvent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Watcher;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "ActivateByState", "ReleaseWithTimeout", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Watcher$ActivateByState;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Watcher$ReleaseWithTimeout;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Watcher extends IacEvent {

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\r\u0010\n\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Watcher$ActivateByState;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Watcher;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "scenario", "(Ljava/lang/String;Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "getScenario", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ActivateByState implements Watcher {
            public static final int $stable = 0;

            @k
            private final String callId;

            @k
            private final String scenario;

            public ActivateByState(@k String str, @k String str2) {
                this.callId = str;
                this.scenario = str2;
            }

            public static /* synthetic */ ActivateByState copy$default(ActivateByState activateByState, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = activateByState.callId;
                }
                if ((i12 & 2) != 0) {
                    str2 = activateByState.scenario;
                }
                return activateByState.copy(str, str2);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getScenario() {
                return this.scenario;
            }

            @k
            public final ActivateByState copy(@k String callId, @k String scenario) {
                return new ActivateByState(callId, scenario);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActivateByState)) {
                    return false;
                }
                ActivateByState activateByState = (ActivateByState) other;
                return L.f(this.callId, activateByState.callId) && L.f(this.scenario, activateByState.scenario);
            }

            @k
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final String getScenario() {
                return this.scenario;
            }

            public int hashCode() {
                return this.scenario.hashCode() + (this.callId.hashCode() * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("ActivateByState(callId=");
                sb2.append(this.callId);
                sb2.append(", scenario=");
                return C22026a.c(sb2, this.scenario, ')');
            }
        }

        /* compiled from: IacEvent.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Watcher$ReleaseWithTimeout;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Watcher;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "(Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ReleaseWithTimeout implements Watcher {
            public static final int $stable = 0;

            @k
            private final String callId;

            public ReleaseWithTimeout(@k String str) {
                this.callId = str;
            }

            public static /* synthetic */ ReleaseWithTimeout copy$default(ReleaseWithTimeout releaseWithTimeout, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = releaseWithTimeout.callId;
                }
                return releaseWithTimeout.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final ReleaseWithTimeout copy(@k String callId) {
                return new ReleaseWithTimeout(callId);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ReleaseWithTimeout) && L.f(this.callId, ((ReleaseWithTimeout) other).callId);
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
                return C22026a.c(new StringBuilder("ReleaseWithTimeout(callId="), this.callId, ')');
            }
        }
    }
}
