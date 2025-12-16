package com.avito.android.active_orders_common.items.all_orders;

import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AllOrdersItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/active_orders_common/items/all_orders/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/active_orders_common/items/all_orders/j;", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f68312f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f68313b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f68314c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f68315d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f68316e;

    public k(@Y61.k View view) {
        super(view);
        this.f68313b = view;
        this.f68314c = view.getContext();
        View viewFindViewById = view.findViewById(R.id.all_order_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f68315d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.all_orders_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f68316e = (ImageView) viewFindViewById2;
    }

    @Override // com.avito.android.active_orders_common.items.all_orders.j
    public final void a(@l Y41.a<G0> aVar) {
        View view = this.f68313b;
        if (aVar == null) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new Ae0.b(28, aVar));
        }
    }

    @Override // com.avito.android.active_orders_common.items.all_orders.j
    public final void a3(@l Integer num, @l Integer num2) {
        Context context = this.f68314c;
        this.f68316e.setImageDrawable((num == null || num2 == null) ? num != null ? C35835l0.h(num.intValue(), context) : null : C35835l0.m(context, num.intValue(), num2.intValue()));
    }

    @Override // com.avito.android.active_orders_common.items.all_orders.j
    public final void setTitle(@l String str) {
        I5.a(this.f68315d, str, false);
    }
}
