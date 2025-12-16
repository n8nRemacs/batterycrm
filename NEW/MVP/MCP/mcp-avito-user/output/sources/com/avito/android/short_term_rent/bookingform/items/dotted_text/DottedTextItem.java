package com.avito.android.short_term_rent.bookingform.items.dotted_text;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DottedTextItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/dotted_text/DottedTextItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DottedTextItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<DottedTextItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f281482b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f281483c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f281484d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final DeepLink f281485e;

    /* compiled from: DottedTextItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DottedTextItem> {
        @Override // android.os.Parcelable.Creator
        public final DottedTextItem createFromParcel(Parcel parcel) {
            return new DottedTextItem((DeepLink) parcel.readParcelable(DottedTextItem.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(DottedTextItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(DottedTextItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DottedTextItem[] newArray(int i12) {
            return new DottedTextItem[i12];
        }
    }

    public DottedTextItem(@Y61.l DeepLink deepLink, @Y61.k String str, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2) {
        this.f281482b = str;
        this.f281483c = attributedText;
        this.f281484d = attributedText2;
        this.f281485e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DottedTextItem)) {
            return false;
        }
        DottedTextItem dottedTextItem = (DottedTextItem) obj;
        return L.f(this.f281482b, dottedTextItem.f281482b) && L.f(this.f281483c, dottedTextItem.f281483c) && L.f(this.f281484d, dottedTextItem.f281484d) && L.f(this.f281485e, dottedTextItem.f281485e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF428153b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281482b() {
        return this.f281482b;
    }

    public final int hashCode() {
        int iHashCode = this.f281482b.hashCode() * 31;
        AttributedText attributedText = this.f281483c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f281484d;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        DeepLink deepLink = this.f281485e;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DottedTextItem(stringId=");
        sb2.append(this.f281482b);
        sb2.append(", leftText=");
        sb2.append(this.f281483c);
        sb2.append(", rightText=");
        sb2.append(this.f281484d);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f281485e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f281482b);
        parcel.writeParcelable(this.f281483c, i12);
        parcel.writeParcelable(this.f281484d, i12);
        parcel.writeParcelable(this.f281485e, i12);
    }
}
