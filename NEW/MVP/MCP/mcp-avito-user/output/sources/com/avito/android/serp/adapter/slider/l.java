package com.avito.android.serp.adapter.slider;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.slider.sales_slider.SalesSlider;
import com.avito.android.serp.adapter.slider.sales_slider.m;
import com.avito.android.serp.adapter.slider.sales_slider.o;
import com.avito.android.serp.adapter.slider.sales_slider.p;
import com.avito.android.serp.adapter.slider.sales_slider.q;
import com.avito.android.util.C35835l0;
import js0.d;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;
import sK0.C48063a;

/* compiled from: SliderView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/slider/l;", "Lcom/avito/android/serp/adapter/slider/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/serp/adapter/slider/sales_slider/o;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l extends com.avito.konveyor.adapter.b implements k, o {

    /* renamed from: b, reason: collision with root package name */
    public final Context f272276b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SalesSlider f272277c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public SliderItem f272278d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public i f272279e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f272280f;

    /* compiled from: SliderView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/serp/adapter/slider/l$a", "Landroidx/lifecycle/q;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC23057q {
        public a() {
        }

        @Override // androidx.view.InterfaceC23057q
        public final void onDestroy(@Y61.k InterfaceC22983P interfaceC22983P) {
            interfaceC22983P.getLifecycle().c(this);
        }

        @Override // androidx.view.InterfaceC23057q
        public final void onResume(@Y61.k InterfaceC22983P interfaceC22983P) {
            SalesSlider salesSlider = l.this.f272277c;
            m mVar = salesSlider.f272289g;
            mVar.setIconAlpha(1.0f);
            mVar.f272326g = true;
            mVar.b(mVar.f272321b);
            mVar.c();
            salesSlider.f272288f.f272313d.setAlpha(1.0f);
            salesSlider.f272293k = false;
        }
    }

    /* compiled from: SliderView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f272282l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.f272282l = view;
        }

        @Override // Y41.a
        public final Integer invoke() {
            return com.avito.android.advert.item.delivery_suggests.l.n(this.f272282l, R.dimen.serp_vertical_margin_for_widget_default);
        }
    }

    public l(@Y61.k View view) {
        super(view);
        this.f272276b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.sales_slider);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.serp.adapter.slider.sales_slider.SalesSlider");
        }
        this.f272277c = (SalesSlider) viewFindViewById;
        this.f272280f = C42727D.c(new b(view));
    }

    @Override // com.avito.android.serp.adapter.slider.k
    public final void D20(@Y61.l InterfaceC22983P interfaceC22983P) {
        Lifecycle lifecycle;
        if (interfaceC22983P == null || (lifecycle = interfaceC22983P.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(new a());
    }

    @Override // com.avito.android.serp.adapter.slider.sales_slider.o
    public final void OC() {
        DeepLink deepLink;
        i iVar;
        SliderItem sliderItem = this.f272278d;
        if (sliderItem == null || (deepLink = sliderItem.f272253i) == null || (iVar = this.f272279e) == null) {
            return;
        }
        h hVar = iVar.f272271a;
        InterfaceC47690b interfaceC47690b = hVar.f272266b.get();
        if (interfaceC47690b != null) {
            InterfaceC47691c.a.a(interfaceC47690b, deepLink, null, 14);
        }
        d.a.a(hVar.f272267c, Integer.valueOf(iVar.f272272b), "slider_widget", C42745f0.O(C42745f0.U(hVar.f272269e, "swipe on slider"), ", ", null, null, null, 62), null, null, null, null, iVar.f272273c.f272256l, 120);
    }

    @Override // com.avito.android.serp.adapter.slider.k
    @Y61.l
    public final String e(@Y61.l AttributedText attributedText) {
        TextView textView = this.f272277c.f272288f.f272313d;
        com.avito.android.util.text.j.a(textView, attributedText, null);
        CharSequence text = textView.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // com.avito.android.serp.adapter.slider.k
    public final void eI(boolean z12) {
        if (z12) {
            return;
        }
        InterfaceC42726C interfaceC42726C = this.f272280f;
        this.f272277c.setPadding(0, ((Number) interfaceC42726C.getValue()).intValue(), 0, ((Number) interfaceC42726C.getValue()).intValue());
    }

    @Override // com.avito.android.serp.adapter.slider.k
    public final void fB(@Y61.k SliderItem sliderItem, @Y61.k i iVar) {
        this.f272278d = sliderItem;
        this.f272279e = iVar;
        p pVar = new p(sliderItem.f272247c, sliderItem.f272251g, this, sliderItem.f272254j);
        SalesSlider salesSlider = this.f272277c;
        salesSlider.setState(pVar);
        C48063a c48063a = C48063a.f437606a;
        UniversalColor universalColor = sliderItem.f272248d;
        Context context = this.f272276b;
        int iA2 = c48063a.a(context, universalColor);
        int iA3 = c48063a.a(context, sliderItem.f272249e);
        UniversalColor universalColor2 = sliderItem.f272250f;
        int iA4 = universalColor2 != null ? c48063a.a(context, universalColor2) : C35835l0.d(R.attr.constantWhite, context);
        UniversalColor universalColor3 = sliderItem.f272252h;
        salesSlider.setStyle(new q(iA2, iA3, iA4, universalColor3 != null ? c48063a.a(context, universalColor3) : C35835l0.d(R.attr.transparentWhite, context)));
    }

    @Override // com.avito.android.serp.adapter.slider.sales_slider.o
    public final void vk() {
        DeepLink deepLink;
        i iVar;
        SliderItem sliderItem = this.f272278d;
        if (sliderItem == null || (deepLink = sliderItem.f272253i) == null || (iVar = this.f272279e) == null) {
            return;
        }
        h hVar = iVar.f272271a;
        InterfaceC47690b interfaceC47690b = hVar.f272266b.get();
        if (interfaceC47690b != null) {
            InterfaceC47691c.a.a(interfaceC47690b, deepLink, null, 14);
        }
        d.a.a(hVar.f272267c, Integer.valueOf(iVar.f272272b), "slider_widget", C42745f0.O(C42745f0.U(hVar.f272269e, "click on slider"), ", ", null, null, null, 62), null, null, null, null, iVar.f272273c.f272256l, 120);
    }
}
