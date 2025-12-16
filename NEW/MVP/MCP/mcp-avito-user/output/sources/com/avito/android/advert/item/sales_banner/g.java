package com.avito.android.advert.item.sales_banner;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.parking.h;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.serp_core.timer.CountDownTimerWidget;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: AdvertDetailsStickedSalesBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/sales_banner/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/sales_banner/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f79314h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewGroup f79315b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f79316c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f79317d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f79318e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final CountDownTimerWidget f79319f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC42726C f79320g;

    /* compiled from: AdvertDetailsStickedSalesBannerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            D6.w(g.this.f79319f);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsStickedSalesBannerView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(g.this.f79315b.getResources().getDimensionPixelSize(R.dimen.advert_details_sales_banner_block_bottom_margin));
        }
    }

    public g(@k ViewGroup viewGroup) {
        super(viewGroup);
        this.f79315b = viewGroup;
        View viewFindViewById = viewGroup.findViewById(R.id.banner_background_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f79316c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.banner_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79317d = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.banner_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79318e = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.banner_timer);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.serp_core.timer.CountDownTimerWidget");
        }
        this.f79319f = (CountDownTimerWidget) viewFindViewById4;
        this.f79320g = C42727D.c(new b());
    }

    @Override // com.avito.android.advert.item.sales_banner.f
    public final void c(@k Y41.a<G0> aVar) {
        this.f79315b.setOnClickListener(new h(12, aVar));
    }

    @Override // com.avito.android.advert.item.sales_banner.f
    public final void e(@k AttributedText attributedText) {
        j.c(this.f79317d, attributedText, null);
    }

    @Override // com.avito.android.advert.item.sales_banner.f
    public final void lZ(@l Integer num) {
        D6.c(this.f79315b, null, null, null, Integer.valueOf(num != null ? y6.b(num.intValue()) : ((Number) this.f79320g.getValue()).intValue()), 7);
    }

    @Override // com.avito.android.advert.item.sales_banner.f
    public final void r(@l AttributedText attributedText) {
        j.a(this.f79318e, attributedText, null);
    }

    @Override // com.avito.android.advert.item.sales_banner.f
    public final void v1(@k UniversalImage universalImage) {
        Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f79315b.getContext()));
        SimpleDraweeView simpleDraweeView = this.f79316c;
        if (imageDependsOnThemeOrDefault == null) {
            D6.w(simpleDraweeView);
            return;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault));
        aVarA.f169500r = false;
        aVarA.c();
        D6.H(simpleDraweeView);
    }

    @Override // com.avito.android.advert.item.sales_banner.f
    public final void z40(@k AttributedText attributedText, @l Long l12) {
        Object next;
        Object next2;
        String attribute;
        CountDownTimerWidget countDownTimerWidget = this.f79319f;
        if (l12 == null || l12.longValue() - new Date().getTime() <= 0) {
            D6.w(countDownTimerWidget);
            return;
        }
        CountDownTimerWidget.d(countDownTimerWidget, l12.longValue());
        countDownTimerWidget.setOnFinishListener(new a());
        List<Attribute> attributes = attributedText.getAttributes();
        ArrayList arrayList = new ArrayList();
        for (Object obj : attributes) {
            if (obj instanceof FontAttribute) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C42745f0.h(((FontAttribute) it.next()).getParameters(), arrayList2);
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof FontParameter.TextStyleParameter) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (!(next instanceof FontParameter.TextStyleParameter)) {
            next = null;
        }
        FontParameter.TextStyleParameter textStyleParameter = (FontParameter.TextStyleParameter) next;
        ViewGroup viewGroup = this.f79315b;
        if (textStyleParameter != null && (attribute = textStyleParameter.getAttribute()) != null) {
            countDownTimerWidget.setCellTextAppearance(com.avito.android.lib.util.f.r(viewGroup.getContext(), attribute));
            countDownTimerWidget.c(-2, -2);
        }
        List<Attribute> attributes2 = attributedText.getAttributes();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : attributes2) {
            if (obj2 instanceof FontAttribute) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            C42745f0.h(((FontAttribute) it3.next()).getParameters(), arrayList4);
        }
        Iterator it4 = arrayList4.iterator();
        while (true) {
            if (it4.hasNext()) {
                next2 = it4.next();
                if (next2 instanceof FontParameter.ColorParameter) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        FontParameter.ColorParameter colorParameter = (FontParameter.ColorParameter) (next2 instanceof FontParameter.ColorParameter ? next2 : null);
        if (colorParameter != null) {
            UniversalColor universalColor = new UniversalColor(colorParameter.getColorKey(), colorParameter.getColorDark(), colorParameter.getColor());
            Context context = viewGroup.getContext();
            C48063a c48063a = C48063a.f437606a;
            countDownTimerWidget.setCellTextColor(c48063a.a(context, universalColor));
            countDownTimerWidget.setSeparatorTextColor(c48063a.a(viewGroup.getContext(), universalColor));
        }
        D6.H(countDownTimerWidget);
    }
}
