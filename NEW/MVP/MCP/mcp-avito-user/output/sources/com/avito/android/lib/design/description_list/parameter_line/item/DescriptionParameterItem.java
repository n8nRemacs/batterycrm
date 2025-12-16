package com.avito.android.lib.design.description_list.parameter_line.item;

import PK0.n;
import X41.j;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.description_list.parameter_line.item.a;
import com.avito.android.lib.design.description_list.parameter_line.item.b;
import com.avito.android.lib.design.text_view.e;
import com.avito.android.lib.util.c;
import com.avito.android.util.C35821j2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DescriptionParameterItem.kt */
@s0
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\tJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\tJ\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010.\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u0017\u00104\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/avito/android/lib/design/description_list/parameter_line/item/DescriptionParameterItem;", "Landroid/widget/LinearLayout;", "LLV/a;", "Lcom/avito/android/lib/design/description_list/parameter_line/item/a;", "Lcom/avito/android/lib/design/description_list/parameter_line/item/b;", "", "value", "Lkotlin/G0;", "setDotsOffset", "(I)V", "", "(F)V", "appearance", "setAppearance", "LPK0/n;", "styleData", "setTextStyleDataCompat", "(LPK0/n;)V", "color", "setIconTint", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "setHorizontalIconPadding", "getBaseline", "()I", "Landroid/view/View$OnClickListener;", "listener", "setLeftTextIconClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "setLeftTextIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "newStyle", "setStyle", "(Lcom/avito/android/lib/design/description_list/parameter_line/item/b;)V", "newState", "setState", "(Lcom/avito/android/lib/design/description_list/parameter_line/item/a;)V", "Lcom/avito/android/lib/design/text_view/a;", "b", "Lcom/avito/android/lib/design/text_view/a;", "getLeftTextView", "()Lcom/avito/android/lib/design/text_view/a;", "leftTextView", "c", "getRightTextView", "rightTextView", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "icon", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"CustomViewStyleable"})
/* loaded from: classes14.dex */
public final class DescriptionParameterItem extends LinearLayout implements LV.a<a, b> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f179078j = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    public final com.avito.android.lib.design.text_view.a leftTextView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    public final com.avito.android.lib.design.text_view.a rightTextView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    public final ImageView icon;

    /* renamed from: e, reason: collision with root package name */
    @l
    public b f179082e;

    /* renamed from: f, reason: collision with root package name */
    public float f179083f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Paint f179084g;

    /* renamed from: h, reason: collision with root package name */
    public int f179085h;

    /* renamed from: i, reason: collision with root package name */
    public float f179086i;

    @j
    public DescriptionParameterItem(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(float r4, int r5, float[] r6) {
        /*
            r3 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 0
            r0.<init>(r1)
            r0.setColor(r5)
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r5)
            if (r6 == 0) goto L20
            int r5 = r6.length
            r2 = 1
            if (r5 != 0) goto L15
            r1 = r2
        L15:
            r5 = r1 ^ 1
            if (r5 != r2) goto L20
            android.graphics.DashPathEffect r5 = new android.graphics.DashPathEffect
            r1 = 0
            r5.<init>(r6, r1)
            goto L21
        L20:
            r5 = 0
        L21:
            r0.setPathEffect(r5)
            r0.setStrokeWidth(r4)
            r3.f179084g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem.a(float, int, float[]):void");
    }

    public final void b(float f12, int i12, @l float[] fArr) {
        a(f12, i12, fArr);
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        return this.leftTextView.getBaseline();
    }

    @k
    public final ImageView getIcon() {
        return this.icon;
    }

    @k
    public final com.avito.android.lib.design.text_view.a getLeftTextView() {
        return this.leftTextView;
    }

    @k
    public final com.avito.android.lib.design.text_view.a getRightTextView() {
        return this.rightTextView;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(@k Canvas canvas) {
        float lineMax;
        float f12;
        super.onDraw(canvas);
        com.avito.android.lib.design.text_view.a aVar = this.rightTextView;
        if (aVar.getLayout() != null) {
            com.avito.android.lib.design.text_view.a aVar2 = this.leftTextView;
            if (aVar2.getLayout() == null) {
                return;
            }
            float primaryHorizontal = aVar.getLayout().getPrimaryHorizontal(0);
            if (this.icon.getDrawable() == null || aVar2.getLayout().getLineCount() > 1) {
                lineMax = aVar2.getLayout().getLineMax(0);
                f12 = this.f179083f;
            } else {
                lineMax = r4.getRight() + this.f179083f;
                f12 = this.f179085h;
            }
            float f13 = lineMax + f12;
            float left = (aVar.getLeft() + primaryHorizontal) - this.f179083f;
            float baseline = aVar2.getBaseline() + getPaddingTop();
            Paint paint = this.f179084g;
            if (paint != null) {
                canvas.drawLine(f13, baseline, left, baseline, paint);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        Layout layout = this.leftTextView.getLayout();
        if (layout == null) {
            return;
        }
        int lineCount = layout.getLineCount() - 1;
        int lineDescent = (layout.getLineDescent(lineCount) - (layout.getLineAscent(lineCount) / 2)) + layout.getLineTop(lineCount);
        ImageView imageView = this.icon;
        int paddingTop = getPaddingTop() + (lineDescent - (imageView.getMeasuredHeight() / 2));
        int measuredHeight = imageView.getMeasuredHeight() + paddingTop;
        int lineMax = ((int) layout.getLineMax(lineCount)) + this.f179085h;
        imageView.layout(lineMax, paddingTop, imageView.getMeasuredWidth() + lineMax, measuredHeight);
    }

    public final void setAppearance(int appearance) {
        this.leftTextView.setTextAppearance(appearance);
        this.rightTextView.setTextAppearance(appearance);
    }

    public final void setDotsOffset(int value) {
        this.f179083f = value;
        invalidate();
    }

    public final void setHorizontalIconPadding(int padding) {
        this.f179085h = padding;
        invalidate();
    }

    public final void setIconTint(int color) {
        this.icon.setImageTintList(ColorStateList.valueOf(color));
    }

    public final void setLeftTextIconClickListener(@l View.OnClickListener listener) {
        this.icon.setOnClickListener(listener);
    }

    public final void setLeftTextIconDrawable(@l Drawable iconDrawable) {
        C35821j2.a(this.icon, iconDrawable);
    }

    @Override // LV.b
    public void setState(@k a newState) {
        G0 g02;
        Integer num;
        Y41.a<G0> aVar;
        if (new c(newState, null).f181333c) {
            return;
        }
        a.C5266a c5266a = newState.f179087a;
        if (!new c(c5266a, null).f181333c) {
            setLeftTextIconDrawable(c5266a != null ? c5266a.f179090a : null);
            ImageView imageView = this.icon;
            if (c5266a == null || (aVar = c5266a.f179091b) == null) {
                g02 = null;
            } else {
                imageView.setOnClickListener(new Ae0.b(23, aVar));
                g02 = G0.f406611a;
            }
            if (g02 == null) {
                imageView.setOnClickListener(null);
            }
            if (c5266a != null && (num = c5266a.f179092c) != null) {
                imageView.post(new YU.a(this, num.intValue(), 0));
            }
        }
        CharSequence charSequence = newState.f179088b;
        if (!new c(charSequence, null).f181333c && charSequence != null) {
            this.leftTextView.setText(charSequence);
        }
        CharSequence charSequence2 = newState.f179089c;
        if (new c(charSequence2, null).f181333c || charSequence2 == null) {
            return;
        }
        this.rightTextView.setText(charSequence2);
    }

    public final void setTextStyleDataCompat(@k n styleData) {
        e.a(this.leftTextView, styleData);
        e.a(this.rightTextView, styleData);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DescriptionParameterItem(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.descriptionParameterItem : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_DescriptionParameterItem : i13;
        super(context, attributeSet, i12, i13);
        int i15 = 0;
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(context, null, 0, i15, 14, null);
        aVar.setId(R.id.left_text);
        this.leftTextView = aVar;
        com.avito.android.lib.design.text_view.a aVar2 = new com.avito.android.lib.design.text_view.a(context, null, i15, 0, 14, null);
        aVar2.setId(R.id.right_text);
        aVar2.setGravity(8388613);
        this.rightTextView = aVar2;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.icon = imageView;
        setWillNotDraw(false);
        setBaselineAligned(false);
        setOrientation(0);
        addView(aVar);
        addView(imageView);
        addView(aVar2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178996u, i12, i13);
        b.f179093j.getClass();
        setStyle(b.a.b(typedArrayObtainStyledAttributes, context));
        if (typedArrayObtainStyledAttributes.hasValue(11)) {
            imageView.post(new YU.a(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0), 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            setLeftTextIconDrawable(typedArrayObtainStyledAttributes.getDrawable(8));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.lib.design.description_list.parameter_line.item.b r10) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem.setStyle(com.avito.android.lib.design.description_list.parameter_line.item.b):void");
    }

    public final void setDotsOffset(float value) {
        this.f179083f = value;
    }
}
