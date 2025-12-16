package com.avito.android.rating_form.step.dialog.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DialogInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseDialog", "Content", "Empty", "OpenDeeplink", "OpenUrl", "ProceedSendAnyway", "ShowErrorToast", "StartAuthentication", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction$CloseDialog;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction$Content;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction$Empty;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction$OpenDeeplink;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction$OpenUrl;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction$ProceedSendAnyway;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction$ShowErrorToast;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction$StartAuthentication;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface DialogInternalAction extends n {

    /* compiled from: DialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction$CloseDialog;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseDialog implements DialogInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseDialog f249432b = new CloseDialog();

        private CloseDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseDialog);
        }

        public final int hashCode() {
            return -1132703757;
        }

        @k
        public final String toString() {
            return "CloseDialog";
        }
    }

    /* compiled from: DialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction$Content;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements DialogInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f249433b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f249434c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final ArrayList f249435d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final ArrayList f249436e;

        public Content(@l String str, @k AttributedText attributedText, @l ArrayList arrayList, @l ArrayList arrayList2) {
            this.f249433b = str;
            this.f249434c = attributedText;
            this.f249435d = arrayList;
            this.f249436e = arrayList2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f249433b, content.f249433b) && L.f(this.f249434c, content.f249434c) && L.f(this.f249435d, content.f249435d) && L.f(this.f249436e, content.f249436e);
        }

        public final int hashCode() {
            String str = this.f249433b;
            int iB2 = a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.f249434c);
            ArrayList arrayList = this.f249435d;
            int iHashCode = (iB2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
            ArrayList arrayList2 = this.f249436e;
            return iHashCode + (arrayList2 != null ? arrayList2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(title=");
            sb2.append(this.f249433b);
            sb2.append(", content=");
            sb2.append(this.f249434c);
            sb2.append(", actions=");
            sb2.append(this.f249435d);
            sb2.append(", onCloseActions=");
            return e.p(sb2, this.f249436e, ')');
        }
    }

    /* compiled from: DialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction$Empty;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Empty implements DialogInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Empty f249437b = new Empty();

        private Empty() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return 740332064;
        }

        @k
        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: DialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction$OpenDeeplink;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements DialogInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f249438b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f249438b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f249438b, ((OpenDeeplink) obj).f249438b);
        }

        public final int hashCode() {
            return this.f249438b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f249438b, ')');
        }
    }

    /* compiled from: DialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction$OpenUrl;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenUrl implements DialogInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f249439b;

        public OpenUrl(@k String str) {
            this.f249439b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && L.f(this.f249439b, ((OpenUrl) obj).f249439b);
        }

        public final int hashCode() {
            return this.f249439b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f249439b, ')');
        }
    }

    /* compiled from: DialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction$ProceedSendAnyway;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProceedSendAnyway implements DialogInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ProceedSendAnyway f249440b = new ProceedSendAnyway();

        private ProceedSendAnyway() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ProceedSendAnyway);
        }

        public final int hashCode() {
            return 279432908;
        }

        @k
        public final String toString() {
            return "ProceedSendAnyway";
        }
    }

    /* compiled from: DialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction$ShowErrorToast;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast implements DialogInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f249441b;

        /* JADX WARN: Multi-variable type inference failed */
        public ShowErrorToast() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowErrorToast) && L.f(this.f249441b, ((ShowErrorToast) obj).f249441b);
        }

        public final int hashCode() {
            PrintableText printableText = this.f249441b;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("ShowErrorToast(text="), this.f249441b, ')');
        }

        public ShowErrorToast(@l PrintableText printableText) {
            this.f249441b = printableText;
        }

        public /* synthetic */ ShowErrorToast(PrintableText printableText, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : printableText);
        }
    }

    /* compiled from: DialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction$StartAuthentication;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartAuthentication implements DialogInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StartAuthentication f249442b = new StartAuthentication();

        private StartAuthentication() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof StartAuthentication);
        }

        public final int hashCode() {
            return 285392653;
        }

        @k
        public final String toString() {
            return "StartAuthentication";
        }
    }
}
