package com.avito.android.safety.password_setting.mvi.entity;

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
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PasswordSettingInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "CredentialsSaveStarted", "DisableAutofill", "Finish", "FinishContent", "FocusInput", "HighlightInput", "LoginLoaded", "ShowError", "ShowLoading", "UpdatePassword", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$Close;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$CredentialsSaveStarted;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$DisableAutofill;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$Finish;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$FinishContent;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$FocusInput;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$HighlightInput;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$LoginLoaded;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$ShowError;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$ShowLoading;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$UpdatePassword;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PasswordSettingInternalAction extends n {

    /* compiled from: PasswordSettingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$Close;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction;", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Close implements PasswordSettingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f257489b = new Close();

        private Close() {
        }
    }

    /* compiled from: PasswordSettingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$CredentialsSaveStarted;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CredentialsSaveStarted implements PasswordSettingInternalAction, TrackableContent {
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
    }

    /* compiled from: PasswordSettingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$DisableAutofill;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DisableAutofill implements PasswordSettingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DisableAutofill f257490b = new DisableAutofill();

        private DisableAutofill() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DisableAutofill);
        }

        public final int hashCode() {
            return 1799467080;
        }

        @k
        public final String toString() {
            return "DisableAutofill";
        }
    }

    /* compiled from: PasswordSettingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$Finish;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Finish implements PasswordSettingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f257491b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f257492c;

        public Finish(@k String str, @l String str2) {
            this.f257491b = str;
            this.f257492c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Finish)) {
                return false;
            }
            Finish finish = (Finish) obj;
            return L.f(this.f257491b, finish.f257491b) && L.f(this.f257492c, finish.f257492c);
        }

        public final int hashCode() {
            int iHashCode = this.f257491b.hashCode() * 31;
            String str = this.f257492c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Finish(text=");
            sb2.append(this.f257491b);
            sb2.append(", userId=");
            return C22026a.c(sb2, this.f257492c, ')');
        }
    }

    /* compiled from: PasswordSettingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$FinishContent;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishContent implements PasswordSettingInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f257493b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f257494c;

        public FinishContent(@k String str, @l String str2) {
            this.f257493b = str;
            this.f257494c = str2;
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
            if (!(obj instanceof FinishContent)) {
                return false;
            }
            FinishContent finishContent = (FinishContent) obj;
            return L.f(this.f257493b, finishContent.f257493b) && L.f(this.f257494c, finishContent.f257494c);
        }

        public final int hashCode() {
            int iHashCode = this.f257493b.hashCode() * 31;
            String str = this.f257494c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FinishContent(text=");
            sb2.append(this.f257493b);
            sb2.append(", userId=");
            return C22026a.c(sb2, this.f257494c, ')');
        }
    }

    /* compiled from: PasswordSettingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$FocusInput;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FocusInput implements PasswordSettingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FocusInput f257495b = new FocusInput();

        private FocusInput() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof FocusInput);
        }

        public final int hashCode() {
            return 2048289668;
        }

        @k
        public final String toString() {
            return "FocusInput";
        }
    }

    /* compiled from: PasswordSettingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$HighlightInput;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HighlightInput implements PasswordSettingInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f257496b;

        public HighlightInput(@k PrintableText printableText) {
            this.f257496b = printableText;
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
            return (obj instanceof HighlightInput) && L.f(this.f257496b, ((HighlightInput) obj).f257496b);
        }

        public final int hashCode() {
            return this.f257496b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("HighlightInput(password="), this.f257496b, ')');
        }
    }

    /* compiled from: PasswordSettingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$LoginLoaded;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoginLoaded implements PasswordSettingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f257497b;

        public LoginLoaded(@k String str) {
            this.f257497b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoginLoaded) && L.f(this.f257497b, ((LoginLoaded) obj).f257497b);
        }

        public final int hashCode() {
            return this.f257497b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoginLoaded(login="), this.f257497b, ')');
        }
    }

    /* compiled from: PasswordSettingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$ShowError;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements PasswordSettingInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f257498b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f257499c;

        public ShowError(PrintableText printableText, J.a aVar, int i12, C42822w c42822w) {
            if ((i12 & 2) != 0) {
                J.a.f90383b.getClass();
                aVar = J.a.C2676a.d();
            }
            this.f257498b = printableText;
            this.f257499c = aVar;
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
            if (!(obj instanceof ShowError)) {
                return false;
            }
            ShowError showError = (ShowError) obj;
            return L.f(this.f257498b, showError.f257498b) && L.f(this.f257499c, showError.f257499c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF198623c() {
            return this.f257499c;
        }

        public final int hashCode() {
            return this.f257499c.f90384a.hashCode() + (this.f257498b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowError(message=" + this.f257498b + ", failure=" + this.f257499c + ')';
        }
    }

    /* compiled from: PasswordSettingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$ShowLoading;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements PasswordSettingInternalAction {
    }

    /* compiled from: PasswordSettingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction$UpdatePassword;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePassword implements PasswordSettingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f257500b;

        public UpdatePassword(@k String str) {
            this.f257500b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePassword) && L.f(this.f257500b, ((UpdatePassword) obj).f257500b);
        }

        public final int hashCode() {
            return this.f257500b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdatePassword(text="), this.f257500b, ')');
        }
    }
}
