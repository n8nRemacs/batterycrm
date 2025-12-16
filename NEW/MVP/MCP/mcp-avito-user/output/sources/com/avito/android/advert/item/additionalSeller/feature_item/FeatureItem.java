package com.avito.android.advert.item.additionalSeller.feature_item;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: FeatureItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/additionalSeller/feature_item/FeatureItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FeatureItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<FeatureItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f72570b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f72571c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Image f72572d;

    /* compiled from: FeatureItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FeatureItem> {
        @Override // android.os.Parcelable.Creator
        public final FeatureItem createFromParcel(Parcel parcel) {
            return new FeatureItem(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(FeatureItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FeatureItem[] newArray(int i12) {
            return new FeatureItem[i12];
        }
    }

    public FeatureItem(@k String str, @k String str2, @k Image image) {
        this.f72570b = str;
        this.f72571c = str2;
        this.f72572d = image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124012b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF20568b() {
        return this.f72570b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f72570b);
        parcel.writeString(this.f72571c);
        parcel.writeParcelable(this.f72572d, i12);
    }
}
