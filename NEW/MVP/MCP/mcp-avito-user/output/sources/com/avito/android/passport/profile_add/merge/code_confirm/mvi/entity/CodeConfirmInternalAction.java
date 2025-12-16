package com.avito.android.passport.profile_add.merge.code_confirm.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.PassportMergeAccountsCloseLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CodeConfirmInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BackCodeValidationError", "ClearValidationError", "CodeConfirmed", "CodeConfirming", "LocalCodeValidationError", "OpenDeepLink", "SetPhoneNumber", "UnknownError", "UnknownServerError", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction$BackCodeValidationError;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction$ClearValidationError;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction$CodeConfirmed;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction$CodeConfirming;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction$LocalCodeValidationError;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction$OpenDeepLink;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction$SetPhoneNumber;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction$UnknownError;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction$UnknownServerError;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CodeConfirmInternalAction extends n {

    /* compiled from: CodeConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction$BackCodeValidationError;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BackCodeValidationError implements TrackableContent, CodeConfirmInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f212747b;

        public BackCodeValidationError(@l String str) {
            this.f212747b = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF213278d() {
            return "mergeCodeConfirm";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "mergeCodeConfirm";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BackCodeValidationError) && L.f(this.f212747b, ((BackCodeValidationError) obj).f212747b);
        }

        public final int hashCode() {
            String str = this.f212747b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("BackCodeValidationError(errorMessage="), this.f212747b, ')');
        }
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction$ClearValidationError;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ClearValidationError implements CodeConfirmInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClearValidationError f212748b = new ClearValidationError();

        private ClearValidationError() {
        }
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction$CodeConfirmed;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CodeConfirmed implements TrackableContent, CodeConfirmInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CodeConfirmed f212749b = new CodeConfirmed();

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f212750c = "mergeCodeConfirm";

        private CodeConfirmed() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF213278d() {
            return f212750c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return f212750c;
        }
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction$CodeConfirming;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CodeConfirming extends TrackableLoadingStarted implements CodeConfirmInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f212751d;

        public CodeConfirming() {
            this(null, 1, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF213278d() {
            return this.f212751d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CodeConfirming) && L.f(this.f212751d, ((CodeConfirming) obj).f212751d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f212751d.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CodeConfirming(contentType="), this.f212751d, ')');
        }

        public CodeConfirming(String str, int i12, C42822w c42822w) {
            this.f212751d = (i12 & 1) != 0 ? "mergeCodeConfirm" : str;
        }
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction$LocalCodeValidationError;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LocalCodeValidationError implements CodeConfirmInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LocalCodeValidationError f212752b = new LocalCodeValidationError();

        private LocalCodeValidationError() {
        }
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction$OpenDeepLink;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements TrackableContent, CodeConfirmInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PassportMergeAccountsCloseLink f212753b;

        public OpenDeepLink(@k PassportMergeAccountsCloseLink passportMergeAccountsCloseLink) {
            this.f212753b = passportMergeAccountsCloseLink;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF213278d() {
            return "mergeCodeConfirm";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "mergeCodeConfirm";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && this.f212753b.equals(((OpenDeepLink) obj).f212753b);
        }

        public final int hashCode() {
            return this.f212753b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenDeepLink(deepLink=" + this.f212753b + ')';
        }
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction$SetPhoneNumber;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetPhoneNumber implements CodeConfirmInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f212754b;

        public SetPhoneNumber(@k String str) {
            this.f212754b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetPhoneNumber) && L.f(this.f212754b, ((SetPhoneNumber) obj).f212754b);
        }

        public final int hashCode() {
            return this.f212754b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetPhoneNumber(phoneNumber="), this.f212754b, ')');
        }
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction$UnknownError;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnknownError implements TrackableError, CodeConfirmInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f212755b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f212756c;

        public UnknownError(@k Throwable th2) {
            this.f212755b = th2;
            J.a.f90383b.getClass();
            this.f212756c = J.a.C2676a.c(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF213278d() {
            return "mergeCodeConfirm";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "mergeCodeConfirm";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnknownError) && L.f(this.f212755b, ((UnknownError) obj).f212755b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF303592c() {
            return this.f212756c;
        }

        public final int hashCode() {
            return this.f212755b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("UnknownError(cause="), this.f212755b, ')');
        }
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction$UnknownServerError;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnknownServerError implements TrackableError, CodeConfirmInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f212757b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f212758c;

        public UnknownServerError(@k ApiError apiError) {
            this.f212757b = apiError;
            J.a.f90383b.getClass();
            this.f212758c = J.a.C2676a.b(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF213278d() {
            return "mergeCodeConfirm";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "mergeCodeConfirm";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnknownServerError) && L.f(this.f212757b, ((UnknownServerError) obj).f212757b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF303592c() {
            return this.f212758c;
        }

        public final int hashCode() {
            return this.f212757b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("UnknownServerError(apiError="), this.f212757b, ')');
        }
    }
}
