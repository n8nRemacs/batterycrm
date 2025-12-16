package com.avito.android.user_address.suggest.data;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/suggest/data/SuggestItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SuggestItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<SuggestItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f308023b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f308024c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f308025d;

    /* compiled from: SuggestItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuggestItem> {
        @Override // android.os.Parcelable.Creator
        public final SuggestItem createFromParcel(Parcel parcel) {
            return new SuggestItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestItem[] newArray(int i12) {
            return new SuggestItem[i12];
        }
    }

    public SuggestItem(@k String str, @k String str2, @k String str3) {
        this.f308023b = str;
        this.f308024c = str2;
        this.f308025d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestItem)) {
            return false;
        }
        SuggestItem suggestItem = (SuggestItem) obj;
        return L.f(this.f308023b, suggestItem.f308023b) && L.f(this.f308024c, suggestItem.f308024c) && L.f(this.f308025d, suggestItem.f308025d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF301123b() {
        return this.f308025d;
    }

    public final int hashCode() {
        return this.f308025d.hashCode() + H.d(this.f308023b.hashCode() * 31, 31, this.f308024c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestItem(title=");
        sb2.append(this.f308023b);
        sb2.append(", subtitle=");
        sb2.append(this.f308024c);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f308025d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f308023b);
        parcel.writeString(this.f308024c);
        parcel.writeString(this.f308025d);
    }
}
