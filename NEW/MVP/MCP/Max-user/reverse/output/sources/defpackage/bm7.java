package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class bm7 extends FrameLayout implements hx0 {
    public static final /* synthetic */ int u0 = 0;
    public float a;
    public float b;
    public long c;
    public yl7 d;
    public final lx0 o;
    public am7 s0;
    public final ng4 t0;

    public bm7(Context context) {
        super(context, null);
        this.a = vw4.d().getDisplayMetrics().density * 16.0f;
        this.b = vw4.d().getDisplayMetrics().density * 6.0f;
        lx0 lx0Var = new lx0(getContext());
        this.o = lx0Var;
        this.t0 = new ng4(300L);
        lx0Var.setClickListener(this);
        lx0Var.setId(j7b.L);
        addView(lx0Var, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r28, defpackage.yl7 r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm7.a(long, yl7, boolean):void");
    }

    public final void setClickListener(am7 am7Var) {
        this.s0 = am7Var;
    }
}
