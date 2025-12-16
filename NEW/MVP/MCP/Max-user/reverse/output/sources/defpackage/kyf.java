package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class kyf extends LinearLayout {
    public static final /* synthetic */ int y0 = 0;
    public iyf a;
    public TextView b;
    public ImageView c;
    public View d;
    public wg0 o;
    public View s0;
    public TextView t0;
    public ImageView u0;
    public Drawable v0;
    public int w0;
    public final /* synthetic */ TabLayout x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyf(TabLayout tabLayout, Context context) {
        super(context);
        this.x0 = tabLayout;
        this.w0 = 2;
        e(context);
        int i = tabLayout.o;
        int i2 = tabLayout.s0;
        int i3 = tabLayout.t0;
        int i4 = tabLayout.u0;
        WeakHashMap weakHashMap = hfh.a;
        setPaddingRelative(i, i2, i3, i4);
        setGravity(17);
        setOrientation(!tabLayout.P0 ? 1 : 0);
        setClickable(true);
        xeh.d(this, o5c.b(getContext(), 1002));
    }

    private wg0 getBadge() {
        return this.o;
    }

    private wg0 getOrCreateBadge() {
        if (this.o == null) {
            this.o = new wg0(getContext());
        }
        b();
        wg0 wg0Var = this.o;
        if (wg0Var != null) {
            return wg0Var;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void a() {
        if (this.o != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.d;
            if (view != null) {
                wg0 wg0Var = this.o;
                if (wg0Var != null) {
                    if (wg0Var.c() != null) {
                        wg0Var.c().setForeground(null);
                    } else {
                        view.getOverlay().remove(wg0Var);
                    }
                }
                this.d = null;
            }
        }
    }

    public final void b() {
        if (this.o != null) {
            if (this.s0 != null) {
                a();
                return;
            }
            TextView textView = this.b;
            if (textView == null || this.a == null) {
                a();
                return;
            }
            if (this.d == textView) {
                c(textView);
                return;
            }
            a();
            TextView textView2 = this.b;
            if (this.o == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            wg0 wg0Var = this.o;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            wg0Var.setBounds(rect);
            wg0Var.h(textView2, null);
            if (wg0Var.c() != null) {
                wg0Var.c().setForeground(wg0Var);
            } else {
                textView2.getOverlay().add(wg0Var);
            }
            this.d = textView2;
        }
    }

    public final void c(View view) {
        wg0 wg0Var = this.o;
        if (wg0Var == null || view != this.d) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        wg0Var.setBounds(rect);
        wg0Var.h(view, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r3 = this;
            r3.f()
            iyf r0 = r3.a
            if (r0 == 0) goto L20
            com.google.android.material.tabs.TabLayout r1 = r0.c
            if (r1 == 0) goto L18
            int r1 = r1.getSelectedTabPosition()
            r2 = -1
            if (r1 == r2) goto L20
            int r0 = r0.a
            if (r1 != r0) goto L20
            r0 = 1
            goto L21
        L18:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Tab not attached to a TabLayout"
            r0.<init>(r1)
            throw r0
        L20:
            r0 = 0
        L21:
            r3.setSelected(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyf.d():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v0;
        if ((drawable == null || !drawable.isStateful()) ? false : this.v0.setState(drawableState)) {
            invalidate();
            this.x0.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View, kyf] */
    public final void e(Context context) {
        TabLayout tabLayout = this.x0;
        int i = tabLayout.F0;
        if (i != 0) {
            Drawable drawableA = eri.a(context, i);
            this.v0 = drawableA;
            if (drawableA != null && drawableA.isStateful()) {
                this.v0.setState(getDrawableState());
            }
        } else {
            this.v0 = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.A0 != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateList = tabLayout.A0;
            int[] iArr = sqd.d;
            int iA = sqd.a(colorStateList, sqd.c);
            int[] iArr2 = sqd.b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{iA, sqd.a(colorStateList, iArr2), sqd.a(colorStateList, sqd.a)});
            boolean z = tabLayout.T0;
            if (z) {
                gradientDrawable = null;
            }
            gradientDrawable = new RippleDrawable(colorStateList2, gradientDrawable, z ? null : gradientDrawable2);
        }
        WeakHashMap weakHashMap = hfh.a;
        setBackground(gradientDrawable);
        tabLayout.invalidate();
    }

    public final void f() {
        int i;
        ViewParent parent;
        iyf iyfVar = this.a;
        View view = iyfVar != null ? iyfVar.b : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.s0;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.s0);
                }
                addView(view);
            }
            this.s0 = view;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.t0 = textView2;
            if (textView2 != null) {
                this.w0 = textView2.getMaxLines();
            }
            this.u0 = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.s0;
            if (view3 != null) {
                removeView(view3);
                this.s0 = null;
            }
            this.t0 = null;
            this.u0 = null;
        }
        if (this.s0 == null) {
            if (this.c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(k1d.design_layout_tab_icon, (ViewGroup) this, false);
                this.c = imageView2;
                addView(imageView2, 0);
            }
            if (this.b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(k1d.design_layout_tab_text, (ViewGroup) this, false);
                this.b = textView3;
                addView(textView3);
                this.w0 = this.b.getMaxLines();
            }
            TextView textView4 = this.b;
            TabLayout tabLayout = this.x0;
            textView4.setTextAppearance(tabLayout.v0);
            if (!isSelected() || (i = tabLayout.x0) == -1) {
                this.b.setTextAppearance(tabLayout.w0);
            } else {
                this.b.setTextAppearance(i);
            }
            ColorStateList colorStateList = tabLayout.y0;
            if (colorStateList != null) {
                this.b.setTextColor(colorStateList);
            }
            g(this.b, this.c, true);
            b();
            ImageView imageView3 = this.c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new pt1(this, imageView3));
            }
            TextView textView5 = this.b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new pt1(this, textView5));
            }
        } else {
            TextView textView6 = this.t0;
            if (textView6 != null || this.u0 != null) {
                g(textView6, this.u0, false);
            }
        }
        if (iyfVar == null || TextUtils.isEmpty(null)) {
            return;
        }
        setContentDescription(null);
    }

    public final void g(TextView textView, ImageView imageView, boolean z) {
        boolean z2;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (textView != null) {
            if (zIsEmpty) {
                z2 = false;
            } else {
                this.a.getClass();
                z2 = true;
            }
            textView.setText((CharSequence) null);
            textView.setVisibility(z2 ? 0 : 8);
            if (!zIsEmpty) {
                setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iB = (z2 && imageView.getVisibility() == 0) ? (int) yqi.b(getContext(), 8) : 0;
            if (this.x0.P0) {
                if (iB != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iB);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iB != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iB;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        gcg.a(this, null);
    }

    public int getContentHeight() {
        View[] viewArr = {this.b, this.c, this.s0};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.b, this.c, this.s0};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public iyf getTab() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r8) {
        /*
            r7 = this;
            super.onInitializeAccessibilityNodeInfo(r8)
            wg0 r0 = r7.o
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L85
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L85
            wg0 r0 = r7.o
            yg0 r3 = r0.o
            boolean r4 = r0.isVisible()
            r5 = 0
            if (r4 != 0) goto L1c
            goto L82
        L1c:
            xg0 r3 = r3.b
            java.lang.String r4 = r3.t0
            if (r4 == 0) goto L24
            r4 = r2
            goto L25
        L24:
            r4 = r1
        L25:
            if (r4 == 0) goto L33
            java.lang.CharSequence r5 = r3.y0
            if (r5 == 0) goto L2c
            goto L82
        L2c:
            yg0 r0 = r0.o
            xg0 r0 = r0.b
            java.lang.String r5 = r0.t0
            goto L82
        L33:
            boolean r4 = r0.f()
            if (r4 == 0) goto L80
            int r4 = r3.A0
            if (r4 == 0) goto L82
            java.lang.ref.WeakReference r4 = r0.a
            java.lang.Object r4 = r4.get()
            android.content.Context r4 = (android.content.Context) r4
            if (r4 != 0) goto L48
            goto L82
        L48:
            int r5 = r0.Z
            r6 = -2
            if (r5 == r6) goto L65
            int r5 = r0.d()
            int r6 = r0.Z
            if (r5 > r6) goto L56
            goto L65
        L56:
            int r0 = r3.B0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r5 = r4.getString(r0, r3)
            goto L82
        L65:
            android.content.res.Resources r4 = r4.getResources()
            int r3 = r3.A0
            int r5 = r0.d()
            int r0 = r0.d()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r5 = r4.getQuantityString(r3, r5, r0)
            goto L82
        L80:
            java.lang.CharSequence r5 = r3.z0
        L82:
            r8.setContentDescription(r5)
        L85:
            iyf r0 = r7.a
            int r0 = r0.a
            boolean r3 = r7.isSelected()
            l5 r0 = defpackage.l5.a(r3, r1, r2, r0, r2)
            java.lang.Object r0 = r0.a
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
            r8.setCollectionItemInfo(r0)
            boolean r0 = r7.isSelected()
            if (r0 == 0) goto Laa
            r8.setClickable(r1)
            g5 r0 = defpackage.g5.e
            java.lang.Object r0 = r0.a
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0
            r8.removeAction(r0)
        Laa:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = defpackage.s2d.item_view_role_description
            java.lang.String r0 = r0.getString(r1)
            android.os.Bundle r8 = r8.getExtras()
            java.lang.String r1 = "AccessibilityNodeInfo.roleDescription"
            r8.putCharSequence(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyf.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.x0;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.G0, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.b != null) {
            float f = tabLayout.D0;
            int i3 = this.w0;
            ImageView imageView = this.c;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.b;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.E0;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.b.getTextSize();
            int lineCount = this.b.getLineCount();
            int maxLines = this.b.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (tabLayout.O0 == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.b.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.b.setTextSize(0, f);
                this.b.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.a == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        this.a.a();
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.b;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.s0;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(iyf iyfVar) {
        if (iyfVar != this.a) {
            this.a = iyfVar;
            d();
        }
    }
}
