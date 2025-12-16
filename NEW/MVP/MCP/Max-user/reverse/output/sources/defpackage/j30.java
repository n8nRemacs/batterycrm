package defpackage;

import android.media.AudioManager;
import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;

/* loaded from: classes.dex */
public final /* synthetic */ class j30 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j30(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        k20 k20Var;
        switch (this.a) {
            case 0:
                o30 o30Var = (o30) this.b;
                o30Var.getClass();
                if (i != -3 && i != -2) {
                    if (i == -1) {
                        o30Var.b(-1);
                        o30Var.a();
                        o30Var.c(1);
                        break;
                    } else if (i == 1) {
                        o30Var.c(2);
                        o30Var.b(1);
                        break;
                    } else {
                        wy1.p(i, "Unknown focus change type: ", "AudioFocusManager");
                        break;
                    }
                } else if (i != -2 && ((k20Var = o30Var.d) == null || k20Var.a != 1)) {
                    o30Var.c(4);
                    break;
                } else {
                    o30Var.b(0);
                    o30Var.c(3);
                    break;
                }
                break;
            default:
                AudioFocusRequestHelper.requestFocus$lambda$0((AudioFocusRequestHelper) this.b, i);
                break;
        }
    }
}
