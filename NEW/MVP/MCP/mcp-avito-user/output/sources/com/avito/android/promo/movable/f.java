package com.avito.android.promo.movable;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.banner.a;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.promo.MovableImage;
import com.avito.android.promo.Placement;
import com.avito.android.promo.Position;
import com.avito.android.promo.PromoAction;
import com.avito.android.promo.PromoStyle;
import com.avito.android.promo.PromoWidgetConfig;
import com.avito.android.promo.PromoWidgetItem;
import com.avito.android.promo.ScaleType;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import j.f0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import ld0.C43730a;
import ld0.C43731b;
import ld0.C43735f;
import ld0.InterfaceC43733d;
import ld0.InterfaceC43734e;

/* compiled from: PromoWidgetItemMovableViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/promo/movable/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/promo/movable/e;", "Lld0/e;", "_avito_bx-content_widget_promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends com.avito.konveyor.adapter.b implements e, InterfaceC43734e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C43735f f231673b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f231674c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f231675d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f231676e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDraweeView f231677f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SimpleDraweeView f231678g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Guideline f231679h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ConstraintLayout f231680i;

    /* renamed from: j, reason: collision with root package name */
    public final int f231681j;

    /* compiled from: PromoWidgetItemMovableViewImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f231682a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f231683b;

        static {
            int[] iArr = new int[Placement.values().length];
            try {
                iArr[Placement.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Placement.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Placement.CENTER_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Placement.CENTER_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Placement.BOTTOM_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Placement.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f231682a = iArr;
            int[] iArr2 = new int[ScaleType.values().length];
            try {
                iArr2[ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ScaleType.CENTER_INSIDE.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ScaleType.CENTER_CROP.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ScaleType.FOCUS_CROP.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[ScaleType.FIT_BOTTOM_START.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            f231683b = iArr2;
        }
    }

    public f(@k View view, @k InterfaceC43733d interfaceC43733d) {
        super(view);
        View viewInflate = LayoutInflater.from(new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23)).inflate(R.layout.promo_block_with_movable_image_content, (ViewGroup) null);
        this.f231673b = new C43735f(view, interfaceC43733d, viewInflate);
        Context context = view.getContext();
        this.f231674c = context;
        this.f231675d = view.getResources().getBoolean(R.bool.is_tablet);
        View viewFindViewById = viewInflate.findViewById(R.id.promo_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f231676e = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.promo_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f231677f = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.promo_configured_image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f231678g = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.main_guideline);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Guideline");
        }
        this.f231679h = (Guideline) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.promo_configured_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f231680i = (ConstraintLayout) viewFindViewById5;
        this.f231681j = context.getResources().getDimensionPixelSize(R.dimen.serp_promo_banner_gradient_corner_radius);
    }

    @Override // ld0.InterfaceC43734e
    public final void BM(@f0 int i12) {
        this.f231673b.BM(R.style.Re23_Text_H20);
    }

    @Override // ld0.InterfaceC43734e
    public final void Gg(@l String str, boolean z12) {
        this.f231673b.f413961g.setTitle(null);
        TextView textView = this.f231676e;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.setMargins(((ViewGroup.MarginLayoutParams) bVar).leftMargin, z12 ? y6.b(20) : y6.b(0), ((ViewGroup.MarginLayoutParams) bVar).rightMargin, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
        textView.setLayoutParams(bVar);
        I5.a(textView, str, false);
    }

    @Override // ld0.InterfaceC43734e
    public final void SG(@k List<PromoAction> list, @k PromoWidgetItem promoWidgetItem, int i12) {
        this.f231673b.SG(list, promoWidgetItem, i12);
    }

    @Override // ld0.InterfaceC43734e
    public final void W2() {
        this.f231673b.W2();
    }

    @Override // ld0.InterfaceC43734e
    public final void WU(@k PromoStyle promoStyle, boolean z12) throws Resources.NotFoundException {
        G0 g02;
        com.avito.android.lib.design.banner.a aVarA;
        C43731b.f413953a.getClass();
        C43730a c43730aB = C43731b.b(promoStyle);
        int[] iArr = d.n.f178966f;
        boolean z13 = this.f231675d;
        C43735f c43735f = this.f231673b;
        Context context = this.f231674c;
        if (c43730aB != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C35835l0.j(c43730aB.f413951a, context), iArr);
            Banner banner = c43735f.f413961g;
            a.C5258a c5258a = com.avito.android.lib.design.banner.a.f178448x;
            Context context2 = banner.getContext();
            c5258a.getClass();
            com.avito.android.lib.design.banner.a aVarC = a.C5258a.c(typedArrayObtainStyledAttributes, context2);
            int i12 = this.f231681j;
            int i13 = c43730aB.f413952b;
            if (z13 || z12) {
                AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(this.f231674c, i13, 0, 4, null);
                c5275a.f179264a = i12;
                aVarA = com.avito.android.lib.design.banner.a.a(aVarC, null, null, new AvitoLinearGradientDrawable(c5275a.a()), 0, 0, 0, 0, false, 0.0f, false, false, 8388427);
            } else {
                AvitoLinearGradientDrawable.a.C5275a c5275a2 = new AvitoLinearGradientDrawable.a.C5275a(this.f231674c, i13, 0, 4, null);
                c5275a2.f179264a = i12;
                aVarA = com.avito.android.lib.design.banner.a.a(aVarC, null, null, new AvitoLinearGradientDrawable(c5275a2.a()), 0, 0, 0, 0, false, 0.0f, false, false, 8388443);
            }
            banner.setStyle(aVarA);
            typedArrayObtainStyledAttributes.recycle();
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(C35835l0.j(C43731b.a(promoStyle), context), iArr);
            Banner banner2 = c43735f.f413961g;
            a.C5258a c5258a2 = com.avito.android.lib.design.banner.a.f178448x;
            Context context3 = banner2.getContext();
            c5258a2.getClass();
            com.avito.android.lib.design.banner.a aVarC2 = a.C5258a.c(typedArrayObtainStyledAttributes2, context3);
            banner2.setStyle((z13 || z12) ? com.avito.android.lib.design.banner.a.a(aVarC2, null, null, null, 0, 0, 0, 0, false, 0.0f, false, false, 8388427) : com.avito.android.lib.design.banner.a.a(aVarC2, null, null, null, 0, 0, 0, 0, false, 0.0f, false, false, 8388443));
            typedArrayObtainStyledAttributes2.recycle();
        }
    }

    @Override // com.avito.android.promo.movable.e
    public final void h20(@l MovableImage movableImage, boolean z12) {
        s.c cVar;
        Float offsetY;
        Float offsetX;
        Float offsetY2;
        Float offsetX2;
        ScaleType scaleType = movableImage != null ? movableImage.getScaleType() : null;
        switch (scaleType == null ? -1 : a.f231683b[scaleType.ordinal()]) {
            case 1:
                cVar = s.c.f340129a;
                break;
            case 2:
                cVar = s.c.f340132d;
                break;
            case 3:
                cVar = s.c.f340133e;
                break;
            case 4:
                cVar = s.c.f340134f;
                break;
            case 5:
                cVar = s.c.f340135g;
                break;
            case 6:
                cVar = s.c.f340136h;
                break;
            case 7:
                cVar = s.c.f340137i;
                break;
            case 8:
                cVar = s.c.f340137i;
                break;
            case 9:
                cVar = s.c.f340139k;
                break;
            default:
                cVar = null;
                break;
        }
        SimpleDraweeView simpleDraweeView = this.f231678g;
        SimpleDraweeView simpleDraweeView2 = this.f231677f;
        if (cVar != null) {
            GW0.a aVar = (GW0.a) simpleDraweeView2.getHierarchy();
            if (aVar != null) {
                aVar.n(cVar);
            }
            GW0.a aVar2 = (GW0.a) simpleDraweeView.getHierarchy();
            if (aVar2 != null) {
                aVar2.n(cVar);
            }
        } else if (z12) {
            s.c cVar2 = s.c.f340133e;
            GW0.a aVar3 = (GW0.a) simpleDraweeView2.getHierarchy();
            if (aVar3 != null) {
                aVar3.n(cVar2);
            }
            GW0.a aVar4 = (GW0.a) simpleDraweeView.getHierarchy();
            if (aVar4 != null) {
                aVar4.n(cVar2);
            }
        }
        UniversalImage image = movableImage != null ? movableImage.getImage() : null;
        Image imageDependsOnThemeOrDefault = image != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(image, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView2.getContext())) : null;
        if (imageDependsOnThemeOrDefault != null) {
            C35949t5.c(this.f231677f, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault), null, null, null, 14);
            C35949t5.c(this.f231678g, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault), null, null, null, 14);
            D6.H(simpleDraweeView2);
        } else {
            D6.w(simpleDraweeView2);
        }
        Position position = movableImage != null ? movableImage.getPosition() : null;
        simpleDraweeView2.setTranslationX(y6.a((position == null || (offsetX2 = position.getOffsetX()) == null) ? 0.0f : offsetX2.floatValue()));
        simpleDraweeView2.setTranslationY((z12 ? -1.0f : 1.0f) * y6.a((position == null || (offsetY2 = position.getOffsetY()) == null) ? 0.0f : offsetY2.floatValue()));
        simpleDraweeView.setTranslationX(y6.a((position == null || (offsetX = position.getOffsetX()) == null) ? 0.0f : offsetX.floatValue()));
        simpleDraweeView.setTranslationY((z12 ? -1.0f : 1.0f) * y6.a((position == null || (offsetY = position.getOffsetY()) == null) ? 0.0f : offsetY.floatValue()));
        PromoWidgetConfig config = movableImage != null ? movableImage.getConfig() : null;
        ConstraintLayout constraintLayout = this.f231680i;
        if (config != null) {
            D6.w(simpleDraweeView2);
            ViewGroup.LayoutParams layoutParams = simpleDraweeView2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.setMargins(((ViewGroup.MarginLayoutParams) bVar).leftMargin, y6.b(0), ((ViewGroup.MarginLayoutParams) bVar).rightMargin, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
            simpleDraweeView2.setLayoutParams(bVar);
            D6.H(constraintLayout);
            D6.H(simpleDraweeView);
        } else {
            D6.H(simpleDraweeView2);
            ViewGroup.LayoutParams layoutParams2 = simpleDraweeView2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            bVar2.setMargins(((ViewGroup.MarginLayoutParams) bVar2).leftMargin, z12 ? y6.b(20) : y6.b(0), ((ViewGroup.MarginLayoutParams) bVar2).rightMargin, ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin);
            simpleDraweeView2.setLayoutParams(bVar2);
            D6.w(simpleDraweeView);
            D6.w(constraintLayout);
        }
        ViewOutlineProvider viewOutlineProvider = ViewOutlineProvider.BACKGROUND;
        constraintLayout.setOutlineProvider(viewOutlineProvider);
        boolean zF2 = config != null ? L.f(config.getShouldCropImage(), Boolean.TRUE) : false;
        C43735f c43735f = this.f231673b;
        if (zF2) {
            c43735f.f413957c.setClipToOutline(true);
            c43735f.f413957c.setOutlineProvider(viewOutlineProvider);
        } else if (z12) {
            c43735f.f413957c.setClipToOutline(false);
            c43735f.f413957c.setOutlineProvider(viewOutlineProvider);
        }
        Guideline guideline = this.f231679h;
        ViewGroup.LayoutParams layoutParams3 = guideline.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
        if ((config != null ? config.getContainerWidth() : null) != null) {
            bVar3.f44185d = (100 - r13.intValue()) / 100;
        } else if (z12) {
            bVar3.f44185d = 0.64f;
        }
        guideline.setLayoutParams(bVar3);
        Placement placement = config != null ? config.getPlacement() : null;
        switch (placement != null ? a.f231682a[placement.ordinal()] : -1) {
            case 1:
            case 2:
                ViewGroup.LayoutParams layoutParams4 = simpleDraweeView.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar4 = (ConstraintLayout.b) layoutParams4;
                bVar4.f44160G = 0.0f;
                bVar4.f44159F = placement == Placement.TOP_RIGHT ? 1.0f : 0.0f;
                simpleDraweeView.setLayoutParams(bVar4);
                break;
            case 3:
            case 4:
                ViewGroup.LayoutParams layoutParams5 = simpleDraweeView.getLayoutParams();
                if (layoutParams5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar5 = (ConstraintLayout.b) layoutParams5;
                bVar5.f44160G = 0.5f;
                bVar5.f44159F = placement == Placement.CENTER_RIGHT ? 1.0f : 0.0f;
                simpleDraweeView.setLayoutParams(bVar5);
                break;
            case 5:
            case 6:
                ViewGroup.LayoutParams layoutParams6 = simpleDraweeView.getLayoutParams();
                if (layoutParams6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar6 = (ConstraintLayout.b) layoutParams6;
                bVar6.f44160G = 1.0f;
                bVar6.f44159F = placement == Placement.BOTTOM_RIGHT ? 1.0f : 0.0f;
                simpleDraweeView.setLayoutParams(bVar6);
                break;
            default:
                ViewGroup.LayoutParams layoutParams7 = simpleDraweeView.getLayoutParams();
                if (layoutParams7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar7 = (ConstraintLayout.b) layoutParams7;
                bVar7.f44160G = z12 ? 0.5f : 1.0f;
                bVar7.f44159F = 0.0f;
                simpleDraweeView.setLayoutParams(bVar7);
                break;
        }
        ViewGroup.LayoutParams layoutParams8 = constraintLayout.getLayoutParams();
        if (layoutParams8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar8 = (ConstraintLayout.b) layoutParams8;
        bVar8.f44197j = z12 ? 0 : R.id.promo_title;
        bVar8.f44203m = z12 ? 0 : R.id.promo_actions_container;
        constraintLayout.setLayoutParams(bVar8);
        ViewGroup.LayoutParams layoutParams9 = simpleDraweeView.getLayoutParams();
        if (layoutParams9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar9 = (ConstraintLayout.b) layoutParams9;
        Integer width = config != null ? config.getWidth() : null;
        if (width != null) {
            ((ViewGroup.MarginLayoutParams) bVar9).width = D6.j(c43735f.f413957c, width.intValue());
        } else if (z12) {
            ((ViewGroup.MarginLayoutParams) bVar9).width = 0;
        }
        Integer height = config != null ? config.getHeight() : null;
        if (height != null) {
            ((ViewGroup.MarginLayoutParams) bVar9).height = D6.j(c43735f.f413957c, height.intValue());
        } else if (z12) {
            ((ViewGroup.MarginLayoutParams) bVar9).height = 0;
        }
        simpleDraweeView.setLayoutParams(bVar9);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f231673b.getClass();
    }

    @Override // ld0.InterfaceC43734e
    public final void r6(@k String str) {
        this.f231673b.r6(str);
    }

    @Override // ld0.InterfaceC43734e
    public final void v8() {
        this.f231673b.v8();
    }
}
