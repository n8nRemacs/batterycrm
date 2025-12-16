package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.pc1;
import j.P;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f382990b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f382991c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f382992d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f382993e;

    /* renamed from: f, reason: collision with root package name */
    private final Id3Frame[] f382994f;

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
        this.f382990b = str;
        this.f382991c = z12;
        this.f382992d = z13;
        this.f382993e = strArr;
        this.f382994f = id3FrameArr;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f382991c == chapterTocFrame.f382991c && this.f382992d == chapterTocFrame.f382992d && pc1.a(this.f382990b, chapterTocFrame.f382990b) && Arrays.equals(this.f382993e, chapterTocFrame.f382993e) && Arrays.equals(this.f382994f, chapterTocFrame.f382994f);
    }

    public final int hashCode() {
        int i12 = ((((this.f382991c ? 1 : 0) + 527) * 31) + (this.f382992d ? 1 : 0)) * 31;
        String str = this.f382990b;
        return i12 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f382990b);
        parcel.writeByte(this.f382991c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f382992d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f382993e);
        parcel.writeInt(this.f382994f.length);
        for (Id3Frame id3Frame : this.f382994f) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.f382990b = (String) pc1.a(parcel.readString());
        this.f382991c = parcel.readByte() != 0;
        this.f382992d = parcel.readByte() != 0;
        this.f382993e = (String[]) pc1.a(parcel.createStringArray());
        int i12 = parcel.readInt();
        this.f382994f = new Id3Frame[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            this.f382994f[i13] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
