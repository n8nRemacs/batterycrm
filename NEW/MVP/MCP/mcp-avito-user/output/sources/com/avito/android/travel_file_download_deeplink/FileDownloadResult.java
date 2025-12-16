package com.avito.android.travel_file_download_deeplink;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FileDownloadResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/FileDownloadResult;", "Landroid/os/Parcelable;", "Canceled", "Failed", "Pending", "Success", "Lcom/avito/android/travel_file_download_deeplink/FileDownloadResult$Canceled;", "Lcom/avito/android/travel_file_download_deeplink/FileDownloadResult$Failed;", "Lcom/avito/android/travel_file_download_deeplink/FileDownloadResult$Pending;", "Lcom/avito/android/travel_file_download_deeplink/FileDownloadResult$Success;", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface FileDownloadResult extends Parcelable {

    /* compiled from: FileDownloadResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/FileDownloadResult$Canceled;", "Lcom/avito/android/travel_file_download_deeplink/FileDownloadResult;", "<init>", "()V", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Canceled implements FileDownloadResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Canceled f301668b = new Canceled();

        @k
        public static final Parcelable.Creator<Canceled> CREATOR = new a();

        /* compiled from: FileDownloadResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Canceled> {
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Canceled.f301668b;
            }

            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i12) {
                return new Canceled[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Canceled);
        }

        public final int hashCode() {
            return -374150516;
        }

        @k
        public final String toString() {
            return "Canceled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FileDownloadResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/FileDownloadResult$Failed;", "Lcom/avito/android/travel_file_download_deeplink/FileDownloadResult;", "<init>", "()V", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failed implements FileDownloadResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Failed f301669b = new Failed();

        @k
        public static final Parcelable.Creator<Failed> CREATOR = new a();

        /* compiled from: FileDownloadResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Failed> {
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Failed.f301669b;
            }

            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i12) {
                return new Failed[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            return -1344808208;
        }

        @k
        public final String toString() {
            return "Failed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FileDownloadResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/FileDownloadResult$Pending;", "Lcom/avito/android/travel_file_download_deeplink/FileDownloadResult;", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Pending implements FileDownloadResult {

        @k
        public static final Parcelable.Creator<Pending> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f301670b;

        /* compiled from: FileDownloadResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Pending> {
            @Override // android.os.Parcelable.Creator
            public final Pending createFromParcel(Parcel parcel) {
                return new Pending(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Pending[] newArray(int i12) {
                return new Pending[i12];
            }
        }

        public Pending(long j12) {
            this.f301670b = j12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Pending) && this.f301670b == ((Pending) obj).f301670b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f301670b);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("Pending(downloadId="), this.f301670b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f301670b);
        }
    }

    /* compiled from: FileDownloadResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/FileDownloadResult$Success;", "Lcom/avito/android/travel_file_download_deeplink/FileDownloadResult;", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success implements FileDownloadResult {

        @k
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Uri f301671b;

        /* compiled from: FileDownloadResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success((Uri) parcel.readParcelable(Success.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i12) {
                return new Success[i12];
            }
        }

        public Success(@k Uri uri) {
            this.f301671b = uri;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && L.f(this.f301671b, ((Success) obj).f301671b);
        }

        public final int hashCode() {
            return this.f301671b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("Success(uri="), this.f301671b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f301671b, i12);
        }
    }
}
