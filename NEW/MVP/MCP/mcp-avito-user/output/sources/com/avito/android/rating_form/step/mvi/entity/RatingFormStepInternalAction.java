package com.avito.android.rating_form.step.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import ch0.C27195a;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.TrackablePreloadedContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.step.dialog.DialogInfo;
import com.avito.android.rating_form.step.e;
import com.avito.android.rating_form.step.validations.ValidationInfo;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.select.Arguments;
import hh0.C40940b;
import ih0.InterfaceC41402a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: RatingFormStepInternalAction.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ButtonList", "ChangeRedesignDisclaimerVisibility", "Close", "Content", "Empty", "FinishButton", "OpenDeeplink", "OpenUrl", "RequestFocus", "ShowDialog", "ShowErrorToast", "ShowFilePicker", "StartAddressScreen", "StartDevelopmentScreen", "StartSelectBottomSheet", "UpdateFiles", "UpdateItems", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$ButtonList;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$ChangeRedesignDisclaimerVisibility;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$Close;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$Content;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$Empty;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$FinishButton;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$OpenDeeplink;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$OpenUrl;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$RequestFocus;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$ShowDialog;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$ShowErrorToast;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$ShowFilePicker;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$StartAddressScreen;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$StartDevelopmentScreen;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$StartSelectBottomSheet;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$UpdateFiles;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$UpdateItems;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface RatingFormStepInternalAction extends n {

    /* compiled from: RatingFormStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$ButtonList;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ButtonList implements RatingFormStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C40940b f249567b;

        public ButtonList(@k C40940b c40940b) {
            this.f249567b = c40940b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ButtonList) && L.f(this.f249567b, ((ButtonList) obj).f249567b);
        }

        public final int hashCode() {
            return this.f249567b.hashCode();
        }

        @k
        public final String toString() {
            return "ButtonList(buttonList=" + this.f249567b + ')';
        }
    }

    /* compiled from: RatingFormStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$ChangeRedesignDisclaimerVisibility;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeRedesignDisclaimerVisibility implements RatingFormStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f249568b;

        public ChangeRedesignDisclaimerVisibility(boolean z12) {
            this.f249568b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeRedesignDisclaimerVisibility) && this.f249568b == ((ChangeRedesignDisclaimerVisibility) obj).f249568b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f249568b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ChangeRedesignDisclaimerVisibility(isVisible="), this.f249568b, ')');
        }
    }

    /* compiled from: RatingFormStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$Close;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements RatingFormStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f249569b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -140873384;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: RatingFormStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$Content;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackablePreloadedContent;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements RatingFormStepInternalAction, TrackablePreloadedContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f249570b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f249571c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final LinkedHashMap f249572d;

        public Content(@k ArrayList arrayList, boolean z12, @k LinkedHashMap linkedHashMap) {
            this.f249570b = arrayList;
            this.f249571c = z12;
            this.f249572d = linkedHashMap;
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
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.f249570b.equals(content.f249570b) && this.f249571c == content.f249571c && this.f249572d.equals(content.f249572d);
        }

        public final int hashCode() {
            return this.f249572d.hashCode() + r.i(this.f249570b.hashCode() * 31, 31, this.f249571c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(data=");
            sb2.append(this.f249570b);
            sb2.append(", centerContent=");
            sb2.append(this.f249571c);
            sb2.append(", failedValidationList=");
            return h.e(sb2, this.f249572d, ')');
        }
    }

    /* compiled from: RatingFormStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$Empty;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Empty implements RatingFormStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Empty f249573b = new Empty();

        private Empty() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return -138995539;
        }

        @k
        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: RatingFormStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$FinishButton;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishButton implements RatingFormStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C27195a f249574b;

        public FinishButton(@k C27195a c27195a) {
            this.f249574b = c27195a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FinishButton) && L.f(this.f249574b, ((FinishButton) obj).f249574b);
        }

        public final int hashCode() {
            return this.f249574b.hashCode();
        }

        @k
        public final String toString() {
            return "FinishButton(finishButtonModel=" + this.f249574b + ')';
        }
    }

    /* compiled from: RatingFormStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$OpenDeeplink;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements RatingFormStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f249575b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f249575b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f249575b, ((OpenDeeplink) obj).f249575b);
        }

        public final int hashCode() {
            return this.f249575b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f249575b, ')');
        }
    }

    /* compiled from: RatingFormStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$OpenUrl;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenUrl implements RatingFormStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f249576b;

        public OpenUrl(@k String str) {
            this.f249576b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && L.f(this.f249576b, ((OpenUrl) obj).f249576b);
        }

        public final int hashCode() {
            return this.f249576b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f249576b, ')');
        }
    }

    /* compiled from: RatingFormStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$RequestFocus;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestFocus implements RatingFormStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f249577b;

        public RequestFocus(long j12) {
            this.f249577b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RequestFocus) && this.f249577b == ((RequestFocus) obj).f249577b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f249577b);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("RequestFocus(fieldId="), this.f249577b, ')');
        }
    }

    /* compiled from: RatingFormStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$ShowDialog;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowDialog implements RatingFormStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DialogInfo f249578b;

        public ShowDialog(@k DialogInfo dialogInfo) {
            this.f249578b = dialogInfo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowDialog) && L.f(this.f249578b, ((ShowDialog) obj).f249578b);
        }

        public final int hashCode() {
            return this.f249578b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowDialog(dialogInfo=" + this.f249578b + ')';
        }
    }

    /* compiled from: RatingFormStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$ShowErrorToast;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast implements RatingFormStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f249579b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final InterfaceC41402a f249580c;

        /* JADX WARN: Multi-variable type inference failed */
        public ShowErrorToast() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowErrorToast)) {
                return false;
            }
            ShowErrorToast showErrorToast = (ShowErrorToast) obj;
            return L.f(this.f249579b, showErrorToast.f249579b) && L.f(this.f249580c, showErrorToast.f249580c);
        }

        public final int hashCode() {
            PrintableText printableText = this.f249579b;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            InterfaceC41402a interfaceC41402a = this.f249580c;
            return iHashCode + (interfaceC41402a != null ? interfaceC41402a.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ShowErrorToast(text=" + this.f249579b + ", action=" + this.f249580c + ')';
        }

        public ShowErrorToast(@l PrintableText printableText, @l InterfaceC41402a interfaceC41402a) {
            this.f249579b = printableText;
            this.f249580c = interfaceC41402a;
        }

        public /* synthetic */ ShowErrorToast(PrintableText printableText, InterfaceC41402a interfaceC41402a, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : printableText, (i12 & 2) != 0 ? null : interfaceC41402a);
        }
    }

    /* compiled from: RatingFormStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$ShowFilePicker;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowFilePicker implements RatingFormStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final FieldIdentifier f249581b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<String> f249582c;

        public ShowFilePicker(@k FieldIdentifier fieldIdentifier, @k List<String> list) {
            this.f249581b = fieldIdentifier;
            this.f249582c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowFilePicker)) {
                return false;
            }
            ShowFilePicker showFilePicker = (ShowFilePicker) obj;
            return L.f(this.f249581b, showFilePicker.f249581b) && L.f(this.f249582c, showFilePicker.f249582c);
        }

        public final int hashCode() {
            return this.f249582c.hashCode() + (this.f249581b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowFilePicker(fieldIdentifier=");
            sb2.append(this.f249581b);
            sb2.append(", memeTypes=");
            return H.p(sb2, this.f249582c, ')');
        }
    }

    /* compiled from: RatingFormStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$StartAddressScreen;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartAddressScreen implements RatingFormStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f249583b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AddressParameter.ValidationRules f249584c;

        public StartAddressScreen(@l String str, @l AddressParameter.ValidationRules validationRules) {
            this.f249583b = str;
            this.f249584c = validationRules;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartAddressScreen)) {
                return false;
            }
            StartAddressScreen startAddressScreen = (StartAddressScreen) obj;
            return L.f(this.f249583b, startAddressScreen.f249583b) && L.f(this.f249584c, startAddressScreen.f249584c);
        }

        public final int hashCode() {
            String str = this.f249583b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AddressParameter.ValidationRules validationRules = this.f249584c;
            return iHashCode + (validationRules != null ? validationRules.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "StartAddressScreen(address=" + this.f249583b + ", minimalPrecision=" + this.f249584c + ')';
        }
    }

    /* compiled from: RatingFormStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$StartDevelopmentScreen;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartDevelopmentScreen implements RatingFormStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f249585b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f249586c;

        public StartDevelopmentScreen(@l Long l12, @l String str) {
            this.f249585b = l12;
            this.f249586c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartDevelopmentScreen)) {
                return false;
            }
            StartDevelopmentScreen startDevelopmentScreen = (StartDevelopmentScreen) obj;
            return L.f(this.f249585b, startDevelopmentScreen.f249585b) && L.f(this.f249586c, startDevelopmentScreen.f249586c);
        }

        public final int hashCode() {
            Long l12 = this.f249585b;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            String str = this.f249586c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("StartDevelopmentScreen(development=");
            sb2.append(this.f249585b);
            sb2.append(", displayedValue=");
            return C22026a.c(sb2, this.f249586c, ')');
        }
    }

    /* compiled from: RatingFormStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$StartSelectBottomSheet;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartSelectBottomSheet implements RatingFormStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Arguments f249587b;

        public StartSelectBottomSheet(@k Arguments arguments) {
            this.f249587b = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartSelectBottomSheet) && L.f(this.f249587b, ((StartSelectBottomSheet) obj).f249587b);
        }

        public final int hashCode() {
            return this.f249587b.hashCode();
        }

        @k
        public final String toString() {
            return c.p(new StringBuilder("StartSelectBottomSheet(arguments="), this.f249587b, ')');
        }
    }

    /* compiled from: RatingFormStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$UpdateFiles;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateFiles implements RatingFormStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final FieldIdentifier f249588b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<e> f249589c;

        public UpdateFiles(@k FieldIdentifier fieldIdentifier, @k List<e> list) {
            this.f249588b = fieldIdentifier;
            this.f249589c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateFiles)) {
                return false;
            }
            UpdateFiles updateFiles = (UpdateFiles) obj;
            return L.f(this.f249588b, updateFiles.f249588b) && L.f(this.f249589c, updateFiles.f249589c);
        }

        public final int hashCode() {
            return this.f249589c.hashCode() + (this.f249588b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateFiles(fieldIdentifier=");
            sb2.append(this.f249588b);
            sb2.append(", list=");
            return H.p(sb2, this.f249589c, ')');
        }
    }

    /* compiled from: RatingFormStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$UpdateItems;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateItems implements RatingFormStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Boolean f249590b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<FieldIdentifier, ValidationInfo> f249591c;

        /* JADX WARN: Multi-variable type inference failed */
        public UpdateItems() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateItems)) {
                return false;
            }
            UpdateItems updateItems = (UpdateItems) obj;
            return L.f(this.f249590b, updateItems.f249590b) && L.f(this.f249591c, updateItems.f249591c);
        }

        public final int hashCode() {
            Boolean bool = this.f249590b;
            return this.f249591c.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateItems(needDisableFields=");
            sb2.append(this.f249590b);
            sb2.append(", failedValidationList=");
            return r.w(sb2, this.f249591c, ')');
        }

        public UpdateItems(@k Map map, @l Boolean bool) {
            this.f249590b = bool;
            this.f249591c = map;
        }

        public /* synthetic */ UpdateItems(Boolean bool, Map map, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? P0.c() : map, (i12 & 1) != 0 ? null : bool);
        }
    }
}
