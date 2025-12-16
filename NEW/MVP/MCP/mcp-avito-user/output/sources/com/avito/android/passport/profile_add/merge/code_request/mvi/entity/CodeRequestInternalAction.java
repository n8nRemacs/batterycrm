package com.avito.android.passport.profile_add.merge.code_request.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CodeRequestInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ClearValidationError", "CodeRequested", "CodeRequesting", "ContentError", "DeepLinkAction", "EmptyPhoneValidationError", "Loading", "RemotePhoneValidationError", "ShowContent", "UnknownError", "UnknownServerError", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$ClearValidationError;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$CodeRequested;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$CodeRequesting;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$ContentError;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$DeepLinkAction;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$EmptyPhoneValidationError;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$Loading;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$RemotePhoneValidationError;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$ShowContent;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$UnknownError;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$UnknownServerError;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CodeRequestInternalAction extends n {

    /* compiled from: CodeRequestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$ClearValidationError;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClearValidationError implements CodeRequestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClearValidationError f212871b = new ClearValidationError();

        private ClearValidationError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ClearValidationError);
        }

        public final int hashCode() {
            return 1223924977;
        }

        @k
        public final String toString() {
            return "ClearValidationError";
        }
    }

    /* compiled from: CodeRequestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$CodeRequested;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CodeRequested implements TrackableContent, CodeRequestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f212872b;

        /* renamed from: c, reason: collision with root package name */
        public final long f212873c;

        public CodeRequested(@k String str, long j12) {
            this.f212872b = str;
            this.f212873c = j12;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF120323d() {
            return "mergeCodeRequest";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "mergeCodeRequest";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CodeRequested)) {
                return false;
            }
            CodeRequested codeRequested = (CodeRequested) obj;
            return L.f(this.f212872b, codeRequested.f212872b) && this.f212873c == codeRequested.f212873c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f212873c) + (this.f212872b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CodeRequested(phoneNumber=");
            sb2.append(this.f212872b);
            sb2.append(", timeoutEndTimestampSeconds=");
            return r.u(sb2, this.f212873c, ')');
        }
    }

    /* compiled from: CodeRequestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$CodeRequesting;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CodeRequesting extends TrackableLoadingStarted implements CodeRequestInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f212874d;

        public CodeRequesting() {
            this(null, 1, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF120323d() {
            return this.f212874d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CodeRequesting) && L.f(this.f212874d, ((CodeRequesting) obj).f212874d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f212874d.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CodeRequesting(contentType="), this.f212874d, ')');
        }

        public CodeRequesting(String str, int i12, C42822w c42822w) {
            this.f212874d = (i12 & 1) != 0 ? "mergeCodeRequest" : str;
        }
    }

    /* compiled from: CodeRequestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$ContentError;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentError implements TrackableError, CodeRequestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f212875b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f212876c;

        public ContentError(@k ApiException apiException) {
            this.f212875b = apiException;
            J.a.f90383b.getClass();
            this.f212876c = J.a.C2676a.c(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF120323d() {
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
            return (obj instanceof ContentError) && this.f212875b.equals(((ContentError) obj).f212875b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF99495c() {
            return this.f212876c;
        }

        public final int hashCode() {
            return this.f212875b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("ContentError(error="), this.f212875b, ')');
        }
    }

    /* compiled from: CodeRequestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$DeepLinkAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeepLinkAction implements TrackableContent, CodeRequestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f212877b;

        public DeepLinkAction(@k DeepLink deepLink) {
            this.f212877b = deepLink;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF120323d() {
            return "mergeCodeRequest";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "mergeCodeRequest";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeepLinkAction) && L.f(this.f212877b, ((DeepLinkAction) obj).f212877b);
        }

        public final int hashCode() {
            return this.f212877b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("DeepLinkAction(deepLink="), this.f212877b, ')');
        }
    }

    /* compiled from: CodeRequestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$EmptyPhoneValidationError;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EmptyPhoneValidationError implements CodeRequestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final EmptyPhoneValidationError f212878b = new EmptyPhoneValidationError();

        private EmptyPhoneValidationError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof EmptyPhoneValidationError);
        }

        public final int hashCode() {
            return 111507999;
        }

        @k
        public final String toString() {
            return "EmptyPhoneValidationError";
        }
    }

    /* compiled from: CodeRequestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$Loading;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements CodeRequestInternalAction {
    }

    /* compiled from: CodeRequestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$RemotePhoneValidationError;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemotePhoneValidationError implements TrackableContent, CodeRequestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f212879b;

        public RemotePhoneValidationError(@l String str) {
            this.f212879b = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF120323d() {
            return "mergeCodeRequest";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "mergeCodeRequest";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemotePhoneValidationError) && L.f(this.f212879b, ((RemotePhoneValidationError) obj).f212879b);
        }

        public final int hashCode() {
            String str = this.f212879b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RemotePhoneValidationError(errorMessage="), this.f212879b, ')');
        }
    }

    /* compiled from: CodeRequestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$ShowContent;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements CodeRequestInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f212880b;

        public ShowContent(@l AttributedText attributedText) {
            this.f212880b = attributedText;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF120323d() {
            return "mergeCodeRequest";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "mergeCodeRequest";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowContent) && L.f(this.f212880b, ((ShowContent) obj).f212880b);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f212880b;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        @k
        public final String toString() {
            return a.w(new StringBuilder("ShowContent(content="), this.f212880b, ')');
        }
    }

    /* compiled from: CodeRequestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$UnknownError;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnknownError implements TrackableError, CodeRequestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f212881b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f212882c;

        public UnknownError(@k Throwable th2) {
            this.f212881b = th2;
            J.a.f90383b.getClass();
            this.f212882c = J.a.C2676a.c(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF120323d() {
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
            return (obj instanceof UnknownError) && L.f(this.f212881b, ((UnknownError) obj).f212881b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF99495c() {
            return this.f212882c;
        }

        public final int hashCode() {
            return this.f212881b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("UnknownError(cause="), this.f212881b, ')');
        }
    }

    /* compiled from: CodeRequestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction$UnknownServerError;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnknownServerError implements TrackableError, CodeRequestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f212883b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f212884c;

        public UnknownServerError(@k ApiError apiError) {
            this.f212883b = apiError;
            J.a.f90383b.getClass();
            this.f212884c = J.a.C2676a.b(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF120323d() {
            return "mergeCodeRequest";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "mergeCodeRequest";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnknownServerError) && L.f(this.f212883b, ((UnknownServerError) obj).f212883b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF99495c() {
            return this.f212884c;
        }

        public final int hashCode() {
            return this.f212883b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("UnknownServerError(apiError="), this.f212883b, ')');
        }
    }
}
