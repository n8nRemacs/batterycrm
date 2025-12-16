package com.avito.android.rating.user_contacts.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating.user_contacts.mvi.entity.b;
import com.avito.android.remote.model.user_contacts.UserContactsResult;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserContactsInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContactDeleted", "HandleDeeplink", "HideLoadingItem", "Loaded", "Loading", "RatingPublished", "ShowError", "ShowErrorToast", "ShowLoadingItem", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$ContactDeleted;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$HandleDeeplink;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$HideLoadingItem;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$Loaded;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$Loading;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$RatingPublished;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$ShowError;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$ShowErrorToast;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$ShowLoadingItem;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface UserContactsInternalAction extends n {

    /* compiled from: UserContactsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$ContactDeleted;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContactDeleted implements UserContactsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f247784b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f247785c;

        public ContactDeleted(@k String str, @k String str2) {
            this.f247784b = str;
            this.f247785c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContactDeleted)) {
                return false;
            }
            ContactDeleted contactDeleted = (ContactDeleted) obj;
            return L.f(this.f247784b, contactDeleted.f247784b) && L.f(this.f247785c, contactDeleted.f247785c);
        }

        public final int hashCode() {
            return this.f247785c.hashCode() + (this.f247784b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContactDeleted(userKey=");
            sb2.append(this.f247784b);
            sb2.append(", itemId=");
            return C22026a.c(sb2, this.f247785c, ')');
        }
    }

    /* compiled from: UserContactsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$HandleDeeplink;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements UserContactsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f247786b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f247787c;

        public HandleDeeplink(@k DeepLink deepLink, @l Bundle bundle) {
            this.f247786b = deepLink;
            this.f247787c = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            HandleDeeplink handleDeeplink = (HandleDeeplink) obj;
            return L.f(this.f247786b, handleDeeplink.f247786b) && L.f(this.f247787c, handleDeeplink.f247787c);
        }

        public final int hashCode() {
            int iHashCode = ((this.f247786b.hashCode() * 31) - 1710289146) * 31;
            Bundle bundle = this.f247787c;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f247786b);
            sb2.append(", requestKey=req_key_user_contacts, args=");
            return H.m(sb2, this.f247787c, ')');
        }
    }

    /* compiled from: UserContactsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$HideLoadingItem;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HideLoadingItem implements UserContactsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideLoadingItem f247788b = new HideLoadingItem();

        private HideLoadingItem() {
        }
    }

    /* compiled from: UserContactsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$Loaded;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements UserContactsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserContactsResult f247789b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f247790c;

        public Loaded(@k UserContactsResult userContactsResult, boolean z12) {
            this.f247789b = userContactsResult;
            this.f247790c = z12;
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
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return L.f(this.f247789b, loaded.f247789b) && this.f247790c == loaded.f247790c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f247790c) + (this.f247789b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(result=");
            sb2.append(this.f247789b);
            sb2.append(", isReload=");
            return r.x(sb2, this.f247790c, ')');
        }
    }

    /* compiled from: UserContactsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading extends TrackableLoadingStarted implements UserContactsInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final b.InterfaceC7440b f247791d;

        public Loading(@k b.InterfaceC7440b interfaceC7440b) {
            this.f247791d = interfaceC7440b;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && L.f(this.f247791d, ((Loading) obj).f247791d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f247791d.hashCode();
        }

        @k
        public final String toString() {
            return "Loading(loadingProgressType=" + this.f247791d + ')';
        }
    }

    /* compiled from: UserContactsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$RatingPublished;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RatingPublished implements UserContactsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f247792b;

        public RatingPublished(@k String str) {
            this.f247792b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RatingPublished) && L.f(this.f247792b, ((RatingPublished) obj).f247792b);
        }

        public final int hashCode() {
            return this.f247792b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RatingPublished(publishedRatingUserKey="), this.f247792b, ')');
        }
    }

    /* compiled from: UserContactsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$ShowError;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements UserContactsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f247793b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f247794c;

        public ShowError(@k ApiException apiException) {
            this.f247793b = apiException;
            this.f247794c = new J.a(apiException);
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
            return (obj instanceof ShowError) && this.f247793b.equals(((ShowError) obj).f247793b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF97162c() {
            return this.f247794c;
        }

        public final int hashCode() {
            return this.f247793b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("ShowError(error="), this.f247793b, ')');
        }
    }

    /* compiled from: UserContactsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$ShowErrorToast;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast implements UserContactsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f247795b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f247796c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final a f247797d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final a f247798e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final J.a f247799f;

        public ShowErrorToast(Throwable th2, PrintableText printableText, a aVar, a aVar2, int i12, C42822w c42822w) {
            aVar = (i12 & 4) != 0 ? null : aVar;
            aVar2 = (i12 & 8) != 0 ? null : aVar2;
            this.f247795b = th2;
            this.f247796c = printableText;
            this.f247797d = aVar;
            this.f247798e = aVar2;
            this.f247799f = new J.a(th2);
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
            if (!(obj instanceof ShowErrorToast)) {
                return false;
            }
            ShowErrorToast showErrorToast = (ShowErrorToast) obj;
            return L.f(this.f247795b, showErrorToast.f247795b) && L.f(this.f247796c, showErrorToast.f247796c) && L.f(this.f247797d, showErrorToast.f247797d) && L.f(this.f247798e, showErrorToast.f247798e);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF97162c() {
            return this.f247799f;
        }

        public final int hashCode() {
            int iF2 = com.avito.android.actions_sheet.a.f(this.f247796c, this.f247795b.hashCode() * 31, 31);
            a aVar = this.f247797d;
            int iHashCode = (iF2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            a aVar2 = this.f247798e;
            return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ShowErrorToast(error=" + this.f247795b + ", message=" + this.f247796c + ", onClickedAction=" + this.f247797d + ", onDismissedAction=" + this.f247798e + ')';
        }
    }

    /* compiled from: UserContactsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction$ShowLoadingItem;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoadingItem implements UserContactsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowLoadingItem f247800b = new ShowLoadingItem();

        private ShowLoadingItem() {
        }
    }
}
