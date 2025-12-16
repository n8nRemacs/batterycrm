package androidx.mediarouter.app;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import defpackage.bwc;
import defpackage.pxc;
import defpackage.v59;
import defpackage.x59;

/* loaded from: classes.dex */
public final class f extends e {
    public final TextView I0;
    public final int J0;
    public final /* synthetic */ v59 K0;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(v59 v59Var, View view) throws Resources.NotFoundException {
        this.K0 = v59Var;
        x59 x59Var = v59Var.w0;
        super(x59Var, view, (ImageButton) view.findViewById(pxc.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(pxc.mr_cast_volume_slider));
        this.I0 = (TextView) view.findViewById(pxc.mr_group_volume_route_name);
        Resources resources = x59Var.x0.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(bwc.mr_dynamic_volume_group_list_item_height, typedValue, true);
        this.J0 = (int) typedValue.getDimension(displayMetrics);
    }
}
