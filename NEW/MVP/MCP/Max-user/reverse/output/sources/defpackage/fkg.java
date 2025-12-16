package defpackage;

import android.view.ViewGroup;
import android.widget.ScrollView;

/* loaded from: classes2.dex */
public final class fkg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yfb b;
    public final /* synthetic */ ScrollView c;

    public /* synthetic */ fkg(yfb yfbVar, ScrollView scrollView, int i) {
        this.a = i;
        this.b = yfbVar;
        this.c = scrollView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yfb yfbVar = this.b;
                ViewGroup.LayoutParams layoutParams = yfbVar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int measuredHeight = yfbVar.getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                ScrollView scrollView = this.c;
                scrollView.setPadding(scrollView.getPaddingLeft(), measuredHeight, scrollView.getPaddingRight(), scrollView.getPaddingBottom());
                break;
            case 1:
                yfb yfbVar2 = this.b;
                ViewGroup.LayoutParams layoutParams2 = yfbVar2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                int measuredHeight2 = yfbVar2.getMeasuredHeight() + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0);
                ScrollView scrollView2 = this.c;
                scrollView2.setPadding(scrollView2.getPaddingLeft(), measuredHeight2, scrollView2.getPaddingRight(), scrollView2.getPaddingBottom());
                break;
            default:
                yfb yfbVar3 = this.b;
                ViewGroup.LayoutParams layoutParams3 = yfbVar3.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int measuredHeight3 = yfbVar3.getMeasuredHeight() + (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0);
                ScrollView scrollView3 = this.c;
                scrollView3.setPadding(scrollView3.getPaddingLeft(), measuredHeight3, scrollView3.getPaddingRight(), scrollView3.getPaddingBottom());
                break;
        }
    }
}
