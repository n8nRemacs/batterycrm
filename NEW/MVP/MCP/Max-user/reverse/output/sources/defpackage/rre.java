package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class rre extends FrameLayout {
    public final Object a;
    public final Object b;

    public rre(final Context context) {
        super(context, null);
        final int i = 0;
        this.a = ipi.b(3, new cm6() { // from class: qre
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TextView textView = new TextView(context);
                        textView.setId(qab.s);
                        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        dpg.F.b(textView, t75.b);
                        tqi.c(new ipe(3, null, 5), textView);
                        fqi.c(this, textView, -1);
                        return textView;
                    default:
                        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
                        simpleDraweeView.setId(qab.r);
                        fqi.c(this, simpleDraweeView, -1);
                        return simpleDraweeView;
                }
            }
        });
        final int i2 = 1;
        this.b = ipi.b(3, new cm6() { // from class: qre
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TextView textView = new TextView(context);
                        textView.setId(qab.s);
                        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        dpg.F.b(textView, t75.b);
                        tqi.c(new ipe(3, null, 5), textView);
                        fqi.c(this, textView, -1);
                        return textView;
                    default:
                        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
                        simpleDraweeView.setId(qab.r);
                        fqi.c(this, simpleDraweeView, -1);
                        return simpleDraweeView;
                }
            }
        });
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setMinimumHeight(kti.d(48 * vw4.d().getDisplayMetrics().density));
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, k18] */
    public final void setTitle(wme wmeVar) {
        FrameLayout.LayoutParams layoutParams;
        boolean z = wmeVar instanceof ume;
        int i = 8388611;
        ?? r6 = this.b;
        ?? r8 = this.a;
        if (z) {
            if (r8.e()) {
                ((TextView) r8.getValue()).setVisibility(8);
            }
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) r6.getValue();
            simpleDraweeView.setVisibility(0);
            ((gr6) simpleDraweeView.getHierarchy()).i(null, 5);
            ((gr6) simpleDraweeView.getHierarchy()).k(null);
            c2c c2cVarA = zk6.a.a();
            c2cVarA.i = simpleDraweeView.getController();
            ume umeVar = (ume) wmeVar;
            c2cVarA.b = (rf7) umeVar.e.getValue();
            simpleDraweeView.setController(c2cVarA.a());
            float f = 16;
            setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(20 * vw4.d().getDisplayMetrics().density), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(10 * vw4.d().getDisplayMetrics().density));
            ViewGroup.LayoutParams layoutParams2 = simpleDraweeView.getLayoutParams();
            layoutParams = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams != null) {
                layoutParams.width = umeVar.c;
                layoutParams.height = umeVar.d;
                int iV = az1.v(umeVar.b);
                if (iV != 0) {
                    if (iV != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 17;
                }
                layoutParams.gravity = i;
            }
        } else {
            if (!(wmeVar instanceof vme)) {
                throw new NoWhenBranchMatchedException();
            }
            if (r6.e()) {
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) r6.getValue();
                simpleDraweeView2.setVisibility(8);
                simpleDraweeView2.setController(null);
                ((gr6) simpleDraweeView2.getHierarchy()).i(null, 5);
                ((gr6) simpleDraweeView2.getHierarchy()).k(null);
            }
            TextView textView = (TextView) r8.getValue();
            textView.setVisibility(0);
            float f2 = 12;
            float f3 = 14;
            setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density));
            vme vmeVar = (vme) wmeVar;
            textView.setText(vmeVar.a.d(this));
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            layoutParams = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams != null) {
                int iV2 = az1.v(vmeVar.b);
                if (iV2 != 0) {
                    if (iV2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 17;
                }
                layoutParams.gravity = i;
            }
        }
        requestLayout();
        invalidate();
    }
}
