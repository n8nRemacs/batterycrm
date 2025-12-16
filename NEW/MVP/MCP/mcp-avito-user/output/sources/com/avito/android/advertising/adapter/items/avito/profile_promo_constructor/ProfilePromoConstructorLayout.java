package com.avito.android.advertising.adapter.items.avito.profile_promo_constructor;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.generic.RoundingParams;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ProfilePromoConstructorLayout.kt */
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/profile_promo_constructor/ProfilePromoConstructorLayout;", "Landroid/view/ViewGroup;", "Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$MarkInfo;", "markInfo", "Lkotlin/G0;", "setMarkInfo", "(Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$MarkInfo;)V", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "setTitleView", "(Landroid/widget/TextView;)V", "titleView", "d", "getDescriptionView", "setDescriptionView", "descriptionView", "Lcom/avito/android/fresco/SimpleDraweeView;", "f", "Lcom/avito/android/fresco/SimpleDraweeView;", "getImageView", "()Lcom/avito/android/fresco/SimpleDraweeView;", "setImageView", "(Lcom/avito/android/fresco/SimpleDraweeView;)V", "imageView", "h", "getAdBadge", "setAdBadge", "adBadge", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProfilePromoConstructorLayout extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    @l
    public LinearLayout f87161b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public TextView titleView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public TextView descriptionView;

    /* renamed from: e, reason: collision with root package name */
    @l
    public FrameLayout f87164e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    public SimpleDraweeView imageView;

    /* renamed from: g, reason: collision with root package name */
    public boolean f87166g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    public TextView adBadge;

    /* renamed from: i, reason: collision with root package name */
    public int f87168i;

    /* renamed from: j, reason: collision with root package name */
    public final int f87169j;

    /* compiled from: ProfilePromoConstructorLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ProfilePromoConstructorImagePosition.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProfilePromoConstructorImagePosition profilePromoConstructorImagePosition = ProfilePromoConstructorImagePosition.f87157b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @j
    public ProfilePromoConstructorLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a(@k c cVar) throws Resources.NotFoundException {
        Space space;
        removeAllViews();
        this.f87168i = getContext().getResources().getDimensionPixelOffset(cVar.f87184c);
        int iD2 = C35835l0.d(cVar.f87186e, getContext());
        setBackgroundColor(iD2);
        ProfilePromoConstructorImagePosition profilePromoConstructorImagePosition = ProfilePromoConstructorImagePosition.f87157b;
        ProfilePromoConstructorImagePosition profilePromoConstructorImagePosition2 = cVar.f87183b;
        boolean z12 = profilePromoConstructorImagePosition2 == profilePromoConstructorImagePosition;
        int iB2 = y6.b(12);
        float dimension = getResources().getDimension(cVar.f87185d);
        this.f87166g = cVar.a();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), z12 ? 0 : iB2, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(cVar.a() ? y6.b(158) : -1, -1));
        boolean z13 = this.f87166g;
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(getContext(), null, 0, R.style.ProfilePromoTitle, 2, null);
        aVar.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        aVar.setEllipsize(truncateAt);
        aVar.setTextColor(aVar.getContext().getColor(R.color.common_black));
        aVar.setPadding(iB2, z12 ? y6.b(4) : 0, !z13 ? y6.b(32) : 0, y6.b(4));
        this.titleView = aVar;
        if (cVar.f87182a) {
            space = new Space(linearLayout.getContext());
            space.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        } else {
            space = null;
        }
        boolean zA2 = cVar.a();
        com.avito.android.lib.design.text_view.a aVar2 = new com.avito.android.lib.design.text_view.a(getContext(), null, 0, R.style.ProfilePromoConstructorDescription, 2, null);
        int i12 = 3;
        aVar2.setMaxLines(zA2 ? 4 : 3);
        aVar2.setEllipsize(truncateAt);
        aVar2.setTextColor(aVar2.getContext().getColor(R.color.common_black));
        aVar2.setPadding(iB2, aVar2.getPaddingTop(), iB2, zA2 ? y6.b(16) : iB2);
        this.descriptionView = aVar2;
        TextView textView = this.titleView;
        if (textView != null) {
            linearLayout.addView(textView);
        }
        if (space != null) {
            linearLayout.addView(space);
        }
        linearLayout.addView(this.descriptionView);
        this.f87161b = linearLayout;
        FrameLayout frameLayout = new FrameLayout(getContext());
        Context context = frameLayout.getContext();
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context, 0);
        simpleDraweeView.c(context, null);
        simpleDraweeView.d(context, null);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        simpleDraweeView.setScaleType(scaleType);
        simpleDraweeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        GW0.b bVar = new GW0.b(simpleDraweeView.getResources());
        bVar.f6552q = RoundingParams.b(4.0f + dimension);
        simpleDraweeView.setHierarchy(bVar.a());
        this.imageView = simpleDraweeView;
        frameLayout.addView(simpleDraweeView);
        int i13 = cVar.a() ? cVar.f87188g : cVar.f87187f;
        ImageView imageView = new ImageView(frameLayout.getContext());
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i13);
        imageView.setImageTintList(ColorStateList.valueOf(iD2));
        int i14 = cVar.a() ? -2 : -1;
        int i15 = cVar.a() ? -1 : -2;
        int iOrdinal = profilePromoConstructorImagePosition2.ordinal();
        if (iOrdinal == 0) {
            i12 = 80;
        } else if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        imageView.setLayoutParams(new FrameLayout.LayoutParams(i14, i15, i12));
        frameLayout.addView(imageView);
        this.f87164e = frameLayout;
        if (cVar.a()) {
            FrameLayout frameLayout2 = this.f87164e;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(y6.b(154), -1, 5));
            }
            addView(this.f87164e);
        } else {
            FrameLayout frameLayout3 = this.f87164e;
            if (frameLayout3 != null) {
                frameLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
            }
            LinearLayout linearLayout2 = this.f87161b;
            if (linearLayout2 != null) {
                linearLayout2.addView(this.f87164e, 0);
            }
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setStroke(y6.b(1), iD2);
        setForeground(gradientDrawable);
        addView(this.f87161b);
    }

    @l
    public final TextView getAdBadge() {
        return this.adBadge;
    }

    @l
    public final TextView getDescriptionView() {
        return this.descriptionView;
    }

    @l
    public final SimpleDraweeView getImageView() {
        return this.imageView;
    }

    @l
    public final TextView getTitleView() {
        return this.titleView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            FrameLayout.LayoutParams layoutParams = marginLayoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) marginLayoutParams : null;
            Integer numValueOf = layoutParams != null ? Integer.valueOf(layoutParams.gravity) : null;
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i17 = marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0;
            if (numValueOf != null && (numValueOf.intValue() | 5) == 5) {
                int measuredWidth = getMeasuredWidth() - childAt.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                i17 = measuredWidth - (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0);
            }
            ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            int i18 = marginLayoutParams4 != null ? marginLayoutParams4.topMargin : 0;
            int measuredWidth2 = childAt.getMeasuredWidth() + i17;
            ViewGroup.LayoutParams layoutParams5 = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
            childAt.layout(i17, i18, measuredWidth2, childAt.getMeasuredHeight() + (marginLayoutParams5 != null ? marginLayoutParams5.topMargin : 0));
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        if (size == 0) {
            size = getMeasuredWidth();
        }
        if (size2 == 0) {
            size2 = getMeasuredHeight();
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int i15 = marginLayoutParams.width;
            int iMakeMeasureSpec = i15 == -1 ? View.MeasureSpec.makeMeasureSpec(size, 1073741824) : i15 == -2 ? View.MeasureSpec.makeMeasureSpec(size, BeduinInputModel.MIN_TEXT_VERSION) : View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
            int i16 = marginLayoutParams.height;
            childAt.measure(iMakeMeasureSpec, i16 == -1 ? View.MeasureSpec.makeMeasureSpec(size2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
        }
        super.onMeasure(i12, i13);
    }

    public final void setAdBadge(@l TextView textView) {
        this.adBadge = textView;
    }

    public final void setDescriptionView(@l TextView textView) {
        this.descriptionView = textView;
    }

    public final void setImageView(@l SimpleDraweeView simpleDraweeView) {
        this.imageView = simpleDraweeView;
    }

    public final void setMarkInfo(@l AvitoNetworkBanner.MarkInfo markInfo) {
        LinearLayout linearLayout;
        if (this.f87166g && (linearLayout = this.f87161b) != null) {
            linearLayout.setPadding(linearLayout.getPaddingLeft(), y6.b(12), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        }
        if (this.adBadge == null && markInfo != null) {
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(getContext(), R.style.Theme_DesignSystem_Re23);
            com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(dVar, null, 0, 0, 14, null);
            aVar.setId(R.id.ad_more_button);
            aVar.setTextAppearance(R.style.Widget_Avito_TextView_Ad_Badge);
            aVar.setEllipsize(TextUtils.TruncateAt.END);
            aVar.setGravity(16);
            aVar.setBackgroundResource(R.drawable.ad_badge_bg);
            aVar.setTextColor(dVar.getColor(R.color.ad_badge_redesign_text));
            aVar.setPadding(aVar.getResources().getDimensionPixelOffset(R.dimen.ad_badges_redesign_padding_left), aVar.getPaddingTop(), aVar.getResources().getDimensionPixelOffset(R.dimen.ad_badges_redesign_padding_right), y6.b(1));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, this.f87169j);
            layoutParams.gravity = 5;
            aVar.setLayoutParams(layoutParams);
            addView(aVar);
            ViewGroup.LayoutParams layoutParams2 = aVar.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                int i12 = this.f87168i;
                marginLayoutParams.rightMargin = i12;
                marginLayoutParams.topMargin = i12;
            }
            this.adBadge = aVar;
        }
        TextView textView = this.adBadge;
        if (textView != null) {
            I5.a(textView, markInfo != null ? com.avito.android.advertising.ui.h.d(com.avito.android.advertising.ui.h.f88704a, getResources(), null, null, 14) : null, false);
        }
    }

    public final void setTitleView(@l TextView textView) {
        this.titleView = textView;
    }

    public ProfilePromoConstructorLayout(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f87168i = context.getResources().getDimensionPixelOffset(R.dimen.ad_badges_margin);
        this.f87169j = context.getResources().getDimensionPixelOffset(R.dimen.ad_badges_height);
    }
}
