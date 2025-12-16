package com.avito.android.safety.tfa_disable_password.mvi.entity;

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

/* compiled from: TfaDisablePasswordInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Finish", "ForgotPassword", "HighlightInput", "ShowError", "ShowKeyboard", "ShowLoading", "TogglePasswordHidden", "UpdatePassword", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction$Close;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction$Finish;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction$ForgotPassword;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction$HighlightInput;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction$ShowError;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction$ShowKeyboard;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction$ShowLoading;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction$TogglePasswordHidden;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction$UpdatePassword;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TfaDisablePasswordInternalAction extends n {

    /* compiled from: TfaDisablePasswordInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction$Close;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements TfaDisablePasswordInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f258119b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1604599469;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: TfaDisablePasswordInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction$Finish;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Finish implements TfaDisablePasswordInternalAction, TrackableContent {
        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }
    }

    /* compiled from: TfaDisablePasswordInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction$ForgotPassword;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ForgotPassword implements TfaDisablePasswordInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ForgotPassword f258120b = new ForgotPassword();

        private ForgotPassword() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ForgotPassword);
        }

        public final int hashCode() {
            return -1142890013;
        }

        @k
        public final String toString() {
            return "ForgotPassword";
        }
    }

    /* compiled from: TfaDisablePasswordInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction$HighlightInput;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HighlightInput implements TfaDisablePasswordInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f258121b;

        public HighlightInput(@k PrintableText printableText) {
            this.f258121b = printableText;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
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
            return (obj instanceof HighlightInput) && L.f(this.f258121b, ((HighlightInput) obj).f258121b);
        }

        public final int hashCode() {
            return this.f258121b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("HighlightInput(password="), this.f258121b, ')');
        }
    }

    /* compiled from: TfaDisablePasswordInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction$ShowError;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements TfaDisablePasswordInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f258122b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f258123c;

        public ShowError(PrintableText printableText, J.a aVar, int i12, C42822w c42822w) {
            if ((i12 & 2) != 0) {
                J.a.f90383b.getClass();
                aVar = J.a.C2676a.d();
            }
            this.f258122b = printableText;
            this.f258123c = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
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
            return L.f(this.f258122b, showError.f258122b) && L.f(this.f258123c, showError.f258123c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF183620c() {
            return this.f258123c;
        }

        public final int hashCode() {
            return this.f258123c.f90384a.hashCode() + (this.f258122b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowError(message=" + this.f258122b + ", failure=" + this.f258123c + ')';
        }
    }

    /* compiled from: TfaDisablePasswordInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction$ShowKeyboard;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowKeyboard implements TfaDisablePasswordInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowKeyboard f258124b = new ShowKeyboard();

        private ShowKeyboard() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowKeyboard);
        }

        public final int hashCode() {
            return 1656624713;
        }

        @k
        public final String toString() {
            return "ShowKeyboard";
        }
    }

    /* compiled from: TfaDisablePasswordInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction$ShowLoading;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements TfaDisablePasswordInternalAction {
    }

    /* compiled from: TfaDisablePasswordInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction$TogglePasswordHidden;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TogglePasswordHidden implements TfaDisablePasswordInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f258125b;

        public TogglePasswordHidden(boolean z12) {
            this.f258125b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TogglePasswordHidden) && this.f258125b == ((TogglePasswordHidden) obj).f258125b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f258125b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("TogglePasswordHidden(isHidden="), this.f258125b, ')');
        }
    }

    /* compiled from: TfaDisablePasswordInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction$UpdatePassword;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePassword implements TfaDisablePasswordInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f258126b;

        public UpdatePassword(@k String str) {
            this.f258126b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePassword) && L.f(this.f258126b, ((UpdatePassword) obj).f258126b);
        }

        public final int hashCode() {
            return this.f258126b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdatePassword(text="), this.f258126b, ')');
        }
    }
}
