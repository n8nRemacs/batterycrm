package com.avito.android.advert_collection_adding.adapter.advert_collection;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCollectionItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_adding/adapter/advert_collection/AdvertCollectionItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertCollectionItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<AdvertCollectionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f81752b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f81753c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f81754d;

    /* renamed from: e, reason: collision with root package name */
    public final int f81755e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Image f81756f;

    /* compiled from: AdvertCollectionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertCollectionItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertCollectionItem createFromParcel(Parcel parcel) {
            return new AdvertCollectionItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AdvertCollectionItem.class.getClassLoader()), (Image) parcel.readParcelable(AdvertCollectionItem.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertCollectionItem[] newArray(int i12) {
            return new AdvertCollectionItem[i12];
        }
    }

    public AdvertCollectionItem(@k String str, @k String str2, @k DeepLink deepLink, @l Image image, int i12) {
        this.f81752b = str;
        this.f81753c = str2;
        this.f81754d = deepLink;
        this.f81755e = i12;
        this.f81756f = image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertCollectionItem)) {
            return false;
        }
        AdvertCollectionItem advertCollectionItem = (AdvertCollectionItem) obj;
        return L.f(this.f81752b, advertCollectionItem.f81752b) && L.f(this.f81753c, advertCollectionItem.f81753c) && L.f(this.f81754d, advertCollectionItem.f81754d) && this.f81755e == advertCollectionItem.f81755e && L.f(this.f81756f, advertCollectionItem.f81756f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83467b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145164b() {
        return this.f81752b;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f81755e, com.avito.android.actions_sheet.a.e(this.f81754d, H.d(this.f81752b.hashCode() * 31, 31, this.f81753c), 31), 31);
        Image image = this.f81756f;
        return iE2 + (image == null ? 0 : image.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertCollectionItem(stringId=");
        sb2.append(this.f81752b);
        sb2.append(", name=");
        sb2.append(this.f81753c);
        sb2.append(", deepLink=");
        sb2.append(this.f81754d);
        sb2.append(", size=");
        sb2.append(this.f81755e);
        sb2.append(", image=");
        return AK.c.o(sb2, this.f81756f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f81752b);
        parcel.writeString(this.f81753c);
        parcel.writeParcelable(this.f81754d, i12);
        parcel.writeInt(this.f81755e);
        parcel.writeParcelable(this.f81756f, i12);
    }
}
