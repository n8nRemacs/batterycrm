package com.avito.android.verification.verification_confirm_requisites.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.inn.VerificationConfirmRequisitesResult;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.select.Arguments;
import com.avito.android.verification.inn.list.button.ButtonItem;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfirmRequisitesInternalAction.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BottomSheetItemSelect", "DoNothing", "Error", "FinishActivity", "InputValidationFailed", "Loaded", "Loading", "NavigateBack", "OpenBottomSheet", "SetButtonLoading", "ShowErrorToast", "UpdateListState", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$BottomSheetItemSelect;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$DoNothing;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$Error;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$FinishActivity;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$InputValidationFailed;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$Loaded;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$Loading;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$NavigateBack;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$OpenBottomSheet;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$SetButtonLoading;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$ShowErrorToast;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$UpdateListState;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ConfirmRequisitesInternalAction extends n {

    /* compiled from: ConfirmRequisitesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$BottomSheetItemSelect;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BottomSheetItemSelect implements ConfirmRequisitesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f324971b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<ParcelableEntity<String>> f324972c;

        /* JADX WARN: Multi-variable type inference failed */
        public BottomSheetItemSelect(@k String str, @k List<? extends ParcelableEntity<String>> list) {
            this.f324971b = str;
            this.f324972c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomSheetItemSelect)) {
                return false;
            }
            BottomSheetItemSelect bottomSheetItemSelect = (BottomSheetItemSelect) obj;
            return L.f(this.f324971b, bottomSheetItemSelect.f324971b) && L.f(this.f324972c, bottomSheetItemSelect.f324972c);
        }

        public final int hashCode() {
            return this.f324972c.hashCode() + (this.f324971b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BottomSheetItemSelect(requestId=");
            sb2.append(this.f324971b);
            sb2.append(", selectedItems=");
            return H.p(sb2, this.f324972c, ')');
        }
    }

    /* compiled from: ConfirmRequisitesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$DoNothing;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DoNothing implements ConfirmRequisitesInternalAction {
    }

    /* compiled from: ConfirmRequisitesInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$Error;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements ConfirmRequisitesInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f324973b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f324974c;

        public Error(@k ApiError apiError) {
            this.f324973b = apiError;
            this.f324974c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF198624d() {
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
            return (obj instanceof Error) && L.f(this.f324973b, ((Error) obj).f324973b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF304335c() {
            return this.f324974c;
        }

        public final int hashCode() {
            return this.f324973b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(error="), this.f324973b, ')');
        }
    }

    /* compiled from: ConfirmRequisitesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$FinishActivity;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FinishActivity implements ConfirmRequisitesInternalAction {
    }

    /* compiled from: ConfirmRequisitesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$InputValidationFailed;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InputValidationFailed implements ConfirmRequisitesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, AttributedText> f324975b;

        public InputValidationFailed(@k Map<String, AttributedText> map) {
            this.f324975b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InputValidationFailed) && L.f(this.f324975b, ((InputValidationFailed) obj).f324975b);
        }

        public final int hashCode() {
            return this.f324975b.hashCode();
        }

        @k
        public final String toString() {
            return r.w(new StringBuilder("InputValidationFailed(errors="), this.f324975b, ')');
        }
    }

    /* compiled from: ConfirmRequisitesInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$Loaded;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements ConfirmRequisitesInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final VerificationConfirmRequisitesResult f324976b;

        public Loaded(@k VerificationConfirmRequisitesResult verificationConfirmRequisitesResult) {
            this.f324976b = verificationConfirmRequisitesResult;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF198624d() {
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
            return (obj instanceof Loaded) && L.f(this.f324976b, ((Loaded) obj).f324976b);
        }

        public final int hashCode() {
            return this.f324976b.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(data=" + this.f324976b + ')';
        }
    }

    /* compiled from: ConfirmRequisitesInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$Loading;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements ConfirmRequisitesInternalAction {
    }

    /* compiled from: ConfirmRequisitesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$NavigateBack;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NavigateBack implements ConfirmRequisitesInternalAction {
    }

    /* compiled from: ConfirmRequisitesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$OpenBottomSheet;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenBottomSheet implements ConfirmRequisitesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Arguments f324977b;

        public OpenBottomSheet(@k Arguments arguments) {
            this.f324977b = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenBottomSheet) && L.f(this.f324977b, ((OpenBottomSheet) obj).f324977b);
        }

        public final int hashCode() {
            return this.f324977b.hashCode();
        }

        @k
        public final String toString() {
            return c.p(new StringBuilder("OpenBottomSheet(arguments="), this.f324977b, ')');
        }
    }

    /* compiled from: ConfirmRequisitesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$SetButtonLoading;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetButtonLoading implements ConfirmRequisitesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ButtonItem f324978b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f324979c;

        public SetButtonLoading(@k ButtonItem buttonItem, boolean z12) {
            this.f324978b = buttonItem;
            this.f324979c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetButtonLoading)) {
                return false;
            }
            SetButtonLoading setButtonLoading = (SetButtonLoading) obj;
            return L.f(this.f324978b, setButtonLoading.f324978b) && this.f324979c == setButtonLoading.f324979c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f324979c) + (this.f324978b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetButtonLoading(buttonItem=");
            sb2.append(this.f324978b);
            sb2.append(", isLoading=");
            return r.x(sb2, this.f324979c, ')');
        }
    }

    /* compiled from: ConfirmRequisitesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$ShowErrorToast;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast implements ConfirmRequisitesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f324980b;

        public ShowErrorToast(@k String str) {
            this.f324980b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowErrorToast) && L.f(this.f324980b, ((ShowErrorToast) obj).f324980b);
        }

        public final int hashCode() {
            return this.f324980b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToast(text="), this.f324980b, ')');
        }
    }

    /* compiled from: ConfirmRequisitesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction$UpdateListState;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateListState implements ConfirmRequisitesInternalAction {
    }
}
