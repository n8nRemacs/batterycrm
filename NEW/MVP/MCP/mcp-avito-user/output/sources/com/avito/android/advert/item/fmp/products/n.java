package com.avito.android.advert.item.fmp.products;

import Ba.ViewOnClickListenerC13121a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.lib.design.gradient.a;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout;
import com.avito.android.lib.util.v;
import com.avito.android.remote.fmp.Background;
import com.avito.android.remote.fmp.IconBackground;
import com.avito.android.remote.fmp.Icons;
import com.avito.android.remote.fmp.Margin;
import com.avito.android.remote.fmp.Padding;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: AdvertDetailsFmpProductsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/fmp/products/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/fmp/products/k;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f75629i = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f75630b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f75631c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final HorizontalScrollView f75632d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public String f75633e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f75634f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public TextView f75635g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public ShimmerFrameLayout f75636h;

    /* compiled from: AdvertDetailsFmpProductsView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/advert/item/fmp/products/n$a;", "", "<init>", "()V", "", "BASE_CONTAINER_HEIGHT", "I", "BASE_DIVIDER_WIDTH", "BASE_MORTGAGE_TILE_WIDTH", "BASE_TILE_WIDTH", "SINGLE_CONTAINER_HEIGHT", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertDetailsFmpProductsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f75637l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a<G0> aVar) {
            super(0);
            this.f75637l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f75637l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsFmpProductsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f75638l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a<G0> aVar) {
            super(0);
            this.f75638l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f75638l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsFmpProductsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f75639l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a<G0> aVar) {
            super(0);
            this.f75639l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f75639l.invoke();
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    public n(@Y61.k View view) {
        super(view);
        this.f75630b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.fmp_products_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f75631c = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.fmp_products_scroll_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.HorizontalScrollView");
        }
        this.f75632d = (HorizontalScrollView) viewFindViewById2;
        this.f75634f = new LinkedHashSet();
    }

    public static void C80(View view, int i12, Context context) {
        int i13 = (int) (i12 * context.getResources().getDisplayMetrics().density);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, i13);
        }
        layoutParams.height = i13;
        view.setLayoutParams(layoutParams);
    }

    public static void D80(@Y61.k View view, @Y61.l Margin margin) {
        if (margin == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Integer num = margin.f253466d;
            int iB2 = y6.b(num != null ? num.intValue() : 0);
            Integer num2 = margin.f253464b;
            int iB3 = y6.b(num2 != null ? num2.intValue() : 0);
            Integer num3 = margin.f253467e;
            int iB4 = y6.b(num3 != null ? num3.intValue() : 0);
            Integer num4 = margin.f253465c;
            marginLayoutParams.setMargins(iB2, iB3, iB4, y6.b(num4 != null ? num4.intValue() : 0));
            view.setLayoutParams(layoutParams);
        }
    }

    public static void E80(@Y61.k View view, @Y61.l Padding padding) {
        if (padding == null) {
            return;
        }
        Integer num = padding.f253470d;
        int iB2 = y6.b(num != null ? num.intValue() : 0);
        Integer num2 = padding.f253468b;
        int iB3 = y6.b(num2 != null ? num2.intValue() : 0);
        Integer num3 = padding.f253471e;
        int iB4 = y6.b(num3 != null ? num3.intValue() : 0);
        Integer num4 = padding.f253469c;
        view.setPadding(iB2, iB3, iB4, y6.b(num4 != null ? num4.intValue() : 0));
    }

    public final void B80(@Y61.k ViewGroup viewGroup, @Y61.l Background background) {
        if (background == null) {
            return;
        }
        Context context = this.f75630b;
        Integer num = background.f253451b;
        int iB2 = num != null ? y6.b(num.intValue()) : context.getResources().getDimensionPixelSize(R.dimen.advert_details_fmp_products_tile_corner_radius);
        String str = background.f253453d;
        Integer numH = str != null ? com.avito.android.lib.util.f.h(str) : null;
        Integer numI = str != null ? com.avito.android.lib.util.f.i(str) : null;
        if (numH != null) {
            AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(this.f75630b, numH.intValue(), 0, 4, null);
            c5275a.f179264a = iB2;
            viewGroup.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
            viewGroup.setBackgroundTintList(null);
            return;
        }
        if (numI != null) {
            Context context2 = this.f75630b;
            a.C5276a.C5277a c5277a = new a.C5276a.C5277a(context2, numI.intValue(), 0, 4, null);
            c5277a.f179264a = iB2;
            viewGroup.setBackground(new com.avito.android.lib.design.gradient.a(context2, c5277a.a()));
            viewGroup.setBackgroundTintList(null);
            return;
        }
        UniversalColor universalColor = background.f253452c;
        if (universalColor != null) {
            C48063a.f437606a.getClass();
            viewGroup.setBackgroundTintList(C48063a.e(context, universalColor));
        }
    }

    public final void F80(@Y61.k SimpleDraweeView simpleDraweeView, @Y61.l UniversalImage universalImage) {
        Image imageDependsOnTheme = universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f75630b)) : null;
        simpleDraweeView.setVisibility(imageDependsOnTheme != null ? 0 : 8);
        com.avito.android.image_loader.glide.utils.b.d(simpleDraweeView, com.avito.android.image_loader.b.b(imageDependsOnTheme));
    }

    @Y61.k
    public final View G80(@Y61.k MortgageTile mortgageTile, boolean z12, @Y61.k Y41.a aVar) {
        View viewInflate = LayoutInflater.from(this.f75630b).inflate(z12 ? R.layout.advert_details_fmp_products_mortgage_single_item : R.layout.advert_details_fmp_products_mortgage_item, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.fmp_mortgage_card_icon_payment_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.fmp_mortgage_card_icon_payment_text_shimmer);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout");
        }
        this.f75635g = textView;
        this.f75636h = (ShimmerFrameLayout) viewFindViewById2;
        N20(this.f75633e);
        View viewFindViewById3 = viewInflate.findViewById(R.id.fmp_mortgage_card_label_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        com.avito.android.util.text.j.a((TextView) viewFindViewById3, mortgageTile.f75569b, null);
        View viewFindViewById4 = viewInflate.findViewById(R.id.fmp_mortgage_card_icon_1);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.fmp_mortgage_card_icon_2);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.fmp_mortgage_card_icon_3);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) viewFindViewById6;
        View viewFindViewById7 = viewInflate.findViewById(R.id.fmp_mortgage_card_stub_icon);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) viewFindViewById7;
        Icons icons = mortgageTile.f75572e;
        if ((icons != null ? icons.f253461d : null) != null) {
            List listU = C42745f0.U(simpleDraweeView, simpleDraweeView2, simpleDraweeView3);
            List list = icons.f253461d;
            if (list == null) {
                list = C42784z0.f406748b;
            }
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                Iterator it = listU.iterator();
                while (it.hasNext()) {
                    D6.w((SimpleDraweeView) it.next());
                }
            } else {
                int i12 = 0;
                for (Object obj : listU) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    SimpleDraweeView simpleDraweeView5 = (SimpleDraweeView) obj;
                    UniversalImage universalImage = (UniversalImage) C42745f0.K(i12, list);
                    if (universalImage != null) {
                        D6.H(simpleDraweeView5);
                        F80(simpleDraweeView5, universalImage);
                    } else {
                        D6.w(simpleDraweeView5);
                    }
                    i12 = i13;
                }
            }
        } else {
            UniversalImage universalImage2 = icons != null ? icons.f253460c : null;
            if (universalImage2 != null) {
                F80(simpleDraweeView4, universalImage2);
            } else {
                simpleDraweeView4.setImageResource(R.drawable.ic_mortgage_banks_redesign_icons);
            }
            D6.H(simpleDraweeView4);
        }
        View viewFindViewById8 = viewInflate.findViewById(R.id.fmp_mortgage_card_container);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById8;
        B80(constraintLayout, mortgageTile.f75576i);
        E80(constraintLayout, mortgageTile.f75577j);
        D80(constraintLayout, mortgageTile.f75578k);
        constraintLayout.setOnClickListener(new ViewOnClickListenerC13121a(8, aVar));
        return viewInflate;
    }

    @Y61.k
    public final View H80(@Y61.k Tile tile, @Y61.k Y41.l<? super Tile, G0> lVar) {
        IconBackground iconBackground;
        ColorStateList colorStateListE;
        Context context = this.f75630b;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.advert_details_fmp_products_simple_item, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.fmp_simple_card_subtitle);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        com.avito.android.util.text.j.a((TextView) viewFindViewById, tile.f75583c, null);
        View viewFindViewById2 = viewInflate.findViewById(R.id.fmp_simple_image_background);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
        Icons icons = tile.f75584d;
        if (icons != null && (iconBackground = icons.f253462e) != null) {
            UniversalColor universalColor = iconBackground.f253457b;
            if (universalColor != null) {
                C48063a.f437606a.getClass();
                colorStateListE = C48063a.e(context, universalColor);
            } else {
                colorStateListE = null;
            }
            frameLayout.setBackgroundTintList(colorStateListE);
            v.a(frameLayout, iconBackground.f253458c != null ? r6.intValue() : context.getResources().getDimensionPixelSize(R.dimen.advert_details_fmp_products_tile_corner_radius));
        }
        View viewFindViewById3 = viewInflate.findViewById(R.id.fmp_simple_card_image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        F80((SimpleDraweeView) viewFindViewById3, icons != null ? icons.f253460c : null);
        View viewFindViewById4 = viewInflate.findViewById(R.id.fmp_simple_card_text_icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById4;
        String str = icons != null ? icons.f253459b : null;
        if (str == null) {
            str = "";
        }
        Integer numM = com.avito.android.lib.util.f.m(str);
        if (numM != null) {
            FV.a aVar = FV.a.f4720a;
            int iIntValue = numM.intValue();
            aVar.getClass();
            FV.a.c(textView, iIntValue);
            D6.H(textView);
        } else {
            D6.w(textView);
        }
        View viewFindViewById5 = viewInflate.findViewById(R.id.fmp_products_simple_tile_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById5;
        B80(linearLayout, tile.f75586f);
        E80(linearLayout, tile.f75587g);
        D80(linearLayout, tile.f75588h);
        linearLayout.setOnClickListener(new m(lVar, tile, 1));
        return viewInflate;
    }

    @Override // com.avito.android.advert.item.fmp.products.k
    public final void N20(@Y61.l String str) {
        this.f75633e = str;
        if (str == null || str.length() == 0) {
            D6.w(this.f75635g);
            D6.H(this.f75636h);
            return;
        }
        D6.w(this.f75636h);
        TextView textView = this.f75635g;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00be  */
    @Override // com.avito.android.advert.item.fmp.products.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gF(@Y61.l java.util.List<com.avito.android.advert.item.fmp.products.Tile> r17, @Y61.l com.avito.android.advert.item.fmp.products.MortgageTile r18, @Y61.l com.avito.android.remote.fmp.Margin r19, @Y61.l com.avito.android.remote.fmp.Padding r20, @Y61.l com.avito.android.remote.fmp.Size r21, @Y61.k Y41.l<? super com.avito.android.advert.item.fmp.products.Tile, kotlin.G0> r22, @Y61.k final Y41.l<? super com.avito.android.advert.item.fmp.products.Tile, kotlin.G0> r23, @Y61.k Y41.a<kotlin.G0> r24, @Y61.k final Y41.a<kotlin.G0> r25) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.fmp.products.n.gF(java.util.List, com.avito.android.advert.item.fmp.products.MortgageTile, com.avito.android.remote.fmp.Margin, com.avito.android.remote.fmp.Padding, com.avito.android.remote.fmp.Size, Y41.l, Y41.l, Y41.a, Y41.a):void");
    }
}
