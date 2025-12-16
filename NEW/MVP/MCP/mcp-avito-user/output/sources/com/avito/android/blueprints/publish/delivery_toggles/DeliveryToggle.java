package com.avito.android.blueprints.publish.delivery_toggles;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PublishDeliveryTogglesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/delivery_toggles/DeliveryToggle;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeliveryToggle implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliveryToggle> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f106163b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeliveryToggleType f106164c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f106165d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f106166e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f106167f;

    /* compiled from: PublishDeliveryTogglesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeliveryToggle> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryToggle createFromParcel(Parcel parcel) {
            return new DeliveryToggle(parcel.readString(), DeliveryToggleType.valueOf(parcel.readString()), parcel.readString(), (AttributedText) parcel.readParcelable(DeliveryToggle.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryToggle[] newArray(int i12) {
            return new DeliveryToggle[i12];
        }
    }

    public DeliveryToggle(@k String str, @k DeliveryToggleType deliveryToggleType, @k String str2, @l AttributedText attributedText, boolean z12) {
        this.f106163b = str;
        this.f106164c = deliveryToggleType;
        this.f106165d = str2;
        this.f106166e = attributedText;
        this.f106167f = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryToggle)) {
            return false;
        }
        DeliveryToggle deliveryToggle = (DeliveryToggle) obj;
        return L.f(this.f106163b, deliveryToggle.f106163b) && this.f106164c == deliveryToggle.f106164c && L.f(this.f106165d, deliveryToggle.f106165d) && L.f(this.f106166e, deliveryToggle.f106166e) && this.f106167f == deliveryToggle.f106167f;
    }

    public final int hashCode() {
        int iD2 = H.d((this.f106164c.hashCode() + (this.f106163b.hashCode() * 31)) * 31, 31, this.f106165d);
        AttributedText attributedText = this.f106166e;
        return Boolean.hashCode(this.f106167f) + ((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryToggle(id=");
        sb2.append(this.f106163b);
        sb2.append(", type=");
        sb2.append(this.f106164c);
        sb2.append(", title=");
        sb2.append(this.f106165d);
        sb2.append(", subtitle=");
        sb2.append(this.f106166e);
        sb2.append(", isChecked=");
        return r.x(sb2, this.f106167f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f106163b);
        parcel.writeString(this.f106164c.name());
        parcel.writeString(this.f106165d);
        parcel.writeParcelable(this.f106166e, i12);
        parcel.writeInt(this.f106167f ? 1 : 0);
    }
}
