package com.avito.android.authorization;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SocialCredentials.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/SocialCredentials;", "Landroid/os/Parcelable;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SocialCredentials implements Parcelable {

    @k
    public static final Parcelable.Creator<SocialCredentials> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f92742b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f92743c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f92744d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f92745e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f92746f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f92747g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f92748h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f92749i;

    /* compiled from: SocialCredentials.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SocialCredentials> {
        @Override // android.os.Parcelable.Creator
        public final SocialCredentials createFromParcel(Parcel parcel) {
            return new SocialCredentials(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SocialCredentials[] newArray(int i12) {
            return new SocialCredentials[i12];
        }
    }

    public SocialCredentials(@k String str, @k String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8) {
        this.f92742b = str;
        this.f92743c = str2;
        this.f92744d = str3;
        this.f92745e = str4;
        this.f92746f = str5;
        this.f92747g = str6;
        this.f92748h = str7;
        this.f92749i = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f92742b);
        parcel.writeString(this.f92743c);
        parcel.writeString(this.f92744d);
        parcel.writeString(this.f92745e);
        parcel.writeString(this.f92746f);
        parcel.writeString(this.f92747g);
        parcel.writeString(this.f92748h);
        parcel.writeString(this.f92749i);
    }

    public /* synthetic */ SocialCredentials(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8);
    }
}
