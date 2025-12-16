package com.avito.android.blueprints.publish.delivery_toggles;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PublishDeliveryTogglesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/delivery_toggles/PublishDeliveryTogglesItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PublishDeliveryTogglesItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<PublishDeliveryTogglesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f106173b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<DeliveryToggle> f106174c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeliveryToggle f106175d;

    /* compiled from: PublishDeliveryTogglesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PublishDeliveryTogglesItem> {
        @Override // android.os.Parcelable.Creator
        public final PublishDeliveryTogglesItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(DeliveryToggle.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new PublishDeliveryTogglesItem(string, arrayList, parcel.readInt() == 0 ? null : DeliveryToggle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PublishDeliveryTogglesItem[] newArray(int i12) {
            return new PublishDeliveryTogglesItem[i12];
        }
    }

    public PublishDeliveryTogglesItem(@k String str, @k List<DeliveryToggle> list, @l DeliveryToggle deliveryToggle) {
        this.f106173b = str;
        this.f106174c = list;
        this.f106175d = deliveryToggle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishDeliveryTogglesItem)) {
            return false;
        }
        PublishDeliveryTogglesItem publishDeliveryTogglesItem = (PublishDeliveryTogglesItem) obj;
        return L.f(this.f106173b, publishDeliveryTogglesItem.f106173b) && L.f(this.f106174c, publishDeliveryTogglesItem.f106174c) && L.f(this.f106175d, publishDeliveryTogglesItem.f106175d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79989b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79990c() {
        return this.f106173b;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f106173b.hashCode() * 31, 31, this.f106174c);
        DeliveryToggle deliveryToggle = this.f106175d;
        return iE2 + (deliveryToggle == null ? 0 : deliveryToggle.hashCode());
    }

    @k
    public final String toString() {
        return "PublishDeliveryTogglesItem(stringId=" + this.f106173b + ", toggles=" + this.f106174c + ", selectedToggle=" + this.f106175d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f106173b);
        Iterator itJ = C0.j(this.f106174c, parcel);
        while (itJ.hasNext()) {
            ((DeliveryToggle) itJ.next()).writeToParcel(parcel, i12);
        }
        DeliveryToggle deliveryToggle = this.f106175d;
        if (deliveryToggle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            deliveryToggle.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ PublishDeliveryTogglesItem(String str, List list, DeliveryToggle deliveryToggle, int i12, C42822w c42822w) {
        this(str, list, (i12 & 4) != 0 ? null : deliveryToggle);
    }
}
