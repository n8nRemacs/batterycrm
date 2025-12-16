package com.avito.android.edit_seller_type.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.edit_seller_type.mvi.entity.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditSellerTypeInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "ConfirmTypeChange", "DismissDialog", "Error", "Loading", "OpenConfirmationDialog", "OpenDeeplink", "OptionSelected", "SellerTypeSaveError", "SellerTypeSaveLoading", "ShowContent", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$Close;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$ConfirmTypeChange;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$DismissDialog;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$Error;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$Loading;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$OpenConfirmationDialog;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$OpenDeeplink;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$OptionSelected;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$SellerTypeSaveError;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$SellerTypeSaveLoading;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$ShowContent;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EditSellerTypeInternalAction extends n {

    /* compiled from: EditSellerTypeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$Close;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements EditSellerTypeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f146781b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1891413281;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: EditSellerTypeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$ConfirmTypeChange;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConfirmTypeChange implements EditSellerTypeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f146782b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final c.f f146783c;

        public ConfirmTypeChange(@k String str, @k c.f fVar) {
            this.f146782b = str;
            this.f146783c = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmTypeChange)) {
                return false;
            }
            ConfirmTypeChange confirmTypeChange = (ConfirmTypeChange) obj;
            return L.f(this.f146782b, confirmTypeChange.f146782b) && L.f(this.f146783c, confirmTypeChange.f146783c);
        }

        public final int hashCode() {
            return this.f146783c.hashCode() + (this.f146782b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ConfirmTypeChange(title=" + this.f146782b + ", result=" + this.f146783c + ')';
        }
    }

    /* compiled from: EditSellerTypeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$DismissDialog;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DismissDialog implements EditSellerTypeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DismissDialog f146784b = new DismissDialog();

        private DismissDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DismissDialog);
        }

        public final int hashCode() {
            return 1499114073;
        }

        @k
        public final String toString() {
            return "DismissDialog";
        }
    }

    /* compiled from: EditSellerTypeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$Error;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements EditSellerTypeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f146785b;

        public Error(@k String str) {
            this.f146785b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f146785b, ((Error) obj).f146785b);
        }

        public final int hashCode() {
            return this.f146785b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(message="), this.f146785b, ')');
        }
    }

    /* compiled from: EditSellerTypeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$Loading;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements EditSellerTypeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f146786b = new Loading();

        private Loading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1406879645;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: EditSellerTypeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$OpenConfirmationDialog;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenConfirmationDialog implements EditSellerTypeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c.a f146787b;

        public OpenConfirmationDialog(@k c.a aVar) {
            this.f146787b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenConfirmationDialog) && L.f(this.f146787b, ((OpenConfirmationDialog) obj).f146787b);
        }

        public final int hashCode() {
            return this.f146787b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenConfirmationDialog(confirmDialogState=" + this.f146787b + ')';
        }
    }

    /* compiled from: EditSellerTypeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$OpenDeeplink;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements EditSellerTypeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f146788b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f146788b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f146788b, ((OpenDeeplink) obj).f146788b);
        }

        public final int hashCode() {
            return this.f146788b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f146788b, ')');
        }
    }

    /* compiled from: EditSellerTypeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$OptionSelected;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OptionSelected implements EditSellerTypeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c.f f146789b;

        public OptionSelected(@k c.f fVar) {
            this.f146789b = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OptionSelected) && L.f(this.f146789b, ((OptionSelected) obj).f146789b);
        }

        public final int hashCode() {
            return this.f146789b.hashCode();
        }

        @k
        public final String toString() {
            return "OptionSelected(selectedType=" + this.f146789b + ')';
        }
    }

    /* compiled from: EditSellerTypeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$SellerTypeSaveError;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SellerTypeSaveError implements EditSellerTypeInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SellerTypeSaveError)) {
                return false;
            }
            ((SellerTypeSaveError) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "SellerTypeSaveError(message=null)";
        }
    }

    /* compiled from: EditSellerTypeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$SellerTypeSaveLoading;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SellerTypeSaveLoading implements EditSellerTypeInternalAction {
        static {
            new SellerTypeSaveLoading();
        }

        private SellerTypeSaveLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SellerTypeSaveLoading);
        }

        public final int hashCode() {
            return -1252781363;
        }

        @k
        public final String toString() {
            return "SellerTypeSaveLoading";
        }
    }

    /* compiled from: EditSellerTypeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction$ShowContent;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements EditSellerTypeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c.g f146790b;

        public ShowContent(@k c.g gVar) {
            this.f146790b = gVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowContent) && L.f(this.f146790b, ((ShowContent) obj).f146790b);
        }

        public final int hashCode() {
            return this.f146790b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowContent(content=" + this.f146790b + ')';
        }
    }
}
