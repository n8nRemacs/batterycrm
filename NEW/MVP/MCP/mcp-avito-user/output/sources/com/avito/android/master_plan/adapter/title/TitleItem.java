package com.avito.android.master_plan.adapter.title;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TitleItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/master_plan/adapter/title/TitleItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TitleItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<TitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f186010b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f186011c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f186012d;

    /* compiled from: TitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TitleItem> {
        @Override // android.os.Parcelable.Creator
        public final TitleItem createFromParcel(Parcel parcel) {
            return new TitleItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TitleItem[] newArray(int i12) {
            return new TitleItem[i12];
        }
    }

    public TitleItem(@k String str, @k String str2, @l String str3) {
        this.f186010b = str;
        this.f186011c = str2;
        this.f186012d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleItem)) {
            return false;
        }
        TitleItem titleItem = (TitleItem) obj;
        return L.f(this.f186010b, titleItem.f186010b) && L.f(this.f186011c, titleItem.f186011c) && L.f(this.f186012d, titleItem.f186012d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183941b() {
        return this.f186010b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f186010b.hashCode() * 31, 31, this.f186011c);
        String str = this.f186012d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TitleItem(stringId=");
        sb2.append(this.f186010b);
        sb2.append(", title=");
        sb2.append(this.f186011c);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f186012d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f186010b);
        parcel.writeString(this.f186011c);
        parcel.writeString(this.f186012d);
    }
}
