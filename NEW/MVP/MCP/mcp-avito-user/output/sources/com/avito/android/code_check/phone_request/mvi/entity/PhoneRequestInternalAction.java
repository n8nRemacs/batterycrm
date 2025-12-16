package com.avito.android.code_check.phone_request.mvi.entity;

import AK.c;
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

/* compiled from: PhoneRequestInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ClearValidationError", "Navigate", "PhoneRequesting", "PhoneValidationError", "Requested", "SetPhone", "ShowUserDialog", "ToastMessage", "UnknownError", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction$ClearValidationError;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction$Navigate;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction$PhoneRequesting;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction$PhoneValidationError;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction$Requested;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction$SetPhone;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction$ShowUserDialog;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction$ToastMessage;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction$UnknownError;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PhoneRequestInternalAction extends n {

    /* compiled from: PhoneRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction$ClearValidationError;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction;", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ClearValidationError implements PhoneRequestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClearValidationError f119111b = new ClearValidationError();

        private ClearValidationError() {
        }
    }

    /* compiled from: PhoneRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction$Navigate;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Navigate implements PhoneRequestInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f119112b;

        public Navigate(@k a aVar) {
            this.f119112b = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211967d() {
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
            return (obj instanceof Navigate) && L.f(this.f119112b, ((Navigate) obj).f119112b);
        }

        public final int hashCode() {
            return this.f119112b.hashCode();
        }

        @k
        public final String toString() {
            return "Navigate(destination=" + this.f119112b + ')';
        }
    }

    /* compiled from: PhoneRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction$PhoneRequesting;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PhoneRequesting extends TrackableLoadingStarted implements PhoneRequestInternalAction {
    }

    /* compiled from: PhoneRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction$PhoneValidationError;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhoneValidationError implements PhoneRequestInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f119113b;

        public PhoneValidationError(@k PrintableText printableText) {
            this.f119113b = printableText;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211967d() {
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
            return (obj instanceof PhoneValidationError) && L.f(this.f119113b, ((PhoneValidationError) obj).f119113b);
        }

        public final int hashCode() {
            return this.f119113b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("PhoneValidationError(errorMessage="), this.f119113b, ')');
        }
    }

    /* compiled from: PhoneRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction$Requested;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Requested implements PhoneRequestInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final a f119114b;

        /* JADX WARN: Multi-variable type inference failed */
        public Requested() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211967d() {
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
            return (obj instanceof Requested) && L.f(this.f119114b, ((Requested) obj).f119114b);
        }

        public final int hashCode() {
            a aVar = this.f119114b;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @k
        public final String toString() {
            return "Requested(nextNavigation=" + this.f119114b + ')';
        }

        public Requested(@l a aVar) {
            this.f119114b = aVar;
        }

        public /* synthetic */ Requested(a aVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : aVar);
        }
    }

    /* compiled from: PhoneRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction$SetPhone;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetPhone implements PhoneRequestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f119115b;

        public SetPhone(@k String str) {
            this.f119115b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetPhone) && L.f(this.f119115b, ((SetPhone) obj).f119115b);
        }

        public final int hashCode() {
            return this.f119115b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetPhone(phone="), this.f119115b, ')');
        }
    }

    /* compiled from: PhoneRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction$ShowUserDialog;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowUserDialog implements PhoneRequestInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final i f119116b;

        public ShowUserDialog(@k i iVar) {
            this.f119116b = iVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211967d() {
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
            return (obj instanceof ShowUserDialog) && L.f(this.f119116b, ((ShowUserDialog) obj).f119116b);
        }

        public final int hashCode() {
            return this.f119116b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowUserDialog(dialog=" + this.f119116b + ')';
        }
    }

    /* compiled from: PhoneRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction$ToastMessage;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToastMessage implements PhoneRequestInternalAction, TrackableContent {
        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211967d() {
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
            if (!(obj instanceof ToastMessage)) {
                return false;
            }
            ((ToastMessage) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ToastMessage(text=null)";
        }
    }

    /* compiled from: PhoneRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction$UnknownError;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnknownError implements PhoneRequestInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f119117b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ApiError f119118c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Throwable f119119d;

        public UnknownError() {
            this(null, null, null, 7, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211967d() {
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
            return L.f(this.f119117b, unknownError.f119117b) && L.f(this.f119118c, unknownError.f119118c) && L.f(this.f119119d, unknownError.f119119d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF328859c() {
            J.a.f90383b.getClass();
            return J.a.C2676a.a(this.f119118c, this.f119119d);
        }

        public final int hashCode() {
            PrintableText printableText = this.f119117b;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            ApiError apiError = this.f119118c;
            int iHashCode2 = (iHashCode + (apiError == null ? 0 : apiError.hashCode())) * 31;
            Throwable th2 = this.f119119d;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UnknownError(message=");
            sb2.append(this.f119117b);
            sb2.append(", apiError=");
            sb2.append(this.f119118c);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f119119d, ')');
        }

        public UnknownError(@l PrintableText printableText, @l ApiError apiError, @l Throwable th2) {
            this.f119117b = printableText;
            this.f119118c = apiError;
            this.f119119d = th2;
        }

        public /* synthetic */ UnknownError(PrintableText printableText, ApiError apiError, Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : printableText, (i12 & 2) != 0 ? null : apiError, (i12 & 4) != 0 ? null : th2);
        }
    }
}
