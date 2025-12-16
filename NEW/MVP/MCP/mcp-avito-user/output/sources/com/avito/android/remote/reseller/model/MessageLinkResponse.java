package com.avito.android.remote.reseller.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.early_access.remote.model.EarlyAccessModal;
import com.avito.android.remote.model.auto_contact_models.ContactPackageModal;
import com.avito.android.remote.model.auto_contact_models.SpendContactPopUp;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import yl0.InterfaceC50264b;

/* compiled from: MessageLinkResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/reseller/model/MessageLinkResponse;", "Landroid/os/Parcelable;", "BuyContact", "EarlyAccessResponse", "OpenLink", "SpendContact", "Lcom/avito/android/remote/reseller/model/MessageLinkResponse$BuyContact;", "Lcom/avito/android/remote/reseller/model/MessageLinkResponse$EarlyAccessResponse;", "Lcom/avito/android/remote/reseller/model/MessageLinkResponse$OpenLink;", "Lcom/avito/android/remote/reseller/model/MessageLinkResponse$SpendContact;", "_avito-discouraged_avito-api_auto-reseller"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface MessageLinkResponse extends Parcelable {

    /* compiled from: MessageLinkResponse.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/reseller/model/MessageLinkResponse$BuyContact;", "Lcom/avito/android/remote/reseller/model/MessageLinkResponse;", "Lcom/avito/android/remote/model/auto_contact_models/ContactPackageModal;", "contactPackageModal", "<init>", "(Lcom/avito/android/remote/model/auto_contact_models/ContactPackageModal;)V", "Lcom/avito/android/remote/model/auto_contact_models/ContactPackageModal;", "c", "()Lcom/avito/android/remote/model/auto_contact_models/ContactPackageModal;", "_avito-discouraged_avito-api_auto-reseller"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuyContact implements MessageLinkResponse {

        @k
        public static final Parcelable.Creator<BuyContact> CREATOR = new a();

        @c("contactPackageModal")
        @k
        private final ContactPackageModal contactPackageModal;

        /* compiled from: MessageLinkResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BuyContact> {
            @Override // android.os.Parcelable.Creator
            public final BuyContact createFromParcel(Parcel parcel) {
                return new BuyContact((ContactPackageModal) parcel.readParcelable(BuyContact.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final BuyContact[] newArray(int i12) {
                return new BuyContact[i12];
            }
        }

        public BuyContact(@k ContactPackageModal contactPackageModal) {
            this.contactPackageModal = contactPackageModal;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final ContactPackageModal getContactPackageModal() {
            return this.contactPackageModal;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BuyContact) && L.f(this.contactPackageModal, ((BuyContact) obj).contactPackageModal);
        }

        public final int hashCode() {
            return this.contactPackageModal.hashCode();
        }

        @k
        public final String toString() {
            return "BuyContact(contactPackageModal=" + this.contactPackageModal + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.contactPackageModal, i12);
        }
    }

    /* compiled from: MessageLinkResponse.kt */
    @d
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/reseller/model/MessageLinkResponse$EarlyAccessResponse;", "Lcom/avito/android/remote/reseller/model/MessageLinkResponse;", "Lyl0/b;", "Lcom/avito/android/remote/reseller/model/NotificationToast;", "notificationToast", "Lcom/avito/android/early_access/remote/model/EarlyAccessModal;", "earlyAccessModal", "<init>", "(Lcom/avito/android/remote/reseller/model/NotificationToast;Lcom/avito/android/early_access/remote/model/EarlyAccessModal;)V", "Lcom/avito/android/remote/reseller/model/NotificationToast;", "getNotificationToast", "()Lcom/avito/android/remote/reseller/model/NotificationToast;", "Lcom/avito/android/early_access/remote/model/EarlyAccessModal;", "c", "()Lcom/avito/android/early_access/remote/model/EarlyAccessModal;", "_avito-discouraged_avito-api_auto-reseller"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EarlyAccessResponse implements MessageLinkResponse, InterfaceC50264b {

        @k
        public static final Parcelable.Creator<EarlyAccessResponse> CREATOR = new a();

        @c("earlyAccessModal")
        @k
        private final EarlyAccessModal earlyAccessModal;

        @c("notificationToast")
        @l
        private final NotificationToast notificationToast;

        /* compiled from: MessageLinkResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<EarlyAccessResponse> {
            @Override // android.os.Parcelable.Creator
            public final EarlyAccessResponse createFromParcel(Parcel parcel) {
                return new EarlyAccessResponse(parcel.readInt() == 0 ? null : NotificationToast.CREATOR.createFromParcel(parcel), (EarlyAccessModal) parcel.readParcelable(EarlyAccessResponse.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final EarlyAccessResponse[] newArray(int i12) {
                return new EarlyAccessResponse[i12];
            }
        }

        public EarlyAccessResponse(@l NotificationToast notificationToast, @k EarlyAccessModal earlyAccessModal) {
            this.notificationToast = notificationToast;
            this.earlyAccessModal = earlyAccessModal;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final EarlyAccessModal getEarlyAccessModal() {
            return this.earlyAccessModal;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EarlyAccessResponse)) {
                return false;
            }
            EarlyAccessResponse earlyAccessResponse = (EarlyAccessResponse) obj;
            return L.f(this.notificationToast, earlyAccessResponse.notificationToast) && L.f(this.earlyAccessModal, earlyAccessResponse.earlyAccessModal);
        }

        @Override // yl0.InterfaceC50264b
        @l
        public final NotificationToast getNotificationToast() {
            return this.notificationToast;
        }

        public final int hashCode() {
            NotificationToast notificationToast = this.notificationToast;
            return this.earlyAccessModal.hashCode() + ((notificationToast == null ? 0 : notificationToast.hashCode()) * 31);
        }

        @k
        public final String toString() {
            return "EarlyAccessResponse(notificationToast=" + this.notificationToast + ", earlyAccessModal=" + this.earlyAccessModal + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            NotificationToast notificationToast = this.notificationToast;
            if (notificationToast == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                notificationToast.writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.earlyAccessModal, i12);
        }
    }

    /* compiled from: MessageLinkResponse.kt */
    @d
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/reseller/model/MessageLinkResponse$OpenLink;", "Lcom/avito/android/remote/reseller/model/MessageLinkResponse;", "Lyl0/b;", "Lcom/avito/android/remote/reseller/model/NotificationToast;", "notificationToast", "Lcom/avito/android/remote/reseller/model/Action;", "action", "<init>", "(Lcom/avito/android/remote/reseller/model/NotificationToast;Lcom/avito/android/remote/reseller/model/Action;)V", "Lcom/avito/android/remote/reseller/model/NotificationToast;", "getNotificationToast", "()Lcom/avito/android/remote/reseller/model/NotificationToast;", "Lcom/avito/android/remote/reseller/model/Action;", "c", "()Lcom/avito/android/remote/reseller/model/Action;", "_avito-discouraged_avito-api_auto-reseller"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenLink implements MessageLinkResponse, InterfaceC50264b {

        @k
        public static final Parcelable.Creator<OpenLink> CREATOR = new a();

        @c("action")
        @k
        private final Action action;

        @c("notificationToast")
        @l
        private final NotificationToast notificationToast;

        /* compiled from: MessageLinkResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OpenLink> {
            @Override // android.os.Parcelable.Creator
            public final OpenLink createFromParcel(Parcel parcel) {
                return new OpenLink(parcel.readInt() == 0 ? null : NotificationToast.CREATOR.createFromParcel(parcel), Action.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final OpenLink[] newArray(int i12) {
                return new OpenLink[i12];
            }
        }

        public OpenLink(@l NotificationToast notificationToast, @k Action action) {
            this.notificationToast = notificationToast;
            this.action = action;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenLink)) {
                return false;
            }
            OpenLink openLink = (OpenLink) obj;
            return L.f(this.notificationToast, openLink.notificationToast) && L.f(this.action, openLink.action);
        }

        @Override // yl0.InterfaceC50264b
        @l
        public final NotificationToast getNotificationToast() {
            return this.notificationToast;
        }

        public final int hashCode() {
            NotificationToast notificationToast = this.notificationToast;
            return this.action.hashCode() + ((notificationToast == null ? 0 : notificationToast.hashCode()) * 31);
        }

        @k
        public final String toString() {
            return "OpenLink(notificationToast=" + this.notificationToast + ", action=" + this.action + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            NotificationToast notificationToast = this.notificationToast;
            if (notificationToast == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                notificationToast.writeToParcel(parcel, i12);
            }
            this.action.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: MessageLinkResponse.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/reseller/model/MessageLinkResponse$SpendContact;", "Lcom/avito/android/remote/reseller/model/MessageLinkResponse;", "Lcom/avito/android/remote/model/auto_contact_models/SpendContactPopUp;", "spendContactPopUp", "<init>", "(Lcom/avito/android/remote/model/auto_contact_models/SpendContactPopUp;)V", "Lcom/avito/android/remote/model/auto_contact_models/SpendContactPopUp;", "c", "()Lcom/avito/android/remote/model/auto_contact_models/SpendContactPopUp;", "_avito-discouraged_avito-api_auto-reseller"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SpendContact implements MessageLinkResponse {

        @k
        public static final Parcelable.Creator<SpendContact> CREATOR = new a();

        @c("spendContactPopUp")
        @k
        private final SpendContactPopUp spendContactPopUp;

        /* compiled from: MessageLinkResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SpendContact> {
            @Override // android.os.Parcelable.Creator
            public final SpendContact createFromParcel(Parcel parcel) {
                return new SpendContact((SpendContactPopUp) parcel.readParcelable(SpendContact.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SpendContact[] newArray(int i12) {
                return new SpendContact[i12];
            }
        }

        public SpendContact(@k SpendContactPopUp spendContactPopUp) {
            this.spendContactPopUp = spendContactPopUp;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final SpendContactPopUp getSpendContactPopUp() {
            return this.spendContactPopUp;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SpendContact) && L.f(this.spendContactPopUp, ((SpendContact) obj).spendContactPopUp);
        }

        public final int hashCode() {
            return this.spendContactPopUp.hashCode();
        }

        @k
        public final String toString() {
            return "SpendContact(spendContactPopUp=" + this.spendContactPopUp + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.spendContactPopUp, i12);
        }
    }
}
