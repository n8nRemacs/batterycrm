package com.avito.android.str_insurance.screen.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.str_insurance.InsuranceData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrInsuranceInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "OpenConfirmationScreen", "OpenDeeplink", "OpenFlatFormScreen", "ShowContent", "ShowFlatFormError", "ShowFlatFormLoading", "ShowFlatNumberContent", "ShowFlatNumberError", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction$CloseScreen;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction$OpenConfirmationScreen;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction$OpenDeeplink;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction$OpenFlatFormScreen;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction$ShowContent;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction$ShowFlatFormError;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction$ShowFlatFormLoading;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction$ShowFlatNumberContent;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction$ShowFlatNumberError;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StrInsuranceInternalAction extends n {

    /* compiled from: StrInsuranceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction$CloseScreen;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction;", "()V", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements StrInsuranceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f288732b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: StrInsuranceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction$OpenConfirmationScreen;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction;", "()V", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenConfirmationScreen implements StrInsuranceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenConfirmationScreen f288733b = new OpenConfirmationScreen();

        private OpenConfirmationScreen() {
        }
    }

    /* compiled from: StrInsuranceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction$OpenDeeplink;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements StrInsuranceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f288734b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f288734b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f288734b, ((OpenDeeplink) obj).f288734b);
        }

        public final int hashCode() {
            return this.f288734b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f288734b, ')');
        }
    }

    /* compiled from: StrInsuranceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction$OpenFlatFormScreen;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction;", "()V", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenFlatFormScreen implements StrInsuranceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenFlatFormScreen f288735b = new OpenFlatFormScreen();

        private OpenFlatFormScreen() {
        }
    }

    /* compiled from: StrInsuranceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction$ShowContent;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements StrInsuranceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InsuranceData f288736b;

        public ShowContent(@k InsuranceData insuranceData) {
            this.f288736b = insuranceData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowContent) && L.f(this.f288736b, ((ShowContent) obj).f288736b);
        }

        public final int hashCode() {
            return this.f288736b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowContent(data=" + this.f288736b + ')';
        }
    }

    /* compiled from: StrInsuranceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction$ShowFlatFormError;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowFlatFormError implements StrInsuranceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f288737b;

        public ShowFlatFormError(@k ApiError apiError) {
            this.f288737b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowFlatFormError) && L.f(this.f288737b, ((ShowFlatFormError) obj).f288737b);
        }

        public final int hashCode() {
            return this.f288737b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ShowFlatFormError(apiError="), this.f288737b, ')');
        }
    }

    /* compiled from: StrInsuranceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction$ShowFlatFormLoading;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction;", "()V", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowFlatFormLoading implements StrInsuranceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowFlatFormLoading f288738b = new ShowFlatFormLoading();

        private ShowFlatFormLoading() {
        }
    }

    /* compiled from: StrInsuranceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction$ShowFlatNumberContent;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowFlatNumberContent implements StrInsuranceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f288739b;

        public ShowFlatNumberContent(@l String str) {
            this.f288739b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowFlatNumberContent) && L.f(this.f288739b, ((ShowFlatNumberContent) obj).f288739b);
        }

        public final int hashCode() {
            String str = this.f288739b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowFlatNumberContent(flatNumber="), this.f288739b, ')');
        }
    }

    /* compiled from: StrInsuranceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction$ShowFlatNumberError;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowFlatNumberError implements StrInsuranceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f288740b;

        public ShowFlatNumberError(@l String str) {
            this.f288740b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowFlatNumberError) && L.f(this.f288740b, ((ShowFlatNumberError) obj).f288740b);
        }

        public final int hashCode() {
            String str = this.f288740b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowFlatNumberError(flatNumber="), this.f288740b, ')');
        }
    }
}
