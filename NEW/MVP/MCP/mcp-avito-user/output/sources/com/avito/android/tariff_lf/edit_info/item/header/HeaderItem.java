package com.avito.android.tariff_lf.edit_info.item.header;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.foundation.H;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HeaderItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/header/HeaderItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HeaderItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<HeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f298989b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f298990c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final CharSequence f298991d;

    /* compiled from: HeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final HeaderItem createFromParcel(Parcel parcel) {
            return new HeaderItem(parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final HeaderItem[] newArray(int i12) {
            return new HeaderItem[i12];
        }
    }

    public HeaderItem(@k String str, @k String str2, @l CharSequence charSequence) {
        this.f298989b = str;
        this.f298990c = str2;
        this.f298991d = charSequence;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderItem)) {
            return false;
        }
        HeaderItem headerItem = (HeaderItem) obj;
        return L.f(this.f298989b, headerItem.f298989b) && L.f(this.f298990c, headerItem.f298990c) && L.f(this.f298991d, headerItem.f298991d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272342b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF290919b() {
        return this.f298989b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f298989b.hashCode() * 31, 31, this.f298990c);
        CharSequence charSequence = this.f298991d;
        return iD2 + (charSequence == null ? 0 : charSequence.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderItem(stringId=");
        sb2.append(this.f298989b);
        sb2.append(", title=");
        sb2.append(this.f298990c);
        sb2.append(", description=");
        return AK.c.r(sb2, this.f298991d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f298989b);
        parcel.writeString(this.f298990c);
        TextUtils.writeToParcel(this.f298991d, parcel, i12);
    }
}
