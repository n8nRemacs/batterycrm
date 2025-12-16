package com.avito.android.publish.scanner_v2;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ScannerOpenParams.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/scanner_v2/PhotoDimension;", "Landroid/os/Parcelable;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PhotoDimension implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final int f239276b;

    /* renamed from: c, reason: collision with root package name */
    public final int f239277c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f239274d = new a(null);

    @k
    public static final Parcelable.Creator<PhotoDimension> CREATOR = new b();

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final PhotoDimension f239275e = new PhotoDimension(2000, 2000);

    /* compiled from: ScannerOpenParams.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/scanner_v2/PhotoDimension$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ScannerOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PhotoDimension> {
        @Override // android.os.Parcelable.Creator
        public final PhotoDimension createFromParcel(Parcel parcel) {
            return new PhotoDimension(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoDimension[] newArray(int i12) {
            return new PhotoDimension[i12];
        }
    }

    public PhotoDimension(int i12, int i13) {
        this.f239276b = i12;
        this.f239277c = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoDimension)) {
            return false;
        }
        PhotoDimension photoDimension = (PhotoDimension) obj;
        return this.f239276b == photoDimension.f239276b && this.f239277c == photoDimension.f239277c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f239277c) + (Integer.hashCode(this.f239276b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoDimension(width=");
        sb2.append(this.f239276b);
        sb2.append(", height=");
        return r.t(sb2, this.f239277c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f239276b);
        parcel.writeInt(this.f239277c);
    }
}
