package Xj;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: RedesignBottomNavigationTabView.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001R\"\u0010\t\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LXj/d;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/fresco/SimpleDraweeView;", "b", "Lcom/avito/android/fresco/SimpleDraweeView;", "getIcon$_avito_bottom_navigation_impl", "()Lcom/avito/android/fresco/SimpleDraweeView;", "setIcon$_avito_bottom_navigation_impl", "(Lcom/avito/android/fresco/SimpleDraweeView;)V", "icon", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "getCurrentStroke$_avito_bottom_navigation_impl", "()Landroid/widget/ImageView;", "setCurrentStroke$_avito_bottom_navigation_impl", "(Landroid/widget/ImageView;)V", "currentStroke", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getPro$_avito_bottom_navigation_impl", "()Landroid/widget/TextView;", "setPro$_avito_bottom_navigation_impl", "(Landroid/widget/TextView;)V", "pro", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends FrameLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public SimpleDraweeView icon;

    /* renamed from: c, reason: collision with root package name */
    public TextView f19047c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ImageView currentStroke;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public TextView pro;

    @Override // android.view.ViewGroup
    public final void addView(@l View view, int i12, @l ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i12, layoutParams);
        int id2 = view.getId();
        if (id2 != R.id.bn_title) {
            if (id2 == R.id.bn_icon) {
                setIcon$_avito_bottom_navigation_impl((SimpleDraweeView) view);
                return;
            }
            if (id2 == R.id.bn_badge) {
                this.f19047c = (TextView) view;
            } else if (id2 == R.id.bn_current_stroke) {
                setCurrentStroke$_avito_bottom_navigation_impl((ImageView) view);
            } else if (id2 == R.id.bn_pro) {
                setPro$_avito_bottom_navigation_impl((TextView) view);
            }
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
        TextView textView = this.f19047c;
        TextView textView2 = textView == null ? null : textView;
        if (textView == null) {
            textView = null;
        }
        int top = textView.getTop();
        TextView textView3 = this.f19047c;
        if (textView3 == null) {
            textView3 = null;
        }
        int width = textView3.getWidth() + i16;
        TextView textView4 = this.f19047c;
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
