package com.avito.android.player;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PlayerAnalyticsParameters.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/PlayerAnalyticsParameters;", "Landroid/os/Parcelable;", "_avito_player_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PlayerAnalyticsParameters implements Parcelable {

    @k
    public static final Parcelable.Creator<PlayerAnalyticsParameters> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f220028b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f220029c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f220030d;

    /* compiled from: PlayerAnalyticsParameters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PlayerAnalyticsParameters> {
        @Override // android.os.Parcelable.Creator
        public final PlayerAnalyticsParameters createFromParcel(Parcel parcel) {
            return new PlayerAnalyticsParameters(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PlayerAnalyticsParameters[] newArray(int i12) {
            return new PlayerAnalyticsParameters[i12];
        }
    }

    public PlayerAnalyticsParameters(@k String str, @k String str2, @l String str3) {
        this.f220028b = str;
        this.f220029c = str2;
        this.f220030d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f220028b);
        parcel.writeString(this.f220029c);
        parcel.writeString(this.f220030d);
    }

    public /* synthetic */ PlayerAnalyticsParameters(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3);
    }
}
