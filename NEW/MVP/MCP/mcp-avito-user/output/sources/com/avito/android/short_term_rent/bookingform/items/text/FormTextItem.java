package com.avito.android.short_term_rent.bookingform.items.text;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.short_term_rent.bookingform.items.ItemAction;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FormTextItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/text/FormTextItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FormTextItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<FormTextItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f281670b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f281671c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ItemAction f281672d;

    /* compiled from: FormTextItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FormTextItem> {
        @Override // android.os.Parcelable.Creator
        public final FormTextItem createFromParcel(Parcel parcel) {
            return new FormTextItem(parcel.readString(), (AttributedText) parcel.readParcelable(FormTextItem.class.getClassLoader()), parcel.readInt() == 0 ? null : ItemAction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final FormTextItem[] newArray(int i12) {
            return new FormTextItem[i12];
        }
    }

    public FormTextItem(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.l ItemAction itemAction) {
        this.f281670b = str;
        this.f281671c = attributedText;
        this.f281672d = itemAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormTextItem)) {
            return false;
        }
        FormTextItem formTextItem = (FormTextItem) obj;
        return L.f(this.f281670b, formTextItem.f281670b) && L.f(this.f281671c, formTextItem.f281671c) && L.f(this.f281672d, formTextItem.f281672d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281670b() {
        return this.f281670b;
    }

    public final int hashCode() {
        int iHashCode = this.f281670b.hashCode() * 31;
        AttributedText attributedText = this.f281671c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        ItemAction itemAction = this.f281672d;
        return iHashCode2 + (itemAction != null ? itemAction.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "FormTextItem(stringId=" + this.f281670b + ", text=" + this.f281671c + ", action=" + this.f281672d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f281670b);
        parcel.writeParcelable(this.f281671c, i12);
        ItemAction itemAction = this.f281672d;
        if (itemAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            itemAction.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ FormTextItem(String str, AttributedText attributedText, ItemAction itemAction, int i12, C42822w c42822w) {
        this(str, attributedText, (i12 & 4) != 0 ? null : itemAction);
    }
}
