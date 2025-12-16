package com.avito.android.remote.model.service_order;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ServiceOrder.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001#B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/service_order/ServiceOrder;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/service_order/ServiceOrderAction;", "primaryAction", "secondaryAction", "Lcom/avito/android/remote/model/text/AttributedText;", "descriptionLink", "", "description", "Lcom/avito/android/remote/model/service_order/ServiceOrder$Tooltip;", "primaryTooltip", "<init>", "(Lcom/avito/android/remote/model/service_order/ServiceOrderAction;Lcom/avito/android/remote/model/service_order/ServiceOrderAction;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/service_order/ServiceOrder$Tooltip;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/service_order/ServiceOrderAction;", "getPrimaryAction", "()Lcom/avito/android/remote/model/service_order/ServiceOrderAction;", "getSecondaryAction", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescriptionLink", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/service_order/ServiceOrder$Tooltip;", "getPrimaryTooltip", "()Lcom/avito/android/remote/model/service_order/ServiceOrder$Tooltip;", "Tooltip", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ServiceOrder implements Parcelable {

    @k
    public static final Parcelable.Creator<ServiceOrder> CREATOR = new Creator();

    @c("description")
    @l
    private final String description;

    @c("descriptionLink")
    @l
    private final AttributedText descriptionLink;

    @c("primaryAction")
    @k
    private final ServiceOrderAction primaryAction;

    @c("primaryTooltip")
    @l
    private final Tooltip primaryTooltip;

    @c("secondaryAction")
    @l
    private final ServiceOrderAction secondaryAction;

    /* compiled from: ServiceOrder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ServiceOrder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ServiceOrder createFromParcel(@k Parcel parcel) {
            Parcelable.Creator<ServiceOrderAction> creator = ServiceOrderAction.CREATOR;
            return new ServiceOrder(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), (AttributedText) parcel.readParcelable(ServiceOrder.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? Tooltip.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ServiceOrder[] newArray(int i12) {
            return new ServiceOrder[i12];
        }
    }

    /* compiled from: ServiceOrder.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/service_order/ServiceOrder$Tooltip;", "Landroid/os/Parcelable;", "", "title", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getBody", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Tooltip implements Parcelable {

        @k
        public static final Parcelable.Creator<Tooltip> CREATOR = new Creator();

        @c("body")
        @k
        private final String body;

        @c("title")
        @k
        private final String title;

        /* compiled from: ServiceOrder.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Tooltip> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tooltip createFromParcel(@k Parcel parcel) {
                return new Tooltip(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tooltip[] newArray(int i12) {
                return new Tooltip[i12];
            }
        }

        public Tooltip(@k String str, @k String str2) {
            this.title = str;
            this.body = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getBody() {
            return this.body;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.body);
        }
    }

    public ServiceOrder(@k ServiceOrderAction serviceOrderAction, @l ServiceOrderAction serviceOrderAction2, @l AttributedText attributedText, @l String str, @l Tooltip tooltip) {
        this.primaryAction = serviceOrderAction;
        this.secondaryAction = serviceOrderAction2;
        this.descriptionLink = attributedText;
        this.description = str;
        this.primaryTooltip = tooltip;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final AttributedText getDescriptionLink() {
        return this.descriptionLink;
    }

    @k
    public final ServiceOrderAction getPrimaryAction() {
        return this.primaryAction;
    }

    @l
    public final Tooltip getPrimaryTooltip() {
        return this.primaryTooltip;
    }

    @l
    public final ServiceOrderAction getSecondaryAction() {
        return this.secondaryAction;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.primaryAction.writeToParcel(parcel, flags);
        ServiceOrderAction serviceOrderAction = this.secondaryAction;
        if (serviceOrderAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceOrderAction.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.descriptionLink, flags);
        parcel.writeString(this.description);
        Tooltip tooltip = this.primaryTooltip;
        if (tooltip == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tooltip.writeToParcel(parcel, flags);
        }
    }
}
