package com.avito.android.bundles.vas_union.item.header;

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

/* compiled from: VasBundlesHeaderItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/header/VasBundlesHeaderItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class VasBundlesHeaderItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<VasBundlesHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f108575b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f108576c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final CharSequence f108577d;

    /* compiled from: VasBundlesHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasBundlesHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final VasBundlesHeaderItem createFromParcel(Parcel parcel) {
            return new VasBundlesHeaderItem(parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VasBundlesHeaderItem[] newArray(int i12) {
            return new VasBundlesHeaderItem[i12];
        }
    }

    public VasBundlesHeaderItem(@k String str, @k String str2, @l CharSequence charSequence) {
        this.f108575b = str;
        this.f108576c = str2;
        this.f108577d = charSequence;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VasBundlesHeaderItem)) {
            return false;
        }
        VasBundlesHeaderItem vasBundlesHeaderItem = (VasBundlesHeaderItem) obj;
        return L.f(this.f108575b, vasBundlesHeaderItem.f108575b) && L.f(this.f108576c, vasBundlesHeaderItem.f108576c) && L.f(this.f108577d, vasBundlesHeaderItem.f108577d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80676b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF80677c() {
        return this.f108575b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f108575b.hashCode() * 31, 31, this.f108576c);
        CharSequence charSequence = this.f108577d;
        return iD2 + (charSequence == null ? 0 : charSequence.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasBundlesHeaderItem(stringId=");
        sb2.append(this.f108575b);
        sb2.append(", title=");
        sb2.append(this.f108576c);
        sb2.append(", description=");
        return AK.c.r(sb2, this.f108577d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f108575b);
        parcel.writeString(this.f108576c);
        TextUtils.writeToParcel(this.f108577d, parcel, i12);
    }
}
