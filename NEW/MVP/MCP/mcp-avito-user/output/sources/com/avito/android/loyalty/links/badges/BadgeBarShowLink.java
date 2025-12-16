package com.avito.android.loyalty.links.badges;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: BadgeBarShowLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/links/badges/BadgeBarShowLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final class BadgeBarShowLink extends DeepLink {

    @k
    public static final Parcelable.Creator<BadgeBarShowLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f183213b;

    /* compiled from: BadgeBarShowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BadgeBarShowLink> {
        @Override // android.os.Parcelable.Creator
        public final BadgeBarShowLink createFromParcel(Parcel parcel) {
            return new BadgeBarShowLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeBarShowLink[] newArray(int i12) {
            return new BadgeBarShowLink[i12];
        }
    }

    public BadgeBarShowLink(@k String str) {
        this.f183213b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f183213b);
    }
}
