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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/fmp/products/MortgageTile;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MortgageTile implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<MortgageTile> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AttributedText f75569b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f75570c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f75571d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Icons f75572e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f75573f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f75574g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f75575h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Background f75576i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Padding f75577j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Margin f75578k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Size f75579l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final ArrayList f75580m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final ArrayList f75581n;

    /* compiled from: AdvertDetailsFmpProductsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageTile> {
        @Override // android.os.Parcelable.Creator
        public final MortgageTile createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(MortgageTile.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(MortgageTile.class.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Icons icons = (Icons) parcel.readParcelable(MortgageTile.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Background background = (Background) parcel.readParcelable(MortgageTile.class.getClassLoader());
            Padding padding = (Padding) parcel.readParcelable(MortgageTile.class.getClassLoader());
            Margin margin = (Margin) parcel.readParcelable(MortgageTile.class.getClassLoader());
            Size size = (Size) parcel.readParcelable(MortgageTile.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(MortgageTile.class, parcel, arrayList4, iL2, 1);
                    i12 = i12;
                }
                arrayList = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList;
                arrayList3 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i13);
                arrayList2 = arrayList;
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(MortgageTile.class, parcel, arrayList5, iL3, 1);
                    i13 = i13;
                }
                arrayList3 = arrayList5;
            }
            return new MortgageTile(attributedText, attributedText2, numValueOf, icons, string, string2, string3, background, padding, margin, size, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageTile[] newArray(int i12) {
            return new MortgageTile[i12];
        }
    }

    public MortgageTile(@Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l Integer num, @Y61.l Icons icons, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Background background, @Y61.l Padding padding, @Y61.l Margin margin, @Y61.l Size size, @Y61.l ArrayList arrayList, @Y61.l ArrayList arrayList2) {
        this.f75569b = attributedText;
        this.f75570c = attributedText2;
        this.f75571d = num;
        this.f75572e = icons;
        this.f75573f = str;
        this.f75574g = str2;
        this.f75575h = str3;
        this.f75576i = background;
        this.f75577j = padding;
        this.f75578k = margin;
        this.f75579l = size;
        this.f75580m = arrayList;
        this.f75581n = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageTile)) {
            return false;
        }
        MortgageTile mortgageTile = (MortgageTile) obj;
        return L.f(this.f75569b, mortgageTile.f75569b) && L.f(this.f75570c, mortgageTile.f75570c) && L.f(this.f75571d, mortgageTile.f75571d) && L.f(this.f75572e, mortgageTile.f75572e) && L.f(this.f75573f, mortgageTile.f75573f) && L.f(this.f75574g, mortgageTile.f75574g) && L.f(this.f75575h, mortgageTile.f75575h) && L.f(this.f75576i, mortgageTile.f75576i) && L.f(this.f75577j, mortgageTile.f75577j) && L.f(this.f75578k, mortgageTile.f75578k) && L.f(this.f75579l, mortgageTile.f75579l) && L.f(this.f75580m, mortgageTile.f75580m) && L.f(this.f75581n, mortgageTile.f75581n);
    }

    public final int hashCode() {
        AttributedText attributedText = this.f75569b;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.f75570c;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        Integer num = this.f75571d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Icons icons = this.f75572e;
        int iHashCode4 = (iHashCode3 + (icons == null ? 0 : icons.hashCode())) * 31;
        String str = this.f75573f;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f75574g;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f75575h;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Background background = this.f75576i;
        int iHashCode8 = (iHashCode7 + (background == null ? 0 : background.hashCode())) * 31;
        Padding padding = this.f75577j;
        int iHashCode9 = (iHashCode8 + (padding == null ? 0 : padding.hashCode())) * 31;
        Margin margin = this.f75578k;
        int iHashCode10 = (iHashCode9 + (margin == null ? 0 : margin.hashCode())) * 31;
        Size size = this.f75579l;
        int iHashCode11 = (iHashCode10 + (size == null ? 0 : size.hashCode())) * 31;
        ArrayList arrayList = this.f75580m;
        int iHashCode12 = (iHashCode11 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f75581n;
        return iHashCode12 + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageTile(title=");
        sb2.append(this.f75569b);
        sb2.append(", subtitle=");
        sb2.append(this.f75570c);
        sb2.append(", position=");
        sb2.append(this.f75571d);
        sb2.append(", icons=");
        sb2.append(this.f75572e);
        sb2.append(", errorOffersTitle=");
        sb2.append(this.f75573f);
        sb2.append(", paymentTemplate=");
        sb2.append(this.f75574g);
        sb2.append(", deeplink=");
        sb2.append(this.f75575h);
        sb2.append(", background=");
        sb2.append(this.f75576i);
        sb2.append(", padding=");
        sb2.append(this.f75577j);
        sb2.append(", margin=");
        sb2.append(this.f75578k);
        sb2.append(", size=");
        sb2.append(this.f75579l);
        sb2.append(", onClick=");
        sb2.append(this.f75580m);
        sb2.append(", onAppear=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f75581n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f75569b, i12);
        parcel.writeParcelable(this.f75570c, i12);
        Integer num = this.f75571d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f75572e, i12);
        parcel.writeString(this.f75573f);
        parcel.writeString(this.f75574g);
        parcel.writeString(this.f75575h);
        parcel.writeParcelable(this.f75576i, i12);
        parcel.writeParcelable(this.f75577j, i12);
        parcel.writeParcelable(this.f75578k, i12);
        parcel.writeParcelable(this.f75579l, i12);
        ArrayList arrayList = this.f75580m;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                parcel.writeParcelable((Parcelable) itY.next(), i12);
            }
        }
        ArrayList arrayList2 = this.f75581n;
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
