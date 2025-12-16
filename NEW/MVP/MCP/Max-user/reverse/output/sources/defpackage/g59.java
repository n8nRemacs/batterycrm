package defpackage;

import android.util.Log;
import android.widget.SeekBar;
import androidx.mediarouter.app.d;

/* loaded from: classes.dex */
public final class g59 implements SeekBar.OnSeekBarChangeListener {
    public final r98 a = new r98(6, this);
    public final /* synthetic */ d b;

    public g59(d dVar) {
        this.b = dVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            k69 k69Var = (k69) seekBar.getTag();
            if (d.y1) {
                Log.d("MediaRouteCtrlDialog", "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(" + i + ")");
            }
            k69Var.j(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        d dVar = this.b;
        if (dVar.V0 != null) {
            dVar.T0.removeCallbacks(this.a);
        }
        dVar.V0 = (k69) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.T0.postDelayed(this.a, 500L);
    }
}
