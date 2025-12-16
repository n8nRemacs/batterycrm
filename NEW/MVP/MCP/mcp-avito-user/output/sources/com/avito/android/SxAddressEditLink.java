package com.avito.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: SxAddressListLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/SxAddressEditLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes10.dex */
public final class SxAddressEditLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<SxAddressEditLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f67554b;

    /* renamed from: c, reason: collision with root package name */
    public final long f67555c;

    /* renamed from: d, reason: collision with root package name */
    public final long f67556d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Boolean f67557e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SxAddAddressSource f67558f;

    /* compiled from: SxAddressListLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SxAddressEditLink> {
        @Override // android.os.Parcelable.Creator
        public final SxAddressEditLink createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            long j12 = parcel.readLong();
            long j13 = parcel.readLong();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SxAddressEditLink(string, j12, j13, boolValueOf, SxAddAddressSource.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final SxAddressEditLink[] newArray(int i12) {
            return new SxAddressEditLink[i12];
        }
    }

    public /* synthetic */ SxAddressEditLink(String str, long j12, long j13, Boolean bool, SxAddAddressSource sxAddAddressSource, int i12, C42822w c42822w) {
        this(str, j12, j13, bool, (i12 & 16) != 0 ? SxAddAddressSource.f67543b : sxAddAddressSource);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f67554b);
        parcel.writeLong(this.f67555c);
        parcel.writeLong(this.f67556d);
        Boolean bool = this.f67557e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            com.akita.compose.theme.re23.style.C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.f67558f.name());
    }

    public SxAddressEditLink(@Y61.l String str, long j12, long j13, @Y61.l Boolean bool, @Y61.k SxAddAddressSource sxAddAddressSource) {
        this.f67554b = str;
        this.f67555c = j12;
        this.f67556d = j13;
        this.f67557e = bool;
        this.f67558f = sxAddAddressSource;
    }
}
