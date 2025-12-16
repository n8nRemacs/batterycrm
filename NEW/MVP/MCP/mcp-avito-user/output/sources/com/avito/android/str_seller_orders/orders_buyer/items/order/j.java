package com.avito.android.str_seller_orders.orders_buyer.items.order;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.str_seller_orders.orders_buyer.mvi.entity.SizeViewType;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: OrderView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/items/order/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_seller_orders/orders_buyer/items/order/i;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f289045g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f289046b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TextView f289047c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final TextView f289048d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final TextView f289049e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ImageView f289050f;

    /* compiled from: OrderView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SizeViewType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SizeViewType sizeViewType = SizeViewType.f289081b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public j(@k View view) {
        super(view);
        this.f289046b = view;
        this.f289047c = (TextView) view.findViewById(R.id.order_title);
        this.f289048d = (TextView) view.findViewById(R.id.item_title);
        this.f289049e = (TextView) view.findViewById(R.id.status_title);
        this.f289050f = (ImageView) view.findViewById(R.id.image);
    }

    @Override // com.avito.android.str_seller_orders.orders_buyer.items.order.i
    public final void HO(@l String str) {
        TextView textView = this.f289048d;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.str_seller_orders.orders_buyer.items.order.i
    public final void J8(@l String str) {
        TextView textView = this.f289049e;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.str_seller_orders.orders_buyer.items.order.i
    public final void Mg(@l String str, @k SizeViewType sizeViewType) {
        int i12;
        boolean z12 = str == null || str.length() == 0;
        ImageView imageView = this.f289050f;
        if (!z12) {
            if (imageView != null) {
                com.avito.android.image_loader.glide.utils.b.c(imageView, Uri.parse(str));
                return;
            }
            return;
        }
        int iOrdinal = sizeViewType.ordinal();
        if (iOrdinal == 0) {
            i12 = R.drawable.str_orders_buyer_image_big_placeholder;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.drawable.str_orders_buyer_image_small_placeholder;
        }
        if (imageView != null) {
            imageView.setImageResource(i12);
        }
    }

    @Override // com.avito.android.str_seller_orders.orders_buyer.items.order.i
    public final void j6(@k Y41.a<G0> aVar) {
        this.f289046b.setOnClickListener(new com.avito.android.str_calendar.booking_calendar.items.day.h(14, aVar));
    }

    @Override // com.avito.android.str_seller_orders.orders_buyer.items.order.i
    public final void nm(@l UniversalColor universalColor) {
        View view = this.f289046b;
        TextView textView = this.f289049e;
        if (universalColor == null) {
            if (textView != null) {
                textView.setTextColor(C35835l0.d(R.attr.black, view.getContext()));
            }
        } else if (textView != null) {
            Context context = view.getContext();
            C48063a.f437606a.getClass();
            textView.setTextColor(C48063a.e(context, universalColor));
        }
    }

    @Override // com.avito.android.str_seller_orders.orders_buyer.items.order.i
    public final void rK(@l String str) {
        TextView textView = this.f289047c;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.str_seller_orders.orders_buyer.items.order.i
    public final void rX(@l Boolean bool) {
        TextView textView = this.f289049e;
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, L.f(bool, Boolean.TRUE) ? R.drawable.str_orders_attention_circle : 0, 0);
        }
    }
}
