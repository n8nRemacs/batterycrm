package com.avito.android.code_check.code_confirm.mvi.entity;

import AK.c;
import To.b;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.i;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CodeConfirmInternalAction.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ClearValidationError", "CodeConfirming", "Confirmed", "DisableAutofill", "LocalCodeValidationError", "Navigate", "RequestFocus", "ServerCodeValidationError", "SetCode", "ShowToastMessage", "ShowUserDialog", "TrackContent", "UnknownError", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$ClearValidationError;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$CodeConfirming;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$Confirmed;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$DisableAutofill;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$LocalCodeValidationError;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$Navigate;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$RequestFocus;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$ServerCodeValidationError;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$SetCode;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$ShowToastMessage;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$ShowUserDialog;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$TrackContent;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$UnknownError;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CodeConfirmInternalAction extends n {

    /* compiled from: CodeConfirmInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$ClearValidationError;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ClearValidationError implements CodeConfirmInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClearValidationError f118713b = new ClearValidationError();

        private ClearValidationError() {
        }
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$CodeConfirming;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CodeConfirming extends TrackableLoadingStarted implements CodeConfirmInternalAction {
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$Confirmed;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Confirmed implements CodeConfirmInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final b f118714b;

        public Confirmed(@l b bVar) {
            this.f118714b = bVar;
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
            return (obj instanceof Confirmed) && L.f(this.f118714b, ((Confirmed) obj).f118714b);
        }

        public final int hashCode() {
            b bVar = this.f118714b;
            if (bVar == null) {
                return 0;
            }
            return bVar.f15854a.hashCode();
        }

        @k
        public final String toString() {
            return "Confirmed(packResult=" + this.f118714b + ')';
        }
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$DisableAutofill;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DisableAutofill implements CodeConfirmInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DisableAutofill f118715b = new DisableAutofill();

        private DisableAutofill() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DisableAutofill);
        }

        public final int hashCode() {
            return 1876298888;
        }

        @k
        public final String toString() {
            return "DisableAutofill";
        }
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$LocalCodeValidationError;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LocalCodeValidationError implements CodeConfirmInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LocalCodeValidationError f118716b = new LocalCodeValidationError();

        private LocalCodeValidationError() {
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
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$Navigate;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Navigate implements CodeConfirmInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f118717b;

        public Navigate(@k a aVar) {
            this.f118717b = aVar;
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
            return (obj instanceof Navigate) && L.f(this.f118717b, ((Navigate) obj).f118717b);
        }

        public final int hashCode() {
            return this.f118717b.hashCode();
        }

        @k
        public final String toString() {
            return "Navigate(destination=" + this.f118717b + ')';
        }
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$RequestFocus;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RequestFocus implements CodeConfirmInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RequestFocus f118718b = new RequestFocus();

        private RequestFocus() {
        }
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$ServerCodeValidationError;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServerCodeValidationError implements CodeConfirmInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f118719b;

        public ServerCodeValidationError(@k PrintableText printableText) {
            this.f118719b = printableText;
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
            return (obj instanceof ServerCodeValidationError) && L.f(this.f118719b, ((ServerCodeValidationError) obj).f118719b);
        }

        public final int hashCode() {
            return this.f118719b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("ServerCodeValidationError(errorMessage="), this.f118719b, ')');
        }
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$SetCode;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetCode implements CodeConfirmInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f118720b;

        public SetCode(@k String str) {
            this.f118720b = str;
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
            return (obj instanceof SetCode) && L.f(this.f118720b, ((SetCode) obj).f118720b);
        }

        public final int hashCode() {
            return this.f118720b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetCode(code="), this.f118720b, ')');
        }
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$ShowToastMessage;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToastMessage implements CodeConfirmInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f118721b;

        public ShowToastMessage(@k PrintableText printableText) {
            this.f118721b = printableText;
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
            return (obj instanceof ShowToastMessage) && L.f(this.f118721b, ((ShowToastMessage) obj).f118721b);
        }

        public final int hashCode() {
            return this.f118721b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("ShowToastMessage(text="), this.f118721b, ')');
        }
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$ShowUserDialog;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowUserDialog implements CodeConfirmInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final i f118722b;

        public ShowUserDialog(@k i iVar) {
            this.f118722b = iVar;
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
            return (obj instanceof ShowUserDialog) && L.f(this.f118722b, ((ShowUserDialog) obj).f118722b);
        }

        public final int hashCode() {
            return this.f118722b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowUserDialog(dialog=" + this.f118722b + ')';
        }
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$TrackContent;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TrackContent implements CodeConfirmInternalAction, TrackableContent {
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
    }

    /* compiled from: CodeConfirmInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction$UnknownError;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnknownError implements CodeConfirmInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f118723b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ApiError f118724c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Throwable f118725d;

        public UnknownError() {
            this(null, null, null, 7, null);
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
            if (!(obj instanceof UnknownError)) {
                return false;
            }
            UnknownError unknownError = (UnknownError) obj;
            return L.f(this.f118723b, unknownError.f118723b) && L.f(this.f118724c, unknownError.f118724c) && L.f(this.f118725d, unknownError.f118725d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF115372b() {
            J.a.f90383b.getClass();
            return J.a.C2676a.a(this.f118724c, this.f118725d);
        }

        public final int hashCode() {
            PrintableText printableText = this.f118723b;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            ApiError apiError = this.f118724c;
            int iHashCode2 = (iHashCode + (apiError == null ? 0 : apiError.hashCode())) * 31;
            Throwable th2 = this.f118725d;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UnknownError(message=");
            sb2.append(this.f118723b);
            sb2.append(", apiError=");
            sb2.append(this.f118724c);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f118725d, ')');
        }

        public UnknownError(@l PrintableText printableText, @l ApiError apiError, @l Throwable th2) {
            this.f118723b = printableText;
            this.f118724c = apiError;
            this.f118725d = th2;
        }

        public /* synthetic */ UnknownError(PrintableText printableText, ApiError apiError, Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : printableText, (i12 & 2) != 0 ? null : apiError, (i12 & 4) != 0 ? null : th2);
        }
    }
}
