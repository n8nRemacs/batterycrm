package com.avito.android.important_addresses_selection.presentation.items.additionalButton;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImportantAddressesSelectionAdditionalActionItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/items/additionalButton/ImportantAddressesSelectionAdditionalActionItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ImportantAddressesSelectionAdditionalActionItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ImportantAddressesSelectionAdditionalActionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f169818b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f169819c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f169820d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f169821e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f169822f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final DeepLink f169823g;

    /* compiled from: ImportantAddressesSelectionAdditionalActionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImportantAddressesSelectionAdditionalActionItem> {
        @Override // android.os.Parcelable.Creator
        public final ImportantAddressesSelectionAdditionalActionItem createFromParcel(Parcel parcel) {
            return new ImportantAddressesSelectionAdditionalActionItem(parcel.readString(), (AttributedText) parcel.readParcelable(ImportantAddressesSelectionAdditionalActionItem.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (DeepLink) parcel.readParcelable(ImportantAddressesSelectionAdditionalActionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImportantAddressesSelectionAdditionalActionItem[] newArray(int i12) {
            return new ImportantAddressesSelectionAdditionalActionItem[i12];
        }
    }

    public ImportantAddressesSelectionAdditionalActionItem(@k String str, @l AttributedText attributedText, @k String str2, @InterfaceC42150f @l Integer num, @InterfaceC42150f @l Integer num2, @k DeepLink deepLink) {
        this.f169818b = str;
        this.f169819c = attributedText;
        this.f169820d = str2;
        this.f169821e = num;
        this.f169822f = num2;
        this.f169823g = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportantAddressesSelectionAdditionalActionItem)) {
            return false;
        }
        ImportantAddressesSelectionAdditionalActionItem importantAddressesSelectionAdditionalActionItem = (ImportantAddressesSelectionAdditionalActionItem) obj;
        return L.f(this.f169818b, importantAddressesSelectionAdditionalActionItem.f169818b) && L.f(this.f169819c, importantAddressesSelectionAdditionalActionItem.f169819c) && L.f(this.f169820d, importantAddressesSelectionAdditionalActionItem.f169820d) && L.f(this.f169821e, importantAddressesSelectionAdditionalActionItem.f169821e) && L.f(this.f169822f, importantAddressesSelectionAdditionalActionItem.f169822f) && L.f(this.f169823g, importantAddressesSelectionAdditionalActionItem.f169823g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF139156b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF162559g() {
        return this.f169818b;
    }

    public final int hashCode() {
        int iHashCode = this.f169818b.hashCode() * 31;
        AttributedText attributedText = this.f169819c;
        int iD2 = H.d((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f169820d);
        Integer num = this.f169821e;
        int iHashCode2 = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f169822f;
        return this.f169823g.hashCode() + ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImportantAddressesSelectionAdditionalActionItem(stringId=");
        sb2.append(this.f169818b);
        sb2.append(", info=");
        sb2.append(this.f169819c);
        sb2.append(", buttonTitle=");
        sb2.append(this.f169820d);
        sb2.append(", buttonLeftDrawableAttr=");
        sb2.append(this.f169821e);
        sb2.append(", buttonRightDrawableAttr=");
        sb2.append(this.f169822f);
        sb2.append(", buttonDeepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f169823g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f169818b);
        parcel.writeParcelable(this.f169819c, i12);
        parcel.writeString(this.f169820d);
        Integer num = this.f169821e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f169822f;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        parcel.writeParcelable(this.f169823g, i12);
    }
}
