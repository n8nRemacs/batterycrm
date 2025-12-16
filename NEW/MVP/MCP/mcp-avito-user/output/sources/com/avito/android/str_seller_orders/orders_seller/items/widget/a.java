package com.avito.android.str_seller_orders.orders_seller.items.widget;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: WidgetContainerView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/items/widget/a;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f289496a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f289497b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f289498c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f289499d;

    /* renamed from: e, reason: collision with root package name */
    public final SimpleDraweeView f289500e;

    public a(@Y61.k View view) {
        this.f289496a = view;
        this.f289497b = (TextView) view.findViewById(R.id.widget_title_tv);
        this.f289498c = (TextView) view.findViewById(R.id.widget_subtitle_tv);
        this.f289499d = (TextView) view.findViewById(R.id.widget_text_icon_tv);
        this.f289500e = (SimpleDraweeView) view.findViewById(R.id.widget_image_iv);
    }

    public final void a(Integer num) {
        View view = this.f289496a;
        ConstraintLayout constraintLayout = view instanceof ConstraintLayout ? (ConstraintLayout) view : null;
        if (constraintLayout == null) {
            return;
        }
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        int iIntValue = num != null ? num.intValue() : 0;
        int i12 = iIntValue == 0 ? 7 : 6;
        dVar.g(constraintLayout);
        dVar.j(R.id.widget_subtitle_tv, 7, iIntValue, i12, y6.b(16));
        dVar.c(constraintLayout);
    }
}
