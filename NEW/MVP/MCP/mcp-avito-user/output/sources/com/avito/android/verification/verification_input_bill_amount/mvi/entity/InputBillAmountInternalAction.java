package com.avito.android.verification.verification_input_bill_amount.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.inn.VerificationInputBillAmountResult;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputBillAmountInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Error", "FinishActivity", "InputValidationFailed", "Loaded", "Loading", "SetButtonLoading", "ShowErrorToast", "Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction$Error;", "Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction$FinishActivity;", "Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction$InputValidationFailed;", "Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction$Loaded;", "Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction$Loading;", "Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction$SetButtonLoading;", "Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction$ShowErrorToast;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface InputBillAmountInternalAction extends n {

    /* compiled from: InputBillAmountInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction$Error;", "Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements InputBillAmountInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f325568b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f325569c;

        public Error(@k ApiError apiError) {
            this.f325568b = apiError;
            this.f325569c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF314462e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f325568b, ((Error) obj).f325568b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF203575c() {
            return this.f325569c;
        }

        public final int hashCode() {
            return this.f325568b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(error="), this.f325568b, ')');
        }
    }

    /* compiled from: InputBillAmountInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction$FinishActivity;", "Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction;", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FinishActivity implements InputBillAmountInternalAction {
    }

    /* compiled from: InputBillAmountInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction$InputValidationFailed;", "Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InputValidationFailed implements InputBillAmountInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, AttributedText> f325570b;

        public InputValidationFailed(@k Map<String, AttributedText> map) {
            this.f325570b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InputValidationFailed) && L.f(this.f325570b, ((InputValidationFailed) obj).f325570b);
        }

        public final int hashCode() {
            return this.f325570b.hashCode();
        }

        @k
        public final String toString() {
            return r.w(new StringBuilder("InputValidationFailed(errors="), this.f325570b, ')');
        }
    }

    /* compiled from: InputBillAmountInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction$Loaded;", "Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements InputBillAmountInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final VerificationInputBillAmountResult f325571b;

        public Loaded(@k VerificationInputBillAmountResult verificationInputBillAmountResult) {
            this.f325571b = verificationInputBillAmountResult;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF314462e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && L.f(this.f325571b, ((Loaded) obj).f325571b);
        }

        public final int hashCode() {
            return this.f325571b.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(data=" + this.f325571b + ')';
        }
    }

    /* compiled from: InputBillAmountInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction$Loading;", "Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements InputBillAmountInternalAction {
    }

    /* compiled from: InputBillAmountInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction$SetButtonLoading;", "Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetButtonLoading implements InputBillAmountInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f325572b;

        public SetButtonLoading(boolean z12) {
            this.f325572b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetButtonLoading) && this.f325572b == ((SetButtonLoading) obj).f325572b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f325572b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SetButtonLoading(isLoading="), this.f325572b, ')');
        }
    }

    /* compiled from: InputBillAmountInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction$ShowErrorToast;", "Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast implements InputBillAmountInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f325573b;

        public ShowErrorToast(@k String str) {
            this.f325573b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowErrorToast) && L.f(this.f325573b, ((ShowErrorToast) obj).f325573b);
        }

        public final int hashCode() {
            return this.f325573b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToast(text="), this.f325573b, ')');
        }
    }
}
