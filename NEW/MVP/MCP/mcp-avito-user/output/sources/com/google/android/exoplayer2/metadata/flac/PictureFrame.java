package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.google.android.exoplayer2.P;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import com.google.common.base.C37262f;
import j.P;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f345648b;

    /* renamed from: c, reason: collision with root package name */
    public final String f345649c;

    /* renamed from: d, reason: collision with root package name */
    public final String f345650d;

    /* renamed from: e, reason: collision with root package name */
    public final int f345651e;

    /* renamed from: f, reason: collision with root package name */
    public final int f345652f;

    /* renamed from: g, reason: collision with root package name */
    public final int f345653g;

    /* renamed from: h, reason: collision with root package name */
    public final int f345654h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f345655i;

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
        this.f345648b = i12;
        this.f345649c = str;
        this.f345650d = str2;
        this.f345651e = i13;
        this.f345652f = i14;
        this.f345653g = i15;
        this.f345654h = i16;
        this.f345655i = bArr;
    }

    public static PictureFrame a(F f12) {
        int iD2 = f12.d();
        String strP = f12.p(f12.d(), C37262f.f359032a);
        String strP2 = f12.p(f12.d(), C37262f.f359034c);
        int iD3 = f12.d();
        int iD4 = f12.d();
        int iD5 = f12.d();
        int iD6 = f12.d();
        int iD7 = f12.d();
        byte[] bArr = new byte[iD7];
        f12.c(0, iD7, bArr);
        return new PictureFrame(iD2, strP, strP2, iD3, iD4, iD5, iD6, bArr);
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
        return this.f345648b == pictureFrame.f345648b && this.f345649c.equals(pictureFrame.f345649c) && this.f345650d.equals(pictureFrame.f345650d) && this.f345651e == pictureFrame.f345651e && this.f345652f == pictureFrame.f345652f && this.f345653g == pictureFrame.f345653g && this.f345654h == pictureFrame.f345654h && Arrays.equals(this.f345655i, pictureFrame.f345655i);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void f4(P.b bVar) {
        bVar.a(this.f345648b, this.f345655i);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f345655i) + ((((((((H.d(H.d((527 + this.f345648b) * 31, 31, this.f345649c), 31, this.f345650d) + this.f345651e) * 31) + this.f345652f) * 31) + this.f345653g) * 31) + this.f345654h) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f345649c + ", description=" + this.f345650d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f345648b);
        parcel.writeString(this.f345649c);
        parcel.writeString(this.f345650d);
        parcel.writeInt(this.f345651e);
        parcel.writeInt(this.f345652f);
        parcel.writeInt(this.f345653g);
        parcel.writeInt(this.f345654h);
        parcel.writeByteArray(this.f345655i);
    }

    public PictureFrame(Parcel parcel) {
        this.f345648b = parcel.readInt();
        String string = parcel.readString();
        int i12 = U.f348106a;
        this.f345649c = string;
        this.f345650d = parcel.readString();
        this.f345651e = parcel.readInt();
        this.f345652f = parcel.readInt();
        this.f345653g = parcel.readInt();
        this.f345654h = parcel.readInt();
        this.f345655i = parcel.createByteArray();
    }
}
