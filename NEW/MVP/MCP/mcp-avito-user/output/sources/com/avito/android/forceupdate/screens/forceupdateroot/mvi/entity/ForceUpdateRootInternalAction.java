package com.avito.android.forceupdate.screens.forceupdateroot.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.forceupdate.domain.dto.UpdateSource;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ForceUpdateRootInternalAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "DismissDialog", "DownloadStarted", "Finish", "OpenMarket", "OpenMavInWebView", "OpenUpdateRequiredScreen", "RequestPermission", "SetUpdateSourceType", "ShowProposalDialog", "TrackClosedWithNoPermission", "TrackClosedWithRefuse", "TrackClosedWithUpdate", "TrackShownDialog", "TrackWebViewGoToMavWithForceRedirect", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$DismissDialog;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$DownloadStarted;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$Finish;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$OpenMarket;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$OpenMavInWebView;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$OpenUpdateRequiredScreen;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$RequestPermission;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$SetUpdateSourceType;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$ShowProposalDialog;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$TrackClosedWithNoPermission;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$TrackClosedWithRefuse;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$TrackClosedWithUpdate;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$TrackShownDialog;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$TrackWebViewGoToMavWithForceRedirect;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ForceUpdateRootInternalAction extends n {

    /* compiled from: ForceUpdateRootInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$DismissDialog;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DismissDialog implements ForceUpdateRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DismissDialog f158586b = new DismissDialog();

        private DismissDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DismissDialog);
        }

        public final int hashCode() {
            return 759811860;
        }

        @k
        public final String toString() {
            return "DismissDialog";
        }
    }

    /* compiled from: ForceUpdateRootInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$DownloadStarted;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DownloadStarted implements ForceUpdateRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DownloadStarted f158587b = new DownloadStarted();

        private DownloadStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DownloadStarted);
        }

        public final int hashCode() {
            return 535464187;
        }

        @k
        public final String toString() {
            return "DownloadStarted";
        }
    }

    /* compiled from: ForceUpdateRootInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$Finish;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Finish implements ForceUpdateRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Finish f158588b = new Finish();

        private Finish() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Finish);
        }

        public final int hashCode() {
            return 1741397041;
        }

        @k
        public final String toString() {
            return "Finish";
        }
    }

    /* compiled from: ForceUpdateRootInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$OpenMarket;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenMarket implements ForceUpdateRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UpdateSource f158589b;

        public OpenMarket(@k UpdateSource updateSource) {
            this.f158589b = updateSource;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenMarket) && L.f(this.f158589b, ((OpenMarket) obj).f158589b);
        }

        public final int hashCode() {
            return this.f158589b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenMarket(updateSource=" + this.f158589b + ')';
        }
    }

    /* compiled from: ForceUpdateRootInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$OpenMavInWebView;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenMavInWebView implements ForceUpdateRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenMavInWebView f158590b = new OpenMavInWebView();

        private OpenMavInWebView() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenMavInWebView);
        }

        public final int hashCode() {
            return 1464302970;
        }

        @k
        public final String toString() {
            return "OpenMavInWebView";
        }
    }

    /* compiled from: ForceUpdateRootInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$OpenUpdateRequiredScreen;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenUpdateRequiredScreen implements ForceUpdateRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UpdateSource f158591b;

        public OpenUpdateRequiredScreen(@k UpdateSource updateSource) {
            this.f158591b = updateSource;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUpdateRequiredScreen) && L.f(this.f158591b, ((OpenUpdateRequiredScreen) obj).f158591b);
        }

        public final int hashCode() {
            return this.f158591b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenUpdateRequiredScreen(updateSource=" + this.f158591b + ')';
        }
    }

    /* compiled from: ForceUpdateRootInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$RequestPermission;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestPermission implements ForceUpdateRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RequestPermission f158592b = new RequestPermission();

        private RequestPermission() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RequestPermission);
        }

        public final int hashCode() {
            return 332566368;
        }

        @k
        public final String toString() {
            return "RequestPermission";
        }
    }

    /* compiled from: ForceUpdateRootInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$SetUpdateSourceType;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetUpdateSourceType implements ForceUpdateRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UpdateSource f158593b;

        public SetUpdateSourceType(@k UpdateSource updateSource) {
            this.f158593b = updateSource;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetUpdateSourceType) && L.f(this.f158593b, ((SetUpdateSourceType) obj).f158593b);
        }

        public final int hashCode() {
            return this.f158593b.hashCode();
        }

        @k
        public final String toString() {
            return "SetUpdateSourceType(updateSource=" + this.f158593b + ')';
        }
    }

    /* compiled from: ForceUpdateRootInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$ShowProposalDialog;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowProposalDialog implements ForceUpdateRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowProposalDialog f158594b = new ShowProposalDialog();

        private ShowProposalDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowProposalDialog);
        }

        public final int hashCode() {
            return -1668378155;
        }

        @k
        public final String toString() {
            return "ShowProposalDialog";
        }
    }

    /* compiled from: ForceUpdateRootInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$TrackClosedWithNoPermission;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrackClosedWithNoPermission implements ForceUpdateRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final TrackClosedWithNoPermission f158595b = new TrackClosedWithNoPermission();

        private TrackClosedWithNoPermission() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof TrackClosedWithNoPermission);
        }

        public final int hashCode() {
            return 936267311;
        }

        @k
        public final String toString() {
            return "TrackClosedWithNoPermission";
        }
    }

    /* compiled from: ForceUpdateRootInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$TrackClosedWithRefuse;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrackClosedWithRefuse implements ForceUpdateRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final TrackClosedWithRefuse f158596b = new TrackClosedWithRefuse();

        private TrackClosedWithRefuse() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof TrackClosedWithRefuse);
        }

        public final int hashCode() {
            return -2032961773;
        }

        @k
        public final String toString() {
            return "TrackClosedWithRefuse";
        }
    }

    /* compiled from: ForceUpdateRootInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$TrackClosedWithUpdate;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrackClosedWithUpdate implements ForceUpdateRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final TrackClosedWithUpdate f158597b = new TrackClosedWithUpdate();

        private TrackClosedWithUpdate() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof TrackClosedWithUpdate);
        }

        public final int hashCode() {
            return -1936994360;
        }

        @k
        public final String toString() {
            return "TrackClosedWithUpdate";
        }
    }

    /* compiled from: ForceUpdateRootInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$TrackShownDialog;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrackShownDialog implements ForceUpdateRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final TrackShownDialog f158598b = new TrackShownDialog();

        private TrackShownDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof TrackShownDialog);
        }

        public final int hashCode() {
            return 1139067276;
        }

        @k
        public final String toString() {
            return "TrackShownDialog";
        }
    }

    /* compiled from: ForceUpdateRootInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction$TrackWebViewGoToMavWithForceRedirect;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrackWebViewGoToMavWithForceRedirect implements ForceUpdateRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final TrackWebViewGoToMavWithForceRedirect f158599b = new TrackWebViewGoToMavWithForceRedirect();

        private TrackWebViewGoToMavWithForceRedirect() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof TrackWebViewGoToMavWithForceRedirect);
        }

        public final int hashCode() {
            return -1386989778;
        }

        @k
        public final String toString() {
            return "TrackWebViewGoToMavWithForceRedirect";
        }
    }
}
