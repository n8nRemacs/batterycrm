package com.avito.android.component.advert_badge_bar.badge_item;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.util.C35949t5;
import com.google.android.material.shape.q;
import hw.InterfaceC41177b;
import kG0.C42580a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertBadgeView.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0006J\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/badge_item/AdvertBadgeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "color", "Lkotlin/G0;", "setTextColor", "(I)V", "", "text", "setTitle", "(Ljava/lang/CharSequence;)V", "setSubtitle", "maxLines", "setTitleMaxLines", "setSubtitleMaxLines", "", "isVisible", "setArrowIconVisible", "(Z)V", "Lcom/avito/android/image_loader/k;", "image", "setPicture", "(Lcom/avito/android/image_loader/k;)V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AdvertBadgeView extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final q f124968b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Drawable f124969c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f124970d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f124971e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDraweeView f124972f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ImageView f124973g;

    @j
    public AdvertBadgeView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void setArrowIconVisible(boolean isVisible) {
        this.f124973g.setVisibility(isVisible ? 0 : 8);
    }

    public final void setPicture(@k com.avito.android.image_loader.k image) {
        C35949t5.c(this.f124972f, image, this.f124969c, null, null, 12);
    }

    public final void setSubtitle(@k CharSequence text) {
        this.f124971e.setText(text);
    }

    public final void setSubtitleMaxLines(int maxLines) {
        this.f124971e.setMaxLines(maxLines);
    }

    public final void setTextColor(int color) {
        this.f124970d.setTextColor(color);
        this.f124971e.setTextColor(color);
    }

    public final void setTitle(@k CharSequence text) {
        this.f124970d.setText(text);
    }

    public final void setTitleMaxLines(int maxLines) {
        this.f124970d.setMaxLines(maxLines);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AdvertBadgeView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.advertBadgeView : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_AdvertBadgeView : i13;
        super(context, attributeSet, i12);
        LayoutInflater.from(context).inflate(R.layout.advert_badge_view, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f124970d = textView;
        TextView textView2 = (TextView) findViewById(R.id.subtitle);
        this.f124971e = textView2;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) findViewById(R.id.advert_badge_image_view);
        this.f124972f = simpleDraweeView;
        this.f124973g = (ImageView) findViewById(R.id.advert_badge_arrow_icon_view);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C42580a.o.f406212b, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            textView.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(13, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            textView2.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            simpleDraweeView.getLayoutParams().width = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            simpleDraweeView.getLayoutParams().height = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            ((ViewGroup.MarginLayoutParams) simpleDraweeView.getLayoutParams()).leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            ((ViewGroup.MarginLayoutParams) simpleDraweeView.getLayoutParams()).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(8, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            ((ViewGroup.MarginLayoutParams) simpleDraweeView.getLayoutParams()).bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(12, 0);
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(12, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(11)) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(11, 0);
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(11, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            this.f124969c = androidx.core.content.d.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            textView.setMaxLines(typedArrayObtainStyledAttributes.getInteger(14, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            textView2.setMaxLines(typedArrayObtainStyledAttributes.getInteger(3, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f124968b = q.a(context, typedArrayObtainStyledAttributes.getResourceId(0, 0), 0).a();
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
