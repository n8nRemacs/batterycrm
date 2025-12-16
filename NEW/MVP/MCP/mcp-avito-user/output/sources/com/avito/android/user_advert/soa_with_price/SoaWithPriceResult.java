package com.avito.android.user_advert.soa_with_price;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.my_advert.CloseReason;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SoaWithPriceSheetDialogFragment.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/SoaWithPriceResult;", "Landroid/os/Parcelable;", "Cancel", "a", "Success", "Lcom/avito/android/user_advert/soa_with_price/SoaWithPriceResult$Cancel;", "Lcom/avito/android/user_advert/soa_with_price/SoaWithPriceResult$Success;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SoaWithPriceResult extends Parcelable {

    /* renamed from: a2, reason: collision with root package name */
    @Y61.k
    public static final a f311845a2 = a.f311850a;

    /* compiled from: SoaWithPriceSheetDialogFragment.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/SoaWithPriceResult$Cancel;", "Lcom/avito/android/user_advert/soa_with_price/SoaWithPriceResult;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Cancel implements SoaWithPriceResult {

        @Y61.k
        public static final Parcelable.Creator<Cancel> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f311846b;

        /* compiled from: SoaWithPriceSheetDialogFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Cancel> {
            @Override // android.os.Parcelable.Creator
            public final Cancel createFromParcel(Parcel parcel) {
                return new Cancel(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Cancel[] newArray(int i12) {
                return new Cancel[i12];
            }
        }

        public Cancel(@Y61.k String str) {
            this.f311846b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Cancel) && L.f(this.f311846b, ((Cancel) obj).f311846b);
        }

        public final int hashCode() {
            return this.f311846b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Cancel(advertId="), this.f311846b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f311846b);
        }
    }

    /* compiled from: SoaWithPriceSheetDialogFragment.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/SoaWithPriceResult$Success;", "Lcom/avito/android/user_advert/soa_with_price/SoaWithPriceResult;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success implements SoaWithPriceResult {

        @Y61.k
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f311847b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final CloseReason f311848c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f311849d;

        /* compiled from: SoaWithPriceSheetDialogFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success(parcel.readString(), (CloseReason) parcel.readParcelable(Success.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i12) {
                return new Success[i12];
            }
        }

        public Success(@Y61.k String str, @Y61.k CloseReason closeReason, @Y61.l String str2) {
            this.f311847b = str;
            this.f311848c = closeReason;
            this.f311849d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return L.f(this.f311847b, success.f311847b) && L.f(this.f311848c, success.f311848c) && L.f(this.f311849d, success.f311849d);
        }

        public final int hashCode() {
            int iHashCode = (this.f311848c.hashCode() + (this.f311847b.hashCode() * 31)) * 31;
            String str = this.f311849d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Success(advertId=");
            sb2.append(this.f311847b);
            sb2.append(", reason=");
            sb2.append(this.f311848c);
            sb2.append(", newPrice=");
            return C22026a.c(sb2, this.f311849d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f311847b);
            parcel.writeParcelable(this.f311848c, i12);
            parcel.writeString(this.f311849d);
        }
    }

    /* compiled from: SoaWithPriceSheetDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/SoaWithPriceResult$a;", "", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f311850a = new a();
    }
}
