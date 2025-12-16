package com.yandex.mobile.ads.exo.metadata.icy;

import AK.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C23088b;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.ad0;
import com.yandex.mobile.ads.impl.db;
import j.P;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f382976a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f382977b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f382978c;

    public class a implements Parcelable.Creator<IcyInfo> {
        @Override // android.os.Parcelable.Creator
        public final IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyInfo[] newArray(int i12) {
            return new IcyInfo[i12];
        }
    }

    public IcyInfo(byte[] bArr, @P String str, @P String str2) {
        this.f382976a = bArr;
        this.f382977b = str;
        this.f382978c = str2;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    public final void a(ad0.a aVar) {
        String str = this.f382977b;
        if (str != null) {
            aVar.l(str);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f382976a, ((IcyInfo) obj).f382976a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f382976a);
    }

    public final String toString() {
        return c.i(this.f382976a.length, "\"", C23088b.b("ICY: title=\"", this.f382977b, "\", url=\"", this.f382978c, "\", rawMetadata.length=\""));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeByteArray(this.f382976a);
        parcel.writeString(this.f382977b);
        parcel.writeString(this.f382978c);
    }

    public IcyInfo(Parcel parcel) {
        this.f382976a = (byte[]) db.a(parcel.createByteArray());
        this.f382977b = parcel.readString();
        this.f382978c = parcel.readString();
    }
}
