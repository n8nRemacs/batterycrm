package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C37064e;
import j.InterfaceC42146b;
import j.N;
import j.P;
import j.k0;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* renamed from: b, reason: collision with root package name */
    @N
    public ColorStateList f356584b;

    public class a extends Property<View, Float> {
        @Override // android.util.Property
        @N
        public final Float get(@N View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(@N View view, @N Float f12) {
            View view2 = view;
            view2.getLayoutParams().width = f12.intValue();
            view2.requestLayout();
        }
    }

    public class b extends Property<View, Float> {
        @Override // android.util.Property
        @N
        public final Float get(@N View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(@N View view, @N Float f12) {
            View view2 = view;
            view2.getLayoutParams().height = f12.intValue();
            view2.requestLayout();
        }
    }

    public class c extends Property<View, Float> {
        @Override // android.util.Property
        @N
        public final Float get(@N View view) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            return Float.valueOf(view.getPaddingStart());
        }

        @Override // android.util.Property
        public final void set(@N View view, @N Float f12) {
            View view2 = view;
            int iIntValue = f12.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            view2.setPaddingRelative(iIntValue, paddingTop, view2.getPaddingEnd(), view2.getPaddingBottom());
        }
    }

    public class d extends Property<View, Float> {
        @Override // android.util.Property
        @N
        public final Float get(@N View view) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            return Float.valueOf(view.getPaddingEnd());
        }

        @Override // android.util.Property
        public final void set(@N View view, @N Float f12) {
            View view2 = view;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), f12.intValue(), view2.getPaddingBottom());
        }
    }

    public class e extends com.google.android.material.floatingactionbutton.c {
    }

    public class f extends com.google.android.material.floatingactionbutton.c {
    }

    public static abstract class g {
    }

    public class h extends com.google.android.material.floatingactionbutton.c {
    }

    public interface i {
    }

    static {
        new a(Float.class, "width");
        new b(Float.class, "height");
        new c(Float.class, "paddingStart");
        new d(Float.class, "paddingEnd");
    }

    public static void a(ExtendedFloatingActionButton extendedFloatingActionButton, int i12) {
        if (i12 != 0 && i12 != 1 && i12 != 2 && i12 != 3) {
            throw new IllegalStateException(AK.c.g(i12, "Unknown strategy type: "));
        }
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @N
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @k0
    public int getCollapsedSize() {
        return 0;
    }

    @P
    public lY0.i getExtendMotionSpec() {
        throw null;
    }

    @P
    public lY0.i getHideMotionSpec() {
        throw null;
    }

    @P
    public lY0.i getShowMotionSpec() {
        throw null;
    }

    @P
    public lY0.i getShrinkMotionSpec() {
        throw null;
    }

    public void setExtendMotionSpec(@P lY0.i iVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(@InterfaceC42146b int i12) {
        setExtendMotionSpec(lY0.i.b(i12, getContext()));
    }

    public void setExtended(boolean z12) {
        if (z12) {
            throw null;
        }
    }

    public void setHideMotionSpec(@P lY0.i iVar) {
        throw null;
    }

    public void setHideMotionSpecResource(@InterfaceC42146b int i12) {
        setHideMotionSpec(lY0.i.b(i12, getContext()));
    }

    public void setShowMotionSpec(@P lY0.i iVar) {
        throw null;
    }

    public void setShowMotionSpecResource(@InterfaceC42146b int i12) {
        setShowMotionSpec(lY0.i.b(i12, getContext()));
    }

    public void setShrinkMotionSpec(@P lY0.i iVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(@InterfaceC42146b int i12) {
        setShrinkMotionSpec(lY0.i.b(i12, getContext()));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i12) {
        super.setTextColor(i12);
        this.f356584b = getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a, reason: collision with root package name */
        public Rect f356585a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f356586b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f356587c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f356586b = false;
            this.f356587c = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ boolean c(@N View view, @N Rect rect) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void e(@N CoordinatorLayout.g gVar) {
            if (gVar.f44454h == 0) {
                gVar.f44454h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean f(CoordinatorLayout coordinatorLayout, @N View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                v(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.g ? ((CoordinatorLayout.g) layoutParams).f44447a instanceof BottomSheetBehavior : false) {
                    w(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean j(@N CoordinatorLayout coordinatorLayout, @N View view, int i12) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = dependencies.get(i13);
                if (view2 instanceof AppBarLayout) {
                    v(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.g ? ((CoordinatorLayout.g) layoutParams).f44447a instanceof BottomSheetBehavior : false) {
                        w(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i12);
            return true;
        }

        public final void v(CoordinatorLayout coordinatorLayout, @N AppBarLayout appBarLayout, @N ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.g gVar = (CoordinatorLayout.g) extendedFloatingActionButton.getLayoutParams();
            if ((this.f356586b || this.f356587c) && gVar.f44452f == appBarLayout.getId()) {
                if (this.f356585a == null) {
                    this.f356585a = new Rect();
                }
                Rect rect = this.f356585a;
                C37064e.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    ExtendedFloatingActionButton.a(extendedFloatingActionButton, this.f356587c ? 2 : 1);
                    throw null;
                }
                ExtendedFloatingActionButton.a(extendedFloatingActionButton, this.f356587c ? 3 : 0);
                throw null;
            }
        }

        public final void w(@N View view, @N ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.g gVar = (CoordinatorLayout.g) extendedFloatingActionButton.getLayoutParams();
            if ((this.f356586b || this.f356587c) && gVar.f44452f == view.getId()) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    ExtendedFloatingActionButton.a(extendedFloatingActionButton, this.f356587c ? 2 : 1);
                    throw null;
                }
                ExtendedFloatingActionButton.a(extendedFloatingActionButton, this.f356587c ? 3 : 0);
                throw null;
            }
        }

        public ExtendedFloatingActionButtonBehavior(@N Context context, @P AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.f356586b = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f356587c = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(@N ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.f356584b = getTextColors();
    }

    public void setAnimateShowBeforeLayout(boolean z12) {
    }
}
