package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import java.util.Arrays;

@J
/* loaded from: classes.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f50661c;

    /* renamed from: d, reason: collision with root package name */
    public final int f50662d;

    /* renamed from: e, reason: collision with root package name */
    public final int f50663e;

    /* renamed from: f, reason: collision with root package name */
    public final long f50664f;

    /* renamed from: g, reason: collision with root package name */
    public final long f50665g;

    /* renamed from: h, reason: collision with root package name */
    public final Id3Frame[] f50666h;

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
        this.f50661c = str;
        this.f50662d = i12;
        this.f50663e = i13;
        this.f50664f = j12;
        this.f50665g = j13;
        this.f50666h = id3FrameArr;
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
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
        return this.f50662d == chapterFrame.f50662d && this.f50663e == chapterFrame.f50663e && this.f50664f == chapterFrame.f50664f && this.f50665g == chapterFrame.f50665g && M.a(this.f50661c, chapterFrame.f50661c) && Arrays.equals(this.f50666h, chapterFrame.f50666h);
    }

    public final int hashCode() {
        int i12 = (((((((527 + this.f50662d) * 31) + this.f50663e) * 31) + ((int) this.f50664f)) * 31) + ((int) this.f50665g)) * 31;
        String str = this.f50661c;
        return i12 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f50661c);
        parcel.writeInt(this.f50662d);
        parcel.writeInt(this.f50663e);
        parcel.writeLong(this.f50664f);
        parcel.writeLong(this.f50665g);
        Id3Frame[] id3FrameArr = this.f50666h;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i12 = M.f47887a;
        this.f50661c = string;
        this.f50662d = parcel.readInt();
        this.f50663e = parcel.readInt();
        this.f50664f = parcel.readLong();
        this.f50665g = parcel.readLong();
        int i13 = parcel.readInt();
        this.f50666h = new Id3Frame[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            this.f50666h[i14] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
