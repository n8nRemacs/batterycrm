package com.avito.android.active_orders_common.items.order;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OrderItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/active_orders_common/items/order/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/active_orders_common/items/order/m;", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f68389h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f68390b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f68391c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f68392d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f68393e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f68394f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Badge f68395g;

    public o(@Y61.k View view) {
        super(view);
        this.f68390b = view;
        View viewFindViewById = view.findViewById(R.id.order_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f68391c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.order_image_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        View viewFindViewById3 = view.findViewById(R.id.order_image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f68392d = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.order_image_shadow);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f68393e = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.order_description);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f68394f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.order_attention_badge);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f68395g = (Badge) viewFindViewById6;
    }

    @Override // com.avito.android.active_orders_common.items.order.m
    public final void Sl() {
        D6.w(this.f68393e);
    }

    @Override // com.avito.android.active_orders_common.items.order.m
    public final void X60(@Y61.l Image image, @Y61.l Drawable drawable) {
        C35949t5.c(this.f68392d, com.avito.android.image_loader.b.b(image), drawable, ImageRequest.ScaleType.f169473d, null, 8);
    }

    @Override // com.avito.android.active_orders_common.items.order.m
    public final void a(@Y61.l Y41.a<G0> aVar) {
        View view = this.f68390b;
        if (aVar == null) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new n(0, aVar));
        }
    }

    @Override // com.avito.android.active_orders_common.items.order.m
    public final void g(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f68394f, attributedText, null);
    }

    @Override // com.avito.android.active_orders_common.items.order.m
    public final void k40() {
        D6.H(this.f68393e);
    }

    @Override // com.avito.android.active_orders_common.items.order.m
    public final void mI() {
        D6.w(this.f68395g);
    }

    @Override // com.avito.android.active_orders_common.items.order.m
    public final void setTitle(@Y61.l String str) {
        I5.a(this.f68391c, str, false);
    }

    @Override // com.avito.android.active_orders_common.items.order.m
    public final void zv(@Y61.k String str) {
        com.avito.android.lib.design.badge.f fVar = new com.avito.android.lib.design.badge.f(str, null, false, 6, null);
        Badge badge = this.f68395g;
        badge.setState(fVar);
        D6.H(badge);
    }
}
