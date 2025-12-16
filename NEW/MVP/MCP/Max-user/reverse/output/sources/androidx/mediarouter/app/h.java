package androidx.mediarouter.app;

import android.view.View;

/* loaded from: classes.dex */
public final class h implements View.OnClickListener {
    public final /* synthetic */ MediaRouteExpandCollapseButton a;

    public h(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
        this.a = mediaRouteExpandCollapseButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.a;
        boolean z = mediaRouteExpandCollapseButton.u0;
        mediaRouteExpandCollapseButton.u0 = !z;
        if (z) {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.o);
            mediaRouteExpandCollapseButton.o.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.s0);
        } else {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.d);
            mediaRouteExpandCollapseButton.d.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.t0);
        }
        View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.v0;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
