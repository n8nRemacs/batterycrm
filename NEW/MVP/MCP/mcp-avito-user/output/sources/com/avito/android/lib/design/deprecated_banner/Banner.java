package com.avito.android.lib.design.deprecated_banner;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.design.State;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.close_button.CloseButton;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.google.android.material.shape.q;
import gw.InterfaceC40743a;
import hw.InterfaceC41179d;
import j.InterfaceC42150f;
import j.f0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import pK0.InterfaceC46971a;
import wK0.AbstractC49528c;

/* compiled from: Banner.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001+J\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/avito/android/lib/design/deprecated_banner/Banner;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "LpK0/a;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "", "visible", "setCloseButtonVisible", "(Z)V", "Landroid/view/View$OnClickListener;", "listener", "setCloseButtonListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/graphics/drawable/Drawable;", "image", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/widget/ImageView$ScaleType;", "scaleType", "setImageScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "Landroid/view/View;", "<set-?>", "u", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "contentView", "LXU/a;", "v", "LXU/a;", "getContent", "()LXU/a;", "content", "Lgw/a;", "w", "Lgw/a;", "getImageContainer", "()Lgw/a;", "imageContainer", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
@InterfaceC42830m
/* loaded from: classes14.dex */
public final class Banner extends LinearLayoutCompat implements InterfaceC46971a {

    /* renamed from: q, reason: collision with root package name */
    @l
    public ViewGroup f179008q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public View f179009r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public ImageView f179010s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public CloseButton f179011t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @l
    public View contentView;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @k
    public final XU.a content;

    /* renamed from: w, reason: collision with root package name */
    @k
    public final a f179014w;

    @j
    public Banner(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public static void n(Banner banner, TypedArray typedArray) throws Resources.NotFoundException {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int dimensionPixelSize4;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        ViewGroup viewGroup = banner.f179008q;
        if (viewGroup == null) {
            throw new IllegalStateException("DeprecatedBanner hasn't been initialized yet");
        }
        banner.setBackground(AbstractC49528c.a.b(AbstractC49528c.f441377b, q.a(banner.getContext(), typedArray.getResourceId(4, 0), 0).a(), 0, 0, 0, 0, x.a(typedArray, banner.getContext(), 2), x.a(typedArray, banner.getContext(), 3), null, null, 414));
        if (typedArray.hasValue(10)) {
            dimensionPixelSize = typedArray.getDimensionPixelSize(10, 0);
            dimensionPixelSize2 = dimensionPixelSize;
            dimensionPixelSize3 = dimensionPixelSize2;
            dimensionPixelSize4 = dimensionPixelSize3;
        } else {
            dimensionPixelSize = typedArray.getDimensionPixelSize(12, 0);
            dimensionPixelSize2 = typedArray.getDimensionPixelSize(14, 0);
            dimensionPixelSize3 = typedArray.getDimensionPixelSize(13, 0);
            dimensionPixelSize4 = typedArray.getDimensionPixelSize(11, 0);
        }
        viewGroup.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        CloseButton closeButton = banner.f179011t;
        if (closeButton != null) {
            closeButton.setAppearance(typedArray.getResourceId(7, 0));
        }
        View viewInflate = LayoutInflater.from(new ContextThemeWrapper(banner.getContext(), typedArray.getResourceId(15, 0))).inflate(typedArray.getResourceId(9, 0), viewGroup, false);
        banner.contentView = viewInflate;
        XU.a aVar = banner.content;
        aVar.f18894e = null;
        aVar.f18895f = null;
        aVar.f18896g = null;
        if (viewInflate != null) {
            aVar.f18894e = (TextView) viewInflate.findViewById(R.id.title);
            aVar.f18895f = (TextView) viewInflate.findViewById(R.id.body);
            aVar.f18896g = (Button) viewInflate.findViewById(R.id.button);
            TextView textView = aVar.f18894e;
            if (textView != null) {
                D6.w(textView);
            }
            TextView textView2 = aVar.f18895f;
            if (textView2 != null) {
                D6.w(textView2);
            }
            Button button = aVar.f18896g;
            if (button != null) {
                D6.w(button);
            }
            String str = aVar.f18890a;
            aVar.f18890a = str;
            TextView textView3 = aVar.f18894e;
            if (textView3 != null) {
                I5.a(textView3, str, false);
            }
            String str2 = aVar.f18891b;
            aVar.f18891b = str2;
            TextView textView4 = aVar.f18895f;
            if (textView4 != null) {
                I5.a(textView4, str2, false);
            }
            aVar.a(aVar.f18892c, aVar.f18893d);
        }
        viewGroup.removeAllViews();
        viewGroup.addView(banner.contentView, 0);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(20, 0);
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(18, 0);
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(19, 0);
        ImageView imageView6 = banner.f179010s;
        ViewGroup.LayoutParams layoutParams = imageView6 != null ? imageView6.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i12 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ImageView imageView7 = banner.f179010s;
        ViewGroup.LayoutParams layoutParams2 = imageView7 != null ? imageView7.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = dimensionPixelOffset;
            marginLayoutParams2.bottomMargin = dimensionPixelOffset2;
            marginLayoutParams2.leftMargin = i12;
            marginLayoutParams2.rightMargin = dimensionPixelOffset3;
        }
        banner.setImageDrawable(typedArray.getDrawable(16));
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(17, 0);
        View view = banner.f179009r;
        ViewGroup.LayoutParams layoutParams3 = view != null ? view.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.leftMargin = dimensionPixelOffset4;
        }
        TypedArray typedArrayObtainStyledAttributes = banner.getContext().obtainStyledAttributes(typedArray.getResourceId(21, 0), d.n.f178990r);
        if (typedArrayObtainStyledAttributes.hasValue(6) && (imageView5 = banner.f179010s) != null) {
            imageView5.setMinimumWidth(typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(7) && (imageView4 = banner.f179010s) != null) {
            imageView4.setMinimumHeight(typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4) && (imageView3 = banner.f179010s) != null) {
            imageView3.setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5) && (imageView2 = banner.f179010s) != null) {
            imageView2.setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            ImageView imageView8 = banner.f179010s;
            ViewGroup.LayoutParams layoutParams4 = imageView8 != null ? imageView8.getLayoutParams() : null;
            if (layoutParams4 != null) {
                layoutParams4.width = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ImageView imageView9 = banner.f179010s;
            ViewGroup.LayoutParams layoutParams5 = imageView9 != null ? imageView9.getLayoutParams() : null;
            if (layoutParams5 != null) {
                layoutParams5.height = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(3) && (imageView = banner.f179010s) != null) {
            imageView.setAdjustViewBounds(typedArrayObtainStyledAttributes.getBoolean(3, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int i13 = typedArrayObtainStyledAttributes.getInt(2, 0);
            ImageView imageView10 = banner.f179010s;
            if (imageView10 != null) {
                imageView10.setScaleType(ImageView.ScaleType.values()[i13]);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(@l View view, int i12, @l ViewGroup.LayoutParams layoutParams) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.container) {
            this.f179008q = (ViewGroup) view;
        } else {
            if (numValueOf == null || numValueOf.intValue() != R.id.image_container) {
                throw new UnsupportedOperationException("Operation addView isn't supported. You should use setContentByRes");
            }
            this.f179009r = view;
            ImageView imageView = (ImageView) view.findViewById(R.id.image);
            this.f179010s = imageView;
            this.f179014w.f179016c = imageView;
            this.f179011t = (CloseButton) view.findViewById(R.id.close_button);
        }
        super.addView(view, i12, layoutParams);
    }

    @k
    public final XU.a getContent() {
        return this.content;
    }

    @l
    public final View getContentView() {
        return this.contentView;
    }

    @k
    public final InterfaceC40743a getImageContainer() {
        return this.f179014w;
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178988q);
        n(this, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setCloseButtonListener(@l View.OnClickListener listener) {
        CloseButton closeButton = this.f179011t;
        if (closeButton != null) {
            closeButton.setOnClickListener(listener);
        }
    }

    public final void setCloseButtonVisible(boolean visible) {
        CloseButton closeButton = this.f179011t;
        if (closeButton != null) {
            D6.G(closeButton, visible);
        }
    }

    public final void setImageDrawable(@l Drawable image) {
        ImageView imageView = this.f179010s;
        if (imageView != null) {
            imageView.setImageDrawable(image);
        }
        ImageView imageView2 = this.f179010s;
        if (imageView2 != null) {
            D6.G(imageView2, image != null);
        }
    }

    public final void setImageScaleType(@k ImageView.ScaleType scaleType) {
        ImageView imageView = this.f179010s;
        if (imageView == null) {
            return;
        }
        imageView.setScaleType(scaleType);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Banner(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) throws Resources.NotFoundException {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.deprecatedBanner : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_DeprecatedBanner : i13;
        super(context, attributeSet, i12);
        this.f179014w = new a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_deprecated_banner, (ViewGroup) this, true);
        XU.a aVar = new XU.a();
        int[] iArr = d.n.f178988q;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i12, i13);
        aVar.f18890a = typedArrayObtainStyledAttributes.getString(22);
        aVar.f18891b = typedArrayObtainStyledAttributes.getString(5);
        aVar.f18892c = typedArrayObtainStyledAttributes.getString(6);
        typedArrayObtainStyledAttributes.recycle();
        this.content = aVar;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i12, i13);
        n(this, typedArrayObtainStyledAttributes2);
        setCloseButtonVisible(typedArrayObtainStyledAttributes2.getBoolean(8, false));
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* compiled from: Banner.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/deprecated_banner/Banner$a;", "Lgw/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC40743a {

        /* renamed from: b, reason: collision with root package name */
        @l
        public Drawable f179015b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public ImageView f179016c;

        public a() {
            State.a aVar = State.f135879c;
        }

        @Override // gw.InterfaceC40743a
        @l
        /* renamed from: getImage, reason: from getter */
        public final Drawable getF179015b() {
            return this.f179015b;
        }

        @Override // gw.InterfaceC40743a
        @l
        public final View getImageContainerView() {
            return this.f179016c;
        }

        @Override // gw.InterfaceC40743a
        public final void setImage(@l Drawable drawable) {
            this.f179015b = drawable;
            ImageView imageView = this.f179016c;
            if (imageView == null) {
                imageView = null;
            }
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                D6.G(imageView, this.f179015b != null);
            }
        }

        @Override // gw.InterfaceC40743a
        public final void setState(@k State state) {
        }
    }
}
