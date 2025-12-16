package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.entity;

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
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentSetProfileNameInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "CreateProfileError", "EmptyNameError", "FinishLoading", "FirstNameTextChanged", "HandleDeeplink", "OnFinal", "SecondNameTextChanged", "StartLoading", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction$Close;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction$CreateProfileError;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction$EmptyNameError;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction$FinishLoading;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction$FirstNameTextChanged;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction$HandleDeeplink;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction$OnFinal;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction$SecondNameTextChanged;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction$StartLoading;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ReAgentSetProfileNameInternalAction extends n {

    /* compiled from: ReAgentSetProfileNameInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction$Close;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements ReAgentSetProfileNameInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f211470b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1984984545;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ReAgentSetProfileNameInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction$CreateProfileError;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CreateProfileError implements ReAgentSetProfileNameInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f211471b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f211472c;

        public CreateProfileError(@k Throwable th2) {
            this.f211471b = th2;
            this.f211472c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF303161d() {
            return "validateName";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "validateName";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CreateProfileError) && L.f(this.f211471b, ((CreateProfileError) obj).f211471b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF174983c() {
            return this.f211472c;
        }

        public final int hashCode() {
            return this.f211471b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("CreateProfileError(throwable="), this.f211471b, ')');
        }
    }

    /* compiled from: ReAgentSetProfileNameInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction$EmptyNameError;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EmptyNameError implements ReAgentSetProfileNameInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final EmptyNameError f211473b = new EmptyNameError();

        private EmptyNameError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof EmptyNameError);
        }

        public final int hashCode() {
            return 993040169;
        }

        @k
        public final String toString() {
            return "EmptyNameError";
        }
    }

    /* compiled from: ReAgentSetProfileNameInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction$FinishLoading;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FinishLoading implements ReAgentSetProfileNameInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishLoading f211474b = new FinishLoading();

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f211475c = "validateName";

        private FinishLoading() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF303161d() {
            return f211475c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return f211475c;
        }
    }

    /* compiled from: ReAgentSetProfileNameInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction$FirstNameTextChanged;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FirstNameTextChanged implements ReAgentSetProfileNameInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f211476b;

        public FirstNameTextChanged(@k String str) {
            this.f211476b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FirstNameTextChanged) && L.f(this.f211476b, ((FirstNameTextChanged) obj).f211476b);
        }

        public final int hashCode() {
            return this.f211476b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("FirstNameTextChanged(text="), this.f211476b, ')');
        }
    }

    /* compiled from: ReAgentSetProfileNameInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction$OnFinal;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnFinal implements ReAgentSetProfileNameInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ProfileCreateExtendedFlow f211480b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f211481c;

        public OnFinal(@k ProfileCreateExtendedFlow profileCreateExtendedFlow, boolean z12) {
            this.f211480b = profileCreateExtendedFlow;
            this.f211481c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnFinal)) {
                return false;
            }
            OnFinal onFinal = (OnFinal) obj;
            return L.f(this.f211480b, onFinal.f211480b) && this.f211481c == onFinal.f211481c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f211481c) + (this.f211480b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnFinal(flow=");
            sb2.append(this.f211480b);
            sb2.append(", isProfileFinalized=");
            return r.x(sb2, this.f211481c, ')');
        }
    }

    /* compiled from: ReAgentSetProfileNameInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction$SecondNameTextChanged;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SecondNameTextChanged implements ReAgentSetProfileNameInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f211482b;

        public SecondNameTextChanged(@k String str) {
            this.f211482b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SecondNameTextChanged) && L.f(this.f211482b, ((SecondNameTextChanged) obj).f211482b);
        }

        public final int hashCode() {
            return this.f211482b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SecondNameTextChanged(text="), this.f211482b, ')');
        }
    }

    /* compiled from: ReAgentSetProfileNameInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction$StartLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartLoading extends TrackableLoadingStarted implements ReAgentSetProfileNameInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f211483d = "validateName";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF303161d() {
            return this.f211483d;
        }
    }

    /* compiled from: ReAgentSetProfileNameInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction$HandleDeeplink;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements ReAgentSetProfileNameInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f211477b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f211478c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Bundle f211479d;

        public HandleDeeplink(@l Bundle bundle, @k DeepLink deepLink, @k String str) {
            this.f211477b = deepLink;
            this.f211478c = str;
            this.f211479d = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            HandleDeeplink handleDeeplink = (HandleDeeplink) obj;
            return L.f(this.f211477b, handleDeeplink.f211477b) && L.f(this.f211478c, handleDeeplink.f211478c) && L.f(this.f211479d, handleDeeplink.f211479d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f211477b.hashCode() * 31, 31, this.f211478c);
            Bundle bundle = this.f211479d;
            return iD2 + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f211477b);
            sb2.append(", requestKey=");
            sb2.append(this.f211478c);
            sb2.append(", args=");
            return H.m(sb2, this.f211479d, ')');
        }

        public /* synthetic */ HandleDeeplink(DeepLink deepLink, String str, Bundle bundle, int i12, C42822w c42822w) {
            this((i12 & 4) != 0 ? null : bundle, deepLink, str);
        }
    }
}
