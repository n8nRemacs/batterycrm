package com.avito.android.publish.items.button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeepLinkActionButtonItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/button/DeepLinkActionButtonItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class DeepLinkActionButtonItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<DeepLinkActionButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f236782b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f236783c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f236784d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DeepLink f236785e;

    /* compiled from: DeepLinkActionButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeepLinkActionButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final DeepLinkActionButtonItem createFromParcel(Parcel parcel) {
            return new DeepLinkActionButtonItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(DeepLinkActionButtonItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DeepLinkActionButtonItem[] newArray(int i12) {
            return new DeepLinkActionButtonItem[i12];
        }
    }

    public DeepLinkActionButtonItem(@k String str, @k String str2, @k String str3, @k DeepLink deepLink) {
        this.f236782b = str;
        this.f236783c = str2;
        this.f236784d = str3;
        this.f236785e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkActionButtonItem)) {
            return false;
        }
        DeepLinkActionButtonItem deepLinkActionButtonItem = (DeepLinkActionButtonItem) obj;
        return L.f(this.f236782b, deepLinkActionButtonItem.f236782b) && L.f(this.f236783c, deepLinkActionButtonItem.f236783c) && L.f(this.f236784d, deepLinkActionButtonItem.f236784d) && L.f(this.f236785e, deepLinkActionButtonItem.f236785e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF76078b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183828b() {
        return this.f236782b;
    }

    public final int hashCode() {
        return this.f236785e.hashCode() + H.d(H.d(this.f236782b.hashCode() * 31, 31, this.f236783c), 31, this.f236784d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeepLinkActionButtonItem(stringId=");
        sb2.append(this.f236782b);
        sb2.append(", style=");
        sb2.append(this.f236783c);
        sb2.append(", title=");
        sb2.append(this.f236784d);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f236785e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f236782b);
        parcel.writeString(this.f236783c);
        parcel.writeString(this.f236784d);
        parcel.writeParcelable(this.f236785e, i12);
    }
}
