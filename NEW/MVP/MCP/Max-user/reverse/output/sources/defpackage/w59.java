package defpackage;

import android.view.KeyEvent;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.e;

/* loaded from: classes.dex */
public final class w59 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ w59(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        switch (this.a) {
            case 0:
                if (z) {
                    k69 k69Var = (k69) seekBar.getTag();
                    e eVar = (e) ((x59) this.b).F0.get(k69Var.c);
                    if (eVar != null) {
                        eVar.A(i == 0);
                    }
                    k69Var.j(i);
                    break;
                }
                break;
            default:
                b4c b4cVar = (b4c) this.b;
                k41 k41Var = b4cVar.s0;
                if (!z || !b4cVar.u0) {
                    k41Var.setVisibility(8);
                    break;
                } else {
                    a4c a4cVar = b4cVar.v0;
                    if (a4cVar != null) {
                        ((dk7) a4cVar).A0.h(new s54(i));
                    }
                    ((TextView) k41Var.c).setText(z7i.a(i));
                    x4c x4cVar = b4cVar.o;
                    k41Var.setTranslationX(Math.min((x4cVar.getWidth() - b4cVar.d.getWidth()) - k41Var.getWidth(), Math.max(b4cVar.c.getWidth(), (x4cVar.getThumbOffset() + (b4cVar.getPaddingLeft() + x4cVar.getThumb().getBounds().centerX())) - (k41Var.getWidth() / 2.0f))));
                    break;
                }
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                x59 x59Var = (x59) this.b;
                if (x59Var.G0 != null) {
                    x59Var.B0.removeMessages(2);
                }
                x59Var.G0 = (k69) seekBar.getTag();
                break;
            default:
                a4c listener = ((b4c) this.b).getListener();
                if (listener != null) {
                    ((dk7) listener).A0.h(t54.a);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                ((x59) this.b).B0.sendEmptyMessageDelayed(2, 500L);
                break;
            default:
                b4c b4cVar = (b4c) this.b;
                a4c listener = b4cVar.getListener();
                if (listener != null) {
                    ((dk7) listener).A0.h(new u54(seekBar.getProgress()));
                }
                b4cVar.s0.setVisibility(8);
                break;
        }
    }
}
