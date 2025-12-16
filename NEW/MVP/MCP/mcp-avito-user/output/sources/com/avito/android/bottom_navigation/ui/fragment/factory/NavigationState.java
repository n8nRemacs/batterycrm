package com.avito.android.bottom_navigation.ui.fragment.factory;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: NavigationState.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/factory/NavigationState;", "Landroid/os/Parcelable;", "NavbarBusiness360", "_avito_bottom-navigation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NavigationState implements Parcelable {

    @k
    public static final Parcelable.Creator<NavigationState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f107149b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NavbarBusiness360 f107150c;

    /* compiled from: NavigationState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/factory/NavigationState$NavbarBusiness360;", "Landroid/os/Parcelable;", "Hide", "Show", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/NavigationState$NavbarBusiness360$Hide;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/NavigationState$NavbarBusiness360$Show;", "_avito_bottom-navigation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class NavbarBusiness360 implements Parcelable {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f107151b;

        /* compiled from: NavigationState.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/factory/NavigationState$NavbarBusiness360$Hide;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/NavigationState$NavbarBusiness360;", "<init>", "()V", "_avito_bottom-navigation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Hide extends NavbarBusiness360 {

            /* renamed from: c, reason: collision with root package name */
            @k
            public static final Hide f107152c = new Hide();

            @k
            public static final Parcelable.Creator<Hide> CREATOR = new a();

            /* compiled from: NavigationState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Hide> {
                @Override // android.os.Parcelable.Creator
                public final Hide createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Hide.f107152c;
                }

                @Override // android.os.Parcelable.Creator
                public final Hide[] newArray(int i12) {
                    return new Hide[i12];
                }
            }

            public Hide() {
                super(false, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof Hide);
            }

            public final int hashCode() {
                return -1937538755;
            }

            @k
            public final String toString() {
                return "Hide";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: NavigationState.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/factory/NavigationState$NavbarBusiness360$Show;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/NavigationState$NavbarBusiness360;", "_avito_bottom-navigation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Show extends NavbarBusiness360 {

            @k
            public static final Parcelable.Creator<Show> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            public final boolean f107153c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f107154d;

            /* compiled from: NavigationState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Show> {
                @Override // android.os.Parcelable.Creator
                public final Show createFromParcel(Parcel parcel) {
                    return new Show(parcel.readInt() != 0, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Show[] newArray(int i12) {
                    return new Show[i12];
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Show() {
                boolean z12 = false;
                this(z12, z12, 3, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Show)) {
                    return false;
                }
                Show show = (Show) obj;
                return this.f107153c == show.f107153c && this.f107154d == show.f107154d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f107154d) + (Boolean.hashCode(this.f107153c) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Show(showCloseIcon=");
                sb2.append(this.f107153c);
                sb2.append(", isLogoClickable=");
                return r.x(sb2, this.f107154d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.f107153c ? 1 : 0);
                parcel.writeInt(this.f107154d ? 1 : 0);
            }

            public /* synthetic */ Show(boolean z12, boolean z13, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? true : z13);
            }

            public Show(boolean z12, boolean z13) {
                super(true, null);
                this.f107153c = z12;
                this.f107154d = z13;
            }
        }

        public NavbarBusiness360(boolean z12, C42822w c42822w) {
            this.f107151b = z12;
        }
    }

    /* compiled from: NavigationState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NavigationState> {
        @Override // android.os.Parcelable.Creator
        public final NavigationState createFromParcel(Parcel parcel) {
            return new NavigationState(parcel.readInt() != 0, (NavbarBusiness360) parcel.readParcelable(NavigationState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NavigationState[] newArray(int i12) {
            return new NavigationState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationState)) {
            return false;
        }
        NavigationState navigationState = (NavigationState) obj;
        return this.f107149b == navigationState.f107149b && L.f(this.f107150c, navigationState.f107150c);
    }

    public final int hashCode() {
        return this.f107150c.hashCode() + (Boolean.hashCode(this.f107149b) * 31);
    }

    @k
    public final String toString() {
        return "NavigationState(showNavigation=" + this.f107149b + ", navbarBusiness360=" + this.f107150c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f107149b ? 1 : 0);
        parcel.writeParcelable(this.f107150c, i12);
    }

    public NavigationState(boolean z12, @k NavbarBusiness360 navbarBusiness360) {
        this.f107149b = z12;
        this.f107150c = navbarBusiness360;
    }

    public /* synthetic */ NavigationState(boolean z12, NavbarBusiness360 navbarBusiness360, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? NavbarBusiness360.Hide.f107152c : navbarBusiness360);
    }
}
