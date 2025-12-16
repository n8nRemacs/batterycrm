package com.avito.android.trx_promo_goods.screens.date_picker.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: TrxPromoGoodsConfigureDatePickerApplyLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/deeplink/TrxPromoGoodsConfigureDatePickerApplyLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "b", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TrxPromoGoodsConfigureDatePickerApplyLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TrxPromoGoodsConfigureDatePickerApplyLink> CREATOR = new a();

    /* compiled from: TrxPromoGoodsConfigureDatePickerApplyLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrxPromoGoodsConfigureDatePickerApplyLink> {
        @Override // android.os.Parcelable.Creator
        public final TrxPromoGoodsConfigureDatePickerApplyLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new TrxPromoGoodsConfigureDatePickerApplyLink();
        }

        @Override // android.os.Parcelable.Creator
        public final TrxPromoGoodsConfigureDatePickerApplyLink[] newArray(int i12) {
            return new TrxPromoGoodsConfigureDatePickerApplyLink[i12];
        }
    }

    /* compiled from: TrxPromoGoodsConfigureDatePickerApplyLink.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/deeplink/TrxPromoGoodsConfigureDatePickerApplyLink$b;", "", "<init>", "()V", "a", "Lcom/avito/android/trx_promo_goods/screens/date_picker/deeplink/TrxPromoGoodsConfigureDatePickerApplyLink$b$a;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: TrxPromoGoodsConfigureDatePickerApplyLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/deeplink/TrxPromoGoodsConfigureDatePickerApplyLink$b$a;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/deeplink/TrxPromoGoodsConfigureDatePickerApplyLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f303667b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1799791949;
            }

            @k
            public final String toString() {
                return "Success";
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
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
