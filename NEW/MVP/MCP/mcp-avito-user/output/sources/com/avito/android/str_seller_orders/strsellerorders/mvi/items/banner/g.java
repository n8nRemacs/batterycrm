package com.avito.android.str_seller_orders.strsellerorders.mvi.items.banner;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BannerItemView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/banner/g;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f289940e;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f289941b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f289942c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f289943d;

    /* compiled from: BannerItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/banner/g$a;", "", "<init>", "()V", "", "DEF_COLOR_ATTR", "I", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f289940e = R.attr.blue50;
    }

    public g(@k View view) {
        super(view);
        this.f289941b = (TextView) view.findViewById(R.id.banner_title_tv);
        this.f289942c = (TextView) view.findViewById(R.id.banner_subtitle_tv);
        this.f289943d = (ImageView) view.findViewById(R.id.banner_image_view);
    }
}
