package com.avito.android.forceupdate.domain.dto;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UpdateSource.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/forceupdate/domain/dto/UpdateSource;", "Landroid/os/Parcelable;", "()V", "Custom", "Official", "SelfUpdate", "Lcom/avito/android/forceupdate/domain/dto/UpdateSource$Custom;", "Lcom/avito/android/forceupdate/domain/dto/UpdateSource$Official;", "Lcom/avito/android/forceupdate/domain/dto/UpdateSource$SelfUpdate;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class UpdateSource implements Parcelable {

    /* compiled from: UpdateSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/forceupdate/domain/dto/UpdateSource$Custom;", "Lcom/avito/android/forceupdate/domain/dto/UpdateSource;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Custom extends UpdateSource {

        @k
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f158465b;

        /* compiled from: UpdateSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Custom> {
            @Override // android.os.Parcelable.Creator
            public final Custom createFromParcel(Parcel parcel) {
                return new Custom(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Custom[] newArray(int i12) {
                return new Custom[i12];
            }
        }

        public Custom(@k String str) {
            super(null);
            this.f158465b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Custom) && L.f(this.f158465b, ((Custom) obj).f158465b);
        }

        public final int hashCode() {
            return this.f158465b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Custom(updateSourceUri="), this.f158465b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f158465b);
        }
    }

    /* compiled from: UpdateSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/domain/dto/UpdateSource$Official;", "Lcom/avito/android/forceupdate/domain/dto/UpdateSource;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Official extends UpdateSource {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Official f158466b = new Official();

        @k
        public static final Parcelable.Creator<Official> CREATOR = new a();

        /* compiled from: UpdateSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Official> {
            @Override // android.os.Parcelable.Creator
            public final Official createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Official.f158466b;
            }

            @Override // android.os.Parcelable.Creator
            public final Official[] newArray(int i12) {
                return new Official[i12];
            }
        }

        public Official() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Official);
        }

        public final int hashCode() {
            return -52224767;
        }

        @k
        public final String toString() {
            return "Official";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: UpdateSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/domain/dto/UpdateSource$SelfUpdate;", "Lcom/avito/android/forceupdate/domain/dto/UpdateSource;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelfUpdate extends UpdateSource {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SelfUpdate f158467b = new SelfUpdate();

        @k
        public static final Parcelable.Creator<SelfUpdate> CREATOR = new a();

        /* compiled from: UpdateSource.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelfUpdate> {
            @Override // android.os.Parcelable.Creator
            public final SelfUpdate createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SelfUpdate.f158467b;
            }

            @Override // android.os.Parcelable.Creator
            public final SelfUpdate[] newArray(int i12) {
                return new SelfUpdate[i12];
            }
        }

        public SelfUpdate() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SelfUpdate);
        }

        public final int hashCode() {
            return 1183162315;
        }

        @k
        public final String toString() {
            return "SelfUpdate";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ UpdateSource(C42822w c42822w) {
        this();
    }

    public UpdateSource() {
    }
}
