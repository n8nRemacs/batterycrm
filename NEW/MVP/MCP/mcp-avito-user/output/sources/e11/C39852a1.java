package e11;

import android.R;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ProgressBar;

/* renamed from: e11.a1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39852a1 extends ProgressBar implements R0 {
    @Override // e11.R0
    public void setColor(int i12) {
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(i12), 8388611, 1);
        ColorDrawable colorDrawable = new ColorDrawable(0);
        LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
        layerDrawable.setDrawableByLayerId(R.id.background, colorDrawable);
        layerDrawable.setDrawableByLayerId(R.id.progress, clipDrawable);
        setProgressDrawable(layerDrawable);
    }

    @Override // e11.R0
    public void setMaxTime(float f12) {
        setMax((int) (f12 * 1000.0f));
    }

    @Override // e11.R0
    public void setTimeChanged(float f12) {
        setProgress((int) (f12 * 1000.0f), true);
    }

    @Override // e11.R0
    public void setVisible(boolean z12) {
        setVisibility(z12 ? 0 : 8);
    }
}
