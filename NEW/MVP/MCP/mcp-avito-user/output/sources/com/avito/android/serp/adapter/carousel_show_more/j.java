package com.avito.android.serp.adapter.carousel_show_more;

import Y61.k;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.lib.design.header_button.HeaderButton;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.seller_promotions.o;
import com.avito.android.util.C35835l0;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: CarouselShowMoreItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_show_more/j;", "Lcom/avito/android/serp/adapter/carousel_show_more/i;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f269153i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayout f269154b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final HeaderButton f269155c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f269156d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f269157e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC42726C f269158f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC42726C f269159g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC42726C f269160h;

    /* compiled from: CarouselShowMoreItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f269161a;

        static {
            int[] iArr = new int[SerpDisplayType.values().length];
            try {
                iArr[SerpDisplayType.AvitoPromotion.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f269161a = iArr;
        }
    }

    /* compiled from: CarouselShowMoreItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(j.this.f269154b.getContext().getResources().getDimensionPixelSize(R.dimen.sales_card_image_height));
        }
    }

    /* compiled from: CarouselShowMoreItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f269163l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(0);
            this.f269163l = view;
        }

        @Override // Y41.a
        public final Integer invoke() {
            return l.n(this.f269163l, R.dimen.serp_card_foreground_padding);
        }
    }

    /* compiled from: CarouselShowMoreItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<Integer> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(j.this.f269154b.getContext().getResources().getDimensionPixelSize(R.dimen.promotion_card_size));
        }
    }

    /* compiled from: CarouselShowMoreItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f269165l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(0);
            this.f269165l = view;
        }

        @Override // Y41.a
        public final Integer invoke() {
            return l.n(this.f269165l, R.dimen.promotion_card_right_padding);
        }
    }

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.show_more_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f269154b = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.carousel_header_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.header_button.HeaderButton");
        }
        this.f269155c = (HeaderButton) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.show_more_item_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f269156d = (TextView) viewFindViewById3;
        this.f269157e = C42727D.c(new c(view));
        this.f269158f = C42727D.c(new d());
        this.f269159g = C42727D.c(new b());
        this.f269160h = C42727D.c(new e(view));
    }

    @Override // com.avito.android.serp.adapter.carousel_show_more.i
    public final void Ud(@k SerpDisplayType serpDisplayType) {
        int i12 = a.f269161a[serpDisplayType.ordinal()];
        LinearLayout linearLayout = this.f269154b;
        if (i12 == 1) {
            View rootView = linearLayout.getRootView();
            ViewGroup.LayoutParams layoutParams = linearLayout.getRootView().getLayoutParams();
            layoutParams.width = ((Number) this.f269158f.getValue()).intValue();
            rootView.setLayoutParams(layoutParams);
            linearLayout.getRootView().setPadding(0, 0, ((Number) this.f269160h.getValue()).intValue(), 0);
            return;
        }
        View rootView2 = linearLayout.getRootView();
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getRootView().getLayoutParams();
        layoutParams2.width = ((Number) this.f269159g.getValue()).intValue();
        rootView2.setLayoutParams(layoutParams2);
        View rootView3 = linearLayout.getRootView();
        InterfaceC42726C interfaceC42726C = this.f269157e;
        rootView3.setPadding(((Number) interfaceC42726C.getValue()).intValue(), ((Number) interfaceC42726C.getValue()).intValue(), ((Number) interfaceC42726C.getValue()).intValue(), ((Number) interfaceC42726C.getValue()).intValue());
    }

    @Override // com.avito.android.serp.adapter.carousel_show_more.i
    @k
    public final String X2(@Y61.l UniversalColor universalColor, @k String str) {
        TextView textView = this.f269156d;
        textView.setText(str);
        if (universalColor != null) {
            textView.setTextColor(C48063a.f437606a.a(textView.getContext(), universalColor));
        }
        return textView.getText().toString();
    }

    @Override // com.avito.android.serp.adapter.carousel_show_more.i
    public final void c(@k Y41.a<G0> aVar) {
        this.f269154b.setOnClickListener(new o(11, aVar));
        this.f269155c.setOnClickListener(new o(12, aVar));
    }

    @Override // com.avito.android.serp.adapter.carousel_show_more.i
    public final void v(@Y61.l UniversalColor universalColor) {
        int iD2;
        LinearLayout linearLayout = this.f269154b;
        GradientDrawable gradientDrawable = (GradientDrawable) linearLayout.getBackground();
        if (universalColor != null) {
            iD2 = Integer.valueOf(C48063a.f437606a.a(linearLayout.getContext(), universalColor)).intValue();
        } else {
            iD2 = C35835l0.d(R.attr.warmGray4, linearLayout.getContext());
        }
        gradientDrawable.setColor(iD2);
        linearLayout.setBackground(gradientDrawable);
    }
}
