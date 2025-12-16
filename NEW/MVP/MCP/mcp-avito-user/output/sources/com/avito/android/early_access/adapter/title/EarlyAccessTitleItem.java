package com.avito.android.early_access.adapter.title;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessTitleItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/adapter/title/EarlyAccessTitleItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessTitleItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<EarlyAccessTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f145250b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f145251c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final HeaderType f145252d;

    /* compiled from: EarlyAccessTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessTitleItem createFromParcel(Parcel parcel) {
            return new EarlyAccessTitleItem(parcel.readString(), parcel.readString(), HeaderType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessTitleItem[] newArray(int i12) {
            return new EarlyAccessTitleItem[i12];
        }
    }

    public EarlyAccessTitleItem(@k String str, @k String str2, @k HeaderType headerType) {
        this.f145250b = str;
        this.f145251c = str2;
        this.f145252d = headerType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessTitleItem)) {
            return false;
        }
        EarlyAccessTitleItem earlyAccessTitleItem = (EarlyAccessTitleItem) obj;
        return L.f(this.f145250b, earlyAccessTitleItem.f145250b) && L.f(this.f145251c, earlyAccessTitleItem.f145251c) && this.f145252d == earlyAccessTitleItem.f145252d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145250b() {
        return this.f145250b;
    }

    public final int hashCode() {
        return this.f145252d.hashCode() + H.d(this.f145250b.hashCode() * 31, 31, this.f145251c);
    }

    @k
    public final String toString() {
        return "EarlyAccessTitleItem(stringId=" + this.f145250b + ", title=" + this.f145251c + ", headerType=" + this.f145252d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f145250b);
        parcel.writeString(this.f145251c);
        parcel.writeString(this.f145252d.name());
    }

    public /* synthetic */ EarlyAccessTitleItem(String str, String str2, HeaderType headerType, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? EarlyAccessTitleItem.class.getName() : str, str2, (i12 & 4) != 0 ? HeaderType.f145253b : headerType);
    }
}
