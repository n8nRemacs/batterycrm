package com.avito.android.advert.item.adress_hint;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AddressHint.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/adress_hint/AddressHint;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AddressHint implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AddressHint> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f72665b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f72666c;

    /* renamed from: d, reason: collision with root package name */
    public final int f72667d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f72668e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f72669f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f72670g;

    /* compiled from: AddressHint.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddressHint> {
        @Override // android.os.Parcelable.Creator
        public final AddressHint createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            return new AddressHint(parcel.readInt(), j12, SerpDisplayType.valueOf(parcel.readString()), (AttributedText) parcel.readParcelable(AddressHint.class.getClassLoader()), SerpViewType.valueOf(parcel.readString()), string);
        }

        @Override // android.os.Parcelable.Creator
        public final AddressHint[] newArray(int i12) {
            return new AddressHint[i12];
        }
    }

    public AddressHint(int i12, long j12, @k SerpDisplayType serpDisplayType, @k AttributedText attributedText, @k SerpViewType serpViewType, @k String str) {
        this.f72665b = j12;
        this.f72666c = str;
        this.f72667d = i12;
        this.f72668e = attributedText;
        this.f72669f = serpDisplayType;
        this.f72670g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f72669f;
        return new AddressHint(i12, this.f72665b, serpDisplayType, this.f72668e, this.f72670g, this.f72666c);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f72669f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressHint)) {
            return false;
        }
        AddressHint addressHint = (AddressHint) obj;
        return this.f72665b == addressHint.f72665b && L.f(this.f72666c, addressHint.f72666c) && this.f72667d == addressHint.f72667d && L.f(this.f72668e, addressHint.f72668e) && this.f72669f == addressHint.f72669f && this.f72670g == addressHint.f72670g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF282036b() {
        return this.f72665b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF84111f() {
        return this.f72667d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145080b() {
        return this.f72666c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84110e() {
        return this.f72670g;
    }

    public final int hashCode() {
        return this.f72670g.hashCode() + com.avito.android.actions_sheet.a.h(this.f72669f, com.avito.android.actions_sheet.a.b(r.e(this.f72667d, H.d(Long.hashCode(this.f72665b) * 31, 31, this.f72666c), 31), 31, this.f72668e), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressHint(id=");
        sb2.append(this.f72665b);
        sb2.append(", stringId=");
        sb2.append(this.f72666c);
        sb2.append(", spanCount=");
        sb2.append(this.f72667d);
        sb2.append(", text=");
        sb2.append(this.f72668e);
        sb2.append(", displayType=");
        sb2.append(this.f72669f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f72670g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f72665b);
        parcel.writeString(this.f72666c);
        parcel.writeInt(this.f72667d);
        parcel.writeParcelable(this.f72668e, i12);
        parcel.writeString(this.f72669f.name());
        parcel.writeString(this.f72670g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AddressHint(long j12, String str, int i12, AttributedText attributedText, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 10;
        } else {
            j13 = j12;
        }
        this(i12, j13, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, attributedText, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 2) != 0 ? String.valueOf(j13) : str);
    }
}
