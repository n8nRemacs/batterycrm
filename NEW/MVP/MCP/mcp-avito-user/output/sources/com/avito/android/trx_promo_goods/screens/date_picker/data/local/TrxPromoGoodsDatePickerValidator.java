package com.avito.android.trx_promo_goods.screens.date_picker.data.local;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsDatePickerValidator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/data/local/TrxPromoGoodsDatePickerValidator;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class TrxPromoGoodsDatePickerValidator implements Parcelable {

    /* compiled from: TrxPromoGoodsDatePickerValidator.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/data/local/TrxPromoGoodsDatePickerValidator$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/trx_promo_goods/screens/date_picker/data/local/TrxPromoGoodsDatePickerValidator$a$a;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/data/local/TrxPromoGoodsDatePickerValidator$a$b;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: TrxPromoGoodsDatePickerValidator.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/data/local/TrxPromoGoodsDatePickerValidator$a$a;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/data/local/TrxPromoGoodsDatePickerValidator$a;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.trx_promo_goods.screens.date_picker.data.local.TrxPromoGoodsDatePickerValidator$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9301a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f303663a;

            public C9301a(@k String str) {
                super(null);
                this.f303663a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9301a) && L.f(this.f303663a, ((C9301a) obj).f303663a);
            }

            public final int hashCode() {
                return this.f303663a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Failure(message="), this.f303663a, ')');
            }
        }

        /* compiled from: TrxPromoGoodsDatePickerValidator.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/data/local/TrxPromoGoodsDatePickerValidator$a$b;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/data/local/TrxPromoGoodsDatePickerValidator$a;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f303664a = new b();

            public b() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 314694930;
            }

            @k
            public final String toString() {
                return "Success";
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public abstract boolean a(@k LocalDate localDate);

    @k
    public abstract String getMessage();
}
