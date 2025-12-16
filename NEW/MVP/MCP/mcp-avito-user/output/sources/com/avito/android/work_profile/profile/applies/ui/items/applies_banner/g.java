package com.avito.android.work_profile.profile.applies.ui.items.applies_banner;

import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.banner.a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AppliesBannerView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/ui/items/applies_banner/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f330943g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f330944b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f330945c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f330946d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Object f330947e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Object f330948f;

    /* compiled from: AppliesBannerView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/button/Button;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Button> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Button invoke() {
            View viewFindViewById = g.this.f330944b.findViewById(R.id.applies_banner_button);
            if (viewFindViewById != null) {
                return (Button) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
    }

    /* compiled from: AppliesBannerView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/fresco/SimpleDraweeView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<SimpleDraweeView> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final SimpleDraweeView invoke() {
            View viewFindViewById = g.this.f330944b.findViewById(R.id.applies_banner_image);
            if (viewFindViewById != null) {
                return (SimpleDraweeView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
    }

    /* compiled from: AppliesBannerView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<TextView> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = g.this.f330944b.findViewById(R.id.applies_banner_subtitle);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* compiled from: AppliesBannerView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<TextView> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = g.this.f330944b.findViewById(R.id.applies_banner_title);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    public g(@k View view) throws Resources.NotFoundException {
        super(view);
        this.f330944b = view;
        View viewFindViewById = view.findViewById(R.id.banner);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        Banner banner = (Banner) viewFindViewById;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f330945c = C42727D.b(lazyThreadSafetyMode, new d());
        this.f330946d = C42727D.b(lazyThreadSafetyMode, new c());
        this.f330947e = C42727D.b(lazyThreadSafetyMode, new a());
        this.f330948f = C42727D.b(lazyThreadSafetyMode, new b());
        banner.setState(new TU.a(null, null, R.layout.applies_banner_content, 3, null));
        a.C5258a c5258a = com.avito.android.lib.design.banner.a.f178448x;
        Context context = banner.getContext();
        int iJ2 = C35835l0.j(R.attr.bannerDefault, banner.getContext());
        c5258a.getClass();
        com.avito.android.lib.design.banner.a aVarB = a.C5258a.b(iJ2, context);
        int iB2 = y6.b(24);
        AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(banner.getRootView().getContext(), R.attr.gradientLinearMixedHorizontalBlueGreen, 0, 4, null);
        c5275a.f179264a = y6.b(28);
        banner.setStyle(com.avito.android.lib.design.banner.a.a(aVarB, null, null, new AvitoLinearGradientDrawable(c5275a.a()), 0, 0, iB2, 0, true, 0.0f, false, false, 8388027));
    }
}
