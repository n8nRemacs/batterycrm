package com.avito.android.verification.verification_form_builder.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.inn.VerificationFormBuilderResult;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.select.Arguments;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FormBuilderInternalAction.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ApplyErrors", "BackAction", "CloseAction", "Error", "Loaded", "Loading", "SetActionLoading", "SetButtonLoading", "SetSelectValue", "ShowSelect", "ShowToast", "UpdateHidden", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$ApplyErrors;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$BackAction;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$CloseAction;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$Error;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$Loaded;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$Loading;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$SetActionLoading;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$SetButtonLoading;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$SetSelectValue;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$ShowSelect;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$ShowToast;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$UpdateHidden;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FormBuilderInternalAction extends n {

    /* compiled from: FormBuilderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$ApplyErrors;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplyErrors implements FormBuilderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, AttributedText> f325432b;

        public ApplyErrors(@k Map<String, AttributedText> map) {
            this.f325432b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplyErrors) && L.f(this.f325432b, ((ApplyErrors) obj).f325432b);
        }

        public final int hashCode() {
            return this.f325432b.hashCode();
        }

        @k
        public final String toString() {
            return r.w(new StringBuilder("ApplyErrors(errors="), this.f325432b, ')');
        }
    }

    /* compiled from: FormBuilderInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$BackAction;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BackAction implements FormBuilderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final BackAction f325433b = new BackAction();

        private BackAction() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof BackAction);
        }

        public final int hashCode() {
            return 887097420;
        }

        @k
        public final String toString() {
            return "BackAction";
        }
    }

    /* compiled from: FormBuilderInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$CloseAction;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseAction implements FormBuilderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseAction f325434b = new CloseAction();

        private CloseAction() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseAction);
        }

        public final int hashCode() {
            return -488827425;
        }

        @k
        public final String toString() {
            return "CloseAction";
        }
    }

    /* compiled from: FormBuilderInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$Error;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements FormBuilderInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f325435b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f325436c;

        public Error(@k Throwable th2) {
            this.f325435b = th2;
            this.f325436c = new J.a(th2);
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
            return (obj instanceof Error) && L.f(this.f325435b, ((Error) obj).f325435b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF315347e() {
            return this.f325436c;
        }

        public final int hashCode() {
            return this.f325435b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(throwable="), this.f325435b, ')');
        }
    }

    /* compiled from: FormBuilderInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$Loaded;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements FormBuilderInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final VerificationFormBuilderResult f325437b;

        public Loaded(@k VerificationFormBuilderResult verificationFormBuilderResult) {
            this.f325437b = verificationFormBuilderResult;
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
            return (obj instanceof Loaded) && L.f(this.f325437b, ((Loaded) obj).f325437b);
        }

        public final int hashCode() {
            return this.f325437b.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(result=" + this.f325437b + ')';
        }
    }

    /* compiled from: FormBuilderInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$Loading;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements FormBuilderInternalAction {
    }

    /* compiled from: FormBuilderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$SetActionLoading;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetActionLoading implements FormBuilderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f325438b;

        public SetActionLoading(boolean z12) {
            this.f325438b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetActionLoading) && this.f325438b == ((SetActionLoading) obj).f325438b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f325438b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SetActionLoading(isLoading="), this.f325438b, ')');
        }
    }

    /* compiled from: FormBuilderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$SetButtonLoading;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetButtonLoading implements FormBuilderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f325439b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f325440c;

        public SetButtonLoading(@k String str, boolean z12) {
            this.f325439b = str;
            this.f325440c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetButtonLoading)) {
                return false;
            }
            SetButtonLoading setButtonLoading = (SetButtonLoading) obj;
            return L.f(this.f325439b, setButtonLoading.f325439b) && this.f325440c == setButtonLoading.f325440c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f325440c) + (this.f325439b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetButtonLoading(id=");
            sb2.append(this.f325439b);
            sb2.append(", isLoading=");
            return r.x(sb2, this.f325440c, ')');
        }
    }

    /* compiled from: FormBuilderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$SetSelectValue;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetSelectValue implements FormBuilderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f325441b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<ParcelableEntity<String>> f325442c;

        /* JADX WARN: Multi-variable type inference failed */
        public SetSelectValue(@k String str, @k List<? extends ParcelableEntity<String>> list) {
            this.f325441b = str;
            this.f325442c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetSelectValue)) {
                return false;
            }
            SetSelectValue setSelectValue = (SetSelectValue) obj;
            return L.f(this.f325441b, setSelectValue.f325441b) && L.f(this.f325442c, setSelectValue.f325442c);
        }

        public final int hashCode() {
            return this.f325442c.hashCode() + (this.f325441b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetSelectValue(id=");
            sb2.append(this.f325441b);
            sb2.append(", selected=");
            return H.p(sb2, this.f325442c, ')');
        }
    }

    /* compiled from: FormBuilderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$ShowSelect;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSelect implements FormBuilderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Arguments f325443b;

        public ShowSelect(@k Arguments arguments) {
            this.f325443b = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowSelect) && L.f(this.f325443b, ((ShowSelect) obj).f325443b);
        }

        public final int hashCode() {
            return this.f325443b.hashCode();
        }

        @k
        public final String toString() {
            return c.p(new StringBuilder("ShowSelect(args="), this.f325443b, ')');
        }
    }

    /* compiled from: FormBuilderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$ShowToast;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements FormBuilderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f325444b;

        public ShowToast(@k PrintableText printableText) {
            this.f325444b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToast) && L.f(this.f325444b, ((ShowToast) obj).f325444b);
        }

        public final int hashCode() {
            return this.f325444b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("ShowToast(text="), this.f325444b, ')');
        }
    }

    /* compiled from: FormBuilderInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$UpdateHidden;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateHidden implements FormBuilderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UpdateHidden f325445b = new UpdateHidden();

        private UpdateHidden() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof UpdateHidden);
        }

        public final int hashCode() {
            return -1027599774;
        }

        @k
        public final String toString() {
            return "UpdateHidden";
        }
    }
}
