package com.avito.android.str_seller_orders.orders_buyer;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrOrdersBuyerView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/g;", "Lcom/avito/android/str_seller_orders/orders_buyer/e;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f288991a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<G0> f288992b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f288993c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y41.a<G0> f288994d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final SwipeRefreshLayout f288995e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final RecyclerView f288996f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final LinearLayout f288997g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final LinearLayout f288998h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f288999i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f289000j;

    public g(@k View view, @k com.avito.konveyor.adapter.d dVar, boolean z12, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2, @k Y41.a<G0> aVar3) {
        this.f288991a = dVar;
        this.f288992b = aVar;
        this.f288993c = aVar2;
        this.f288994d = aVar3;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh);
        this.f288995e = swipeRefreshLayout;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sections);
        this.f288996f = recyclerView;
        this.f288997g = (LinearLayout) view.findViewById(R.id.stubs);
        this.f288998h = (LinearLayout) view.findViewById(R.id.error);
        this.f288999i = (TextView) view.findViewById(R.id.error_title);
        this.f289000j = (TextView) view.findViewById(R.id.error_description);
        Button button = (Button) view.findViewById(R.id.error_button);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new com.avito.android.offlinization.ui.a(this, 28));
        }
        if (button != null) {
            final int i12 = 0;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_seller_orders.orders_buyer.f

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g f288990c;

                {
                    this.f288990c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            this.f288990c.f288993c.invoke();
                            break;
                        default:
                            this.f288990c.f288994d.invoke();
                            break;
                    }
                }
            });
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(dVar);
        }
        if (toolbar != null) {
            final int i13 = 1;
            toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_seller_orders.orders_buyer.f

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g f288990c;

                {
                    this.f288990c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i13) {
                        case 0:
                            this.f288990c.f288993c.invoke();
                            break;
                        default:
                            this.f288990c.f288994d.invoke();
                            break;
                    }
                }
            });
        }
        if (z12) {
            D6.w(toolbar);
        }
    }
}
