package com.avito.android.short_term_rent.view.components.retro_badges.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RetroBadgeItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/view/components/retro_badges/entity/RetroBadgeItem;", "Landroid/os/Parcelable;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RetroBadgeItem implements Parcelable {

    @k
    public static final Parcelable.Creator<RetroBadgeItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RetroBadgeItemSize f283045b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f283046c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f283047d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final RetroBadgeItemHint f283048e;

    /* compiled from: RetroBadgeItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RetroBadgeItem> {
        @Override // android.os.Parcelable.Creator
        public final RetroBadgeItem createFromParcel(Parcel parcel) {
            return new RetroBadgeItem(RetroBadgeItemSize.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RetroBadgeItemHint.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RetroBadgeItem[] newArray(int i12) {
            return new RetroBadgeItem[i12];
        }
    }

    public RetroBadgeItem(@k RetroBadgeItemSize retroBadgeItemSize, @l String str, @l String str2, @l RetroBadgeItemHint retroBadgeItemHint) {
        this.f283045b = retroBadgeItemSize;
        this.f283046c = str;
        this.f283047d = str2;
        this.f283048e = retroBadgeItemHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetroBadgeItem)) {
            return false;
        }
        RetroBadgeItem retroBadgeItem = (RetroBadgeItem) obj;
        return this.f283045b == retroBadgeItem.f283045b && L.f(this.f283046c, retroBadgeItem.f283046c) && L.f(this.f283047d, retroBadgeItem.f283047d) && L.f(this.f283048e, retroBadgeItem.f283048e);
    }

    public final int hashCode() {
        int iHashCode = this.f283045b.hashCode() * 31;
        String str = this.f283046c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f283047d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        RetroBadgeItemHint retroBadgeItemHint = this.f283048e;
        return iHashCode3 + (retroBadgeItemHint != null ? retroBadgeItemHint.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "RetroBadgeItem(size=" + this.f283045b + ", icon=" + this.f283046c + ", title=" + this.f283047d + ", hint=" + this.f283048e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f283045b.writeToParcel(parcel, i12);
        parcel.writeString(this.f283046c);
        parcel.writeString(this.f283047d);
        RetroBadgeItemHint retroBadgeItemHint = this.f283048e;
        if (retroBadgeItemHint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            retroBadgeItemHint.writeToParcel(parcel, i12);
        }
    }
}
