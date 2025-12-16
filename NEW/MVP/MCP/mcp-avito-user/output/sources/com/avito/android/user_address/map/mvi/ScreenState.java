package com.avito.android.user_address.map.mvi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAddressMapMviState.kt */
@K51.d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/user_address/map/mvi/ScreenState;", "Landroid/os/Parcelable;", "()V", "CommonState", "Error", "LoadingState", "Lcom/avito/android/user_address/map/mvi/ScreenState$CommonState;", "Lcom/avito/android/user_address/map/mvi/ScreenState$Error;", "Lcom/avito/android/user_address/map/mvi/ScreenState$LoadingState;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ScreenState implements Parcelable {

    /* compiled from: UserAddressMapMviState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/ScreenState$CommonState;", "Lcom/avito/android/user_address/map/mvi/ScreenState;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CommonState extends ScreenState {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final CommonState f307715b = new CommonState();

        @Y61.k
        public static final Parcelable.Creator<CommonState> CREATOR = new a();

        /* compiled from: UserAddressMapMviState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CommonState> {
            @Override // android.os.Parcelable.Creator
            public final CommonState createFromParcel(Parcel parcel) {
                parcel.readInt();
                return CommonState.f307715b;
            }

            @Override // android.os.Parcelable.Creator
            public final CommonState[] newArray(int i12) {
                return new CommonState[i12];
            }
        }

        public CommonState() {
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

    /* compiled from: UserAddressMapMviState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_address/map/mvi/ScreenState$Error;", "Lcom/avito/android/user_address/map/mvi/ScreenState;", "()V", "Api", "Network", "Lcom/avito/android/user_address/map/mvi/ScreenState$Error$Api;", "Lcom/avito/android/user_address/map/mvi/ScreenState$Error$Network;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Error extends ScreenState {

        /* compiled from: UserAddressMapMviState.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/ScreenState$Error$Api;", "Lcom/avito/android/user_address/map/mvi/ScreenState$Error;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Api extends Error {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Api f307716b = new Api();

            @Y61.k
            public static final Parcelable.Creator<Api> CREATOR = new a();

            /* compiled from: UserAddressMapMviState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Api> {
                @Override // android.os.Parcelable.Creator
                public final Api createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Api.f307716b;
                }

                @Override // android.os.Parcelable.Creator
                public final Api[] newArray(int i12) {
                    return new Api[i12];
                }
            }

            public Api() {
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

        /* compiled from: UserAddressMapMviState.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/ScreenState$Error$Network;", "Lcom/avito/android/user_address/map/mvi/ScreenState$Error;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Network extends Error {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Network f307717b = new Network();

            @Y61.k
            public static final Parcelable.Creator<Network> CREATOR = new a();

            /* compiled from: UserAddressMapMviState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Network> {
                @Override // android.os.Parcelable.Creator
                public final Network createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Network.f307717b;
                }

                @Override // android.os.Parcelable.Creator
                public final Network[] newArray(int i12) {
                    return new Network[i12];
                }
            }

            public Network() {
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

        public /* synthetic */ Error(C42822w c42822w) {
            this();
        }

        public Error() {
            super(null);
        }
    }

    /* compiled from: UserAddressMapMviState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/ScreenState$LoadingState;", "Lcom/avito/android/user_address/map/mvi/ScreenState;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingState extends ScreenState {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final LoadingState f307718b = new LoadingState();

        @Y61.k
        public static final Parcelable.Creator<LoadingState> CREATOR = new a();

        /* compiled from: UserAddressMapMviState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LoadingState> {
            @Override // android.os.Parcelable.Creator
            public final LoadingState createFromParcel(Parcel parcel) {
                parcel.readInt();
                return LoadingState.f307718b;
            }

            @Override // android.os.Parcelable.Creator
            public final LoadingState[] newArray(int i12) {
                return new LoadingState[i12];
            }
        }

        public LoadingState() {
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

    public /* synthetic */ ScreenState(C42822w c42822w) {
        this();
    }

    public ScreenState() {
    }
}
