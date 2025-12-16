package com.avito.android.vas_planning_checkout.item.checkout;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PlanCheckoutItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/item/checkout/PlanCheckoutItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlanCheckoutItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<PlanCheckoutItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f322911b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f322912c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f322913d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f322914e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Image f322915f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f322916g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f322917h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f322918i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Integer f322919j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f322920k;

    /* compiled from: PlanCheckoutItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PlanCheckoutItem> {
        @Override // android.os.Parcelable.Creator
        public final PlanCheckoutItem createFromParcel(Parcel parcel) {
            return new PlanCheckoutItem(parcel.readString(), (AttributedText) parcel.readParcelable(PlanCheckoutItem.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(PlanCheckoutItem.class.getClassLoader()), (Image) parcel.readParcelable(PlanCheckoutItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PlanCheckoutItem[] newArray(int i12) {
            return new PlanCheckoutItem[i12];
        }
    }

    public PlanCheckoutItem(@k String str, @k AttributedText attributedText, @l String str2, @l AttributedText attributedText2, @k Image image, boolean z12, boolean z13, boolean z14, @l Integer num, @l String str3) {
        this.f322911b = str;
        this.f322912c = attributedText;
        this.f322913d = str2;
        this.f322914e = attributedText2;
        this.f322915f = image;
        this.f322916g = z12;
        this.f322917h = z13;
        this.f322918i = z14;
        this.f322919j = num;
        this.f322920k = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlanCheckoutItem)) {
            return false;
        }
        PlanCheckoutItem planCheckoutItem = (PlanCheckoutItem) obj;
        return L.f(this.f322911b, planCheckoutItem.f322911b) && L.f(this.f322912c, planCheckoutItem.f322912c) && L.f(this.f322913d, planCheckoutItem.f322913d) && L.f(this.f322914e, planCheckoutItem.f322914e) && L.f(this.f322915f, planCheckoutItem.f322915f) && this.f322916g == planCheckoutItem.f322916g && this.f322917h == planCheckoutItem.f322917h && this.f322918i == planCheckoutItem.f322918i && L.f(this.f322919j, planCheckoutItem.f322919j) && L.f(this.f322920k, planCheckoutItem.f322920k);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287615b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF323933b() {
        return this.f322911b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.f322911b.hashCode() * 31, 31, this.f322912c);
        String str = this.f322913d;
        int iHashCode = (iB2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f322914e;
        int i12 = r.i(r.i(r.i(com.avito.android.actions_sheet.a.g(this.f322915f, (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31), 31, this.f322916g), 31, this.f322917h), 31, this.f322918i);
        Integer num = this.f322919j;
        int iHashCode2 = (i12 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f322920k;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlanCheckoutItem(stringId=");
        sb2.append(this.f322911b);
        sb2.append(", title=");
        sb2.append(this.f322912c);
        sb2.append(", price=");
        sb2.append(this.f322913d);
        sb2.append(", oldPrice=");
        sb2.append(this.f322914e);
        sb2.append(", picture=");
        sb2.append(this.f322915f);
        sb2.append(", hasProlongation=");
        sb2.append(this.f322916g);
        sb2.append(", isCancellable=");
        sb2.append(this.f322917h);
        sb2.append(", isActive=");
        sb2.append(this.f322918i);
        sb2.append(", priceValue=");
        sb2.append(this.f322919j);
        sb2.append(", badge=");
        return C22026a.c(sb2, this.f322920k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f322911b);
        parcel.writeParcelable(this.f322912c, i12);
        parcel.writeString(this.f322913d);
        parcel.writeParcelable(this.f322914e, i12);
        parcel.writeParcelable(this.f322915f, i12);
        parcel.writeInt(this.f322916g ? 1 : 0);
        parcel.writeInt(this.f322917h ? 1 : 0);
        parcel.writeInt(this.f322918i ? 1 : 0);
        Integer num = this.f322919j;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f322920k);
    }
}
