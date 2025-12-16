package com.avito.android.remote.model.category_parameters.slot.delivery_addresses;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryAddressesSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017Jd\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010J\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u0010R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u00102R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u00106R$\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00103\u001a\u0004\b7\u0010\u0017\"\u0004\b8\u00106¨\u00069"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_addresses/DeliveryAddressesSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "", "editButtonTitle", "sheetTitle", "sheetDescription", "sheetSaveButtonTitle", "", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_addresses/AddressInfo;", "deliveryAddresses", "", "deliveryAddressFieldId", "selectedAddressId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Ljava/lang/Integer;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/remote/model/category_parameters/slot/delivery_addresses/DeliveryAddressesSlotConfig;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getEditButtonTitle", "getSheetTitle", "getSheetDescription", "getSheetSaveButtonTitle", "Ljava/util/List;", "getDeliveryAddresses", "setDeliveryAddresses", "(Ljava/util/List;)V", "Ljava/lang/Integer;", "getDeliveryAddressFieldId", "setDeliveryAddressFieldId", "(Ljava/lang/Integer;)V", "getSelectedAddressId", "setSelectedAddressId", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeliveryAddressesSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<DeliveryAddressesSlotConfig> CREATOR = new Creator();

    @c("deliveryAddressFieldId")
    @l
    private Integer deliveryAddressFieldId;

    @c("deliveryAddresses")
    @l
    private List<AddressInfo> deliveryAddresses;

    @c("editButtonTitle")
    @k
    private final String editButtonTitle;

    @l
    private Integer selectedAddressId;

    @c("sheetDescription")
    @l
    private final String sheetDescription;

    @c("sheetSaveButtonTitle")
    @k
    private final String sheetSaveButtonTitle;

    @c("sheetTitle")
    @k
    private final String sheetTitle;

    /* compiled from: DeliveryAddressesSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryAddressesSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryAddressesSlotConfig createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(AddressInfo.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new DeliveryAddressesSlotConfig(string, string2, string3, string4, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryAddressesSlotConfig[] newArray(int i12) {
            return new DeliveryAddressesSlotConfig[i12];
        }
    }

    public DeliveryAddressesSlotConfig(@k String str, @k String str2, @l String str3, @k String str4, @l List<AddressInfo> list, @l Integer num, @l Integer num2) {
        this.editButtonTitle = str;
        this.sheetTitle = str2;
        this.sheetDescription = str3;
        this.sheetSaveButtonTitle = str4;
        this.deliveryAddresses = list;
        this.deliveryAddressFieldId = num;
        this.selectedAddressId = num2;
    }

    public static /* synthetic */ DeliveryAddressesSlotConfig copy$default(DeliveryAddressesSlotConfig deliveryAddressesSlotConfig, String str, String str2, String str3, String str4, List list, Integer num, Integer num2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = deliveryAddressesSlotConfig.editButtonTitle;
        }
        if ((i12 & 2) != 0) {
            str2 = deliveryAddressesSlotConfig.sheetTitle;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            str3 = deliveryAddressesSlotConfig.sheetDescription;
        }
        String str6 = str3;
        if ((i12 & 8) != 0) {
            str4 = deliveryAddressesSlotConfig.sheetSaveButtonTitle;
        }
        String str7 = str4;
        if ((i12 & 16) != 0) {
            list = deliveryAddressesSlotConfig.deliveryAddresses;
        }
        List list2 = list;
        if ((i12 & 32) != 0) {
            num = deliveryAddressesSlotConfig.deliveryAddressFieldId;
        }
        Integer num3 = num;
        if ((i12 & 64) != 0) {
            num2 = deliveryAddressesSlotConfig.selectedAddressId;
        }
        return deliveryAddressesSlotConfig.copy(str, str5, str6, str7, list2, num3, num2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getEditButtonTitle() {
        return this.editButtonTitle;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getSheetTitle() {
        return this.sheetTitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getSheetDescription() {
        return this.sheetDescription;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getSheetSaveButtonTitle() {
        return this.sheetSaveButtonTitle;
    }

    @l
    public final List<AddressInfo> component5() {
        return this.deliveryAddresses;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Integer getDeliveryAddressFieldId() {
        return this.deliveryAddressFieldId;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Integer getSelectedAddressId() {
        return this.selectedAddressId;
    }

    @k
    public final DeliveryAddressesSlotConfig copy(@k String editButtonTitle, @k String sheetTitle, @l String sheetDescription, @k String sheetSaveButtonTitle, @l List<AddressInfo> deliveryAddresses, @l Integer deliveryAddressFieldId, @l Integer selectedAddressId) {
        return new DeliveryAddressesSlotConfig(editButtonTitle, sheetTitle, sheetDescription, sheetSaveButtonTitle, deliveryAddresses, deliveryAddressFieldId, selectedAddressId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryAddressesSlotConfig)) {
            return false;
        }
        DeliveryAddressesSlotConfig deliveryAddressesSlotConfig = (DeliveryAddressesSlotConfig) other;
        return L.f(this.editButtonTitle, deliveryAddressesSlotConfig.editButtonTitle) && L.f(this.sheetTitle, deliveryAddressesSlotConfig.sheetTitle) && L.f(this.sheetDescription, deliveryAddressesSlotConfig.sheetDescription) && L.f(this.sheetSaveButtonTitle, deliveryAddressesSlotConfig.sheetSaveButtonTitle) && L.f(this.deliveryAddresses, deliveryAddressesSlotConfig.deliveryAddresses) && L.f(this.deliveryAddressFieldId, deliveryAddressesSlotConfig.deliveryAddressFieldId) && L.f(this.selectedAddressId, deliveryAddressesSlotConfig.selectedAddressId);
    }

    @l
    public final Integer getDeliveryAddressFieldId() {
        return this.deliveryAddressFieldId;
    }

    @l
    public final List<AddressInfo> getDeliveryAddresses() {
        return this.deliveryAddresses;
    }

    @k
    public final String getEditButtonTitle() {
        return this.editButtonTitle;
    }

    @l
    public final Integer getSelectedAddressId() {
        return this.selectedAddressId;
    }

    @l
    public final String getSheetDescription() {
        return this.sheetDescription;
    }

    @k
    public final String getSheetSaveButtonTitle() {
        return this.sheetSaveButtonTitle;
    }

    @k
    public final String getSheetTitle() {
        return this.sheetTitle;
    }

    public int hashCode() {
        int iD2 = H.d(this.editButtonTitle.hashCode() * 31, 31, this.sheetTitle);
        String str = this.sheetDescription;
        int iD3 = H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.sheetSaveButtonTitle);
        List<AddressInfo> list = this.deliveryAddresses;
        int iHashCode = (iD3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.deliveryAddressFieldId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.selectedAddressId;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setDeliveryAddressFieldId(@l Integer num) {
        this.deliveryAddressFieldId = num;
    }

    public final void setDeliveryAddresses(@l List<AddressInfo> list) {
        this.deliveryAddresses = list;
    }

    public final void setSelectedAddressId(@l Integer num) {
        this.selectedAddressId = num;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryAddressesSlotConfig(editButtonTitle=");
        sb2.append(this.editButtonTitle);
        sb2.append(", sheetTitle=");
        sb2.append(this.sheetTitle);
        sb2.append(", sheetDescription=");
        sb2.append(this.sheetDescription);
        sb2.append(", sheetSaveButtonTitle=");
        sb2.append(this.sheetSaveButtonTitle);
        sb2.append(", deliveryAddresses=");
        sb2.append(this.deliveryAddresses);
        sb2.append(", deliveryAddressFieldId=");
        sb2.append(this.deliveryAddressFieldId);
        sb2.append(", selectedAddressId=");
        return s.j(sb2, this.selectedAddressId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.editButtonTitle);
        parcel.writeString(this.sheetTitle);
        parcel.writeString(this.sheetDescription);
        parcel.writeString(this.sheetSaveButtonTitle);
        List<AddressInfo> list = this.deliveryAddresses;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AddressInfo) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Integer num = this.deliveryAddressFieldId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.selectedAddressId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
    }

    public /* synthetic */ DeliveryAddressesSlotConfig(String str, String str2, String str3, String str4, List list, Integer num, Integer num2, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, list, num, (i12 & 64) != 0 ? null : num2);
    }
}
