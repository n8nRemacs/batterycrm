package com.google.android.material.navigation;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.K0;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.accessibility.f;
import j.I;
import j.InterfaceC42161q;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.U;
import j.f0;
import java.util.WeakHashMap;

/* compiled from: NavigationBarItemView.java */
@RestrictTo
/* loaded from: classes6.dex */
public abstract class b extends FrameLayout implements p.a {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f356851p = {R.attr.state_checked};

    /* renamed from: q, reason: collision with root package name */
    public static final C10641b f356852q;

    /* renamed from: r, reason: collision with root package name */
    public static final c f356853r;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f356854b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public Drawable f356855c;

    /* renamed from: d, reason: collision with root package name */
    public int f356856d;

    /* renamed from: e, reason: collision with root package name */
    public int f356857e;

    /* renamed from: f, reason: collision with root package name */
    public int f356858f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f356859g;

    /* renamed from: h, reason: collision with root package name */
    public int f356860h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public k f356861i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public ColorStateList f356862j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public Drawable f356863k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public Drawable f356864l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f356865m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f356866n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public com.google.android.material.badge.b f356867o;

    /* compiled from: NavigationBarItemView.java */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            int[] iArr = b.f356851p;
        }
    }

    /* compiled from: NavigationBarItemView.java */
    /* renamed from: com.google.android.material.navigation.b$b, reason: collision with other inner class name */
    public static class C10641b {
        public C10641b() {
        }

        public /* synthetic */ C10641b(com.google.android.material.navigation.a aVar) {
            this();
        }
    }

    /* compiled from: NavigationBarItemView.java */
    public static class c extends C10641b {
        public c() {
            super(null);
        }

        public /* synthetic */ c(com.google.android.material.navigation.a aVar) {
            this();
        }
    }

    static {
        com.google.android.material.navigation.a aVar = null;
        f356852q = new C10641b(aVar);
        f356853r = new c(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.widget.TextView r4, @j.f0 int r5) throws android.content.res.Resources.NotFoundException {
        /*
            r4.setTextAppearance(r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lc
        La:
            r5 = r1
            goto L4e
        Lc:
            int[] r2 = com.google.android.material.R.styleable.TextAppearance
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            int r3 = com.google.android.material.R.styleable.TextAppearance_android_textSize
            boolean r3 = r5.getValue(r3, r2)
            r5.recycle()
            if (r3 != 0) goto L23
            goto La
        L23:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L40
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L4e
        L40:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L4e:
            if (r5 == 0) goto L54
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.b.b(android.widget.TextView, int):void");
    }

    private View getIconOrContainer() {
        return null;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i12 = 0;
        for (int i13 = 0; i13 < iIndexOfChild; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            if ((childAt instanceof b) && childAt.getVisibility() == 0) {
                i12++;
            }
        }
        return i12;
    }

    private int getSuggestedIconHeight() {
        com.google.android.material.badge.b bVar = this.f356867o;
        Math.max(bVar != null ? bVar.getMinimumHeight() / 2 : 0, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin);
        throw null;
    }

    private int getSuggestedIconWidth() {
        com.google.android.material.badge.b bVar = this.f356867o;
        Math.max(bVar == null ? 0 : bVar.getMinimumWidth() - this.f356867o.f355884f.f355844b.f355872s.intValue(), ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).leftMargin);
        throw null;
    }

    public final void a() {
        Drawable rippleDrawable = this.f356855c;
        if (this.f356854b != null) {
            getActiveIndicatorDrawable();
            if (this.f356865m) {
                getActiveIndicatorDrawable();
            }
            if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(com.google.android.material.ripple.b.a(this.f356854b), null, null);
            }
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        setBackground(rippleDrawable);
        setDefaultFocusHighlightEnabled(true);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public final void d(@N k kVar) {
        this.f356861i = kVar;
        setCheckable(kVar.isCheckable());
        setChecked(kVar.isChecked());
        setEnabled(kVar.isEnabled());
        setIcon(kVar.getIcon());
        setTitle(kVar.f21865e);
        setId(kVar.f21861a);
        if (!TextUtils.isEmpty(kVar.f21877q)) {
            setContentDescription(kVar.f21877q);
        }
        K0.a(this, !TextUtils.isEmpty(kVar.f21878r) ? kVar.f21878r : kVar.f21865e);
        setVisibility(kVar.isVisible() ? 0 : 8);
    }

    @P
    public Drawable getActiveIndicatorDrawable() {
        return null;
    }

    @P
    public com.google.android.material.badge.b getBadge() {
        return this.f356867o;
    }

    @InterfaceC42165v
    public int getItemBackgroundResId() {
        return com.google.android.material.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.p.a
    @P
    public k getItemData() {
        return this.f356861i;
    }

    @InterfaceC42161q
    public int getItemDefaultMarginResId() {
        return com.google.android.material.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    @I
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f356860h;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        throw null;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    @N
    public final int[] onCreateDrawableState(int i12) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i12 + 1);
        k kVar = this.f356861i;
        if (kVar != null && kVar.isCheckable() && this.f356861i.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f356851p);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.material.badge.b bVar = this.f356867o;
        if (bVar != null && bVar.isVisible()) {
            k kVar = this.f356861i;
            CharSequence charSequence = kVar.f21865e;
            if (!TextUtils.isEmpty(kVar.f21877q)) {
                charSequence = this.f356861i.f21877q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f356867o.c()));
        }
        androidx.core.view.accessibility.f fVar = new androidx.core.view.accessibility.f(accessibilityNodeInfo);
        fVar.n(f.g.a(0, 1, getItemVisiblePosition(), 1, isSelected()));
        if (isSelected()) {
            fVar.l(false);
            fVar.h(f.a.f45004g);
        }
        fVar.r(getResources().getString(com.google.android.material.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        post(new a());
    }

    public void setActiveIndicatorEnabled(boolean z12) {
        this.f356865m = z12;
        a();
    }

    public void setActiveIndicatorHeight(int i12) {
        getWidth();
    }

    public void setActiveIndicatorMarginHorizontal(@U int i12) {
        getWidth();
    }

    public void setActiveIndicatorResizeable(boolean z12) {
        this.f356866n = z12;
    }

    public void setActiveIndicatorWidth(int i12) {
        getWidth();
    }

    public void setBadge(@N com.google.android.material.badge.b bVar) {
        if (this.f356867o == bVar) {
            return;
        }
        this.f356867o = bVar;
    }

    public void setCheckable(boolean z12) {
        refreshDrawableState();
    }

    public void setChecked(boolean z12) {
        throw null;
    }

    @Override // android.view.View
    public void setEnabled(boolean z12) {
        super.setEnabled(z12);
        throw null;
    }

    public void setIcon(@P Drawable drawable) {
        if (drawable == this.f356863k) {
            return;
        }
        this.f356863k = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            Drawable drawableMutate = drawable.mutate();
            this.f356864l = drawableMutate;
            ColorStateList colorStateList = this.f356862j;
            if (colorStateList != null) {
                drawableMutate.setTintList(colorStateList);
            }
        }
        throw null;
    }

    public void setIconSize(int i12) {
        throw null;
    }

    public void setIconTintList(@P ColorStateList colorStateList) {
        Drawable drawable;
        this.f356862j = colorStateList;
        if (this.f356861i == null || (drawable = this.f356864l) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f356864l.invalidateSelf();
    }

    public void setItemBackground(int i12) {
        setItemBackground(i12 == 0 ? null : androidx.core.content.d.getDrawable(getContext(), i12));
    }

    public void setItemPaddingBottom(int i12) {
        if (this.f356857e != i12) {
            this.f356857e = i12;
            k kVar = this.f356861i;
            if (kVar != null) {
                setChecked(kVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i12) {
        if (this.f356856d != i12) {
            this.f356856d = i12;
            k kVar = this.f356861i;
            if (kVar != null) {
                setChecked(kVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i12) {
        this.f356860h = i12;
    }

    public void setItemRippleColor(@P ColorStateList colorStateList) {
        this.f356854b = colorStateList;
        a();
    }

    public void setLabelVisibilityMode(int i12) {
        if (this.f356858f != i12) {
            this.f356858f = i12;
            if (this.f356866n) {
            }
            getWidth();
            k kVar = this.f356861i;
            if (kVar != null) {
                setChecked(kVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z12) {
        if (this.f356859g != z12) {
            this.f356859g = z12;
            k kVar = this.f356861i;
            if (kVar != null) {
                setChecked(kVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(@f0 int i12) throws Resources.NotFoundException {
        b(null, i12);
        throw null;
    }

    public void setTextAppearanceInactive(@f0 int i12) throws Resources.NotFoundException {
        b(null, i12);
        throw null;
    }

    public void setTextColor(@P ColorStateList colorStateList) {
        if (colorStateList != null) {
            throw null;
        }
    }

    public void setTitle(@P CharSequence charSequence) {
        throw null;
    }

    public void setItemBackground(@P Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f356855c = drawable;
        a();
    }

    public void setActiveIndicatorDrawable(@P Drawable drawable) {
    }
}
