package com.avito.android.rating.user_contacts.adapter.info;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.adapter.RatingDetailsItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InfoItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/user_contacts/adapter/info/InfoItem;", "Lcom/avito/android/adapter/RatingDetailsItem;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class InfoItem implements RatingDetailsItem {

    @k
    public static final Parcelable.Creator<InfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f247713b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f247714c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f247715d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f247716e;

    /* compiled from: InfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InfoItem> {
        @Override // android.os.Parcelable.Creator
        public final InfoItem createFromParcel(Parcel parcel) {
            return new InfoItem(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InfoItem[] newArray(int i12) {
            return new InfoItem[i12];
        }
    }

    public InfoItem(long j12, @k String str, @k String str2, @l String str3) {
        this.f247713b = j12;
        this.f247714c = str;
        this.f247715d = str2;
        this.f247716e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoItem)) {
            return false;
        }
        InfoItem infoItem = (InfoItem) obj;
        return this.f247713b == infoItem.f247713b && L.f(this.f247714c, infoItem.f247714c) && L.f(this.f247715d, infoItem.f247715d) && L.f(this.f247716e, infoItem.f247716e);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF222258b() {
        return this.f247713b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF244717b() {
        return this.f247714c;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(Long.hashCode(this.f247713b) * 31, 31, this.f247714c), 31, this.f247715d);
        String str = this.f247716e;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InfoItem(id=");
        sb2.append(this.f247713b);
        sb2.append(", stringId=");
        sb2.append(this.f247714c);
        sb2.append(", title=");
        sb2.append(this.f247715d);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.f247716e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f247713b);
        parcel.writeString(this.f247714c);
        parcel.writeString(this.f247715d);
        parcel.writeString(this.f247716e);
    }

    public /* synthetic */ InfoItem(long j12, String str, String str2, String str3, int i12, C42822w c42822w) {
        this(j12, (i12 & 2) != 0 ? String.valueOf(j12) : str, str2, str3);
    }
}
