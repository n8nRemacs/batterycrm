package com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.badge.h;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.serp.adapter.serp_advert_card.i;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sK0.C48065c;

/* compiled from: UspBannerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/banner/f;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/banner/e;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.android.serp.c implements e {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f273333i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f273334b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f273335c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f273336d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Badge f273337e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Button f273338f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SimpleDraweeView f273339g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f273340h;

    /* compiled from: UspBannerItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/banner/f$a;", "", "<init>", "()V", "", "UNCONSTRAINED_IMAGE_BANNER_MIN_WIDTH_PX", "I", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UspBannerItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<UspBannerItem, G0> f273341l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ UspBannerItem f273342m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super UspBannerItem, G0> lVar, UspBannerItem uspBannerItem) {
            super(0);
            this.f273341l = lVar;
            this.f273342m = uspBannerItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f273341l.invoke(this.f273342m);
            return G0.f406611a;
        }
    }

    /* compiled from: UspBannerItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<UspBannerItem, G0> f273343l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ UspBannerItem f273344m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(l<? super UspBannerItem, G0> lVar, UspBannerItem uspBannerItem) {
            super(0);
            this.f273343l = lVar;
            this.f273344m = uspBannerItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f273343l.invoke(this.f273344m);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    public f(@k View view) {
        super(view);
        Banner banner = (Banner) view.findViewById(R.id.usp_banner);
        this.f273334b = banner;
        View viewFindViewById = banner.findViewById(R.id.usp_banner_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f273335c = (TextView) viewFindViewById;
        View viewFindViewById2 = banner.findViewById(R.id.usp_banner_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f273336d = (TextView) viewFindViewById2;
        View viewFindViewById3 = banner.findViewById(R.id.usp_banner_badge);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f273337e = (Badge) viewFindViewById3;
        View viewFindViewById4 = banner.findViewById(R.id.usp_banner_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f273338f = (Button) viewFindViewById4;
        View viewFindViewById5 = banner.findViewById(R.id.usp_banner_image);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById5;
        this.f273339g = simpleDraweeView;
        Context context = view.getContext();
        this.f273340h = context;
        simpleDraweeView.setTranslationX(y6.b(375) - C35835l0.i(context).widthPixels < 0 ? 0 : r1);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner.e
    public final void a40(@k l lVar, @k UspBannerItem uspBannerItem) throws Resources.NotFoundException {
        j.a(this.f273335c, uspBannerItem.f273310b, null);
        j.a(this.f273336d, uspBannerItem.f273311c, null);
        Context context = this.f273340h;
        UniversalImage universalImage = uspBannerItem.f273314f;
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(context)) : null;
        ImageRequest.a aVarA = C35949t5.a(this.f273339g);
        aVarA.d(com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault));
        aVarA.f169499q = ImageRequest.CacheChoice.f169468b;
        aVarA.f169491i = true;
        aVarA.c();
        UspBannerItemBadge uspBannerItemBadge = uspBannerItem.f273312d;
        Badge badge = this.f273337e;
        if (uspBannerItemBadge != null) {
            badge.setAppearance(com.avito.android.lib.util.f.a(new ContextThemeWrapper(context, com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, uspBannerItemBadge.f273323d)), uspBannerItemBadge.f273322c));
        }
        h.a(badge, uspBannerItemBadge != null ? uspBannerItemBadge.f273321b : null);
        Button button = this.f273338f;
        UspBannerItemButton uspBannerItemButton = uspBannerItem.f273313e;
        if (uspBannerItemButton != null) {
            button.setAppearance(C35835l0.j(com.avito.android.lib.util.f.d(uspBannerItemButton.f273325c), new ContextThemeWrapper(context, com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, uspBannerItemButton.f273326d))));
        }
        com.avito.android.lib.design.button.b.a(button, uspBannerItemButton != null ? uspBannerItemButton.f273324b : null, false);
        ColorStateList colorStateListA = C48065c.a(context, uspBannerItem.f273316h.f273327b, R.attr.warmGray4);
        Banner banner = this.f273334b;
        Banner.h(banner, colorStateListA);
        if (uspBannerItemButton == null) {
            banner.setOnClickListener(new i(18, new c(lVar, uspBannerItem)));
            return;
        }
        b bVar = new b(lVar, uspBannerItem);
        banner.setOnClickListener(null);
        button.setOnClickListener(new i(17, bVar));
    }
}
