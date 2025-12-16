package com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.forceupdate.domain.dto.UpdateSource;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ForceUpdateRequiredInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "DownloadStarted", "OpenMarket", "OpenMavInWebView", "RequestPermission", "SetUpdateSourceType", "TrackClosedWithGoingToMav", "TrackClosedWithNoPermission", "TrackClosedWithUpdate", "TrackShownBlocking", "TrackWebViewGoToMavManually", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$DownloadStarted;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$OpenMarket;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$OpenMavInWebView;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$RequestPermission;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$SetUpdateSourceType;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$TrackClosedWithGoingToMav;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$TrackClosedWithNoPermission;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$TrackClosedWithUpdate;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$TrackShownBlocking;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$TrackWebViewGoToMavManually;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ForceUpdateRequiredInternalAction extends n {

    /* compiled from: ForceUpdateRequiredInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$DownloadStarted;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DownloadStarted implements ForceUpdateRequiredInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DownloadStarted f158504b = new DownloadStarted();

        private DownloadStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DownloadStarted);
        }

        public final int hashCode() {
            return 226248667;
        }

        @k
        public final String toString() {
            return "DownloadStarted";
        }
    }

    /* compiled from: ForceUpdateRequiredInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$OpenMarket;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenMarket implements ForceUpdateRequiredInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UpdateSource f158505b;

        public OpenMarket(@k UpdateSource updateSource) {
            this.f158505b = updateSource;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenMarket) && L.f(this.f158505b, ((OpenMarket) obj).f158505b);
        }

        public final int hashCode() {
            return this.f158505b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenMarket(updateSource=" + this.f158505b + ')';
        }
    }

    /* compiled from: ForceUpdateRequiredInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$OpenMavInWebView;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenMavInWebView implements ForceUpdateRequiredInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenMavInWebView f158506b = new OpenMavInWebView();

        private OpenMavInWebView() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenMavInWebView);
        }

        public final int hashCode() {
            return 468556442;
        }

        @k
        public final String toString() {
            return "OpenMavInWebView";
        }
    }

    /* compiled from: ForceUpdateRequiredInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$RequestPermission;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestPermission implements ForceUpdateRequiredInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RequestPermission f158507b = new RequestPermission();

        private RequestPermission() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RequestPermission);
        }

        public final int hashCode() {
            return -470804928;
        }

        @k
        public final String toString() {
            return "RequestPermission";
        }
    }

    /* compiled from: ForceUpdateRequiredInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$SetUpdateSourceType;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetUpdateSourceType implements ForceUpdateRequiredInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UpdateSource f158508b;

        public SetUpdateSourceType(@k UpdateSource updateSource) {
            this.f158508b = updateSource;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetUpdateSourceType) && L.f(this.f158508b, ((SetUpdateSourceType) obj).f158508b);
        }

        public final int hashCode() {
            return this.f158508b.hashCode();
        }

        @k
        public final String toString() {
            return "SetUpdateSourceType(updateSource=" + this.f158508b + ')';
        }
    }

    /* compiled from: ForceUpdateRequiredInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$TrackClosedWithGoingToMav;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrackClosedWithGoingToMav implements ForceUpdateRequiredInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final TrackClosedWithGoingToMav f158509b = new TrackClosedWithGoingToMav();

        private TrackClosedWithGoingToMav() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof TrackClosedWithGoingToMav);
        }

        public final int hashCode() {
            return 1611311468;
        }

        @k
        public final String toString() {
            return "TrackClosedWithGoingToMav";
        }
    }

    /* compiled from: ForceUpdateRequiredInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$TrackClosedWithNoPermission;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrackClosedWithNoPermission implements ForceUpdateRequiredInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final TrackClosedWithNoPermission f158510b = new TrackClosedWithNoPermission();

        private TrackClosedWithNoPermission() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof TrackClosedWithNoPermission);
        }

        public final int hashCode() {
            return 1163443471;
        }

        @k
        public final String toString() {
            return "TrackClosedWithNoPermission";
        }
    }

    /* compiled from: ForceUpdateRequiredInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$TrackClosedWithUpdate;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrackClosedWithUpdate implements ForceUpdateRequiredInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final TrackClosedWithUpdate f158511b = new TrackClosedWithUpdate();

        private TrackClosedWithUpdate() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof TrackClosedWithUpdate);
        }

        public final int hashCode() {
            return 1925899944;
        }

        @k
        public final String toString() {
            return "TrackClosedWithUpdate";
        }
    }

    /* compiled from: ForceUpdateRequiredInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$TrackShownBlocking;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrackShownBlocking implements ForceUpdateRequiredInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final TrackShownBlocking f158512b = new TrackShownBlocking();

        private TrackShownBlocking() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof TrackShownBlocking);
        }

        public final int hashCode() {
            return -138441575;
        }

        @k
        public final String toString() {
            return "TrackShownBlocking";
        }
    }

    /* compiled from: ForceUpdateRequiredInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction$TrackWebViewGoToMavManually;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrackWebViewGoToMavManually implements ForceUpdateRequiredInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final TrackWebViewGoToMavManually f158513b = new TrackWebViewGoToMavManually();

        private TrackWebViewGoToMavManually() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof TrackWebViewGoToMavManually);
        }

        public final int hashCode() {
            return -842550874;
        }

        @k
        public final String toString() {
            return "TrackWebViewGoToMavManually";
        }
    }
}
