package com.avito.android.bottom_navigation.ui;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.d;
import com.avito.android.R;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BottomNavigationTabView.kt */
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/avito/android/bottom_navigation/ui/BottomNavigationTabView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/avito/android/fresco/SimpleDraweeView;", "c", "Lcom/avito/android/fresco/SimpleDraweeView;", "getIcon$_avito_bottom_navigation_impl", "()Lcom/avito/android/fresco/SimpleDraweeView;", "setIcon$_avito_bottom_navigation_impl", "(Lcom/avito/android/fresco/SimpleDraweeView;)V", "icon", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "getCurrentStroke$_avito_bottom_navigation_impl", "()Landroid/widget/ImageView;", "setCurrentStroke$_avito_bottom_navigation_impl", "(Landroid/widget/ImageView;)V", "currentStroke", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "getPro$_avito_bottom_navigation_impl", "()Landroid/widget/TextView;", "setPro$_avito_bottom_navigation_impl", "(Landroid/widget/TextView;)V", "pro", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BottomNavigationTabView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public TextView f107090b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public SimpleDraweeView icon;

    /* renamed from: d, reason: collision with root package name */
    public TextView f107092d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ImageView currentStroke;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public TextView pro;

    public BottomNavigationTabView(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(@k NavigationTabSetItem navigationTabSetItem) {
        TextView textView = this.f107090b;
        if (textView == null) {
            textView = null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.f107090b;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(navigationTabSetItem.getF106979b());
        TextView textView3 = this.f107090b;
        (textView3 != null ? textView3 : null).setTextColor(d.getColorStateList(getContext(), R.color.bn_title_color));
        getIcon$_avito_bottom_navigation_impl().setBackgroundResource(navigationTabSetItem.getF106945b());
    }

    @Override // android.view.ViewGroup
    public final void addView(@l View view, int i12, @l ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i12, layoutParams);
        int id2 = view.getId();
        if (id2 == R.id.bn_title) {
            this.f107090b = (TextView) view;
            return;
        }
        if (id2 == R.id.bn_icon) {
            setIcon$_avito_bottom_navigation_impl((SimpleDraweeView) view);
            return;
        }
        if (id2 == R.id.bn_badge) {
            this.f107092d = (TextView) view;
        } else if (id2 == R.id.bn_current_stroke) {
            setCurrentStroke$_avito_bottom_navigation_impl((ImageView) view);
        } else if (id2 == R.id.bn_pro) {
            setPro$_avito_bottom_navigation_impl((TextView) view);
        }
    }

    @l
    public final TextView b(@k NavigationTab navigationTab, int i12) {
        if (i12 <= 0) {
            TextView textView = this.f107092d;
            if (textView == null) {
                textView = null;
            }
            textView.setVisibility(8);
            TextView textView2 = this.f107092d;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText((CharSequence) null);
            return null;
        }
        if (navigationTab == NavigationTab.f106972h) {
            TextView textView3 = this.f107092d;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setVisibility(4);
        } else {
            TextView textView4 = this.f107092d;
            if (textView4 == null) {
                textView4 = null;
            }
            textView4.setVisibility(0);
        }
        TextView textView5 = this.f107092d;
        if (textView5 == null) {
            textView5 = null;
        }
        textView5.setText(i12 < 100 ? String.valueOf(i12) : "99+");
        TextView textView6 = this.f107092d;
        if (textView6 == null) {
            return null;
        }
        return textView6;
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

    @k
    public final TextView getPro$_avito_bottom_navigation_impl() {
        TextView textView = this.pro;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        int i16 = (i14 - i12) / 2;
        TextView textView = this.f107092d;
        TextView textView2 = textView == null ? null : textView;
        if (textView == null) {
            textView = null;
        }
        int top = textView.getTop();
        TextView textView3 = this.f107092d;
        if (textView3 == null) {
            textView3 = null;
        }
        int width = textView3.getWidth() + i16;
        TextView textView4 = this.f107092d;
        textView2.layout(i16, top, width, (textView4 != null ? textView4 : null).getBottom());
        int width2 = i16 - (getPro$_avito_bottom_navigation_impl().getWidth() / 2);
        int width3 = getPro$_avito_bottom_navigation_impl().getWidth() + width2;
        int bottom = D6.y(getCurrentStroke$_avito_bottom_navigation_impl()) ? getCurrentStroke$_avito_bottom_navigation_impl().getBottom() : getIcon$_avito_bottom_navigation_impl().getBottom();
        getPro$_avito_bottom_navigation_impl().layout(width2, bottom - getPro$_avito_bottom_navigation_impl().getHeight(), width3, bottom);
    }

    public final void setCurrentStroke$_avito_bottom_navigation_impl(@k ImageView imageView) {
        this.currentStroke = imageView;
    }

    public final void setIcon$_avito_bottom_navigation_impl(@k SimpleDraweeView simpleDraweeView) {
        this.icon = simpleDraweeView;
    }

    public final void setPro$_avito_bottom_navigation_impl(@k TextView textView) {
        this.pro = textView;
    }
}
