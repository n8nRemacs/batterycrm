package com.avito.android.short_term_rent.bookingform.promocode.promocodeitem;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UniversalImage;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoCodeItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/promocodeitem/PromoCodeItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PromoCodeItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<PromoCodeItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f282186b;

    /* renamed from: c, reason: collision with root package name */
    public final int f282187c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f282188d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final PrintableText f282189e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final PrintableText f282190f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f282191g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f282192h;

    /* compiled from: PromoCodeItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromoCodeItem> {
        @Override // android.os.Parcelable.Creator
        public final PromoCodeItem createFromParcel(Parcel parcel) {
            return new PromoCodeItem(parcel.readString(), parcel.readInt(), (UniversalImage) parcel.readParcelable(PromoCodeItem.class.getClassLoader()), (PrintableText) parcel.readParcelable(PromoCodeItem.class.getClassLoader()), (PrintableText) parcel.readParcelable(PromoCodeItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PromoCodeItem[] newArray(int i12) {
            return new PromoCodeItem[i12];
        }
    }

    public PromoCodeItem(@Y61.k String str, int i12, @Y61.l UniversalImage universalImage, @Y61.k PrintableText printableText, @Y61.l PrintableText printableText2, boolean z12, boolean z13) {
        this.f282186b = str;
        this.f282187c = i12;
        this.f282188d = universalImage;
        this.f282189e = printableText;
        this.f282190f = printableText2;
        this.f282191g = z12;
        this.f282192h = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoCodeItem)) {
            return false;
        }
        PromoCodeItem promoCodeItem = (PromoCodeItem) obj;
        return L.f(this.f282186b, promoCodeItem.f282186b) && this.f282187c == promoCodeItem.f282187c && L.f(this.f282188d, promoCodeItem.f282188d) && L.f(this.f282189e, promoCodeItem.f282189e) && L.f(this.f282190f, promoCodeItem.f282190f) && this.f282191g == promoCodeItem.f282191g && this.f282192h == promoCodeItem.f282192h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF258449b() {
        return this.f282186b;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f282187c, this.f282186b.hashCode() * 31, 31);
        UniversalImage universalImage = this.f282188d;
        int iF2 = com.avito.android.actions_sheet.a.f(this.f282189e, (iE2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31);
        PrintableText printableText = this.f282190f;
        return Boolean.hashCode(this.f282192h) + r.i((iF2 + (printableText != null ? printableText.hashCode() : 0)) * 31, 31, this.f282191g);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PromoCodeItem(stringId=");
        sb2.append(this.f282186b);
        sb2.append(", index=");
        sb2.append(this.f282187c);
        sb2.append(", image=");
        sb2.append(this.f282188d);
        sb2.append(", percent=");
        sb2.append(this.f282189e);
        sb2.append(", text=");
        sb2.append(this.f282190f);
        sb2.append(", isSelected=");
        sb2.append(this.f282191g);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f282192h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f282186b);
        parcel.writeInt(this.f282187c);
        parcel.writeParcelable(this.f282188d, i12);
        parcel.writeParcelable(this.f282189e, i12);
        parcel.writeParcelable(this.f282190f, i12);
        parcel.writeInt(this.f282191g ? 1 : 0);
        parcel.writeInt(this.f282192h ? 1 : 0);
    }
}
