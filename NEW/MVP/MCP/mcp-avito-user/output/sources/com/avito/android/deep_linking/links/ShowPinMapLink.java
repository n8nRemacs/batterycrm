package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.RouteButtons;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47204b;

/* compiled from: ShowPinMapLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/ShowPinMapLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Argument", "NavigationSource", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class ShowPinMapLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ShowPinMapLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f133664b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133665c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Coordinates f133666d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final RouteButtons f133667e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f133668f;

    /* compiled from: ShowPinMapLink.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/ShowPinMapLink$Argument;", "Landroid/os/Parcelable;", "a", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Argument implements Parcelable {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final NavigationSource f133670b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final a f133669c = new a(null);

        @Y61.k
        public static final Parcelable.Creator<Argument> CREATOR = new b();

        /* compiled from: ShowPinMapLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/ShowPinMapLink$Argument$a;", "", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        /* compiled from: ShowPinMapLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Argument> {
            @Override // android.os.Parcelable.Creator
            public final Argument createFromParcel(Parcel parcel) {
                return new Argument(NavigationSource.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Argument[] newArray(int i12) {
                return new Argument[i12];
            }
        }

        public Argument(@Y61.k NavigationSource navigationSource) {
            this.f133670b = navigationSource;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Argument) && this.f133670b == ((Argument) obj).f133670b;
        }

        public final int hashCode() {
            return this.f133670b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Argument(source=" + this.f133670b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133670b.name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShowPinMapLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ShowPinMapLink$NavigationSource;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NavigationSource {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ NavigationSource[] f133671b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f133672c;

        static {
            NavigationSource[] navigationSourceArr = {new NavigationSource("SHOP_DETAILED", 0)};
            f133671b = navigationSourceArr;
            f133672c = kotlin.enums.c.a(navigationSourceArr);
        }

        public NavigationSource() {
            throw null;
        }

        public static NavigationSource valueOf(String str) {
            return (NavigationSource) Enum.valueOf(NavigationSource.class, str);
        }

        public static NavigationSource[] values() {
            return (NavigationSource[]) f133671b.clone();
        }
    }

    /* compiled from: ShowPinMapLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ShowPinMapLink> {
        @Override // android.os.Parcelable.Creator
        public final ShowPinMapLink createFromParcel(Parcel parcel) {
            return new ShowPinMapLink(parcel.readString(), parcel.readString(), Coordinates.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RouteButtons.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShowPinMapLink[] newArray(int i12) {
            return new ShowPinMapLink[i12];
        }
    }

    public /* synthetic */ ShowPinMapLink(String str, String str2, Coordinates coordinates, RouteButtons routeButtons, String str3, int i12, C42822w c42822w) {
        this(str, str2, coordinates, (i12 & 8) != 0 ? null : routeButtons, (i12 & 16) != 0 ? null : str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133664b);
        parcel.writeString(this.f133665c);
        this.f133666d.writeToParcel(parcel, i12);
        RouteButtons routeButtons = this.f133667e;
        if (routeButtons == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            routeButtons.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f133668f);
    }

    public ShowPinMapLink(@Y61.l String str, @Y61.l String str2, @Y61.k Coordinates coordinates, @Y61.l RouteButtons routeButtons, @Y61.l String str3) {
        this.f133664b = str;
        this.f133665c = str2;
        this.f133666d = coordinates;
        this.f133667e = routeButtons;
        this.f133668f = str3;
    }
}
