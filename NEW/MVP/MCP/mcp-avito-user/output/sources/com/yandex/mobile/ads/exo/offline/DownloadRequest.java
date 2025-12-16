package com.yandex.mobile.ads.exo.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.analytics.m;
import com.yandex.mobile.ads.embedded.guava.collect.p;
import com.yandex.mobile.ads.impl.db;
import com.yandex.mobile.ads.impl.pc1;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f383070a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f383071b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f383072c;

    /* renamed from: d, reason: collision with root package name */
    public final List<StreamKey> f383073d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final byte[] f383074e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final String f383075f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f383076g;

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

        /* renamed from: a, reason: collision with root package name */
        private final String f383077a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f383078b;

        /* renamed from: c, reason: collision with root package name */
        @P
        private String f383079c;

        /* renamed from: d, reason: collision with root package name */
        @P
        private List<StreamKey> f383080d;

        /* renamed from: e, reason: collision with root package name */
        @P
        private byte[] f383081e;

        /* renamed from: f, reason: collision with root package name */
        @P
        private String f383082f;

        /* renamed from: g, reason: collision with root package name */
        @P
        private byte[] f383083g;

        public b(Uri uri, String str) {
            this.f383077a = str;
            this.f383078b = uri;
        }

        public final b a(@P ArrayList arrayList) {
            this.f383080d = arrayList;
            return this;
        }

        public final b b(@P String str) {
            this.f383079c = str;
            return this;
        }

        public final b a(@P String str) {
            this.f383082f = str;
            return this;
        }

        public final b b(@P byte[] bArr) {
            this.f383081e = bArr;
            return this;
        }

        public final b a(@P byte[] bArr) {
            this.f383083g = bArr;
            return this;
        }

        public final DownloadRequest a() {
            String str = this.f383077a;
            Uri uri = this.f383078b;
            String str2 = this.f383079c;
            List listI = this.f383080d;
            if (listI == null) {
                listI = p.i();
            }
            return new DownloadRequest(str, uri, str2, listI, this.f383081e, this.f383082f, this.f383083g, 0);
        }
    }

    public /* synthetic */ DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, int i12) {
        this(str, uri, str2, list, bArr, str3, bArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    public final DownloadRequest a(DownloadRequest downloadRequest) {
        List listEmptyList;
        db.a(this.f383070a.equals(downloadRequest.f383070a));
        if (this.f383073d.isEmpty() || downloadRequest.f383073d.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            listEmptyList = new ArrayList(this.f383073d);
            for (int i12 = 0; i12 < downloadRequest.f383073d.size(); i12++) {
                StreamKey streamKey = downloadRequest.f383073d.get(i12);
                if (!listEmptyList.contains(streamKey)) {
                    listEmptyList.add(streamKey);
                }
            }
        }
        return new DownloadRequest(this.f383070a, downloadRequest.f383071b, downloadRequest.f383072c, listEmptyList, downloadRequest.f383074e, downloadRequest.f383075f, downloadRequest.f383076g);
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
        return this.f383070a.equals(downloadRequest.f383070a) && this.f383071b.equals(downloadRequest.f383071b) && pc1.a(this.f383072c, downloadRequest.f383072c) && this.f383073d.equals(downloadRequest.f383073d) && Arrays.equals(this.f383074e, downloadRequest.f383074e) && pc1.a(this.f383075f, downloadRequest.f383075f) && Arrays.equals(this.f383076g, downloadRequest.f383076g);
    }

    public final int hashCode() {
        int iE2 = m.e(this.f383071b, this.f383070a.hashCode() * 961, 31);
        String str = this.f383072c;
        int iHashCode = (Arrays.hashCode(this.f383074e) + ((this.f383073d.hashCode() + ((iE2 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f383075f;
        return Arrays.hashCode(this.f383076g) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f383072c + ":" + this.f383070a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f383070a);
        parcel.writeString(this.f383071b.toString());
        parcel.writeString(this.f383072c);
        parcel.writeInt(this.f383073d.size());
        for (int i13 = 0; i13 < this.f383073d.size(); i13++) {
            parcel.writeParcelable(this.f383073d.get(i13), 0);
        }
        parcel.writeByteArray(this.f383074e);
        parcel.writeString(this.f383075f);
        parcel.writeByteArray(this.f383076g);
    }

    private DownloadRequest(String str, Uri uri, @P String str2, List<StreamKey> list, @P byte[] bArr, @P String str3, @P byte[] bArr2) {
        int iA2 = pc1.a(uri, str2);
        if (iA2 == 0 || iA2 == 2 || iA2 == 1) {
            db.a("customCacheKey must be null for type: " + iA2, str3 == null);
        }
        this.f383070a = str;
        this.f383071b = uri;
        this.f383072c = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f383073d = Collections.unmodifiableList(arrayList);
        this.f383074e = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f383075f = str3;
        this.f383076g = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : pc1.f388773f;
    }

    public DownloadRequest(Parcel parcel) {
        this.f383070a = (String) pc1.a(parcel.readString());
        this.f383071b = Uri.parse((String) pc1.a(parcel.readString()));
        this.f383072c = parcel.readString();
        int i12 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f383073d = Collections.unmodifiableList(arrayList);
        this.f383074e = parcel.createByteArray();
        this.f383075f = parcel.readString();
        this.f383076g = (byte[]) pc1.a(parcel.createByteArray());
    }
}
