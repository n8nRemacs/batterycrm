package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f345793b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f345794c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final String f345795d;

    /* renamed from: e, reason: collision with root package name */
    public final List<StreamKey> f345796e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final byte[] f345797f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public final String f345798g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f345799h;

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
        int iD2 = U.D(uri, str2);
        if (iD2 == 0 || iD2 == 2 || iD2 == 1) {
            C36585a.a("customCacheKey must be null for type: " + iD2, str3 == null);
        }
        this.f345793b = str;
        this.f345794c = uri;
        this.f345795d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f345796e = Collections.unmodifiableList(arrayList);
        this.f345797f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f345798g = str3;
        this.f345799h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : U.f348110e;
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
        return this.f345793b.equals(downloadRequest.f345793b) && this.f345794c.equals(downloadRequest.f345794c) && U.a(this.f345795d, downloadRequest.f345795d) && this.f345796e.equals(downloadRequest.f345796e) && Arrays.equals(this.f345797f, downloadRequest.f345797f) && U.a(this.f345798g, downloadRequest.f345798g) && Arrays.equals(this.f345799h, downloadRequest.f345799h);
    }

    public final int hashCode() {
        int iE2 = androidx.media3.exoplayer.analytics.m.e(this.f345794c, this.f345793b.hashCode() * 961, 31);
        String str = this.f345795d;
        int iHashCode = (Arrays.hashCode(this.f345797f) + ((this.f345796e.hashCode() + ((iE2 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f345798g;
        return Arrays.hashCode(this.f345799h) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f345795d + ":" + this.f345793b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f345793b);
        parcel.writeString(this.f345794c.toString());
        parcel.writeString(this.f345795d);
        List<StreamKey> list = this.f345796e;
        parcel.writeInt(list.size());
        for (int i13 = 0; i13 < list.size(); i13++) {
            parcel.writeParcelable(list.get(i13), 0);
        }
        parcel.writeByteArray(this.f345797f);
        parcel.writeString(this.f345798g);
        parcel.writeByteArray(this.f345799h);
    }

    public DownloadRequest(Parcel parcel) {
        String string = parcel.readString();
        int i12 = U.f348106a;
        this.f345793b = string;
        this.f345794c = Uri.parse(parcel.readString());
        this.f345795d = parcel.readString();
        int i13 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f345796e = Collections.unmodifiableList(arrayList);
        this.f345797f = parcel.createByteArray();
        this.f345798g = parcel.readString();
        this.f345799h = parcel.createByteArray();
    }
}
