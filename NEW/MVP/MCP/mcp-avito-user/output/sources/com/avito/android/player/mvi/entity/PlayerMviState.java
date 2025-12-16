package com.avito.android.player.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PlayerMviState.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerMviState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "Error", "Initial", "Loaded", "Loading", "Lcom/avito/android/player/mvi/entity/PlayerMviState$Error;", "Lcom/avito/android/player/mvi/entity/PlayerMviState$Initial;", "Lcom/avito/android/player/mvi/entity/PlayerMviState$Loaded;", "Lcom/avito/android/player/mvi/entity/PlayerMviState$Loading;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class PlayerMviState extends q implements Parcelable {

    /* compiled from: PlayerMviState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerMviState$Error;", "Lcom/avito/android/player/mvi/entity/PlayerMviState;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error extends PlayerMviState {

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f220183b;

        /* compiled from: PlayerMviState.kt */
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

        public Error(@k String str) {
            super(null);
            this.f220183b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f220183b, ((Error) obj).f220183b);
        }

        public final int hashCode() {
            return this.f220183b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(message="), this.f220183b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f220183b);
        }
    }

    /* compiled from: PlayerMviState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerMviState$Initial;", "Lcom/avito/android/player/mvi/entity/PlayerMviState;", "<init>", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Initial extends PlayerMviState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Initial f220184b = new Initial();

        @k
        public static final Parcelable.Creator<Initial> CREATOR = new a();

        /* compiled from: PlayerMviState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Initial> {
            @Override // android.os.Parcelable.Creator
            public final Initial createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Initial.f220184b;
            }

            @Override // android.os.Parcelable.Creator
            public final Initial[] newArray(int i12) {
                return new Initial[i12];
            }
        }

        public Initial() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PlayerMviState.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerMviState$Loaded;", "Lcom/avito/android/player/mvi/entity/PlayerMviState;", "<init>", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loaded extends PlayerMviState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loaded f220185b = new Loaded();

        @k
        public static final Parcelable.Creator<Loaded> CREATOR = new a();

        /* compiled from: PlayerMviState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Loaded> {
            @Override // android.os.Parcelable.Creator
            public final Loaded createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Loaded.f220185b;
            }

            @Override // android.os.Parcelable.Creator
            public final Loaded[] newArray(int i12) {
                return new Loaded[i12];
            }
        }

        public Loaded() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PlayerMviState.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerMviState$Loading;", "Lcom/avito/android/player/mvi/entity/PlayerMviState;", "<init>", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends PlayerMviState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f220186b = new Loading();

        @k
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* compiled from: PlayerMviState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Loading.f220186b;
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i12) {
                return new Loading[i12];
            }
        }

        public Loading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ PlayerMviState(C42822w c42822w) {
        this();
    }

    public PlayerMviState() {
    }
}
