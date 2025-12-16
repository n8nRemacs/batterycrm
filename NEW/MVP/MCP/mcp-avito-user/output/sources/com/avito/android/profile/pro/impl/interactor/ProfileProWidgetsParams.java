package com.avito.android.profile.pro.impl.interactor;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C23088b;
import com.avito.android.profile.pro.impl.ProfileTabUserType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProWidgetsParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/ProfileProWidgetsParams;", "Landroid/os/Parcelable;", "AvitoFinanceParams", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProWidgetsParams implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f222674b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f222675c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f222676d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Object f222677e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Object f222678f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ProfileTabUserType f222679g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AvitoFinanceParams f222680h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f222673i = new a(null);

    @k
    public static final Parcelable.Creator<ProfileProWidgetsParams> CREATOR = new b();

    /* compiled from: ProfileProWidgetsParams.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/ProfileProWidgetsParams$AvitoFinanceParams;", "Landroid/os/Parcelable;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AvitoFinanceParams implements Parcelable {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final AvitoFinanceParams f222681b = new AvitoFinanceParams();

        @k
        public static final Parcelable.Creator<AvitoFinanceParams> CREATOR = new a();

        /* compiled from: ProfileProWidgetsParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AvitoFinanceParams> {
            @Override // android.os.Parcelable.Creator
            public final AvitoFinanceParams createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AvitoFinanceParams.f222681b;
            }

            @Override // android.os.Parcelable.Creator
            public final AvitoFinanceParams[] newArray(int i12) {
                return new AvitoFinanceParams[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof AvitoFinanceParams);
        }

        public final int hashCode() {
            return 1931230246;
        }

        @k
        public final String toString() {
            return "AvitoFinanceParams";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ProfileProWidgetsParams.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/ProfileProWidgetsParams$a;", "", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ProfileProWidgetsParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ProfileProWidgetsParams> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProWidgetsParams createFromParcel(Parcel parcel) {
            return new ProfileProWidgetsParams(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), ProfileTabUserType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : AvitoFinanceParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProWidgetsParams[] newArray(int i12) {
            return new ProfileProWidgetsParams[i12];
        }
    }

    public ProfileProWidgetsParams(@l String str, @k List<String> list, @k List<String> list2, @k List<String> list3, @k List<String> list4, @k ProfileTabUserType profileTabUserType, @l AvitoFinanceParams avitoFinanceParams) {
        this.f222674b = str;
        this.f222675c = list;
        this.f222676d = list2;
        this.f222677e = list3;
        this.f222678f = list4;
        this.f222679g = profileTabUserType;
        this.f222680h = avitoFinanceParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProWidgetsParams)) {
            return false;
        }
        ProfileProWidgetsParams profileProWidgetsParams = (ProfileProWidgetsParams) obj;
        return L.f(this.f222674b, profileProWidgetsParams.f222674b) && L.f(this.f222675c, profileProWidgetsParams.f222675c) && L.f(this.f222676d, profileProWidgetsParams.f222676d) && L.f(this.f222677e, profileProWidgetsParams.f222677e) && L.f(this.f222678f, profileProWidgetsParams.f222678f) && this.f222679g == profileProWidgetsParams.f222679g && L.f(this.f222680h, profileProWidgetsParams.f222680h);
    }

    public final int hashCode() {
        String str = this.f222674b;
        return ((this.f222679g.hashCode() + C23088b.a(C23088b.a(C23088b.a(C23088b.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f222675c), 31, this.f222676d), 31, this.f222677e), 31, this.f222678f)) * 31) + (this.f222680h != null ? 1931230246 : 0);
    }

    @k
    public final String toString() {
        return "ProfileProWidgetsParams(idempotencyKey=" + this.f222674b + ", noneGroupBlockTypes=" + this.f222675c + ", groupBlockTypes=" + this.f222676d + ", groupItemTypes=" + this.f222677e + ", beduinBlockIds=" + this.f222678f + ", userType=" + this.f222679g + ", avitoFinanceWidget=" + this.f222680h + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f222674b);
        parcel.writeStringList(this.f222675c);
        parcel.writeStringList(this.f222676d);
        parcel.writeStringList(this.f222677e);
        parcel.writeStringList(this.f222678f);
        parcel.writeString(this.f222679g.name());
        if (this.f222680h == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(1);
        }
    }
}
