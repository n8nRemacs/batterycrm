package com.avito.android.imv_services_dialog.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.model.imv_services.ImvServices;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvServicesDialogInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/imv_services_dialog/mvi/entity/ImvServicesDialogInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeFeedbackContainerVisibility", "Content", "HandleDeeplink", "ShowToastMessage", "Lcom/avito/android/imv_services_dialog/mvi/entity/ImvServicesDialogInternalAction$ChangeFeedbackContainerVisibility;", "Lcom/avito/android/imv_services_dialog/mvi/entity/ImvServicesDialogInternalAction$Content;", "Lcom/avito/android/imv_services_dialog/mvi/entity/ImvServicesDialogInternalAction$HandleDeeplink;", "Lcom/avito/android/imv_services_dialog/mvi/entity/ImvServicesDialogInternalAction$ShowToastMessage;", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ImvServicesDialogInternalAction extends n {

    /* compiled from: ImvServicesDialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_services_dialog/mvi/entity/ImvServicesDialogInternalAction$ChangeFeedbackContainerVisibility;", "Lcom/avito/android/imv_services_dialog/mvi/entity/ImvServicesDialogInternalAction;", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeFeedbackContainerVisibility implements ImvServicesDialogInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeFeedbackContainerVisibility)) {
                return false;
            }
            ((ChangeFeedbackContainerVisibility) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + (Boolean.hashCode(false) * 31);
        }

        @k
        public final String toString() {
            return "ChangeFeedbackContainerVisibility(isFeedbackButtonsVisible=false, isFeedbackAnsweredTitleVisible=true)";
        }
    }

    /* compiled from: ImvServicesDialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_services_dialog/mvi/entity/ImvServicesDialogInternalAction$Content;", "Lcom/avito/android/imv_services_dialog/mvi/entity/ImvServicesDialogInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements ImvServicesDialogInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f170800b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ImvServices f170801c;

        public Content(@k String str, @k ImvServices imvServices) {
            this.f170800b = str;
            this.f170801c = imvServices;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF146467d() {
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
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f170800b, content.f170800b) && L.f(this.f170801c, content.f170801c);
        }

        public final int hashCode() {
            return this.f170801c.hashCode() + (this.f170800b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Content(title=" + this.f170800b + ", imvServices=" + this.f170801c + ')';
        }
    }

    /* compiled from: ImvServicesDialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_services_dialog/mvi/entity/ImvServicesDialogInternalAction$HandleDeeplink;", "Lcom/avito/android/imv_services_dialog/mvi/entity/ImvServicesDialogInternalAction;", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements ImvServicesDialogInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            ((HandleDeeplink) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "HandleDeeplink(deeplink=null)";
        }
    }

    /* compiled from: ImvServicesDialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_services_dialog/mvi/entity/ImvServicesDialogInternalAction$ShowToastMessage;", "Lcom/avito/android/imv_services_dialog/mvi/entity/ImvServicesDialogInternalAction;", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToastMessage implements ImvServicesDialogInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f170802b;

        public ShowToastMessage(@l String str) {
            this.f170802b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToastMessage) && L.f(this.f170802b, ((ShowToastMessage) obj).f170802b);
        }

        public final int hashCode() {
            String str = this.f170802b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToastMessage(message="), this.f170802b, ')');
        }
    }
}
