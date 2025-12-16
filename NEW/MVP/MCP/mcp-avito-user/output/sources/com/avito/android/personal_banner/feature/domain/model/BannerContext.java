package com.avito.android.personal_banner.feature.domain.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BannerContext.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/personal_banner/feature/domain/model/BannerContext;", "Landroid/os/Parcelable;", "Info", "None", "Lcom/avito/android/personal_banner/feature/domain/model/BannerContext$Info;", "Lcom/avito/android/personal_banner/feature/domain/model/BannerContext$None;", "_avito_personal-banner_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface BannerContext extends Parcelable {

    /* compiled from: BannerContext.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/personal_banner/feature/domain/model/BannerContext$Info;", "Lcom/avito/android/personal_banner/feature/domain/model/BannerContext;", "_avito_personal-banner_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Info implements BannerContext {

        @k
        public static final Parcelable.Creator<Info> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f215594b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f215595c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f215596d;

        /* compiled from: BannerContext.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Info> {
            @Override // android.os.Parcelable.Creator
            public final Info createFromParcel(Parcel parcel) {
                return new Info(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Info[] newArray(int i12) {
                return new Info[i12];
            }
        }

        public Info(@l String str, @l String str2, @k String str3) {
            this.f215594b = str;
            this.f215595c = str2;
            this.f215596d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return L.f(this.f215594b, info.f215594b) && L.f(this.f215595c, info.f215595c) && L.f(this.f215596d, info.f215596d);
        }

        public final int hashCode() {
            String str = this.f215594b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f215595c;
            return this.f215596d.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Info(userSegment=");
            sb2.append(this.f215594b);
            sb2.append(", bannerContext=");
            sb2.append(this.f215595c);
            sb2.append(", idempotencyKey=");
            return C22026a.c(sb2, this.f215596d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f215594b);
            parcel.writeString(this.f215595c);
            parcel.writeString(this.f215596d);
        }
    }

    /* compiled from: BannerContext.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/personal_banner/feature/domain/model/BannerContext$None;", "Lcom/avito/android/personal_banner/feature/domain/model/BannerContext;", "<init>", "()V", "_avito_personal-banner_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class None implements BannerContext {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final None f215597b = new None();

        @k
        public static final Parcelable.Creator<None> CREATOR = new a();

        /* compiled from: BannerContext.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<None> {
            @Override // android.os.Parcelable.Creator
            public final None createFromParcel(Parcel parcel) {
                parcel.readInt();
                return None.f215597b;
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
            return 1129093068;
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
