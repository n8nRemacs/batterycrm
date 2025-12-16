package com.avito.android.remote.model.delivery;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.DeliveryCost;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DeliveryMultiPointDetailInfo.kt */
@d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/delivery/DeliveryMultiPointDetailInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "Lcom/avito/android/remote/model/delivery/DeliveryMultiPointDetailInfo$Service;", "services", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "getServices", "()Ljava/util/List;", "Service", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliveryMultiPointDetailInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliveryMultiPointDetailInfo> CREATOR = new Creator();

    @c("services")
    @k
    private final List<Service> services;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: DeliveryMultiPointDetailInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryMultiPointDetailInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryMultiPointDetailInfo createFromParcel(@k Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(DeliveryMultiPointDetailInfo.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Service.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new DeliveryMultiPointDetailInfo(attributedText, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryMultiPointDetailInfo[] newArray(int i12) {
            return new DeliveryMultiPointDetailInfo[i12];
        }
    }

    /* compiled from: DeliveryMultiPointDetailInfo.kt */
    @d
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b*\u0010&R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b+\u0010&¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/delivery/DeliveryMultiPointDetailInfo$Service;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/remote/model/delivery/DeliveryLabel;", "label", "", "subtitles", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/DeliveryCost;", "cost", "Lcom/avito/android/beduin_models/BeduinAction;", "buttonActions", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/delivery/DeliveryLabel;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/delivery/DeliveryLabel;", "getLabel", "()Lcom/avito/android/remote/model/delivery/DeliveryLabel;", "Ljava/util/List;", "getSubtitles", "()Ljava/util/List;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getCost", "getButtonActions", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Service implements Parcelable {

        @k
        public static final Parcelable.Creator<Service> CREATOR = new Creator();

        @c("buttonActions")
        @l
        private final List<BeduinAction> buttonActions;

        @c("cost")
        @l
        private final List<DeliveryCost> cost;

        @c(ContextActionHandler.Link.DEEPLINK)
        @l
        private final DeepLink deeplink;

        @c("id")
        @k
        private final String id;

        @c("label")
        @l
        private final DeliveryLabel label;

        @c("subtitles")
        @k
        private final List<AttributedText> subtitles;

        @c("title")
        @k
        private final AttributedText title;

        /* compiled from: DeliveryMultiPointDetailInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Service> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Service createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                AttributedText attributedText = (AttributedText) parcel.readParcelable(Service.class.getClassLoader());
                DeliveryLabel deliveryLabel = (DeliveryLabel) parcel.readParcelable(Service.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = a.l(Service.class, parcel, arrayList2, iL3, 1);
                }
                DeepLink deepLink = (DeepLink) parcel.readParcelable(Service.class.getClassLoader());
                ArrayList arrayList3 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i13 = parcel.readInt();
                    arrayList = new ArrayList(i13);
                    int iC2 = 0;
                    while (iC2 != i13) {
                        iC2 = a.c(DeliveryCost.CREATOR, parcel, arrayList, iC2, 1);
                    }
                }
                if (parcel.readInt() != 0) {
                    int i14 = parcel.readInt();
                    arrayList3 = new ArrayList(i14);
                    while (iL2 != i14) {
                        iL2 = a.l(Service.class, parcel, arrayList3, iL2, 1);
                    }
                }
                return new Service(string, attributedText, deliveryLabel, arrayList2, deepLink, arrayList, arrayList3);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Service[] newArray(int i12) {
                return new Service[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Service(@k String str, @k AttributedText attributedText, @l DeliveryLabel deliveryLabel, @k List<AttributedText> list, @l DeepLink deepLink, @l List<DeliveryCost> list2, @l List<? extends BeduinAction> list3) {
            this.id = str;
            this.title = attributedText;
            this.label = deliveryLabel;
            this.subtitles = list;
            this.deeplink = deepLink;
            this.cost = list2;
            this.buttonActions = list3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final List<BeduinAction> getButtonActions() {
            return this.buttonActions;
        }

        @l
        public final List<DeliveryCost> getCost() {
            return this.cost;
        }

        @l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final String getId() {
            return this.id;
        }

        @l
        public final DeliveryLabel getLabel() {
            return this.label;
        }

        @k
        public final List<AttributedText> getSubtitles() {
            return this.subtitles;
        }

        @k
        public final AttributedText getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeParcelable(this.title, flags);
            parcel.writeParcelable(this.label, flags);
            Iterator itJ = C0.j(this.subtitles, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), flags);
            }
            parcel.writeParcelable(this.deeplink, flags);
            List<DeliveryCost> list = this.cost;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((DeliveryCost) itA.next()).writeToParcel(parcel, flags);
                }
            }
            List<BeduinAction> list2 = this.buttonActions;
            if (list2 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
    }

    public DeliveryMultiPointDetailInfo(@k AttributedText attributedText, @k List<Service> list) {
        this.title = attributedText;
        this.services = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final List<Service> getServices() {
        return this.services;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        Iterator itJ = C0.j(this.services, parcel);
        while (itJ.hasNext()) {
            ((Service) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
