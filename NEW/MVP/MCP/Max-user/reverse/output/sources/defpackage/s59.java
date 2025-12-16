package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class s59 extends mid {
    public final View E0;
    public final ImageView F0;
    public final ProgressBar G0;
    public final TextView H0;
    public final float I0;
    public k69 J0;
    public final /* synthetic */ v59 K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s59(v59 v59Var, View view) {
        super(view);
        this.K0 = v59Var;
        this.E0 = view;
        this.F0 = (ImageView) view.findViewById(pxc.mr_cast_group_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(pxc.mr_cast_group_progress_bar);
        this.G0 = progressBar;
        this.H0 = (TextView) view.findViewById(pxc.mr_cast_group_name);
        x59 x59Var = v59Var.w0;
        this.I0 = r69.c(x59Var.x0);
        r69.i(x59Var.x0, progressBar);
    }
}
