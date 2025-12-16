package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class m59 extends mid {
    public final View E0;
    public final ImageView F0;
    public final ProgressBar G0;
    public final TextView H0;
    public final /* synthetic */ n59 I0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m59(n59 n59Var, View view) {
        super(view);
        this.I0 = n59Var;
        this.E0 = view;
        this.F0 = (ImageView) view.findViewById(pxc.mr_picker_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(pxc.mr_picker_route_progress_bar);
        this.G0 = progressBar;
        this.H0 = (TextView) view.findViewById(pxc.mr_picker_route_name);
        r69.i(n59Var.t0.Z, progressBar);
    }
}
