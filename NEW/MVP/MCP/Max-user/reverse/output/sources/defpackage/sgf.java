package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class sgf extends y0f {
    public final c08 X;
    public qk8 Y;
    public final ulc Z;
    public final ExecutorService o;
    public final vgd s0;

    public sgf(ExecutorService executorService, c08 c08Var) {
        super(executorService);
        this.o = executorService;
        this.X = c08Var;
        this.Z = new ulc(6, new zkb(7, this));
        this.s0 = new vgd(5, this);
    }

    @Override // defpackage.y0f, defpackage.phd
    public final int l(int i) {
        return ((t98) C(i)).getK0();
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        if (i != w5b.r) {
            return i == uab.k ? new c62(viewGroup.getContext(), new sxa(0, this.X, c08.class, "onRecentClearClick", "onRecentClearClick()V", 0, 7)) : i == uab.l ? new d44(viewGroup.getContext(), this.Y, this.o, this.s0) : ulc.m(this.Z, viewGroup.getContext(), i);
        }
        Context context = viewGroup.getContext();
        sxa sxaVar = new sxa(0, this.X, c08.class, "onFakeSearchClick", "onFakeSearchClick()V", 0, 6);
        TextView textView = new TextView(context);
        textView.setId(w5b.e);
        int iD = kti.d(10 * vw4.d().getDisplayMetrics().density);
        int iD2 = kti.d(12 * vw4.d().getDisplayMetrics().density);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        layoutParams.topMargin = kti.d(2 * vw4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        textView.setClipToOutline(true);
        textView.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 10.0f));
        textView.setText(context.getString(avd.z0));
        Drawable drawableB = r34.b(context, y9b.s);
        ArrayList arrayList = b6g.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(kti.d(8 * vw4.d().getDisplayMetrics().density));
        textView.setPadding(iD2, iD, iD2, iD);
        dpg.h.b(textView, t75.b);
        tqi.c(new ipe(3, null, 8), textView);
        f8j.d(textView, 300L, new pcc(16, sxaVar));
        return new v01(textView, 26);
    }
}
