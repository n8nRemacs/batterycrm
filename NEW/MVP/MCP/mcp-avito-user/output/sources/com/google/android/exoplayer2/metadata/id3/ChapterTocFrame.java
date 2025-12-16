package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f345681c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f345682d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f345683e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f345684f;

    /* renamed from: g, reason: collision with root package name */
    public final Id3Frame[] f345685g;

    public class a implements Parcelable.Creator<ChapterTocFrame> {
        @Override // android.os.Parcelable.Creator
        public final ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ChapterTocFrame[] newArray(int i12) {
            return new ChapterTocFrame[i12];
        }
    }

    public ChapterTocFrame(String str, boolean z12, boolean z13, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f345681c = str;
        this.f345682d = z12;
        this.f345683e = z13;
        this.f345684f = strArr;
        this.f345685g = id3FrameArr;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f345682d == chapterTocFrame.f345682d && this.f345683e == chapterTocFrame.f345683e && U.a(this.f345681c, chapterTocFrame.f345681c) && Arrays.equals(this.f345684f, chapterTocFrame.f345684f) && Arrays.equals(this.f345685g, chapterTocFrame.f345685g);
    }

    public final int hashCode() {
        int i12 = (((527 + (this.f345682d ? 1 : 0)) * 31) + (this.f345683e ? 1 : 0)) * 31;
        String str = this.f345681c;
        return i12 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f345681c);
        parcel.writeByte(this.f345682d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f345683e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f345684f);
        Id3Frame[] id3FrameArr = this.f345685g;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i12 = U.f348106a;
        this.f345681c = string;
        this.f345682d = parcel.readByte() != 0;
        this.f345683e = parcel.readByte() != 0;
        this.f345684f = parcel.createStringArray();
        int i13 = parcel.readInt();
        this.f345685g = new Id3Frame[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            this.f345685g[i14] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
