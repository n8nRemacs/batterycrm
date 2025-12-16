package com.avito.android.str_seller_orders_calendar.strorderscalendar.items.flat_info;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FlatInfoItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/flat_info/l;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l extends com.avito.konveyor.adapter.b {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f290952j = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f290953b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f290954c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f290955d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f290956e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Handler f290957f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f290958g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f290959h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final GradientDrawable f290960i;

    public l(@Y61.k View view) {
        super(view);
        this.f290953b = (ImageView) view.findViewById(R.id.flat_image_iv);
        ImageView imageView = (ImageView) view.findViewById(R.id.flat_icon_iv);
        this.f290954c = imageView;
        this.f290955d = (TextView) view.findViewById(R.id.main_info_tv);
        Context context = view.getContext();
        this.f290956e = context;
        this.f290957f = new Handler(Looper.getMainLooper());
        GradientDrawable gradientDrawableE = com.avito.android.advert.item.delivery_suggests.l.e(1);
        gradientDrawableE.setStroke(y6.b(1), C35835l0.d(R.attr.white, context));
        this.f290960i = gradientDrawableE;
        imageView.setBackground(gradientDrawableE);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f290959h;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f290957f.removeCallbacksAndMessages(null);
        com.avito.android.lib.design.tooltip.k kVar = this.f290958g;
        if (kVar != null) {
            kVar.dismiss();
        }
        this.f290958g = null;
    }
}
