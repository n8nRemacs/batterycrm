package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f345675c;

    /* renamed from: d, reason: collision with root package name */
    public final int f345676d;

    /* renamed from: e, reason: collision with root package name */
    public final int f345677e;

    /* renamed from: f, reason: collision with root package name */
    public final long f345678f;

    /* renamed from: g, reason: collision with root package name */
    public final long f345679g;

    /* renamed from: h, reason: collision with root package name */
    public final Id3Frame[] f345680h;

    public class a implements Parcelable.Creator<ChapterFrame> {
        @Override // android.os.Parcelable.Creator
        public final ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ChapterFrame[] newArray(int i12) {
            return new ChapterFrame[i12];
        }
    }

    public ChapterFrame(String str, int i12, int i13, long j12, long j13, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f345675c = str;
        this.f345676d = i12;
        this.f345677e = i13;
        this.f345678f = j12;
        this.f345679g = j13;
        this.f345680h = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.f345676d == chapterFrame.f345676d && this.f345677e == chapterFrame.f345677e && this.f345678f == chapterFrame.f345678f && this.f345679g == chapterFrame.f345679g && U.a(this.f345675c, chapterFrame.f345675c) && Arrays.equals(this.f345680h, chapterFrame.f345680h);
    }

    public final int hashCode() {
        int i12 = (((((((527 + this.f345676d) * 31) + this.f345677e) * 31) + ((int) this.f345678f)) * 31) + ((int) this.f345679g)) * 31;
        String str = this.f345675c;
        return i12 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f345675c);
        parcel.writeInt(this.f345676d);
        parcel.writeInt(this.f345677e);
        parcel.writeLong(this.f345678f);
        parcel.writeLong(this.f345679g);
        Id3Frame[] id3FrameArr = this.f345680h;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i12 = U.f348106a;
        this.f345675c = string;
        this.f345676d = parcel.readInt();
        this.f345677e = parcel.readInt();
        this.f345678f = parcel.readLong();
        this.f345679g = parcel.readLong();
        int i13 = parcel.readInt();
        this.f345680h = new Id3Frame[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            this.f345680h[i14] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
