package com.avito.android.loyalty.links;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: BadgeBarShowListLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/links/BadgeBarShowListLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "_avito_loyalty_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class BadgeBarShowListLink extends DeepLink {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final BadgeBarShowListLink f183211b = new BadgeBarShowListLink();

    @k
    public static final Parcelable.Creator<BadgeBarShowListLink> CREATOR = new a();

    /* compiled from: BadgeBarShowListLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BadgeBarShowListLink> {
        @Override // android.os.Parcelable.Creator
        public final BadgeBarShowListLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return BadgeBarShowListLink.f183211b;
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeBarShowListLink[] newArray(int i12) {
            return new BadgeBarShowListLink[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        return this == obj || (obj instanceof BadgeBarShowListLink);
    }

    public final int hashCode() {
        return 1677676269;
    }

    @k
    public final String toString() {
        return "BadgeBarShowListLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
