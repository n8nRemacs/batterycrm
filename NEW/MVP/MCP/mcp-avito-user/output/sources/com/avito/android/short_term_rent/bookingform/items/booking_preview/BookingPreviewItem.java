package com.avito.android.short_term_rent.bookingform.items.booking_preview;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.short_term_rent.bookingform.items.ItemAction;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingPreviewItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/booking_preview/BookingPreviewItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BookingPreviewItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<BookingPreviewItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f281447b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Image f281448c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f281449d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ItemAction f281450e;

    /* compiled from: BookingPreviewItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BookingPreviewItem> {
        @Override // android.os.Parcelable.Creator
        public final BookingPreviewItem createFromParcel(Parcel parcel) {
            return new BookingPreviewItem(parcel.readString(), (Image) parcel.readParcelable(BookingPreviewItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(BookingPreviewItem.class.getClassLoader()), parcel.readInt() == 0 ? null : ItemAction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BookingPreviewItem[] newArray(int i12) {
            return new BookingPreviewItem[i12];
        }
    }

    public BookingPreviewItem(@Y61.k String str, @Y61.l Image image, @Y61.l AttributedText attributedText, @Y61.l ItemAction itemAction) {
        this.f281447b = str;
        this.f281448c = image;
        this.f281449d = attributedText;
        this.f281450e = itemAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingPreviewItem)) {
            return false;
        }
        BookingPreviewItem bookingPreviewItem = (BookingPreviewItem) obj;
        return L.f(this.f281447b, bookingPreviewItem.f281447b) && L.f(this.f281448c, bookingPreviewItem.f281448c) && L.f(this.f281449d, bookingPreviewItem.f281449d) && L.f(this.f281450e, bookingPreviewItem.f281450e);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF202392b() {
        return this.f281447b;
    }

    public final int hashCode() {
        int iHashCode = this.f281447b.hashCode() * 31;
        Image image = this.f281448c;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        AttributedText attributedText = this.f281449d;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        ItemAction itemAction = this.f281450e;
        return iHashCode3 + (itemAction != null ? itemAction.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "BookingPreviewItem(stringId=" + this.f281447b + ", image=" + this.f281448c + ", text=" + this.f281449d + ", action=" + this.f281450e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f281447b);
        parcel.writeParcelable(this.f281448c, i12);
        parcel.writeParcelable(this.f281449d, i12);
        ItemAction itemAction = this.f281450e;
        if (itemAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            itemAction.writeToParcel(parcel, i12);
        }
    }
}
