package com.yandex.mobile.ads.exo.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.Cif;
import com.yandex.mobile.ads.impl.ad0;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.v2;
import j.P;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f382960a;

    /* renamed from: b, reason: collision with root package name */
    public final String f382961b;

    /* renamed from: c, reason: collision with root package name */
    public final String f382962c;

    /* renamed from: d, reason: collision with root package name */
    public final int f382963d;

    /* renamed from: e, reason: collision with root package name */
    public final int f382964e;

    /* renamed from: f, reason: collision with root package name */
    public final int f382965f;

    /* renamed from: g, reason: collision with root package name */
    public final int f382966g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f382967h;

    public class a implements Parcelable.Creator<PictureFrame> {
        @Override // android.os.Parcelable.Creator
        public final PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PictureFrame[] newArray(int i12) {
            return new PictureFrame[i12];
        }
    }

    public PictureFrame(int i12, String str, String str2, int i13, int i14, int i15, int i16, byte[] bArr) {
        this.f382960a = i12;
        this.f382961b = str;
        this.f382962c = str2;
        this.f382963d = i13;
        this.f382964e = i14;
        this.f382965f = i15;
        this.f382966g = i16;
        this.f382967h = bArr;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    public final void a(ad0.a aVar) {
        aVar.a(this.f382960a, this.f382967h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.f382960a == pictureFrame.f382960a && this.f382961b.equals(pictureFrame.f382961b) && this.f382962c.equals(pictureFrame.f382962c) && this.f382963d == pictureFrame.f382963d && this.f382964e == pictureFrame.f382964e && this.f382965f == pictureFrame.f382965f && this.f382966g == pictureFrame.f382966g && Arrays.equals(this.f382967h, pictureFrame.f382967h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f382967h) + ((((((((v2.a(this.f382962c, v2.a(this.f382961b, (this.f382960a + 527) * 31, 31), 31) + this.f382963d) * 31) + this.f382964e) * 31) + this.f382965f) * 31) + this.f382966g) * 31);
    }

    public final String toString() {
        StringBuilder sbA = Cif.a("Picture: mimeType=");
        sbA.append(this.f382961b);
        sbA.append(", description=");
        sbA.append(this.f382962c);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f382960a);
        parcel.writeString(this.f382961b);
        parcel.writeString(this.f382962c);
        parcel.writeInt(this.f382963d);
        parcel.writeInt(this.f382964e);
        parcel.writeInt(this.f382965f);
        parcel.writeInt(this.f382966g);
        parcel.writeByteArray(this.f382967h);
    }

    public PictureFrame(Parcel parcel) {
        this.f382960a = parcel.readInt();
        this.f382961b = (String) pc1.a(parcel.readString());
        this.f382962c = (String) pc1.a(parcel.readString());
        this.f382963d = parcel.readInt();
        this.f382964e = parcel.readInt();
        this.f382965f = parcel.readInt();
        this.f382966g = parcel.readInt();
        this.f382967h = (byte[]) pc1.a(parcel.createByteArray());
    }
}
