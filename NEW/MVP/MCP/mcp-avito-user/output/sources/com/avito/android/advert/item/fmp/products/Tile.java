package com.avito.android.advert.item.fmp.products;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.fmp.Background;
import com.avito.android.remote.fmp.Icons;
import com.avito.android.remote.fmp.Margin;
import com.avito.android.remote.fmp.Padding;
import com.avito.android.remote.fmp.Size;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsFmpProductsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/fmp/products/Tile;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Tile implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<Tile> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AttributedText f75582b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f75583c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Icons f75584d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f75585e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Background f75586f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Padding f75587g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Margin f75588h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Size f75589i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final ArrayList f75590j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final ArrayList f75591k;

    /* compiled from: AdvertDetailsFmpProductsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Tile> {
        @Override // android.os.Parcelable.Creator
        public final Tile createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(Tile.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(Tile.class.getClassLoader());
            Icons icons = (Icons) parcel.readParcelable(Tile.class.getClassLoader());
            String string = parcel.readString();
            Background background = (Background) parcel.readParcelable(Tile.class.getClassLoader());
            Padding padding = (Padding) parcel.readParcelable(Tile.class.getClassLoader());
            Margin margin = (Margin) parcel.readParcelable(Tile.class.getClassLoader());
            Size size = (Size) parcel.readParcelable(Tile.class.getClassLoader());
            int iL2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(Tile.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(Tile.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new Tile(attributedText, attributedText2, icons, string, background, padding, margin, size, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Tile[] newArray(int i12) {
            return new Tile[i12];
        }
    }

    public Tile(@Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l Icons icons, @Y61.l String str, @Y61.l Background background, @Y61.l Padding padding, @Y61.l Margin margin, @Y61.l Size size, @Y61.l ArrayList arrayList, @Y61.l ArrayList arrayList2) {
        this.f75582b = attributedText;
        this.f75583c = attributedText2;
        this.f75584d = icons;
        this.f75585e = str;
        this.f75586f = background;
        this.f75587g = padding;
        this.f75588h = margin;
        this.f75589i = size;
        this.f75590j = arrayList;
        this.f75591k = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tile)) {
            return false;
        }
        Tile tile = (Tile) obj;
        return L.f(this.f75582b, tile.f75582b) && L.f(this.f75583c, tile.f75583c) && L.f(this.f75584d, tile.f75584d) && L.f(this.f75585e, tile.f75585e) && L.f(this.f75586f, tile.f75586f) && L.f(this.f75587g, tile.f75587g) && L.f(this.f75588h, tile.f75588h) && L.f(this.f75589i, tile.f75589i) && L.f(this.f75590j, tile.f75590j) && L.f(this.f75591k, tile.f75591k);
    }

    public final int hashCode() {
        AttributedText attributedText = this.f75582b;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.f75583c;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        Icons icons = this.f75584d;
        int iHashCode3 = (iHashCode2 + (icons == null ? 0 : icons.hashCode())) * 31;
        String str = this.f75585e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Background background = this.f75586f;
        int iHashCode5 = (iHashCode4 + (background == null ? 0 : background.hashCode())) * 31;
        Padding padding = this.f75587g;
        int iHashCode6 = (iHashCode5 + (padding == null ? 0 : padding.hashCode())) * 31;
        Margin margin = this.f75588h;
        int iHashCode7 = (iHashCode6 + (margin == null ? 0 : margin.hashCode())) * 31;
        Size size = this.f75589i;
        int iHashCode8 = (iHashCode7 + (size == null ? 0 : size.hashCode())) * 31;
        ArrayList arrayList = this.f75590j;
        int iHashCode9 = (iHashCode8 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f75591k;
        return iHashCode9 + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Tile(title=");
        sb2.append(this.f75582b);
        sb2.append(", subtitle=");
        sb2.append(this.f75583c);
        sb2.append(", icons=");
        sb2.append(this.f75584d);
        sb2.append(", deeplink=");
        sb2.append(this.f75585e);
        sb2.append(", background=");
        sb2.append(this.f75586f);
        sb2.append(", padding=");
        sb2.append(this.f75587g);
        sb2.append(", margin=");
        sb2.append(this.f75588h);
        sb2.append(", size=");
        sb2.append(this.f75589i);
        sb2.append(", onClick=");
        sb2.append(this.f75590j);
        sb2.append(", onAppear=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f75591k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f75582b, i12);
        parcel.writeParcelable(this.f75583c, i12);
        parcel.writeParcelable(this.f75584d, i12);
        parcel.writeString(this.f75585e);
        parcel.writeParcelable(this.f75586f, i12);
        parcel.writeParcelable(this.f75587g, i12);
        parcel.writeParcelable(this.f75588h, i12);
        parcel.writeParcelable(this.f75589i, i12);
        ArrayList arrayList = this.f75590j;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                parcel.writeParcelable((Parcelable) itY.next(), i12);
            }
        }
        ArrayList arrayList2 = this.f75591k;
        if (arrayList2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itY2 = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList2);
        while (itY2.hasNext()) {
            parcel.writeParcelable((Parcelable) itY2.next(), i12);
        }
    }
}
