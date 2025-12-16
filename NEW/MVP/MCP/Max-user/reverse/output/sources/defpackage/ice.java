package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class ice extends l98 {
    public sm6 X;
    public final mu8 o;

    public ice(mu8 mu8Var) {
        super(yf4.f);
        this.o = mu8Var;
        this.X = new hwd(3);
    }

    @Override // defpackage.l98
    public final void D(List list, List list2) {
        this.X.invoke(list, list2);
    }

    @Override // defpackage.phd
    public final void r(mid midVar, int i) throws NumberFormatException {
        hce hceVar = (hce) midVar;
        ece eceVar = (ece) C(i);
        OneMeDraweeView oneMeDraweeView = hceVar.F0;
        Uri uri = eceVar.Z;
        hceVar.H0 = eceVar;
        Uri uri2 = hceVar.I0;
        Uri uri3 = eceVar.d;
        if (!fni.a(uri2, uri3) || !fni.a(hceVar.J0, uri)) {
            hceVar.I0 = uri3;
            hceVar.J0 = uri;
            sf7 sf7VarD = sf7.d(uri3);
            sf7VarD.h = true;
            if (uri != null) {
                sf7VarD.k = new rkb(oneMeDraweeView.getContext(), uri);
            }
            rf7 rf7VarA = sf7VarD.a();
            int i2 = OneMeDraweeView.B0;
            oneMeDraweeView.i(rf7VarA, null);
        }
        hceVar.G0.setVisibility(eceVar.a.v0 == ud8.d ? 0 : 8);
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        int i2 = hce.K0;
        Context context = viewGroup.getContext();
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Drawable drawableB = r34.b(context, l1b.g);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 10.0f);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        float f = 20;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density), 8388613);
        float f2 = 4;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f2);
        layoutParams.setMargins(iD, iD, iD, iD);
        appCompatImageView.setLayoutParams(layoutParams);
        int iD2 = kti.d(vw4.d().getDisplayMetrics().density * f2);
        appCompatImageView.setPadding(iD2, iD2, iD2, iD2);
        appCompatImageView.setImageDrawable(drawableB);
        appCompatImageView.setBackground(gradientDrawable);
        Drawable drawableB2 = r34.b(context, l1b.l);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 8388693);
        int iD3 = kti.d(f2 * vw4.d().getDisplayMetrics().density);
        layoutParams2.setMargins(iD3, iD3, iD3, iD3);
        appCompatImageView2.setLayoutParams(layoutParams2);
        appCompatImageView2.setImageDrawable(drawableB2);
        FrameLayout frameLayout = new FrameLayout(context);
        float f3 = 64;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        float f4 = 2;
        layoutParams3.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f4), ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, kti.d(f4 * vw4.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin);
        frameLayout.setLayoutParams(layoutParams3);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(vw4.d().getDisplayMetrics().density * 12.0f);
        frameLayout.setBackground(gradientDrawable2);
        frameLayout.setClipToOutline(true);
        frameLayout.addView(oneMeDraweeView);
        frameLayout.addView(appCompatImageView);
        frameLayout.addView(appCompatImageView2);
        tqi.c(new uh1(drawableB, drawableB2, gradientDrawable, null, 5), frameLayout);
        return new hce(this.o, oneMeDraweeView, appCompatImageView, appCompatImageView2, frameLayout);
    }
}
