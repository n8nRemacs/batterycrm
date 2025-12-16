package com.avito.android.favorites.adapter.disclaimer;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.conveyor_item.a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DisclaimerWidgetItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/disclaimer/DisclaimerWidgetItem;", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DisclaimerWidgetItem implements FavoriteListItem {

    @k
    public static final Parcelable.Creator<DisclaimerWidgetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f156548b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f156549c;

    /* compiled from: DisclaimerWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DisclaimerWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final DisclaimerWidgetItem createFromParcel(Parcel parcel) {
            return new DisclaimerWidgetItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DisclaimerWidgetItem[] newArray(int i12) {
            return new DisclaimerWidgetItem[i12];
        }
    }

    public DisclaimerWidgetItem(@k String str, @l String str2) {
        this.f156548b = str;
        this.f156549c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisclaimerWidgetItem)) {
            return false;
        }
        DisclaimerWidgetItem disclaimerWidgetItem = (DisclaimerWidgetItem) obj;
        return L.f(this.f156548b, disclaimerWidgetItem.f156548b) && L.f(this.f156549c, disclaimerWidgetItem.f156549c);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF150574d() {
        return this.f156548b;
    }

    public final int hashCode() {
        int iHashCode = this.f156548b.hashCode() * 31;
        String str = this.f156549c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisclaimerWidgetItem(stringId=");
        sb2.append(this.f156548b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f156549c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f156548b);
        parcel.writeString(this.f156549c);
    }

    public /* synthetic */ DisclaimerWidgetItem(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? UUID.randomUUID().toString() : str, str2);
    }
}
