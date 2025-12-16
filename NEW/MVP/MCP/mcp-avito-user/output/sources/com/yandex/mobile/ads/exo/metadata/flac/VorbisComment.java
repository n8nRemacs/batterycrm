package com.yandex.mobile.ads.exo.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.common.ContainerUtils;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.Cif;
import com.yandex.mobile.ads.impl.ad0;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.v2;
import j.P;

@Deprecated
/* loaded from: classes8.dex */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f382968a;

    /* renamed from: b, reason: collision with root package name */
    public final String f382969b;

    public class a implements Parcelable.Creator<VorbisComment> {
        @Override // android.os.Parcelable.Creator
        public final VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VorbisComment[] newArray(int i12) {
            return new VorbisComment[i12];
        }
    }

    public VorbisComment(String str, String str2) {
        this.f382968a = str;
        this.f382969b = str2;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    public final void a(ad0.a aVar) {
        String str = this.f382968a;
        str.getClass();
        switch (str) {
            case "ALBUM":
                aVar.b(this.f382969b);
                break;
            case "TITLE":
                aVar.l(this.f382969b);
                break;
            case "DESCRIPTION":
                aVar.g(this.f382969b);
                break;
            case "ALBUMARTIST":
                aVar.a(this.f382969b);
                break;
            case "ARTIST":
                aVar.c(this.f382969b);
                break;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.f382968a.equals(vorbisComment.f382968a) && this.f382969b.equals(vorbisComment.f382969b);
    }

    public final int hashCode() {
        return this.f382969b.hashCode() + v2.a(this.f382968a, 527, 31);
    }

    public final String toString() {
        StringBuilder sbA = Cif.a("VC: ");
        sbA.append(this.f382968a);
        sbA.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sbA.append(this.f382969b);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f382968a);
        parcel.writeString(this.f382969b);
    }

    public VorbisComment(Parcel parcel) {
        this.f382968a = (String) pc1.a(parcel.readString());
        this.f382969b = (String) pc1.a(parcel.readString());
    }
}
