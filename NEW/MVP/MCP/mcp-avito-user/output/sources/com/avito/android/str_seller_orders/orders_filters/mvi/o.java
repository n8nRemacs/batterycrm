package com.avito.android.str_seller_orders.orders_filters.mvi;

import android.os.Parcelable;
import com.avito.android.str_seller_orders.orders_filters.domain.models.StrOrdersFiltersItemStyle;
import com.avito.android.str_seller_orders.orders_filters.domain.models.StrOrdersFiltersOption;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: StrOrdersFiltersViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/mvi/o;", "Lcom/avito/android/str_seller_orders/orders_filters/mvi/n;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders.orders_filters.domain.e f289209a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders.orders_filters.domain.e f289210b;

    /* compiled from: StrOrdersFiltersViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f289211a;

        static {
            int[] iArr = new int[StrOrdersFiltersItemStyle.values().length];
            try {
                Parcelable.Creator<StrOrdersFiltersItemStyle> creator = StrOrdersFiltersItemStyle.CREATOR;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<StrOrdersFiltersItemStyle> creator2 = StrOrdersFiltersItemStyle.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f289211a = iArr;
        }
    }

    @Inject
    public o(@com.avito.android.str_seller_orders.orders_filters.di.c @Y61.k com.avito.android.str_seller_orders.orders_filters.domain.e eVar, @com.avito.android.str_seller_orders.orders_filters.di.b @Y61.k com.avito.android.str_seller_orders.orders_filters.domain.e eVar2) {
        this.f289209a = eVar;
        this.f289210b = eVar2;
    }

    @Override // com.avito.android.str_seller_orders.orders_filters.mvi.n
    @Y61.k
    public final qz0.c a(@Y61.k qz0.c cVar) {
        StrOrdersFiltersItemStyle strOrdersFiltersItemStyle = cVar.f429551d;
        int i12 = strOrdersFiltersItemStyle == null ? -1 : a.f289211a[strOrdersFiltersItemStyle.ordinal()];
        ArrayList arrayListA = null;
        if (i12 != -1) {
            List<StrOrdersFiltersOption> list = cVar.f429550c;
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (list != null) {
                    arrayListA = this.f289210b.a(list);
                }
            } else if (list != null) {
                arrayListA = this.f289209a.a(list);
            }
        }
        return qz0.c.a(cVar, null, null, null, null, null, false, new qz0.d(cVar.f429553f, arrayListA), 63);
    }
}
