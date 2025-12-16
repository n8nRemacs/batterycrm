package com.avito.android.promo.mini;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.banner.a;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.lib.util.v;
import com.avito.android.promo.MovableImage;
import com.avito.android.promo.PromoAction;
import com.avito.android.promo.PromoStyle;
import com.avito.android.promo.PromoWidgetItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import j.f0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ld0.C43730a;
import ld0.C43731b;
import ld0.C43735f;
import ld0.InterfaceC43733d;
import ld0.InterfaceC43734e;

/* compiled from: PromoWidgetItemMiniViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/promo/mini/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/promo/mini/f;", "Lld0/e;", "_avito_bx-content_widget_promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements f, InterfaceC43734e {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f231661i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC43733d f231662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C43735f f231663c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f231664d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f231665e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f231666f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SimpleDraweeView f231667g;

    /* renamed from: h, reason: collision with root package name */
    public final int f231668h;

    public h(@k View view, @k InterfaceC43733d interfaceC43733d) {
        super(view);
        this.f231662b = interfaceC43733d;
        View viewInflate = LayoutInflater.from(new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23)).inflate(R.layout.promo_block_mini_content, (ViewGroup) null);
        this.f231663c = new C43735f(view, interfaceC43733d, viewInflate);
        Context context = view.getContext();
        this.f231664d = context;
        View viewFindViewById = viewInflate.findViewById(R.id.promo_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f231665e = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.promo_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f231666f = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.promo_image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f231667g = (SimpleDraweeView) viewFindViewById3;
        this.f231668h = context.getResources().getDimensionPixelSize(R.dimen.serp_promo_banner_gradient_corner_radius);
    }

    @Override // ld0.InterfaceC43734e
    public final void BM(@f0 int i12) {
        this.f231663c.BM(R.style.Re23_Text_H20);
    }

    @Override // com.avito.android.promo.mini.f
    public final void FF() {
        C43735f c43735f = this.f231663c;
        c43735f.f413961g.setPadding(0, 0, 0, 0);
        D6.b(c43735f.f413961g.getContainer(), 0, 0, 0, 0);
        ViewGroup container = c43735f.f413961g.getContainer();
        ViewGroup.LayoutParams layoutParams = container.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f44197j = 0;
        bVar.f44199k = -1;
        container.setLayoutParams(bVar);
    }

    @Override // ld0.InterfaceC43734e
    public final void Gg(@l String str, boolean z12) {
        this.f231665e.setText(str);
    }

    @Override // com.avito.android.promo.mini.f
    public final void PN(@l MovableImage movableImage) {
        UniversalImage image;
        SimpleDraweeView simpleDraweeView = this.f231667g;
        Image imageDependsOnThemeOrDefault = (movableImage == null || (image = movableImage.getImage()) == null) ? null : UniversalImageKt.getImageDependsOnThemeOrDefault(image, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()));
        if (imageDependsOnThemeOrDefault == null) {
            D6.w(simpleDraweeView);
            return;
        }
        C35949t5.c(this.f231667g, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault), null, null, null, 14);
        v.a(simpleDraweeView, this.f231668h);
        D6.H(simpleDraweeView);
    }

    @Override // ld0.InterfaceC43734e
    public final void SG(@k List<PromoAction> list, @k PromoWidgetItem promoWidgetItem, int i12) {
        this.f231663c.f413961g.setOnClickListener(new g(this, list, promoWidgetItem, i12, 0));
    }

    @Override // ld0.InterfaceC43734e
    public final void W2() {
        this.f231663c.W2();
    }

    @Override // ld0.InterfaceC43734e
    public final void WU(@k PromoStyle promoStyle, boolean z12) throws Resources.NotFoundException {
        G0 g02;
        C43731b.f413953a.getClass();
        C43730a c43730aB = C43731b.b(promoStyle);
        C43735f c43735f = this.f231663c;
        if (c43730aB != null) {
            int i12 = c43730aB.f413951a;
            Context context = this.f231664d;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C35835l0.j(i12, context), d.n.f178966f);
            Banner banner = c43735f.f413961g;
            a.C5258a c5258a = com.avito.android.lib.design.banner.a.f178448x;
            Context context2 = banner.getContext();
            c5258a.getClass();
            com.avito.android.lib.design.banner.a aVarC = a.C5258a.c(typedArrayObtainStyledAttributes, context2);
            AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(this.f231664d, c43730aB.f413952b, 0, 4, null);
            c5275a.f179264a = this.f231668h;
            banner.setStyle(com.avito.android.lib.design.banner.a.a(aVarC, null, null, new AvitoLinearGradientDrawable(c5275a.a()), 0, 0, 0, 0, false, 0.0f, false, false, 8388603));
            typedArrayObtainStyledAttributes.recycle();
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            c43735f.f413961g.setAppearanceFromAttr(C43731b.a(promoStyle));
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f231663c.getClass();
    }

    @Override // ld0.InterfaceC43734e
    public final void r6(@k String str) {
        this.f231666f.setText(str);
    }

    @Override // ld0.InterfaceC43734e
    public final void v8() {
        this.f231663c.v8();
    }
}
