package com.avito.android.authorization.complete_registration.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UserDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CompleteRegistrationInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Completed", "FocusInput", "HighlightInputs", "NeedParsingPermission", "SaveFocusedInput", "ShowCredman", "ShowDialog", "ShowError", "ShowLoading", "UpdateName", "UpdatePassword", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$Completed;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$FocusInput;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$HighlightInputs;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$NeedParsingPermission;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$SaveFocusedInput;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$ShowCredman;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$ShowDialog;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$ShowError;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$ShowLoading;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$UpdateName;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$UpdatePassword;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CompleteRegistrationInternalAction extends n {

    /* compiled from: CompleteRegistrationInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$Completed;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Completed implements CompleteRegistrationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Completed f93465b = new Completed();

        private Completed() {
        }
    }

    /* compiled from: CompleteRegistrationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$FocusInput;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FocusInput implements CompleteRegistrationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InputType f93466b;

        public FocusInput(@k InputType inputType) {
            this.f93466b = inputType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FocusInput) && this.f93466b == ((FocusInput) obj).f93466b;
        }

        public final int hashCode() {
            return this.f93466b.hashCode();
        }

        @k
        public final String toString() {
            return "FocusInput(inputType=" + this.f93466b + ')';
        }
    }

    /* compiled from: CompleteRegistrationInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$HighlightInputs;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HighlightInputs implements CompleteRegistrationInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f93467b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final PrintableText f93468c;

        public HighlightInputs(@l PrintableText printableText, @l PrintableText printableText2) {
            this.f93467b = printableText;
            this.f93468c = printableText2;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF288444d() {
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
            if (!(obj instanceof HighlightInputs)) {
                return false;
            }
            HighlightInputs highlightInputs = (HighlightInputs) obj;
            return L.f(this.f93467b, highlightInputs.f93467b) && L.f(this.f93468c, highlightInputs.f93468c);
        }

        public final int hashCode() {
            PrintableText printableText = this.f93467b;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            PrintableText printableText2 = this.f93468c;
            return iHashCode + (printableText2 != null ? printableText2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HighlightInputs(name=");
            sb2.append(this.f93467b);
            sb2.append(", password=");
            return c.m(sb2, this.f93468c, ')');
        }
    }

    /* compiled from: CompleteRegistrationInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$NeedParsingPermission;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NeedParsingPermission implements CompleteRegistrationInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f93469b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f93470c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f93471d;

        public NeedParsingPermission(@l String str, @l String str2, @l String str3) {
            this.f93469b = str;
            this.f93470c = str2;
            this.f93471d = str3;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF288444d() {
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
            if (!(obj instanceof NeedParsingPermission)) {
                return false;
            }
            NeedParsingPermission needParsingPermission = (NeedParsingPermission) obj;
            return L.f(this.f93469b, needParsingPermission.f93469b) && L.f(this.f93470c, needParsingPermission.f93470c) && L.f(this.f93471d, needParsingPermission.f93471d);
        }

        public final int hashCode() {
            String str = this.f93469b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f93470c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f93471d;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NeedParsingPermission(name=");
            sb2.append(this.f93469b);
            sb2.append(", phone=");
            sb2.append(this.f93470c);
            sb2.append(", login=");
            return C22026a.c(sb2, this.f93471d, ')');
        }
    }

    /* compiled from: CompleteRegistrationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$SaveFocusedInput;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveFocusedInput implements CompleteRegistrationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InputType f93472b;

        public SaveFocusedInput(@k InputType inputType) {
            this.f93472b = inputType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SaveFocusedInput) && this.f93472b == ((SaveFocusedInput) obj).f93472b;
        }

        public final int hashCode() {
            return this.f93472b.hashCode();
        }

        @k
        public final String toString() {
            return "SaveFocusedInput(inputType=" + this.f93472b + ')';
        }
    }

    /* compiled from: CompleteRegistrationInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$ShowCredman;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowCredman implements CompleteRegistrationInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowCredman f93473b = new ShowCredman();

        private ShowCredman() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF288444d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }
    }

    /* compiled from: CompleteRegistrationInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$ShowDialog;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowDialog implements CompleteRegistrationInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserDialog f93474b;

        public ShowDialog(@k UserDialog userDialog) {
            this.f93474b = userDialog;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF288444d() {
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
            return (obj instanceof ShowDialog) && L.f(this.f93474b, ((ShowDialog) obj).f93474b);
        }

        public final int hashCode() {
            return this.f93474b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowDialog(dialog=" + this.f93474b + ')';
        }
    }

    /* compiled from: CompleteRegistrationInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$ShowError;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements CompleteRegistrationInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f93475b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f93476c;

        public ShowError(PrintableText printableText, J.a aVar, int i12, C42822w c42822w) {
            if ((i12 & 2) != 0) {
                J.a.f90383b.getClass();
                aVar = J.a.C2676a.d();
            }
            this.f93475b = printableText;
            this.f93476c = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF288444d() {
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
            if (!(obj instanceof ShowError)) {
                return false;
            }
            ShowError showError = (ShowError) obj;
            return L.f(this.f93475b, showError.f93475b) && L.f(this.f93476c, showError.f93476c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF81885c() {
            return this.f93476c;
        }

        public final int hashCode() {
            return this.f93476c.f90384a.hashCode() + (this.f93475b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowError(message=" + this.f93475b + ", failure=" + this.f93476c + ')';
        }
    }

    /* compiled from: CompleteRegistrationInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$ShowLoading;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements CompleteRegistrationInternalAction {
    }

    /* compiled from: CompleteRegistrationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$UpdateName;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateName implements CompleteRegistrationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f93477b;

        public UpdateName(@k String str) {
            this.f93477b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateName) && L.f(this.f93477b, ((UpdateName) obj).f93477b);
        }

        public final int hashCode() {
            return this.f93477b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateName(name="), this.f93477b, ')');
        }
    }

    /* compiled from: CompleteRegistrationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction$UpdatePassword;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePassword implements CompleteRegistrationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f93478b;

        public UpdatePassword(@k String str) {
            this.f93478b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePassword) && L.f(this.f93478b, ((UpdatePassword) obj).f93478b);
        }

        public final int hashCode() {
            return this.f93478b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdatePassword(password="), this.f93478b, ')');
        }
    }
}
