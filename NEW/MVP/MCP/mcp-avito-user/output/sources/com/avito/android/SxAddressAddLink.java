package com.avito.android;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: SxAddressAddLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/SxAddressAddLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "PublishResult", "_avito_user-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes10.dex */
public final class SxAddressAddLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<SxAddressAddLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f67547b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f67548c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final SxAddAddressSource f67549d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f67550e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Boolean f67551f;

    /* compiled from: SxAddressAddLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/avito/android/SxAddressAddLink$PublishResult;", "Landroid/os/Parcelable;", "", AddressParameter.Value.JSON_WEB_TOKEN, "", "lat", AddressParameter.Value.LNG, "text", "<init>", "(Ljava/lang/String;DDLjava/lang/String;)V", "Ljava/lang/String;", "getJwt", "()Ljava/lang/String;", "D", "getLat", "()D", "getLng", "getText", "_avito_user-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PublishResult implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<PublishResult> CREATOR = new a();

        @com.google.gson.annotations.c(AddressParameter.Value.JSON_WEB_TOKEN)
        @Y61.l
        private final String jwt;

        @com.google.gson.annotations.c("lat")
        private final double lat;

        @com.google.gson.annotations.c(AddressParameter.Value.LNG)
        private final double lng;

        @com.google.gson.annotations.c("text")
        @Y61.k
        private final String text;

        /* compiled from: SxAddressAddLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PublishResult> {
            @Override // android.os.Parcelable.Creator
            public final PublishResult createFromParcel(Parcel parcel) {
                return new PublishResult(parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PublishResult[] newArray(int i12) {
                return new PublishResult[i12];
            }
        }

        public PublishResult(@Y61.l String str, double d12, double d13, @Y61.k String str2) {
            this.jwt = str;
            this.lat = d12;
            this.lng = d13;
            this.text = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PublishResult)) {
                return false;
            }
            PublishResult publishResult = (PublishResult) obj;
            return kotlin.jvm.internal.L.f(this.jwt, publishResult.jwt) && Double.compare(this.lat, publishResult.lat) == 0 && Double.compare(this.lng, publishResult.lng) == 0 && kotlin.jvm.internal.L.f(this.text, publishResult.text);
        }

        public final int hashCode() {
            String str = this.jwt;
            return this.text.hashCode() + androidx.compose.ui.graphics.colorspace.e.d(androidx.compose.ui.graphics.colorspace.e.d((str == null ? 0 : str.hashCode()) * 31, 31, this.lat), 31, this.lng);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PublishResult(jwt=");
            sb2.append(this.jwt);
            sb2.append(", lat=");
            sb2.append(this.lat);
            sb2.append(", lng=");
            sb2.append(this.lng);
            sb2.append(", text=");
            return C22026a.c(sb2, this.text, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.jwt);
            parcel.writeDouble(this.lat);
            parcel.writeDouble(this.lng);
            parcel.writeString(this.text);
        }
    }

    /* compiled from: SxAddressAddLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SxAddressAddLink> {
        @Override // android.os.Parcelable.Creator
        public final SxAddressAddLink createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            int i12 = parcel.readInt();
            String string = parcel.readString();
            SxAddAddressSource sxAddAddressSourceValueOf = parcel.readInt() == 0 ? null : SxAddAddressSource.valueOf(parcel.readString());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SxAddressAddLink(i12, sxAddAddressSourceValueOf, boolValueOf, string, string2);
        }

        @Override // android.os.Parcelable.Creator
        public final SxAddressAddLink[] newArray(int i12) {
            return new SxAddressAddLink[i12];
        }
    }

    public /* synthetic */ SxAddressAddLink(int i12, String str, SxAddAddressSource sxAddAddressSource, String str2, Boolean bool, int i13, C42822w c42822w) {
        this(i12, (i13 & 4) != 0 ? null : sxAddAddressSource, (i13 & 16) != 0 ? Boolean.TRUE : bool, str, (i13 & 8) != 0 ? null : str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f67547b);
        parcel.writeString(this.f67548c);
        SxAddAddressSource sxAddAddressSource = this.f67549d;
        if (sxAddAddressSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sxAddAddressSource.name());
        }
        parcel.writeString(this.f67550e);
        Boolean bool = this.f67551f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            com.akita.compose.theme.re23.style.C0.l(parcel, 1, bool);
        }
    }

    public SxAddressAddLink(int i12, @Y61.l SxAddAddressSource sxAddAddressSource, @Y61.l Boolean bool, @Y61.l String str, @Y61.l String str2) {
        this.f67547b = i12;
        this.f67548c = str;
        this.f67549d = sxAddAddressSource;
        this.f67550e = str2;
        this.f67551f = bool;
    }
}
