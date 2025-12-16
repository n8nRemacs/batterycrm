package com.avito.android.profile.pro.impl.screen.mvi.entity;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.profile.pro.impl.network.response.ProDashboardResponse;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DashboardAction.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/mvi/entity/DashboardAction;", "Landroid/os/Parcelable;", "Content", "Error", "LoadDashboard", "Lcom/avito/android/profile/pro/impl/screen/mvi/entity/DashboardAction$Content;", "Lcom/avito/android/profile/pro/impl/screen/mvi/entity/DashboardAction$Error;", "Lcom/avito/android/profile/pro/impl/screen/mvi/entity/DashboardAction$LoadDashboard;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface DashboardAction extends Parcelable {

    /* compiled from: DashboardAction.kt */
    @d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/mvi/entity/DashboardAction$Error;", "Lcom/avito/android/profile/pro/impl/screen/mvi/entity/DashboardAction;", "Landroid/os/Parcelable;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements DashboardAction, Parcelable {

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f223699b;

        /* compiled from: DashboardAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error((ApiError) parcel.readParcelable(Error.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        public Error(@l ApiError apiError) {
            this.f223699b = apiError;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f223699b, ((Error) obj).f223699b);
        }

        public final int hashCode() {
            ApiError apiError = this.f223699b;
            if (apiError == null) {
                return 0;
            }
            return apiError.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(apiError="), this.f223699b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f223699b, i12);
        }
    }

    /* compiled from: DashboardAction.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/mvi/entity/DashboardAction$LoadDashboard;", "Lcom/avito/android/profile/pro/impl/screen/mvi/entity/DashboardAction;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadDashboard implements DashboardAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoadDashboard f223700b = new LoadDashboard();

        @k
        public static final Parcelable.Creator<LoadDashboard> CREATOR = new a();

        /* compiled from: DashboardAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LoadDashboard> {
            @Override // android.os.Parcelable.Creator
            public final LoadDashboard createFromParcel(Parcel parcel) {
                parcel.readInt();
                return LoadDashboard.f223700b;
            }

            @Override // android.os.Parcelable.Creator
            public final LoadDashboard[] newArray(int i12) {
                return new LoadDashboard[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LoadDashboard);
        }

        public final int hashCode() {
            return -777364814;
        }

        @k
        public final String toString() {
            return "LoadDashboard";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: DashboardAction.kt */
    @d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/mvi/entity/DashboardAction$Content;", "Lcom/avito/android/profile/pro/impl/screen/mvi/entity/DashboardAction;", "Landroid/os/Parcelable;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements DashboardAction, Parcelable {

        @k
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final CptOrders f223697b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ProDashboardResponse.Period f223698c;

        /* compiled from: DashboardAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Content> {
            @Override // android.os.Parcelable.Creator
            public final Content createFromParcel(Parcel parcel) {
                return new Content(parcel.readInt() == 0 ? null : CptOrders.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ProDashboardResponse.Period.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Content[] newArray(int i12) {
                return new Content[i12];
            }
        }

        public Content(@l CptOrders cptOrders, @l ProDashboardResponse.Period period) {
            this.f223697b = cptOrders;
            this.f223698c = period;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f223697b, content.f223697b) && L.f(this.f223698c, content.f223698c);
        }

        public final int hashCode() {
            CptOrders cptOrders = this.f223697b;
            int iHashCode = (cptOrders == null ? 0 : cptOrders.hashCode()) * 31;
            ProDashboardResponse.Period period = this.f223698c;
            return iHashCode + (period != null ? period.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Content(cptOrders=" + this.f223697b + ", period=" + this.f223698c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            CptOrders cptOrders = this.f223697b;
            if (cptOrders == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                cptOrders.writeToParcel(parcel, i12);
            }
            ProDashboardResponse.Period period = this.f223698c;
            if (period == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                period.writeToParcel(parcel, i12);
            }
        }

        public /* synthetic */ Content(CptOrders cptOrders, ProDashboardResponse.Period period, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : cptOrders, period);
        }
    }
}
