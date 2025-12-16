package com.avito.android.trx_promo_goods.screens.configure.deeplink;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: TrxPromoGoodsConfigureApplyLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/deeplink/TrxPromoGoodsConfigureApplyLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TrxPromoGoodsConfigureApplyLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<TrxPromoGoodsConfigureApplyLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f303374b;

    /* compiled from: TrxPromoGoodsConfigureApplyLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrxPromoGoodsConfigureApplyLink> {
        @Override // android.os.Parcelable.Creator
        public final TrxPromoGoodsConfigureApplyLink createFromParcel(Parcel parcel) {
            return new TrxPromoGoodsConfigureApplyLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TrxPromoGoodsConfigureApplyLink[] newArray(int i12) {
            return new TrxPromoGoodsConfigureApplyLink[i12];
        }
    }

    /* compiled from: TrxPromoGoodsConfigureApplyLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/deeplink/TrxPromoGoodsConfigureApplyLink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/trx_promo_goods/screens/configure/deeplink/TrxPromoGoodsConfigureApplyLink$b$a;", "Lcom/avito/android/trx_promo_goods/screens/configure/deeplink/TrxPromoGoodsConfigureApplyLink$b$b;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: TrxPromoGoodsConfigureApplyLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/deeplink/TrxPromoGoodsConfigureApplyLink$b$a;", "Lcom/avito/android/trx_promo_goods/screens/configure/deeplink/TrxPromoGoodsConfigureApplyLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f303375b = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: TrxPromoGoodsConfigureApplyLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/deeplink/TrxPromoGoodsConfigureApplyLink$b$b;", "Lcom/avito/android/trx_promo_goods/screens/configure/deeplink/TrxPromoGoodsConfigureApplyLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.trx_promo_goods.screens.configure.deeplink.TrxPromoGoodsConfigureApplyLink$b$b, reason: collision with other inner class name */
        public static final class C9282b extends b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C9282b f303376b = new C9282b();

            public C9282b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public TrxPromoGoodsConfigureApplyLink(@Y61.k String str) {
        this.f303374b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f303374b);
    }
}
