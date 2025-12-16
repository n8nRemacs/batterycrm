package com.avito.android.service_booking_day_settings;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DaySettingsRouterArg.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_day_settings/DaySettingsRouterArg;", "Landroid/os/Parcelable;", "Route", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DaySettingsRouterArg implements Parcelable {

    @k
    public static final Parcelable.Creator<DaySettingsRouterArg> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Route f276685b;

    /* compiled from: DaySettingsRouterArg.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/DaySettingsRouterArg$Route;", "Landroid/os/Parcelable;", "Settings", "Lcom/avito/android/service_booking_day_settings/DaySettingsRouterArg$Route$Settings;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Route extends Parcelable {

        /* compiled from: DaySettingsRouterArg.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/DaySettingsRouterArg$Route$Settings;", "Lcom/avito/android/service_booking_day_settings/DaySettingsRouterArg$Route;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Settings implements Route {

            @k
            public static final Parcelable.Creator<Settings> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DaySettingsFragmentArgs f276686b;

            /* compiled from: DaySettingsRouterArg.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Settings> {
                @Override // android.os.Parcelable.Creator
                public final Settings createFromParcel(Parcel parcel) {
                    return new Settings(DaySettingsFragmentArgs.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Settings[] newArray(int i12) {
                    return new Settings[i12];
                }
            }

            public Settings(@k DaySettingsFragmentArgs daySettingsFragmentArgs) {
                this.f276686b = daySettingsFragmentArgs;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Settings) && L.f(this.f276686b, ((Settings) obj).f276686b);
            }

            public final int hashCode() {
                return this.f276686b.f276684b.hashCode();
            }

            @k
            public final String toString() {
                return "Settings(args=" + this.f276686b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                this.f276686b.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: DaySettingsRouterArg.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DaySettingsRouterArg> {
        @Override // android.os.Parcelable.Creator
        public final DaySettingsRouterArg createFromParcel(Parcel parcel) {
            return new DaySettingsRouterArg((Route) parcel.readParcelable(DaySettingsRouterArg.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DaySettingsRouterArg[] newArray(int i12) {
            return new DaySettingsRouterArg[i12];
        }
    }

    public DaySettingsRouterArg(@k Route route) {
        this.f276685b = route;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DaySettingsRouterArg) && L.f(this.f276685b, ((DaySettingsRouterArg) obj).f276685b);
    }

    public final int hashCode() {
        return this.f276685b.hashCode();
    }

    @k
    public final String toString() {
        return "DaySettingsRouterArg(route=" + this.f276685b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f276685b, i12);
    }
}
