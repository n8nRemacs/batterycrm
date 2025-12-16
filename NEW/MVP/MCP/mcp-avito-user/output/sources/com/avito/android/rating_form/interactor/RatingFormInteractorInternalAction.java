package com.avito.android.rating_form.interactor;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.StepIdentifier;
import com.avito.android.rating_form.ToastInfo;
import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import com.avito.android.rating_form.step.dialog.DialogInfo;
import com.avito.android.rating_form.step.validations.ValidationInfo;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormInteractorInternalAction.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseForm", "Dialog", "Done", "DonePseudoStep", "DoneWithToast", "DraftCreated", "Empty", "Error", "Info", "OpenDeeplink", "RequestFieldFocus", "SelectItem", "SetFinishButtonState", "ShowErrorToast", "StartClosing", "Step", "StepsList", "Update", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$CloseForm;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$Dialog;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$Done;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$DonePseudoStep;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$DoneWithToast;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$DraftCreated;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$Empty;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$Error;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$Info;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$OpenDeeplink;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$RequestFieldFocus;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$SelectItem;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$SetFinishButtonState;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$ShowErrorToast;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$StartClosing;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$Step;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$StepsList;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$Update;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface RatingFormInteractorInternalAction extends n {

    /* compiled from: RatingFormInteractorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$CloseForm;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseForm implements RatingFormInteractorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f248166b;

        public CloseForm(boolean z12) {
            this.f248166b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseForm) && this.f248166b == ((CloseForm) obj).f248166b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f248166b);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("CloseForm(withUpdate="), this.f248166b, ')');
        }
    }

    /* compiled from: RatingFormInteractorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$Dialog;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Dialog implements RatingFormInteractorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DialogInfo f248167b;

        public Dialog(@Y61.k DialogInfo dialogInfo) {
            this.f248167b = dialogInfo;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && L.f(this.f248167b, ((Dialog) obj).f248167b);
        }

        public final int hashCode() {
            return this.f248167b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Dialog(dialogInfo=" + this.f248167b + ')';
        }
    }

    /* compiled from: RatingFormInteractorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$Done;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Done implements RatingFormInteractorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f248168b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f248169c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f248170d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f248171e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final DeepLink f248172f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f248173g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f248174h;

        public Done() {
            this(false, null, null, null, null, false, null, 127, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Done)) {
                return false;
            }
            Done done = (Done) obj;
            return this.f248168b == done.f248168b && L.f(this.f248169c, done.f248169c) && L.f(this.f248170d, done.f248170d) && L.f(this.f248171e, done.f248171e) && L.f(this.f248172f, done.f248172f) && this.f248173g == done.f248173g && L.f(this.f248174h, done.f248174h);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f248168b) * 31;
            String str = this.f248169c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f248170d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f248171e;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            DeepLink deepLink = this.f248172f;
            int i12 = r.i((iHashCode4 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f248173g);
            String str4 = this.f248174h;
            return i12 + (str4 != null ? str4.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Done(wasOpenedFromPush=");
            sb2.append(this.f248168b);
            sb2.append(", closeMessage=");
            sb2.append(this.f248169c);
            sb2.append(", closeDescription=");
            sb2.append(this.f248170d);
            sb2.append(", closeButtonTitle=");
            sb2.append(this.f248171e);
            sb2.append(", closeButtonUri=");
            sb2.append(this.f248172f);
            sb2.append(", refreshScreen=");
            sb2.append(this.f248173g);
            sb2.append(", publishedRatingUserKey=");
            return C22026a.c(sb2, this.f248174h, ')');
        }

        public Done(boolean z12, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l DeepLink deepLink, boolean z13, @Y61.l String str4) {
            this.f248168b = z12;
            this.f248169c = str;
            this.f248170d = str2;
            this.f248171e = str3;
            this.f248172f = deepLink;
            this.f248173g = z13;
            this.f248174h = str4;
        }

        public /* synthetic */ Done(boolean z12, String str, String str2, String str3, DeepLink deepLink, boolean z13, String str4, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : deepLink, (i12 & 32) == 0 ? z13 : false, (i12 & 64) != 0 ? null : str4);
        }
    }

    /* compiled from: RatingFormInteractorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$DonePseudoStep;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DonePseudoStep implements RatingFormInteractorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AttributedText f248175b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final List<RatingFormAddValueType.DoneButton> f248176c;

        public DonePseudoStep(@Y61.k AttributedText attributedText, @Y61.l List<RatingFormAddValueType.DoneButton> list) {
            this.f248175b = attributedText;
            this.f248176c = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DonePseudoStep)) {
                return false;
            }
            DonePseudoStep donePseudoStep = (DonePseudoStep) obj;
            return L.f(this.f248175b, donePseudoStep.f248175b) && L.f(this.f248176c, donePseudoStep.f248176c);
        }

        public final int hashCode() {
            int iHashCode = this.f248175b.hashCode() * 31;
            List<RatingFormAddValueType.DoneButton> list = this.f248176c;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DonePseudoStep(content=");
            sb2.append(this.f248175b);
            sb2.append(", buttons=");
            return H.p(sb2, this.f248176c, ')');
        }
    }

    /* compiled from: RatingFormInteractorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$DoneWithToast;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DoneWithToast implements RatingFormInteractorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ToastInfo f248177b;

        public DoneWithToast(@Y61.k ToastInfo toastInfo) {
            this.f248177b = toastInfo;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DoneWithToast) && L.f(this.f248177b, ((DoneWithToast) obj).f248177b);
        }

        public final int hashCode() {
            return this.f248177b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "DoneWithToast(toastInfo=" + this.f248177b + ')';
        }
    }

    /* compiled from: RatingFormInteractorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$DraftCreated;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DraftCreated implements RatingFormInteractorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f248178b;

        public DraftCreated(int i12) {
            this.f248178b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DraftCreated) && this.f248178b == ((DraftCreated) obj).f248178b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f248178b);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("DraftCreated(draftId="), this.f248178b, ')');
        }
    }

    /* compiled from: RatingFormInteractorInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$Empty;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Empty implements RatingFormInteractorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Empty f248179b = new Empty();

        private Empty() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return -297315410;
        }

        @Y61.k
        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: RatingFormInteractorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$Error;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements RatingFormInteractorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ApiException f248180b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final StepIdentifier f248181c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final List<com.avito.android.rating_form.api.remote.model.a> f248182d;

        public Error(@Y61.k ApiException apiException, @Y61.l StepIdentifier stepIdentifier, @Y61.k List list) {
            this.f248180b = apiException;
            this.f248181c = stepIdentifier;
            this.f248182d = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.f248180b.equals(error.f248180b) && L.f(this.f248181c, error.f248181c) && L.f(this.f248182d, error.f248182d);
        }

        public final int hashCode() {
            int iHashCode = this.f248180b.hashCode() * 31;
            StepIdentifier stepIdentifier = this.f248181c;
            return this.f248182d.hashCode() + ((iHashCode + (stepIdentifier == null ? 0 : stepIdentifier.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(throwable=");
            sb2.append(this.f248180b);
            sb2.append(", failedStepIdentifier=");
            sb2.append(this.f248181c);
            sb2.append(", failedCommands=");
            return H.p(sb2, this.f248182d, ')');
        }
    }

    /* compiled from: RatingFormInteractorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$OpenDeeplink;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements RatingFormInteractorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f248189b;

        public OpenDeeplink(@Y61.k DeepLink deepLink) {
            this.f248189b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f248189b, ((OpenDeeplink) obj).f248189b);
        }

        public final int hashCode() {
            return this.f248189b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f248189b, ')');
        }
    }

    /* compiled from: RatingFormInteractorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$RequestFieldFocus;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestFieldFocus implements RatingFormInteractorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f248190b;

        public RequestFieldFocus(long j12) {
            this.f248190b = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RequestFieldFocus) && this.f248190b == ((RequestFieldFocus) obj).f248190b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f248190b);
        }

        @Y61.k
        public final String toString() {
            return r.u(new StringBuilder("RequestFieldFocus(fieldId="), this.f248190b, ')');
        }
    }

    /* compiled from: RatingFormInteractorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$SelectItem;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectItem implements RatingFormInteractorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final RatingFormArguments f248191b;

        /* renamed from: c, reason: collision with root package name */
        public final int f248192c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final StepIdentifier f248193d;

        public SelectItem(@Y61.k RatingFormArguments ratingFormArguments, int i12, @Y61.k StepIdentifier stepIdentifier) {
            this.f248191b = ratingFormArguments;
            this.f248192c = i12;
            this.f248193d = stepIdentifier;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectItem)) {
                return false;
            }
            SelectItem selectItem = (SelectItem) obj;
            return L.f(this.f248191b, selectItem.f248191b) && this.f248192c == selectItem.f248192c && L.f(this.f248193d, selectItem.f248193d);
        }

        public final int hashCode() {
            return this.f248193d.hashCode() + r.e(this.f248192c, this.f248191b.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            return "SelectItem(formArguments=" + this.f248191b + ", draftId=" + this.f248192c + ", stepIdentifier=" + this.f248193d + ')';
        }
    }

    /* compiled from: RatingFormInteractorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$SetFinishButtonState;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetFinishButtonState implements RatingFormInteractorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f248194b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ArrayList f248195c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final AttributedText f248196d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f248197e;

        public SetFinishButtonState(@Y61.l String str, @Y61.k ArrayList arrayList, @Y61.l AttributedText attributedText, boolean z12) {
            this.f248194b = str;
            this.f248195c = arrayList;
            this.f248196d = attributedText;
            this.f248197e = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetFinishButtonState)) {
                return false;
            }
            SetFinishButtonState setFinishButtonState = (SetFinishButtonState) obj;
            return L.f(this.f248194b, setFinishButtonState.f248194b) && this.f248195c.equals(setFinishButtonState.f248195c) && L.f(this.f248196d, setFinishButtonState.f248196d) && this.f248197e == setFinishButtonState.f248197e;
        }

        public final int hashCode() {
            String str = this.f248194b;
            int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f248195c, (str == null ? 0 : str.hashCode()) * 31, 31);
            AttributedText attributedText = this.f248196d;
            return Boolean.hashCode(true) + r.i((iG2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31, 31, this.f248197e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetFinishButtonState(buttonText=");
            sb2.append(this.f248194b);
            sb2.append(", buttons=");
            sb2.append(this.f248195c);
            sb2.append(", disclaimer=");
            sb2.append(this.f248196d);
            sb2.append(", isLoading=");
            return r.s(", isEnabled=true)", sb2, this.f248197e);
        }
    }

    /* compiled from: RatingFormInteractorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$ShowErrorToast;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast implements RatingFormInteractorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final StepIdentifier f248198b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final PrintableText f248199c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final List<com.avito.android.rating_form.api.remote.model.a> f248200d;

        public ShowErrorToast() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowErrorToast)) {
                return false;
            }
            ShowErrorToast showErrorToast = (ShowErrorToast) obj;
            return L.f(this.f248198b, showErrorToast.f248198b) && L.f(this.f248199c, showErrorToast.f248199c) && L.f(this.f248200d, showErrorToast.f248200d);
        }

        public final int hashCode() {
            StepIdentifier stepIdentifier = this.f248198b;
            int iHashCode = (stepIdentifier == null ? 0 : stepIdentifier.hashCode()) * 31;
            PrintableText printableText = this.f248199c;
            int iHashCode2 = (iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31;
            List<com.avito.android.rating_form.api.remote.model.a> list = this.f248200d;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowErrorToast(stepIdentifier=");
            sb2.append(this.f248198b);
            sb2.append(", text=");
            sb2.append(this.f248199c);
            sb2.append(", failedCommands=");
            return H.p(sb2, this.f248200d, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ShowErrorToast(@Y61.l StepIdentifier stepIdentifier, @Y61.l PrintableText printableText, @Y61.l List<? extends com.avito.android.rating_form.api.remote.model.a> list) {
            this.f248198b = stepIdentifier;
            this.f248199c = printableText;
            this.f248200d = list;
        }

        public /* synthetic */ ShowErrorToast(StepIdentifier stepIdentifier, PrintableText printableText, List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : stepIdentifier, (i12 & 2) != 0 ? null : printableText, (i12 & 4) != 0 ? null : list);
        }
    }

    /* compiled from: RatingFormInteractorInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$StartClosing;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartClosing implements RatingFormInteractorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final StartClosing f248201b = new StartClosing();

        private StartClosing() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof StartClosing);
        }

        public final int hashCode() {
            return -183742350;
        }

        @Y61.k
        public final String toString() {
            return "StartClosing";
        }
    }

    /* compiled from: RatingFormInteractorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$Step;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Step implements RatingFormInteractorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final RatingFormArguments f248202b;

        /* renamed from: c, reason: collision with root package name */
        public final int f248203c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final StepIdentifier f248204d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f248205e;

        public Step(@Y61.k RatingFormArguments ratingFormArguments, int i12, @Y61.k StepIdentifier stepIdentifier, @Y61.k String str) {
            this.f248202b = ratingFormArguments;
            this.f248203c = i12;
            this.f248204d = stepIdentifier;
            this.f248205e = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Step)) {
                return false;
            }
            Step step = (Step) obj;
            return L.f(this.f248202b, step.f248202b) && this.f248203c == step.f248203c && L.f(this.f248204d, step.f248204d) && L.f(this.f248205e, step.f248205e);
        }

        public final int hashCode() {
            return this.f248205e.hashCode() + ((this.f248204d.hashCode() + r.e(this.f248203c, this.f248202b.hashCode() * 31, 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Step(formArguments=");
            sb2.append(this.f248202b);
            sb2.append(", draftId=");
            sb2.append(this.f248203c);
            sb2.append(", stepIdentifier=");
            sb2.append(this.f248204d);
            sb2.append(", suffix=");
            return C22026a.c(sb2, this.f248205e, ')');
        }
    }

    /* compiled from: RatingFormInteractorInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$StepsList;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StepsList implements RatingFormInteractorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final StepsList f248206b = new StepsList();

        private StepsList() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof StepsList);
        }

        public final int hashCode() {
            return -1275608506;
        }

        @Y61.k
        public final String toString() {
            return "StepsList";
        }
    }

    /* compiled from: RatingFormInteractorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$Update;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Update implements RatingFormInteractorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Boolean f248207b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Map<FieldIdentifier, ValidationInfo> f248208c;

        /* JADX WARN: Multi-variable type inference failed */
        public Update() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Update)) {
                return false;
            }
            Update update = (Update) obj;
            return L.f(this.f248207b, update.f248207b) && L.f(this.f248208c, update.f248208c);
        }

        public final int hashCode() {
            Boolean bool = this.f248207b;
            return this.f248208c.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Update(needDisableFields=");
            sb2.append(this.f248207b);
            sb2.append(", failedValidationList=");
            return r.w(sb2, this.f248208c, ')');
        }

        public Update(@Y61.k Map map, @Y61.l Boolean bool) {
            this.f248207b = bool;
            this.f248208c = map;
        }

        public /* synthetic */ Update(Boolean bool, Map map, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? P0.c() : map, (i12 & 1) != 0 ? null : bool);
        }
    }

    /* compiled from: RatingFormInteractorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction$Info;", "Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Info implements RatingFormInteractorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f248183b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f248184c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f248185d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final DeepLink f248186e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final UniversalImage f248187f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f248188g;

        public Info(@Y61.l DeepLink deepLink, @Y61.l UniversalImage universalImage, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
            this.f248183b = str;
            this.f248184c = str2;
            this.f248185d = str3;
            this.f248186e = deepLink;
            this.f248187f = universalImage;
            this.f248188g = str4;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return L.f(this.f248183b, info.f248183b) && L.f(this.f248184c, info.f248184c) && L.f(this.f248185d, info.f248185d) && L.f(this.f248186e, info.f248186e) && L.f(this.f248187f, info.f248187f) && L.f(this.f248188g, info.f248188g);
        }

        public final int hashCode() {
            int iHashCode = this.f248183b.hashCode() * 31;
            String str = this.f248184c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f248185d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeepLink deepLink = this.f248186e;
            int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            UniversalImage universalImage = this.f248187f;
            int iHashCode5 = (iHashCode4 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
            String str3 = this.f248188g;
            return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Info(title=");
            sb2.append(this.f248183b);
            sb2.append(", message=");
            sb2.append(this.f248184c);
            sb2.append(", buttonText=");
            sb2.append(this.f248185d);
            sb2.append(", buttonUrl=");
            sb2.append(this.f248186e);
            sb2.append(", image=");
            sb2.append(this.f248187f);
            sb2.append(", publishedRatingUserKey=");
            return C22026a.c(sb2, this.f248188g, ')');
        }

        public /* synthetic */ Info(String str, String str2, String str3, DeepLink deepLink, UniversalImage universalImage, String str4, int i12, C42822w c42822w) {
            this(deepLink, universalImage, str, str2, str3, (i12 & 32) != 0 ? null : str4);
        }
    }
}
