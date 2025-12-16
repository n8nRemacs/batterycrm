package com.avito.android.advert.item.safedeal.real_one_click_payment_block;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.safedeal.remote.model.SafeDealPaymentBlockResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsSafeDealPaymentBlockItem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/PaymentBlockItemState;", "Landroid/os/Parcelable;", "HideBlock", "ShowPaymentBlock", "ShowSkeleton", "Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/PaymentBlockItemState$HideBlock;", "Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/PaymentBlockItemState$ShowPaymentBlock;", "Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/PaymentBlockItemState$ShowSkeleton;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface PaymentBlockItemState extends Parcelable {

    /* compiled from: AdvertDetailsSafeDealPaymentBlockItem.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/PaymentBlockItemState$HideBlock;", "Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/PaymentBlockItemState;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class HideBlock implements PaymentBlockItemState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideBlock f78909b = new HideBlock();

        @k
        public static final Parcelable.Creator<HideBlock> CREATOR = new a();

        /* compiled from: AdvertDetailsSafeDealPaymentBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HideBlock> {
            @Override // android.os.Parcelable.Creator
            public final HideBlock createFromParcel(Parcel parcel) {
                parcel.readInt();
                return HideBlock.f78909b;
            }

            @Override // android.os.Parcelable.Creator
            public final HideBlock[] newArray(int i12) {
                return new HideBlock[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: AdvertDetailsSafeDealPaymentBlockItem.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/PaymentBlockItemState$ShowSkeleton;", "Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/PaymentBlockItemState;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class ShowSkeleton implements PaymentBlockItemState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowSkeleton f78912b = new ShowSkeleton();

        @k
        public static final Parcelable.Creator<ShowSkeleton> CREATOR = new a();

        /* compiled from: AdvertDetailsSafeDealPaymentBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowSkeleton> {
            @Override // android.os.Parcelable.Creator
            public final ShowSkeleton createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ShowSkeleton.f78912b;
            }

            @Override // android.os.Parcelable.Creator
            public final ShowSkeleton[] newArray(int i12) {
                return new ShowSkeleton[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: AdvertDetailsSafeDealPaymentBlockItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/PaymentBlockItemState$ShowPaymentBlock;", "Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/PaymentBlockItemState;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ShowPaymentBlock implements PaymentBlockItemState {

        @k
        public static final Parcelable.Creator<ShowPaymentBlock> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SafeDealPaymentBlockResponse f78910b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Boolean f78911c;

        /* compiled from: AdvertDetailsSafeDealPaymentBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowPaymentBlock> {
            @Override // android.os.Parcelable.Creator
            public final ShowPaymentBlock createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                SafeDealPaymentBlockResponse safeDealPaymentBlockResponse = (SafeDealPaymentBlockResponse) parcel.readParcelable(ShowPaymentBlock.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ShowPaymentBlock(safeDealPaymentBlockResponse, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final ShowPaymentBlock[] newArray(int i12) {
                return new ShowPaymentBlock[i12];
            }
        }

        public ShowPaymentBlock(@k SafeDealPaymentBlockResponse safeDealPaymentBlockResponse, @l Boolean bool) {
            this.f78910b = safeDealPaymentBlockResponse;
            this.f78911c = bool;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowPaymentBlock)) {
                return false;
            }
            ShowPaymentBlock showPaymentBlock = (ShowPaymentBlock) obj;
            return L.f(this.f78910b, showPaymentBlock.f78910b) && L.f(this.f78911c, showPaymentBlock.f78911c);
        }

        public final int hashCode() {
            int iHashCode = this.f78910b.hashCode() * 31;
            Boolean bool = this.f78911c;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowPaymentBlock(response=");
            sb2.append(this.f78910b);
            sb2.append(", isLoading=");
            return C0.g(sb2, this.f78911c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f78910b, i12);
            Boolean bool = this.f78911c;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }

        public /* synthetic */ ShowPaymentBlock(SafeDealPaymentBlockResponse safeDealPaymentBlockResponse, Boolean bool, int i12, C42822w c42822w) {
            this(safeDealPaymentBlockResponse, (i12 & 2) != 0 ? null : bool);
        }
    }
}
