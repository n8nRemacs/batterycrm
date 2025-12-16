package com.avito.android.sx_address.list.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ScreenData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/domain/PromotionData;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PromotionData implements ParcelableItem {

    @k
    public static final Parcelable.Creator<PromotionData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f293160b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PromotionImageData f293161c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f293162d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f293163e;

    /* compiled from: ScreenData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromotionData> {
        @Override // android.os.Parcelable.Creator
        public final PromotionData createFromParcel(Parcel parcel) {
            return new PromotionData((AttributedText) parcel.readParcelable(PromotionData.class.getClassLoader()), PromotionImageData.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionData[] newArray(int i12) {
            return new PromotionData[i12];
        }
    }

    public PromotionData(@k AttributedText attributedText, @k PromotionImageData promotionImageData, @k String str, @k String str2) {
        this.f293160b = attributedText;
        this.f293161c = promotionImageData;
        this.f293162d = str;
        this.f293163e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionData)) {
            return false;
        }
        PromotionData promotionData = (PromotionData) obj;
        return L.f(this.f293160b, promotionData.f293160b) && L.f(this.f293161c, promotionData.f293161c) && L.f(this.f293162d, promotionData.f293162d) && L.f(this.f293163e, promotionData.f293163e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF289505b() {
        return this.f293163e;
    }

    public final int hashCode() {
        return this.f293163e.hashCode() + H.d((this.f293161c.hashCode() + (this.f293160b.hashCode() * 31)) * 31, 31, this.f293162d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PromotionData(description=");
        sb2.append(this.f293160b);
        sb2.append(", image=");
        sb2.append(this.f293161c);
        sb2.append(", title=");
        sb2.append(this.f293162d);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f293163e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f293160b, i12);
        this.f293161c.writeToParcel(parcel, i12);
        parcel.writeString(this.f293162d);
        parcel.writeString(this.f293163e);
    }
}
