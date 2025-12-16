package com.avito.android.str_seller_orders.orders_seller.items.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.image_loader.n;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetContainerView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/items/widget/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_seller_orders/orders_seller/items/widget/j;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f289516c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f289517b;

    /* compiled from: WidgetContainerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f289518l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f289519m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i iVar, Y41.l<? super DeepLink, G0> lVar) {
            super(0);
            this.f289518l = iVar;
            this.f289519m = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deepLink = this.f289518l.f289513e;
            if (deepLink != null) {
                this.f289519m.invoke(deepLink);
            }
            return G0.f406611a;
        }
    }

    public k(@Y61.k View view) {
        super(view);
        this.f289517b = (LinearLayout) view.findViewById(R.id.widget_container);
    }

    public final View B80(i iVar, ViewGroup.LayoutParams layoutParams, Y41.l<? super DeepLink, G0> lVar) {
        Integer numM;
        LinearLayout linearLayout = this.f289517b;
        View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.str_seller_orders_widget_item_single, (ViewGroup) linearLayout, false);
        com.avito.android.str_seller_orders.orders_seller.items.widget.a aVar = new com.avito.android.str_seller_orders.orders_seller.items.widget.a(viewInflate);
        viewInflate.setClipToOutline(true);
        com.avito.android.util.text.j.a(aVar.f289497b, iVar.f289511c, null);
        com.avito.android.util.text.j.a(aVar.f289498c, iVar.f289512d, null);
        TextView textView = aVar.f289499d;
        D6.w(textView);
        String str = iVar.f289515g;
        if (str != null && (numM = com.avito.android.lib.util.f.m(str)) != null) {
            int iIntValue = numM.intValue();
            D6.H(textView);
            FV.a.f4720a.getClass();
            FV.a.c(textView, iIntValue);
        }
        UniversalImage universalImage = iVar.f289514f;
        SimpleDraweeView simpleDraweeView = aVar.f289500e;
        if (universalImage != null) {
            C35949t5.c(simpleDraweeView, n.a(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(viewInflate.getContext()))), null, null, null, 14);
            D6.H(simpleDraweeView);
            aVar.a(Integer.valueOf(R.id.widget_image_iv));
        } else {
            D6.w(simpleDraweeView);
            if (D6.y(textView)) {
                aVar.a(Integer.valueOf(R.id.widget_text_icon_tv));
            } else {
                aVar.a(null);
            }
        }
        D6.a(new a(iVar, lVar), viewInflate);
        viewInflate.setLayoutParams(layoutParams);
        return viewInflate;
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.widget.j
    public final void nh(@Y61.k Y41.l lVar, @Y61.k ArrayList arrayList) {
        LinearLayout linearLayout = this.f289517b;
        linearLayout.removeAllViews();
        int i12 = 0;
        for (Object obj : C42745f0.R0(arrayList, 2, 2)) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            List list = (List) obj;
            int size = list.size();
            if (size == 1) {
                View viewB80 = B80((i) list.get(0), new ViewGroup.LayoutParams(-1, -2), lVar);
                linearLayout.addView(viewB80);
                View viewFindViewById = viewB80.findViewById(R.id.widget_subtitle_tv);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                com.akita.view.foundation.util.e.a((TextView) viewFindViewById, null, Integer.valueOf(y6.b(2)), null, null, 13);
                com.akita.view.foundation.util.e.a(viewB80, null, Integer.valueOf(y6.b(7)), null, null, 13);
            } else if (size == 2) {
                i iVar = (i) list.get(0);
                i iVar2 = (i) list.get(1);
                LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
                linearLayout2.setOrientation(0);
                linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                View viewB802 = B80(iVar, layoutParams, lVar);
                View viewB803 = B80(iVar2, layoutParams, lVar);
                linearLayout2.addView(viewB802);
                linearLayout2.addView(viewB803);
                linearLayout.addView(linearLayout2);
                linearLayout.addOnLayoutChangeListener(new l(linearLayout, viewB802, viewB803, this));
                com.akita.view.foundation.util.e.a(viewB802, null, Integer.valueOf(y6.b(7)), Integer.valueOf(y6.b(7)), null, 9);
                com.akita.view.foundation.util.e.a(viewB803, null, Integer.valueOf(y6.b(7)), null, null, 9);
            }
            i12 = i13;
        }
    }
}
