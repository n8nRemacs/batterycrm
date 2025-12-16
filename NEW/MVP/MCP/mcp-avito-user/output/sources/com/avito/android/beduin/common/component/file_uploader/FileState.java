package com.avito.android.beduin.common.component.file_uploader;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinFileUploaderModel.kt */
@K51.d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/FileState;", "Landroid/os/Parcelable;", "()V", "Deleting", "Error", "Idle", "Loading", "Lcom/avito/android/beduin/common/component/file_uploader/FileState$Deleting;", "Lcom/avito/android/beduin/common/component/file_uploader/FileState$Error;", "Lcom/avito/android/beduin/common/component/file_uploader/FileState$Idle;", "Lcom/avito/android/beduin/common/component/file_uploader/FileState$Loading;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class FileState implements Parcelable {

    /* compiled from: BeduinFileUploaderModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/FileState$Deleting;", "Lcom/avito/android/beduin/common/component/file_uploader/FileState;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Deleting extends FileState {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Deleting f101208b = new Deleting();

        @Y61.k
        public static final Parcelable.Creator<Deleting> CREATOR = new a();

        /* compiled from: BeduinFileUploaderModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Deleting> {
            @Override // android.os.Parcelable.Creator
            public final Deleting createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Deleting.f101208b;
            }

            @Override // android.os.Parcelable.Creator
            public final Deleting[] newArray(int i12) {
                return new Deleting[i12];
            }
        }

        public Deleting() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: BeduinFileUploaderModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/FileState$Error;", "Lcom/avito/android/beduin/common/component/file_uploader/FileState;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error extends FileState {

        @Y61.k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f101209b;

        /* compiled from: BeduinFileUploaderModel.kt */
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
            super(null);
            this.f101209b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f101209b, ((Error) obj).f101209b);
        }

        public final int hashCode() {
            return this.f101209b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(message="), this.f101209b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f101209b);
        }
    }

    /* compiled from: BeduinFileUploaderModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/FileState$Idle;", "Lcom/avito/android/beduin/common/component/file_uploader/FileState;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Idle extends FileState {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Idle f101210b = new Idle();

        @Y61.k
        public static final Parcelable.Creator<Idle> CREATOR = new a();

        /* compiled from: BeduinFileUploaderModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Idle> {
            @Override // android.os.Parcelable.Creator
            public final Idle createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Idle.f101210b;
            }

            @Override // android.os.Parcelable.Creator
            public final Idle[] newArray(int i12) {
                return new Idle[i12];
            }
        }

        public Idle() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: BeduinFileUploaderModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/FileState$Loading;", "Lcom/avito/android/beduin/common/component/file_uploader/FileState;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading extends FileState {

        @Y61.k
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final float f101211b;

        /* compiled from: BeduinFileUploaderModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                return new Loading(parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i12) {
                return new Loading[i12];
            }
        }

        public Loading(float f12) {
            super(null);
            this.f101211b = f12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Float.compare(this.f101211b, ((Loading) obj).f101211b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f101211b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f101211b, new StringBuilder("Loading(progress="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeFloat(this.f101211b);
        }
    }

    public /* synthetic */ FileState(C42822w c42822w) {
        this();
    }

    public FileState() {
    }
}
