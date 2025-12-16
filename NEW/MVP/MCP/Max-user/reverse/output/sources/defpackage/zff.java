package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.facebook.drawee.view.SimpleDraweeView;

/* loaded from: classes2.dex */
public final class zff extends d2f implements j8e, s35 {
    public static final ShapeDrawable J0;
    public final SimpleDraweeView E0;
    public final TextView F0;
    public final TextView G0;
    public final View H0;
    public h8e I0;

    static {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float f = vw4.d().getDisplayMetrics().density * 16.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        J0 = shapeDrawable;
    }

    public zff(Context context) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        int iD = kti.d(14 * vw4.d().getDisplayMetrics().density);
        int iD2 = kti.d(12 * vw4.d().getDisplayMetrics().density);
        frameLayout.setPadding(iD2, iD, iD2, iD);
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(frameLayout.getContext());
        float f = 40;
        int iD3 = kti.d(vw4.d().getDisplayMetrics().density * f);
        int i = udb.o;
        simpleDraweeView.setId(i);
        simpleDraweeView.setLayoutParams(new FrameLayout.LayoutParams(iD3, iD3, 8388627));
        ((gr6) simpleDraweeView.getHierarchy()).h(tyd.d);
        frameLayout.addView(simpleDraweeView);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, 16);
        float f2 = 10;
        layoutParams2.leftMargin = u45.c(f2, vw4.d().getDisplayMetrics().density, kti.d(f * vw4.d().getDisplayMetrics().density));
        float f3 = 24;
        layoutParams2.rightMargin = u45.c(f2, vw4.d().getDisplayMetrics().density, kti.d(vw4.d().getDisplayMetrics().density * f3));
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        int i2 = udb.q;
        textView.setId(i2);
        dpg.g.b(textView, t75.b);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        int i3 = udb.p;
        textView2.setId(i3);
        dpg.l.b(textView2, t75.b);
        linearLayout.addView(textView2);
        tqi.c(new oe6(textView, textView2, null, 2), linearLayout);
        frameLayout.addView(linearLayout);
        AppCompatImageView appCompatImageView = new AppCompatImageView(frameLayout.getContext(), null);
        int iD4 = kti.d(f3 * vw4.d().getDisplayMetrics().density);
        int i4 = udb.n;
        appCompatImageView.setId(i4);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(iD4, iD4, 8388629));
        appCompatImageView.setImageResource(tdb.a);
        tqi.c(new zrb(3, null, 1), appCompatImageView);
        frameLayout.addView(appCompatImageView);
        tqi.c(new sv2(3, null, 8), frameLayout);
        super(frameLayout);
        this.E0 = (SimpleDraweeView) frameLayout.findViewById(i);
        this.F0 = (TextView) frameLayout.findViewById(i2);
        this.G0 = (TextView) frameLayout.findViewById(i3);
        this.H0 = frameLayout.findViewById(i4);
    }

    @Override // defpackage.j8e
    public final void b(qif qifVar) {
        View view = this.a;
        if (qifVar != null) {
            f8j.d(view, 300L, new wfe(this, 12, qifVar));
        } else {
            view.setOnClickListener(null);
        }
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        if (t98Var instanceof f8e) {
            this.I0 = (h8e) t98Var;
            f8e f8eVar = (f8e) t98Var;
            this.E0.setImageURI(f8eVar.b);
            this.F0.setText(f8eVar.c);
            this.G0.setText(f8eVar.d);
        }
    }
}
