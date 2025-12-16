package com.avito.android.passport.profiles_list.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.passport.profiles_list.ProfilesListResult;
import com.avito.android.util.ApiException;
import java.util.List;
import jz.C42454e;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import p60.C46900a;

/* compiled from: PassportProfilesListInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Content", "ContentV2", "DeepLinkAction", "Error", "Loading", "NewSearch", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction$Close;", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction$Content;", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction$ContentV2;", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction$DeepLinkAction;", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction$Error;", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction$Loading;", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction$NewSearch;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PassportProfilesListInternalAction extends n {

    /* compiled from: PassportProfilesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction$Close;", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements PassportProfilesListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ProfilesListResult f213830b;

        /* JADX WARN: Multi-variable type inference failed */
        public Close() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Close) && L.f(this.f213830b, ((Close) obj).f213830b);
        }

        public final int hashCode() {
            return this.f213830b.hashCode();
        }

        @k
        public final String toString() {
            return "Close(result=" + this.f213830b + ')';
        }

        public Close(@k ProfilesListResult profilesListResult) {
            this.f213830b = profilesListResult;
        }

        public /* synthetic */ Close(ProfilesListResult profilesListResult, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? ProfilesListResult.Cancelled.f213742b : profilesListResult);
        }
    }

    /* compiled from: PassportProfilesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction$Content;", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements PassportProfilesListInternalAction, TrackableContent {
        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
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
            if (!(obj instanceof Content)) {
                return false;
            }
            ((Content) obj).getClass();
            return L.f(null, null) && L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "Content(data=null, employeeModes=null)";
        }
    }

    /* compiled from: PassportProfilesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction$ContentV2;", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentV2 implements PassportProfilesListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<C46900a> f213831b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final C42454e f213832c;

        public ContentV2(@k List<C46900a> list, @k C42454e c42454e) {
            this.f213831b = list;
            this.f213832c = c42454e;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
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
            if (!(obj instanceof ContentV2)) {
                return false;
            }
            ContentV2 contentV2 = (ContentV2) obj;
            return L.f(this.f213831b, contentV2.f213831b) && L.f(this.f213832c, contentV2.f213832c);
        }

        public final int hashCode() {
            return this.f213832c.f405981a.hashCode() + (this.f213831b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ContentV2(data=" + this.f213831b + ", employeeModes=" + this.f213832c + ')';
        }
    }

    /* compiled from: PassportProfilesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction$DeepLinkAction;", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeepLinkAction implements PassportProfilesListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f213833b;

        public DeepLinkAction(@k DeepLink deepLink) {
            this.f213833b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeepLinkAction) && L.f(this.f213833b, ((DeepLinkAction) obj).f213833b);
        }

        public final int hashCode() {
            return this.f213833b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("DeepLinkAction(deepLink="), this.f213833b, ')');
        }
    }

    /* compiled from: PassportProfilesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction$Error;", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements PassportProfilesListInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f213834b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f213835c;

        public Error(@k ApiException apiException) {
            this.f213834b = apiException;
            this.f213835c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
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
            return (obj instanceof Error) && this.f213834b.equals(((Error) obj).f213834b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF211017c() {
            return this.f213835c;
        }

        public final int hashCode() {
            return this.f213834b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f213834b, ')');
        }
    }

    /* compiled from: PassportProfilesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements PassportProfilesListInternalAction {
    }

    /* compiled from: PassportProfilesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction$NewSearch;", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NewSearch implements PassportProfilesListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f213836b;

        public NewSearch(@k String str) {
            this.f213836b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewSearch) && L.f(this.f213836b, ((NewSearch) obj).f213836b);
        }

        public final int hashCode() {
            return this.f213836b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("NewSearch(text="), this.f213836b, ')');
        }
    }
}
