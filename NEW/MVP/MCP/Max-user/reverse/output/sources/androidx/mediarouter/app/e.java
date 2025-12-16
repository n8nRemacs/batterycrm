package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import defpackage.eri;
import defpackage.jxc;
import defpackage.k69;
import defpackage.mid;
import defpackage.nvc;
import defpackage.r6;
import defpackage.r69;
import defpackage.s34;
import defpackage.t35;
import defpackage.x59;

/* loaded from: classes.dex */
public abstract class e extends mid {
    public k69 E0;
    public final ImageButton F0;
    public final MediaRouteVolumeSlider G0;
    public final /* synthetic */ x59 H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(x59 x59Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        int iA;
        int iA2;
        super(view);
        this.H0 = x59Var;
        this.F0 = imageButton;
        this.G0 = mediaRouteVolumeSlider;
        Context context = x59Var.x0;
        int i = jxc.mr_cast_mute_button;
        int i2 = r69.a;
        Drawable drawableA = eri.a(context, i);
        if (r69.h(context)) {
            t35.g(drawableA, s34.a(context, r69.a));
        }
        imageButton.setImageDrawable(drawableA);
        Context context2 = x59Var.x0;
        if (r69.h(context2)) {
            iA = s34.a(context2, nvc.mr_cast_progressbar_progress_and_thumb_light);
            iA2 = s34.a(context2, nvc.mr_cast_progressbar_background_light);
        } else {
            iA = s34.a(context2, nvc.mr_cast_progressbar_progress_and_thumb_dark);
            iA2 = s34.a(context2, nvc.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(iA, iA2);
    }

    public final void A(boolean z) {
        ImageButton imageButton = this.F0;
        if (imageButton.isActivated() == z) {
            return;
        }
        imageButton.setActivated(z);
        x59 x59Var = this.H0;
        if (z) {
            x59Var.H0.put(this.E0.c, Integer.valueOf(this.G0.getProgress()));
        } else {
            x59Var.H0.remove(this.E0.c);
        }
    }

    public final void z(k69 k69Var) {
        this.E0 = k69Var;
        int i = k69Var.o;
        boolean z = i == 0;
        ImageButton imageButton = this.F0;
        imageButton.setActivated(z);
        imageButton.setOnClickListener(new r6(7, this));
        k69 k69Var2 = this.E0;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.G0;
        mediaRouteVolumeSlider.setTag(k69Var2);
        mediaRouteVolumeSlider.setMax(k69Var.p);
        mediaRouteVolumeSlider.setProgress(i);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.H0.E0);
    }
}
