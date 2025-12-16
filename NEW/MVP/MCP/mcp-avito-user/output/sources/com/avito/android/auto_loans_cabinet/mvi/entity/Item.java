package com.avito.android.auto_loans_cabinet.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import j.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoLoansCabinetState.kt */
@d
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/Item;", "Landroid/os/Parcelable;", "()V", "Banner", "Space", "Title", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/Item$Banner;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/Item$Space;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/Item$Title;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class Item implements Parcelable {

    /* compiled from: AutoLoansCabinetState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/Item$Banner;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/Item;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Banner extends Item {

        @k
        public static final Parcelable.Creator<Banner> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BannerType f95479b;

        /* renamed from: c, reason: collision with root package name */
        public final int f95480c;

        /* renamed from: d, reason: collision with root package name */
        public final int f95481d;

        /* renamed from: e, reason: collision with root package name */
        public final int f95482e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f95483f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f95484g;

        /* compiled from: AutoLoansCabinetState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Banner> {
            @Override // android.os.Parcelable.Creator
            public final Banner createFromParcel(Parcel parcel) {
                return new Banner(BannerType.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Banner[] newArray(int i12) {
                return new Banner[i12];
            }
        }

        public Banner(@k BannerType bannerType, @e0 int i12, @e0 int i13, int i14, @k String str, boolean z12) {
            super(null);
            this.f95479b = bannerType;
            this.f95480c = i12;
            this.f95481d = i13;
            this.f95482e = i14;
            this.f95483f = str;
            this.f95484g = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj;
            return this.f95479b == banner.f95479b && this.f95480c == banner.f95480c && this.f95481d == banner.f95481d && this.f95482e == banner.f95482e && L.f(this.f95483f, banner.f95483f) && this.f95484g == banner.f95484g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f95484g) + H.d(r.e(this.f95482e, r.e(this.f95481d, r.e(this.f95480c, this.f95479b.hashCode() * 31, 31), 31), 31), 31, this.f95483f);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Banner(type=");
            sb2.append(this.f95479b);
            sb2.append(", titleRes=");
            sb2.append(this.f95480c);
            sb2.append(", textRes=");
            sb2.append(this.f95481d);
            sb2.append(", titleTextSpace=");
            sb2.append(this.f95482e);
            sb2.append(", iconUrl=");
            sb2.append(this.f95483f);
            sb2.append(", clickable=");
            return r.x(sb2, this.f95484g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f95479b.name());
            parcel.writeInt(this.f95480c);
            parcel.writeInt(this.f95481d);
            parcel.writeInt(this.f95482e);
            parcel.writeString(this.f95483f);
            parcel.writeInt(this.f95484g ? 1 : 0);
        }
    }

    /* compiled from: AutoLoansCabinetState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/Item$Space;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/Item;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Space extends Item {

        @k
        public static final Parcelable.Creator<Space> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f95485b;

        /* compiled from: AutoLoansCabinetState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Space> {
            @Override // android.os.Parcelable.Creator
            public final Space createFromParcel(Parcel parcel) {
                return new Space(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Space[] newArray(int i12) {
                return new Space[i12];
            }
        }

        public Space(int i12) {
            super(null);
            this.f95485b = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Space) && this.f95485b == ((Space) obj).f95485b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f95485b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("Space(height="), this.f95485b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f95485b);
        }
    }

    /* compiled from: AutoLoansCabinetState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/Item$Title;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/Item;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Title extends Item {

        @k
        public static final Parcelable.Creator<Title> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f95486b;

        /* compiled from: AutoLoansCabinetState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Title> {
            @Override // android.os.Parcelable.Creator
            public final Title createFromParcel(Parcel parcel) {
                return new Title(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Title[] newArray(int i12) {
                return new Title[i12];
            }
        }

        public Title(@e0 int i12) {
            super(null);
            this.f95486b = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Title) && this.f95486b == ((Title) obj).f95486b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f95486b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("Title(titleRes="), this.f95486b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f95486b);
        }
    }

    public /* synthetic */ Item(C42822w c42822w) {
        this();
    }

    public Item() {
    }
}
