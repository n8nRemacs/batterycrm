package com.avito.android.profile.user_profile.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.activeOrders.OrdersNeedActionResponse;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.profile.PhotoPickerContract;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.profile.user_profile.cards.service_booking.ActiveServiceBookingsDto;
import com.avito.android.remote.model.notification.NotificationsCount;
import com.avito.android.remote.model.user_profile.Phone;
import com.avito.android.remote.model.user_profile.UserProfileResult;
import com.avito.android.remote.model.user_profile.items.AvitoFinanceResponse;
import com.avito.android.remote.model.user_profile.items.WalletItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserProfileInternalAction.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:!\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"\u0082\u0001!#$%&'()*+,-./0123456789:;<=>?@ABC¨\u0006D"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ActiveOrdersUpdate", "AuthorizationError", "CloseScreen", "DataError", "DataLoaded", "DataLoadingInProgress", "HideSilentUpdateBanner", "HideSuggestedAddress", "LogoutError", "NotificationCenterCounterUpdate", "OnActiveServiceBookingsLoaded", "OnActiveServiceBookingsLoadingFailure", "OpenAvatarActionDialog", "OpenEditProfileScreen", "OpenHelpCenter", "OpenLoginScreen", "OpenMainScreen", "OpenNotificationCenter", "OpenPhotoPicker", "OpenProfileSettingsScreen", "OpenSettings", "OpenShareDialog", "OpenUserAdvertsScreen", "RemovePromoBlock", "ShowLogoutProgress", "ShowSnackBar", "ShowSuccessActionToast", "ShowToastBar", "UpdateAvitoFinance", "UpdateAvitoFinanceDynamic", "UpdatePhones", "UpdateVisibleItems", "UpdateWallet", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$ActiveOrdersUpdate;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$AuthorizationError;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$CloseScreen;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$DataError;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$DataLoaded;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$DataLoadingInProgress;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$HideSilentUpdateBanner;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$HideSuggestedAddress;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$LogoutError;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$NotificationCenterCounterUpdate;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OnActiveServiceBookingsLoaded;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OnActiveServiceBookingsLoadingFailure;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenAvatarActionDialog;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenEditProfileScreen;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenHelpCenter;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenLoginScreen;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenMainScreen;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenNotificationCenter;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenPhotoPicker;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenProfileSettingsScreen;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenSettings;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenShareDialog;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenUserAdvertsScreen;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$RemovePromoBlock;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$ShowLogoutProgress;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$ShowSnackBar;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$ShowSuccessActionToast;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$ShowToastBar;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$UpdateAvitoFinance;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$UpdateAvitoFinanceDynamic;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$UpdatePhones;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$UpdateVisibleItems;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$UpdateWallet;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface UserProfileInternalAction extends n {

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$ActiveOrdersUpdate;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActiveOrdersUpdate implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final OrdersNeedActionResponse f226414b;

        public ActiveOrdersUpdate(@k OrdersNeedActionResponse ordersNeedActionResponse) {
            this.f226414b = ordersNeedActionResponse;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActiveOrdersUpdate) && L.f(this.f226414b, ((ActiveOrdersUpdate) obj).f226414b);
        }

        public final int hashCode() {
            return this.f226414b.hashCode();
        }

        @k
        public final String toString() {
            return "ActiveOrdersUpdate(activeOrdersWidgetItem=" + this.f226414b + ')';
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$AuthorizationError;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AuthorizationError implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final AuthorizationError f226415b = new AuthorizationError();

        private AuthorizationError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof AuthorizationError);
        }

        public final int hashCode() {
            return 1122231936;
        }

        @k
        public final String toString() {
            return "AuthorizationError";
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$CloseScreen;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f226416b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -442631117;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$DataError;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DataError implements UserProfileInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f226417b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Throwable f226418c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f226419d;

        public DataError(@k String str, @k Throwable th2) {
            this.f226417b = str;
            this.f226418c = th2;
            this.f226419d = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF212751d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataError)) {
                return false;
            }
            DataError dataError = (DataError) obj;
            return L.f(this.f226417b, dataError.f226417b) && L.f(this.f226418c, dataError.f226418c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF212758c() {
            return this.f226419d;
        }

        public final int hashCode() {
            return this.f226418c.hashCode() + (this.f226417b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DataError(message=");
            sb2.append(this.f226417b);
            sb2.append(", error=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f226418c, ')');
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$DataLoadingInProgress;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DataLoadingInProgress extends TrackableLoadingStarted implements UserProfileInternalAction {
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$HideSilentUpdateBanner;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideSilentUpdateBanner implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideSilentUpdateBanner f226426b = new HideSilentUpdateBanner();

        private HideSilentUpdateBanner() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HideSilentUpdateBanner);
        }

        public final int hashCode() {
            return -551213027;
        }

        @k
        public final String toString() {
            return "HideSilentUpdateBanner";
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$HideSuggestedAddress;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideSuggestedAddress implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideSuggestedAddress f226427b = new HideSuggestedAddress();

        private HideSuggestedAddress() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HideSuggestedAddress);
        }

        public final int hashCode() {
            return -1118662172;
        }

        @k
        public final String toString() {
            return "HideSuggestedAddress";
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$LogoutError;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LogoutError implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f226428b;

        public LogoutError(@k Throwable th2) {
            this.f226428b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LogoutError) && L.f(this.f226428b, ((LogoutError) obj).f226428b);
        }

        public final int hashCode() {
            return this.f226428b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("LogoutError(error="), this.f226428b, ')');
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$NotificationCenterCounterUpdate;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotificationCenterCounterUpdate implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final NotificationsCount f226429b;

        public NotificationCenterCounterUpdate(@k NotificationsCount notificationsCount) {
            this.f226429b = notificationsCount;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotificationCenterCounterUpdate) && L.f(this.f226429b, ((NotificationCenterCounterUpdate) obj).f226429b);
        }

        public final int hashCode() {
            return this.f226429b.hashCode();
        }

        @k
        public final String toString() {
            return "NotificationCenterCounterUpdate(counter=" + this.f226429b + ')';
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OnActiveServiceBookingsLoaded;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnActiveServiceBookingsLoaded implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ActiveServiceBookingsDto f226430b;

        public OnActiveServiceBookingsLoaded(@k ActiveServiceBookingsDto activeServiceBookingsDto) {
            this.f226430b = activeServiceBookingsDto;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnActiveServiceBookingsLoaded) && L.f(this.f226430b, ((OnActiveServiceBookingsLoaded) obj).f226430b);
        }

        public final int hashCode() {
            return this.f226430b.hashCode();
        }

        @k
        public final String toString() {
            return "OnActiveServiceBookingsLoaded(bookings=" + this.f226430b + ')';
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OnActiveServiceBookingsLoadingFailure;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnActiveServiceBookingsLoadingFailure implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnActiveServiceBookingsLoadingFailure f226431b = new OnActiveServiceBookingsLoadingFailure();

        private OnActiveServiceBookingsLoadingFailure() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OnActiveServiceBookingsLoadingFailure);
        }

        public final int hashCode() {
            return 1622017735;
        }

        @k
        public final String toString() {
            return "OnActiveServiceBookingsLoadingFailure";
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenAvatarActionDialog;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAvatarActionDialog implements UserProfileInternalAction {
        static {
            new OpenAvatarActionDialog();
        }

        private OpenAvatarActionDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenAvatarActionDialog);
        }

        public final int hashCode() {
            return 554320882;
        }

        @k
        public final String toString() {
            return "OpenAvatarActionDialog";
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenEditProfileScreen;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenEditProfileScreen implements UserProfileInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenEditProfileScreen)) {
                return false;
            }
            ((OpenEditProfileScreen) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        @k
        public final String toString() {
            return "OpenEditProfileScreen(avatarShape=null)";
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenHelpCenter;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenHelpCenter implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f226432b;

        public OpenHelpCenter() {
            this(null, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenHelpCenter) && L.f(this.f226432b, ((OpenHelpCenter) obj).f226432b);
        }

        public final int hashCode() {
            String str = this.f226432b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenHelpCenter(url="), this.f226432b, ')');
        }

        public OpenHelpCenter(String str, int i12, C42822w c42822w) {
            this.f226432b = (i12 & 1) != 0 ? null : str;
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenLoginScreen;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenLoginScreen implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenLoginScreen f226433b = new OpenLoginScreen();

        private OpenLoginScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenLoginScreen);
        }

        public final int hashCode() {
            return -1945267014;
        }

        @k
        public final String toString() {
            return "OpenLoginScreen";
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenMainScreen;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenMainScreen implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenMainScreen f226434b = new OpenMainScreen();

        private OpenMainScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenMainScreen);
        }

        public final int hashCode() {
            return -1733635232;
        }

        @k
        public final String toString() {
            return "OpenMainScreen";
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenNotificationCenter;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenNotificationCenter implements UserProfileInternalAction {
        static {
            new OpenNotificationCenter();
        }

        private OpenNotificationCenter() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenNotificationCenter);
        }

        public final int hashCode() {
            return -1445680645;
        }

        @k
        public final String toString() {
            return "OpenNotificationCenter";
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenPhotoPicker;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenPhotoPicker implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PhotoPickerContract.Args.Type f226435b;

        public OpenPhotoPicker(@k PhotoPickerContract.Args.Type type) {
            this.f226435b = type;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenPhotoPicker) && this.f226435b == ((OpenPhotoPicker) obj).f226435b;
        }

        public final int hashCode() {
            return this.f226435b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenPhotoPicker(type=" + this.f226435b + ')';
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenProfileSettingsScreen;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenProfileSettingsScreen implements UserProfileInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenProfileSettingsScreen)) {
                return false;
            }
            ((OpenProfileSettingsScreen) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return -1405959847;
        }

        @k
        public final String toString() {
            return "OpenProfileSettingsScreen(source=avatar)";
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenSettings;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSettings implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenSettings f226436b = new OpenSettings();

        private OpenSettings() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenSettings);
        }

        public final int hashCode() {
            return -1789983042;
        }

        @k
        public final String toString() {
            return "OpenSettings";
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenShareDialog;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenShareDialog implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f226437b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f226438c;

        public OpenShareDialog(@k String str, @k String str2) {
            this.f226437b = str;
            this.f226438c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenShareDialog)) {
                return false;
            }
            OpenShareDialog openShareDialog = (OpenShareDialog) obj;
            return L.f(this.f226437b, openShareDialog.f226437b) && L.f(this.f226438c, openShareDialog.f226438c);
        }

        public final int hashCode() {
            return this.f226438c.hashCode() + (this.f226437b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenShareDialog(title=");
            sb2.append(this.f226437b);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f226438c, ')');
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$OpenUserAdvertsScreen;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenUserAdvertsScreen implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenUserAdvertsScreen f226439b = new OpenUserAdvertsScreen();

        private OpenUserAdvertsScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenUserAdvertsScreen);
        }

        public final int hashCode() {
            return 631414309;
        }

        @k
        public final String toString() {
            return "OpenUserAdvertsScreen";
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$RemovePromoBlock;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemovePromoBlock implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CardItem.PromoBlockItem f226440b;

        public RemovePromoBlock(@k CardItem.PromoBlockItem promoBlockItem) {
            this.f226440b = promoBlockItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemovePromoBlock) && L.f(this.f226440b, ((RemovePromoBlock) obj).f226440b);
        }

        public final int hashCode() {
            return this.f226440b.hashCode();
        }

        @k
        public final String toString() {
            return "RemovePromoBlock(item=" + this.f226440b + ')';
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$ShowLogoutProgress;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLogoutProgress implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowLogoutProgress f226441b = new ShowLogoutProgress();

        private ShowLogoutProgress() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowLogoutProgress);
        }

        public final int hashCode() {
            return 1232780197;
        }

        @k
        public final String toString() {
            return "ShowLogoutProgress";
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$ShowSnackBar;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSnackBar implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f226442b;

        public ShowSnackBar(@k String str) {
            this.f226442b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowSnackBar) && L.f(this.f226442b, ((ShowSnackBar) obj).f226442b);
        }

        public final int hashCode() {
            return this.f226442b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowSnackBar(message="), this.f226442b, ')');
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$ShowSuccessActionToast;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSuccessActionToast implements UserProfileInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowSuccessActionToast)) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            throw null;
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$ShowToastBar;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToastBar implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f226443b;

        public ShowToastBar(@k String str) {
            this.f226443b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToastBar) && L.f(this.f226443b, ((ShowToastBar) obj).f226443b);
        }

        public final int hashCode() {
            return this.f226443b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToastBar(message="), this.f226443b, ')');
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$UpdateAvitoFinance;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateAvitoFinance implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AvitoFinanceResponse f226444b;

        public UpdateAvitoFinance(@k AvitoFinanceResponse avitoFinanceResponse) {
            this.f226444b = avitoFinanceResponse;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateAvitoFinance) && L.f(this.f226444b, ((UpdateAvitoFinance) obj).f226444b);
        }

        public final int hashCode() {
            return this.f226444b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateAvitoFinance(avitoFinanceItem=" + this.f226444b + ')';
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$UpdateAvitoFinanceDynamic;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateAvitoFinanceDynamic implements UserProfileInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateAvitoFinanceDynamic)) {
                return false;
            }
            ((UpdateAvitoFinanceDynamic) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "UpdateAvitoFinanceDynamic(avitoFinanceDynamicItem=null)";
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$UpdatePhones;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePhones implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Phone> f226445b;

        public UpdatePhones(@k List<Phone> list) {
            this.f226445b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePhones) && L.f(this.f226445b, ((UpdatePhones) obj).f226445b);
        }

        public final int hashCode() {
            return this.f226445b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("UpdatePhones(phones="), this.f226445b, ')');
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$UpdateVisibleItems;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateVisibleItems implements UserProfileInternalAction {
        static {
            new UpdateVisibleItems();
        }

        private UpdateVisibleItems() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof UpdateVisibleItems);
        }

        public final int hashCode() {
            return -1654347960;
        }

        @k
        public final String toString() {
            return "UpdateVisibleItems";
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$UpdateWallet;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateWallet implements UserProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final WalletItem f226446b;

        public UpdateWallet(@k WalletItem walletItem) {
            this.f226446b = walletItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateWallet) && L.f(this.f226446b, ((UpdateWallet) obj).f226446b);
        }

        public final int hashCode() {
            return this.f226446b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateWallet(walletItem=" + this.f226446b + ')';
        }
    }

    /* compiled from: UserProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$DataLoaded;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DataLoaded implements UserProfileInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final CardItem.SilentUpdateItem f226420b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UserProfileResult f226421c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<CardItem.PromoBlockItem> f226422d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final OrdersNeedActionResponse f226423e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final AvitoFinanceResponse f226424f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final CardItem.AvitoFinanceDynamicCardItem f226425g;

        public DataLoaded(@l CardItem.SilentUpdateItem silentUpdateItem, @k UserProfileResult userProfileResult, @k List<CardItem.PromoBlockItem> list, @l OrdersNeedActionResponse ordersNeedActionResponse, @l AvitoFinanceResponse avitoFinanceResponse, @l CardItem.AvitoFinanceDynamicCardItem avitoFinanceDynamicCardItem) {
            this.f226420b = silentUpdateItem;
            this.f226421c = userProfileResult;
            this.f226422d = list;
            this.f226423e = ordersNeedActionResponse;
            this.f226424f = avitoFinanceResponse;
            this.f226425g = avitoFinanceDynamicCardItem;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF212751d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataLoaded)) {
                return false;
            }
            DataLoaded dataLoaded = (DataLoaded) obj;
            return L.f(this.f226420b, dataLoaded.f226420b) && L.f(this.f226421c, dataLoaded.f226421c) && L.f(this.f226422d, dataLoaded.f226422d) && L.f(this.f226423e, dataLoaded.f226423e) && L.f(this.f226424f, dataLoaded.f226424f) && L.f(this.f226425g, dataLoaded.f226425g);
        }

        public final int hashCode() {
            CardItem.SilentUpdateItem silentUpdateItem = this.f226420b;
            int iE2 = H.e((this.f226421c.hashCode() + ((silentUpdateItem == null ? 0 : silentUpdateItem.hashCode()) * 31)) * 31, 31, this.f226422d);
            OrdersNeedActionResponse ordersNeedActionResponse = this.f226423e;
            int iHashCode = (iE2 + (ordersNeedActionResponse == null ? 0 : ordersNeedActionResponse.hashCode())) * 31;
            AvitoFinanceResponse avitoFinanceResponse = this.f226424f;
            int iHashCode2 = (iHashCode + (avitoFinanceResponse == null ? 0 : avitoFinanceResponse.hashCode())) * 31;
            CardItem.AvitoFinanceDynamicCardItem avitoFinanceDynamicCardItem = this.f226425g;
            return iHashCode2 + (avitoFinanceDynamicCardItem != null ? avitoFinanceDynamicCardItem.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "DataLoaded(silentUpdate=" + this.f226420b + ", userProfile=" + this.f226421c + ", promoBlocks=" + this.f226422d + ", activeOrdersWidgetItem=" + this.f226423e + ", avitoFinanceWidgetItem=" + this.f226424f + ", avitoFinanceDynamicItem=" + this.f226425g + ')';
        }

        public /* synthetic */ DataLoaded(CardItem.SilentUpdateItem silentUpdateItem, UserProfileResult userProfileResult, List list, OrdersNeedActionResponse ordersNeedActionResponse, AvitoFinanceResponse avitoFinanceResponse, CardItem.AvitoFinanceDynamicCardItem avitoFinanceDynamicCardItem, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : silentUpdateItem, userProfileResult, list, ordersNeedActionResponse, avitoFinanceResponse, avitoFinanceDynamicCardItem);
        }
    }
}
