package com.avito.android.personal_banner.feature.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.personal_banner.feature.domain.model.BannerContext;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BannerState.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState;", "Landroid/os/Parcelable;", "BannerData", "_avito_personal-banner_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BannerState implements Parcelable {

    @k
    public static final Parcelable.Creator<BannerState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f215638b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f215639c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final BannerContext f215640d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BannerData f215641e;

    /* compiled from: BannerState.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData;", "Landroid/os/Parcelable;", "Content", "Empty", "Error", "Loading", "None", "Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData$Content;", "Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData$Empty;", "Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData$Error;", "Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData$Loading;", "Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData$None;", "_avito_personal-banner_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface BannerData extends Parcelable {

        /* compiled from: BannerState.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData$Content;", "Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData;", "_avito_personal-banner_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Content implements BannerData {

            @k
            public static final Parcelable.Creator<Content> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f215642b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f215643c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f215644d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final com.avito.android.lib.beduin_v2.beduin_item.stateless.a f215645e;

            /* compiled from: BannerState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Content> {
                @Override // android.os.Parcelable.Creator
                public final Content createFromParcel(Parcel parcel) {
                    return new Content(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Content[] newArray(int i12) {
                    return new Content[i12];
                }
            }

            public Content(@k String str, @k String str2, @k String str3) {
                this.f215642b = str;
                this.f215643c = str2;
                this.f215644d = str3;
                this.f215645e = new com.avito.android.lib.beduin_v2.beduin_item.stateless.a(str2, str3);
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
                return L.f(this.f215642b, content.f215642b) && L.f(this.f215643c, content.f215643c) && L.f(this.f215644d, content.f215644d);
            }

            public final int hashCode() {
                return this.f215644d.hashCode() + H.d(this.f215642b.hashCode() * 31, 31, this.f215643c);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(scenarioJson=");
                sb2.append(this.f215642b);
                sb2.append(", bannerItemId=");
                sb2.append(this.f215643c);
                sb2.append(", bannerItemViewType=");
                return C22026a.c(sb2, this.f215644d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f215642b);
                parcel.writeString(this.f215643c);
                parcel.writeString(this.f215644d);
            }
        }

        /* compiled from: BannerState.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData$Empty;", "Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData;", "<init>", "()V", "_avito_personal-banner_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Empty implements BannerData {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Empty f215646b = new Empty();

            @k
            public static final Parcelable.Creator<Empty> CREATOR = new a();

            /* compiled from: BannerState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Empty> {
                @Override // android.os.Parcelable.Creator
                public final Empty createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Empty.f215646b;
                }

                @Override // android.os.Parcelable.Creator
                public final Empty[] newArray(int i12) {
                    return new Empty[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof Empty);
            }

            public final int hashCode() {
                return 987407093;
            }

            @k
            public final String toString() {
                return "Empty";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: BannerState.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData$Error;", "Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData;", "_avito_personal-banner_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error implements BannerData {

            @k
            public static final Parcelable.Creator<Error> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiError f215647b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final Throwable f215648c;

            /* compiled from: BannerState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Error> {
                @Override // android.os.Parcelable.Creator
                public final Error createFromParcel(Parcel parcel) {
                    return new Error((ApiError) parcel.readParcelable(Error.class.getClassLoader()), (Throwable) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Error[] newArray(int i12) {
                    return new Error[i12];
                }
            }

            public Error(@k ApiError apiError, @l Throwable th2) {
                this.f215647b = apiError;
                this.f215648c = th2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return L.f(this.f215647b, error.f215647b) && L.f(this.f215648c, error.f215648c);
            }

            public final int hashCode() {
                int iHashCode = this.f215647b.hashCode() * 31;
                Throwable th2 = this.f215648c;
                return iHashCode + (th2 == null ? 0 : th2.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(apiError=");
                sb2.append(this.f215647b);
                sb2.append(", cause=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f215648c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f215647b, i12);
                parcel.writeSerializable(this.f215648c);
            }
        }

        /* compiled from: BannerState.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData$Loading;", "Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData;", "<init>", "()V", "_avito_personal-banner_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loading implements BannerData {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Loading f215649b = new Loading();

            @k
            public static final Parcelable.Creator<Loading> CREATOR = new a();

            /* compiled from: BannerState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Loading> {
                @Override // android.os.Parcelable.Creator
                public final Loading createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Loading.f215649b;
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
                return 1670919396;
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

        /* compiled from: BannerState.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData$None;", "Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData;", "<init>", "()V", "_avito_personal-banner_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class None implements BannerData {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final None f215650b = new None();

            @k
            public static final Parcelable.Creator<None> CREATOR = new a();

            /* compiled from: BannerState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<None> {
                @Override // android.os.Parcelable.Creator
                public final None createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return None.f215650b;
                }

                @Override // android.os.Parcelable.Creator
                public final None[] newArray(int i12) {
                    return new None[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof None);
            }

            public final int hashCode() {
                return -1907540848;
            }

            @k
            public final String toString() {
                return "None";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }
    }

    /* compiled from: BannerState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BannerState> {
        @Override // android.os.Parcelable.Creator
        public final BannerState createFromParcel(Parcel parcel) {
            return new BannerState(parcel.readString(), parcel.readString(), (BannerContext) parcel.readParcelable(BannerState.class.getClassLoader()), (BannerData) parcel.readParcelable(BannerState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BannerState[] newArray(int i12) {
            return new BannerState[i12];
        }
    }

    public BannerState(@k String str, @k String str2, @k BannerContext bannerContext, @k BannerData bannerData) {
        this.f215638b = str;
        this.f215639c = str2;
        this.f215640d = bannerContext;
        this.f215641e = bannerData;
    }

    public static BannerState a(BannerState bannerState, BannerContext bannerContext, BannerData bannerData, int i12) {
        String str = bannerState.f215638b;
        String str2 = bannerState.f215639c;
        if ((i12 & 4) != 0) {
            bannerContext = bannerState.f215640d;
        }
        if ((i12 & 8) != 0) {
            bannerData = bannerState.f215641e;
        }
        bannerState.getClass();
        return new BannerState(str, str2, bannerContext, bannerData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerState)) {
            return false;
        }
        BannerState bannerState = (BannerState) obj;
        return L.f(this.f215638b, bannerState.f215638b) && L.f(this.f215639c, bannerState.f215639c) && L.f(this.f215640d, bannerState.f215640d) && L.f(this.f215641e, bannerState.f215641e);
    }

    public final int hashCode() {
        return this.f215641e.hashCode() + ((this.f215640d.hashCode() + H.d(this.f215638b.hashCode() * 31, 31, this.f215639c)) * 31);
    }

    @k
    public final String toString() {
        return "BannerState(placement=" + this.f215638b + ", bannerViewType=" + this.f215639c + ", bannerContext=" + this.f215640d + ", bannerData=" + this.f215641e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f215638b);
        parcel.writeString(this.f215639c);
        parcel.writeParcelable(this.f215640d, i12);
        parcel.writeParcelable(this.f215641e, i12);
    }

    public /* synthetic */ BannerState(String str, String str2, BannerContext bannerContext, BannerData bannerData, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? BannerContext.None.f215597b : bannerContext, (i12 & 8) != 0 ? BannerData.None.f215650b : bannerData);
    }
}
