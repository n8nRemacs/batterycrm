package com.avito.android.virtual_deal_room_invite.invite.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.fragment.app.Fragment;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MainScreenLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.virtual_deal_room.deeplink.model.Category;
import com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.GetInvitationApiV1Response;
import iO0.C41327b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InviteInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Content", "CountDownValidationTimer", "Error", "FailureSubmit", "NoInternet", "OpenDeeplink", "ShowDeclinePopup", "ShowPlaceholders", "StartSubmit", "SuccessfulSubmit", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$Close;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$Content;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$CountDownValidationTimer;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$Error;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$FailureSubmit;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$NoInternet;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$OpenDeeplink;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$ShowDeclinePopup;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$ShowPlaceholders;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$StartSubmit;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$SuccessfulSubmit;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface InviteInternalAction extends n {

    /* compiled from: InviteInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$Close;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "<init>", "()V", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements InviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f327069b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1467628653;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: InviteInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$CountDownValidationTimer;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CountDownValidationTimer implements InviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f327073b;

        public CountDownValidationTimer(int i12) {
            this.f327073b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CountDownValidationTimer) && this.f327073b == ((CountDownValidationTimer) obj).f327073b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f327073b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("CountDownValidationTimer(currentTime="), this.f327073b, ')');
        }
    }

    /* compiled from: InviteInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$FailureSubmit;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FailureSubmit implements InviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f327077b;

        public FailureSubmit(@k ApiError apiError) {
            this.f327077b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FailureSubmit) && L.f(this.f327077b, ((FailureSubmit) obj).f327077b);
        }

        public final int hashCode() {
            return this.f327077b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("FailureSubmit(apiError="), this.f327077b, ')');
        }
    }

    /* compiled from: InviteInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$NoInternet;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "<init>", "()V", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoInternet implements InviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NoInternet f327078b = new NoInternet();

        private NoInternet() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NoInternet);
        }

        public final int hashCode() {
            return -2049225881;
        }

        @k
        public final String toString() {
            return "NoInternet";
        }
    }

    /* compiled from: InviteInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$OpenDeeplink;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements InviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MainScreenLink f327079b;

        public OpenDeeplink(@k MainScreenLink mainScreenLink) {
            this.f327079b = mainScreenLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && this.f327079b.equals(((OpenDeeplink) obj).f327079b);
        }

        public final int hashCode() {
            return this.f327079b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenDeeplink(deeplink=" + this.f327079b + ')';
        }
    }

    /* compiled from: InviteInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$ShowDeclinePopup;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowDeclinePopup implements InviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C41327b f327080b;

        public ShowDeclinePopup(@k C41327b c41327b) {
            this.f327080b = c41327b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowDeclinePopup) && L.f(this.f327080b, ((ShowDeclinePopup) obj).f327080b);
        }

        public final int hashCode() {
            return this.f327080b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowDeclinePopup(popup=" + this.f327080b + ')';
        }
    }

    /* compiled from: InviteInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$ShowPlaceholders;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowPlaceholders extends TrackableLoadingStarted implements InviteInternalAction {
    }

    /* compiled from: InviteInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$StartSubmit;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "<init>", "()V", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartSubmit implements InviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StartSubmit f327081b = new StartSubmit();

        private StartSubmit() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof StartSubmit);
        }

        public final int hashCode() {
            return 1255253109;
        }

        @k
        public final String toString() {
            return "StartSubmit";
        }
    }

    /* compiled from: InviteInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$SuccessfulSubmit;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuccessfulSubmit implements InviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f327082b;

        /* JADX WARN: Multi-variable type inference failed */
        public SuccessfulSubmit() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuccessfulSubmit) && L.f(this.f327082b, ((SuccessfulSubmit) obj).f327082b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f327082b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("SuccessfulSubmit(redirectTo="), this.f327082b, ')');
        }

        public SuccessfulSubmit(@l DeepLink deepLink) {
            this.f327082b = deepLink;
        }

        public /* synthetic */ SuccessfulSubmit(DeepLink deepLink, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : deepLink);
        }
    }

    /* compiled from: InviteInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$Content;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements InviteInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final GetInvitationApiV1Response f327070b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Category f327071c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Fragment f327072d;

        public Content(@k GetInvitationApiV1Response getInvitationApiV1Response, @k Category category, @l Fragment fragment) {
            this.f327070b = getInvitationApiV1Response;
            this.f327071c = category;
            this.f327072d = fragment;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF146467d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f327070b, content.f327070b) && this.f327071c == content.f327071c && L.f(this.f327072d, content.f327072d);
        }

        public final int hashCode() {
            int iHashCode = (this.f327071c.hashCode() + (this.f327070b.hashCode() * 31)) * 31;
            Fragment fragment = this.f327072d;
            return iHashCode + (fragment == null ? 0 : fragment.hashCode());
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f327070b + ", category=" + this.f327071c + ", fragment=" + this.f327072d + ')';
        }

        public /* synthetic */ Content(GetInvitationApiV1Response getInvitationApiV1Response, Category category, Fragment fragment, int i12, C42822w c42822w) {
            this(getInvitationApiV1Response, category, (i12 & 4) != 0 ? null : fragment);
        }
    }

    /* compiled from: InviteInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction$Error;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements InviteInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f327074b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f327075c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f327076d;

        public Error(@k ApiError apiError, boolean z12) {
            this.f327074b = apiError;
            this.f327075c = z12;
            this.f327076d = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF146467d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return L.f(this.f327074b, error.f327074b) && this.f327075c == error.f327075c;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF138866c() {
            return this.f327076d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f327075c) + (this.f327074b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(apiError=");
            sb2.append(this.f327074b);
            sb2.append(", isEmpty=");
            return r.x(sb2, this.f327075c, ')');
        }

        public /* synthetic */ Error(ApiError apiError, boolean z12, int i12, C42822w c42822w) {
            this(apiError, (i12 & 2) != 0 ? false : z12);
        }
    }
}
