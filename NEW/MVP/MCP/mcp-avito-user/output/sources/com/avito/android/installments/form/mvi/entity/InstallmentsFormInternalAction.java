package com.avito.android.installments.form.mvi.entity;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsFormInternalAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreenWithCancelResult", "CloseScreenWithSuccessResult", "HandleDeeplink", "LoadUrl", "OpenExternalUrl", "ShowCancellationDialog", "ShowContent", "ShowLoading", "ShowPermissionToast", "ShowPostMessageDialog", "ShowRequestFormUrlError", "ShowUnknownError", "ShowUrlWebLoadingError", "TryToOpenCamera", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$CloseScreenWithCancelResult;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$CloseScreenWithSuccessResult;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$HandleDeeplink;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$LoadUrl;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$OpenExternalUrl;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$ShowCancellationDialog;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$ShowContent;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$ShowLoading;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$ShowPermissionToast;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$ShowPostMessageDialog;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$ShowRequestFormUrlError;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$ShowUnknownError;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$ShowUrlWebLoadingError;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$TryToOpenCamera;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface InstallmentsFormInternalAction extends n {

    /* compiled from: InstallmentsFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$CloseScreenWithCancelResult;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreenWithCancelResult implements InstallmentsFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f172752b;

        public CloseScreenWithCancelResult(@k ArrayList arrayList) {
            this.f172752b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseScreenWithCancelResult) && L.f(this.f172752b, ((CloseScreenWithCancelResult) obj).f172752b);
        }

        public final int hashCode() {
            return this.f172752b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("CloseScreenWithCancelResult(onCloseActionJsonList="), this.f172752b, ')');
        }
    }

    /* compiled from: InstallmentsFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$CloseScreenWithSuccessResult;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreenWithSuccessResult implements InstallmentsFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreenWithSuccessResult f172753b = new CloseScreenWithSuccessResult();

        private CloseScreenWithSuccessResult() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreenWithSuccessResult);
        }

        public final int hashCode() {
            return -1399560233;
        }

        @k
        public final String toString() {
            return "CloseScreenWithSuccessResult";
        }
    }

    /* compiled from: InstallmentsFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$HandleDeeplink;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements InstallmentsFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f172754b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f172754b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f172754b, ((HandleDeeplink) obj).f172754b);
        }

        public final int hashCode() {
            return this.f172754b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f172754b, ')');
        }
    }

    /* compiled from: InstallmentsFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$LoadUrl;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadUrl implements InstallmentsFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f172755b;

        public LoadUrl(@k String str) {
            this.f172755b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadUrl) && L.f(this.f172755b, ((LoadUrl) obj).f172755b);
        }

        public final int hashCode() {
            return this.f172755b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadUrl(url="), this.f172755b, ')');
        }
    }

    /* compiled from: InstallmentsFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$OpenExternalUrl;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenExternalUrl implements InstallmentsFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Uri f172756b;

        public OpenExternalUrl(@k Uri uri) {
            this.f172756b = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenExternalUrl) && L.f(this.f172756b, ((OpenExternalUrl) obj).f172756b);
        }

        public final int hashCode() {
            return this.f172756b.hashCode();
        }

        @k
        public final String toString() {
            return a.t(new StringBuilder("OpenExternalUrl(url="), this.f172756b, ')');
        }
    }

    /* compiled from: InstallmentsFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$ShowCancellationDialog;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowCancellationDialog implements InstallmentsFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowCancellationDialog f172757b = new ShowCancellationDialog();

        private ShowCancellationDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowCancellationDialog);
        }

        public final int hashCode() {
            return 740453353;
        }

        @k
        public final String toString() {
            return "ShowCancellationDialog";
        }
    }

    /* compiled from: InstallmentsFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$ShowContent;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements InstallmentsFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowContent f172758b = new ShowContent();

        private ShowContent() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowContent);
        }

        public final int hashCode() {
            return -1895590021;
        }

        @k
        public final String toString() {
            return "ShowContent";
        }
    }

    /* compiled from: InstallmentsFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$ShowLoading;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoading implements InstallmentsFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowLoading f172759b = new ShowLoading();

        private ShowLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowLoading);
        }

        public final int hashCode() {
            return 1784497214;
        }

        @k
        public final String toString() {
            return "ShowLoading";
        }
    }

    /* compiled from: InstallmentsFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$ShowPermissionToast;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowPermissionToast implements InstallmentsFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowPermissionToast f172760b = new ShowPermissionToast();

        private ShowPermissionToast() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowPermissionToast);
        }

        public final int hashCode() {
            return -2004981094;
        }

        @k
        public final String toString() {
            return "ShowPermissionToast";
        }
    }

    /* compiled from: InstallmentsFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$ShowPostMessageDialog;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowPostMessageDialog implements InstallmentsFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f172761b;

        public ShowPostMessageDialog(@k String str) {
            this.f172761b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowPostMessageDialog)) {
                return false;
            }
            ShowPostMessageDialog showPostMessageDialog = (ShowPostMessageDialog) obj;
            showPostMessageDialog.getClass();
            return L.f(this.f172761b, showPostMessageDialog.f172761b);
        }

        public final int hashCode() {
            return this.f172761b.hashCode() + 1393424521;
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowPostMessageDialog(title=New Post Message 🍺, subtitle="), this.f172761b, ')');
        }
    }

    /* compiled from: InstallmentsFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$ShowRequestFormUrlError;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowRequestFormUrlError implements InstallmentsFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f172762b;

        /* JADX WARN: Multi-variable type inference failed */
        public ShowRequestFormUrlError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowRequestFormUrlError) && L.f(this.f172762b, ((ShowRequestFormUrlError) obj).f172762b);
        }

        public final int hashCode() {
            String str = this.f172762b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowRequestFormUrlError(requestUrl="), this.f172762b, ')');
        }

        public ShowRequestFormUrlError(@l String str) {
            this.f172762b = str;
        }

        public /* synthetic */ ShowRequestFormUrlError(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: InstallmentsFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$ShowUnknownError;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowUnknownError implements InstallmentsFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowUnknownError f172763b = new ShowUnknownError();

        private ShowUnknownError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowUnknownError);
        }

        public final int hashCode() {
            return 1548845596;
        }

        @k
        public final String toString() {
            return "ShowUnknownError";
        }
    }

    /* compiled from: InstallmentsFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$ShowUrlWebLoadingError;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowUrlWebLoadingError implements InstallmentsFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f172764b;

        /* JADX WARN: Multi-variable type inference failed */
        public ShowUrlWebLoadingError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowUrlWebLoadingError) && L.f(this.f172764b, ((ShowUrlWebLoadingError) obj).f172764b);
        }

        public final int hashCode() {
            String str = this.f172764b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowUrlWebLoadingError(formUrl="), this.f172764b, ')');
        }

        public ShowUrlWebLoadingError(@l String str) {
            this.f172764b = str;
        }

        public /* synthetic */ ShowUrlWebLoadingError(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: InstallmentsFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction$TryToOpenCamera;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TryToOpenCamera implements InstallmentsFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ValueCallback<Uri[]> f172765b;

        public TryToOpenCamera(@l ValueCallback<Uri[]> valueCallback) {
            this.f172765b = valueCallback;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TryToOpenCamera) && L.f(this.f172765b, ((TryToOpenCamera) obj).f172765b);
        }

        public final int hashCode() {
            ValueCallback<Uri[]> valueCallback = this.f172765b;
            if (valueCallback == null) {
                return 0;
            }
            return valueCallback.hashCode();
        }

        @k
        public final String toString() {
            return "TryToOpenCamera(filePathCallback=" + this.f172765b + ')';
        }
    }
}
