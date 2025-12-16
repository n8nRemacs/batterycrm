package com.avito.android.str_seller_orders.strsellerordersrange;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.str_seller_orders.strsellerordersrange.ui.StrSellerOrdersRangeFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: StrSellerOrdersRangeActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/StrSellerOrdersRangeActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrSellerOrdersRangeActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f290206m = new a(null);

    /* compiled from: StrSellerOrdersRangeActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/StrSellerOrdersRangeActivity$a;", "", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.str_seller_orders_range_activity);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("start_date_param");
            if (stringExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String stringExtra2 = getIntent().getStringExtra("end_date_param");
            if (stringExtra2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String stringExtra3 = getIntent().getStringExtra("item_id_param");
            if (stringExtra3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            H hE2 = getSupportFragmentManager().e();
            StrSellerOrdersRangeFragment.f290322u0.getClass();
            StrSellerOrdersRangeFragment strSellerOrdersRangeFragment = new StrSellerOrdersRangeFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("start_date_param", stringExtra);
            bundle2.putString("end_date_param", stringExtra2);
            bundle2.putString("item_id_param", stringExtra3);
            strSellerOrdersRangeFragment.setArguments(bundle2);
            hE2.j(R.id.fragment_container, strSellerOrdersRangeFragment, null, 1);
            hE2.e();
        }
    }
}
