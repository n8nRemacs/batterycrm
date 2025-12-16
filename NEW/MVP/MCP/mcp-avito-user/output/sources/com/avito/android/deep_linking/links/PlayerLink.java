package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: PlayerLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/PlayerLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class PlayerLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<PlayerLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133581b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133582c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133583d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133584e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f133585f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f133586g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f133587h;

    /* compiled from: PlayerLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PlayerLink> {
        @Override // android.os.Parcelable.Creator
        public final PlayerLink createFromParcel(Parcel parcel) {
            return new PlayerLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PlayerLink[] newArray(int i12) {
            return new PlayerLink[i12];
        }
    }

    public PlayerLink(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7) {
        this.f133581b = str;
        this.f133582c = str2;
        this.f133583d = str3;
        this.f133584e = str4;
        this.f133585f = str5;
        this.f133586g = str6;
        this.f133587h = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133581b);
        parcel.writeString(this.f133582c);
        parcel.writeString(this.f133583d);
        parcel.writeString(this.f133584e);
        parcel.writeString(this.f133585f);
        parcel.writeString(this.f133586g);
        parcel.writeString(this.f133587h);
    }
}
