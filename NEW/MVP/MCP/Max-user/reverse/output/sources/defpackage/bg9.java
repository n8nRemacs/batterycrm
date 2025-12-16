package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class bg9 extends FrameLayout implements me3 {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public bg9(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.me3
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // defpackage.me3
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}
