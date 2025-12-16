package com.avito.android.safety.password_change.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PasswordChangeInternalAction.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0014\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0082\u0001\u0014\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "CredentialsLoaded", "CredentialsSaveStarted", "DisableAutofill", "Finish", "FinishContent", "FocusInput", "HighlightInputs", "LoginLoaded", "NavigateHome", "NavigateToAuth", "OpenPasswordRecovery", "SaveFocusedInput", "SetSessionsFlowMode", "ShowDialog", "ShowError", "ShowLoading", "ToggleOldPasswordHidden", "UpdateNewPassword", "UpdateOldPassword", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$Close;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$CredentialsLoaded;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$CredentialsSaveStarted;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$DisableAutofill;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$Finish;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$FinishContent;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$FocusInput;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$HighlightInputs;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$LoginLoaded;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$NavigateHome;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$NavigateToAuth;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$OpenPasswordRecovery;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$SaveFocusedInput;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$SetSessionsFlowMode;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$ShowDialog;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$ShowError;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$ShowLoading;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$ToggleOldPasswordHidden;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$UpdateNewPassword;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$UpdateOldPassword;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PasswordChangeInternalAction extends n {

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$Close;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Close implements PasswordChangeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f257315b = new Close();

        private Close() {
        }
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$CredentialsLoaded;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CredentialsLoaded implements PasswordChangeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f257316b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f257317c;

        public CredentialsLoaded(@k String str, @k String str2) {
            this.f257316b = str;
            this.f257317c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CredentialsLoaded)) {
                return false;
            }
            CredentialsLoaded credentialsLoaded = (CredentialsLoaded) obj;
            return L.f(this.f257316b, credentialsLoaded.f257316b) && L.f(this.f257317c, credentialsLoaded.f257317c);
        }

        public final int hashCode() {
            return this.f257317c.hashCode() + (this.f257316b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CredentialsLoaded(login=");
            sb2.append(this.f257316b);
            sb2.append(", password=");
            return C22026a.c(sb2, this.f257317c, ')');
        }
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$CredentialsSaveStarted;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CredentialsSaveStarted implements PasswordChangeInternalAction, TrackableContent {
        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF203255e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$DisableAutofill;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DisableAutofill implements PasswordChangeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DisableAutofill f257318b = new DisableAutofill();

        private DisableAutofill() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DisableAutofill);
        }

        public final int hashCode() {
            return -468143556;
        }

        @k
        public final String toString() {
            return "DisableAutofill";
        }
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$Finish;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Finish implements PasswordChangeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f257319b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f257320c;

        public Finish(@k String str, @l String str2) {
            this.f257319b = str;
            this.f257320c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Finish)) {
                return false;
            }
            Finish finish = (Finish) obj;
            return L.f(this.f257319b, finish.f257319b) && L.f(this.f257320c, finish.f257320c);
        }

        public final int hashCode() {
            int iHashCode = this.f257319b.hashCode() * 31;
            String str = this.f257320c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Finish(text=");
            sb2.append(this.f257319b);
            sb2.append(", userId=");
            return C22026a.c(sb2, this.f257320c, ')');
        }
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$FinishContent;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishContent implements PasswordChangeInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f257321b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f257322c;

        public FinishContent(@k String str, @l String str2) {
            this.f257321b = str;
            this.f257322c = str2;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF203255e() {
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
            if (!(obj instanceof FinishContent)) {
                return false;
            }
            FinishContent finishContent = (FinishContent) obj;
            return L.f(this.f257321b, finishContent.f257321b) && L.f(this.f257322c, finishContent.f257322c);
        }

        public final int hashCode() {
            int iHashCode = this.f257321b.hashCode() * 31;
            String str = this.f257322c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FinishContent(text=");
            sb2.append(this.f257321b);
            sb2.append(", userId=");
            return C22026a.c(sb2, this.f257322c, ')');
        }
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$FocusInput;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FocusInput implements PasswordChangeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InputType f257323b;

        public FocusInput(@k InputType inputType) {
            this.f257323b = inputType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FocusInput) && this.f257323b == ((FocusInput) obj).f257323b;
        }

        public final int hashCode() {
            return this.f257323b.hashCode();
        }

        @k
        public final String toString() {
            return "FocusInput(inputType=" + this.f257323b + ')';
        }
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$HighlightInputs;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HighlightInputs implements PasswordChangeInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f257324b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final PrintableText f257325c;

        public HighlightInputs(@l PrintableText printableText, @l PrintableText printableText2) {
            this.f257324b = printableText;
            this.f257325c = printableText2;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF203255e() {
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
            if (!(obj instanceof HighlightInputs)) {
                return false;
            }
            HighlightInputs highlightInputs = (HighlightInputs) obj;
            return L.f(this.f257324b, highlightInputs.f257324b) && L.f(this.f257325c, highlightInputs.f257325c);
        }

        public final int hashCode() {
            PrintableText printableText = this.f257324b;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            PrintableText printableText2 = this.f257325c;
            return iHashCode + (printableText2 != null ? printableText2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HighlightInputs(oldPassword=");
            sb2.append(this.f257324b);
            sb2.append(", newPassword=");
            return c.m(sb2, this.f257325c, ')');
        }
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$LoginLoaded;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoginLoaded implements PasswordChangeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f257326b;

        public LoginLoaded(@k String str) {
            this.f257326b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoginLoaded) && L.f(this.f257326b, ((LoginLoaded) obj).f257326b);
        }

        public final int hashCode() {
            return this.f257326b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoginLoaded(login="), this.f257326b, ')');
        }
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$NavigateHome;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateHome implements PasswordChangeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateHome f257327b = new NavigateHome();

        private NavigateHome() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateHome);
        }

        public final int hashCode() {
            return -572678738;
        }

        @k
        public final String toString() {
            return "NavigateHome";
        }
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$NavigateToAuth;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NavigateToAuth implements PasswordChangeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateToAuth f257328b = new NavigateToAuth();

        private NavigateToAuth() {
        }
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$OpenPasswordRecovery;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenPasswordRecovery implements PasswordChangeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f257329b;

        public OpenPasswordRecovery(@l String str) {
            this.f257329b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenPasswordRecovery) && L.f(this.f257329b, ((OpenPasswordRecovery) obj).f257329b);
        }

        public final int hashCode() {
            String str = this.f257329b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenPasswordRecovery(login="), this.f257329b, ')');
        }
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$SaveFocusedInput;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveFocusedInput implements PasswordChangeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InputType f257330b;

        public SaveFocusedInput(@k InputType inputType) {
            this.f257330b = inputType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SaveFocusedInput) && this.f257330b == ((SaveFocusedInput) obj).f257330b;
        }

        public final int hashCode() {
            return this.f257330b.hashCode();
        }

        @k
        public final String toString() {
            return "SaveFocusedInput(inputType=" + this.f257330b + ')';
        }
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$SetSessionsFlowMode;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetSessionsFlowMode implements PasswordChangeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f257331b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f257332c;

        public SetSessionsFlowMode(boolean z12, boolean z13) {
            this.f257331b = z12;
            this.f257332c = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetSessionsFlowMode)) {
                return false;
            }
            SetSessionsFlowMode setSessionsFlowMode = (SetSessionsFlowMode) obj;
            return this.f257331b == setSessionsFlowMode.f257331b && this.f257332c == setSessionsFlowMode.f257332c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f257332c) + (Boolean.hashCode(this.f257331b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetSessionsFlowMode(isSessionsFlow=");
            sb2.append(this.f257331b);
            sb2.append(", isPassportMultiProfile=");
            return r.x(sb2, this.f257332c, ')');
        }
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$ShowDialog;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowDialog implements PasswordChangeInternalAction, TrackableContent {
        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF203255e() {
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
            if (!(obj instanceof ShowDialog)) {
                return false;
            }
            ((ShowDialog) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowDialog(dialog=null)";
        }
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$ShowError;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements PasswordChangeInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f257333b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f257334c;

        public ShowError(PrintableText printableText, J.a aVar, int i12, C42822w c42822w) {
            if ((i12 & 2) != 0) {
                J.a.f90383b.getClass();
                aVar = J.a.C2676a.d();
            }
            this.f257333b = printableText;
            this.f257334c = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF203255e() {
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
            if (!(obj instanceof ShowError)) {
                return false;
            }
            ShowError showError = (ShowError) obj;
            return L.f(this.f257333b, showError.f257333b) && L.f(this.f257334c, showError.f257334c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF203249d() {
            return this.f257334c;
        }

        public final int hashCode() {
            return this.f257334c.f90384a.hashCode() + (this.f257333b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowError(message=" + this.f257333b + ", failure=" + this.f257334c + ')';
        }
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$ShowLoading;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements PasswordChangeInternalAction {
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$ToggleOldPasswordHidden;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleOldPasswordHidden implements PasswordChangeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f257335b;

        public ToggleOldPasswordHidden(boolean z12) {
            this.f257335b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleOldPasswordHidden) && this.f257335b == ((ToggleOldPasswordHidden) obj).f257335b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f257335b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ToggleOldPasswordHidden(isHidden="), this.f257335b, ')');
        }
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$UpdateNewPassword;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateNewPassword implements PasswordChangeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f257336b;

        public UpdateNewPassword(@k String str) {
            this.f257336b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateNewPassword) && L.f(this.f257336b, ((UpdateNewPassword) obj).f257336b);
        }

        public final int hashCode() {
            return this.f257336b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateNewPassword(text="), this.f257336b, ')');
        }
    }

    /* compiled from: PasswordChangeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction$UpdateOldPassword;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateOldPassword implements PasswordChangeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f257337b;

        public UpdateOldPassword(@k String str) {
            this.f257337b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateOldPassword) && L.f(this.f257337b, ((UpdateOldPassword) obj).f257337b);
        }

        public final int hashCode() {
            return this.f257337b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateOldPassword(text="), this.f257337b, ')');
        }
    }
}
