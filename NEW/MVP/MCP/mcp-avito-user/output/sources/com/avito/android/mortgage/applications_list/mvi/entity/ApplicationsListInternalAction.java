package com.avito.android.mortgage.applications_list.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.acceptance_dialog.model.ButtonStyle;
import com.avito.android.mortgage.api.model.ApplicationsItemModel;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationsListInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ApplicationDeleteClicked", "CloseScreen", "ContentError", "ContentLoaded", "ContentLoading", "DeleteError", "OpenDeeplink", "ShowErrorToast", "ShowMoreDialog", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$ApplicationDeleteClicked;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$CloseScreen;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$ContentError;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$ContentLoaded;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$ContentLoading;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$DeleteError;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$OpenDeeplink;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$ShowErrorToast;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$ShowMoreDialog;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ApplicationsListInternalAction extends n {

    /* compiled from: ApplicationsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$ApplicationDeleteClicked;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplicationDeleteClicked implements ApplicationsListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f198442b;

        public ApplicationDeleteClicked(@k String str) {
            this.f198442b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplicationDeleteClicked) && L.f(this.f198442b, ((ApplicationDeleteClicked) obj).f198442b);
        }

        public final int hashCode() {
            return this.f198442b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ApplicationDeleteClicked(id="), this.f198442b, ')');
        }
    }

    /* compiled from: ApplicationsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$CloseScreen;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements ApplicationsListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f198443b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return 2095536236;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: ApplicationsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$ContentError;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentError implements ApplicationsListInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f198444b;

        public ContentError(@k ApiError apiError) {
            this.f198444b = apiError;
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
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentError) && L.f(this.f198444b, ((ContentError) obj).f198444b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF247799f() {
            return new J.a(this.f198444b);
        }

        public final int hashCode() {
            return this.f198444b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ContentError(error="), this.f198444b, ')');
        }
    }

    /* compiled from: ApplicationsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$ContentLoading;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentLoading extends TrackableLoadingStarted implements ApplicationsListInternalAction {
    }

    /* compiled from: ApplicationsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$DeleteError;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeleteError implements ApplicationsListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DeleteError f198447b = new DeleteError();

        private DeleteError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DeleteError);
        }

        public final int hashCode() {
            return 792352517;
        }

        @k
        public final String toString() {
            return "DeleteError";
        }
    }

    /* compiled from: ApplicationsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$OpenDeeplink;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements ApplicationsListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f198448b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f198448b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f198448b, ((OpenDeeplink) obj).f198448b);
        }

        public final int hashCode() {
            return this.f198448b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deepLink="), this.f198448b, ')');
        }
    }

    /* compiled from: ApplicationsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$ShowErrorToast;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast implements ApplicationsListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f198449b;

        public ShowErrorToast(@k String str) {
            this.f198449b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowErrorToast) && L.f(this.f198449b, ((ShowErrorToast) obj).f198449b);
        }

        public final int hashCode() {
            return this.f198449b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToast(message="), this.f198449b, ')');
        }
    }

    /* compiled from: ApplicationsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$ShowMoreDialog;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowMoreDialog implements ApplicationsListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f198450b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f198451c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PrintableText f198452d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final PrintableText f198453e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final PrintableText f198454f;

        public ShowMoreDialog(@k String str, @k PrintableText printableText, @k PrintableText printableText2, @k PrintableText printableText3, @k PrintableText printableText4) {
            Parcelable.Creator<ButtonStyle> creator = ButtonStyle.CREATOR;
            this.f198450b = str;
            this.f198451c = printableText;
            this.f198452d = printableText2;
            this.f198453e = printableText3;
            this.f198454f = printableText4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowMoreDialog)) {
                return false;
            }
            ShowMoreDialog showMoreDialog = (ShowMoreDialog) obj;
            if (!L.f(this.f198450b, showMoreDialog.f198450b) || !this.f198451c.equals(showMoreDialog.f198451c) || !this.f198452d.equals(showMoreDialog.f198452d) || !this.f198453e.equals(showMoreDialog.f198453e)) {
                return false;
            }
            Parcelable.Creator<ButtonStyle> creator = ButtonStyle.CREATOR;
            return this.f198454f.equals(showMoreDialog.f198454f);
        }

        public final int hashCode() {
            return this.f198454f.hashCode() + ((ButtonStyle.f198196c.hashCode() + a.f(this.f198453e, a.f(this.f198452d, a.f(this.f198451c, ((this.f198450b.hashCode() * 31) - 1338494639) * 31, 31), 31), 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowMoreDialog(id=");
            sb2.append(this.f198450b);
            sb2.append(", requestKey=DELETE_MORTGAGE_APPLICATION_REQUEST_KEY, title=");
            sb2.append(this.f198451c);
            sb2.append(", description=");
            sb2.append(this.f198452d);
            sb2.append(", acceptButton=");
            sb2.append(this.f198453e);
            sb2.append(", acceptButtonStyle=");
            sb2.append(ButtonStyle.f198196c);
            sb2.append(", declineButton=");
            return c.m(sb2, this.f198454f, ')');
        }
    }

    /* compiled from: ApplicationsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$ContentLoaded;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements ApplicationsListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<ApplicationsItemModel> f198445b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f198446c;

        public ContentLoaded(@k List<ApplicationsItemModel> list, boolean z12) {
            this.f198445b = list;
            this.f198446c = z12;
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
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentLoaded)) {
                return false;
            }
            ContentLoaded contentLoaded = (ContentLoaded) obj;
            return L.f(this.f198445b, contentLoaded.f198445b) && this.f198446c == contentLoaded.f198446c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f198446c) + (this.f198445b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(applications=");
            sb2.append(this.f198445b);
            sb2.append(", initial=");
            return r.x(sb2, this.f198446c, ')');
        }

        public /* synthetic */ ContentLoaded(List list, boolean z12, int i12, C42822w c42822w) {
            this(list, (i12 & 2) != 0 ? false : z12);
        }
    }
}
