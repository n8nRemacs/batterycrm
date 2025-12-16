package kz0;

import Y61.k;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.b;
import com.avito.android.str_seller_orders.orders_buyer.StrOrdersBuyerFragment;
import com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersOpenParams;
import com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersFragment;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import lz0.C43851a;

/* compiled from: StrOrdersPagerAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkz0/a;", "Landroidx/viewpager2/adapter/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43520a extends b {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f413348k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Map<String, String> f413349l;

    public C43520a(@k Fragment fragment, boolean z12, @k Map<String, String> map) {
        super(fragment);
        this.f413348k = z12;
        this.f413349l = map;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        com.avito.android.str_seller_orders.orders.a.f288840a.getClass();
        return com.avito.android.str_seller_orders.orders.a.f288841b.size();
    }

    @Override // androidx.viewpager2.adapter.b
    @k
    public final Fragment l(int i12) {
        com.avito.android.str_seller_orders.orders.a.f288840a.getClass();
        C43851a c43851a = (C43851a) C42745f0.K(i12, com.avito.android.str_seller_orders.orders.a.f288841b);
        String str = c43851a != null ? c43851a.f414255b : null;
        boolean zF2 = L.f(str, "tab_seller_shortcut");
        Map<String, String> map = this.f413349l;
        boolean z12 = this.f413348k;
        if (zF2) {
            if (!z12) {
                StrSellerOrdersFragment.f289655z0.getClass();
                StrSellerOrdersFragment strSellerOrdersFragment = new StrSellerOrdersFragment();
                strSellerOrdersFragment.setArguments(C22777e.b(new Q("arg_hide_toolbar_key", Boolean.TRUE)));
                return strSellerOrdersFragment;
            }
            com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment.f289214v0.getClass();
            com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment strSellerOrdersFragment2 = new com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment();
            strSellerOrdersFragment2.f289222t0.setValue(strSellerOrdersFragment2, com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment.f289215w0[0], new StrSellerOrdersOpenParams(true, map));
            return strSellerOrdersFragment2;
        }
        if (L.f(str, "tab_buyer_shortcut")) {
            StrOrdersBuyerFragment.f288903t0.getClass();
            StrOrdersBuyerFragment strOrdersBuyerFragment = new StrOrdersBuyerFragment();
            strOrdersBuyerFragment.setArguments(C22777e.b(new Q("arg_hide_toolbar_key", Boolean.TRUE)));
            return strOrdersBuyerFragment;
        }
        if (!z12) {
            StrSellerOrdersFragment.f289655z0.getClass();
            StrSellerOrdersFragment strSellerOrdersFragment3 = new StrSellerOrdersFragment();
            strSellerOrdersFragment3.setArguments(C22777e.b(new Q("arg_hide_toolbar_key", Boolean.TRUE)));
            return strSellerOrdersFragment3;
        }
        com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment.f289214v0.getClass();
        com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment strSellerOrdersFragment4 = new com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment();
        strSellerOrdersFragment4.f289222t0.setValue(strSellerOrdersFragment4, com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment.f289215w0[0], new StrSellerOrdersOpenParams(true, map));
        return strSellerOrdersFragment4;
    }
}
