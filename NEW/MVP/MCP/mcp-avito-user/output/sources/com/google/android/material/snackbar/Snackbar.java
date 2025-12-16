package com.google.android.material.snackbar;

import aZ0.InterfaceC19845a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.o;
import j.N;
import j.P;

/* loaded from: classes6.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f357318E = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* renamed from: C, reason: collision with root package name */
    @P
    public final AccessibilityManager f357319C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f357320D;

    @RestrictTo
    public static final class SnackbarLayout extends BaseTransientBottomBar.j {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.j, android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i12, int i13) {
            super.onMeasure(i12, i13);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.j, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@P Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.j, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@P Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.j, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@P ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.j, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@P PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.j, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.j, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@P View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    public Snackbar(@N Context context, @N ViewGroup viewGroup, @N SnackbarContentLayout snackbarContentLayout, @N SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f357319C = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[LOOP:0: B:3:0x0002->B:35:?, LOOP_END, SYNTHETIC] */
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.material.snackbar.Snackbar j(@j.N android.view.View r7, @j.N java.lang.CharSequence r8, int r9) {
        /*
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r2 == 0) goto L9
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L9:
            boolean r2 = r7 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L1c
            int r1 = r7.getId()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 != r2) goto L19
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L19:
            r1 = r7
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L1c:
            if (r7 == 0) goto L2a
            android.view.ViewParent r7 = r7.getParent()
            boolean r2 = r7 instanceof android.view.View
            if (r2 == 0) goto L29
            android.view.View r7 = (android.view.View) r7
            goto L2a
        L29:
            r7 = r0
        L2a:
            if (r7 != 0) goto L2
            r7 = r1
        L2d:
            if (r7 == 0) goto L71
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            int[] r2 = com.google.android.material.snackbar.Snackbar.f357318E
            android.content.res.TypedArray r2 = r0.obtainStyledAttributes(r2)
            r3 = 0
            r4 = -1
            int r5 = r2.getResourceId(r3, r4)
            r6 = 1
            int r6 = r2.getResourceId(r6, r4)
            r2.recycle()
            if (r5 == r4) goto L52
            if (r6 == r4) goto L52
            int r2 = com.google.android.material.R.layout.mtrl_layout_snackbar_include
            goto L54
        L52:
            int r2 = com.google.android.material.R.layout.design_layout_snackbar_include
        L54:
            android.view.View r1 = r1.inflate(r2, r7, r3)
            com.google.android.material.snackbar.SnackbarContentLayout r1 = (com.google.android.material.snackbar.SnackbarContentLayout) r1
            com.google.android.material.snackbar.Snackbar r2 = new com.google.android.material.snackbar.Snackbar
            r2.<init>(r0, r7, r1, r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$j r7 = r2.f357285i
            android.view.View r7 = r7.getChildAt(r3)
            com.google.android.material.snackbar.SnackbarContentLayout r7 = (com.google.android.material.snackbar.SnackbarContentLayout) r7
            android.widget.TextView r7 = r7.getMessageView()
            r7.setText(r8)
            r2.f357287k = r9
            return r2
        L71:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "No suitable parent found from the given view. Please provide a valid view."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.Snackbar.j(android.view.View, java.lang.CharSequence, int):com.google.android.material.snackbar.Snackbar");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final void a() {
        b(3);
    }

    public final boolean i() {
        boolean zC2;
        o oVarB = o.b();
        BaseTransientBottomBar.c cVar = this.f357299w;
        synchronized (oVarB.f357341a) {
            zC2 = oVarB.c(cVar);
        }
        return zC2;
    }

    @InterfaceC19845a
    @N
    public final void k(@P CharSequence charSequence, @P View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f357285i.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.f357320D = false;
        } else {
            this.f357320D = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new com.avito.android.verification.verification_input_inn.o(12, this, onClickListener));
        }
    }

    public final void l() {
        o oVarB = o.b();
        int i12 = this.f357287k;
        boolean z12 = false;
        int recommendedTimeoutMillis = -2;
        if (i12 != -2) {
            int i13 = Build.VERSION.SDK_INT;
            AccessibilityManager accessibilityManager = this.f357319C;
            if (i13 >= 29) {
                recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(i12, (this.f357320D ? 4 : 0) | 3);
            } else {
                if (this.f357320D && accessibilityManager.isTouchExplorationEnabled()) {
                    i12 = -2;
                }
                recommendedTimeoutMillis = i12;
            }
        }
        BaseTransientBottomBar.c cVar = this.f357299w;
        synchronized (oVarB.f357341a) {
            try {
                if (oVarB.c(cVar)) {
                    o.c cVar2 = oVarB.f357343c;
                    cVar2.f357347b = recommendedTimeoutMillis;
                    oVarB.f357342b.removeCallbacksAndMessages(cVar2);
                    oVarB.f(oVarB.f357343c);
                    return;
                }
                o.c cVar3 = oVarB.f357344d;
                if (cVar3 != null && cVar3.f357346a.get() == cVar) {
                    z12 = true;
                }
                if (z12) {
                    oVarB.f357344d.f357347b = recommendedTimeoutMillis;
                } else {
                    oVarB.f357344d = new o.c(recommendedTimeoutMillis, cVar);
                }
                o.c cVar4 = oVarB.f357343c;
                if (cVar4 == null || !oVarB.a(cVar4, 4)) {
                    oVarB.f357343c = null;
                    o.c cVar5 = oVarB.f357344d;
                    if (cVar5 != null) {
                        oVarB.f357343c = cVar5;
                        oVarB.f357344d = null;
                        o.b bVar = cVar5.f357346a.get();
                        if (bVar != null) {
                            bVar.show();
                        } else {
                            oVarB.f357343c = null;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static class a extends BaseTransientBottomBar.f<Snackbar> {
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.f
        public /* bridge */ /* synthetic */ void a(BaseTransientBottomBar baseTransientBottomBar, int i12) {
            c();
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.f
        public final /* bridge */ /* synthetic */ void b(BaseTransientBottomBar baseTransientBottomBar) {
        }

        public void c() {
        }
    }
}
