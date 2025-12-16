package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* loaded from: classes2.dex */
public final class m5e extends FrameLayout implements u6g {
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        View childAt = getChildAt(0);
        ProgressBar progressBar = childAt instanceof ProgressBar ? (ProgressBar) childAt : null;
        if (progressBar != null) {
            cei.l(progressBar, yebVar.getIcon().i);
        }
    }
}
