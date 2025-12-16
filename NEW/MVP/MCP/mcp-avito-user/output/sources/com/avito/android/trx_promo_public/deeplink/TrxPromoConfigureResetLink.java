package com.avito.android.trx_promo_public.deeplink;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: TrxPromoConfigureResetLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureResetLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "b", "_avito_trx-promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TrxPromoConfigureResetLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TrxPromoConfigureResetLink> CREATOR = new a();

    /* compiled from: TrxPromoConfigureResetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrxPromoConfigureResetLink> {
        @Override // android.os.Parcelable.Creator
        public final TrxPromoConfigureResetLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new TrxPromoConfigureResetLink();
        }

        @Override // android.os.Parcelable.Creator
        public final TrxPromoConfigureResetLink[] newArray(int i12) {
            return new TrxPromoConfigureResetLink[i12];
        }
    }

    /* compiled from: TrxPromoConfigureResetLink.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureResetLink$b;", "LJu/c$b;", "<init>", "()V", "a", "Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureResetLink$b$a;", "_avito_trx-promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: TrxPromoConfigureResetLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureResetLink$b$a;", "Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureResetLink$b;", "<init>", "()V", "_avito_trx-promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f304511b = new a();

            public a() {
                super(null);
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
