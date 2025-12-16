package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.Metadata;
import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f346272b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f346273c;

    /* renamed from: d, reason: collision with root package name */
    public final List<VariantInfo> f346274d;

    public class a implements Parcelable.Creator<HlsTrackMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final HlsTrackMetadataEntry createFromParcel(Parcel parcel) {
            return new HlsTrackMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final HlsTrackMetadataEntry[] newArray(int i12) {
            return new HlsTrackMetadataEntry[i12];
        }
    }

    public HlsTrackMetadataEntry(@P String str, @P String str2, List<VariantInfo> list) {
        this.f346272b = str;
        this.f346273c = str2;
        this.f346274d = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HlsTrackMetadataEntry.class != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
        return TextUtils.equals(this.f346272b, hlsTrackMetadataEntry.f346272b) && TextUtils.equals(this.f346273c, hlsTrackMetadataEntry.f346273c) && this.f346274d.equals(hlsTrackMetadataEntry.f346274d);
    }

    public final int hashCode() {
        String str = this.f346272b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f346273c;
        return this.f346274d.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f346272b;
        sb2.append(str != null ? AK.c.s(androidx.appcompat.app.r.A(" [", str, ", "), this.f346273c, "]") : "");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f346272b);
        parcel.writeString(this.f346273c);
        List<VariantInfo> list = this.f346274d;
        int size = list.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            parcel.writeParcelable(list.get(i13), 0);
        }
    }

    public HlsTrackMetadataEntry(Parcel parcel) {
        this.f346272b = parcel.readString();
        this.f346273c = parcel.readString();
        int i12 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.f346274d = Collections.unmodifiableList(arrayList);
    }

    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f346275b;

        /* renamed from: c, reason: collision with root package name */
        public final int f346276c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public final String f346277d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public final String f346278e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public final String f346279f;

        /* renamed from: g, reason: collision with root package name */
        @P
        public final String f346280g;

        public class a implements Parcelable.Creator<VariantInfo> {
            @Override // android.os.Parcelable.Creator
            public final VariantInfo createFromParcel(Parcel parcel) {
                return new VariantInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final VariantInfo[] newArray(int i12) {
                return new VariantInfo[i12];
            }
        }

        public VariantInfo(int i12, int i13, @P String str, @P String str2, @P String str3, @P String str4) {
            this.f346275b = i12;
            this.f346276c = i13;
            this.f346277d = str;
            this.f346278e = str2;
            this.f346279f = str3;
            this.f346280g = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || VariantInfo.class != obj.getClass()) {
                return false;
            }
            VariantInfo variantInfo = (VariantInfo) obj;
            return this.f346275b == variantInfo.f346275b && this.f346276c == variantInfo.f346276c && TextUtils.equals(this.f346277d, variantInfo.f346277d) && TextUtils.equals(this.f346278e, variantInfo.f346278e) && TextUtils.equals(this.f346279f, variantInfo.f346279f) && TextUtils.equals(this.f346280g, variantInfo.f346280g);
        }

        public final int hashCode() {
            int i12 = ((this.f346275b * 31) + this.f346276c) * 31;
            String str = this.f346277d;
            int iHashCode = (i12 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f346278e;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f346279f;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f346280g;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            parcel.writeInt(this.f346275b);
            parcel.writeInt(this.f346276c);
            parcel.writeString(this.f346277d);
            parcel.writeString(this.f346278e);
            parcel.writeString(this.f346279f);
            parcel.writeString(this.f346280g);
        }

        public VariantInfo(Parcel parcel) {
            this.f346275b = parcel.readInt();
            this.f346276c = parcel.readInt();
            this.f346277d = parcel.readString();
            this.f346278e = parcel.readString();
            this.f346279f = parcel.readString();
            this.f346280g = parcel.readString();
        }
    }
}
