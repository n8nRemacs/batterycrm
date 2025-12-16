package com.avito.android.serp.adapter.carousel_image;

import Y61.k;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.seller_promotions.o;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: CarouselImageItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_image/g;", "Lcom/avito/android/serp/adapter/carousel_image/f;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements com.avito.android.serp.adapter.carousel_image.f {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f269123i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final FrameLayout f269124b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f269125c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f269126d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f269127e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC42726C f269128f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC42726C f269129g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC42726C f269130h;

    /* compiled from: CarouselImageItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f269131a;

        static {
            int[] iArr = new int[SerpDisplayType.values().length];
            try {
                iArr[SerpDisplayType.AvitoPromotion.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f269131a = iArr;
        }
    }

    /* compiled from: CarouselImageItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f269132l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.f269132l = view;
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(this.f269132l.getContext().getResources().getDimensionPixelSize(R.dimen.sales_card_image_height));
        }
    }

    /* compiled from: CarouselImageItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f269133l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(0);
            this.f269133l = view;
        }

        @Override // Y41.a
        public final Integer invoke() {
            return l.n(this.f269133l, R.dimen.serp_card_foreground_padding);
        }
    }

    /* compiled from: CarouselImageItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f269134l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(0);
            this.f269134l = view;
        }

        @Override // Y41.a
        public final Integer invoke() {
            return l.n(this.f269134l, R.dimen.serp_carousel_image_corner_radius);
        }
    }

    /* compiled from: CarouselImageItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f269135l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(0);
            this.f269135l = view;
        }

        @Override // Y41.a
        public final Integer invoke() {
            return l.n(this.f269135l, R.dimen.promotion_card_size);
        }
    }

    /* compiled from: CarouselImageItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f269136l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(View view) {
            super(0);
            this.f269136l = view;
        }

        @Override // Y41.a
        public final Integer invoke() {
            return l.n(this.f269136l, R.dimen.promotion_card_right_padding);
        }
    }

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.image_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f269124b = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f269125c = (SimpleDraweeView) viewFindViewById2;
        this.f269126d = C42727D.c(new c(view));
        this.f269127e = C42727D.c(new e(view));
        this.f269128f = C42727D.c(new b(view));
        this.f269129g = C42727D.c(new d(view));
        this.f269130h = C42727D.c(new f(view));
    }

    @Override // com.avito.android.serp.adapter.carousel_image.f
    public final void Ud(@k SerpDisplayType serpDisplayType) {
        int i12 = a.f269131a[serpDisplayType.ordinal()];
        FrameLayout frameLayout = this.f269124b;
        if (i12 == 1) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = ((Number) this.f269127e.getValue()).intValue();
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.setPadding(0, 0, ((Number) this.f269130h.getValue()).intValue(), 0);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        layoutParams2.width = ((Number) this.f269128f.getValue()).intValue();
        frameLayout.setLayoutParams(layoutParams2);
        InterfaceC42726C interfaceC42726C = this.f269126d;
        frameLayout.setPadding(((Number) interfaceC42726C.getValue()).intValue(), ((Number) interfaceC42726C.getValue()).intValue(), ((Number) interfaceC42726C.getValue()).intValue(), ((Number) interfaceC42726C.getValue()).intValue());
    }

    @Override // com.avito.android.serp.adapter.carousel_image.f
    public final void c(@k Y41.a<G0> aVar) {
        this.f269124b.setOnClickListener(new o(10, aVar));
    }

    @Override // com.avito.android.serp.adapter.carousel_image.f
    public final void i(@k UniversalImage universalImage) {
        Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f269124b.getContext()));
        SimpleDraweeView simpleDraweeView = this.f269125c;
        if (imageDependsOnThemeOrDefault == null) {
            D6.w(simpleDraweeView);
            return;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault));
        aVarA.c();
        D6.H(simpleDraweeView);
    }

    @Override // com.avito.android.serp.adapter.carousel_image.f
    public final void v(@k UniversalColor universalColor) {
        int iA2 = C48063a.f437606a.a(this.f269124b.getContext(), universalColor);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(iA2);
        gradientDrawable.setCornerRadius(((Number) this.f269129g.getValue()).intValue());
        this.f269125c.setBackground(gradientDrawable);
    }
}
