package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public final class n9d extends d2f implements u6g {
    public final o9d E0;
    public final GradientDrawable F0;
    public final RippleDrawable G0;
    public final RippleDrawable H0;
    public final qi I0;

    public n9d(Context context, o9d o9dVar) {
        ImageView imageView = new ImageView(context);
        super(imageView);
        this.E0 = o9dVar;
        v1a v1aVar = a93.s0;
        GradientDrawable gradientDrawableD = uga.d(Integer.valueOf(v1aVar.y(imageView).b().a.i), null, null);
        this.F0 = gradientDrawableD;
        this.G0 = new RippleDrawable(ColorStateList.valueOf(zob.b(v1aVar.y(imageView).getText().e, 0.3f)), gradientDrawableD, uga.d(-65536, null, null));
        this.H0 = new RippleDrawable(ColorStateList.valueOf(zob.b(v1aVar.y(imageView).getText().e, 0.3f)), null, null);
        this.I0 = new qi(5, this);
        imageView.setLayoutParams(new xhd(kti.d(o9dVar.a() * vw4.d().getDisplayMetrics().density), kti.d(o9dVar.a() * vw4.d().getDisplayMetrics().density)));
        imageView.setClipToOutline(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.addOnAttachStateChangeListener(new r40(imageView, 12, this));
    }

    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(m9d m9dVar) {
        int iD;
        boolean z = m9dVar.d;
        if (z) {
            iD = kti.d(((r1.a() - (b9j.b(this.E0.a) >= 360 ? 22 : 20)) / 2) * vw4.d().getDisplayMetrics().density);
        } else {
            iD = 0;
        }
        View view = this.a;
        view.setPadding(iD, iD, iD, iD);
        view.setBackground(z ? this.G0 : this.H0);
        ((ImageView) view).setImageDrawable(m9dVar.c);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.G0.setColor(ColorStateList.valueOf(zob.b(yebVar.getText().e, 0.3f)));
        this.F0.setColor(yebVar.b().a.i);
        this.H0.setColor(ColorStateList.valueOf(zob.b(yebVar.getText().e, 0.3f)));
    }
}
