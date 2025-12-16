package com.avito.android.player.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.google.android.exoplayer2.InterfaceC36534o;
import com.google.android.exoplayer2.PlaybackException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PlayerInternalAction.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ClosePressed", "FastForwardPressed", "FirstFrameRendered", "Init", "MediaBecomeReady", "MediaError", "MediaFinished", "MediaLoaded", "MediaLoading", "MediaProgressChanged", "MutePressed", "OnFramesDropped", "PausedPressed", "PlayPressed", "PlayerCreated", "RetryPressed", "RewindPressed", "ViewPaused", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction$ClosePressed;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction$FastForwardPressed;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction$FirstFrameRendered;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction$Init;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction$MediaBecomeReady;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction$MediaError;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction$MediaFinished;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction$MediaLoaded;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction$MediaLoading;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction$MediaProgressChanged;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction$MutePressed;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction$OnFramesDropped;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction$PausedPressed;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction$PlayPressed;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction$PlayerCreated;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction$RetryPressed;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction$RewindPressed;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction$ViewPaused;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface PlayerInternalAction extends n {

    /* compiled from: PlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction$ClosePressed;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClosePressed implements PlayerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Double f220151b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Double f220152c;

        public ClosePressed(@l Double d12, @l Double d13) {
            this.f220151b = d12;
            this.f220152c = d13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClosePressed)) {
                return false;
            }
            ClosePressed closePressed = (ClosePressed) obj;
            return L.f(this.f220151b, closePressed.f220151b) && L.f(this.f220152c, closePressed.f220152c);
        }

        public final int hashCode() {
            Double d12 = this.f220151b;
            int iHashCode = (d12 == null ? 0 : d12.hashCode()) * 31;
            Double d13 = this.f220152c;
            return iHashCode + (d13 != null ? d13.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClosePressed(playbackPosition=");
            sb2.append(this.f220151b);
            sb2.append(", videoDuration=");
            return b.h(sb2, this.f220152c, ')');
        }
    }

    /* compiled from: PlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction$FastForwardPressed;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FastForwardPressed implements PlayerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FastForwardPressed f220153b = new FastForwardPressed();

        private FastForwardPressed() {
        }
    }

    /* compiled from: PlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction$FirstFrameRendered;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FirstFrameRendered implements PlayerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FirstFrameRendered f220154b = new FirstFrameRendered();

        private FirstFrameRendered() {
        }
    }

    /* compiled from: PlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction$Init;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Init implements PlayerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Init f220155b = new Init();

        private Init() {
        }
    }

    /* compiled from: PlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction$MediaBecomeReady;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MediaBecomeReady implements PlayerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final MediaBecomeReady f220156b = new MediaBecomeReady();

        private MediaBecomeReady() {
        }
    }

    /* compiled from: PlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction$MediaError;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MediaError implements PlayerInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PlaybackException f220157b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f220158c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f220159d = "player";

        public MediaError(@k PlaybackException playbackException) {
            this.f220157b = playbackException;
            this.f220158c = new J.a(playbackException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF260604d() {
            return this.f220159d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f220159d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MediaError) && L.f(this.f220157b, ((MediaError) obj).f220157b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF260603d() {
            return this.f220158c;
        }

        public final int hashCode() {
            return this.f220157b.hashCode();
        }

        @k
        public final String toString() {
            return "MediaError(error=" + this.f220157b + ')';
        }
    }

    /* compiled from: PlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction$MediaFinished;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MediaFinished implements PlayerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f220160b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Double f220161c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Double f220162d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f220163e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f220164f;

        public MediaFinished(int i12, @l Double d12, @l Double d13, @l String str, @l String str2) {
            this.f220160b = i12;
            this.f220161c = d12;
            this.f220162d = d13;
            this.f220163e = str;
            this.f220164f = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaFinished)) {
                return false;
            }
            MediaFinished mediaFinished = (MediaFinished) obj;
            return this.f220160b == mediaFinished.f220160b && L.f(this.f220161c, mediaFinished.f220161c) && L.f(this.f220162d, mediaFinished.f220162d) && L.f(this.f220163e, mediaFinished.f220163e) && L.f(this.f220164f, mediaFinished.f220164f);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f220160b) * 31;
            Double d12 = this.f220161c;
            int iHashCode2 = (iHashCode + (d12 == null ? 0 : d12.hashCode())) * 31;
            Double d13 = this.f220162d;
            int iHashCode3 = (iHashCode2 + (d13 == null ? 0 : d13.hashCode())) * 31;
            String str = this.f220163e;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f220164f;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MediaFinished(state=");
            sb2.append(this.f220160b);
            sb2.append(", playbackPosition=");
            sb2.append(this.f220161c);
            sb2.append(", videoDuration=");
            sb2.append(this.f220162d);
            sb2.append(", itemId=");
            sb2.append(this.f220163e);
            sb2.append(", fromPage=");
            return C22026a.c(sb2, this.f220164f, ')');
        }
    }

    /* compiled from: PlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction$MediaLoaded;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "<init>", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MediaLoaded implements PlayerInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final MediaLoaded f220165b = new MediaLoaded();

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f220166c = "player";

        private MediaLoaded() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF260604d() {
            return f220166c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return f220166c;
        }
    }

    /* compiled from: PlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction$MediaLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "<init>", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MediaLoading extends TrackableLoadingStarted implements PlayerInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f220167d = "player";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF260604d() {
            return this.f220167d;
        }
    }

    /* compiled from: PlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction$MediaProgressChanged;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MediaProgressChanged implements PlayerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final float f220168b;

        public MediaProgressChanged(float f12) {
            this.f220168b = f12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MediaProgressChanged) && Float.compare(this.f220168b, ((MediaProgressChanged) obj).f220168b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f220168b);
        }

        @k
        public final String toString() {
            return r.k(')', this.f220168b, new StringBuilder("MediaProgressChanged(progress="));
        }
    }

    /* compiled from: PlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction$MutePressed;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MutePressed implements PlayerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f220169b;

        public MutePressed(boolean z12) {
            this.f220169b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MutePressed) && this.f220169b == ((MutePressed) obj).f220169b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f220169b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("MutePressed(isMute="), this.f220169b, ')');
        }
    }

    /* compiled from: PlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction$OnFramesDropped;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnFramesDropped implements PlayerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f220170b;

        public OnFramesDropped(int i12) {
            this.f220170b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnFramesDropped) && this.f220170b == ((OnFramesDropped) obj).f220170b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f220170b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnFramesDropped(droppedFrames="), this.f220170b, ')');
        }
    }

    /* compiled from: PlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction$PausedPressed;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PausedPressed implements PlayerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Double f220171b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Double f220172c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f220173d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f220174e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final VideoStopReason f220175f;

        public PausedPressed(@l Double d12, @l Double d13, @l String str, @l String str2, @k VideoStopReason videoStopReason) {
            this.f220171b = d12;
            this.f220172c = d13;
            this.f220173d = str;
            this.f220174e = str2;
            this.f220175f = videoStopReason;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PausedPressed)) {
                return false;
            }
            PausedPressed pausedPressed = (PausedPressed) obj;
            return L.f(this.f220171b, pausedPressed.f220171b) && L.f(this.f220172c, pausedPressed.f220172c) && L.f(this.f220173d, pausedPressed.f220173d) && L.f(this.f220174e, pausedPressed.f220174e) && this.f220175f == pausedPressed.f220175f;
        }

        public final int hashCode() {
            Double d12 = this.f220171b;
            int iHashCode = (d12 == null ? 0 : d12.hashCode()) * 31;
            Double d13 = this.f220172c;
            int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
            String str = this.f220173d;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f220174e;
            return this.f220175f.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            return "PausedPressed(playbackPosition=" + this.f220171b + ", videoDuration=" + this.f220172c + ", itemId=" + this.f220173d + ", fromPage=" + this.f220174e + ", stopReason=" + this.f220175f + ')';
        }
    }

    /* compiled from: PlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction$PlayPressed;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PlayPressed implements PlayerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f220176b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f220177c;

        public PlayPressed(@l String str, @l String str2) {
            this.f220176b = str;
            this.f220177c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlayPressed)) {
                return false;
            }
            PlayPressed playPressed = (PlayPressed) obj;
            return L.f(this.f220176b, playPressed.f220176b) && L.f(this.f220177c, playPressed.f220177c);
        }

        public final int hashCode() {
            String str = this.f220176b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f220177c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PlayPressed(itemId=");
            sb2.append(this.f220176b);
            sb2.append(", fromPage=");
            return C22026a.c(sb2, this.f220177c, ')');
        }
    }

    /* compiled from: PlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction$PlayerCreated;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PlayerCreated implements PlayerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC36534o f220178b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f220179c;

        public PlayerCreated(@k InterfaceC36534o interfaceC36534o, @k String str) {
            this.f220178b = interfaceC36534o;
            this.f220179c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlayerCreated)) {
                return false;
            }
            PlayerCreated playerCreated = (PlayerCreated) obj;
            return L.f(this.f220178b, playerCreated.f220178b) && L.f(this.f220179c, playerCreated.f220179c);
        }

        public final int hashCode() {
            return this.f220179c.hashCode() + (this.f220178b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PlayerCreated(player=");
            sb2.append(this.f220178b);
            sb2.append(", videoUrl=");
            return C22026a.c(sb2, this.f220179c, ')');
        }
    }

    /* compiled from: PlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction$RetryPressed;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RetryPressed implements PlayerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RetryPressed f220180b = new RetryPressed();

        private RetryPressed() {
        }
    }

    /* compiled from: PlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction$RewindPressed;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RewindPressed implements PlayerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RewindPressed f220181b = new RewindPressed();

        private RewindPressed() {
        }
    }

    /* compiled from: PlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction$ViewPaused;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ViewPaused implements PlayerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ViewPaused f220182b = new ViewPaused();

        private ViewPaused() {
        }
    }
}
