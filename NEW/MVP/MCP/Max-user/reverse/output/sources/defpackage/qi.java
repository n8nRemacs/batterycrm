package defpackage;

import android.widget.ImageView;
import one.me.rlottie.ImageReceiver;

/* loaded from: classes2.dex */
public final class qi implements ImageReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // one.me.rlottie.ImageReceiver
    public final void invalidate() {
        switch (this.a) {
            case 0:
                ((ri) this.b).invalidate();
                break;
            case 1:
                ((ImageView) ((ja5) this.b).a).invalidate();
                break;
            case 2:
                ((yk9) this.b).invalidate();
                break;
            case 3:
                ((rm9) this.b).invalidate();
                break;
            case 4:
                ((n8b) this.b).getIconView().invalidate();
                break;
            case 5:
                ((ImageView) ((n9d) this.b).a).invalidate();
                break;
            default:
                ((d1i) this.b).invalidate();
                break;
        }
    }
}
