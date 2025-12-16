package com.avito.android.lib.design.tooltip;

import KV.a;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.avito.android.R;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.design.tooltip.state.TooltipState;
import com.avito.android.util.A6;
import com.avito.android.util.C35835l0;
import java.util.Arrays;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Tooltip.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/tooltip/k;", "Landroid/widget/PopupWindow;", "LLV/a;", "Lcom/avito/android/lib/design/tooltip/state/TooltipState;", "LKV/a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class k extends PopupWindow implements LV.a<TooltipState, KV.a> {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f181215q = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f181216b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public TooltipState f181217c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public View f181218d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public o f181219e;

    /* renamed from: f, reason: collision with root package name */
    public final int f181220f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public com.avito.android.inline_filters.dialog.group.item.double_input.e f181221g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public View f181222h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.safedeal.trust_factors.k f181223i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public q f181224j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f181225k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public j f181226l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public int[] f181227m;

    /* renamed from: n, reason: collision with root package name */
    public int f181228n;

    /* renamed from: o, reason: collision with root package name */
    public int f181229o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public Long f181230p;

    /* compiled from: Tooltip.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TooltipState.State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TooltipState.State state = TooltipState.State.f181285b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public /* synthetic */ k(Context context, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? R.attr.tooltip : i12, (i14 & 4) != 0 ? R.style.Design_Widget_Tooltip : i13);
    }

    public final Rect a(View view) {
        n nVar = (n) super.getContentView();
        KV.a style$_design_modules_components = nVar.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String();
        if (style$_design_modules_components != null) {
            this.f181224j.e(style$_design_modules_components);
        }
        setAnimationStyle(this.f181224j.f181262c);
        nVar.setAnchorView(view);
        nVar.setShowTail$_design_modules_components(this.f181225k);
        nVar.setTooltipPosition(this.f181224j);
        nVar.setLayoutParams(new FrameLayout.LayoutParams(this.f181228n, this.f181229o));
        q qVar = this.f181224j;
        qVar.f181264e = false;
        Rect rectG = qVar.g(view, nVar);
        ViewGroup.LayoutParams layoutParams = nVar.getLayoutParams();
        layoutParams.width = rectG.width();
        layoutParams.height = rectG.height();
        setWidth(rectG.width());
        setHeight(rectG.height());
        return rectG;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@Y61.k com.avito.android.lib.design.tooltip.state.TooltipState r11) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.tooltip.k.b(com.avito.android.lib.design.tooltip.state.TooltipState):void");
    }

    public final void c(@Y61.k KV.a aVar) {
        View view;
        int iIntValue;
        View contentView = super.getContentView();
        n nVar = contentView instanceof n ? (n) contentView : null;
        KV.a style$_design_modules_components = nVar != null ? nVar.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String() : null;
        if (new com.avito.android.lib.util.c(aVar, style$_design_modules_components).f181333c) {
            return;
        }
        Integer numValueOf = Integer.valueOf(aVar.f9465a);
        if (!new com.avito.android.lib.util.c(numValueOf, style$_design_modules_components != null ? Integer.valueOf(style$_design_modules_components.f9465a) : null).f181333c) {
            int iIntValue2 = numValueOf.intValue();
            this.f181228n = iIntValue2;
            setWidth(iIntValue2);
        }
        Integer numValueOf2 = Integer.valueOf(aVar.f9466b);
        if (!new com.avito.android.lib.util.c(numValueOf2, style$_design_modules_components != null ? Integer.valueOf(style$_design_modules_components.f9466b) : null).f181333c) {
            int iIntValue3 = numValueOf2.intValue();
            this.f181229o = iIntValue3;
            setHeight(iIntValue3);
        }
        Integer num = style$_design_modules_components != null ? style$_design_modules_components.f9472h : null;
        Integer num2 = aVar.f9472h;
        if (!new com.avito.android.lib.util.c(num2, num).f181333c && num2 != null && (iIntValue = num2.intValue()) > 0) {
            View viewInflate = LayoutInflater.from(this.f181216b).inflate(iIntValue, (ViewGroup) super.getContentView(), false);
            this.f181218d = viewInflate;
            setContentView(viewInflate);
        }
        a.b bVar = style$_design_modules_components != null ? style$_design_modules_components.f9473i : null;
        a.b bVar2 = aVar.f9473i;
        if (!new com.avito.android.lib.util.c(bVar2, bVar).f181333c && bVar2 != null) {
            if (this.f181219e == null && (view = this.f181218d) != null) {
                this.f181219e = new o(view);
            }
            o oVar = this.f181219e;
            if (oVar != null) {
                oVar.g(bVar2);
            }
        }
        if (nVar != null) {
            nVar.setStyle(aVar);
        }
    }

    @Y61.k
    public final void d(@Y61.l View.OnClickListener onClickListener) {
        View contentView = super.getContentView();
        if (contentView != null) {
            if (onClickListener == null) {
                onClickListener = this.f181223i;
            }
            contentView.setOnClickListener(onClickListener);
        }
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f181222h;
        j jVar = this.f181226l;
        if (jVar != null && view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(jVar);
        }
        this.f181226l = null;
        super.dismiss();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.avito.android.lib.design.tooltip.j] */
    @Y61.k
    @InterfaceC42830m
    public final void e(@Y61.k final View view) {
        dismiss();
        this.f181222h = view;
        view.getLocationOnScreen(this.f181227m);
        this.f181226l = new ViewTreeObserver.OnPreDrawListener() { // from class: com.avito.android.lib.design.tooltip.j
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                int i12 = k.f181215q;
                int[] iArr = new int[2];
                View view2 = view;
                view2.getLocationOnScreen(iArr);
                k kVar = this;
                if (Arrays.equals(kVar.f181227m, iArr)) {
                    return true;
                }
                kVar.f181227m = iArr;
                Rect rectA = kVar.a(view2);
                kVar.update(rectA.left, rectA.top, -1, -1);
                return true;
            }
        };
        A6.a(view.getViewTreeObserver(), new m(this));
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new l(view, this));
        } else {
            Rect rectA = a(view);
            showAtLocation(view, 8388659, rectA.left, rectA.top);
            Long l12 = this.f181230p;
            if (l12 != null) {
                long jLongValue = l12.longValue();
                View view2 = this.f181218d;
                if (view2 != null) {
                    com.avito.android.inline_filters.dialog.group.item.double_input.e eVar = new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 10);
                    this.f181221g = eVar;
                    view2.postDelayed(eVar, jLongValue);
                }
            }
        }
        view.requestLayout();
    }

    @Y61.l
    public final k f(@Y61.k View view) {
        Activity activityA = C35835l0.a(this.f181216b);
        if (activityA == null || activityA.isFinishing()) {
            return null;
        }
        e(view);
        return this;
    }

    public final void g(int i12, int i13) {
        int[] iArr = new int[2];
        ((n) super.getContentView()).getLocationOnScreen(iArr);
        update(iArr[0] + i12, iArr[1] + i13, -1, -1);
    }

    @Override // android.widget.PopupWindow
    @Y61.l
    public final View getContentView() {
        return this.f181218d;
    }

    @Override // android.widget.PopupWindow
    public final void setContentView(@Y61.l View view) {
        View contentView = super.getContentView();
        ViewGroup viewGroup = contentView instanceof ViewGroup ? (ViewGroup) contentView : null;
        if (viewGroup == null) {
            super.setContentView(view);
            return;
        }
        viewGroup.removeAllViews();
        this.f181218d = view;
        if (view != null) {
            viewGroup.addView(view);
        }
    }

    public k(@Y61.k Context context, int i12, int i13) {
        KV.a style$_design_modules_components;
        Integer num;
        KV.a style$_design_modules_components2;
        Integer num2;
        KV.a style$_design_modules_components3;
        KV.a style$_design_modules_components4;
        super(new n(context, null, i12, i13));
        this.f181216b = context;
        com.avito.android.advert.item.safedeal.trust_factors.k kVar = new com.avito.android.advert.item.safedeal.trust_factors.k(this, 6);
        this.f181223i = kVar;
        this.f181224j = new r.d(new i.b(new b.a()));
        this.f181225k = true;
        this.f181227m = new int[2];
        int i14 = -2;
        this.f181228n = -2;
        this.f181229o = -2;
        View contentView = super.getContentView();
        n nVar = contentView instanceof n ? (n) contentView : null;
        setBackgroundDrawable(new ColorDrawable(0));
        this.f181228n = (nVar == null || (style$_design_modules_components4 = nVar.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String()) == null) ? -2 : style$_design_modules_components4.f9465a;
        if (nVar != null && (style$_design_modules_components3 = nVar.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String()) != null) {
            i14 = style$_design_modules_components3.f9466b;
        }
        this.f181229o = i14;
        setWidth(this.f181228n);
        setHeight(this.f181229o);
        int iIntValue = (nVar == null || (style$_design_modules_components2 = nVar.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String()) == null || (num2 = style$_design_modules_components2.f9471g) == null) ? this.f181220f : num2.intValue();
        this.f181220f = iIntValue;
        int iIntValue2 = (nVar == null || (style$_design_modules_components = nVar.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String()) == null || (num = style$_design_modules_components.f9472h) == null) ? 0 : num.intValue();
        if (iIntValue2 > 0) {
            View viewInflate = LayoutInflater.from(new ContextThemeWrapper(context, iIntValue)).inflate(iIntValue2, (ViewGroup) super.getContentView(), false);
            this.f181218d = viewInflate;
            setContentView(viewInflate);
        }
        setOutsideTouchable(true);
        View contentView2 = super.getContentView();
        if (contentView2 != null) {
            contentView2.setOnClickListener(kVar);
        }
    }
}
