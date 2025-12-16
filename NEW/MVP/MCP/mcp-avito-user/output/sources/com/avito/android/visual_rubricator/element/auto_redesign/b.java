package com.avito.android.visual_rubricator.element.auto_redesign;

import Y61.l;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.visual_rubricator.element.CategoryBadge;
import com.avito.android.visual_rubricator.element.k;
import com.facebook.drawee.view.SimpleDraweeView;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: RedesignVisualRubricatorWidgetElementViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/visual_rubricator/element/auto_redesign/b;", "Lcom/avito/android/visual_rubricator/element/k;", "Lcom/avito/konveyor/adapter/b;", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f327385b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ViewGroup f327386c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f327387d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f327388e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f327389f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ShimmerFrameLayout f327390g;

    public b(@Y61.k View view) {
        super(view);
        this.f327385b = view;
        this.f327386c = (ViewGroup) view.findViewById(R.id.rubric_root);
        View viewFindViewById = view.findViewById(R.id.category_tile_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        viewGroup.setClipToOutline(true);
        this.f327387d = viewGroup;
        View viewFindViewById2 = view.findViewById(R.id.category_name);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f327388e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.category_icon);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f327389f = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.category_skeleton);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout");
        }
        this.f327390g = (ShimmerFrameLayout) viewFindViewById4;
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void AK(int i12, @l Integer num, @Y61.k String str) throws Resources.NotFoundException {
        this.f327388e.setText(B80(C35835l0.d(i12, this.itemView.getContext()), num, str));
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
    public final void D5(@Y61.k UniversalColor universalColor) {
        this.f327388e.setTextColor(C48063a.f437606a.a(this.f327385b.getContext(), universalColor));
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void EX(@Y61.k String str, @l String str2) {
        if (str2 != null) {
            str = str2;
        }
        this.f327388e.setText(str);
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void Ig(@Y61.k UniversalColor universalColor) {
        C48063a.f437606a.a(this.f327385b.getContext(), universalColor);
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void O30(int i12) {
        ViewGroup viewGroup = this.f327386c;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = i12;
            viewGroup.setLayoutParams(layoutParams);
        }
        ViewGroup viewGroup2 = this.f327387d;
        ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = i12;
        viewGroup2.setLayoutParams(layoutParams2);
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void ad(int i12) {
        ViewGroup viewGroup = this.f327386c;
        if (viewGroup != null) {
            viewGroup.setForeground(D6.u(this.itemView, R.drawable.bx_content_widget_visual_rubricator_rich_item_ripple_fg_r_16));
        } else {
            this.f327387d.setForeground(D6.u(this.itemView, R.drawable.bx_content_widget_visual_rubricator_rich_item_ripple_fg_r_16));
        }
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void i(@Y61.k UniversalImage universalImage) {
        Image imageQ = com.avito.android.actions_sheet.a.q(this.f327385b, universalImage);
        ImageRequest.a aVarA = C35949t5.a(this.f327389f);
        aVarA.d(com.avito.android.image_loader.b.b(imageQ));
        aVarA.f169499q = ImageRequest.CacheChoice.f169468b;
        aVarA.f169491i = true;
        aVarA.c();
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void lA(int i12) {
        this.f327388e.setTextColor(C35835l0.d(i12, this.f327385b.getContext()));
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void s3() {
        ShimmerFrameLayout shimmerFrameLayout = this.f327390g;
        D6.H(shimmerFrameLayout);
        shimmerFrameLayout.b();
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void setOnClickListener(@Y61.k View.OnClickListener onClickListener) {
        this.f327385b.setOnClickListener(onClickListener);
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void tc() {
        D6.w(this.f327390g);
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void xY(@Y61.k String str, @l Integer num, @Y61.k UniversalColor universalColor) throws Resources.NotFoundException {
        this.f327388e.setText(B80(C48063a.f437606a.a(this.itemView.getContext(), universalColor), num, str));
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void yY(@Y61.k com.avito.android.visual_rubricator.element.a aVar) {
        this.f327389f.getHierarchy().n(aVar);
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void AG() {
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void Sy() {
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void kU() {
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void BY(int i12) {
    }

    @Override // com.avito.android.visual_rubricator.element.k
    public final void LO(@l CategoryBadge categoryBadge) {
    }
}
