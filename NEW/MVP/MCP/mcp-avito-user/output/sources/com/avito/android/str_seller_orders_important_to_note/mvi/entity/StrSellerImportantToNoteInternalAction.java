package com.avito.android.str_seller_orders_important_to_note.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.str_seller_orders_important_to_note.domain.b;
import com.avito.android.str_seller_orders_important_to_note.domain.j;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerImportantToNoteInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "LaunchDeeplink", "Loading", "OpenWebView", "SendFinishResult", "ShowConfirmationBottomSheet", "ShowError", "UpdateContent", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction$Close;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction$LaunchDeeplink;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction$Loading;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction$OpenWebView;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction$SendFinishResult;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction$ShowConfirmationBottomSheet;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction$ShowError;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction$UpdateContent;", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StrSellerImportantToNoteInternalAction extends n {

    /* compiled from: StrSellerImportantToNoteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction$Close;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "<init>", "()V", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements StrSellerImportantToNoteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f291393b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 221204401;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: StrSellerImportantToNoteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction$LaunchDeeplink;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LaunchDeeplink implements StrSellerImportantToNoteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f291394b;

        public LaunchDeeplink(@k DeepLink deepLink) {
            this.f291394b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LaunchDeeplink) && L.f(this.f291394b, ((LaunchDeeplink) obj).f291394b);
        }

        public final int hashCode() {
            return this.f291394b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("LaunchDeeplink(deeplink="), this.f291394b, ')');
        }
    }

    /* compiled from: StrSellerImportantToNoteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction$Loading;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements StrSellerImportantToNoteInternalAction {
    }

    /* compiled from: StrSellerImportantToNoteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction$OpenWebView;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenWebView implements StrSellerImportantToNoteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f291395b;

        public OpenWebView(@k String str) {
            this.f291395b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenWebView) && L.f(this.f291395b, ((OpenWebView) obj).f291395b);
        }

        public final int hashCode() {
            return this.f291395b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenWebView(url="), this.f291395b, ')');
        }
    }

    /* compiled from: StrSellerImportantToNoteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction$SendFinishResult;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "<init>", "()V", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendFinishResult implements StrSellerImportantToNoteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SendFinishResult f291396b = new SendFinishResult();

        private SendFinishResult() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SendFinishResult);
        }

        public final int hashCode() {
            return -1070870817;
        }

        @k
        public final String toString() {
            return "SendFinishResult";
        }
    }

    /* compiled from: StrSellerImportantToNoteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction$ShowConfirmationBottomSheet;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowConfirmationBottomSheet implements StrSellerImportantToNoteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b f291397b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f291398c;

        public ShowConfirmationBottomSheet(@k b bVar, @k String str) {
            this.f291397b = bVar;
            this.f291398c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowConfirmationBottomSheet)) {
                return false;
            }
            ShowConfirmationBottomSheet showConfirmationBottomSheet = (ShowConfirmationBottomSheet) obj;
            return L.f(this.f291397b, showConfirmationBottomSheet.f291397b) && L.f(this.f291398c, showConfirmationBottomSheet.f291398c);
        }

        public final int hashCode() {
            return this.f291398c.hashCode() + (this.f291397b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowConfirmationBottomSheet(buttonAction=");
            sb2.append(this.f291397b);
            sb2.append(", bookingId=");
            return C22026a.c(sb2, this.f291398c, ')');
        }
    }

    /* compiled from: StrSellerImportantToNoteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction$ShowError;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements StrSellerImportantToNoteInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f291399b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ApiError f291400c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f291401d;

        public ShowError(@k PrintableText printableText, @k ApiError apiError) {
            this.f291399b = printableText;
            this.f291400c = apiError;
            this.f291401d = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF221519d() {
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
            return L.f(this.f291399b, showError.f291399b) && L.f(this.f291400c, showError.f291400c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF116421c() {
            return this.f291401d;
        }

        public final int hashCode() {
            return this.f291400c.hashCode() + (this.f291399b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowError(message=");
            sb2.append(this.f291399b);
            sb2.append(", error=");
            return c.n(sb2, this.f291400c, ')');
        }
    }

    /* compiled from: StrSellerImportantToNoteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction$UpdateContent;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateContent implements StrSellerImportantToNoteInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final j f291402b;

        public UpdateContent(@k j jVar) {
            this.f291402b = jVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF221519d() {
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
            return (obj instanceof UpdateContent) && L.f(this.f291402b, ((UpdateContent) obj).f291402b);
        }

        public final int hashCode() {
            return this.f291402b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateContent(content=" + this.f291402b + ')';
        }
    }
}
