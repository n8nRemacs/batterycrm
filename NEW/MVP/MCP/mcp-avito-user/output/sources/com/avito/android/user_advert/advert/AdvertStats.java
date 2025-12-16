package com.avito.android.user_advert.advert;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertStatsContact;
import kotlin.Metadata;

/* compiled from: AdvertStats.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/AdvertStats;", "Landroid/os/Parcelable;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdvertStats implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AdvertStats> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f308203b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f308204c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f308205d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final DeepLink f308206e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final AdvertStatsContact f308207f;

    /* compiled from: AdvertStats.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertStats> {
        @Override // android.os.Parcelable.Creator
        public final AdvertStats createFromParcel(Parcel parcel) {
            return new AdvertStats(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (DeepLink) parcel.readParcelable(AdvertStats.class.getClassLoader()), (AdvertStatsContact) parcel.readParcelable(AdvertStats.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertStats[] newArray(int i12) {
            return new AdvertStats[i12];
        }
    }

    public AdvertStats(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l DeepLink deepLink, @Y61.l AdvertStatsContact advertStatsContact) {
        this.f308203b = num;
        this.f308204c = num2;
        this.f308205d = num3;
        this.f308206e = deepLink;
        this.f308207f = advertStatsContact;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Integer num = this.f308203b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f308204c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.f308205d;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        parcel.writeParcelable(this.f308206e, i12);
        parcel.writeParcelable(this.f308207f, i12);
    }
}
