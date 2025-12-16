package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import defpackage.bwc;
import defpackage.eri;
import defpackage.jxc;
import defpackage.k69;
import defpackage.pxc;
import defpackage.r6;
import defpackage.r69;
import defpackage.s34;
import defpackage.t35;
import defpackage.v59;
import defpackage.x59;
import defpackage.y59;
import defpackage.y6i;

/* loaded from: classes.dex */
public final class g extends e {
    public final View I0;
    public final ImageView J0;
    public final ProgressBar K0;
    public final TextView L0;
    public final RelativeLayout M0;
    public final CheckBox N0;
    public final float O0;
    public final int P0;
    public final r6 Q0;
    public final /* synthetic */ v59 R0;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(v59 v59Var, View view) throws Resources.NotFoundException {
        this.R0 = v59Var;
        x59 x59Var = v59Var.w0;
        super(x59Var, view, (ImageButton) view.findViewById(pxc.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(pxc.mr_cast_volume_slider));
        this.Q0 = new r6(9, this);
        this.I0 = view;
        this.J0 = (ImageView) view.findViewById(pxc.mr_cast_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(pxc.mr_cast_route_progress_bar);
        this.K0 = progressBar;
        this.L0 = (TextView) view.findViewById(pxc.mr_cast_route_name);
        this.M0 = (RelativeLayout) view.findViewById(pxc.mr_cast_volume_layout);
        CheckBox checkBox = (CheckBox) view.findViewById(pxc.mr_cast_checkbox);
        this.N0 = checkBox;
        Context context = x59Var.x0;
        Drawable drawableA = eri.a(context, jxc.mr_cast_checkbox);
        if (r69.h(context)) {
            t35.g(drawableA, s34.a(context, r69.a));
        }
        checkBox.setButtonDrawable(drawableA);
        r69.i(x59Var.x0, progressBar);
        this.O0 = r69.c(x59Var.x0);
        Resources resources = x59Var.x0.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(bwc.mr_dynamic_dialog_row_height, typedValue, true);
        this.P0 = (int) typedValue.getDimension(displayMetrics);
    }

    public final boolean C(k69 k69Var) {
        if (k69Var.g()) {
            return true;
        }
        y6i y6iVarB = this.R0.w0.s0.b(k69Var);
        if (y6iVarB == null) {
            return false;
        }
        y59 y59Var = (y59) y6iVarB.b;
        return (y59Var != null ? y59Var.b : 1) == 3;
    }

    public final void D(boolean z, boolean z2) {
        CheckBox checkBox = this.N0;
        checkBox.setEnabled(false);
        this.I0.setEnabled(false);
        checkBox.setChecked(z);
        if (z) {
            this.J0.setVisibility(4);
            this.K0.setVisibility(0);
        }
        if (z2) {
            this.R0.C(this.M0, z ? this.P0 : 0);
        }
    }
}
