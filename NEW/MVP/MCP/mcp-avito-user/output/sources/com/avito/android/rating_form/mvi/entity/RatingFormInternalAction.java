package com.avito.android.rating_form.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import ch0.InterfaceC27196b;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.StepIdentifier;
import com.avito.android.rating_form.ToastInfo;
import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import com.avito.android.rating_form.api.remote.model.a;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormInternalAction.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "CloseForm", "DonePseudoStep", "DoneWithToast", "DraftCreated", "Empty", "Error", "FinishWithResult", "Info", "Loading", "SelectItem", "ShowProgress", "Step", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$Back;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$CloseForm;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$DonePseudoStep;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$DoneWithToast;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$DraftCreated;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$Empty;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$Error;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$FinishWithResult;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$Info;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$Loading;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$SelectItem;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$ShowProgress;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$Step;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface RatingFormInternalAction extends n {

    /* compiled from: RatingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$CloseForm;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseForm implements RatingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f248712b;

        public CloseForm(boolean z12) {
            this.f248712b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseForm) && this.f248712b == ((CloseForm) obj).f248712b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f248712b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CloseForm(withUpdate="), this.f248712b, ')');
        }
    }

    /* compiled from: RatingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$DonePseudoStep;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DonePseudoStep implements RatingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f248713b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final List<RatingFormAddValueType.DoneButton> f248714c;

        public DonePseudoStep(@k AttributedText attributedText, @l List<RatingFormAddValueType.DoneButton> list) {
            this.f248713b = attributedText;
            this.f248714c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DonePseudoStep)) {
                return false;
            }
            DonePseudoStep donePseudoStep = (DonePseudoStep) obj;
            return L.f(this.f248713b, donePseudoStep.f248713b) && L.f(this.f248714c, donePseudoStep.f248714c);
        }

        public final int hashCode() {
            int iHashCode = this.f248713b.hashCode() * 31;
            List<RatingFormAddValueType.DoneButton> list = this.f248714c;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DonePseudoStep(content=");
            sb2.append(this.f248713b);
            sb2.append(", buttons=");
            return H.p(sb2, this.f248714c, ')');
        }
    }

    /* compiled from: RatingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$DoneWithToast;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DoneWithToast implements RatingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ToastInfo f248715b;

        public DoneWithToast(@k ToastInfo toastInfo) {
            this.f248715b = toastInfo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DoneWithToast) && L.f(this.f248715b, ((DoneWithToast) obj).f248715b);
        }

        public final int hashCode() {
            return this.f248715b.hashCode();
        }

        @k
        public final String toString() {
            return "DoneWithToast(toastInfo=" + this.f248715b + ')';
        }
    }

    /* compiled from: RatingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$DraftCreated;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DraftCreated implements RatingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f248716b;

        public DraftCreated(int i12) {
            this.f248716b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DraftCreated) && this.f248716b == ((DraftCreated) obj).f248716b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f248716b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("DraftCreated(draftId="), this.f248716b, ')');
        }
    }

    /* compiled from: RatingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$Empty;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Empty implements RatingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Empty f248717b = new Empty();

        private Empty() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return 2041060637;
        }

        @k
        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: RatingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$Error;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements RatingFormInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f248718b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final StepIdentifier f248719c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<a> f248720d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final J.a f248721e;

        public Error(@k ApiException apiException, @l StepIdentifier stepIdentifier, @k List list) {
            this.f248718b = apiException;
            this.f248719c = stepIdentifier;
            this.f248720d = list;
            this.f248721e = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF294761d() {
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
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.f248718b.equals(error.f248718b) && L.f(this.f248719c, error.f248719c) && L.f(this.f248720d, error.f248720d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF320807c() {
            return this.f248721e;
        }

        public final int hashCode() {
            int iHashCode = this.f248718b.hashCode() * 31;
            StepIdentifier stepIdentifier = this.f248719c;
            return this.f248720d.hashCode() + ((iHashCode + (stepIdentifier == null ? 0 : stepIdentifier.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(throwable=");
            sb2.append(this.f248718b);
            sb2.append(", failedStepIdentifier=");
            sb2.append(this.f248719c);
            sb2.append(", failedCommands=");
            return H.p(sb2, this.f248720d, ')');
        }
    }

    /* compiled from: RatingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$FinishWithResult;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishWithResult implements RatingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f248722b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f248723c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f248724d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f248725e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final DeepLink f248726f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f248727g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f248728h;

        public FinishWithResult() {
            this(false, null, null, null, null, false, null, 127, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FinishWithResult)) {
                return false;
            }
            FinishWithResult finishWithResult = (FinishWithResult) obj;
            return this.f248722b == finishWithResult.f248722b && L.f(this.f248723c, finishWithResult.f248723c) && L.f(this.f248724d, finishWithResult.f248724d) && L.f(this.f248725e, finishWithResult.f248725e) && L.f(this.f248726f, finishWithResult.f248726f) && this.f248727g == finishWithResult.f248727g && L.f(this.f248728h, finishWithResult.f248728h);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f248722b) * 31;
            String str = this.f248723c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f248724d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f248725e;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            DeepLink deepLink = this.f248726f;
            int i12 = r.i((iHashCode4 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f248727g);
            String str4 = this.f248728h;
            return i12 + (str4 != null ? str4.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FinishWithResult(wasOpenedFromPush=");
            sb2.append(this.f248722b);
            sb2.append(", closeMessage=");
            sb2.append(this.f248723c);
            sb2.append(", closeDescription=");
            sb2.append(this.f248724d);
            sb2.append(", closeButtonTitle=");
            sb2.append(this.f248725e);
            sb2.append(", closeButtonUri=");
            sb2.append(this.f248726f);
            sb2.append(", refreshScreen=");
            sb2.append(this.f248727g);
            sb2.append(", publishedRatingUserKey=");
            return C22026a.c(sb2, this.f248728h, ')');
        }

        public FinishWithResult(boolean z12, @l String str, @l String str2, @l String str3, @l DeepLink deepLink, boolean z13, @l String str4) {
            this.f248722b = z12;
            this.f248723c = str;
            this.f248724d = str2;
            this.f248725e = str3;
            this.f248726f = deepLink;
            this.f248727g = z13;
            this.f248728h = str4;
        }

        public /* synthetic */ FinishWithResult(boolean z12, String str, String str2, String str3, DeepLink deepLink, boolean z13, String str4, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : deepLink, (i12 & 32) == 0 ? z13 : false, (i12 & 64) != 0 ? null : str4);
        }
    }

    /* compiled from: RatingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements RatingFormInternalAction {
    }

    /* compiled from: RatingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$SelectItem;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectItem implements RatingFormInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final RatingFormArguments f248735b;

        /* renamed from: c, reason: collision with root package name */
        public final int f248736c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final StepIdentifier f248737d;

        public SelectItem(@k RatingFormArguments ratingFormArguments, int i12, @k StepIdentifier stepIdentifier) {
            this.f248735b = ratingFormArguments;
            this.f248736c = i12;
            this.f248737d = stepIdentifier;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF294761d() {
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
            if (!(obj instanceof SelectItem)) {
                return false;
            }
            SelectItem selectItem = (SelectItem) obj;
            return L.f(this.f248735b, selectItem.f248735b) && this.f248736c == selectItem.f248736c && L.f(this.f248737d, selectItem.f248737d);
        }

        public final int hashCode() {
            return this.f248737d.hashCode() + r.e(this.f248736c, this.f248735b.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            return "SelectItem(formArguments=" + this.f248735b + ", draftId=" + this.f248736c + ", stepIdentifier=" + this.f248737d + ')';
        }
    }

    /* compiled from: RatingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$ShowProgress;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowProgress implements RatingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC27196b f248738b;

        public ShowProgress(@k InterfaceC27196b interfaceC27196b) {
            this.f248738b = interfaceC27196b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowProgress) && L.f(this.f248738b, ((ShowProgress) obj).f248738b);
        }

        public final int hashCode() {
            return this.f248738b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowProgress(toolbarProgress=" + this.f248738b + ')';
        }
    }

    /* compiled from: RatingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$Step;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Step implements RatingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final RatingFormArguments f248739b;

        /* renamed from: c, reason: collision with root package name */
        public final int f248740c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final StepIdentifier f248741d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f248742e;

        public Step(@k RatingFormArguments ratingFormArguments, int i12, @k StepIdentifier stepIdentifier, @k String str) {
            this.f248739b = ratingFormArguments;
            this.f248740c = i12;
            this.f248741d = stepIdentifier;
            this.f248742e = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Step)) {
                return false;
            }
            Step step = (Step) obj;
            return L.f(this.f248739b, step.f248739b) && this.f248740c == step.f248740c && L.f(this.f248741d, step.f248741d) && L.f(this.f248742e, step.f248742e);
        }

        public final int hashCode() {
            return this.f248742e.hashCode() + ((this.f248741d.hashCode() + r.e(this.f248740c, this.f248739b.hashCode() * 31, 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Step(formArguments=");
            sb2.append(this.f248739b);
            sb2.append(", draftId=");
            sb2.append(this.f248740c);
            sb2.append(", stepIdentifier=");
            sb2.append(this.f248741d);
            sb2.append(", suffix=");
            return C22026a.c(sb2, this.f248742e, ')');
        }
    }

    /* compiled from: RatingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$Back;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements RatingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f248709b;

        /* renamed from: c, reason: collision with root package name */
        public final int f248710c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f248711d;

        public Back(int i12, int i13, @l String str) {
            this.f248709b = i12;
            this.f248710c = i13;
            this.f248711d = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Back)) {
                return false;
            }
            Back back = (Back) obj;
            return this.f248709b == back.f248709b && this.f248710c == back.f248710c && L.f(this.f248711d, back.f248711d);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f248710c, Integer.hashCode(this.f248709b) * 31, 31);
            String str = this.f248711d;
            return iE2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Back(entryCount=");
            sb2.append(this.f248709b);
            sb2.append(", draftId=");
            sb2.append(this.f248710c);
            sb2.append(", publishedRatingUserKey=");
            return C22026a.c(sb2, this.f248711d, ')');
        }

        public /* synthetic */ Back(int i12, int i13, String str, int i14, C42822w c42822w) {
            this(i12, i13, (i14 & 4) != 0 ? null : str);
        }
    }

    /* compiled from: RatingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction$Info;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Info implements RatingFormInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f248729b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f248730c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f248731d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final DeepLink f248732e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final UniversalImage f248733f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f248734g;

        public Info(@l DeepLink deepLink, @l UniversalImage universalImage, @k String str, @l String str2, @l String str3, @l String str4) {
            this.f248729b = str;
            this.f248730c = str2;
            this.f248731d = str3;
            this.f248732e = deepLink;
            this.f248733f = universalImage;
            this.f248734g = str4;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF294761d() {
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
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return L.f(this.f248729b, info.f248729b) && L.f(this.f248730c, info.f248730c) && L.f(this.f248731d, info.f248731d) && L.f(this.f248732e, info.f248732e) && L.f(this.f248733f, info.f248733f) && L.f(this.f248734g, info.f248734g);
        }

        public final int hashCode() {
            int iHashCode = this.f248729b.hashCode() * 31;
            String str = this.f248730c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f248731d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeepLink deepLink = this.f248732e;
            int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            UniversalImage universalImage = this.f248733f;
            int iHashCode5 = (iHashCode4 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
            String str3 = this.f248734g;
            return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Info(title=");
            sb2.append(this.f248729b);
            sb2.append(", message=");
            sb2.append(this.f248730c);
            sb2.append(", buttonText=");
            sb2.append(this.f248731d);
            sb2.append(", buttonUrl=");
            sb2.append(this.f248732e);
            sb2.append(", image=");
            sb2.append(this.f248733f);
            sb2.append(", publishedRatingUserKey=");
            return C22026a.c(sb2, this.f248734g, ')');
        }

        public /* synthetic */ Info(String str, String str2, String str3, DeepLink deepLink, UniversalImage universalImage, String str4, int i12, C42822w c42822w) {
            this(deepLink, universalImage, str, str2, str3, (i12 & 32) != 0 ? null : str4);
        }
    }
}
