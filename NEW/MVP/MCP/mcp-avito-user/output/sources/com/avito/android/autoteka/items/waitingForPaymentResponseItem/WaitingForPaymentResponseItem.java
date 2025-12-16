package com.avito.android.autoteka.items.waitingForPaymentResponseItem;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.autoteka.domain.AutotekaItems;
import com.avito.android.autoteka.helpers.AutotekaItem;
import com.avito.android.remote.autoteka.generated.api.get_step_order_status_api.GetStepOrderStatusApiResponse;
import com.avito.android.remote.autoteka.model.AutotekaAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WaitingForPaymentResponseItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/items/waitingForPaymentResponseItem/WaitingForPaymentResponseItem;", "Lcom/avito/android/autoteka/helpers/AutotekaItem;", "DirectPurchase", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WaitingForPaymentResponseItem implements AutotekaItem {

    @k
    public static final Parcelable.Creator<WaitingForPaymentResponseItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f97044b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f97045c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f97046d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final GetStepOrderStatusApiResponse.Status f97047e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f97048f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DirectPurchase f97049g;

    /* compiled from: WaitingForPaymentResponseItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/waitingForPaymentResponseItem/WaitingForPaymentResponseItem$DirectPurchase;", "Landroid/os/Parcelable;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DirectPurchase implements Parcelable {

        @k
        public static final Parcelable.Creator<DirectPurchase> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f97050b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AutotekaAction f97051c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final AutotekaAction f97052d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f97053e;

        /* compiled from: WaitingForPaymentResponseItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DirectPurchase> {
            @Override // android.os.Parcelable.Creator
            public final DirectPurchase createFromParcel(Parcel parcel) {
                return new DirectPurchase((AttributedText) parcel.readParcelable(DirectPurchase.class.getClassLoader()), (AutotekaAction) parcel.readParcelable(DirectPurchase.class.getClassLoader()), (AutotekaAction) parcel.readParcelable(DirectPurchase.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DirectPurchase[] newArray(int i12) {
                return new DirectPurchase[i12];
            }
        }

        public DirectPurchase(@l AttributedText attributedText, @l AutotekaAction autotekaAction, @l AutotekaAction autotekaAction2, @k String str) {
            this.f97050b = attributedText;
            this.f97051c = autotekaAction;
            this.f97052d = autotekaAction2;
            this.f97053e = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DirectPurchase)) {
                return false;
            }
            DirectPurchase directPurchase = (DirectPurchase) obj;
            return L.f(this.f97050b, directPurchase.f97050b) && L.f(this.f97051c, directPurchase.f97051c) && L.f(this.f97052d, directPurchase.f97052d) && L.f(this.f97053e, directPurchase.f97053e);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f97050b;
            int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
            AutotekaAction autotekaAction = this.f97051c;
            int iHashCode2 = (iHashCode + (autotekaAction == null ? 0 : autotekaAction.hashCode())) * 31;
            AutotekaAction autotekaAction2 = this.f97052d;
            return this.f97053e.hashCode() + ((iHashCode2 + (autotekaAction2 != null ? autotekaAction2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DirectPurchase(description=");
            sb2.append(this.f97050b);
            sb2.append(", primaryAction=");
            sb2.append(this.f97051c);
            sb2.append(", secondaryAction=");
            sb2.append(this.f97052d);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f97053e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f97050b, i12);
            parcel.writeParcelable(this.f97051c, i12);
            parcel.writeParcelable(this.f97052d, i12);
            parcel.writeString(this.f97053e);
        }
    }

    /* compiled from: WaitingForPaymentResponseItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WaitingForPaymentResponseItem> {
        @Override // android.os.Parcelable.Creator
        public final WaitingForPaymentResponseItem createFromParcel(Parcel parcel) {
            return new WaitingForPaymentResponseItem(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(WaitingForPaymentResponseItem.class.getClassLoader()), GetStepOrderStatusApiResponse.Status.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : DirectPurchase.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final WaitingForPaymentResponseItem[] newArray(int i12) {
            return new WaitingForPaymentResponseItem[i12];
        }
    }

    public WaitingForPaymentResponseItem(@k String str, @l String str2, @l AttributedText attributedText, @k GetStepOrderStatusApiResponse.Status status, @l String str3, @l DirectPurchase directPurchase) {
        this.f97044b = str;
        this.f97045c = str2;
        this.f97046d = attributedText;
        this.f97047e = status;
        this.f97048f = str3;
        this.f97049g = directPurchase;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaitingForPaymentResponseItem)) {
            return false;
        }
        WaitingForPaymentResponseItem waitingForPaymentResponseItem = (WaitingForPaymentResponseItem) obj;
        return L.f(this.f97044b, waitingForPaymentResponseItem.f97044b) && L.f(this.f97045c, waitingForPaymentResponseItem.f97045c) && L.f(this.f97046d, waitingForPaymentResponseItem.f97046d) && this.f97047e == waitingForPaymentResponseItem.f97047e && L.f(this.f97048f, waitingForPaymentResponseItem.f97048f) && L.f(this.f97049g, waitingForPaymentResponseItem.f97049g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF324767b() {
        return this.f97044b;
    }

    public final int hashCode() {
        int iHashCode = this.f97044b.hashCode() * 31;
        String str = this.f97045c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f97046d;
        int iHashCode3 = (this.f97047e.hashCode() + ((iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31;
        String str2 = this.f97048f;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DirectPurchase directPurchase = this.f97049g;
        return iHashCode4 + (directPurchase != null ? directPurchase.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "WaitingForPaymentResponseItem(stringId=" + this.f97044b + ", title=" + this.f97045c + ", description=" + this.f97046d + ", status=" + this.f97047e + ", usagePublicId=" + this.f97048f + ", directPurchase=" + this.f97049g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f97044b);
        parcel.writeString(this.f97045c);
        parcel.writeParcelable(this.f97046d, i12);
        parcel.writeString(this.f97047e.name());
        parcel.writeString(this.f97048f);
        DirectPurchase directPurchase = this.f97049g;
        if (directPurchase == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            directPurchase.writeToParcel(parcel, i12);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WaitingForPaymentResponseItem(String str, String str2, AttributedText attributedText, GetStepOrderStatusApiResponse.Status status, String str3, DirectPurchase directPurchase, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
            str = "ITEM_WAITING_FOR_PAYMENT_RESPONSE";
        }
        this(str, str2, attributedText, status, str3, directPurchase);
    }
}
