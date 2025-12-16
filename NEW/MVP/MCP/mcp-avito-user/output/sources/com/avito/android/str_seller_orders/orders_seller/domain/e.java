package com.avito.android.str_seller_orders.orders_seller.domain;

import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersOpenParams;
import com.avito.android.str_seller_orders.orders_filters.domain.models.StrOrdersFiltersDisplaying;
import com.avito.android.str_seller_orders.orders_filters.domain.models.StrOrdersFiltersItemStyle;
import com.avito.android.str_seller_orders.orders_filters.domain.models.StrOrdersFiltersOption;
import com.avito.android.str_seller_orders.orders_seller.domain.models.FiltersDisplaying;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import sz0.AbstractC48441b;
import sz0.C48442c;

/* compiled from: StrOrdersFiltersOpenParamsCreatorUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/domain/e;", "Lcom/avito/android/str_seller_orders/orders_seller/domain/d;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* compiled from: StrOrdersFiltersOpenParamsCreatorUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f289332a;

        static {
            int[] iArr = new int[FiltersDisplaying.Style.values().length];
            try {
                FiltersDisplaying.Style style = FiltersDisplaying.Style.f289343b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FiltersDisplaying.Style style2 = FiltersDisplaying.Style.f289343b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f289332a = iArr;
        }
    }

    @Inject
    public e() {
    }

    public static StrOrdersFiltersDisplaying b(FiltersDisplaying filtersDisplaying) {
        String str = filtersDisplaying.f289342c;
        String str2 = filtersDisplaying.f289340a;
        if (str2 == null) {
            str2 = "";
        }
        FiltersDisplaying.Style style = filtersDisplaying.f289341b;
        int i12 = style == null ? -1 : a.f289332a[style.ordinal()];
        return new StrOrdersFiltersDisplaying(str, str2, i12 != 1 ? i12 != 2 ? StrOrdersFiltersItemStyle.f289159b : StrOrdersFiltersItemStyle.f289159b : StrOrdersFiltersItemStyle.f289160c);
    }

    public static ArrayList c(List list, List list2) {
        List<C48442c> list3 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
        for (C48442c c48442c : list3) {
            String str = c48442c.f438984a;
            arrayList.add(new StrOrdersFiltersOption(str, c48442c.f438985b, list2.contains(str)));
        }
        return arrayList;
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.domain.d
    @Y61.l
    public final StrOrdersFiltersOpenParams a(@Y61.k AbstractC48441b abstractC48441b) {
        StrOrdersFiltersOpenParams strOrdersFiltersOpenParams;
        if (abstractC48441b instanceof AbstractC48441b.a) {
            return null;
        }
        if (abstractC48441b instanceof AbstractC48441b.C12655b) {
            AbstractC48441b.C12655b c12655b = (AbstractC48441b.C12655b) abstractC48441b;
            AbstractC48441b.C12655b c12655b2 = (AbstractC48441b.C12655b) abstractC48441b;
            List list = c12655b2.f438978g;
            if (list == null) {
                list = C42784z0.f406748b;
            }
            strOrdersFiltersOpenParams = new StrOrdersFiltersOpenParams(c12655b.f438974c, c(c12655b2.f438977f, list), true, b(c12655b2.f438976e));
        } else {
            if (!(abstractC48441b instanceof AbstractC48441b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC48441b.c cVar = (AbstractC48441b.c) abstractC48441b;
            AbstractC48441b.c cVar2 = (AbstractC48441b.c) abstractC48441b;
            String str = cVar2.f438983g;
            if (str == null) {
                str = "";
            }
            strOrdersFiltersOpenParams = new StrOrdersFiltersOpenParams(cVar.f438979c, c(cVar2.f438982f, Collections.singletonList(str)), false, b(cVar2.f438981e));
        }
        return strOrdersFiltersOpenParams;
    }
}
