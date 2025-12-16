package defpackage;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/* loaded from: classes2.dex */
public final class ekg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ ScrollView c;

    public /* synthetic */ ekg(LinearLayout linearLayout, ScrollView scrollView, int i) {
        this.a = i;
        this.b = linearLayout;
        this.c = scrollView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                LinearLayout linearLayout = this.b;
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int measuredHeight = linearLayout.getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
                ScrollView scrollView = this.c;
                scrollView.setPadding(scrollView.getPaddingLeft(), scrollView.getPaddingTop(), scrollView.getPaddingRight(), measuredHeight);
                break;
            default:
                LinearLayout linearLayout2 = this.b;
                ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                int measuredHeight2 = linearLayout2.getMeasuredHeight() + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
                ScrollView scrollView2 = this.c;
                scrollView2.setPadding(scrollView2.getPaddingLeft(), scrollView2.getPaddingTop(), scrollView2.getPaddingRight(), measuredHeight2);
                break;
        }
    }
}
