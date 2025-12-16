package com.avito.android.short_term_rent.bookingform.items.image_with_text;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.short_term_rent.bookingform.items.ItemAction;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImageWithTextItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/image_with_text/ImageWithTextItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ImageWithTextItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<ImageWithTextItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f281502b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f281503c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f281504d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ItemAction f281505e;

    /* compiled from: ImageWithTextItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImageWithTextItem> {
        @Override // android.os.Parcelable.Creator
        public final ImageWithTextItem createFromParcel(Parcel parcel) {
            return new ImageWithTextItem(parcel.readString(), (UniversalImage) parcel.readParcelable(ImageWithTextItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(ImageWithTextItem.class.getClassLoader()), parcel.readInt() == 0 ? null : ItemAction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ImageWithTextItem[] newArray(int i12) {
            return new ImageWithTextItem[i12];
        }
    }

    public ImageWithTextItem(@Y61.k String str, @Y61.l UniversalImage universalImage, @Y61.l AttributedText attributedText, @Y61.l ItemAction itemAction) {
        this.f281502b = str;
        this.f281503c = universalImage;
        this.f281504d = attributedText;
        this.f281505e = itemAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageWithTextItem)) {
            return false;
        }
        ImageWithTextItem imageWithTextItem = (ImageWithTextItem) obj;
        return L.f(this.f281502b, imageWithTextItem.f281502b) && L.f(this.f281503c, imageWithTextItem.f281503c) && L.f(this.f281504d, imageWithTextItem.f281504d) && L.f(this.f281505e, imageWithTextItem.f281505e);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF202392b() {
        return this.f281502b;
    }

    public final int hashCode() {
        int iHashCode = this.f281502b.hashCode() * 31;
        UniversalImage universalImage = this.f281503c;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        AttributedText attributedText = this.f281504d;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        ItemAction itemAction = this.f281505e;
        return iHashCode3 + (itemAction != null ? itemAction.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ImageWithTextItem(stringId=" + this.f281502b + ", image=" + this.f281503c + ", text=" + this.f281504d + ", action=" + this.f281505e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f281502b);
        parcel.writeParcelable(this.f281503c, i12);
        parcel.writeParcelable(this.f281504d, i12);
        ItemAction itemAction = this.f281505e;
        if (itemAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            itemAction.writeToParcel(parcel, i12);
        }
    }
}
