package com.avito.android.early_access.adapter.image;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessParameterItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/adapter/image/EarlyAccessImageItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessImageItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<EarlyAccessImageItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f145135b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UniversalImage f145136c;

    /* compiled from: EarlyAccessParameterItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessImageItem> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessImageItem createFromParcel(Parcel parcel) {
            return new EarlyAccessImageItem(parcel.readString(), (UniversalImage) parcel.readParcelable(EarlyAccessImageItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessImageItem[] newArray(int i12) {
            return new EarlyAccessImageItem[i12];
        }
    }

    public EarlyAccessImageItem(@k String str, @k UniversalImage universalImage) {
        this.f145135b = str;
        this.f145136c = universalImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessImageItem)) {
            return false;
        }
        EarlyAccessImageItem earlyAccessImageItem = (EarlyAccessImageItem) obj;
        return L.f(this.f145135b, earlyAccessImageItem.f145135b) && L.f(this.f145136c, earlyAccessImageItem.f145136c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80616b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145135b() {
        return this.f145135b;
    }

    public final int hashCode() {
        return this.f145136c.hashCode() + (this.f145135b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessImageItem(stringId=");
        sb2.append(this.f145135b);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f145136c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f145135b);
        parcel.writeParcelable(this.f145136c, i12);
    }

    public /* synthetic */ EarlyAccessImageItem(String str, UniversalImage universalImage, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? EarlyAccessImageItem.class.getName() : str, universalImage);
    }
}
