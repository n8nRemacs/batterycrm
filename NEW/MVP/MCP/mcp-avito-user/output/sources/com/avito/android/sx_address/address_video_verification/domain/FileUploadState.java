package com.avito.android.sx_address.address_video_verification.domain;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: File.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/domain/FileUploadState;", "Landroid/os/Parcelable;", "Error", "Uploaded", "Uploading", "Lcom/avito/android/sx_address/address_video_verification/domain/FileUploadState$Error;", "Lcom/avito/android/sx_address/address_video_verification/domain/FileUploadState$Uploaded;", "Lcom/avito/android/sx_address/address_video_verification/domain/FileUploadState$Uploading;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface FileUploadState extends Parcelable {

    /* compiled from: File.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/domain/FileUploadState$Error;", "Lcom/avito/android/sx_address/address_video_verification/domain/FileUploadState;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Error implements FileUploadState {

        @Y61.k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f292600b;

        /* compiled from: File.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        public Error(@Y61.k String str) {
            this.f292600b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f292600b, ((Error) obj).f292600b);
        }

        public final int hashCode() {
            return this.f292600b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(message="), this.f292600b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f292600b);
        }
    }

    /* compiled from: File.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/domain/FileUploadState$Uploaded;", "Lcom/avito/android/sx_address/address_video_verification/domain/FileUploadState;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Uploaded implements FileUploadState {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Uploaded f292601b = new Uploaded();

        @Y61.k
        public static final Parcelable.Creator<Uploaded> CREATOR = new a();

        /* compiled from: File.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Uploaded> {
            @Override // android.os.Parcelable.Creator
            public final Uploaded createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Uploaded.f292601b;
            }

            @Override // android.os.Parcelable.Creator
            public final Uploaded[] newArray(int i12) {
                return new Uploaded[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof Uploaded);
        }

        public final int hashCode() {
            return -22657111;
        }

        @Y61.k
        public final String toString() {
            return "Uploaded";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: File.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/domain/FileUploadState$Uploading;", "Lcom/avito/android/sx_address/address_video_verification/domain/FileUploadState;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Uploading implements FileUploadState {

        @Y61.k
        public static final Parcelable.Creator<Uploading> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final float f292602b;

        /* compiled from: File.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Uploading> {
            @Override // android.os.Parcelable.Creator
            public final Uploading createFromParcel(Parcel parcel) {
                return new Uploading(parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final Uploading[] newArray(int i12) {
                return new Uploading[i12];
            }
        }

        public Uploading(float f12) {
            this.f292602b = f12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Uploading) && Float.compare(this.f292602b, ((Uploading) obj).f292602b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f292602b);
        }

        @Y61.k
        public final String toString() {
            return r.k(')', this.f292602b, new StringBuilder("Uploading(progress="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeFloat(this.f292602b);
        }
    }
}
