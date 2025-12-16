package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class xrg extends vhd implements u6g {
    public FrameLayout X;
    public final jr9 a;
    public final EndlessRecyclerView2 b;
    public long c;
    public final mc5 d = new mc5(18);
    public final Rect o = new Rect();
    public t75 Y = t75.b;

    public xrg(jr9 jr9Var, EndlessRecyclerView2 endlessRecyclerView2) {
        this.a = jr9Var;
        this.b = endlessRecyclerView2;
    }

    @Override // defpackage.vhd
    public final void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        super.f(rect, view, recyclerView, iidVar);
        int iR = RecyclerView.R(view);
        mc5 mc5Var = this.d;
        if (iR >= 0) {
            jr9 jr9Var = this.a;
            if (iR < jr9Var.d.f.size()) {
                long j = this.c;
                if (j != 0) {
                    int iK = jr9Var.K(j);
                    MessageModel messageModelM = jr9Var.M(iK);
                    Long lValueOf = messageModelM != null ? Long.valueOf(messageModelM.c) : null;
                    if (iK == iR && (lValueOf == null || lValueOf.longValue() != j)) {
                        rect.top = i().getMeasuredHeight() + rect.top;
                    }
                }
                mc5Var.w(rect, view, recyclerView);
                return;
            }
        }
        mc5Var.w(rect, view, recyclerView);
    }

    @Override // defpackage.vhd
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int iK;
        MessageModel messageModelM;
        if (recyclerView.getChildCount() <= 0) {
            return;
        }
        jr9 jr9Var = this.a;
        if (jr9Var.j() <= 0) {
            return;
        }
        long j = this.c;
        if (j == 0 || (iK = jr9Var.K(j)) == -1) {
            return;
        }
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            int iR = RecyclerView.R(childAt);
            if (iR == iK && (messageModelM = jr9Var.M(iR)) != null && messageModelM.c != this.c) {
                View viewI = i();
                mc5 mc5Var = this.d;
                Rect rect = this.o;
                mc5Var.v(rect, childAt, iR);
                int i3 = rect.top;
                ViewGroup.LayoutParams layoutParams = viewI.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i4 = ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) / 2) + i3;
                canvas.save();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewI.getLayoutParams();
                int i5 = marginLayoutParams2.leftMargin;
                m8j.e(viewI, this.b, i5, marginLayoutParams2.topMargin, (viewI.getMeasuredWidth() + i5) - marginLayoutParams2.rightMargin, (viewI.getMeasuredHeight() + marginLayoutParams2.topMargin) - marginLayoutParams2.bottomMargin);
                canvas.translate(0.0f, i4);
                viewI.draw(canvas);
                canvas.restore();
            }
            i = i2;
        }
    }

    public final View i() {
        FrameLayout frameLayout = this.X;
        if (frameLayout != null) {
            return frameLayout;
        }
        EndlessRecyclerView2 endlessRecyclerView2 = this.b;
        int measuredWidth = endlessRecyclerView2.getMeasuredWidth();
        int measuredHeight = endlessRecyclerView2.getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            return new Space(endlessRecyclerView2.getContext());
        }
        FrameLayout frameLayout2 = new FrameLayout(endlessRecyclerView2.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        float f = 8;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        layoutParams.topMargin = iD;
        layoutParams.bottomMargin = iD;
        frameLayout2.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        v1a v1aVar = a93.s0;
        gradientDrawable.setColors(v1aVar.y(frameLayout2).a().G().b.w);
        frameLayout2.setBackground(gradientDrawable);
        TextView textView = new TextView(endlessRecyclerView2.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 17);
        int iD2 = kti.d(f * vw4.d().getDisplayMetrics().density);
        layoutParams2.topMargin = iD2;
        layoutParams2.bottomMargin = iD2;
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        textView.setTextColor(v1aVar.y(textView).a().G().g.b);
        textView.setText(textView.getContext().getString(l7b.q0));
        vz2.g.b(textView, this.Y);
        frameLayout2.addView(textView);
        frameLayout2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), ViewGroup.getChildMeasureSpec(endlessRecyclerView2.getMeasuredHeight(), 0, frameLayout2.getLayoutParams().height));
        this.X = frameLayout2;
        return frameLayout2;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        FrameLayout frameLayout = this.X;
        if (frameLayout != null) {
            Drawable background = frameLayout.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColors(yebVar.a().G().b.w);
            }
            ((TextView) frameLayout.getChildAt(0)).setTextColor(yebVar.a().G().g.b);
        }
    }
}
