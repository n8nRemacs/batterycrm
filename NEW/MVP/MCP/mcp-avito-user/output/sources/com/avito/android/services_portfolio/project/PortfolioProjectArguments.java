package com.avito.android.services_portfolio.project;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PortfolioProjectArguments.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/services_portfolio/project/PortfolioProjectArguments;", "Landroid/os/Parcelable;", "BuyerArgs", "SellerArgs", "Lcom/avito/android/services_portfolio/project/PortfolioProjectArguments$BuyerArgs;", "Lcom/avito/android/services_portfolio/project/PortfolioProjectArguments$SellerArgs;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PortfolioProjectArguments extends Parcelable {

    /* compiled from: PortfolioProjectArguments.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_portfolio/project/PortfolioProjectArguments$BuyerArgs;", "Lcom/avito/android/services_portfolio/project/PortfolioProjectArguments;", "Landroid/os/Parcelable;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class BuyerArgs implements PortfolioProjectArguments, Parcelable {

        @k
        public static final Parcelable.Creator<BuyerArgs> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f279991b;

        /* renamed from: c, reason: collision with root package name */
        public final long f279992c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f279993d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f279994e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f279995f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f279996g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f279997h;

        /* compiled from: PortfolioProjectArguments.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BuyerArgs> {
            @Override // android.os.Parcelable.Creator
            public final BuyerArgs createFromParcel(Parcel parcel) {
                return new BuyerArgs(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final BuyerArgs[] newArray(int i12) {
                return new BuyerArgs[i12];
            }
        }

        public BuyerArgs(long j12, @l String str, @l String str2, @l String str3, @l String str4, boolean z12, boolean z13) {
            this.f279991b = str;
            this.f279992c = j12;
            this.f279993d = z12;
            this.f279994e = z13;
            this.f279995f = str2;
            this.f279996g = str3;
            this.f279997h = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BuyerArgs)) {
                return false;
            }
            BuyerArgs buyerArgs = (BuyerArgs) obj;
            return L.f(this.f279991b, buyerArgs.f279991b) && this.f279992c == buyerArgs.f279992c && this.f279993d == buyerArgs.f279993d && this.f279994e == buyerArgs.f279994e && L.f(this.f279995f, buyerArgs.f279995f) && L.f(this.f279996g, buyerArgs.f279996g) && L.f(this.f279997h, buyerArgs.f279997h);
        }

        public final int hashCode() {
            String str = this.f279991b;
            int i12 = r.i(r.i(r.g((str == null ? 0 : str.hashCode()) * 31, 31, this.f279992c), 31, this.f279993d), 31, this.f279994e);
            String str2 = this.f279995f;
            int iHashCode = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f279996g;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f279997h;
            return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BuyerArgs(itemId=");
            sb2.append(this.f279991b);
            sb2.append(", projectId=");
            sb2.append(this.f279992c);
            sb2.append(", canCall=");
            sb2.append(this.f279993d);
            sb2.append(", canMessage=");
            sb2.append(this.f279994e);
            sb2.append(", x=");
            sb2.append(this.f279995f);
            sb2.append(", cid=");
            sb2.append(this.f279996g);
            sb2.append(", mcid=");
            return C22026a.c(sb2, this.f279997h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f279991b);
            parcel.writeLong(this.f279992c);
            parcel.writeInt(this.f279993d ? 1 : 0);
            parcel.writeInt(this.f279994e ? 1 : 0);
            parcel.writeString(this.f279995f);
            parcel.writeString(this.f279996g);
            parcel.writeString(this.f279997h);
        }
    }

    /* compiled from: PortfolioProjectArguments.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_portfolio/project/PortfolioProjectArguments$SellerArgs;", "Lcom/avito/android/services_portfolio/project/PortfolioProjectArguments;", "Landroid/os/Parcelable;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SellerArgs implements PortfolioProjectArguments, Parcelable {

        @k
        public static final Parcelable.Creator<SellerArgs> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f279998b;

        /* renamed from: c, reason: collision with root package name */
        public final long f279999c;

        /* compiled from: PortfolioProjectArguments.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SellerArgs> {
            @Override // android.os.Parcelable.Creator
            public final SellerArgs createFromParcel(Parcel parcel) {
                return new SellerArgs(parcel.readString(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final SellerArgs[] newArray(int i12) {
                return new SellerArgs[i12];
            }
        }

        public SellerArgs(@l String str, long j12) {
            this.f279998b = str;
            this.f279999c = j12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SellerArgs)) {
                return false;
            }
            SellerArgs sellerArgs = (SellerArgs) obj;
            return L.f(this.f279998b, sellerArgs.f279998b) && this.f279999c == sellerArgs.f279999c;
        }

        public final int hashCode() {
            String str = this.f279998b;
            return Long.hashCode(this.f279999c) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SellerArgs(itemId=");
            sb2.append(this.f279998b);
            sb2.append(", projectId=");
            return r.u(sb2, this.f279999c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f279998b);
            parcel.writeLong(this.f279999c);
        }
    }
}
