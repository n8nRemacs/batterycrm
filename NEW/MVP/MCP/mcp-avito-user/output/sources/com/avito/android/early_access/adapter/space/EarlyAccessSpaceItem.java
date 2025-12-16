package com.avito.android.early_access.adapter.space;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessSpaceItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/adapter/space/EarlyAccessSpaceItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessSpaceItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<EarlyAccessSpaceItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f145248b;

    /* renamed from: c, reason: collision with root package name */
    public final int f145249c;

    /* compiled from: EarlyAccessSpaceItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessSpaceItem> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessSpaceItem createFromParcel(Parcel parcel) {
            return new EarlyAccessSpaceItem(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessSpaceItem[] newArray(int i12) {
            return new EarlyAccessSpaceItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EarlyAccessSpaceItem() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessSpaceItem)) {
            return false;
        }
        EarlyAccessSpaceItem earlyAccessSpaceItem = (EarlyAccessSpaceItem) obj;
        return L.f(this.f145248b, earlyAccessSpaceItem.f145248b) && this.f145249c == earlyAccessSpaceItem.f145249c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84654b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145248b() {
        return this.f145248b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f145249c) + (this.f145248b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessSpaceItem(stringId=");
        sb2.append(this.f145248b);
        sb2.append(", heightTopDp=");
        return r.t(sb2, this.f145249c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f145248b);
        parcel.writeInt(this.f145249c);
    }

    public EarlyAccessSpaceItem(@k String str, int i12) {
        this.f145248b = str;
        this.f145249c = i12;
    }

    public /* synthetic */ EarlyAccessSpaceItem(String str, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? EarlyAccessSpaceItem.class.getName() : str, (i13 & 2) != 0 ? 0 : i12);
    }
}
