package com.avito.android.loyalty.links;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: BadgeBarShowV3Link.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/links/BadgeBarShowV3Link;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_loyalty_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final class BadgeBarShowV3Link extends DeepLink {

    @k
    public static final Parcelable.Creator<BadgeBarShowV3Link> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f183212b;

    /* compiled from: BadgeBarShowV3Link.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BadgeBarShowV3Link> {
        @Override // android.os.Parcelable.Creator
        public final BadgeBarShowV3Link createFromParcel(Parcel parcel) {
            return new BadgeBarShowV3Link(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeBarShowV3Link[] newArray(int i12) {
            return new BadgeBarShowV3Link[i12];
        }
    }

    public BadgeBarShowV3Link(@k String str) {
        this.f183212b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f183212b);
    }
}
