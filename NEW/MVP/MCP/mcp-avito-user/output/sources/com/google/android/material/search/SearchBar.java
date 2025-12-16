package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C22823h0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.H;
import j.InterfaceC42156l;
import j.L;
import j.N;
import j.P;
import j.X;
import j.e0;
import j.r;
import java.util.Comparator;

/* loaded from: classes6.dex */
public class SearchBar extends Toolbar {

    /* renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ int f357015b0 = 0;

    /* renamed from: V, reason: collision with root package name */
    @P
    public Drawable f357016V;

    /* renamed from: W, reason: collision with root package name */
    public int f357017W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f357018a0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public String f357019d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i12) {
                return new SavedState[i12];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, @P ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f357019d = parcel.readString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeString(this.f357019d);
        }
    }

    public static abstract class a {
    }

    private void setNavigationIconDecorative(boolean z12) {
        ImageButton imageButton;
        Comparator<View> comparator = H.f356731a;
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon == null) {
            imageButton = null;
        } else {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof ImageButton) {
                    imageButton = (ImageButton) childAt;
                    if (imageButton.getDrawable() == navigationIcon) {
                        break;
                    }
                }
            }
            imageButton = null;
        }
        if (imageButton == null) {
            return;
        }
        boolean z13 = !z12;
        imageButton.setClickable(z13);
        imageButton.setFocusable(z13);
        Drawable background = imageButton.getBackground();
        if (background != null) {
            this.f357016V = background;
        }
        imageButton.setBackgroundDrawable(z12 ? null : this.f357016V);
    }

    @P
    public View getCenterView() {
        return null;
    }

    public float getCompatElevation() {
        return C22823h0.l(this);
    }

    public float getCornerSize() {
        throw null;
    }

    @P
    public CharSequence getHint() {
        throw null;
    }

    public int getMenuResId() {
        return this.f357017W;
    }

    @InterfaceC42156l
    public int getStrokeColor() {
        throw null;
    }

    @r
    public float getStrokeWidth() {
        throw null;
    }

    @P
    public CharSequence getText() {
        throw null;
    }

    @N
    public TextView getTextView() {
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(@L int i12) {
        super.m(i12);
        this.f357017W = i12;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.m.c(this, null);
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(getHint());
        accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f45355b);
        setText(savedState.f357019d);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @N
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.f357019d = text == null ? null : text.toString();
        return savedState;
    }

    public void setCenterView(@P View view) {
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z12) {
        this.f357018a0 = z12;
        if (getLayoutParams() instanceof AppBarLayout.e) {
            AppBarLayout.e eVar = (AppBarLayout.e) getLayoutParams();
            if (this.f357018a0) {
                if (eVar.f355756a == 0) {
                    eVar.f355756a = 53;
                }
            } else if (eVar.f355756a == 53) {
                eVar.f355756a = 0;
            }
        }
    }

    @Override // android.view.View
    @X
    public void setElevation(float f12) {
        super.setElevation(f12);
    }

    public void setHint(@P CharSequence charSequence) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@P Drawable drawable) {
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z12) {
        throw null;
    }

    public void setStrokeColor(@InterfaceC42156l int i12) {
        if (getStrokeColor() == i12) {
            return;
        }
        ColorStateList.valueOf(i12);
        throw null;
    }

    public void setStrokeWidth(@r float f12) {
        if (getStrokeWidth() != f12) {
            throw null;
        }
    }

    public void setText(@P CharSequence charSequence) {
        throw null;
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: g, reason: collision with root package name */
        public boolean f357020g;

        public ScrollingViewBehavior() {
            this.f357020g = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean f(@N CoordinatorLayout coordinatorLayout, @N View view, @N View view2) throws Resources.NotFoundException {
            super.f(coordinatorLayout, view, view2);
            if (!this.f357020g && (view2 instanceof AppBarLayout)) {
                this.f357020g = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }

        public ScrollingViewBehavior(@N Context context, @P AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f357020g = false;
        }
    }

    public void setHint(@e0 int i12) {
        throw null;
    }

    public void setText(@e0 int i12) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
