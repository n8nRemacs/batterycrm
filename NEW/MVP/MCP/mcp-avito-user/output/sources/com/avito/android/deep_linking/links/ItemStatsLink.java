package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: ItemStatsLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ItemStatsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class ItemStatsLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ItemStatsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133400b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Boolean f133401c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133402d;

    /* compiled from: ItemStatsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemStatsLink> {
        @Override // android.os.Parcelable.Creator
        public final ItemStatsLink createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ItemStatsLink(boolValueOf, string, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemStatsLink[] newArray(int i12) {
            return new ItemStatsLink[i12];
        }
    }

    public /* synthetic */ ItemStatsLink(String str, Boolean bool, String str2, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? Boolean.FALSE : bool, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemStatsLink)) {
            return false;
        }
        ItemStatsLink itemStatsLink = (ItemStatsLink) obj;
        return kotlin.jvm.internal.L.f(this.f133400b, itemStatsLink.f133400b) && kotlin.jvm.internal.L.f(this.f133401c, itemStatsLink.f133401c) && kotlin.jvm.internal.L.f(this.f133402d, itemStatsLink.f133402d);
    }

    public final int hashCode() {
        int iHashCode = this.f133400b.hashCode() * 31;
        Boolean bool = this.f133401c;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f133402d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemStatsLink(itemId=");
        sb2.append(this.f133400b);
        sb2.append(", isExtendedStatistics=");
        sb2.append(this.f133401c);
        sb2.append(", slug=");
        return C22026a.c(sb2, this.f133402d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133400b);
        Boolean bool = this.f133401c;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.f133402d);
    }

    public ItemStatsLink(@Y61.l Boolean bool, @Y61.k String str, @Y61.l String str2) {
        this.f133400b = str;
        this.f133401c = bool;
        this.f133402d = str2;
    }
}
