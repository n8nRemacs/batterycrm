package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class gg4 extends ng4 implements View.OnClickListener {
    public final View.OnClickListener o;

    public gg4(long j, View.OnClickListener onClickListener) {
        super(j);
        this.o = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c) {
            this.c = false;
            this.o.onClick(view);
            view.postDelayed(new ue(10, (e44) this.d), this.b);
        }
    }
}
