package com.avito.android.passport.profile_add.merge.profiles_list.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.passport.network.model.BusinessVrfDuplication;
import com.avito.android.passport.network.model.MergeAccountsProfile;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfilesListInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Collapse", "Expand", "MergeFinishError", "MergeFinished", "MergeFinishing", "OpenDeepLink", "ProfilesLoaded", "ProfilesLoading", "ProfilesLoadingError", "SelectBusinessVrfDuplication", "SelectProfileToConvert", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$Collapse;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$Expand;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$MergeFinishError;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$MergeFinished;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$MergeFinishing;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$OpenDeepLink;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$ProfilesLoaded;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$ProfilesLoading;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$ProfilesLoadingError;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$SelectBusinessVrfDuplication;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$SelectProfileToConvert;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ProfilesListInternalAction extends n {

    /* compiled from: ProfilesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$Collapse;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Collapse implements ProfilesListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Collapse f213273b = new Collapse();

        private Collapse() {
        }
    }

    /* compiled from: ProfilesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$Expand;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Expand implements ProfilesListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Expand f213274b = new Expand();

        private Expand() {
        }
    }

    /* compiled from: ProfilesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$MergeFinishError;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MergeFinishError implements ProfilesListInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f213275b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f213276c;

        public MergeFinishError(@k Throwable th2) {
            this.f213275b = th2;
            this.f213276c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF204956d() {
            return "finalizeAccountsMerge";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "finalizeAccountsMerge";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MergeFinishError) && L.f(this.f213275b, ((MergeFinishError) obj).f213275b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF204955c() {
            return this.f213276c;
        }

        public final int hashCode() {
            return this.f213275b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("MergeFinishError(throwable="), this.f213275b, ')');
        }
    }

    /* compiled from: ProfilesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$MergeFinished;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MergeFinished implements ProfilesListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f213277b;

        public MergeFinished(@k PrintableText printableText) {
            this.f213277b = printableText;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF204956d() {
            return "finalizeAccountsMerge";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "finalizeAccountsMerge";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MergeFinished) && L.f(this.f213277b, ((MergeFinished) obj).f213277b);
        }

        public final int hashCode() {
            return this.f213277b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("MergeFinished(successText="), this.f213277b, ')');
        }
    }

    /* compiled from: ProfilesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$MergeFinishing;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MergeFinishing extends TrackableLoadingStarted implements ProfilesListInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f213278d = "finalizeAccountsMerge";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF204956d() {
            return this.f213278d;
        }
    }

    /* compiled from: ProfilesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$OpenDeepLink;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements ProfilesListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f213279b;

        public OpenDeepLink(@k DeepLink deepLink) {
            this.f213279b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && L.f(this.f213279b, ((OpenDeepLink) obj).f213279b);
        }

        public final int hashCode() {
            return this.f213279b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeepLink(deeplink="), this.f213279b, ')');
        }
    }

    /* compiled from: ProfilesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$ProfilesLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ProfilesLoading extends TrackableLoadingStarted implements ProfilesListInternalAction {
    }

    /* compiled from: ProfilesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$ProfilesLoadingError;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProfilesLoadingError implements ProfilesListInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f213284b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f213285c;

        public ProfilesLoadingError(@k Throwable th2) {
            this.f213284b = th2;
            this.f213285c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF204956d() {
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
            return (obj instanceof ProfilesLoadingError) && L.f(this.f213284b, ((ProfilesLoadingError) obj).f213284b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF204955c() {
            return this.f213285c;
        }

        public final int hashCode() {
            return this.f213284b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ProfilesLoadingError(throwable="), this.f213284b, ')');
        }
    }

    /* compiled from: ProfilesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$SelectBusinessVrfDuplication;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectBusinessVrfDuplication implements ProfilesListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BusinessVrfDuplication f213286b;

        public SelectBusinessVrfDuplication(@k BusinessVrfDuplication businessVrfDuplication) {
            this.f213286b = businessVrfDuplication;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectBusinessVrfDuplication) && L.f(this.f213286b, ((SelectBusinessVrfDuplication) obj).f213286b);
        }

        public final int hashCode() {
            return this.f213286b.hashCode();
        }

        @k
        public final String toString() {
            return "SelectBusinessVrfDuplication(businessVrfDuplication=" + this.f213286b + ')';
        }
    }

    /* compiled from: ProfilesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$SelectProfileToConvert;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectProfileToConvert implements ProfilesListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<MergeAccountsProfile> f213287b;

        public SelectProfileToConvert(@k List<MergeAccountsProfile> list) {
            this.f213287b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectProfileToConvert) && L.f(this.f213287b, ((SelectProfileToConvert) obj).f213287b);
        }

        public final int hashCode() {
            return this.f213287b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("SelectProfileToConvert(profilesToConvert="), this.f213287b, ')');
        }
    }

    /* compiled from: ProfilesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction$ProfilesLoaded;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProfilesLoaded implements ProfilesListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<MergeAccountsProfile> f213280b;

        /* renamed from: c, reason: collision with root package name */
        public final int f213281c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<MergeAccountsProfile> f213282d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final BusinessVrfDuplication f213283e;

        public ProfilesLoaded(@k List<MergeAccountsProfile> list, int i12, @k List<MergeAccountsProfile> list2, @l BusinessVrfDuplication businessVrfDuplication) {
            this.f213280b = list;
            this.f213281c = i12;
            this.f213282d = list2;
            this.f213283e = businessVrfDuplication;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF204956d() {
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
            if (!(obj instanceof ProfilesLoaded)) {
                return false;
            }
            ProfilesLoaded profilesLoaded = (ProfilesLoaded) obj;
            return L.f(this.f213280b, profilesLoaded.f213280b) && this.f213281c == profilesLoaded.f213281c && L.f(this.f213282d, profilesLoaded.f213282d) && L.f(this.f213283e, profilesLoaded.f213283e);
        }

        public final int hashCode() {
            int iE2 = H.e(r.e(this.f213281c, this.f213280b.hashCode() * 31, 31), 31, this.f213282d);
            BusinessVrfDuplication businessVrfDuplication = this.f213283e;
            return iE2 + (businessVrfDuplication == null ? 0 : businessVrfDuplication.hashCode());
        }

        @k
        public final String toString() {
            return "ProfilesLoaded(profiles=" + this.f213280b + ", alwaysVisibleCount=" + this.f213281c + ", profilesToConvert=" + this.f213282d + ", businessVrfDuplication=" + this.f213283e + ')';
        }

        public ProfilesLoaded(List list, int i12, List list2, BusinessVrfDuplication businessVrfDuplication, int i13, C42822w c42822w) {
            this(list, i12, (i13 & 4) != 0 ? C42784z0.f406748b : list2, businessVrfDuplication);
        }
    }
}
