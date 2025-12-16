package com.avito.android.early_access.adapter.bundle;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessBundleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/adapter/bundle/EarlyAccessBundleDividerItem;", "Lcom/avito/android/early_access/adapter/bundle/EarlyAccessBundleItem;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessBundleDividerItem extends EarlyAccessBundleItem {

    @Y61.k
    public static final Parcelable.Creator<EarlyAccessBundleDividerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f145095b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f145096c;

    /* compiled from: EarlyAccessBundleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessBundleDividerItem> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessBundleDividerItem createFromParcel(Parcel parcel) {
            return new EarlyAccessBundleDividerItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessBundleDividerItem[] newArray(int i12) {
            return new EarlyAccessBundleDividerItem[i12];
        }
    }

    public /* synthetic */ EarlyAccessBundleDividerItem(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? EarlyAccessBundleDividerItem.class.getName() : str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessBundleDividerItem)) {
            return false;
        }
        EarlyAccessBundleDividerItem earlyAccessBundleDividerItem = (EarlyAccessBundleDividerItem) obj;
        return L.f(this.f145095b, earlyAccessBundleDividerItem.f145095b) && L.f(this.f145096c, earlyAccessBundleDividerItem.f145096c);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145095b() {
        return this.f145095b;
    }

    public final int hashCode() {
        return this.f145096c.hashCode() + (this.f145095b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessBundleDividerItem(stringId=");
        sb2.append(this.f145095b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f145096c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f145095b);
        parcel.writeString(this.f145096c);
    }

    public EarlyAccessBundleDividerItem(@Y61.k String str, @Y61.k String str2) {
        super(null);
        this.f145095b = str;
        this.f145096c = str2;
    }
}
