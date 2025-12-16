package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity;

import UI0.a;
import UI0.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.AuthSource;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ShortcutsInternalAction.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0016\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0082\u0001\u0013\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*¨\u0006+"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AddAdvert", "ChangeIndex", "ChangeShortcut", "LoadingError", "LoadingResult", "LoadingStart", "Login", "NoChange", "OpenTab", "RefreshError", "RefreshResult", "RefreshStart", "RefreshTab", "ShowPendingMsg", "ShowStatus", "ShowToastBarForUpdateAdverts", "ToastBarForUpdateAdvertsIsShown", "TrackedContent", "TrackedLoadingError", "TrackedLoadingStart", "Unauthorized", "UpdatePendingMsg", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$AddAdvert;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$ChangeIndex;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$ChangeShortcut;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$LoadingError;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$LoadingResult;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$LoadingStart;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$Login;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$NoChange;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$OpenTab;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$RefreshError;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$RefreshResult;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$RefreshStart;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$RefreshTab;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$ShowPendingMsg;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$ShowStatus;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$ShowToastBarForUpdateAdverts;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$ToastBarForUpdateAdvertsIsShown;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$Unauthorized;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$UpdatePendingMsg;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ShortcutsInternalAction extends n {

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$AddAdvert;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddAdvert implements ShortcutsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final AddAdvert f314023b = new AddAdvert();

        private AddAdvert() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof AddAdvert);
        }

        public final int hashCode() {
            return 838419124;
        }

        @k
        public final String toString() {
            return "AddAdvert";
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$ChangeIndex;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeIndex implements ShortcutsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f314024b;

        public ChangeIndex(int i12) {
            this.f314024b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeIndex) && this.f314024b == ((ChangeIndex) obj).f314024b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f314024b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ChangeIndex(shortcutIndex="), this.f314024b, ')');
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$ChangeShortcut;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeShortcut implements ShortcutsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f314025b;

        public ChangeShortcut(@k String str) {
            this.f314025b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeShortcut) && L.f(this.f314025b, ((ChangeShortcut) obj).f314025b);
        }

        public final int hashCode() {
            return this.f314025b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChangeShortcut(shortcut="), this.f314025b, ')');
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$LoadingError;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$TrackedLoadingError;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError extends TrackedLoadingError implements ShortcutsInternalAction {

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ApiError f314026c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Throwable f314027d;

        public LoadingError(@l ApiError apiError, @l Throwable th2) {
            super(apiError, th2);
            this.f314026c = apiError;
            this.f314027d = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingError)) {
                return false;
            }
            LoadingError loadingError = (LoadingError) obj;
            return L.f(this.f314026c, loadingError.f314026c) && L.f(this.f314027d, loadingError.f314027d);
        }

        public final int hashCode() {
            ApiError apiError = this.f314026c;
            int iHashCode = (apiError == null ? 0 : apiError.hashCode()) * 31;
            Throwable th2 = this.f314027d;
            return iHashCode + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadingError(apiError=");
            sb2.append(this.f314026c);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f314027d, ')');
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$LoadingResult;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$TrackedContent;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingResult extends TrackedContent implements ShortcutsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserAdvertsShortcuts f314028b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f314029c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final c f314030d;

        public LoadingResult(@k UserAdvertsShortcuts userAdvertsShortcuts, boolean z12, @k c cVar) {
            this.f314028b = userAdvertsShortcuts;
            this.f314029c = z12;
            this.f314030d = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingResult)) {
                return false;
            }
            LoadingResult loadingResult = (LoadingResult) obj;
            return L.f(this.f314028b, loadingResult.f314028b) && this.f314029c == loadingResult.f314029c && L.f(this.f314030d, loadingResult.f314030d);
        }

        public final int hashCode() {
            return this.f314030d.hashCode() + r.i(this.f314028b.f313851b.hashCode() * 31, 31, this.f314029c);
        }

        @k
        public final String toString() {
            return "LoadingResult(shortcuts=" + this.f314028b + ", resetShortcut=" + this.f314029c + ", userInfo=" + this.f314030d + ')';
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$LoadingStart;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$TrackedLoadingStart;", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingStart extends TrackedLoadingStart implements ShortcutsInternalAction {
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$Login;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Login implements ShortcutsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AuthSource f314031b;

        public Login(@k AuthSource authSource) {
            this.f314031b = authSource;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Login) && this.f314031b == ((Login) obj).f314031b;
        }

        public final int hashCode() {
            return this.f314031b.hashCode();
        }

        @k
        public final String toString() {
            return "Login(authSrc=" + this.f314031b + ')';
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$NoChange;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoChange implements ShortcutsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NoChange f314032b = new NoChange();

        private NoChange() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NoChange);
        }

        public final int hashCode() {
            return -1159891438;
        }

        @k
        public final String toString() {
            return "NoChange";
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$OpenTab;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenTab implements ShortcutsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f314033b;

        public OpenTab(int i12) {
            this.f314033b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenTab) && this.f314033b == ((OpenTab) obj).f314033b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f314033b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OpenTab(shortcutIndex="), this.f314033b, ')');
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$RefreshError;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$TrackedLoadingError;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RefreshError extends TrackedLoadingError implements ShortcutsInternalAction {

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ApiError f314034c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Throwable f314035d;

        public RefreshError(@l ApiError apiError, @l Throwable th2) {
            super(apiError, th2);
            this.f314034c = apiError;
            this.f314035d = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RefreshError)) {
                return false;
            }
            RefreshError refreshError = (RefreshError) obj;
            return L.f(this.f314034c, refreshError.f314034c) && L.f(this.f314035d, refreshError.f314035d);
        }

        public final int hashCode() {
            ApiError apiError = this.f314034c;
            int iHashCode = (apiError == null ? 0 : apiError.hashCode()) * 31;
            Throwable th2 = this.f314035d;
            return iHashCode + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RefreshError(apiError=");
            sb2.append(this.f314034c);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f314035d, ')');
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$RefreshResult;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$TrackedContent;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RefreshResult extends TrackedContent implements ShortcutsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f314036b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UserAdvertsShortcuts f314037c;

        public RefreshResult(@k a aVar, @k UserAdvertsShortcuts userAdvertsShortcuts) {
            this.f314036b = aVar;
            this.f314037c = userAdvertsShortcuts;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RefreshResult)) {
                return false;
            }
            RefreshResult refreshResult = (RefreshResult) obj;
            return L.f(this.f314036b, refreshResult.f314036b) && L.f(this.f314037c, refreshResult.f314037c);
        }

        public final int hashCode() {
            return this.f314037c.f313851b.hashCode() + (this.f314036b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "RefreshResult(refreshedShortcut=" + this.f314036b + ", shortcuts=" + this.f314037c + ')';
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$RefreshStart;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$TrackedLoadingStart;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RefreshStart extends TrackedLoadingStart implements ShortcutsInternalAction {

        /* renamed from: f, reason: collision with root package name */
        @k
        public final a f314038f;

        public RefreshStart(@k a aVar) {
            this.f314038f = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RefreshStart) && L.f(this.f314038f, ((RefreshStart) obj).f314038f);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f314038f.hashCode();
        }

        @k
        public final String toString() {
            return "RefreshStart(refreshingShortcut=" + this.f314038f + ')';
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$RefreshTab;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RefreshTab implements ShortcutsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f314039b;

        public RefreshTab(int i12) {
            this.f314039b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RefreshTab) && this.f314039b == ((RefreshTab) obj).f314039b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f314039b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("RefreshTab(shortcutIndex="), this.f314039b, ')');
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$ShowPendingMsg;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowPendingMsg implements ShortcutsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f314040b;

        public ShowPendingMsg(@k String str) {
            this.f314040b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowPendingMsg) && L.f(this.f314040b, ((ShowPendingMsg) obj).f314040b);
        }

        public final int hashCode() {
            return this.f314040b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowPendingMsg(msg="), this.f314040b, ')');
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$ShowStatus;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowStatus implements ShortcutsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f314041b;

        public ShowStatus(@k String str) {
            this.f314041b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowStatus) && L.f(this.f314041b, ((ShowStatus) obj).f314041b);
        }

        public final int hashCode() {
            return this.f314041b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowStatus(msg="), this.f314041b, ')');
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$ShowToastBarForUpdateAdverts;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToastBarForUpdateAdverts implements ShortcutsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowToastBarForUpdateAdverts f314042b = new ShowToastBarForUpdateAdverts();

        private ShowToastBarForUpdateAdverts() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowToastBarForUpdateAdverts);
        }

        public final int hashCode() {
            return 1990743863;
        }

        @k
        public final String toString() {
            return "ShowToastBarForUpdateAdverts";
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$ToastBarForUpdateAdvertsIsShown;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToastBarForUpdateAdvertsIsShown implements ShortcutsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ToastBarForUpdateAdvertsIsShown f314043b = new ToastBarForUpdateAdvertsIsShown();

        private ToastBarForUpdateAdvertsIsShown() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ToastBarForUpdateAdvertsIsShown);
        }

        public final int hashCode() {
            return -1946803955;
        }

        @k
        public final String toString() {
            return "ToastBarForUpdateAdvertsIsShown";
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$TrackedContent;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class TrackedContent implements TrackableContent {
        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF306880d() {
            return "tabs";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "tabs";
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$TrackedLoadingError;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class TrackedLoadingError implements TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final J.a f314044b;

        public TrackedLoadingError(@l ApiError apiError, @l Throwable th2) {
            J.a.f90383b.getClass();
            this.f314044b = J.a.C2676a.a(apiError, th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF306880d() {
            return "tabs";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "tabs";
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF306878c() {
            return this.f314044b;
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$TrackedLoadingStart;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class TrackedLoadingStart extends TrackableLoadingStarted {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f314045d = "tabs";

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ScreenPerformanceTracker.LoadingType f314046e = ScreenPerformanceTracker.LoadingType.f90785b;

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF306880d() {
            return this.f314045d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        @k
        /* renamed from: h, reason: from getter */
        public final ScreenPerformanceTracker.LoadingType getF181535d() {
            return this.f314046e;
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$Unauthorized;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Unauthorized implements ShortcutsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Unauthorized f314047b = new Unauthorized();

        private Unauthorized() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Unauthorized);
        }

        public final int hashCode() {
            return -736342603;
        }

        @k
        public final String toString() {
            return "Unauthorized";
        }
    }

    /* compiled from: ShortcutsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction$UpdatePendingMsg;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePendingMsg implements ShortcutsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f314048b;

        public UpdatePendingMsg(@k String str) {
            this.f314048b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePendingMsg) && L.f(this.f314048b, ((UpdatePendingMsg) obj).f314048b);
        }

        public final int hashCode() {
            return this.f314048b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdatePendingMsg(msg="), this.f314048b, ')');
        }
    }
}
