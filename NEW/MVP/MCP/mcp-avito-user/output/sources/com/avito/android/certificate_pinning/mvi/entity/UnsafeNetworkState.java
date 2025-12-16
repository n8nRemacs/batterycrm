package com.avito.android.certificate_pinning.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UnsafeNetworkState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "a", "ViewState", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UnsafeNetworkState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f117816b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f117817c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f117818d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ViewState f117819e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f117814f = new a(null);

    @k
    public static final Parcelable.Creator<UnsafeNetworkState> CREATOR = new b();

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final UnsafeNetworkState f117815g = new UnsafeNetworkState(null, true, false, ViewState.UnsafeNetwork.f117821b);

    /* compiled from: UnsafeNetworkState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkState$ViewState;", "Landroid/os/Parcelable;", "AuthorizationRequired", "UnsafeNetwork", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkState$ViewState$AuthorizationRequired;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkState$ViewState$UnsafeNetwork;", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ViewState extends Parcelable {

        /* compiled from: UnsafeNetworkState.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkState$ViewState$AuthorizationRequired;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkState$ViewState;", "<init>", "()V", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AuthorizationRequired implements ViewState {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final AuthorizationRequired f117820b = new AuthorizationRequired();

            @k
            public static final Parcelable.Creator<AuthorizationRequired> CREATOR = new a();

            /* compiled from: UnsafeNetworkState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AuthorizationRequired> {
                @Override // android.os.Parcelable.Creator
                public final AuthorizationRequired createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AuthorizationRequired.f117820b;
                }

                @Override // android.os.Parcelable.Creator
                public final AuthorizationRequired[] newArray(int i12) {
                    return new AuthorizationRequired[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof AuthorizationRequired);
            }

            public final int hashCode() {
                return 967557558;
            }

            @k
            public final String toString() {
                return "AuthorizationRequired";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: UnsafeNetworkState.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkState$ViewState$UnsafeNetwork;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkState$ViewState;", "<init>", "()V", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UnsafeNetwork implements ViewState {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final UnsafeNetwork f117821b = new UnsafeNetwork();

            @k
            public static final Parcelable.Creator<UnsafeNetwork> CREATOR = new a();

            /* compiled from: UnsafeNetworkState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<UnsafeNetwork> {
                @Override // android.os.Parcelable.Creator
                public final UnsafeNetwork createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return UnsafeNetwork.f117821b;
                }

                @Override // android.os.Parcelable.Creator
                public final UnsafeNetwork[] newArray(int i12) {
                    return new UnsafeNetwork[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof UnsafeNetwork);
            }

            public final int hashCode() {
                return 727927334;
            }

            @k
            public final String toString() {
                return "UnsafeNetwork";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }
    }

    /* compiled from: UnsafeNetworkState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkState$a;", "", "<init>", "()V", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UnsafeNetworkState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<UnsafeNetworkState> {
        @Override // android.os.Parcelable.Creator
        public final UnsafeNetworkState createFromParcel(Parcel parcel) {
            return new UnsafeNetworkState(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (ViewState) parcel.readParcelable(UnsafeNetworkState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UnsafeNetworkState[] newArray(int i12) {
            return new UnsafeNetworkState[i12];
        }
    }

    public UnsafeNetworkState(@l String str, boolean z12, boolean z13, @k ViewState viewState) {
        this.f117816b = str;
        this.f117817c = z12;
        this.f117818d = z13;
        this.f117819e = viewState;
    }

    public static UnsafeNetworkState a(UnsafeNetworkState unsafeNetworkState, String str, boolean z12, ViewState viewState, int i12) {
        if ((i12 & 1) != 0) {
            str = unsafeNetworkState.f117816b;
        }
        boolean z13 = (i12 & 2) != 0 ? unsafeNetworkState.f117817c : false;
        if ((i12 & 8) != 0) {
            viewState = unsafeNetworkState.f117819e;
        }
        unsafeNetworkState.getClass();
        return new UnsafeNetworkState(str, z13, z12, viewState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsafeNetworkState)) {
            return false;
        }
        UnsafeNetworkState unsafeNetworkState = (UnsafeNetworkState) obj;
        return L.f(this.f117816b, unsafeNetworkState.f117816b) && this.f117817c == unsafeNetworkState.f117817c && this.f117818d == unsafeNetworkState.f117818d && L.f(this.f117819e, unsafeNetworkState.f117819e);
    }

    public final int hashCode() {
        String str = this.f117816b;
        return this.f117819e.hashCode() + r.i(r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f117817c), 31, this.f117818d);
    }

    @k
    public final String toString() {
        return "UnsafeNetworkState(redirectUrl=" + this.f117816b + ", firstCheck=" + this.f117817c + ", isLoading=" + this.f117818d + ", viewState=" + this.f117819e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f117816b);
        parcel.writeInt(this.f117817c ? 1 : 0);
        parcel.writeInt(this.f117818d ? 1 : 0);
        parcel.writeParcelable(this.f117819e, i12);
    }
}
