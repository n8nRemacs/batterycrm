package com.avito.android.component.advert_badge_bar.badge_item;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.i;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.badge_bar.ImageLoadableView;
import com.avito.android.lib.util.groupable_item.e;
import com.google.android.material.shape.q;
import hw.InterfaceC41177b;
import j.InterfaceC42156l;
import kG0.C42580a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import wK0.AbstractC49528c;

/* compiled from: ProfileBadgeView.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/badge_item/ProfileBadgeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/avito/android/lib/util/groupable_item/e;", "", "text", "Lkotlin/G0;", "setText", "(Ljava/lang/CharSequence;)V", "", "color", "setTextColor", "(I)V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProfileBadgeView extends ConstraintLayout implements e {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f124974i = 0;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Drawable f124975b;

    /* renamed from: c, reason: collision with root package name */
    public final int f124976c;

    /* renamed from: d, reason: collision with root package name */
    public final int f124977d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public ColorStateList f124978e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public ColorStateList f124979f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f124980g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ImageLoadableView f124981h;

    @j
    public ProfileBadgeView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // com.avito.android.lib.util.groupable_item.e
    public final void Tz(boolean z12, boolean z13) {
        int i12 = this.f124976c;
        int i13 = this.f124977d;
        int i14 = z12 ? i13 : i12;
        if (z13) {
            i12 = i13;
        }
        float f12 = i14;
        float f13 = i12;
        ColorStateList colorStateList = this.f124978e;
        ColorStateList colorStateList2 = this.f124979f;
        q.b bVar = new q.b();
        bVar.m(f12);
        bVar.p(f12);
        bVar.g(f13);
        bVar.j(f13);
        setBackground(AbstractC49528c.a.b(AbstractC49528c.f441377b, bVar.a(), 0, 0, 0, 0, colorStateList, colorStateList2, null, null, 414));
    }

    public final void setText(@k CharSequence text) {
        this.f124980g.setText(text);
    }

    public final void setTextColor(@InterfaceC42156l int color) {
        this.f124980g.setTextColor(color);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProfileBadgeView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        Drawable drawable = null;
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.profileBadgeView : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_ProfileBadgeView : i13;
        super(context, attributeSet, i12);
        LayoutInflater.from(context).inflate(R.layout.profile_badge_view, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.text);
        this.f124980g = textView;
        ImageLoadableView imageLoadableView = (ImageLoadableView) findViewById(R.id.icon);
        this.f124981h = imageLoadableView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C42580a.o.f406218h, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            textView.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(8, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            imageLoadableView.getLayoutParams().width = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            imageLoadableView.getLayoutParams().height = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ((ViewGroup.MarginLayoutParams) imageLoadableView.getLayoutParams()).leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(11)) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(11, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(12, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f124975b = androidx.core.content.d.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            Drawable drawable2 = androidx.core.content.d.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
            if (drawable2 != null) {
                if (typedArrayObtainStyledAttributes.hasValue(4)) {
                    Resources resources = typedArrayObtainStyledAttributes.getResources();
                    ThreadLocal<TypedValue> threadLocal = i.f44673a;
                    drawable2.setTint(typedArrayObtainStyledAttributes.getColor(4, resources.getColor(R.color.common_black, null)));
                }
                drawable = drawable2;
            }
            imageLoadableView.setPlaceholderDrawable(drawable);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f124976c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            this.f124977d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
