package com.avito.android.important_addresses_selection.presentation.items.constraintWarning;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImportantAddressesSelectionConstraintWarningItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/items/constraintWarning/ImportantAddressesSelectionConstraintWarningItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ImportantAddressesSelectionConstraintWarningItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ImportantAddressesSelectionConstraintWarningItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f169855b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f169856c;

    /* compiled from: ImportantAddressesSelectionConstraintWarningItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImportantAddressesSelectionConstraintWarningItem> {
        @Override // android.os.Parcelable.Creator
        public final ImportantAddressesSelectionConstraintWarningItem createFromParcel(Parcel parcel) {
            return new ImportantAddressesSelectionConstraintWarningItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImportantAddressesSelectionConstraintWarningItem[] newArray(int i12) {
            return new ImportantAddressesSelectionConstraintWarningItem[i12];
        }
    }

    public ImportantAddressesSelectionConstraintWarningItem(@k String str, @k String str2) {
        this.f169855b = str;
        this.f169856c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportantAddressesSelectionConstraintWarningItem)) {
            return false;
        }
        ImportantAddressesSelectionConstraintWarningItem importantAddressesSelectionConstraintWarningItem = (ImportantAddressesSelectionConstraintWarningItem) obj;
        return L.f(this.f169855b, importantAddressesSelectionConstraintWarningItem.f169855b) && L.f(this.f169856c, importantAddressesSelectionConstraintWarningItem.f169856c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF163033b() {
        return this.f169855b;
    }

    public final int hashCode() {
        return this.f169856c.hashCode() + (this.f169855b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImportantAddressesSelectionConstraintWarningItem(stringId=");
        sb2.append(this.f169855b);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f169856c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f169855b);
        parcel.writeString(this.f169856c);
    }
}
