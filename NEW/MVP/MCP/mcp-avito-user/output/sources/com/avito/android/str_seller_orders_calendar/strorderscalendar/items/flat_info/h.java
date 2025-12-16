package com.avito.android.str_seller_orders_calendar.strorderscalendar.items.flat_info;

import Tz0.C15431e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.campaigns_sale.konveyor.editBlock.o;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.internal.K;
import sK0.C48063a;

/* compiled from: FlatInfoItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/flat_info/h;", "LTV0/d;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/flat_info/l;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/flat_info/a;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements TV0.d<l, a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Uz0.b, G0> f290942b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y1<Float> f290943c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43238h f290944d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public N0 f290945e;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k Y41.l<? super Uz0.b, G0> lVar, @com.avito.android.str_seller_orders_calendar.strorderscalendar.di.b @Y61.k Y1<Float> y12) {
        this.f290942b = lVar;
        this.f290943c = y12;
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        this.f290944d = U.a(K.f411877a);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        final l lVar = (l) eVar;
        a aVar2 = (a) aVar;
        String str = aVar2.f290921d;
        if (str != null && str.length() != 0) {
            com.avito.android.image_loader.glide.utils.b.b(lVar.f290953b, Uri.parse(str), 0, kotlin.math.b.b(lVar.itemView.getContext().getResources().getDimension(R.dimen.str_calendar_flat_info_image_radius)));
        }
        boolean z12 = aVar2.f290925h;
        final d dVar = new d(aVar2, this);
        final C15431e c15431e = aVar2.f290924g;
        int i13 = c15431e == null ? 8 : 0;
        ImageView imageView = lVar.f290954c;
        imageView.setVisibility(i13);
        if (c15431e != null) {
            C48063a c48063a = C48063a.f437606a;
            UniversalColor universalColor = c15431e.f16047b;
            Context context = lVar.f290956e;
            int iA2 = c48063a.a(context, universalColor);
            Integer numA = q.a(c15431e.f16048c);
            imageView.setImageDrawable(numA != null ? C35835l0.n(context, numA.intValue(), iA2) : null);
            lVar.f290960i.setColor(ColorStateList.valueOf(c48063a.a(context, c15431e.f16046a)));
            if (z12) {
                lVar.f290957f.postDelayed(new Runnable() { // from class: com.avito.android.str_seller_orders_calendar.strorderscalendar.items.flat_info.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        l lVar2 = lVar;
                        com.avito.android.lib.design.tooltip.k kVar = lVar2.f290958g;
                        if (kVar != null) {
                            kVar.dismiss();
                        }
                        com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(lVar2.f290956e, 0, 0, 6, null);
                        kVar2.f181224j = new r.c(new i.a(null, 1, null));
                        p.a(kVar2, new k(c15431e));
                        kVar2.setOnDismissListener(new o(2, dVar));
                        lVar2.f290958g = kVar2;
                        kVar2.f(lVar2.f290954c);
                        lVar2.f290957f.postDelayed(new com.avito.android.publish.screen.objects.view.actions.h(lVar2, 24), 3000L);
                    }
                }, 500L);
            }
        }
        lVar.f290955d.setText(aVar2.f290922e);
        if (aVar2.f290923f == null) {
            lVar.itemView.setOnClickListener(null);
        } else {
            lVar.itemView.setOnClickListener(new com.avito.android.str_calendar.booking_calendar.items.day.h(24, new e(aVar2, this)));
        }
        C43259k.d(this.f290944d, null, null, new f(this, lVar, null), 3);
        lVar.f290959h = new g(this);
    }
}
