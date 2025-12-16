package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@J
/* loaded from: classes.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f49416b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f49417c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final String f49418d;

    /* renamed from: e, reason: collision with root package name */
    public final List<StreamKey> f49419e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final byte[] f49420f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public final String f49421g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f49422h;

    public static class UnsupportedRequestException extends IOException {
    }

    public class a implements Parcelable.Creator<DownloadRequest> {
        @Override // android.os.Parcelable.Creator
        public final DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DownloadRequest[] newArray(int i12) {
            return new DownloadRequest[i12];
        }
    }

    public static class b {
    }

    public DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, a aVar) {
        int iA2 = M.A(uri, str2);
        if (iA2 == 0 || iA2 == 2 || iA2 == 1) {
            C23110a.a("customCacheKey must be null for type: " + iA2, str3 == null);
        }
        this.f49416b = str;
        this.f49417c = uri;
        this.f49418d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f49419e = Collections.unmodifiableList(arrayList);
        this.f49420f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f49421g = str3;
        this.f49422h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : M.f47891e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f49416b.equals(downloadRequest.f49416b) && this.f49417c.equals(downloadRequest.f49417c) && M.a(this.f49418d, downloadRequest.f49418d) && this.f49419e.equals(downloadRequest.f49419e) && Arrays.equals(this.f49420f, downloadRequest.f49420f) && M.a(this.f49421g, downloadRequest.f49421g) && Arrays.equals(this.f49422h, downloadRequest.f49422h);
    }

    public final int hashCode() {
        int iE2 = androidx.media3.exoplayer.analytics.m.e(this.f49417c, this.f49416b.hashCode() * 961, 31);
        String str = this.f49418d;
        int iHashCode = (Arrays.hashCode(this.f49420f) + ((this.f49419e.hashCode() + ((iE2 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f49421g;
        return Arrays.hashCode(this.f49422h) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f49418d + ":" + this.f49416b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f49416b);
        parcel.writeString(this.f49417c.toString());
        parcel.writeString(this.f49418d);
        List<StreamKey> list = this.f49419e;
        parcel.writeInt(list.size());
        for (int i13 = 0; i13 < list.size(); i13++) {
            parcel.writeParcelable(list.get(i13), 0);
        }
        parcel.writeByteArray(this.f49420f);
        parcel.writeString(this.f49421g);
        parcel.writeByteArray(this.f49422h);
    }

    public DownloadRequest(Parcel parcel) {
        String string = parcel.readString();
        int i12 = M.f47887a;
        this.f49416b = string;
        this.f49417c = Uri.parse(parcel.readString());
        this.f49418d = parcel.readString();
        int i13 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f49419e = Collections.unmodifiableList(arrayList);
        this.f49420f = parcel.createByteArray();
        this.f49421g = parcel.readString();
        this.f49422h = parcel.createByteArray();
    }
}
