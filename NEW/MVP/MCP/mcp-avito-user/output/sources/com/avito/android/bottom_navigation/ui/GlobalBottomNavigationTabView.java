package com.avito.android.bottom_navigation.ui;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.badge.Badge;
import kotlin.Metadata;

/* compiled from: GlobalBottomNavigationTabView.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/GlobalBottomNavigationTabView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/avito/android/fresco/SimpleDraweeView;", "b", "Lcom/avito/android/fresco/SimpleDraweeView;", "getIcon$_avito_bottom_navigation_impl", "()Lcom/avito/android/fresco/SimpleDraweeView;", "setIcon$_avito_bottom_navigation_impl", "(Lcom/avito/android/fresco/SimpleDraweeView;)V", "icon", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "getCurrentStroke$_avito_bottom_navigation_impl", "()Landroid/widget/ImageView;", "setCurrentStroke$_avito_bottom_navigation_impl", "(Landroid/widget/ImageView;)V", "currentStroke", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GlobalBottomNavigationTabView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public SimpleDraweeView icon;

    /* renamed from: c, reason: collision with root package name */
    public Badge f107098c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ImageView currentStroke;

    public GlobalBottomNavigationTabView(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public final void addView(@l View view, int i12, @l ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i12, layoutParams);
        int id2 = view.getId();
        if (id2 == R.id.bn_icon) {
            setIcon$_avito_bottom_navigation_impl((SimpleDraweeView) view);
        } else if (id2 == R.id.bn_badge) {
            this.f107098c = (Badge) view;
        } else if (id2 == R.id.bn_current_stroke) {
            setCurrentStroke$_avito_bottom_navigation_impl((ImageView) view);
        }
    }

    @k
    public final ImageView getCurrentStroke$_avito_bottom_navigation_impl() {
        ImageView imageView = this.currentStroke;
        if (imageView != null) {
            return imageView;
        }
        return null;
    }

    @k
    public final SimpleDraweeView getIcon$_avito_bottom_navigation_impl() {
        SimpleDraweeView simpleDraweeView = this.icon;
        if (simpleDraweeView != null) {
            return simpleDraweeView;
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        int i16 = (i14 - i12) / 2;
        Badge badge = this.f107098c;
        Badge badge2 = badge == null ? null : badge;
        if (badge == null) {
            badge = null;
        }
        int top = badge.getTop();
        Badge badge3 = this.f107098c;
        if (badge3 == null) {
            badge3 = null;
        }
        int width = badge3.getWidth() + i16;
        Badge badge4 = this.f107098c;
        badge2.layout(i16, top, width, (badge4 != null ? badge4 : null).getBottom());
    }

    public final void setCurrentStroke$_avito_bottom_navigation_impl(@k ImageView imageView) {
        this.currentStroke = imageView;
    }

    public final void setIcon$_avito_bottom_navigation_impl(@k SimpleDraweeView simpleDraweeView) {
        this.icon = simpleDraweeView;
    }
}
