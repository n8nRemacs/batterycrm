package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import java.util.Arrays;

@J
/* loaded from: classes.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f50667c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f50668d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f50669e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f50670f;

    /* renamed from: g, reason: collision with root package name */
    public final Id3Frame[] f50671g;

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
        this.f50667c = str;
        this.f50668d = z12;
        this.f50669e = z13;
        this.f50670f = strArr;
        this.f50671g = id3FrameArr;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f50668d == chapterTocFrame.f50668d && this.f50669e == chapterTocFrame.f50669e && M.a(this.f50667c, chapterTocFrame.f50667c) && Arrays.equals(this.f50670f, chapterTocFrame.f50670f) && Arrays.equals(this.f50671g, chapterTocFrame.f50671g);
    }

    public final int hashCode() {
        int i12 = (((527 + (this.f50668d ? 1 : 0)) * 31) + (this.f50669e ? 1 : 0)) * 31;
        String str = this.f50667c;
        return i12 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f50667c);
        parcel.writeByte(this.f50668d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f50669e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f50670f);
        Id3Frame[] id3FrameArr = this.f50671g;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i12 = M.f47887a;
        this.f50667c = string;
        this.f50668d = parcel.readByte() != 0;
        this.f50669e = parcel.readByte() != 0;
        this.f50670f = parcel.createStringArray();
        int i13 = parcel.readInt();
        this.f50671g = new Id3Frame[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            this.f50671g[i14] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
