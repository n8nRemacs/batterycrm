package com.avito.android.visual_rubricator.element;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.V0;
import com.avito.android.util.y6;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: VisualRubricatorWidgetElementViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/visual_rubricator/element/l;", "Lcom/avito/android/visual_rubricator/element/k;", "Lcom/avito/konveyor/adapter/b;", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f327402b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ViewGroup f327403c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f327404d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f327405e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f327406f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ShimmerFrameLayout f327407g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final TextView f327408h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final LinearLayout f327409i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final View f327410j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final View f327411k;

    /* compiled from: VisualRubricatorWidgetElementViewImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f327412a;

        static {
            int[] iArr = new int[VisualRubricatorWidgetElementLayout.values().length];
            try {
                iArr[VisualRubricatorWidgetElementLayout.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VisualRubricatorWidgetElementLayout.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VisualRubricatorWidgetElementLayout.CHIPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f327412a = iArr;
        }
    }

    public l(@Y61.k View view) {
        super(view);
        this.f327402b = view;
        this.f327403c = (ViewGroup) view.findViewById(R.id.rubric_root);
        View viewFindViewById = view.findViewById(R.id.category_tile_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        viewGroup.setClipToOutline(true);
        this.f327404d = viewGroup;
        View viewFindViewById2 = view.findViewById(R.id.category_name);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f327405e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.category_icon);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById3;
        this.f327406f = simpleDraweeView;
        View viewFindViewById4 = view.findViewById(R.id.category_skeleton);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout");
        }
        this.f327407g = (ShimmerFrameLayout) viewFindViewById4;
        this.f327408h = (TextView) view.findViewById(R.id.category_badge);
        this.f327409i = (LinearLayout) view.findViewById(R.id.category_all_background);
        this.f327410j = view.findViewById(R.id.category_all_stack_0);
        this.f327411k = view.findViewById(R.id.category_all_stack_1);
        simpleDraweeView.getHierarchy().s(RoundingParams.b(24.0f));
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void AG() {
        View view = this.f327410j;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f327411k;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        O30(this.f327404d.getResources().getDimensionPixelSize(R.dimen.bx_content_widget_visual_rubricator_vertical_rubricator_tile_height));
        View view3 = this.f327402b;
        int iJ2 = C35835l0.j(R.attr.textS2, view3.getContext());
        TextView textView = this.f327405e;
        textView.setTextAppearance(iJ2);
        textView.setGravity(8388611);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = 8388659;
        }
        textView.setLayoutParams(layoutParams);
        D6.c(textView, Integer.valueOf(view3.getContext().getResources().getDimensionPixelOffset(R.dimen.bx_content_widget_visual_rubricator_item_text_margin_start_redesigned)), Integer.valueOf(view3.getContext().getResources().getDimensionPixelOffset(R.dimen.bx_content_widget_visual_rubricator_item_text_margin_top_redesigned)), Integer.valueOf(view3.getContext().getResources().getDimensionPixelOffset(R.dimen.bx_content_widget_visual_rubricator_item_text_margin_end_redesigned)), null, 8);
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void AK(@InterfaceC42150f int i12, @InterfaceC42150f @Y61.l Integer num, @Y61.k String str) throws Resources.NotFoundException {
        this.f327405e.setText(B80(C35835l0.d(i12, this.itemView.getContext()), num, str));
    }

    public final CharSequence B80(@InterfaceC42156l int i12, @InterfaceC42150f Integer num, String str) throws Resources.NotFoundException {
        Drawable drawableN;
        if (num == null || (drawableN = C35835l0.n(this.itemView.getContext(), num.intValue(), i12)) == null) {
            return str;
        }
        int dimensionPixelOffset = this.itemView.getResources().getDimensionPixelOffset(R.dimen.bx_content_widget_visual_rubricator_all_categories_arrow_offset);
        drawableN.setBounds(-dimensionPixelOffset, 0, drawableN.getIntrinsicWidth() - dimensionPixelOffset, drawableN.getIntrinsicHeight());
        String str2 = str + "  ";
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new ImageSpan(drawableN, 0), str2.length() - 1, str2.length(), 33);
        return spannableString;
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void BY(int i12) {
        try {
            C80(C35835l0.d(i12, this.f327402b.getContext()));
        } catch (Resources.NotFoundException unused) {
            C80(i12);
        }
    }

    public final void C80(@InterfaceC42156l int i12) {
        float fB2 = com.avito.android.authorization.auto_recovery.phone_confirm.b.b(this.f327402b, R.dimen.bx_content_widget_visual_rubricator_category_corner_radius);
        float[] fArr = new float[8];
        for (int i13 = 0; i13 < 8; i13++) {
            fArr[i13] = fB2;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        V0.a(shapeDrawable, i12);
        this.f327404d.setBackground(shapeDrawable);
        LinearLayout linearLayout = this.f327409i;
        if (linearLayout != null) {
            linearLayout.setBackground(shapeDrawable);
        }
        View view = this.f327410j;
        if (view != null) {
            view.setBackground(shapeDrawable);
        }
        View view2 = this.f327411k;
        if (view2 != null) {
            view2.setBackground(shapeDrawable);
        }
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void D5(@Y61.k UniversalColor universalColor) {
        this.f327405e.setTextColor(C48063a.f437606a.a(this.f327402b.getContext(), universalColor));
    }

    public final void D80(@Y61.l Integer num) {
        ViewGroup.LayoutParams layoutParams;
        this.f327406f.getHierarchy().s(RoundingParams.b(32.0f));
        View view = this.f327402b;
        LinearLayout linearLayout = this.f327409i;
        if (linearLayout == null || (layoutParams = linearLayout.getLayoutParams()) == null) {
            layoutParams = view.getLayoutParams();
        }
        layoutParams.height = num.intValue();
        if ((linearLayout != null ? linearLayout.getLayoutParams() : null) != null) {
            linearLayout.setLayoutParams(layoutParams);
        } else {
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void EX(@Y61.k String str, @Y61.l String str2) {
        if (str2 != null) {
            str = str2;
        }
        this.f327405e.setText(str);
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void Ig(@Y61.k UniversalColor universalColor) {
        C80(C48063a.f437606a.a(this.f327402b.getContext(), universalColor));
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void LO(@Y61.l CategoryBadge categoryBadge) {
        TextView textView = this.f327408h;
        if (textView != null) {
            if (categoryBadge == null) {
                D6.w(textView);
                return;
            }
            Context context = textView.getContext();
            C48063a c48063a = C48063a.f437606a;
            c48063a.getClass();
            textView.setBackgroundTintList(C48063a.e(context, categoryBadge.f327357c));
            textView.setTextColor(c48063a.a(textView.getContext(), categoryBadge.f327358d));
            I5.a(textView, categoryBadge.f327356b, false);
        }
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void O30(@U int i12) {
        ViewGroup viewGroup = this.f327403c;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = i12;
            viewGroup.setLayoutParams(layoutParams);
        }
        ViewGroup viewGroup2 = this.f327404d;
        ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = i12;
        viewGroup2.setLayoutParams(layoutParams2);
        LinearLayout linearLayout = this.f327409i;
        if (linearLayout != null) {
            linearLayout.setGravity(8388659);
            ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.height = i12;
            linearLayout.setLayoutParams(layoutParams4);
        }
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void Sy() {
        View view = this.f327402b;
        ImageView imageView = new ImageView(view.getContext());
        C35821j2.a(imageView, C35835l0.m(view.getContext(), R.attr.ic_arrowForward16, R.attr.black));
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.f327404d.addView(imageView);
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void ad(@InterfaceC42165v int i12) {
        ViewGroup viewGroup = this.f327403c;
        if (viewGroup != null) {
            viewGroup.setForeground(D6.u(this.itemView, R.drawable.bx_content_widget_visual_rubricator_rich_item_ripple_fg_r_16));
        } else {
            this.f327404d.setForeground(D6.u(this.itemView, R.drawable.bx_content_widget_visual_rubricator_rich_item_ripple_fg_r_16));
        }
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void i(@Y61.k UniversalImage universalImage) {
        Image imageQ = com.avito.android.actions_sheet.a.q(this.f327402b, universalImage);
        ImageRequest.a aVarA = C35949t5.a(this.f327406f);
        aVarA.d(com.avito.android.image_loader.b.b(imageQ));
        aVarA.f169499q = ImageRequest.CacheChoice.f169468b;
        aVarA.f169491i = true;
        aVarA.c();
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void kU() {
        View view = this.f327402b;
        ImageView imageView = new ImageView(view.getContext());
        C35821j2.a(imageView, C35835l0.m(view.getContext(), R.attr.ic_arrowForward16, R.attr.black));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 81);
        layoutParams.bottomMargin = y6.b(8);
        imageView.setLayoutParams(layoutParams);
        this.f327404d.addView(imageView);
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void lA(@InterfaceC42150f int i12) {
        this.f327405e.setTextColor(C35835l0.d(i12, this.f327402b.getContext()));
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void s3() {
        ShimmerFrameLayout shimmerFrameLayout = this.f327407g;
        D6.H(shimmerFrameLayout);
        shimmerFrameLayout.b();
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void setOnClickListener(@Y61.k View.OnClickListener onClickListener) {
        this.f327402b.setOnClickListener(onClickListener);
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void tc() {
        D6.w(this.f327407g);
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void xY(@Y61.k String str, @InterfaceC42150f @Y61.l Integer num, @Y61.k UniversalColor universalColor) throws Resources.NotFoundException {
        this.f327405e.setText(B80(C48063a.f437606a.a(this.itemView.getContext(), universalColor), num, str));
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void yY(@Y61.k com.avito.android.visual_rubricator.element.a aVar) {
        this.f327406f.getHierarchy().n(aVar);
    }
}
