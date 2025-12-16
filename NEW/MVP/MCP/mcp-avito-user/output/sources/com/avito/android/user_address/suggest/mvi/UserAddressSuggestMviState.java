package com.avito.android.user_address.suggest.mvi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.user_address.suggest.data.SuggestItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UserAddressSuggestMviState.kt */
@K51.d
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "<init>", "()V", "ApiError", "a", "Content", "NetworkError", "ShimmerLoading", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState$ApiError;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState$Content;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState$NetworkError;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState$ShimmerLoading;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class UserAddressSuggestMviState extends com.avito.android.analytics.screens.mvi.q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f308083b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Content.NoResult f308084c = new Content.NoResult("");

    /* compiled from: UserAddressSuggestMviState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState$ApiError;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ApiError extends UserAddressSuggestMviState {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final ApiError f308085d = new ApiError();

        @Y61.k
        public static final Parcelable.Creator<ApiError> CREATOR = new a();

        /* compiled from: UserAddressSuggestMviState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ApiError> {
            @Override // android.os.Parcelable.Creator
            public final ApiError createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ApiError.f308085d;
            }

            @Override // android.os.Parcelable.Creator
            public final ApiError[] newArray(int i12) {
                return new ApiError[i12];
            }
        }

        public ApiError() {
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

    /* compiled from: UserAddressSuggestMviState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState$Content;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState;", "<init>", "()V", "Data", "NoResult", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState$Content$Data;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState$Content$NoResult;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static abstract class Content extends UserAddressSuggestMviState {

        /* compiled from: UserAddressSuggestMviState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState$Content$Data;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState$Content;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Data extends Content {

            @Y61.k
            public static final Parcelable.Creator<Data> CREATOR = new a();

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f308086d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final Object f308087e;

            /* compiled from: UserAddressSuggestMviState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Data> {
                @Override // android.os.Parcelable.Creator
                public final Data createFromParcel(Parcel parcel) {
                    String string = parcel.readString();
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(SuggestItem.CREATOR, parcel, arrayList, iC2, 1);
                    }
                    return new Data(string, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Data[] newArray(int i12) {
                    return new Data[i12];
                }
            }

            public Data(@Y61.k String str, @Y61.k List<SuggestItem> list) {
                super(null);
                this.f308086d = str;
                this.f308087e = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Data)) {
                    return false;
                }
                Data data = (Data) obj;
                return L.f(this.f308086d, data.f308086d) && L.f(this.f308087e, data.f308087e);
            }

            public final int hashCode() {
                return this.f308087e.hashCode() + (this.f308086d.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Data(inputAddress=");
                sb2.append(this.f308086d);
                sb2.append(", suggests=");
                return H.n(sb2, this.f308087e, ')');
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f308086d);
                ?? r02 = this.f308087e;
                parcel.writeInt(r02.size());
                Iterator it = r02.iterator();
                while (it.hasNext()) {
                    ((SuggestItem) it.next()).writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: UserAddressSuggestMviState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState$Content$NoResult;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState$Content;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NoResult extends Content {

            @Y61.k
            public static final Parcelable.Creator<NoResult> CREATOR = new a();

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f308088d;

            /* compiled from: UserAddressSuggestMviState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<NoResult> {
                @Override // android.os.Parcelable.Creator
                public final NoResult createFromParcel(Parcel parcel) {
                    return new NoResult(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final NoResult[] newArray(int i12) {
                    return new NoResult[i12];
                }
            }

            public NoResult(@Y61.k String str) {
                super(null);
                this.f308088d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NoResult) && L.f(this.f308088d, ((NoResult) obj).f308088d);
            }

            public final int hashCode() {
                return this.f308088d.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("NoResult(inputAddress="), this.f308088d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f308088d);
            }
        }

        public /* synthetic */ Content(C42822w c42822w) {
            this();
        }

        public Content() {
            super(null);
        }
    }

    /* compiled from: UserAddressSuggestMviState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState$NetworkError;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NetworkError extends UserAddressSuggestMviState {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final NetworkError f308089d = new NetworkError();

        @Y61.k
        public static final Parcelable.Creator<NetworkError> CREATOR = new a();

        /* compiled from: UserAddressSuggestMviState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NetworkError> {
            @Override // android.os.Parcelable.Creator
            public final NetworkError createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NetworkError.f308089d;
            }

            @Override // android.os.Parcelable.Creator
            public final NetworkError[] newArray(int i12) {
                return new NetworkError[i12];
            }
        }

        public NetworkError() {
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

    /* compiled from: UserAddressSuggestMviState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState$ShimmerLoading;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShimmerLoading extends UserAddressSuggestMviState {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final ShimmerLoading f308090d = new ShimmerLoading();

        @Y61.k
        public static final Parcelable.Creator<ShimmerLoading> CREATOR = new a();

        /* compiled from: UserAddressSuggestMviState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShimmerLoading> {
            @Override // android.os.Parcelable.Creator
            public final ShimmerLoading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ShimmerLoading.f308090d;
            }

            @Override // android.os.Parcelable.Creator
            public final ShimmerLoading[] newArray(int i12) {
                return new ShimmerLoading[i12];
            }
        }

        public ShimmerLoading() {
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

    /* compiled from: UserAddressSuggestMviState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState$a;", "", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ UserAddressSuggestMviState(C42822w c42822w) {
        this();
    }

    public UserAddressSuggestMviState() {
    }
}
