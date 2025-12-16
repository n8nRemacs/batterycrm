package androidx.core.widget;

import android.widget.ProgressBar;

/* compiled from: ContentLoadingProgressBar.java */
/* loaded from: classes.dex */
public class e extends ProgressBar {
    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(null);
        removeCallbacks(null);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(null);
        removeCallbacks(null);
    }
}
