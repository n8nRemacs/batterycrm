package com.google.android.exoplayer2.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class y implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f347662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f347663c;

    public /* synthetic */ y(Object obj, int i12) {
        this.f347662b = i12;
        this.f347663c = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int height;
        int height2;
        Object obj = this.f347663c;
        switch (this.f347662b) {
            case 0:
                z zVar = (z) obj;
                s sVar = zVar.f347667a;
                int width = (sVar.getWidth() - sVar.getPaddingLeft()) - sVar.getPaddingRight();
                int height3 = (sVar.getHeight() - sVar.getPaddingBottom()) - sVar.getPaddingTop();
                ViewGroup viewGroup = zVar.f347669c;
                int iC2 = z.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iC2, z.c(zVar.f347675i) + z.c(zVar.f347677k));
                ViewGroup viewGroup2 = zVar.f347670d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z12 = width <= iMax || height3 <= (height2 * 2) + paddingBottom;
                if (zVar.f347664A != z12) {
                    zVar.f347664A = z12;
                    view.post(new w(zVar, 1));
                }
                boolean z13 = i14 - i12 != i18 - i16;
                if (!zVar.f347664A && z13) {
                    view.post(new w(zVar, 2));
                    break;
                }
                break;
            default:
                float[] fArr = s.f347553z0;
                s sVar2 = (s) obj;
                sVar2.getClass();
                int i22 = i15 - i13;
                int i23 = i19 - i17;
                if (i14 - i12 != i18 - i16 || i22 != i23) {
                    PopupWindow popupWindow = sVar2.f347603n0;
                    if (popupWindow.isShowing()) {
                        sVar2.p();
                        int width2 = sVar2.getWidth() - popupWindow.getWidth();
                        int i24 = sVar2.f347607p0;
                        popupWindow.update(view, width2 - i24, (-popupWindow.getHeight()) - i24, -1, -1);
                        break;
                    }
                }
                break;
        }
    }
}
