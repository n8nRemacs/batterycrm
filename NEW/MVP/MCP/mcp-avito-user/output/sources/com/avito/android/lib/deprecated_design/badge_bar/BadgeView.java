package com.avito.android.lib.deprecated_design.badge_bar;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.text_view.a;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import fw.C40487a;
import hw.InterfaceC41179d;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import j.e0;
import j.f0;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;

/* compiled from: BadgeView.kt */
@s0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0007R(\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\t\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/avito/android/lib/deprecated_design/badge_bar/BadgeView;", "Landroid/widget/LinearLayout;", "LpK0/a;", "", "color", "Lkotlin/G0;", "setBackgroundColor", "(I)V", "resId", "setText", "setTextColor", "Lcom/avito/android/image_loader/k;", "picture", "setPicture", "(Lcom/avito/android/image_loader/k;)V", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "", "value", "getText", "()Ljava/lang/CharSequence;", "(Ljava/lang/CharSequence;)V", "text", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
@InterfaceC42830m
/* loaded from: classes14.dex */
public final class BadgeView extends LinearLayout implements InterfaceC46971a {

    /* renamed from: b, reason: collision with root package name */
    public float f177808b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Rect f177809c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f177810d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f177811e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Space f177812f;

    @j
    public BadgeView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void a(TypedArray typedArray) {
        this.f177808b = typedArray.getDimension(6, this.f177808b);
        Rect rect = this.f177809c;
        rect.left = typedArray.getDimensionPixelSize(5, rect.left);
        rect.right = typedArray.getDimensionPixelSize(7, rect.right);
        rect.top = typedArray.getDimensionPixelSize(8, rect.top);
        rect.bottom = typedArray.getDimensionPixelSize(4, rect.bottom);
        setPadding(rect.left, 0, rect.right, 0);
        a aVar = this.f177810d;
        ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(0, rect.top, 0, rect.bottom);
        aVar.setLayoutParams(marginLayoutParams);
        setBackgroundColor(typedArray.getColor(2, 0));
    }

    public final void b() {
        SimpleDraweeView simpleDraweeView = this.f177811e;
        int visibility = simpleDraweeView.getVisibility();
        a aVar = this.f177810d;
        int i12 = 0;
        this.f177812f.setVisibility(visibility == 0 && aVar.getVisibility() == 0 ? 0 : 8);
        if (simpleDraweeView.getVisibility() != 0 && aVar.getVisibility() != 0) {
            i12 = 8;
        }
        setVisibility(i12);
    }

    @l
    public final CharSequence getText() {
        return this.f177810d.getText();
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) {
        this.f177810d.setTextAppearance(style);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, C40487a.l.f396186a);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(color);
        float[] fArr = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr[i12] = this.f177808b;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        setBackground(shapeDrawable);
        this.f177810d.setBackgroundColor(color);
    }

    public final void setPicture(@l com.avito.android.image_loader.k picture) {
        G0 g02;
        SimpleDraweeView simpleDraweeView = this.f177811e;
        if (picture != null) {
            C35949t5.c(simpleDraweeView, picture, null, null, null, 14);
            D6.H(simpleDraweeView);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(simpleDraweeView);
        }
        b();
    }

    public final void setText(@l CharSequence charSequence) {
        I5.a(this.f177810d, charSequence, true);
        b();
    }

    public final void setTextColor(@InterfaceC42156l int color) {
        this.f177810d.setTextColor(color);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BadgeView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.badgeView : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_BadgeView : i13;
        super(context, attributeSet, i12, i13);
        this.f177809c = new Rect();
        int iB2 = y6.b(10);
        int iB3 = y6.b(2);
        a aVar = new a(context, attributeSet, i12, i13);
        aVar.setEllipsize(TextUtils.TruncateAt.END);
        aVar.setMaxLines(1);
        I5.a(aVar, aVar.getText(), true);
        this.f177810d = aVar;
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.setVisibility(8);
        this.f177811e = simpleDraweeView;
        Space space = new Space(context);
        space.setVisibility(8);
        this.f177812f = space;
        setOrientation(0);
        setGravity(17);
        addView(simpleDraweeView, iB2, iB2);
        addView(space, iB3, 0);
        addView(aVar);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C40487a.l.f396186a, i12, i13);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        b();
    }

    public final void setText(@e0 int resId) {
        a aVar = this.f177810d;
        aVar.setText(resId);
        D6.H(aVar);
        b();
    }
}
