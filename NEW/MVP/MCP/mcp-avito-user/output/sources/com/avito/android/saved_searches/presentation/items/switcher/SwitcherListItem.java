package com.avito.android.saved_searches.presentation.items.switcher;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35821j2;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SwitcherListItem.kt */
@s0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001e\u0010\u0019J\u0015\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u001dJ\u0015\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/switcher/SwitcherListItem;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/Function0;", "Lkotlin/G0;", "listener", "setLeftContainerListener", "(LY41/a;)V", "Lkotlin/Function1;", "", "setRightContainerListener", "(LY41/l;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setLeftIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "setRightIconDrawable", "", "text", "setTitle", "(Ljava/lang/CharSequence;)V", "Landroid/content/res/ColorStateList;", "color", "setEmailColor", "(Landroid/content/res/ColorStateList;)V", "setSubtitle", "setSubtitleColor", BeduinCartItemModel.CHECKED_STRING, "setChecked", "(Z)V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SwitcherListItem extends RelativeLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f258550j = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final ImageView f258551b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ImageView f258552c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final TextView f258553d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final TextView f258554e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final TextView f258555f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final FrameLayout f258556g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final LinearLayout f258557h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Switcher f258558i;

    public SwitcherListItem(@Y61.l Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.listItemSwitcher);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178952W, R.attr.listItemSwitcher, R.style.Design_Widget_ListItemSwitcher);
        LayoutInflater.from(getContext()).inflate(R.layout.saved_search_settings_switcher_list_item, (ViewGroup) this, true);
        this.f258551b = (ImageView) findViewById(R.id.left_icon);
        this.f258552c = (ImageView) findViewById(R.id.right_icon);
        this.f258553d = (TextView) findViewById(R.id.title);
        this.f258554e = (TextView) findViewById(R.id.email);
        this.f258555f = (TextView) findViewById(R.id.subtitle);
        this.f258556g = (FrameLayout) findViewById(R.id.left_container);
        this.f258557h = (LinearLayout) findViewById(R.id.right_container);
        this.f258558i = (Switcher) findViewById(R.id.switcher);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            ColorStateList colorStateListA = x.a(typedArrayObtainStyledAttributes, getContext(), 3);
            ImageView imageView = this.f258551b;
            if (imageView != null) {
                imageView.setImageTintList(colorStateListA);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            ColorStateList colorStateListA2 = x.a(typedArrayObtainStyledAttributes, getContext(), 5);
            ImageView imageView2 = this.f258552c;
            if (imageView2 != null) {
                imageView2.setImageTintList(colorStateListA2);
            }
        }
        requestLayout();
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setChecked(boolean checked) throws Resources.NotFoundException {
        Switcher switcher = this.f258558i;
        if (switcher == null) {
            return;
        }
        switcher.setChecked(checked);
    }

    public final void setEmailColor(@Y61.k ColorStateList color) {
        TextView textView = this.f258554e;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public final void setLeftContainerListener(@Y61.l Y41.a<G0> listener) {
        if (listener != null) {
            FrameLayout frameLayout = this.f258556g;
            if (frameLayout != null) {
                frameLayout.setOnClickListener(new l(0, listener));
                return;
            }
            return;
        }
        FrameLayout frameLayout2 = this.f258556g;
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(null);
        }
    }

    public final void setLeftIconDrawable(@Y61.l Drawable drawable) {
        ImageView imageView = this.f258551b;
        if (imageView != null) {
            C35821j2.a(imageView, drawable);
        }
    }

    public final void setRightContainerListener(@Y61.l Y41.l<? super Boolean, G0> listener) {
        if (listener != null) {
            LinearLayout linearLayout = this.f258557h;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(23, (Y41.l) listener, (Object) this));
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f258557h;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(null);
        }
    }

    public final void setRightIconDrawable(@Y61.l Drawable drawable) {
        ImageView imageView = this.f258552c;
        if (imageView != null) {
            C35821j2.a(imageView, drawable);
        }
    }

    public final void setSubtitle(@Y61.l CharSequence text) {
        TextView textView = this.f258555f;
        if (textView != null) {
            I5.a(textView, text, false);
        }
    }

    public final void setSubtitleColor(@Y61.k ColorStateList color) {
        ViewTreeObserver viewTreeObserver;
        TextView textView = this.f258555f;
        if (textView != null) {
            textView.setTextColor(color);
        }
        LinearLayout linearLayout = this.f258557h;
        if (linearLayout == null || (viewTreeObserver = linearLayout.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new m(this));
    }

    public final void setTitle(@Y61.l CharSequence text) {
        TextView textView = this.f258553d;
        if (textView != null) {
            I5.a(textView, text, false);
        }
    }
}
