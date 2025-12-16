package com.avito.android.verification.verification_fetch_invoice.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.inn.VerificationFetchInvoiceResult;
import com.avito.android.verification.inn.list.button.ButtonItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FetchInvoiceInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "DoNothing", "Error", "FinishActivity", "Loaded", "Loading", "NavigateBack", "SetButtonItemLoading", "ShowErrorToast", "UpdateListState", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction$DoNothing;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction$Error;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction$FinishActivity;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction$Loaded;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction$Loading;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction$NavigateBack;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction$SetButtonItemLoading;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction$ShowErrorToast;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction$UpdateListState;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FetchInvoiceInternalAction extends n {

    /* compiled from: FetchInvoiceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction$DoNothing;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction;", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DoNothing implements FetchInvoiceInternalAction {
    }

    /* compiled from: FetchInvoiceInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction$Error;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements FetchInvoiceInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f325203b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f325204c;

        public Error(@k ApiError apiError) {
            this.f325203b = apiError;
            this.f325204c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211747d() {
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
            return (obj instanceof Error) && L.f(this.f325203b, ((Error) obj).f325203b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF235820c() {
            return this.f325204c;
        }

        public final int hashCode() {
            return this.f325203b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(error="), this.f325203b, ')');
        }
    }

    /* compiled from: FetchInvoiceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction$FinishActivity;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction;", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FinishActivity implements FetchInvoiceInternalAction {
    }

    /* compiled from: FetchInvoiceInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction$Loaded;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements FetchInvoiceInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final VerificationFetchInvoiceResult f325205b;

        public Loaded(@k VerificationFetchInvoiceResult verificationFetchInvoiceResult) {
            this.f325205b = verificationFetchInvoiceResult;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211747d() {
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
            return (obj instanceof Loaded) && L.f(this.f325205b, ((Loaded) obj).f325205b);
        }

        public final int hashCode() {
            return this.f325205b.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(data=" + this.f325205b + ')';
        }
    }

    /* compiled from: FetchInvoiceInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction$Loading;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements FetchInvoiceInternalAction {
    }

    /* compiled from: FetchInvoiceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction$NavigateBack;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction;", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NavigateBack implements FetchInvoiceInternalAction {
    }

    /* compiled from: FetchInvoiceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction$SetButtonItemLoading;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetButtonItemLoading implements FetchInvoiceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ButtonItem f325206b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f325207c;

        public SetButtonItemLoading(@k ButtonItem buttonItem, boolean z12) {
            this.f325206b = buttonItem;
            this.f325207c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetButtonItemLoading)) {
                return false;
            }
            SetButtonItemLoading setButtonItemLoading = (SetButtonItemLoading) obj;
            return L.f(this.f325206b, setButtonItemLoading.f325206b) && this.f325207c == setButtonItemLoading.f325207c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f325207c) + (this.f325206b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetButtonItemLoading(buttonItem=");
            sb2.append(this.f325206b);
            sb2.append(", isLoading=");
            return r.x(sb2, this.f325207c, ')');
        }
    }

    /* compiled from: FetchInvoiceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction$ShowErrorToast;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast implements FetchInvoiceInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowErrorToast)) {
                return false;
            }
            ((ShowErrorToast) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowErrorToast(text=null)";
        }
    }

    /* compiled from: FetchInvoiceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction$UpdateListState;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction;", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateListState implements FetchInvoiceInternalAction {
    }
}
