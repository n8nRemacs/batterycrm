package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.pc1;
import j.P;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f382984b;

    /* renamed from: c, reason: collision with root package name */
    public final int f382985c;

    /* renamed from: d, reason: collision with root package name */
    public final int f382986d;

    /* renamed from: e, reason: collision with root package name */
    public final long f382987e;

    /* renamed from: f, reason: collision with root package name */
    public final long f382988f;

    /* renamed from: g, reason: collision with root package name */
    private final Id3Frame[] f382989g;

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
        this.f382984b = str;
        this.f382985c = i12;
        this.f382986d = i13;
        this.f382987e = j12;
        this.f382988f = j13;
        this.f382989g = id3FrameArr;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame, android.os.Parcelable
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
        return this.f382985c == chapterFrame.f382985c && this.f382986d == chapterFrame.f382986d && this.f382987e == chapterFrame.f382987e && this.f382988f == chapterFrame.f382988f && pc1.a(this.f382984b, chapterFrame.f382984b) && Arrays.equals(this.f382989g, chapterFrame.f382989g);
    }

    public final int hashCode() {
        int i12 = (((((((this.f382985c + 527) * 31) + this.f382986d) * 31) + ((int) this.f382987e)) * 31) + ((int) this.f382988f)) * 31;
        String str = this.f382984b;
        return i12 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f382984b);
        parcel.writeInt(this.f382985c);
        parcel.writeInt(this.f382986d);
        parcel.writeLong(this.f382987e);
        parcel.writeLong(this.f382988f);
        parcel.writeInt(this.f382989g.length);
        for (Id3Frame id3Frame : this.f382989g) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.f382984b = (String) pc1.a(parcel.readString());
        this.f382985c = parcel.readInt();
        this.f382986d = parcel.readInt();
        this.f382987e = parcel.readLong();
        this.f382988f = parcel.readLong();
        int i12 = parcel.readInt();
        this.f382989g = new Id3Frame[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            this.f382989g[i13] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
