package com.avito.android.short_term_rent.bookingform.items.select;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.short_term_rent.bookingform.items.ItemAction;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FormSelectItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/select/FormSelectItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FormSelectItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<FormSelectItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f281631b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f281632c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f281633d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f281634e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FormSelectState f281635f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final ItemAction f281636g;

    /* compiled from: FormSelectItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FormSelectItem> {
        @Override // android.os.Parcelable.Creator
        public final FormSelectItem createFromParcel(Parcel parcel) {
            return new FormSelectItem(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), (FormSelectState) parcel.readParcelable(FormSelectItem.class.getClassLoader()), parcel.readInt() == 0 ? null : ItemAction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final FormSelectItem[] newArray(int i12) {
            return new FormSelectItem[i12];
        }
    }

    public FormSelectItem(@Y61.k String str, boolean z12, @Y61.l String str2, @Y61.l String str3, @Y61.k FormSelectState formSelectState, @Y61.l ItemAction itemAction) {
        this.f281631b = str;
        this.f281632c = z12;
        this.f281633d = str2;
        this.f281634e = str3;
        this.f281635f = formSelectState;
        this.f281636g = itemAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormSelectItem)) {
            return false;
        }
        FormSelectItem formSelectItem = (FormSelectItem) obj;
        return L.f(this.f281631b, formSelectItem.f281631b) && this.f281632c == formSelectItem.f281632c && L.f(this.f281633d, formSelectItem.f281633d) && L.f(this.f281634e, formSelectItem.f281634e) && L.f(this.f281635f, formSelectItem.f281635f) && L.f(this.f281636g, formSelectItem.f281636g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83054c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281631b() {
        return this.f281631b;
    }

    public final int hashCode() {
        int i12 = r.i(this.f281631b.hashCode() * 31, 31, this.f281632c);
        String str = this.f281633d;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f281634e;
        int iHashCode2 = (this.f281635f.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        ItemAction itemAction = this.f281636g;
        return iHashCode2 + (itemAction != null ? itemAction.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "FormSelectItem(stringId=" + this.f281631b + ", isEnabled=" + this.f281632c + ", text=" + this.f281633d + ", hint=" + this.f281634e + ", state=" + this.f281635f + ", action=" + this.f281636g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f281631b);
        parcel.writeInt(this.f281632c ? 1 : 0);
        parcel.writeString(this.f281633d);
        parcel.writeString(this.f281634e);
        parcel.writeParcelable(this.f281635f, i12);
        ItemAction itemAction = this.f281636g;
        if (itemAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            itemAction.writeToParcel(parcel, i12);
        }
    }
}
