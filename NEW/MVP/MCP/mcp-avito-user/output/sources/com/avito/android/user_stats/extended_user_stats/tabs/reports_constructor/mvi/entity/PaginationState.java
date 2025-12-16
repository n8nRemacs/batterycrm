package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: ConstructorTabState.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/PaginationState;", "Landroid/os/Parcelable;", "Error", "Loaded", "Loading", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/PaginationState$Error;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/PaginationState$Loaded;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/PaginationState$Loading;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PaginationState extends Parcelable {

    /* compiled from: ConstructorTabState.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/PaginationState$Error;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/PaginationState;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements PaginationState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Error f318226b = new Error();

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* compiled from: ConstructorTabState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Error.f318226b;
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 1980701251;
        }

        @k
        public final String toString() {
            return "Error";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ConstructorTabState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/PaginationState$Loaded;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/PaginationState;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements PaginationState {

        @k
        public static final Parcelable.Creator<Loaded> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f318227b;

        /* compiled from: ConstructorTabState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Loaded> {
            @Override // android.os.Parcelable.Creator
            public final Loaded createFromParcel(Parcel parcel) {
                return new Loaded(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Loaded[] newArray(int i12) {
                return new Loaded[i12];
            }
        }

        public Loaded(boolean z12) {
            this.f318227b = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && this.f318227b == ((Loaded) obj).f318227b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f318227b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Loaded(canLoadNext="), this.f318227b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f318227b ? 1 : 0);
        }
    }

    /* compiled from: ConstructorTabState.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/PaginationState$Loading;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/PaginationState;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements PaginationState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f318228b = new Loading();

        @k
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* compiled from: ConstructorTabState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Loading.f318228b;
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i12) {
                return new Loading[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1695938889;
        }

        @k
        public final String toString() {
            return "Loading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }
}
